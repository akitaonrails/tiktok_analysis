package X;

import java.util.concurrent.RecursiveTask;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ReK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700820ReK extends RecursiveTask<Pair<? extends InterfaceC700010Rd1, ? extends C699980Rcy>> {
    public static final int $stable = 8;
    public final C700260RdQ config;
    public final C700170RdH context;
    public final InterfaceC700010Rd1 modifier;

    /* JADX WARN: Removed duplicated region for block: B:6:0x004e  */
    @Override // java.util.concurrent.RecursiveTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlin.Pair<? extends X.InterfaceC700010Rd1, ? extends X.C699980Rcy> compute() {
        /*
            r7 = this;
            long r5 = java.lang.System.currentTimeMillis()
            X.0ReN r0 = new X.0ReN
            r3 = r7
            r0.<init>(r5, r3)
            X.C0T6L.LIZLLL()
            X.0ReM r0 = new X.0ReM
            r0.<init>(r5, r3)
            X.C0T6L.LIZLLL()
            X.0ReL r0 = new X.0ReL
            r0.<init>(r3)
            X.C0T6L.LIZLLL()
            X.0Rd1 r2 = r3.modifier
            X.0RdQ r0 = r3.config
            X.0Ras r1 = r0.LIZ
            X.0RdH r0 = r3.context
            r2.LIZ(r1, r0)
            X.0Rd1 r1 = r3.modifier
            X.0RdH r0 = r3.context
            boolean r4 = r1.LIZIZ(r0)
            long r1 = java.lang.System.currentTimeMillis()
            X.0ReT r0 = new X.0ReT
            r0.<init>(r1, r3, r4, r5)
            X.C0T6L.LIZLLL()
            X.0RdH r0 = r3.context
            java.util.Map<X.0Rd1, X.0Rcy> r1 = r0.LJIILL
            if (r1 == 0) goto L4e
            X.0Rd1 r0 = r3.modifier
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r2 = r1.get(r0)
            X.0Rcy r2 = (X.C699980Rcy) r2
            if (r2 != 0) goto L54
        L4e:
            X.0Rcy r2 = new X.0Rcy
            r0 = 0
            r2.<init>(r0)
        L54:
            r2.LIZ = r4
            X.0Rd1 r1 = r3.modifier
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C700820ReK.compute():java.lang.Object");
    }

    public C700820ReK(C700170RdH c700170RdH, InterfaceC700010Rd1 interfaceC700010Rd1, C700260RdQ c700260RdQ) {
        this.context = c700170RdH;
        this.modifier = interfaceC700010Rd1;
        this.config = c700260RdQ;
    }
}
