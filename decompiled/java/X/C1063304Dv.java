package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Dv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1063304Dv {
    public final int LIZ;
    public final int LIZIZ;
    public final SellerInfo LIZJ;
    public final Boolean LIZLLL;
    public final BuyButton LJ;
    public final boolean LJFF;
    public final String LJI;
    public final Map<String, String> LJII;
    public final BuyButton LJIIIIZZ;
    public final AddToCartButton LJIIIZ;
    public final ProductUnavailableInfo LJIIJ;
    public final Announcement LJIIJJI;
    public final Integer LJIIL;
    public final String LJIILIIL;
    public final Integer LJIILJJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1063304Dv)) {
            return false;
        }
        C1063304Dv c1063304Dv = (C1063304Dv) obj;
        return this.LIZ == c1063304Dv.LIZ && this.LIZIZ == c1063304Dv.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1063304Dv.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1063304Dv.LIZLLL) && Intrinsics.LJFF(this.LJ, c1063304Dv.LJ) && this.LJFF == c1063304Dv.LJFF && Intrinsics.LJFF(this.LJI, c1063304Dv.LJI) && Intrinsics.LJFF(this.LJII, c1063304Dv.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1063304Dv.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1063304Dv.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1063304Dv.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1063304Dv.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1063304Dv.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1063304Dv.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1063304Dv.LJIILJJIL);
    }

    public C1063304Dv(int i, int i2, SellerInfo sellerInfo, Boolean bool, BuyButton buyButton, boolean z, String str, Map<String, String> map, BuyButton buyButton2, AddToCartButton addToCartButton, ProductUnavailableInfo productUnavailableInfo, Announcement announcement, Integer num, String str2, Integer num2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = sellerInfo;
        this.LIZLLL = bool;
        this.LJ = buyButton;
        this.LJFF = z;
        this.LJI = str;
        this.LJII = map;
        this.LJIIIIZZ = buyButton2;
        this.LJIIIZ = addToCartButton;
        this.LJIIJ = productUnavailableInfo;
        this.LJIIJJI = announcement;
        this.LJIIL = num;
        this.LJIILIIL = str2;
        this.LJIILJJIL = num2;
    }
}
