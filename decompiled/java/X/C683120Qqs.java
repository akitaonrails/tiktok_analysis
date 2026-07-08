package X;

import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683120Qqs implements InterfaceC2455009jg {
    public final InterfaceC2455109jh LIZ;
    public final EnumC682970Qqd LIZIZ;
    public final EnumC682940Qqa LIZJ;
    public final Integer LIZLLL;
    public final Drawable LJ;
    public final Integer LJFF;
    public final boolean LJI;
    public final Integer LJII;
    public final EnumC2482509o7 LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C683120Qqs)) {
            return false;
        }
        C683120Qqs c683120Qqs = (C683120Qqs) obj;
        return Intrinsics.LJFF(this.LIZ, c683120Qqs.LIZ) && this.LIZIZ == c683120Qqs.LIZIZ && this.LIZJ == c683120Qqs.LIZJ && Intrinsics.LJFF(this.LIZLLL, c683120Qqs.LIZLLL) && Intrinsics.LJFF(this.LJ, c683120Qqs.LJ) && Intrinsics.LJFF(this.LJFF, c683120Qqs.LJFF) && this.LJI == c683120Qqs.LJI && Intrinsics.LJFF(this.LJII, c683120Qqs.LJII) && this.LJIIIIZZ == c683120Qqs.LJIIIIZZ;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Integer num = this.LIZLLL;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Drawable drawable = this.LJ;
        int iHashCode3 = (iHashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Integer num2 = this.LJFF;
        int iHashCode4 = (((iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        Integer num3 = this.LJII;
        return ((iHashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Standard(imageSource=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imageShape=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", imageDisplayType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", failureImage=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", paddingDp=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", hasDefaultBorder=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", borderColor=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", size=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC2455009jg
    public final EnumC2482509o7 getSize() {
        return this.LJIIIIZZ;
    }

    public C683120Qqs(InterfaceC2455109jh interfaceC2455109jh, EnumC682970Qqd enumC682970Qqd, EnumC682940Qqa enumC682940Qqa, Integer num, TuxIconDrawable tuxIconDrawable, Integer num2, boolean z, Integer num3, EnumC2482509o7 enumC2482509o7, int i) {
        enumC682970Qqd = (i & 2) != 0 ? EnumC682970Qqd.SQUARE : enumC682970Qqd;
        enumC682940Qqa = (i & 4) != 0 ? EnumC682940Qqa.SCALE_FILL : enumC682940Qqa;
        num = (i & 8) != 0 ? null : num;
        tuxIconDrawable = (i & 16) != 0 ? null : tuxIconDrawable;
        num2 = (i & 32) != 0 ? null : num2;
        z = (i & 64) != 0 ? true : z;
        num3 = (i & 128) != 0 ? null : num3;
        enumC2482509o7 = (i & 256) != 0 ? EnumC2482509o7.NORMAL : enumC2482509o7;
        this.LIZ = interfaceC2455109jh;
        this.LIZIZ = enumC682970Qqd;
        this.LIZJ = enumC682940Qqa;
        this.LIZLLL = num;
        this.LJ = tuxIconDrawable;
        this.LJFF = num2;
        this.LJI = z;
        this.LJII = num3;
        this.LJIIIIZZ = enumC2482509o7;
    }
}
