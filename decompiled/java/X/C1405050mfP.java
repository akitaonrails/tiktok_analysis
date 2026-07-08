package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.ur.creative.CardActionReportData;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0mfP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1405050mfP {
    public static final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"topic_id", "user_id", "session_id", "debuginfo", "search_topic_id", "inspiration_result_id", "inspiration_keyword", "inspiration_reco_id", "post_chain", "primary_scene", "search_extra"});

    public static final CardActionReportData LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        String str2;
        String str3;
        int iIntValue;
        Integer numLJIIJJI;
        Map<String, Map<String, String>> mobParams;
        Map<String, String> map;
        ShootExtraData shootExtraData = videoPublishEditModel.getCreativeFlowData().getShootExtraData();
        String str4 = null;
        if (shootExtraData != null && (mobParams = shootExtraData.getMobParams()) != null && (map = mobParams.get("shoot")) != null) {
            str = map.get("search_topic_id");
            str2 = map.get("primary_scene");
            str3 = map.get("topic_type");
            str4 = map.get("activity_name");
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        if (str3 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str3)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = -1;
        }
        return new CardActionReportData(str, str2, Integer.valueOf(iIntValue), str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9) {
        /*
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r9.creativeModel
            com.ss.android.ugc.aweme.creative.model.RecordEffectModel r0 = r0.recordEffectModel
            com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect r1 = r0.effectInfo
            r0 = 0
            if (r1 == 0) goto L13
            java.lang.String r8 = r1.getExtra()
        Ld:
            java.lang.String r3 = "fifa_2026"
            r5 = 1
            if (r8 == 0) goto L33
            goto L15
        L13:
            r8 = r0
            goto Ld
        L15:
            int r1 = r8.length()     // Catch: org.json.JSONException -> L2f
            if (r1 <= 0) goto L33
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2f
            r2.<init>(r8)     // Catch: org.json.JSONException -> L2f
            java.lang.String r1 = "compaign_info"
            java.lang.String r1 = r2.optString(r1)     // Catch: org.json.JSONException -> L2f
            if (r1 == 0) goto L33
            boolean r1 = r1.equals(r3)     // Catch: org.json.JSONException -> L2f
            if (r1 != r5) goto L33
            goto L35
        L2f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
        L33:
            r4 = 0
            goto L36
        L35:
            r4 = 1
        L36:
            com.ss.android.ugc.aweme.creative.model.CreativeFlowData r1 = r9.getCreativeFlowData()
            com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData r1 = r1.getShootExtraData()
            if (r1 == 0) goto Lb1
            java.util.Map r2 = r1.getMobParams()
            if (r2 == 0) goto Lb1
            java.lang.String r1 = "shoot"
            java.lang.Object r7 = r2.get(r1)
            java.util.Map r7 = (java.util.Map) r7
        L4e:
            java.lang.String r6 = "activity_name"
            if (r7 == 0) goto Laf
            java.lang.Object r1 = r7.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Laf
            boolean r1 = r1.equals(r3)
            if (r1 != r5) goto Laf
            r3 = 1
        L61:
            X.0W8I r1 = X.C0W8I.LIZ
            r1.getClass()
            boolean r1 = X.C0W8I.LIZJ()
            if (r1 != 0) goto L74
            X.C365090ETb.LIZIZ()
        L6f:
            if (r4 == 0) goto Lb3
            if (r3 == 0) goto Lb3
            return r5
        L74:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r1 = "ifFifaEffect: "
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = "; effect_extra: "
            r2.append(r1)
            r2.append(r8)
            java.lang.String r1 = ";isFromProfileFifa: "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = "; activity_name: "
            r2.append(r1)
            if (r7 == 0) goto L9d
            java.lang.Object r0 = r7.get(r6)
            java.lang.String r0 = (java.lang.String) r0
        L9d:
            r2.append(r0)
            r0 = 59
            r2.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r0 = "asset_companion"
            X.C201955140j.LIZIZ(r0, r1)
            goto L6f
        Laf:
            r3 = 0
            goto L61
        Lb1:
            r7 = r0
            goto L4e
        Lb3:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1405050mfP.LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public static final void LIZ(C0LAB c0lab, ShootExtraData shootExtraData) {
        Map<String, Map<String, String>> mobParams;
        if (shootExtraData != null && (mobParams = shootExtraData.getMobParams()) != null) {
            Map<String, String> map = mobParams.get("shoot");
            if (map == null && (map = mobParams.get("shoot")) == null) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (LIZ.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (((String) entry2.getValue()).length() > 0) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            if (!linkedHashMap2.isEmpty()) {
                c0lab.LJI(linkedHashMap2);
            }
        }
    }
}
