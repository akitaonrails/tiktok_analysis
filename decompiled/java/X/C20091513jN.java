package X;

import k0.f2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13jN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20091513jN implements InterfaceC1686570tzT {
    public final InterfaceC20092113jT LIZ;
    public final InterfaceC1677940tlY<Float> LIZIZ;
    public final InterfaceC1677030tk5<Float> LIZJ;
    public final C1838700xwq LIZLLL = f2.LIZJ;

    public final int hashCode() {
        return ((((0 + this.LIZJ.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20091513jN)) {
            return false;
        }
        C20091513jN c20091513jN = (C20091513jN) obj;
        if (!Intrinsics.LJFF(c20091513jN.LIZJ, this.LIZJ) || !Intrinsics.LJFF(c20091513jN.LIZIZ, this.LIZIZ) || !Intrinsics.LJFF(c20091513jN.LIZ, this.LIZ)) {
            return false;
        }
        return true;
    }

    public C20091513jN(InterfaceC20092113jT interfaceC20092113jT, InterfaceC1677940tlY<Float> interfaceC1677940tlY, InterfaceC1677030tk5<Float> interfaceC1677030tk5) {
        this.LIZ = interfaceC20092113jT;
        this.LIZIZ = interfaceC1677940tlY;
        this.LIZJ = interfaceC1677030tk5;
    }

    @Override // X.InterfaceC633750OtR
    public final Object LIZ(InterfaceC1392705cj interfaceC1392705cj, float f, InterfaceC1364105Vn interfaceC1364105Vn) {
        return LIZIZ(interfaceC1392705cj, f, C1866760yg6.LIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    @Override // X.InterfaceC1686570tzT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1392705cj r6, float r7, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r8, X.InterfaceC1364105Vn<? super java.lang.Float> r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C20091913jR
            if (r0 == 0) goto L4e
            r4 = r9
            X.13jR r4 = (X.C20091913jR) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L42
            if (r1 != r0) goto L54
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0tyx r3 = (X.C1686250tyx) r3
            T r0 = r3.LIZ
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            X.0tky<T, V extends X.0tkS> r2 = r3.LIZIZ
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r2.LJIIL()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
        L3d:
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r1)
            return r0
        L42:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            java.lang.Object r3 = r5.LIZLLL(r6, r7, r8, r4)
            if (r3 != r2) goto L22
            return r2
        L4e:
            X.13jR r4 = new X.13jR
            r4.<init>(r5, r9)
            goto L12
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20091513jN.LIZIZ(X.05cj, float, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1392705cj r12, float r13, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r14, X.InterfaceC1364105Vn<? super X.C1686250tyx<java.lang.Float, X.C1677280tkU>> r15) throws java.lang.Throwable {
        /*
            r11 = this;
            r10 = r14
            boolean r0 = r15 instanceof X.C20091813jQ
            r8 = r11
            if (r0 == 0) goto L47
            r4 = r15
            X.13jQ r4 = (X.C20091813jQ) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r4.LLILZ = r2
        L14:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L4d
            kotlin.jvm.functions.Function1 r10 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L26:
            r0 = 0
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r0)
            r10.invoke(r0)
            return r3
        L2f:
            X.C155000ia.LIZIZ(r3)
            X.0xwq r0 = r8.LIZLLL
            X.13jO r5 = new X.13jO
            r9 = 0
            r6 = r13
            r7 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r4.LL = r10
            r4.LLILZ = r1
            java.lang.Object r3 = X.C23250099c.LJI(r4, r0, r5)
            if (r3 != r2) goto L26
            return r2
        L47:
            X.13jQ r4 = new X.13jQ
            r4.<init>(r8, r15)
            goto L14
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20091513jN.LIZLLL(X.05cj, float, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZJ(X.C20091513jN r9, X.InterfaceC1392705cj r10, float r11, float r12, kotlin.jvm.internal.AwS396S0200000_30 r13, X.InterfaceC1364105Vn r14) {
        /*
            r9.getClass()
            boolean r0 = r14 instanceof X.C20091713jP
            if (r0 == 0) goto L72
            r8 = r14
            X.13jP r8 = (X.C20091713jP) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r8.LLILLL = r2
        L15:
            java.lang.Object r1 = r8.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r3 = 1
            if (r0 == 0) goto L2a
            if (r0 != r3) goto L78
            X.C155000ia.LIZIZ(r1)
        L25:
            X.0tyx r1 = (X.C1686250tyx) r1
            X.0tky<T, V extends X.0tkS> r2 = r1.LIZIZ
            return r2
        L2a:
            X.C155000ia.LIZIZ(r1)
            float r0 = java.lang.Math.abs(r11)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L80
            float r0 = java.lang.Math.abs(r12)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L80
            r8.LLILLL = r3
            X.0tlY<java.lang.Float> r0 = r9.LIZIZ
            float r0 = X.C1677880tlS.LIZ(r0, r1, r12)
            float r1 = java.lang.Math.abs(r0)
            float r0 = java.lang.Math.abs(r11)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L6a
            X.13jL r3 = new X.13jL
            X.0tlY<java.lang.Float> r0 = r9.LIZIZ
            r3.<init>(r0)
        L59:
            java.lang.Float r5 = X.C2286608xc.LIZLLL(r11)
            java.lang.Float r6 = X.C2286608xc.LIZLLL(r12)
            r7 = r13
            r4 = r10
            java.lang.Object r1 = r3.LIZ(r4, r5, r6, r7, r8)
            if (r1 != r2) goto L25
            return r2
        L6a:
            X.13jM r3 = new X.13jM
            X.0tk5<java.lang.Float> r0 = r9.LIZJ
            r3.<init>(r0)
            goto L59
        L72:
            X.13jP r8 = new X.13jP
            r8.<init>(r9, r14)
            goto L15
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L80:
            r0 = 28
            X.0tky r2 = X.C1677590tkz.LIZ(r11, r12, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20091513jN.LIZJ(X.13jN, X.05cj, float, float, kotlin.jvm.internal.AwS396S0200000_30, X.05Vn):java.lang.Object");
    }
}
