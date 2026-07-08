package X;

/* JADX INFO: renamed from: X.098W, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C098W<U, T extends U> extends C099Z<T> implements Runnable {
    public final long LLILZIL;

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJJL() {
        /*
            r4 = this;
            long r2 = r4.LLILZIL
            kotlin.coroutines.CoroutineContext r0 = r4.LLILLL
            X.08px r1 = X.AnonymousClass0958.LIZLLL(r0)
            boolean r0 = r1 instanceof X.C098X
            if (r0 == 0) goto L1b
            X.098X r1 = (X.C098X) r1
            if (r1 == 0) goto L1b
            X.13Jk r0 = X.EnumC19990213Jk.MILLISECONDS
            X.C19990313Jl.LJIIIIZZ(r2, r0)
            java.lang.String r1 = r1.LJJLIIIJL()
            if (r1 != 0) goto L30
        L1b:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Timed out waiting for "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " ms"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
        L30:
            X.094W r0 = new X.094W
            r0.<init>(r1, r4)
            r4.LJJIIZI(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C098W.LJLJJL():void");
    }

    @Override // X.C099D, kotlinx.coroutines.JobSupport
    public final String LJJLIIIJJIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.LJJLIIIJJIZ());
        sbLIZ.append("(timeMillis=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LJLJJL();
        } catch (Throwable th) {
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public C098W(long j, InterfaceC1364105Vn<? super U> interfaceC1364105Vn) {
        super(interfaceC1364105Vn, interfaceC1364105Vn.getContext());
        this.LLILZIL = j;
    }
}
