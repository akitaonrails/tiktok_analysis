package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.live.AILivePreviewHighlight;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS221S0000000_31;
import webcast.api.room.StrategyData;

/* JADX INFO: renamed from: X.14zo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20448214zo {
    public static int LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(56));
    public static final Set<AILivePreviewHighlight> LIZJ = new LinkedHashSet();

    public static int LIZLLL() {
        String str;
        int i = -1;
        try {
            C469620IbI.LIZ.getClass();
            StrategyData strategyDataLIZIZ = C469620IbI.LIZIZ(13, null, true, true, false);
            if (strategyDataLIZIZ == null || (str = strategyDataLIZIZ.strategyId) == null) {
                return -1;
            }
            i = CastIntegerProtector.parseInt(str);
            return i;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJII(e);
            return i;
        }
    }

    public static String LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("highlight_notice_");
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        if (strValueOf == null) {
            strValueOf = "";
        }
        sbLIZ.append(strValueOf);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZ(com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r11) {
        /*
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            X.0C64 r5 = X.C0C64.LJIILLIIL()
            java.lang.String r2 = "live_preview_highlight_enable"
            r1 = 31744(0x7c00, float:4.4483E-41)
            r0 = 1
            r4 = 0
            boolean r0 = r5.LJIIIZ(r1, r2, r0, r4)
            if (r0 != 0) goto Lb8
            java.lang.String r0 = "ab_miss"
            r3.add(r0)
            r10 = 0
        L1b:
            if (r11 == 0) goto Lb4
            long r5 = r11.allowPreviewTime
        L1f:
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2b
            java.lang.String r0 = "live_subscription"
            r3.add(r0)
            r10 = 0
        L2b:
            r7 = 0
            if (r11 == 0) goto L40
            com.ss.android.ugc.aweme.feed.model.live.AILivePreviewHighlight r0 = r11.aiLivePreviewHighlight
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.feed.model.live.AILivePreviewHighlightVideoInfo r0 = r0.videoInfo
            if (r0 == 0) goto L40
            java.lang.String r0 = r0.url
            if (r0 == 0) goto L40
            int r0 = r0.length()
            if (r0 != 0) goto L46
        L40:
            java.lang.String r0 = "highlight_error"
            r3.add(r0)
            r10 = 0
        L46:
            long r8 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r5 = (long) r0
            long r8 = r8 / r5
            if (r11 == 0) goto L56
            com.ss.android.ugc.aweme.feed.model.live.AILivePreviewHighlight r0 = r11.aiLivePreviewHighlight
            if (r0 == 0) goto L56
            long r1 = r0.expireTimestamp
        L56:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L60
            java.lang.String r0 = "expired"
            r3.add(r0)
            r10 = 0
        L60:
            if (r11 == 0) goto Lb2
            com.ss.android.ugc.aweme.feed.model.live.AILivePreviewHighlight r1 = r11.aiLivePreviewHighlight
        L64:
            java.util.Set<com.ss.android.ugc.aweme.feed.model.live.AILivePreviewHighlight> r0 = X.C20448214zo.LIZJ
            boolean r0 = X.C13LP.LJJJJ(r1, r0)
            if (r0 == 0) goto L72
            java.lang.String r0 = "freq_limit"
            r3.add(r0)
            r10 = 0
        L72:
            if (r11 == 0) goto L76
            com.ss.android.ugc.aweme.feed.model.live.MaskLayer r7 = r11.maskLayer
        L76:
            boolean r0 = X.C0JF0.LIZ(r7, r4)
            if (r0 == 0) goto L82
            java.lang.String r0 = "warning"
            r3.add(r0)
            r10 = 0
        L82:
            X.01GW r0 = X.C285910BIn.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            if (r2 < 0) goto Lb0
            int r0 = LIZLLL()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= r2) goto Lb0
            r1.intValue()
            java.lang.String r0 = "user_miss"
            r3.add(r0)
        La6:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r3)
            return r0
        Lb0:
            r4 = r10
            goto La6
        Lb2:
            r1 = r7
            goto L64
        Lb4:
            r5 = -1
            goto L1f
        Lb8:
            r10 = 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20448214zo.LIZ(com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct):kotlin.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZIZ(X.C1ACA r15) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20448214zo.LIZIZ(X.1ACA):java.util.Map");
    }

    public static void LJ(boolean z) {
        if (z) {
            LIZ = 2;
            ((Keva) LIZIZ.getValue()).storeInt(LIZJ(), 100);
            return;
        }
        String strLIZJ = LIZJ();
        C01GW c01gw = LIZIZ;
        int i = ((Keva) c01gw.getValue()).getInt(strLIZJ, 0) + 1;
        if (i >= 3) {
            LIZ = 2;
        }
        ((Keva) c01gw.getValue()).storeInt(strLIZJ, i);
    }
}
