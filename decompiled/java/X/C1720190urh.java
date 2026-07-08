package X;

import com.bytedance.pipo.stellar.base.model.StellarTooltipDO;
import com.bytedance.pipo.stellar.base.resourceloader.StellarStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0urh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720190urh implements InterfaceC0148002o {
    public final AbstractC1623806Xk<C1720310urt> LL;
    public final StellarStyle LLILLJJLI;
    public final boolean LLILLL;
    public final C1720260uro LLILZ;
    public final boolean LLILZIL;
    public final StellarTooltipDO LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;

    public C1720190urh() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1720190urh)) {
            return false;
        }
        C1720190urh c1720190urh = (C1720190urh) obj;
        return Intrinsics.LJFF(this.LL, c1720190urh.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1720190urh.LLILLJJLI) && this.LLILLL == c1720190urh.LLILLL && Intrinsics.LJFF(this.LLILZ, c1720190urh.LLILZ) && this.LLILZIL == c1720190urh.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1720190urh.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1720190urh.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1720190urh.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        StellarStyle stellarStyle = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (stellarStyle == null ? 0 : stellarStyle.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        C1720260uro c1720260uro = this.LLILZ;
        int iHashCode3 = (((iHashCode2 + (c1720260uro == null ? 0 : c1720260uro.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        StellarTooltipDO stellarTooltipDO = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (stellarTooltipDO == null ? 0 : stellarTooltipDO.hashCode())) * 31;
        String str = this.LLIZ;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLIZLLLIL;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StellarViewState(renderTree=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", style=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isRefreshing=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", navBar=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", showBalance=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", tooltipDO=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", verifyStatus=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", verifyInfo=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1720190urh(int i) {
        this(C491101vh.LIZ, null, false, null, true, null, null, null);
    }

    public C1720190urh(AbstractC1623806Xk<C1720310urt> abstractC1623806Xk, StellarStyle stellarStyle, boolean z, C1720260uro c1720260uro, boolean z2, StellarTooltipDO stellarTooltipDO, String str, String str2) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = stellarStyle;
        this.LLILLL = z;
        this.LLILZ = c1720260uro;
        this.LLILZIL = z2;
        this.LLILZLL = stellarTooltipDO;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
    }

    public static C1720190urh LIZ(C1720190urh c1720190urh, AbstractC1623806Xk abstractC1623806Xk, StellarStyle stellarStyle, boolean z, C1720260uro c1720260uro, boolean z2, StellarTooltipDO stellarTooltipDO, String str, int i) {
        String str2;
        String str3 = str;
        StellarTooltipDO stellarTooltipDO2 = stellarTooltipDO;
        boolean z3 = z2;
        C1720260uro c1720260uro2 = c1720260uro;
        boolean z4 = z;
        StellarStyle stellarStyle2 = stellarStyle;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk2 = c1720190urh.LL;
        }
        if ((i & 2) != 0) {
            stellarStyle2 = c1720190urh.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z4 = c1720190urh.LLILLL;
        }
        if ((i & 8) != 0) {
            c1720260uro2 = c1720190urh.LLILZ;
        }
        if ((i & 16) != 0) {
            z3 = c1720190urh.LLILZIL;
        }
        if ((i & 32) != 0) {
            stellarTooltipDO2 = c1720190urh.LLILZLL;
        }
        if ((i & 64) != 0) {
            str2 = c1720190urh.LLIZ;
        } else {
            str2 = null;
        }
        if ((i & 128) != 0) {
            str3 = c1720190urh.LLIZLLLIL;
        }
        c1720190urh.getClass();
        return new C1720190urh(abstractC1623806Xk2, stellarStyle2, z4, c1720260uro2, z3, stellarTooltipDO2, str2, str3);
    }
}
