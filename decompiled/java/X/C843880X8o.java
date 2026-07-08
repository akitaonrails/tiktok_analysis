package X;

import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipEnterFromConfig;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0X8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C843880X8o {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C843900X8q());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C843910X8r());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C843950X8v());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C843890X8p());
    public static final C01GW LJ = C452501pT.LIZIZ(new C0TS6());

    public static int LIZIZ(String str) {
        if (str.length() == 0) {
            return 0;
        }
        Integer numValueOf = GameLivePartnershipEnterFromConfig.INSTANCE.getConfig().get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT);
        }
        return numValueOf.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(long r4, long r6, long r8, java.util.concurrent.TimeUnit r10) {
        /*
            int[] r1 = X.C517230KQf.LIZ
            int r0 = r10.ordinal()
            r1 = r1[r0]
            r2 = 1
            r3 = 60
            if (r1 == r2) goto L22
            r0 = 2
            if (r1 == r0) goto L26
            r0 = 3
            if (r1 == r0) goto L29
            r0 = 4
            if (r1 == r0) goto L2b
            r0 = 5
            if (r1 == r0) goto L2e
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "supported time unit are only days/hours/minutes/seconds/milliseconds"
            r1.<init>(r0)
            throw r1
        L22:
            r0 = 24
            long r0 = (long) r0
            long r8 = r8 * r0
        L26:
            long r0 = (long) r3
            long r8 = r8 * r0
            goto L2a
        L29:
            long r0 = (long) r3
        L2a:
            long r8 = r8 * r0
        L2b:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r0
        L2e:
            long r4 = r4 + r8
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L34
            return r2
        L34:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C843880X8o.LIZ(long, long, long, java.util.concurrent.TimeUnit):boolean");
    }

    public static void LIZJ(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z) {
        boolean z2;
        String str5;
        String str6;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gp_click_attribution_report");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(String.valueOf(i), Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(str, "game_id");
        c474500IjALIZ.LJJII(str2, "task_id");
        if (z2) {
            str5 = str3;
        } else {
            str5 = null;
        }
        c474500IjALIZ.LJJII(str5, "room_id");
        if (z2) {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "item_id");
        c474500IjALIZ.LJJII(str4, "creator_id");
        c474500IjALIZ.LJJII(String.valueOf(i2), "touch_point");
        c474500IjALIZ.LJJII(String.valueOf(i3), "threshold_duration");
        if (z) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str6, "is_report");
        c474500IjALIZ.LIZ();
    }
}
