package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0958, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0958 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.InterfaceC1364105Vn<?> r5) {
        /*
            boolean r0 = r5 instanceof X.AnonymousClass0959
            if (r0 == 0) goto L27
            r4 = r5
            X.0959 r4 = (X.AnonymousClass0959) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 == r2) goto L4e
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L27:
            X.0959 r4 = new X.0959
            r4.<init>(r5)
            goto L12
        L2d:
            X.C155000ia.LIZIZ(r1)
            r4.LLILLJJLI = r2
            X.1DEt r1 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r4)
            r1.<init>(r2, r0)
            r1.LJIJJ()
            java.lang.Object r1 = r1.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L4b
            X.C099Q.LIZJ(r4)
        L4b:
            if (r1 != r3) goto L51
            return r3
        L4e:
            X.C155000ia.LIZIZ(r1)
        L51:
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0958.LIZ(X.05Vn):java.lang.Object");
    }

    public static final InterfaceC2239108px LIZLLL(CoroutineContext coroutineContext) {
        InterfaceC2239108px interfaceC2239108px;
        CoroutineContext.Element element = coroutineContext.get(InterfaceC23139094v.LJJLIIJ);
        if (!(element instanceof InterfaceC2239108px) || (interfaceC2239108px = (InterfaceC2239108px) element) == null) {
            return C2232608ou.LIZ;
        }
        return interfaceC2239108px;
    }

    public static final long LJ(long j) {
        C19990113Jj.LLILLJJLI.getClass();
        long j2 = 0;
        if (C19990113Jj.LJI(j, 0L) > 0) {
            long jLJIIIZ = C19990113Jj.LJIIIZ(j);
            j2 = 1;
            if (jLJIIIZ >= 1) {
                return jLJIIIZ;
            }
        }
        return j2;
    }

    public static final Object LIZIZ(long j, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (j <= 0) {
            return Unit.LIZ;
        }
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        if (j < Long.MAX_VALUE) {
            LIZLLL(c2252611DEt.getContext()).scheduleResumeAfterDelay(j, c2252611DEt);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    public static final Object LIZJ(long j, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZIZ = LIZIZ(LJ(j), interfaceC1364105Vn);
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }
}
