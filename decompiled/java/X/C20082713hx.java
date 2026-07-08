package X;

import k0.f2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13hx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20082713hx {
    public InterfaceC1420105h9 LIZ;
    public InterfaceC1681290tqx LIZIZ;
    public InterfaceC633750OtR LIZJ;
    public EnumC1684030tvN LIZLLL;
    public boolean LJ;
    public C20085913iT LJFF;
    public final Function0<Boolean> LJI;
    public boolean LJII;
    public int LJIIIIZZ = 1;
    public InterfaceC1392705cj LJIIIZ = f2.LIZIZ;
    public final C20083513i5 LJIIJ = new C112R() { // from class: X.13i5
        @Override // X.C112R
        public final long LIZIZ(long j) {
            C20082713hx c20082713hx = this.LIZ;
            return C20082713hx.LIZ(c20082713hx, c20082713hx.LJIIIZ, j, 1);
        }

        @Override // X.C112R
        public final long LIZ(int i, long j) {
            C20082713hx c20082713hx = this.LIZ;
            c20082713hx.LJIIIIZZ = i;
            InterfaceC1681290tqx interfaceC1681290tqx = c20082713hx.LIZIZ;
            if (interfaceC1681290tqx != null && (c20082713hx.LIZ.LIZJ() || c20082713hx.LIZ.LIZLLL())) {
                C20082713hx c20082713hx2 = this.LIZ;
                return interfaceC1681290tqx.LJIJJLI(c20082713hx2.LJIIIIZZ, j, c20082713hx2.LJIIJJI);
            }
            C20082713hx c20082713hx3 = this.LIZ;
            return C20082713hx.LIZ(c20082713hx3, c20082713hx3.LJIIIZ, j, i);
        }
    };
    public final AwS609S0100000_30 LJIIJJI = new AwS609S0100000_30(this, 208);

    public final float LIZLLL(float f) {
        if (this.LJ) {
            return f * (-1);
        }
        return f;
    }

    public final long LJ(long j) {
        if (this.LJ) {
            return C1378605aS.LJII(-1.0f, j);
        }
        return j;
    }

    public final float LJI(long j) {
        long j2;
        if (this.LIZLLL == EnumC1684030tvN.Horizontal) {
            j2 = j >> 32;
        } else {
            j2 = j & 4294967295L;
        }
        return Float.intBitsToFloat((int) j2);
    }

    public final long LJII(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.LIZLLL == EnumC1684030tvN.Horizontal) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(long r12, X.InterfaceC1364105Vn<? super X.C1395705dD> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C20083313i3
            r6 = r11
            if (r0 == 0) goto L56
            r4 = r14
            X.13i3 r4 = (X.C20083313i3) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L13:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L5c
            X.00w2 r7 = r4.LLILLJJLI
            X.13hx r1 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L27:
            r0 = 0
            r1.LJII = r0
            long r1 = r7.element
            X.05dD r0 = new X.05dD
            r0.<init>(r1)
            return r0
        L32:
            X.C155000ia.LIZIZ(r3)
            X.00w2 r7 = new X.00w2
            r7.<init>()
            r8 = r12
            r7.element = r8
            r6.LJII = r1
            X.05bM r0 = X.EnumC1384205bM.Default
            X.13hy r5 = new X.13hy
            r10 = 0
            r5.<init>(r6, r7, r8, r10)
            r4.LL = r6
            r4.LLILLJJLI = r7
            r4.LLILZIL = r1
            java.lang.Object r0 = r6.LJFF(r0, r5, r4)
            if (r0 != r2) goto L54
            return r2
        L54:
            r1 = r6
            goto L27
        L56:
            X.13i3 r4 = new X.13i3
            r4.<init>(r6, r14)
            goto L13
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20082713hx.LIZIZ(long, X.05Vn):java.lang.Object");
    }

    public final Object LIZJ(long j, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        long jLIZ;
        if (z) {
            return Unit.LIZ;
        }
        if (this.LIZLLL == EnumC1684030tvN.Horizontal) {
            jLIZ = C1395705dD.LIZ(0.0f, 0.0f, 1, j);
        } else {
            jLIZ = C1395705dD.LIZ(0.0f, 0.0f, 2, j);
        }
        C20082913hz c20082913hz = new C20082913hz(this, null);
        InterfaceC1681290tqx interfaceC1681290tqx = this.LIZIZ;
        if (interfaceC1681290tqx != null && (this.LIZ.LIZJ() || this.LIZ.LIZLLL())) {
            Object objLJIL = interfaceC1681290tqx.LJIL(jLIZ, c20082913hz, interfaceC1364105Vn);
            if (objLJIL == C099R.LJFF()) {
                return objLJIL;
            }
            return Unit.LIZ;
        }
        Object objInvoke = c20082913hz.invoke(new C1395705dD(jLIZ), interfaceC1364105Vn);
        if (objInvoke == C099R.LJFF()) {
            return objInvoke;
        }
        return Unit.LIZ;
    }

    public final Object LJFF(EnumC1384205bM enumC1384205bM, Function2<? super C112R, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZ = this.LIZ.LIZ(enumC1384205bM, new C112S(this, null, function2), interfaceC1364105Vn);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    public static final long LIZ(C20082713hx c20082713hx, InterfaceC1392705cj interfaceC1392705cj, long j, int i) {
        long jLJJJLZIJ;
        int i2;
        C20086013iU c20086013iULJ = c20082713hx.LJFF.LJ();
        if (c20086013iULJ != null) {
            jLJJJLZIJ = c20086013iULJ.LJJJLZIJ(i, j);
        } else {
            jLJJJLZIJ = 0;
        }
        long jLJFF = C1378605aS.LJFF(j, jLJJJLZIJ);
        if (c20082713hx.LIZLLL == EnumC1684030tvN.Horizontal) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        long jLJ = c20082713hx.LJ(c20082713hx.LJII(interfaceC1392705cj.LIZJ(c20082713hx.LJI(c20082713hx.LJ(C1378605aS.LIZ(0.0f, i2, jLJFF))))));
        return C1378605aS.LJI(C1378605aS.LJI(jLJJJLZIJ, jLJ), c20082713hx.LJFF.LIZIZ(i, jLJ, C1378605aS.LJFF(jLJFF, jLJ)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.13i5] */
    public C20082713hx(InterfaceC1420105h9 interfaceC1420105h9, InterfaceC1681290tqx interfaceC1681290tqx, InterfaceC633750OtR interfaceC633750OtR, EnumC1684030tvN enumC1684030tvN, boolean z, C20085913iT c20085913iT, AwS573S0100000_29 awS573S0100000_29) {
        this.LIZ = interfaceC1420105h9;
        this.LIZIZ = interfaceC1681290tqx;
        this.LIZJ = interfaceC633750OtR;
        this.LIZLLL = enumC1684030tvN;
        this.LJ = z;
        this.LJFF = c20085913iT;
        this.LJI = awS573S0100000_29;
    }
}
