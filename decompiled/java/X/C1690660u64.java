package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u64, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690660u64 implements InterfaceC1690800u6I, InterfaceC1690350u5Z {
    public final List<C1690300u5U> LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final EnumC1684030tvN LJ;
    public final int LJFF;
    public final int LJI;
    public final boolean LJII;
    public final int LJIIIIZZ;
    public final C1690300u5U LJIIIZ;
    public final C1690300u5U LJIIJ;
    public final float LJIIJJI;
    public final int LJIIL;
    public final boolean LJIILIIL;
    public final InterfaceC1675650thr LJIILJJIL;
    public final InterfaceC1690350u5Z LJIILL;
    public final boolean LJIILLIIL;
    public final List<C1690300u5U> LJIIZILJ;
    public final List<C1690300u5U> LJIJ;
    public final InterfaceC497601wk LJIJI;

    @Override // X.InterfaceC1690350u5Z
    public final Map<C115T, Integer> LJIILL() {
        return this.LJIILL.LJIILL();
    }

    @Override // X.InterfaceC1690350u5Z
    public final void LJIILLIIL() {
        this.LJIILL.LJIILLIIL();
    }

    @Override // X.InterfaceC1690350u5Z
    public final Function1<Object, Unit> LJIIZILJ() {
        return this.LJIILL.LJIIZILJ();
    }

    @Override // X.InterfaceC1690350u5Z
    public final int getHeight() {
        return this.LJIILL.getHeight();
    }

    @Override // X.InterfaceC1690350u5Z
    public final int getWidth() {
        return this.LJIILL.getWidth();
    }

    @Override // X.InterfaceC1690800u6I
    public final int LIZJ() {
        return -this.LJFF;
    }

    @Override // X.InterfaceC1690800u6I
    public final long LIZ() {
        int width = getWidth();
        return (((long) getHeight()) & 4294967295L) | (((long) width) << 32);
    }

    @Override // X.InterfaceC1690800u6I
    public final int LIZIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1690800u6I
    public final int LIZLLL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1690800u6I
    public final int LJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1690800u6I
    public final int LJFF() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1690800u6I
    public final int LJI() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1690800u6I
    public final InterfaceC1675650thr LJII() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC1690800u6I
    public final int LJIIIIZZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1690800u6I
    public final List<C1690300u5U> LJIIIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1690800u6I
    public final EnumC1684030tvN getOrientation() {
        return this.LJ;
    }

    @Override // X.InterfaceC1690800u6I
    public final boolean getReverseLayout() {
        return this.LJII;
    }

    public final C1690660u64 LJIIJ(int i) {
        int i2;
        boolean z;
        int i3 = this.LIZIZ + this.LIZJ;
        if (!this.LJIILLIIL && !this.LIZ.isEmpty() && this.LJIIIZ != null && (i2 = this.LJIIL - i) >= 0 && i2 < i3) {
            float f = i / i3;
            float f2 = this.LJIIJJI - f;
            if (this.LJIIJ != null && f2 < 0.5f && f2 > -0.5f) {
                C1690300u5U c1690300u5U = (C1690300u5U) C13LP.LJJJJZI(this.LIZ);
                C1690300u5U c1690300u5U2 = (C1690300u5U) C13LP.LJJLIIIJJI(this.LIZ);
                if (i >= 0 ? Math.min(this.LJFF - c1690300u5U.LJIIL, this.LJI - c1690300u5U2.LJIIL) > i : Math.min((c1690300u5U.LJIIL + i3) - this.LJFF, (c1690300u5U2.LJIIL + i3) - this.LJI) > (-i)) {
                    List<C1690300u5U> list = this.LIZ;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((C1690300u5U) ListProtector.get(list, i4)).LIZ(i);
                    }
                    List<C1690300u5U> list2 = this.LJIIZILJ;
                    int size2 = list2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        ((C1690300u5U) ListProtector.get(list2, i5)).LIZ(i);
                    }
                    List<C1690300u5U> list3 = this.LJIJ;
                    int size3 = list3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        ((C1690300u5U) ListProtector.get(list3, i6)).LIZ(i);
                    }
                    List<C1690300u5U> list4 = this.LIZ;
                    int i7 = this.LIZIZ;
                    int i8 = this.LIZJ;
                    int i9 = this.LIZLLL;
                    EnumC1684030tvN enumC1684030tvN = this.LJ;
                    int i10 = this.LJFF;
                    int i11 = this.LJI;
                    boolean z2 = this.LJII;
                    int i12 = this.LJIIIIZZ;
                    C1690300u5U c1690300u5U3 = this.LJIIIZ;
                    C1690300u5U c1690300u5U4 = this.LJIIJ;
                    float f3 = this.LJIIJJI - f;
                    int i13 = this.LJIIL - i;
                    if (!this.LJIILIIL && i <= 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    return new C1690660u64(list4, i7, i8, i9, enumC1684030tvN, i10, i11, z2, i12, c1690300u5U3, c1690300u5U4, f3, i13, z, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1690660u64(C13BV c13bv, int i, int i2, int i3, EnumC1684030tvN enumC1684030tvN, int i4, int i5, int i6, InterfaceC1675650thr interfaceC1675650thr, InterfaceC1690350u5Z interfaceC1690350u5Z, InterfaceC497601wk interfaceC497601wk) {
        C13BV c13bv2 = C13BV.INSTANCE;
        this(c13bv, i, i2, i3, enumC1684030tvN, i4, i5, false, i6, null, null, 0.0f, 0, false, interfaceC1675650thr, interfaceC1690350u5Z, false, c13bv2, c13bv2, interfaceC497601wk);
    }

    public C1690660u64(List<C1690300u5U> list, int i, int i2, int i3, EnumC1684030tvN enumC1684030tvN, int i4, int i5, boolean z, int i6, C1690300u5U c1690300u5U, C1690300u5U c1690300u5U2, float f, int i7, boolean z2, InterfaceC1675650thr interfaceC1675650thr, InterfaceC1690350u5Z interfaceC1690350u5Z, boolean z3, List<C1690300u5U> list2, List<C1690300u5U> list3, InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = enumC1684030tvN;
        this.LJFF = i4;
        this.LJI = i5;
        this.LJII = z;
        this.LJIIIIZZ = i6;
        this.LJIIIZ = c1690300u5U;
        this.LJIIJ = c1690300u5U2;
        this.LJIIJJI = f;
        this.LJIIL = i7;
        this.LJIILIIL = z2;
        this.LJIILJJIL = interfaceC1675650thr;
        this.LJIILL = interfaceC1690350u5Z;
        this.LJIILLIIL = z3;
        this.LJIIZILJ = list2;
        this.LJIJ = list3;
        this.LJIJI = interfaceC497601wk;
    }
}
