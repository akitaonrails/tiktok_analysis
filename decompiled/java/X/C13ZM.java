package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13ZM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ZM {
    public final List<C20035113aH> LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public final List<C20035113aH> LIZLLL;
    public final C20029713Yp<C20035213aI> LJ;
    public final C01GW LJFF;

    public final int LIZ(C20035113aH c20035113aH) {
        C20035213aI c20035213aILIZIZ = this.LJ.LIZIZ(c20035113aH.LIZJ);
        if (c20035213aILIZIZ != null) {
            return c20035213aILIZIZ.LIZIZ;
        }
        return -1;
    }

    public C13ZM(List<C20035113aH> list, int i) {
        this.LIZ = list;
        this.LIZIZ = i;
        if (i < 0) {
            C13D4.LIZ("Invalid start index");
        }
        this.LIZLLL = new ArrayList();
        C20029713Yp<C20035213aI> c20029713Yp = new C20029713Yp<>(6);
        int size = ((ArrayList) list).size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C20035113aH c20035113aH = (C20035113aH) ListProtector.get(this.LIZ, i3);
            c20029713Yp.LJII(c20035113aH.LIZJ, new C20035213aI(i3, i2, c20035113aH.LIZLLL));
            i2 += c20035113aH.LIZLLL;
        }
        this.LJ = c20029713Yp;
        this.LJFF = C452501pT.LIZIZ(new AwS574S0100000_30(this, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(int r20, int r21) {
        /*
            r19 = this;
            r2 = r19
            X.13Yp<X.13aI> r0 = r2.LJ
            r1 = r20
            java.lang.Object r10 = r0.LIZIZ(r1)
            X.13aI r10 = (X.C20035213aI) r10
            if (r10 == 0) goto L72
            int r9 = r10.LIZIZ
            int r0 = r10.LIZJ
            r1 = r21
            int r18 = r1 - r0
            r10.LIZJ = r1
            r17 = 1
            if (r18 == 0) goto L71
            X.13Yp<X.13aI> r0 = r2.LJ
            java.lang.Object[] r8 = r0.LIZJ
            long[] r7 = r0.LIZ
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L71
            r5 = 0
        L28:
            r2 = r7[r5]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 == 0) goto L6c
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = 0
        L42:
            if (r4 >= r11) goto L6a
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r2
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L66
            int r0 = r5 << 3
            int r0 = r0 + r4
            r1 = r8[r0]
            X.13aI r1 = (X.C20035213aI) r1
            int r0 = r1.LIZIZ
            if (r0 < r9) goto L66
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r10)
            if (r0 != 0) goto L66
            int r0 = r1.LIZIZ
            int r0 = r0 + r18
            if (r0 < 0) goto L66
            r1.LIZIZ = r0
        L66:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L42
        L6a:
            if (r11 != r12) goto L71
        L6c:
            if (r5 == r6) goto L71
            int r5 = r5 + 1
            goto L28
        L71:
            return r17
        L72:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZM.LIZIZ(int, int):boolean");
    }
}
