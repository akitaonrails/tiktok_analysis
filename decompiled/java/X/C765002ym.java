package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticItem;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SpendMoreForFree;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02ym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C765002ym {
    public final Price LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;
    public final List<String> LJIIJ;
    public final String LJIIJJI;
    public final SpendMoreForFree LJIIL;
    public final Map<String, String> LJIILIIL;
    public final String LJIILJJIL;
    public final LogisticItem LJIILL;
    public final Integer LJIILLIIL;
    public final Integer LJIIZILJ;
    public final LogisticTextDTO LJIJ;
    public final WarehouseTag LJIJI;
    public final LogisticLinkRichText LJIJJ;
    public final List<LogisticLinkRichText> LJIJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C765002ym)) {
            return false;
        }
        C765002ym c765002ym = (C765002ym) obj;
        return Intrinsics.LJFF(this.LIZ, c765002ym.LIZ) && Intrinsics.LJFF(this.LIZIZ, c765002ym.LIZIZ) && this.LIZJ == c765002ym.LIZJ && this.LIZLLL == c765002ym.LIZLLL && Intrinsics.LJFF(this.LJ, c765002ym.LJ) && Intrinsics.LJFF(this.LJFF, c765002ym.LJFF) && Intrinsics.LJFF(this.LJI, c765002ym.LJI) && Intrinsics.LJFF(this.LJII, c765002ym.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c765002ym.LJIIIIZZ) && this.LJIIIZ == c765002ym.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c765002ym.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c765002ym.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c765002ym.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c765002ym.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c765002ym.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c765002ym.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c765002ym.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c765002ym.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c765002ym.LJIJ) && Intrinsics.LJFF(this.LJIJI, c765002ym.LJIJI) && Intrinsics.LJFF(this.LJIJJ, c765002ym.LJIJJ) && Intrinsics.LJFF(this.LJIJJLI, c765002ym.LJIJJLI);
    }

    public C765002ym(Price price, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, String str6, boolean z3, List<String> list, String str7, SpendMoreForFree spendMoreForFree, Map<String, String> map, String str8, LogisticItem logisticItem, Integer num, Integer num2, LogisticTextDTO logisticTextDTO, WarehouseTag warehouseTag, LogisticLinkRichText logisticLinkRichText, List<LogisticLinkRichText> list2) {
        this.LIZ = price;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = z3;
        this.LJIIJ = list;
        this.LJIIJJI = str7;
        this.LJIIL = spendMoreForFree;
        this.LJIILIIL = map;
        this.LJIILJJIL = str8;
        this.LJIILL = logisticItem;
        this.LJIILLIIL = num;
        this.LJIIZILJ = num2;
        this.LJIJ = logisticTextDTO;
        this.LJIJI = warehouseTag;
        this.LJIJJ = logisticLinkRichText;
        this.LJIJJLI = list2;
    }
}
