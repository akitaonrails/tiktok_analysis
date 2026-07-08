package X;

import java.util.List;

/* JADX INFO: renamed from: X.09qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2499209qo implements InterfaceC2495009q8 {
    public final List<InterfaceC2495909qH> LIZ;
    public final int LIZIZ;
    public long LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C2499209qo(List<? extends InterfaceC2495909qH> list, int i) {
        this.LIZ = list;
        this.LIZIZ = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    @Override // X.InterfaceC2495009q8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C525700KjY r10, X.InterfaceC1364105Vn<? super X.InterfaceC2499409qq> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C2499309qp
            if (r0 == 0) goto Lae
            r5 = r11
            X.09qp r5 = (X.C2499309qp) r5
            int r2 = r5.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lae
            int r2 = r2 - r1
            r5.LLILZLL = r2
        L12:
            java.lang.Object r0 = r5.LLILZ
            java.lang.Object r7 = X.C099R.LJFF()
            int r1 = r5.LLILZLL
            r4 = 1
            if (r1 == 0) goto L6a
            if (r1 != r4) goto Lb5
            long r1 = r5.LLILLL
            X.09qH r3 = r5.LLILLJJLI
            X.09qo r6 = r5.LL
            X.C155000ia.LIZIZ(r0)
        L28:
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r1
            long r6 = r6.LIZJ
            long r1 = r4 - r6
            r9.LIZJ = r4
            X.0Kwb r7 = X.C533790Kwb.LIZIZ
            java.lang.StringBuilder r8 = X.C2188811AlT.LIZ()
            java.lang.String r6 = "next-step interceptor("
            r8.append(r6)
            java.lang.Class r3 = r3.getClass()
            X.12Dl r3 = X.C13LE.LIZ(r3)
            java.lang.String r3 = r3.LJI()
            r8.append(r3)
            java.lang.String r3 = ") cost duration: self: "
            r8.append(r3)
            r8.append(r1)
            java.lang.String r1 = "ms, total(chain): "
            r8.append(r1)
            r8.append(r4)
            java.lang.String r1 = "ms"
            r8.append(r1)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r8)
            X.C201955140j.LIZJ(r7, r1)
            return r0
        L6a:
            X.C155000ia.LIZIZ(r0)
            kotlin.coroutines.CoroutineContext r0 = r5.getContext()
            X.C23118094a.LJI(r0)
            int r1 = r9.LIZIZ
            java.util.List<X.09qH> r0 = r9.LIZ
            int r0 = r0.size()
            if (r1 < r0) goto L8a
            X.0KjU r3 = new X.0KjU
            java.util.List<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r2 = r10.LIZ
            X.0L99 r1 = r10.LIZIZ
            android.content.Intent r0 = r10.LJ
            r3.<init>(r2, r1, r0)
            return r3
        L8a:
            X.09qo r6 = new X.09qo
            java.util.List<X.09qH> r2 = r9.LIZ
            int r1 = r9.LIZIZ
            int r0 = r1 + 1
            r6.<init>(r2, r0)
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r1)
            X.09qH r3 = (X.InterfaceC2495909qH) r3
            long r1 = android.os.SystemClock.elapsedRealtime()
            r5.LL = r6
            r5.LLILLJJLI = r3
            r5.LLILLL = r1
            r5.LLILZLL = r4
            java.lang.Object r0 = r3.LJLIIIL(r10, r6, r5)
            if (r0 != r7) goto L28
            return r7
        Lae:
            X.09qp r5 = new X.09qp
            r5.<init>(r9, r11)
            goto L12
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2499209qo.LIZ(X.0KjY, X.05Vn):java.lang.Object");
    }
}
