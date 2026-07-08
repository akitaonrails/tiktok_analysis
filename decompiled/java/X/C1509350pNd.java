package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig;
import com.ss.android.ugc.aweme.feed.model.CommentPreloadInfo;
import com.ss.android.ugc.aweme.feed.model.Preload;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509350pNd extends FeatureProducer {
    public static final C1509350pNd LIZIZ = new C1509350pNd();
    public static String LIZJ = "f_recommend_score";
    public static final ConcurrentHashMap<String, n> LIZLLL = new ConcurrentHashMap<>(3);
    public static final LinkedBlockingQueue<String> LJ = new LinkedBlockingQueue<>(3);

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZJ;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZJ = str;
    }

    public static void LIZIZ(Aweme aweme, n nVar) {
        HashSet<String> hashSet;
        CommentSuggestWordList commentSuggestWordList;
        List<SuggestWordStruct> suggestWords;
        String scene;
        WordStruct wordStruct;
        String penetrateInfo;
        try {
            String str = C2504409re.LIZ;
            if (str != null && C2504409re.LIZIZ == null) {
                C2504409re.LIZIZ = new HashSet<>();
                C2504409re.LIZIZ.addAll((ArrayList) C7740030o.LIZ().getGson().LJII(str, ArrayList.class));
            }
            hashSet = C2504409re.LIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "SearchScoreList");
            hashSet = C2504409re.LIZIZ;
        }
        if (hashSet != null && (commentSuggestWordList = aweme.getCommentSuggestWordList()) != null && (suggestWords = commentSuggestWordList.getSuggestWords()) != null) {
            for (SuggestWordStruct suggestWordStruct : suggestWords) {
                if (suggestWordStruct != null) {
                    scene = suggestWordStruct.getScene();
                } else {
                    scene = null;
                }
                if (Intrinsics.LJFF("comment_top", scene)) {
                    List<WordStruct> words = suggestWordStruct.getWords();
                    if (words != null && (wordStruct = (WordStruct) C13LP.LJJJLL(words)) != null && (penetrateInfo = wordStruct.getPenetrateInfo()) != null) {
                        n nVarLJIILIIL = GsonProtectorUtils.parse(new p(), penetrateInfo).LJIILIIL();
                        for (String str2 : hashSet) {
                            k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ(str2);
                            if (kVarLJJIIZ != null) {
                                nVar.LJJIFFI(str2, kVarLJJIIZ);
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static void LIZ(n nVar, n nVar2, Set set) {
        if (nVar == null) {
            return;
        }
        Iterator<T> it2 = nVar.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (set == null || set.isEmpty() || set.contains(entry.getKey())) {
                nVar2.LJJIFFI((String) entry.getKey(), (k) entry.getValue());
            }
        }
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final Object getFeatureInternal(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        Object objOpt;
        Aweme awemeLIZ;
        String str3;
        n nVarLJIILIIL;
        String str4;
        n nVarLJIILIIL2;
        k kVarLJJIIZ;
        String strPoll;
        Object feature;
        n nVar;
        String meta;
        k kVar;
        CommentPreloadInfo commentPreloadInfo;
        k kVar2;
        Object objOpt2;
        String str5;
        if (returnCode != null) {
            try {
                returnCode.code = 200;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJFF(th, "client_ai_crash");
                if (returnCode != null) {
                    returnCode.code = 3;
                }
                return null;
            }
        }
        if (jSONObject == null) {
            objOpt = null;
        } else {
            objOpt = jSONObject.opt("aweme");
        }
        if (objOpt instanceof Aweme) {
            awemeLIZ = (Aweme) objOpt;
        } else {
            awemeLIZ = null;
        }
        if (awemeLIZ == null) {
            if (jSONObject == null) {
                objOpt2 = null;
            } else {
                objOpt2 = jSONObject.opt("aid");
            }
            if (objOpt2 instanceof String) {
                str5 = (String) objOpt2;
            } else {
                str5 = null;
            }
            awemeLIZ = C0N9Z.LIZ(str5);
            if (awemeLIZ == null) {
                if (returnCode != null) {
                    returnCode.code = 1;
                }
                return null;
            }
        }
        ConcurrentHashMap<String, n> concurrentHashMap = LIZLLL;
        if (concurrentHashMap.containsKey(awemeLIZ.getAid())) {
            n nVar2 = concurrentHashMap.get(awemeLIZ.getAid());
            if (nVar2 != null) {
                kVarLJJIIZ = nVar2.LJJIIZ(str);
            } else {
                kVarLJJIIZ = null;
            }
            if (!(kVarLJJIIZ instanceof m)) {
                if (!Intrinsics.LJFF(str, "play_time_prob_dist")) {
                    if (kVarLJJIIZ != null) {
                        return Float.valueOf(kVarLJJIIZ.LJIIJ());
                    }
                }
                return kVarLJJIIZ;
            }
            return null;
        }
        n nVar3 = new n();
        Preload preload = awemeLIZ.getPreload();
        if (preload != null) {
            str3 = preload.predictConfig;
        } else {
            str3 = null;
        }
        if (str3 == null || (kVar2 = GsonProtectorUtils.parse(new p(), str3)) == null) {
            nVarLJIILIIL = null;
        } else {
            nVarLJIILIIL = kVar2.LJIILIIL();
        }
        LIZ(nVarLJIILIIL, nVar3, null);
        AwemeCommentConfig commentConfig = awemeLIZ.getCommentConfig();
        if (commentConfig != null && (commentPreloadInfo = commentConfig.preload) != null) {
            str4 = commentPreloadInfo.predictConfig;
        } else {
            str4 = null;
        }
        if (str4 == null || (kVar = GsonProtectorUtils.parse(new p(), str4)) == null) {
            nVarLJIILIIL2 = null;
        } else {
            nVarLJIILIIL2 = kVar.LJIILIIL();
        }
        LIZ(nVarLJIILIIL2, nVar3, null);
        HashSet<String> hashSetLIZ = C2046107zv.LIZ();
        if (hashSetLIZ != null && (true ^ hashSetLIZ.isEmpty())) {
            AbstractC1509490pNr abstractC1509490pNrLIZ = C1509480pNq.LIZ(awemeLIZ.getAid());
            if (abstractC1509490pNrLIZ != null) {
                feature = abstractC1509490pNrLIZ.getFeature("video_meta_json");
            } else {
                feature = null;
            }
            if (feature instanceof n) {
                nVar = (n) feature;
            } else {
                nVar = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("metaPredictJson: ");
            Video video = awemeLIZ.getVideo();
            if (video != null) {
                meta = video.getMeta();
            } else {
                meta = null;
            }
            sbLIZ.append(meta);
            C2188811AlT.LIZIZ(sbLIZ);
            LIZ(nVar, nVar3, hashSetLIZ);
        }
        LIZIZ(awemeLIZ, nVar3);
        LinkedBlockingQueue<String> linkedBlockingQueue = LJ;
        synchronized (linkedBlockingQueue) {
            try {
                if (linkedBlockingQueue.size() == 3 && (strPoll = linkedBlockingQueue.poll()) != null) {
                    concurrentHashMap.remove(strPoll);
                }
                concurrentHashMap.put(awemeLIZ.getAid(), nVar3);
                linkedBlockingQueue.add(awemeLIZ.getAid());
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        kVarLJJIIZ = nVar3.LJJIIZ(str);
        if (!(kVarLJJIIZ instanceof m)) {
            if (!Intrinsics.LJFF(str, "play_time_prob_dist")) {
                if (kVarLJJIIZ != null) {
                    return Float.valueOf(kVarLJJIIZ.LJIIJ());
                }
            }
            return kVarLJJIIZ;
        }
        return null;
    }
}
