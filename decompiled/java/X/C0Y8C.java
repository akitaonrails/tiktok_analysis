package X;

import com.bytedance.im.core.proto.Request;

/* JADX INFO: renamed from: X.0Y8C, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y8C {
    public final InterfaceC864330XvT LIZ;
    public final C0YEM LIZIZ;
    public final C0Y77 LIZJ;
    public final int LIZLLL = C0YMR.GET_MESSAGE_PREVIEW.getValue();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0Y8F r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0Y8D
            if (r0 == 0) goto L52
            r6 = r9
            X.0Y8D r6 = (X.C0Y8D) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r6.LLILZ
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L28
            if (r1 == r0) goto L36
            if (r1 != r3) goto L58
            X.C155000ia.LIZIZ(r5)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r5)
            r6.LL = r8
            r6.LLILZ = r0
            java.lang.Object r5 = r7.LIZJ(r8, r6)
            if (r5 != r4) goto L3b
            return r4
        L36:
            X.0Y8F r8 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L3b:
            X.0Y8B r5 = (X.C0Y8B) r5
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0Y8A r1 = new X.0Y8A
            r0 = 0
            r1.<init>(r7, r8, r5, r0)
            r6.LL = r0
            r6.LLILZ = r3
            java.lang.Object r0 = X.C23250099c.LJI(r6, r2, r1)
            if (r0 != r4) goto L25
            return r4
        L52:
            X.0Y8D r6 = new X.0Y8D
            r6.<init>(r7, r9)
            goto L12
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y8C.LIZIZ(X.0Y8F, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C0Y8F r23, X.InterfaceC1364105Vn<? super X.C0Y8B> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y8C.LIZJ(X.0Y8F, X.05Vn):java.lang.Object");
    }

    public C0Y8C(InterfaceC864330XvT interfaceC864330XvT, C0YEM c0yem, C0Y77 c0y77) {
        this.LIZ = interfaceC864330XvT;
        this.LIZIZ = c0yem;
        this.LIZJ = c0y77;
    }

    public final Request LIZ(int i, int i2, long j) {
        C1ES0 c1es0 = new C1ES0();
        C0Y8G c0y8g = new C0Y8G();
        c0y8g.LIZLLL = Long.valueOf(j);
        c0y8g.LJ = Integer.valueOf(i);
        c1es0.LJIILL = c0y8g.build();
        return C0YLX.LIZ(i2, this.LIZLLL, c1es0.build(), this.LIZIZ.LJ(), this.LIZIZ.LJIIIZ(), null);
    }
}
