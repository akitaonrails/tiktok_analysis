package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoDTO;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0wFP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773330wFP extends AbstractC1773210wFD implements InterfaceC1771670wCj {
    public final Map<String, Object> LJJ;
    public int LJJI;

    public final Map<String, Object> LJIJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("data", this.LJJ);
        linkedHashMap.put("item_data", this.LJI);
        Map<String, Object> map = this.LJIJI;
        if (map != null) {
            linkedHashMap.put("extra", map);
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC1771670wCj
    public final ECMixMallItemInfoDTO LIZ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1771670wCj
    public final C1775190wIP LIZJ() {
        return this.LJII;
    }

    @Override // X.InterfaceC1771670wCj
    public final Map<String, Object> LJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1771670wCj
    public final Map<String, Object> LJFF() {
        return this.LJJ;
    }

    public C1773330wFP(Map<String, ? extends Object> map) {
        this.LJJ = map;
    }
}
