package X;

import Y.AfS43S1100000_7;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFlowHotRefreshSetting;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0ISQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ISQ {
    public final String LIZ;
    public C11JF LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(281));

    public final void LIZIZ() {
        this.LIZLLL = 0;
        LIZJ(LiveInnerFlowHotRefreshSetting.getExpiredTimeMs(this.LIZ), "feed_arrived");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r9 = this;
            java.lang.String r0 = r9.LIZ
            long r1 = com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFlowHotRefreshSetting.getExpiredTimeMs(r0)
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto Ld
            return
        Ld:
            boolean r0 = r9.LIZJ
            if (r0 == 0) goto L12
            return
        L12:
            int r1 = com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFlowHotRefreshSetting.getExpiredRetryMaxCount()
            if (r1 <= 0) goto L45
            int r0 = r9.LIZLLL
            if (r0 >= r1) goto L45
            int r1 = r0 + 1
            r9.LIZLLL = r1
            long r7 = com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFlowHotRefreshSetting.getExpiredRetryBaseBackoffMs()
            long r5 = com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFlowHotRefreshSetting.getExpiredRetryMaxBackoffMs()
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 > 0) goto L46
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L62
        L30:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "retry_"
            r1.append(r0)
            int r0 = r9.LIZLLL
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r9.LIZJ(r3, r0)
        L45:
            return
        L46:
            int r2 = r1 + (-1)
            r1 = 0
            r0 = 30
            int r0 = X.C13LZ.LJ(r2, r1, r0)
            long r1 = r7 << r0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L5a
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L5a:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L64
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L64
        L62:
            r3 = r5
            goto L30
        L64:
            r3 = r1
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ISQ.LIZ():void");
    }

    public C0ISQ(String str) {
        this.LIZ = str;
    }

    public final void LIZJ(long j, String str) {
        C11JF c11jf = this.LIZIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        if (j <= 0) {
            return;
        }
        this.LIZIZ = (C11JF) C11NZ.LJLJJLL(j, TimeUnit.MILLISECONDS).LJJLL(new AfS43S1100000_7(this, str, 3), new C09JN() { // from class: X.0ISR
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("FeedExpiredManager@9a0c.scheduleTimer$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error when wait feed expired e = ");
                sbLIZ.append(obj);
                C20441214yg.LJ("FeedExpiredManager", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("FeedExpiredManager@9a0c.scheduleTimer$2");
            }
        });
    }
}
