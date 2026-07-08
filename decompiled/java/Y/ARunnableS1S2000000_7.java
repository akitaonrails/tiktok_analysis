package Y;

import X.C1529590puH;
import X.C1537060q6K;
import X.C1537480q70;
import X.C1545590qK5;
import X.C1C7U;
import X.C2097608Jq;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS1S2000000_7 implements Runnable {
    public final int $t;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1545590qK5 c1545590qK5 = C1545590qK5.LIZIZ;
        C1537060q6K.LJIIJJI(C1529590puH.LIZ, UriProtector.parse(c1545590qK5.LIZLLL(this.s0) ? c1545590qK5.LIZIZ(this.s0, C2097608Jq.LJ()) : this.s0).buildUpon().appendQueryParameter("enable_pending_js_task", "1").appendQueryParameter("ignore_cached_theme", "1").appendQueryParameter("spark_perf_biz", this.s1).build().toString(), this.s1, new C1537480q70(), null, true, null, 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$0(Y.ARunnableS1S2000000_7 r13) {
        /*
            java.lang.String r4 = r13.s0
            java.lang.String r5 = r13.s1
            java.lang.String r7 = "MessageShowHandler@5daa.interceptLiveScheme$1L"
            X.C1C7U.LIZ(r7)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r0 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r0
            X.0IXn r3 = r0.getLivePreloadService()
            if (r3 == 0) goto L4f
            java.lang.String r13 = "push-push"
            X.0IXl r3 = (X.C468150IXl) r3
            r0 = 202176(0x315c0, float:2.83309E-40)
            boolean r6 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            r1 = 0
            if (r4 == 0) goto L33
            long r9 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r4)     // Catch: java.lang.Exception -> L2f
            goto L35
        L2f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L33:
            r9 = 0
        L35:
            if (r5 == 0) goto L40
            long r11 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r5)     // Catch: java.lang.Exception -> L3c
            goto L42
        L3c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L40:
            r11 = 0
        L42:
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 != 0) goto L53
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 != 0) goto L53
        L4a:
            if (r6 == 0) goto L4f
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L4f:
            X.C1C7U.LIZIZ(r7)
            return
        L53:
            com.ss.android.ugc.aweme.live.api.LiveRoomPreloadApi r8 = r3.LIZLLL
            if (r8 == 0) goto L4a
            X.11NZ r1 = r8.preloadRoom(r9, r11, r13)
            if (r1 == 0) goto L4a
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r1 = r1.LJL(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r2 = r1.LJJJLZIJ(r0)
            if (r2 == 0) goto L4a
            Y.AfS8S2200000_7 r1 = new Y.AfS8S2200000_7
            r0 = 0
            r1.<init>(r3, r4, r5, r0)
            X.0D8T r0 = new X.0D8T
            r0.<init>()
            r2.LJJLL(r1, r0)
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS1S2000000_7.run$0(Y.ARunnableS1S2000000_7):void");
    }

    public static final void run$1(ARunnableS1S2000000_7 aRunnableS1S2000000_7) {
        boolean zLIZ;
        C1C7U.LIZ("BulletinSparkPreloadManager@dbc2.preloadBulletinSparkPage$runnable$1");
        try {
            aRunnableS1S2000000_7.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BulletinSparkPreloadManager@dbc2.preloadBulletinSparkPage$runnable$1");
    }

    public ARunnableS1S2000000_7(String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = "bulletin_live_event_page";
    }

    public ARunnableS1S2000000_7(String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
