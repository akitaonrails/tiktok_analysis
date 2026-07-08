package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0CT6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CT6 {
    public static final /* synthetic */ int LJ = 0;
    public final C0CT1 LIZ;
    public final InterfaceC497601wk LIZIZ;
    public final InterfaceC622260Oau LIZJ;
    public final C01GW LIZLLL;

    public final long LIZLLL() {
        return ((Number) this.LIZLLL.getValue()).longValue();
    }

    public final void LIZJ(Function1 function1) {
        C23250099c.LIZLLL(this.LIZIZ, null, null, new C314100CSy(this, new C0CT5(this, function1, null), null), 3);
    }

    public C0CT6(C314700CVg c314700CVg, C054G c054g) {
        C622190Oan c622190Oan = C622190Oan.LIZ;
        this.LIZ = c314700CVg;
        this.LIZIZ = c054g;
        this.LIZJ = c622190Oan;
        this.LIZLLL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn r8, kotlin.jvm.functions.Function1 r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C0CT8
            if (r0 == 0) goto L21
            r6 = r8
            X.0CT8 r6 = (X.C0CT8) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 != r3) goto L2b
            goto L27
        L21:
            X.0CT8 r6 = new X.0CT8
            r6.<init>(r7, r8)
            goto L12
        L27:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L4d
            return r1
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r1)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> L4d
            r0 = 10
            long r1 = r2.toMillis(r0)     // Catch: java.lang.Exception -> L4d
            X.0CT0 r0 = new X.0CT0     // Catch: java.lang.Exception -> L4d
            r0.<init>(r7, r9, r4)     // Catch: java.lang.Exception -> L4d
            r6.LLILLL = r3     // Catch: java.lang.Exception -> L4d
            java.lang.Object r1 = X.C099A.LIZIZ(r1, r0, r6)     // Catch: java.lang.Exception -> L4d
            if (r1 != r5) goto L4c
            return r5
        L4c:
            return r1
        L4d:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0Oau r0 = r7.LIZJ
            r0.LIZ()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "execute WriteTask Fail: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C622290Oax.LIZLLL(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CT6.LIZIZ(X.05Vn, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn r9, kotlin.jvm.functions.Function1 r10, boolean r11) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C0CT7
            if (r0 == 0) goto L21
            r7 = r9
            X.0CT7 r7 = (X.C0CT7) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L33
            if (r0 != r5) goto L2b
            goto L27
        L21:
            X.0CT7 r7 = new X.0CT7
            r7.<init>(r8, r9)
            goto L12
        L27:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L52
            return r1
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r1)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> L52
            r0 = 10
            long r1 = r2.toMillis(r0)     // Catch: java.lang.Exception -> L52
            X.0CT2 r3 = new X.0CT2     // Catch: java.lang.Exception -> L52
            if (r11 == 0) goto L44
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            r3.<init>(r0, r8, r10, r4)     // Catch: java.lang.Exception -> L52
            r7.LLILLL = r5     // Catch: java.lang.Exception -> L52
            java.lang.Object r1 = X.C099A.LIZIZ(r1, r3, r7)     // Catch: java.lang.Exception -> L52
            if (r1 != r6) goto L51
            return r6
        L51:
            return r1
        L52:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0Oau r0 = r8.LIZJ
            r0.LIZ()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "execute ReadTask Fail: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C622290Oax.LIZLLL(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CT6.LIZ(X.05Vn, kotlin.jvm.functions.Function1, boolean):java.lang.Object");
    }
}
