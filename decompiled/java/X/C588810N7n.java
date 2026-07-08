package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0N7n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588810N7n implements InterfaceC582790MtR {
    public static long LIZJ;
    public static long LIZLLL;
    public static boolean LJ;
    public static int LJI;
    public static long LJII;
    public static int LJIIIIZZ;
    public static long LJIIIZ;
    public static final C588810N7n LIZ = new C588810N7n();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C588820N7o());
    public static boolean LJFF = true;

    public static final void LIZ(long j, Context context, Aweme aweme) {
        boolean z;
        AwemeRawAd awemeRawAd;
        if (LJFF) {
            return;
        }
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (aweme != null && C1017070cZd.LLIZLLLIL(aweme)) {
                LJI = 1;
                LJII = j;
                return;
            }
            int i = LJI;
            if (1 <= i && i < 10) {
                HashMap map = new HashMap();
                map.put("adsgap", String.valueOf(LJI - 1));
                map.put("gaptime", String.valueOf(j - LJII));
                List<String> list = C1019030ccn.LIZ;
                HashMap map2 = new HashMap();
                map2.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), map));
                C1019030ccn.LJJJJ(context, "feed_firstshow", aweme, C1019030ccn.LJIIJJI(context, aweme, false, map2));
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "feed_firstshow", awemeRawAd);
                c1022820ciuLIZLLL.LIZIZ(String.valueOf(LJI - 1), "adsgap");
                c1022820ciuLIZLLL.LIZIZ(String.valueOf(j - LJII), "gaptime");
                c1022820ciuLIZLLL.LJIIIIZZ();
            }
            LJI = 0;
            return;
        }
        int i2 = LJI;
        if (1 <= i2 && i2 < 10) {
            LJI = i2 + 1;
        } else {
            LJI = 0;
            LJII = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(long r10, android.content.Context r12, com.ss.android.ugc.aweme.feed.model.Aweme r13) {
        /*
            r3 = 0
            r6 = 1
            if (r13 == 0) goto L1d
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isAdTraffic(r13)
            if (r0 != r6) goto L15
            boolean r0 = X.C1017070cZd.LLIZLLLIL(r13)
            if (r0 == r6) goto L15
            X.C588810N7n.LJIIIIZZ = r6
            X.C588810N7n.LJIIIZ = r10
            return
        L15:
            boolean r0 = X.C1017070cZd.LLIZLLLIL(r13)
            if (r0 != r6) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            r1 = 10
            if (r0 == 0) goto L8c
            int r0 = X.C588810N7n.LJIIIIZZ
            if (r6 > r0) goto L89
            if (r0 >= r1) goto L89
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            int r0 = X.C588810N7n.LJIIIIZZ
            int r0 = r0 - r6
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r5 = "adsgap"
            r7.put(r5, r0)
            long r8 = X.C588810N7n.LJIIIZ
            long r0 = r10 - r8
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "gaptime"
            r7.put(r4, r0)
            java.util.List<java.lang.String> r0 = X.C1019030ccn.LIZ
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            java.lang.String r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r7)
            java.lang.String r0 = "ad_extra_data"
            r2.put(r0, r1)
            org.json.JSONObject r0 = X.C1019030ccn.LJIIJJI(r12, r13, r3, r2)
            java.lang.String r2 = "feed_lastshow"
            X.C1019030ccn.LJJJJ(r12, r2, r13, r0)
            if (r13 == 0) goto L8a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r13.getAwemeRawAd()
        L6a:
            java.lang.String r0 = "draw_ad"
            X.0ciu r2 = X.C2184171Adz.LIZLLL(r0, r2, r1)
            int r0 = X.C588810N7n.LJI
            int r0 = r0 - r6
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.LIZIZ(r0, r5)
            long r0 = X.C588810N7n.LJIIIZ
            long r10 = r10 - r0
            java.lang.String r0 = java.lang.String.valueOf(r10)
            r2.LIZIZ(r0, r4)
            r2.LJIIIIZZ()
            X.C588810N7n.LJIIIIZZ = r3
        L89:
            return
        L8a:
            r1 = 0
            goto L6a
        L8c:
            int r0 = X.C588810N7n.LJIIIIZZ
            if (r6 > r0) goto L97
            if (r0 >= r1) goto L97
            int r0 = r0 + 1
            X.C588810N7n.LJIIIIZZ = r0
            return
        L97:
            X.C588810N7n.LJIIIIZZ = r3
            r0 = 0
            X.C588810N7n.LJIIIZ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C588810N7n.LIZIZ(long, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
