package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS286S0000000_3;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ryj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609230ryj implements InterfaceC1609020ryO {
    public final String LIZ;
    public final Integer LIZIZ;
    public final Function1<Float, Drawable> LIZJ;
    public final int LIZLLL;
    public final Function1<C1608740rxw, Integer> LJ;
    public final Integer LJFF;
    public final Function2<C1608740rxw, Float, Integer> LJI;
    public final Function2<C1608740rxw, Float, Integer> LJII;
    public final Function2<C1608740rxw, Float, Integer> LJIIIIZZ;
    public final Function2<C1608740rxw, Float, Integer> LJIIIZ;
    public final int LJIIJ;
    public final Integer LJIIJJI;
    public final TextUtils.TruncateAt LJIIL;
    public final InterfaceC1609270ryn LJIILIIL;
    public final boolean LJIILJJIL;
    public final C1608470rxV LJIILL;
    public final boolean LJIILLIIL;
    public final Function1<C1608740rxw, Float> LJIIZILJ;
    public final Integer LJIJ;
    public final String LJIJI;

    public C1609230ryj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1609230ryj)) {
            return false;
        }
        C1609230ryj c1609230ryj = (C1609230ryj) obj;
        return Intrinsics.LJFF(this.LIZ, c1609230ryj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1609230ryj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1609230ryj.LIZJ) && this.LIZLLL == c1609230ryj.LIZLLL && Intrinsics.LJFF(this.LJ, c1609230ryj.LJ) && Intrinsics.LJFF(this.LJFF, c1609230ryj.LJFF) && Intrinsics.LJFF(this.LJI, c1609230ryj.LJI) && Intrinsics.LJFF(this.LJII, c1609230ryj.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1609230ryj.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1609230ryj.LJIIIZ) && this.LJIIJ == c1609230ryj.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c1609230ryj.LJIIJJI) && this.LJIIL == c1609230ryj.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c1609230ryj.LJIILIIL) && this.LJIILJJIL == c1609230ryj.LJIILJJIL && Intrinsics.LJFF(this.LJIILL, c1609230ryj.LJIILL) && this.LJIILLIIL == c1609230ryj.LJIILLIIL && Intrinsics.LJFF(this.LJIIZILJ, c1609230ryj.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c1609230ryj.LJIJ) && Intrinsics.LJFF(this.LJIJI, c1609230ryj.LJIJI);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Function1<Float, Drawable> function1 = this.LIZJ;
        int iHashCode3 = (((((iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31;
        Integer num2 = this.LJFF;
        int iHashCode4 = (((((((((((iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ) * 31;
        Integer num3 = this.LJIIJJI;
        int iHashCode5 = (((((((((((iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL.hashCode()) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31) + this.LJIILL.hashCode()) * 31) + C786410Ut5.Z2(this.LJIILLIIL)) * 31;
        Function1<C1608740rxw, Float> function12 = this.LJIIZILJ;
        int iHashCode6 = (iHashCode5 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Integer num4 = this.LJIJ;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.LJIJI;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "AvatarTextUIData(text=" + this.LIZ + ", textRes=" + this.LIZIZ + ", backGround=" + this.LIZJ + ", backgroundRes=" + this.LIZLLL + ", textFont=" + this.LJ + ", textColor=" + this.LJFF + ", paddingStart=" + this.LJI + ", paddingEnd=" + this.LJII + ", paddingTop=" + this.LJIIIIZZ + ", paddingBottom=" + this.LJIIIZ + ", maxLine=" + this.LJIIJ + ", maxWidth=" + this.LJIIJJI + ", ellipsize=" + this.LJIIL + ", position=" + this.LJIILIIL + ", autoRTL=" + this.LJIILJJIL + ", size=" + this.LJIILL + ", hasHollowOutline=" + this.LJIILLIIL + ", outlineWidth=" + this.LJIIZILJ + ", outlineRes=" + this.LJIJ + ", identifier=" + this.LJIJI + ')';
    }

    @Override // X.InterfaceC1609020ryO
    public final InterfaceC1609270ryn getPosition() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1609020ryO
    public final C1608470rxV getSize() {
        return this.LJIILL;
    }

    public C1609230ryj(Integer num, int i, AwS603S0100000_24 awS603S0100000_24, Integer num2, AwS638S0100000_24 awS638S0100000_24, AwS638S0100000_24 awS638S0100000_242, C1557920qdy c1557920qdy, C1608470rxV c1608470rxV) {
        AFwS286S0000000_3 aFwS286S0000000_3 = AFwS286S0000000_3.get$arr$(0);
        AFwS286S0000000_3 aFwS286S0000000_32 = AFwS286S0000000_3.get$arr$(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        this.LIZ = null;
        this.LIZIZ = num;
        this.LIZJ = null;
        this.LIZLLL = i;
        this.LJ = awS603S0100000_24;
        this.LJFF = num2;
        this.LJI = awS638S0100000_24;
        this.LJII = awS638S0100000_242;
        this.LJIIIIZZ = aFwS286S0000000_3;
        this.LJIIIZ = aFwS286S0000000_32;
        this.LJIIJ = 1;
        this.LJIIJJI = null;
        this.LJIIL = truncateAt;
        this.LJIILIIL = c1557920qdy;
        this.LJIILJJIL = false;
        this.LJIILL = c1608470rxV;
        this.LJIILLIIL = true;
        this.LJIIZILJ = null;
        this.LJIJ = null;
        this.LJIJI = null;
    }
}
