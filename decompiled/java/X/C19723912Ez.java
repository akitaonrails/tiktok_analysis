package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS108S0201000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Ez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19723912Ez {
    public EnumC1857430yR3 LIZ;
    public EnumC2012107uR LIZIZ;
    public Integer LIZJ;
    public int LIZLLL;
    public C419910GdJ LJ;
    public Integer LJFF;
    public Integer LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public boolean LJIIIZ;
    public Function1<? super View, Unit> LJIIJ;
    public Function1<? super Function1<? super Boolean, Unit>, Unit> LJIIJJI;

    public C19723912Ez() {
        this(null, null, null, null, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19723912Ez)) {
            return false;
        }
        C19723912Ez c19723912Ez = (C19723912Ez) obj;
        return this.LIZ == c19723912Ez.LIZ && this.LIZIZ == c19723912Ez.LIZIZ && Intrinsics.LJFF(this.LIZJ, c19723912Ez.LIZJ) && this.LIZLLL == c19723912Ez.LIZLLL && Intrinsics.LJFF(this.LJ, c19723912Ez.LJ) && Intrinsics.LJFF(this.LJFF, c19723912Ez.LJFF) && Intrinsics.LJFF(this.LJI, c19723912Ez.LJI) && this.LJII == c19723912Ez.LJII && this.LJIIIIZZ == c19723912Ez.LJIIIIZZ && this.LJIIIZ == c19723912Ez.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c19723912Ez.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c19723912Ez.LJIIJJI);
    }

    public final int hashCode() {
        EnumC1857430yR3 enumC1857430yR3 = this.LIZ;
        int iHashCode = (enumC1857430yR3 == null ? 0 : enumC1857430yR3.hashCode()) * 31;
        EnumC2012107uR enumC2012107uR = this.LIZIZ;
        int iHashCode2 = (iHashCode + (enumC2012107uR == null ? 0 : enumC2012107uR.hashCode())) * 31;
        Integer num = this.LIZJ;
        int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.LIZLLL) * 31;
        C419910GdJ c419910GdJ = this.LJ;
        int iHashCode4 = (iHashCode3 + (c419910GdJ == null ? 0 : c419910GdJ.hashCode())) * 31;
        Integer num2 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LJI;
        int iHashCode6 = (((((((((iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + this.LJIIJ.hashCode()) * 31;
        Function1<? super Function1<? super Boolean, Unit>, Unit> function1 = this.LJIIJJI;
        return iHashCode6 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        return "ActionConfig(type=" + this.LIZ + ", style=" + this.LIZIZ + ", textRes=" + this.LIZJ + ", textColorRes=" + this.LIZLLL + ", icon=" + this.LJ + ", width=" + this.LJFF + ", height=" + this.LJI + ", iconHeightDp=" + this.LJII + ", iconWidthDp=" + this.LJIIIIZZ + ", isLoading=" + this.LJIIIZ + ", clickCallback=" + this.LJIIJ + ", subscriberActionState=" + this.LJIIJJI + ')';
    }

    public C19723912Ez(EnumC1857430yR3 enumC1857430yR3, Integer num, C419910GdJ c419910GdJ, AwS108S0201000_27 awS108S0201000_27, int i) {
        int i2;
        int i3;
        enumC1857430yR3 = (i & 1) != 0 ? null : enumC1857430yR3;
        num = (i & 4) != 0 ? null : num;
        if ((i & 8) != 0) {
            C1919007fQ.LIZ.getClass();
            if (C1919007fQ.LIZLLL()) {
                i2 = R.attr.a1i;
            } else {
                i2 = R.attr.a1h;
            }
        } else {
            i2 = 0;
        }
        c419910GdJ = (i & 16) != 0 ? null : c419910GdJ;
        if ((i & 128) != 0) {
            i3 = 24;
        } else {
            i3 = 0;
        }
        int i4 = (i & 256) == 0 ? 0 : 24;
        Function1<? super View, Unit> function1 = (i & 1024) != 0 ? AFwS273S0000000_29.get$arr$(348) : awS108S0201000_27;
        this.LIZ = enumC1857430yR3;
        this.LIZIZ = null;
        this.LIZJ = num;
        this.LIZLLL = i2;
        this.LJ = c419910GdJ;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = i3;
        this.LJIIIIZZ = i4;
        this.LJIIIZ = false;
        this.LJIIJ = function1;
        this.LJIIJJI = null;
    }
}
