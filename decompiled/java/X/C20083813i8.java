package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.13i8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20083813i8 {
    public final C20082713hx LIZ;
    public final InterfaceC20077313h5 LIZIZ;
    public final Function2<C1395705dD, InterfaceC1364105Vn<? super Unit>, Object> LIZJ;
    public InterfaceC1690500u5o LIZLLL;
    public boolean LJFF;
    public C09AE LJI;
    public final C1DEK LJ = C095G.LIZ(Integer.MAX_VALUE, null, 6);
    public final C20084313iD LJII = new C20084313iD();

    public static C20074813gg LIZLLL(C1DEK c1dek) {
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c1dek, 1050);
        C20074813gg c20074813gg = null;
        Iterator<Object> it2 = new C1957407lc(new C1420805hG(awS546S0100000_2, null)).iterator();
        while (true) {
            C2152008bu c2152008bu = (C2152008bu) it2;
            if (c2152008bu.hasNext()) {
                C20074813gg c20074813ggLIZ = (C20074813gg) c2152008bu.next();
                if (c20074813gg != null) {
                    c20074813ggLIZ = c20074813gg.LIZ(c20074813ggLIZ);
                }
                c20074813gg = c20074813ggLIZ;
            } else {
                return c20074813gg;
            }
        }
    }

    public final void LJ(C20074813gg c20074813gg) {
        C20084313iD c20084313iD = this.LJII;
        long j = c20074813gg.LIZIZ;
        long j2 = c20074813gg.LIZ;
        c20084313iD.LIZ.LIZ(Float.intBitsToFloat((int) (j2 >> 32)), j);
        c20084313iD.LIZIZ.LIZ(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    public static final float LIZ(C20083813i8 c20083813i8, C112R c112r, float f) {
        C20082713hx c20082713hx = c20083813i8.LIZ;
        return c20082713hx.LJI(c20082713hx.LJ(c112r.LIZIZ(c20082713hx.LJII(c20082713hx.LIZLLL(f)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C20082713hx r7, X.InterfaceC1364105Vn r8, X.C20083913i9 r9) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C20084213iC
            if (r0 == 0) goto L42
            r5 = r8
            X.13iC r5 = (X.C20084213iC) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L48
            X.13i8 r1 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L24:
            r0 = 0
            r1.LJFF = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2a:
            X.C155000ia.LIZIZ(r4)
            r6.LJFF = r2
            X.112P r1 = new X.112P
            r0 = 0
            r1.<init>(r7, r0, r9)
            r5.LL = r6
            r5.LLILZ = r2
            java.lang.Object r0 = X.C2296908zH.LIZIZ(r1, r5)
            if (r0 != r3) goto L40
            return r3
        L40:
            r1 = r6
            goto L24
        L42:
            X.13iC r5 = new X.13iC
            r5.<init>(r6, r8)
            goto L12
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20083813i8.LJFF(X.13hx, X.05Vn, X.13i9):java.lang.Object");
    }

    public C20083813i8(C20082713hx c20082713hx, C20073313gR c20073313gR, C20081313hj c20081313hj, InterfaceC1690500u5o interfaceC1690500u5o) {
        this.LIZ = c20082713hx;
        this.LIZIZ = c20073313gR;
        this.LIZJ = c20081313hj;
        this.LIZLLL = interfaceC1690500u5o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010c  */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, X.0tky] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, X.13gg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(X.C20083813i8 r12, X.C20082713hx r13, X.C20074813gg r14, float r15, float r16, X.InterfaceC1364105Vn r17) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20083813i8.LIZIZ(X.13i8, X.13hx, X.13gg, float, float, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, X.0tky] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, X.13gg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZJ(X.C20083813i8 r9, X.C259800zU r10, X.C817403Hg r11, X.C20082713hx r12, X.C259800zU r13, long r14, X.InterfaceC1364105Vn r16) {
        /*
            r3 = r16
            boolean r0 = r3 instanceof X.C20084113iB
            if (r0 == 0) goto L8e
            r5 = r3
            X.13iB r5 = (X.C20084113iB) r5
            int r2 = r5.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8e
            int r2 = r2 - r1
            r5.LLIZ = r2
        L14:
            java.lang.Object r2 = r5.LLILZLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLIZ
            r4 = 1
            r6 = 0
            if (r0 == 0) goto L67
            if (r0 != r4) goto L94
            X.00zU r13 = r5.LLILZIL
            X.13hx r12 = r5.LLILZ
            X.03Hg r11 = r5.LLILLL
            X.00zU r10 = r5.LLILLJJLI
            X.13i8 r9 = r5.LL
            X.C155000ia.LIZIZ(r2)
        L2f:
            X.13gg r2 = (X.C20074813gg) r2
            if (r2 == 0) goto L62
            T r0 = r10.element
            X.13gg r0 = (X.C20074813gg) r0
            boolean r8 = r0.LIZJ
            long r4 = r2.LIZ
            long r6 = r2.LIZIZ
            X.13gg r3 = new X.13gg
            r3.<init>(r4, r6, r8)
            r10.element = r3
            long r0 = r12.LJ(r4)
            float r0 = r12.LJI(r0)
            r11.element = r0
            r1 = 30
            r0 = 0
            X.0tky r0 = X.C1677590tkz.LIZ(r0, r0, r1)
            r13.element = r0
            r9.LJ(r2)
            float r0 = r11.element
            boolean r0 = X.C20080813he.LIZ(r0)
            r6 = r0 ^ 1
        L62:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            return r3
        L67:
            X.C155000ia.LIZIZ(r2)
            r1 = 0
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L75
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            return r3
        L75:
            X.05hM r1 = new X.05hM
            r0 = 0
            r1.<init>(r9, r0)
            r5.LL = r9
            r5.LLILLJJLI = r10
            r5.LLILLL = r11
            r5.LLILZ = r12
            r5.LLILZIL = r13
            r5.LLIZ = r4
            java.lang.Object r2 = X.C099A.LIZJ(r14, r1, r5)
            if (r2 != r3) goto L2f
            return r3
        L8e:
            X.13iB r5 = new X.13iB
            r5.<init>(r3)
            goto L14
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20083813i8.LIZJ(X.13i8, X.00zU, X.03Hg, X.13hx, X.00zU, long, X.05Vn):java.lang.Object");
    }
}
