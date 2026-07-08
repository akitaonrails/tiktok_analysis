package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0ozd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1494470ozd {
    public AtomicReference<EnumC1494480oze> LIZLLL;
    public int LJFF;
    public final C1494490ozf LIZ = new C1494490ozf();
    public volatile boolean LIZIZ = false;
    public final AtomicReference<EnumC1494480oze> LIZJ = new AtomicReference<>(EnumC1494480oze.UNKNOWN);
    public final ArrayList<InterfaceC1493580oyC> LJ = new ArrayList<>();

    public final synchronized EnumC1494480oze LIZIZ() {
        C1494490ozf c1494490ozf = this.LIZ;
        if (c1494490ozf == null) {
            return EnumC1494480oze.UNKNOWN;
        }
        try {
            double d = c1494490ozf.LIZIZ;
            return d < 0.0d ? EnumC1494480oze.UNKNOWN : d < 28.0d ? EnumC1494480oze.POOR : d < 112.0d ? EnumC1494480oze.MODERATE : d < 560.0d ? EnumC1494480oze.GOOD : EnumC1494480oze.EXCELLENT;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return EnumC1494480oze.UNKNOWN;
        }
    }

    public final synchronized double LIZJ() {
        C1494490ozf c1494490ozf;
        c1494490ozf = this.LIZ;
        return c1494490ozf == null ? -1.0d : c1494490ozf.LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6 A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #3 {all -> 0x00bc, blocks: (B:35:0x009e, B:37:0x00a6), top: B:60:0x009e, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZ(long r11, long r13) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1494470ozd.LIZ(long, long):void");
    }
}
