package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I3w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460460I3w implements InterfaceC460950I5t {
    public final InterfaceC460300I3g LIZIZ;
    public final C0I5E LIZJ;
    public final EnumC460470I3x LIZLLL;
    public final InterfaceC460900I5o LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LIZ = R.drawable.c_l;
    public final boolean LJIIIIZZ = false;
    public final Integer LJIIIZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C460460I3w)) {
            return false;
        }
        C460460I3w c460460I3w = (C460460I3w) obj;
        return this.LIZ == c460460I3w.LIZ && Intrinsics.LJFF(this.LIZIZ, c460460I3w.LIZIZ) && this.LIZJ == c460460I3w.LIZJ && this.LIZLLL == c460460I3w.LIZLLL && Intrinsics.LJFF(this.LJ, c460460I3w.LJ) && this.LJFF == c460460I3w.LJFF && this.LJI == c460460I3w.LJI && this.LJII == c460460I3w.LJII && this.LJIIIIZZ == c460460I3w.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c460460I3w.LJIIIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        InterfaceC460900I5o interfaceC460900I5o = this.LJ;
        int iHashCode2 = (((((((((iHashCode + (interfaceC460900I5o == null ? 0 : interfaceC460900I5o.hashCode())) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        Integer num = this.LJIIIZ;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowDrawableRes(drawableRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", buttonStyle=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", imageStyle=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mediaIconConfig=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", radius=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", isFlip=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", overlayDrawableRes=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC460950I5t
    public final Integer LJIIJJI() {
        return Integer.valueOf(this.LJII);
    }

    @Override // X.InterfaceC460950I5t
    public final Integer LJIIL() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC460950I5t
    public final boolean LJIILIIL() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC460950I5t
    public final EnumC460470I3x LJIILJJIL() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC460950I5t
    public final InterfaceC460900I5o LJIILL() {
        return this.LJ;
    }

    @Override // X.InterfaceC460950I5t
    public final C0I5E LJIILLIIL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC460950I5t
    public final int getHeight() {
        return this.LJFF;
    }

    @Override // X.InterfaceC460950I5t
    public final int getWidth() {
        return this.LJI;
    }

    public C460460I3w(InterfaceC460300I3g interfaceC460300I3g, C0I5E c0i5e, EnumC460470I3x enumC460470I3x, InterfaceC460900I5o interfaceC460900I5o, int i, int i2, int i3) {
        this.LIZIZ = interfaceC460300I3g;
        this.LIZJ = c0i5e;
        this.LIZLLL = enumC460470I3x;
        this.LJ = interfaceC460900I5o;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = i3;
    }
}
