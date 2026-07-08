package X;

import java.util.List;

/* JADX INFO: renamed from: X.01k7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C419301k7 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[PHI: r5 r6
      0x0035: PHI (r5v0 java.lang.String) = (r5v2 java.lang.String), (r5v3 java.lang.String) binds: [B:15:0x0033, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r6v1 java.lang.Object) = (r6v3 java.lang.Object), (r6v4 java.lang.Object) binds: [B:15:0x0033, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ() {
        /*
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            if (r0 == 0) goto L76
            X.1DgM r0 = r0.getCurrentUser()
            if (r0 == 0) goto L76
            long r7 = r0.getId()
        L14:
            com.bytedance.android.live.liveinteract.api.IInteractService r0 = X.C781270Ukn.LJIILJJIL()
            X.0UGd r0 = r0.M70()
            if (r0 == 0) goto L74
            X.0amO r1 = r0.u7()
        L22:
            java.lang.String r4 = ""
            if (r1 == 0) goto L72
            int r0 = r1.LIZIZ()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r5 = r1.LIZLLL
            if (r5 != 0) goto L35
        L32:
            r5 = r4
            if (r1 == 0) goto L3a
        L35:
            java.lang.String r0 = r1.LJ
            if (r0 == 0) goto L3a
            r4 = r0
        L3a:
            r0 = 4
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            java.lang.String r2 = java.lang.String.valueOf(r7)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "anchor_id"
            r1.<init>(r0, r2)
            r0 = 0
            r3[r0] = r1
            java.lang.String r2 = r6.toString()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "panel_layout_type"
            r1.<init>(r0, r2)
            r0 = 1
            r3[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "layout_id"
            r1.<init>(r0, r5)
            r0 = 2
            r3[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "layout_key"
            r1.<init>(r0, r4)
            r0 = 3
            r3[r0] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r3)
            return r0
        L72:
            r6 = r4
            goto L32
        L74:
            r1 = 0
            goto L22
        L76:
            r7 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C419301k7.LIZ():java.util.Map");
    }

    public static void LIZIZ(String str, List list) {
        String strLJJLIIIJ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_auto_invite_setting_page");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJIIZI(LIZ());
        if (list != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = null;
        }
        c474500IjALIZ.LJJII(strLJJLIIIJ, "invite_guest_list");
        c474500IjALIZ.LIZ();
    }
}
