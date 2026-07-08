package X;

import com.ss.android.ugc.aweme.tako.multiconversation.sug.config.TakoSugTitleText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ySf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858430ySf {
    public static final C1858430ySf LJIIIZ = new C1858430ySf(false, false, EnumC1858470ySj.GREY_SINGLE_LINE, EnumC2012407uU.OLD_STYLE, EnumC993120bx0.FULL_WIDTH, true, false, new TakoSugTitleText(null, null, null), false);
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final EnumC1858470ySj LIZJ;
    public final EnumC2012407uU LIZLLL;
    public final EnumC993120bx0 LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final TakoSugTitleText LJII;
    public final boolean LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1858430ySf)) {
            return false;
        }
        C1858430ySf c1858430ySf = (C1858430ySf) obj;
        return this.LIZ == c1858430ySf.LIZ && this.LIZIZ == c1858430ySf.LIZIZ && this.LIZJ == c1858430ySf.LIZJ && this.LIZLLL == c1858430ySf.LIZLLL && this.LJ == c1858430ySf.LJ && this.LJFF == c1858430ySf.LJFF && this.LJI == c1858430ySf.LJI && Intrinsics.LJFF(this.LJII, c1858430ySf.LJII) && this.LJIIIIZZ == c1858430ySf.LJIIIIZZ;
    }

    public final int hashCode() {
        return (((((((((((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FirstRoundSugUiStyle(enabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", followKeyboard=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", titleStyle=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", itemStyle=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", itemWidthMode=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showArrow=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", animateOnFirstShow=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", titleText=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", goneTitle=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        if (this.LIZJ != EnumC1858470ySj.BLACK_DOUBLE_LINE) {
            return false;
        }
        C1863130yaF.LIZ.getClass();
        return (C1863130yaF.LIZ() || this.LJIIIIZZ) ? false : true;
    }

    public final boolean LIZIZ() {
        if (!this.LIZ) {
            return false;
        }
        EnumC993120bx0 enumC993120bx0 = this.LJ;
        return enumC993120bx0 == EnumC993120bx0.WRAP_CONTENT_HIGH || enumC993120bx0 == EnumC993120bx0.WRAP_CONTENT_LOW;
    }

    public C1858430ySf(boolean z, boolean z2, EnumC1858470ySj enumC1858470ySj, EnumC2012407uU enumC2012407uU, EnumC993120bx0 enumC993120bx0, boolean z3, boolean z4, TakoSugTitleText takoSugTitleText, boolean z5) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = enumC1858470ySj;
        this.LIZLLL = enumC2012407uU;
        this.LJ = enumC993120bx0;
        this.LJFF = z3;
        this.LJI = z4;
        this.LJII = takoSugTitleText;
        this.LJIIIIZZ = z5;
    }
}
