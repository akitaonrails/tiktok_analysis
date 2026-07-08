package X;

import com.bytedance.android.livesdk.CollaborateGiftingStateChannel;
import com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0fYG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131540fYG {
    public static final long LIZ(DataChannel dataChannel) {
        C1132220fZM c1132220fZM;
        CollabGiftBaseInfo collabGiftBaseInfo;
        AbstractC1132210fZL abstractC1132210fZL = null;
        if (dataChannel != null) {
            abstractC1132210fZL = (AbstractC1132210fZL) dataChannel.gg0(CollaborateGiftingStateChannel.class);
        }
        if ((abstractC1132210fZL instanceof C1132220fZM) && (c1132220fZM = (C1132220fZM) abstractC1132210fZL) != null && (collabGiftBaseInfo = c1132220fZM.LIZLLL) != null) {
            return collabGiftBaseInfo.fuelGiftId;
        }
        return -1L;
    }

    public static final String LIZIZ(DataChannel dataChannel) {
        C1132220fZM c1132220fZM;
        String str;
        AbstractC1132210fZL abstractC1132210fZL = (AbstractC1132210fZL) dataChannel.gg0(CollaborateGiftingStateChannel.class);
        if (!(abstractC1132210fZL instanceof C1132220fZM) || (c1132220fZM = (C1132220fZM) abstractC1132210fZL) == null || (str = c1132220fZM.LIZ) == null) {
            return "";
        }
        return str;
    }

    public static final Long LIZJ(DataChannel dataChannel) {
        C1132220fZM c1132220fZM;
        CollabGiftBaseInfo collabGiftBaseInfo;
        AbstractC1132210fZL abstractC1132210fZL = (AbstractC1132210fZL) dataChannel.gg0(CollaborateGiftingStateChannel.class);
        if (!(abstractC1132210fZL instanceof C1132220fZM) || (c1132220fZM = (C1132220fZM) abstractC1132210fZL) == null || (collabGiftBaseInfo = c1132220fZM.LIZLLL) == null) {
            return null;
        }
        return Long.valueOf(collabGiftBaseInfo.triggerGiftId);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final org.json.JSONObject LIZLLL(X.AbstractC1132210fZL r6) throws org.json.JSONException {
        /*
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            boolean r4 = r6 instanceof X.C1132220fZM
            if (r4 == 0) goto L6c
            r0 = r6
            X.0fZM r0 = (X.C1132220fZM) r0
            com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo r2 = r0.LIZLLL
        Le:
            if (r2 == 0) goto L22
            org.json.JSONObject r1 = new org.json.JSONObject
            com.google.gson.Gson r0 = X.C293501Bt.LIZ()
            java.lang.String r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r2)
            r1.<init>(r0)
            java.lang.String r0 = "base_info"
            r3.put(r0, r1)
        L22:
            if (r4 == 0) goto L76
            r0 = r6
            X.0fZM r0 = (X.C1132220fZM) r0
            com.bytedance.android.livesdk.model.message.CollabGiftActiveInfo r2 = r0.LJ
        L29:
            if (r2 == 0) goto L3d
            org.json.JSONObject r1 = new org.json.JSONObject
            com.google.gson.Gson r0 = X.C293501Bt.LIZ()
            java.lang.String r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r2)
            r1.<init>(r0)
            java.lang.String r0 = "active_info"
            r3.put(r0, r1)
        L3d:
            if (r4 == 0) goto L80
            r0 = r6
            X.0fZM r0 = (X.C1132220fZM) r0
            com.bytedance.android.livesdk.model.message.CollabGiftFullInfo r2 = r0.LJI
        L44:
            if (r2 == 0) goto L58
            org.json.JSONObject r1 = new org.json.JSONObject
            com.google.gson.Gson r0 = X.C293501Bt.LIZ()
            java.lang.String r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r2)
            r1.<init>(r0)
            java.lang.String r0 = "full_info"
            r3.put(r0, r1)
        L58:
            long r4 = X.C963140bAe.LIZLLL
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r4 = r4 / r0
            long r1 = -r4
            java.lang.String r0 = "time_diff_sec"
            r3.put(r0, r1)
            boolean r1 = r6 instanceof X.C1132230fZN
            java.lang.String r0 = "is_finish"
            r3.put(r0, r1)
            return r3
        L6c:
            boolean r0 = r6 instanceof X.C1132230fZN
            if (r0 == 0) goto L76
            r0 = r6
            X.0fZN r0 = (X.C1132230fZN) r0
            com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo r2 = r0.LIZJ
            goto Le
        L76:
            boolean r0 = r6 instanceof X.C1132230fZN
            if (r0 == 0) goto L80
            r0 = r6
            X.0fZN r0 = (X.C1132230fZN) r0
            com.bytedance.android.livesdk.model.message.CollabGiftActiveInfo r2 = r0.LIZLLL
            goto L29
        L80:
            boolean r0 = r6 instanceof X.C1132230fZN
            if (r0 == 0) goto L58
            r0 = r6
            X.0fZN r0 = (X.C1132230fZN) r0
            com.bytedance.android.livesdk.model.message.CollabGiftFullInfo r2 = r0.LJ
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1131540fYG.LIZLLL(X.0fZL):org.json.JSONObject");
    }
}
