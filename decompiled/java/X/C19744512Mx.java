package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.TTSocialFriendsEffect;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.social.creation.api.edit.exp.SocialEffectNotificationExp;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.12Mx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19744512Mx {
    public static final C2232408os LIZ = new C2232408os(C786410Ut5.h4());

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        boolean z2;
        int size;
        ArrayList<TimeSpeedModelExtension> finalVideoList;
        List<String> graphNodes;
        List<String> v1Tags;
        List<String> v2Tags;
        List<String> platformTags;
        EffectLabel effectLabel;
        EffectLabel effectLabel2;
        EffectLabel effectLabel3;
        if (!C2340509Fb.LIZ()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<TimeSpeedModelExtension> finalVideoList2 = videoPublishEditModel.getFinalVideoList();
        if (finalVideoList2 != null) {
            for (TimeSpeedModelExtension timeSpeedModelExtension : finalVideoList2) {
                StickerInfo stickerInfo = timeSpeedModelExtension.getStickerInfo();
                if (stickerInfo == null || (effectLabel3 = stickerInfo.getEffectLabel()) == null || (v1Tags = effectLabel3.getV1Tags()) == null) {
                    v1Tags = C13BV.INSTANCE;
                }
                arrayList.addAll(v1Tags);
                StickerInfo stickerInfo2 = timeSpeedModelExtension.getStickerInfo();
                if (stickerInfo2 == null || (effectLabel2 = stickerInfo2.getEffectLabel()) == null || (v2Tags = effectLabel2.getV2Tags()) == null) {
                    v2Tags = C13BV.INSTANCE;
                }
                arrayList.addAll(v2Tags);
                StickerInfo stickerInfo3 = timeSpeedModelExtension.getStickerInfo();
                if (stickerInfo3 == null || (effectLabel = stickerInfo3.getEffectLabel()) == null || (platformTags = effectLabel.getPlatformTags()) == null) {
                    platformTags = C13BV.INSTANCE;
                }
                arrayList.addAll(platformTags);
            }
        }
        if (arrayList.contains("3150") && (arrayList.contains("18") || arrayList.contains("19"))) {
            z = true;
        } else {
            z = false;
        }
        if (!arrayList.contains("5256") && !arrayList.contains("5707") && !arrayList.contains("3583") && !arrayList.contains("4841") && !arrayList.contains("4989")) {
            z2 = false;
        } else {
            z2 = true;
        }
        StickerInfo stickerInfo4 = videoPublishEditModel.stickerInfo;
        if (stickerInfo4 != null && (graphNodes = stickerInfo4.getGraphNodes()) != null) {
            size = graphNodes.size();
        } else {
            size = 0;
        }
        if (size <= SocialEffectNotificationExp.LJFF || !z || z2 || (finalVideoList = videoPublishEditModel.getFinalVideoList()) == null || finalVideoList.isEmpty()) {
            return false;
        }
        Iterator<TimeSpeedModelExtension> it2 = finalVideoList.iterator();
        while (it2.hasNext()) {
            List<TTSocialFriendsEffect> listLJ = LJ(it2.next().effectMessage);
            if (listLJ != null && !listLJ.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LIZIZ(String str) {
        if (str == null || str.length() == 0 || !u.LJJIIJZLJL(str, "{", false) || !u.LJIIZILJ(str, "}", false)) {
            return false;
        }
        try {
            new JSONObject(str);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static final List<TTSocialFriendsEffect> LIZJ(List<TTSocialFriendsEffect> list) {
        Object obj;
        Object next;
        TTSocialFriendsEffect tTSocialFriendsEffectCopy;
        long jLongValue;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (ArrayList) list) {
            if (((TTSocialFriendsEffect) obj2).id != null) {
                arrayList.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList) {
            String str = ((TTSocialFriendsEffect) obj3).id;
            Object arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add(obj3);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            entry.getKey();
            List list2 = (List) entry.getValue();
            Iterator it2 = list2.iterator();
            while (true) {
                obj = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((TTSocialFriendsEffect) next).visible, Boolean.TRUE)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TTSocialFriendsEffect tTSocialFriendsEffect = (TTSocialFriendsEffect) next;
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (Intrinsics.LJFF(((TTSocialFriendsEffect) next2).visible, Boolean.FALSE)) {
                    obj = next2;
                    break;
                }
            }
            TTSocialFriendsEffect tTSocialFriendsEffect2 = (TTSocialFriendsEffect) obj;
            long jLongValue2 = 0;
            if (tTSocialFriendsEffect != null && tTSocialFriendsEffect2 != null) {
                Long l = tTSocialFriendsEffect.timestamp;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                Long lValueOf = Long.valueOf(jLongValue);
                Long l2 = tTSocialFriendsEffect2.timestamp;
                if (l2 != null) {
                    jLongValue2 = l2.longValue();
                }
                tTSocialFriendsEffectCopy = tTSocialFriendsEffect.copy(tTSocialFriendsEffect.visible, tTSocialFriendsEffect.timestamp, tTSocialFriendsEffect.id, tTSocialFriendsEffect.uid, lValueOf, Long.valueOf(jLongValue2), tTSocialFriendsEffect.duration);
            } else {
                TTSocialFriendsEffect tTSocialFriendsEffect3 = (TTSocialFriendsEffect) C13LP.LJJJJZI(list2);
                Long l3 = tTSocialFriendsEffect3.timestamp;
                if (l3 != null) {
                    jLongValue2 = l3.longValue();
                }
                tTSocialFriendsEffectCopy = tTSocialFriendsEffect3.copy(tTSocialFriendsEffect3.visible, tTSocialFriendsEffect3.timestamp, tTSocialFriendsEffect3.id, tTSocialFriendsEffect3.uid, Long.valueOf(jLongValue2), tTSocialFriendsEffect3.endTime, tTSocialFriendsEffect3.duration);
            }
            arrayList3.add(tTSocialFriendsEffectCopy);
        }
        return C19719512Dh.LIZIZ(arrayList3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.13BV] */
    public static final List<TTSocialFriendsEffect> LJ(String str) {
        boolean z;
        Object obj;
        Object arrayList;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj2 = null;
        if (z) {
            return null;
        }
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(new JSONObject(str).optString("effect_state_json")).optJSONArray("tt_social_friends");
            if (jSONArrayOptJSONArray == null) {
                arrayList = C13BV.INSTANCE;
            } else {
                arrayList = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    String string = jSONArrayOptJSONArray.get(i).toString();
                    c1227904rF.getClass();
                    TTSocialFriendsEffect tTSocialFriendsEffect = (TTSocialFriendsEffect) C1227904rF.LIZIZ(string, TTSocialFriendsEffect.class);
                    if (tTSocialFriendsEffect != null) {
                        arrayList.add(tTSocialFriendsEffect);
                    }
                }
            }
            C189200o6.m2constructorimpl(arrayList);
            obj = arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Object c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (List) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[Catch: all -> 0x00bb, TryCatch #0 {all -> 0x00bb, blocks: (B:8:0x0010, B:10:0x0022, B:12:0x0026, B:13:0x002f, B:15:0x0035, B:21:0x004d, B:22:0x0051, B:23:0x005a, B:25:0x0060, B:27:0x006a, B:28:0x006e, B:30:0x0074, B:31:0x0083, B:33:0x0089, B:35:0x00a4, B:36:0x00a9, B:34:0x009e), top: B:44:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZLLL(com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r11, com.ss.android.ugc.aweme.creative.model.TTSocialSegment r12) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19744512Mx.LIZLLL(com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension, com.ss.android.ugc.aweme.creative.model.TTSocialSegment):java.lang.String");
    }
}
