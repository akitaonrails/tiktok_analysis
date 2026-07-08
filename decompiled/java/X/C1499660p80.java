package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0p80, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499660p80 extends FeatureProducer {
    public static final C1499660p80 LIZIZ = new C1499660p80();
    public static String LIZJ = "f_audio";
    public static final ConcurrentHashMap<String, n> LIZLLL = new ConcurrentHashMap<>(3);
    public static final LinkedBlockingQueue<String> LJ = new LinkedBlockingQueue<>(3);
    public static final Set<String> LJFF = C13LQ.LJLIIL(new String[]{"peak", "LoudnessRangeStart", "LoudnessRange", "LoudnessRangeEnd", "loudness", "MaximumMomentaryLoudness", "MaximumShortTermLoudness", "SpeechRatio"});

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZJ;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZJ = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final Object getFeatureInternal(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        Object objOpt;
        Aweme awemeLIZ;
        String meta;
        String strPoll;
        String strLJIL;
        n nVarLJJIJ;
        k kVarLJJIIZ;
        k kVarLJJIIZ2;
        Object objOpt2;
        String str3;
        if (returnCode != null) {
            try {
                returnCode.code = 200;
            } catch (Throwable th) {
                if (returnCode != null) {
                    returnCode.code = 3;
                }
                C1337780kuu.LIZ(th, null, 6);
            }
        }
        int i = 1;
        switch (str.hashCode()) {
            case -1439044444:
                if (str.equals("audio_source")) {
                    return Integer.valueOf(C2179771ASp.LJ());
                }
                break;
            case -839335487:
                if (str.equals("audio_ability")) {
                    return Integer.valueOf(C1485020okO.LJ());
                }
                break;
            case -589930443:
                if (str.equals("is_using_ear_phone")) {
                    C844470XAv.LIZ.getClass();
                    return Integer.valueOf(C2179771ASp.LJIIJ(C844470XAv.LIZ()) ? 1 : 0);
                }
                break;
            case 2082056206:
                if (str.equals("is_mute")) {
                    C844470XAv.LIZ.getClass();
                    if (C2179771ASp.LJII(C844470XAv.LIZ()) != 0) {
                        i = 0;
                    }
                    return Integer.valueOf(i);
                }
                break;
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
                str3 = (String) objOpt2;
            } else {
                str3 = null;
            }
            awemeLIZ = C0N9Z.LIZ(str3);
            if (awemeLIZ == null) {
                if (returnCode != null) {
                    returnCode.code = 1;
                }
                return null;
            }
        }
        ConcurrentHashMap<String, n> concurrentHashMap = LIZLLL;
        if (concurrentHashMap.containsKey(awemeLIZ.getAid())) {
            n nVar = concurrentHashMap.get(awemeLIZ.getAid());
            if (nVar != null && (kVarLJJIIZ2 = nVar.LJJIIZ(str)) != null) {
                return Float.valueOf(kVarLJJIIZ2.LJIIJ());
            }
        } else {
            n nVar2 = new n();
            Video video = awemeLIZ.getVideo();
            if (video == null || (meta = video.getMeta()) == null) {
                return null;
            }
            new p();
            n nVarLJIILIIL = p.LIZJ(meta).LJIILIIL();
            Iterator<T> it2 = nVarLJIILIIL.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (LJFF.contains(entry.getKey())) {
                    nVar2.LJJIFFI((String) entry.getKey(), (k) entry.getValue());
                }
            }
            k kVarLJJIIZ3 = nVarLJIILIIL.LJJIIZ("VolumeInfoJson");
            if (kVarLJJIIZ3 != null && (strLJIL = kVarLJJIIZ3.LJIL()) != null) {
                new p();
                n nVarLJJIJ2 = p.LIZJ(strLJIL).LJIILIIL().LJJIJ("Metrics");
                if (nVarLJJIJ2 != null && (nVarLJJIJ = nVarLJJIJ2.LJJIJ("AEDInfo")) != null && (kVarLJJIIZ = nVarLJJIJ.LJJIIZ("SpeechRatio")) != null) {
                    nVar2.LJJIII(Float.valueOf(kVarLJJIIZ.LJIIJ()), "SpeechRatio");
                }
            }
            LinkedBlockingQueue<String> linkedBlockingQueue = LJ;
            synchronized (linkedBlockingQueue) {
                try {
                    if (linkedBlockingQueue.size() == 3 && (strPoll = linkedBlockingQueue.poll()) != null) {
                        LIZLLL.remove(strPoll);
                    }
                    LIZLLL.put(awemeLIZ.getAid(), nVar2);
                    linkedBlockingQueue.add(awemeLIZ.getAid());
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            k kVarLJJIIZ4 = nVar2.LJJIIZ(str);
            if (kVarLJJIIZ4 != null) {
                return Float.valueOf(kVarLJJIIZ4.LJIIJ());
            }
            if (returnCode != null) {
                returnCode.code = 1;
                return null;
            }
        }
        return null;
    }
}
