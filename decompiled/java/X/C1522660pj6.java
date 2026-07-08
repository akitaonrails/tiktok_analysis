package X;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: X.0pj6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522660pj6 extends AbstractC1522680pj8 {
    public C0X9S<?> LJII;
    public final boolean LJIIIIZZ;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    @Override // X.AbstractC1522680pj8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel() {
        /*
            r4 = this;
            r3 = 0
            X.0X9S<?> r0 = r4.LJII     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            r0.cancel()     // Catch: java.lang.Throwable -> L10
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L10
        La:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L10
            goto L1c
        Le:
            r0 = r3
            goto La
        L10:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L1c:
            r2 = 0
            X.0X9S<?> r0 = r4.LJII     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L30
            boolean r1 = r0.isCanceled()     // Catch: java.lang.Throwable -> L32
            r0 = 1
            if (r1 != r0) goto L30
        L28:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L32
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L32
            goto L3e
        L30:
            r0 = 0
            goto L28
        L32:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L3e:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L45
            r3 = r1
        L45:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L4d
            boolean r2 = r3.booleanValue()
        L4d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1522660pj6.cancel():boolean");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1522660pj6(C1534070q1V c1534070q1V, Map map) {
        C1533640q0o c1533640q0o = c1534070q1V.LJII;
        String str = c1533640q0o.LIZLLL;
        Uri uri = c1533640q0o.LJ;
        C1533490q0Z c1533490q0Z = c1534070q1V.LIZIZ.LIZ;
        super(str, uri, c1533490q0Z.LJFF, c1533490q0Z.LIZLLL, map);
        this.LJIIIIZZ = c1534070q1V.LJIIL;
    }
}
