package X;

import com.google.gson.h;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.schema.ECMixMallSchemaDataItemDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallStyleDTO;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wFD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1773210wFD implements InterfaceC1774050wGZ<AbstractC1773210wFD> {
    public String LIZIZ;
    public String LIZJ;
    public int LIZLLL;
    public int LJ;
    public ECMixMallStyleDTO LJFF;
    public Map<String, ECMixMallSchemaDataItemDTO> LJIIIIZZ;
    public ECMixMallItemInfoDTO LJIIIZ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public h LJIILJJIL;
    public List<? extends Map<String, ? extends Object>> LJIILL;
    public boolean LJIILLIIL;
    public C1774380wH6 LJIIZILJ;
    public boolean LJIJ;
    public Map<String, Object> LJIJI;
    public AbstractC1773210wFD LJIJJ;
    public AbstractC1773210wFD LJIJJLI;
    public String LJIL;
    public String LIZ = "default_item_id";
    public final Map<String, Object> LJI = new LinkedHashMap();
    public final C1775190wIP LJII = new C1775190wIP();
    public int LJIIJ = 1;

    public final boolean LJIIL() {
        ECMixMallItemInfoDTO eCMixMallItemInfoDTO = this.LJIIIZ;
        return (eCMixMallItemInfoDTO == null || eCMixMallItemInfoDTO.gecCard == null) ? false : true;
    }

    public final boolean LJIILIIL() {
        ECMixMallItemInfoDTO eCMixMallItemInfoDTO = this.LJIIIZ;
        return (eCMixMallItemInfoDTO == null || eCMixMallItemInfoDTO.lynx == null) ? false : true;
    }

    public final String toString() {
        return LJIIIZ();
    }

    public int LJIIIIZZ() {
        return this.LJIIJ;
    }

    public String LJIIIZ() {
        return this.LIZ;
    }

    public String LJIIJ() {
        return this.LIZIZ;
    }

    public String LJIIJJI() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1774050wGZ
    /* JADX INFO: renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public boolean LIZIZ(AbstractC1773210wFD abstractC1773210wFD) {
        if (Intrinsics.LJFF(this, abstractC1773210wFD) && !abstractC1773210wFD.LJIJ) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1774050wGZ
    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public boolean LIZLLL(AbstractC1773210wFD abstractC1773210wFD) {
        return Intrinsics.LJFF(LJIIIZ(), abstractC1773210wFD.LJIIIZ());
    }

    public void LJIILJJIL(int i) {
        this.LJIIJ = i;
    }

    public void LJIILL(String str) {
        this.LIZ = str;
    }

    public void LJIILLIIL(String str) {
        this.LIZIZ = str;
    }

    public void LJIIZILJ(String str) {
        this.LIZJ = str;
    }
}
