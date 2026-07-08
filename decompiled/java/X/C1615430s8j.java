package X;

import com.ss.android.ugc.aweme.behavior.popup.MarketplacePopupParams;
import com.ss.android.ugc.aweme.components.model.Component;
import com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionWithPrice;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1615430s8j {
    public final String LIZ;
    public final List<Component> LIZIZ;
    public final EnumC1410805fe LIZJ;
    public final PurchaseOptionWithPrice LIZLLL;
    public final List<PurchaseOptionWithPrice> LJ;
    public final MarketplacePopupParams LJFF;
    public final Boolean LJI;
    public final String LJII;
    public final C1615420s8i LJIIIIZZ;

    public C1615430s8j() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1615430s8j)) {
            return false;
        }
        C1615430s8j c1615430s8j = (C1615430s8j) obj;
        return Intrinsics.LJFF(this.LIZ, c1615430s8j.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1615430s8j.LIZIZ) && this.LIZJ == c1615430s8j.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1615430s8j.LIZLLL) && Intrinsics.LJFF(this.LJ, c1615430s8j.LJ) && Intrinsics.LJFF(this.LJFF, c1615430s8j.LJFF) && Intrinsics.LJFF(this.LJI, c1615430s8j.LJI) && Intrinsics.LJFF(this.LJII, c1615430s8j.LJII) && Intrinsics.LJFF(null, null) && Intrinsics.LJFF(this.LJIIIIZZ, c1615430s8j.LJIIIIZZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1615430s8j(int i) {
        C13BV c13bv = C13BV.INSTANCE;
        this("", c13bv, EnumC1410805fe.LOADING, null, c13bv, null, Boolean.FALSE, "", new C1615420s8i(0));
    }

    public C1615430s8j(String str, List list, EnumC1410805fe enumC1410805fe, PurchaseOptionWithPrice purchaseOptionWithPrice, List list2, MarketplacePopupParams marketplacePopupParams, Boolean bool, String str2, C1615420s8i c1615420s8i) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = enumC1410805fe;
        this.LIZLLL = purchaseOptionWithPrice;
        this.LJ = list2;
        this.LJFF = marketplacePopupParams;
        this.LJI = bool;
        this.LJII = str2;
        this.LJIIIIZZ = c1615420s8i;
    }

    public static C1615430s8j LIZ(C1615430s8j c1615430s8j, String str, List list, EnumC1410805fe enumC1410805fe, PurchaseOptionWithPrice purchaseOptionWithPrice, List list2, MarketplacePopupParams marketplacePopupParams, Boolean bool, String str2, C1615420s8i c1615420s8i, int i) {
        C1615420s8i c1615420s8i2 = c1615420s8i;
        String str3 = str2;
        Boolean bool2 = bool;
        MarketplacePopupParams marketplacePopupParams2 = marketplacePopupParams;
        List list3 = list2;
        PurchaseOptionWithPrice purchaseOptionWithPrice2 = purchaseOptionWithPrice;
        EnumC1410805fe enumC1410805fe2 = enumC1410805fe;
        List list4 = list;
        String str4 = str;
        if ((i & 1) != 0) {
            str4 = c1615430s8j.LIZ;
        }
        if ((i & 2) != 0) {
            list4 = c1615430s8j.LIZIZ;
        }
        if ((i & 4) != 0) {
            enumC1410805fe2 = c1615430s8j.LIZJ;
        }
        if ((i & 8) != 0) {
            purchaseOptionWithPrice2 = c1615430s8j.LIZLLL;
        }
        if ((i & 16) != 0) {
            list3 = c1615430s8j.LJ;
        }
        if ((i & 32) != 0) {
            marketplacePopupParams2 = c1615430s8j.LJFF;
        }
        if ((i & 64) != 0) {
            bool2 = c1615430s8j.LJI;
        }
        if ((i & 128) != 0) {
            str3 = c1615430s8j.LJII;
        }
        if ((i & 256) != 0) {
            c1615430s8j.getClass();
        }
        if ((i & 512) != 0) {
            c1615420s8i2 = c1615430s8j.LJIIIIZZ;
        }
        c1615430s8j.getClass();
        return new C1615430s8j(str4, list4, enumC1410805fe2, purchaseOptionWithPrice2, list3, marketplacePopupParams2, bool2, str3, c1615420s8i2);
    }
}
