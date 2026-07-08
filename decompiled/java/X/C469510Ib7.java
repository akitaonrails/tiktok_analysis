package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0Ib7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469510Ib7 {
    public static final HashMap<EnumC469490Ib5, InterfaceC471040Ida> LIZ = new HashMap<>();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x001f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZ() {
        /*
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "["
            r3.<init>(r0)
            com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerNewArchSetting r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerNewArchSetting.INSTANCE
            java.lang.String[] r6 = r0.getValue()
            int r5 = r6.length
            r4 = 0
        L14:
            if (r4 >= r5) goto L87
            r1 = r6[r4]
            int r0 = r1.hashCode()
            switch(r0) {
                case -1345785173: goto L35;
                case -383493348: goto L40;
                case -129467948: goto L4b;
                case 235494975: goto L56;
                case 956506327: goto L61;
                case 959356746: goto L6c;
                case 1544803905: goto L77;
                default: goto L1f;
            }
        L1f:
            java.lang.StringBuilder r7 = X.C2188811AlT.LIZ()
            r7.append(r1)
            java.lang.String r0 = ", "
            r7.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r7)
            r3.append(r0)
            int r4 = r4 + 1
            goto L14
        L35:
            java.lang.String r0 = "game_category"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1f
            X.0Ib5 r0 = X.EnumC469490Ib5.GAME_CATEGORY
            goto L81
        L40:
            java.lang.String r0 = "game_esport"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1f
            X.0Ib5 r0 = X.EnumC469490Ib5.GAME_ESPORT
            goto L81
        L4b:
            java.lang.String r0 = "game_normal"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1f
            X.0Ib5 r0 = X.EnumC469490Ib5.NORMAL_GAME
            goto L81
        L56:
            java.lang.String r0 = "game_category_bottom"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1f
            X.0Ib5 r0 = X.EnumC469490Ib5.GAME_CATEGORY_BOTTOM
            goto L81
        L61:
            java.lang.String r0 = "game_drops"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1f
            X.0Ib5 r0 = X.EnumC469490Ib5.GAME_DROPS
            goto L81
        L6c:
            java.lang.String r0 = "game_guess"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1f
            X.0Ib5 r0 = X.EnumC469490Ib5.GAME_GUESS
            goto L81
        L77:
            java.lang.String r0 = "default"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1f
            X.0Ib5 r0 = X.EnumC469490Ib5.DEFAULT
        L81:
            if (r0 == 0) goto L1f
            r2.add(r0)
            goto L1f
        L87:
            java.lang.String r0 = "]"
            r3.append(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getNewArchTypeFromSetting: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "DrawerFeedLiveFactoryMgr"
            X.C20441214yg.LJIIIZ(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C469510Ib7.LIZ():java.util.List");
    }
}
