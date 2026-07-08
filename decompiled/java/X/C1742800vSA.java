package X;

import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BackgroundImage;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BannerData;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.ServerConfigStyle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vSA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1742800vSA implements InterfaceC0148002o {
    public final EnumC1742810vSB LL;
    public final BackgroundImage LLILLJJLI;
    public final C1742840vSE LLILLL;
    public final List<C1742910vSL> LLILZ;
    public final int LLILZIL;
    public final boolean LLILZLL;
    public final EnumC1742610vRr LLIZ;
    public final boolean LLIZLLLIL;
    public final ServerConfigStyle LLJ;
    public final BannerData LLJI;

    public C1742800vSA() {
        this(false, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1742800vSA)) {
            return false;
        }
        C1742800vSA c1742800vSA = (C1742800vSA) obj;
        return this.LL == c1742800vSA.LL && Intrinsics.LJFF(this.LLILLJJLI, c1742800vSA.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1742800vSA.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1742800vSA.LLILZ) && this.LLILZIL == c1742800vSA.LLILZIL && this.LLILZLL == c1742800vSA.LLILZLL && this.LLIZ == c1742800vSA.LLIZ && this.LLIZLLLIL == c1742800vSA.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1742800vSA.LLJ) && Intrinsics.LJFF(this.LLJI, c1742800vSA.LLJI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        BackgroundImage backgroundImage = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (backgroundImage == null ? 0 : backgroundImage.hashCode())) * 31;
        C1742840vSE c1742840vSE = this.LLILLL;
        int iHashCode3 = (((((((((((iHashCode2 + (c1742840vSE == null ? 0 : c1742840vSE.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + this.LLIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31;
        ServerConfigStyle serverConfigStyle = this.LLJ;
        int iHashCode4 = (iHashCode3 + (serverConfigStyle == null ? 0 : serverConfigStyle.hashCode())) * 31;
        BannerData bannerData = this.LLJI;
        return iHashCode4 + (bannerData != null ? bannerData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrendingListState(dataFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", backgroundImage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", playState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", trendingItems=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", lastBindPosition=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isMute=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", pageState=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", hasClaimVoucher=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", servConfig=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", bannerData=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1742800vSA(boolean z, int i) {
        EnumC1742810vSB enumC1742810vSB;
        C13BV c13bv;
        int i2;
        boolean z2 = z;
        if ((i & 1) != 0) {
            enumC1742810vSB = EnumC1742810vSB.INIT;
        } else {
            enumC1742810vSB = null;
        }
        if ((i & 8) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        if ((i & 16) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        this(enumC1742810vSB, null, null, c13bv, i2, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? EnumC1742610vRr.INIT : null, false, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1742800vSA(EnumC1742810vSB enumC1742810vSB, BackgroundImage backgroundImage, C1742840vSE c1742840vSE, List<? extends C1742910vSL> list, int i, boolean z, EnumC1742610vRr enumC1742610vRr, boolean z2, ServerConfigStyle serverConfigStyle, BannerData bannerData) {
        this.LL = enumC1742810vSB;
        this.LLILLJJLI = backgroundImage;
        this.LLILLL = c1742840vSE;
        this.LLILZ = list;
        this.LLILZIL = i;
        this.LLILZLL = z;
        this.LLIZ = enumC1742610vRr;
        this.LLIZLLLIL = z2;
        this.LLJ = serverConfigStyle;
        this.LLJI = bannerData;
    }

    public static C1742800vSA LIZ(C1742800vSA c1742800vSA, EnumC1742810vSB enumC1742810vSB, BackgroundImage backgroundImage, C1742840vSE c1742840vSE, List list, int i, boolean z, EnumC1742610vRr enumC1742610vRr, boolean z2, ServerConfigStyle serverConfigStyle, BannerData bannerData, int i2) {
        BannerData bannerData2 = bannerData;
        ServerConfigStyle serverConfigStyle2 = serverConfigStyle;
        boolean z3 = z2;
        EnumC1742610vRr enumC1742610vRr2 = enumC1742610vRr;
        boolean z4 = z;
        int i3 = i;
        List list2 = list;
        C1742840vSE c1742840vSE2 = c1742840vSE;
        BackgroundImage backgroundImage2 = backgroundImage;
        EnumC1742810vSB enumC1742810vSB2 = enumC1742810vSB;
        if ((i2 & 1) != 0) {
            enumC1742810vSB2 = c1742800vSA.LL;
        }
        if ((i2 & 2) != 0) {
            backgroundImage2 = c1742800vSA.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            c1742840vSE2 = c1742800vSA.LLILLL;
        }
        if ((i2 & 8) != 0) {
            list2 = c1742800vSA.LLILZ;
        }
        if ((i2 & 16) != 0) {
            i3 = c1742800vSA.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            z4 = c1742800vSA.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            enumC1742610vRr2 = c1742800vSA.LLIZ;
        }
        if ((i2 & 128) != 0) {
            z3 = c1742800vSA.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            serverConfigStyle2 = c1742800vSA.LLJ;
        }
        if ((i2 & 512) != 0) {
            bannerData2 = c1742800vSA.LLJI;
        }
        c1742800vSA.getClass();
        return new C1742800vSA(enumC1742810vSB2, backgroundImage2, c1742840vSE2, list2, i3, z4, enumC1742610vRr2, z3, serverConfigStyle2, bannerData2);
    }
}
