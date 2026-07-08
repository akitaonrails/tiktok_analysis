package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoDTO;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0wFQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773340wFQ extends AbstractC1773210wFD implements InterfaceC1771670wCj {
    public final Map<String, Object> LJJ;
    public int LJJI;

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

    public C1773340wFQ(Map<String, ? extends Object> map) {
        this.LJJ = map;
    }

    public final Map<String, Object> LJIJ(final InterfaceC599750Nfh interfaceC599750Nfh) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("data", this.LJJ), new Pair("item_data", this.LJI), new Pair("extra", this.LJIJI));
        C1168270gVV c1168270gVV = C1168270gVV.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097608Jq.LJI(new Pair("data", mapLJIIJ)));
        linkedHashMap.put("globalContext", new InterfaceC332330D1b() { // from class: X.0wFS
            @Override // X.InterfaceC332330D1b
            public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
                boolean z;
                String strLJIIJ;
                if (list != null && !list.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z || (strLJIIJ = C1337850kv1.LJIIJ(ListProtector.get(list, 0))) == null) {
                    return null;
                }
                return interfaceC599750Nfh.LIZLLL(strLJIIJ, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            }
        });
        linkedHashMap.put("traceParams", new InterfaceC332330D1b() { // from class: X.0wFT
            @Override // X.InterfaceC332330D1b
            public final Object LIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
                boolean z;
                String strLJIIJ;
                if (list != null && !list.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z || (strLJIIJ = C1337850kv1.LJIIJ(ListProtector.get(list, 0))) == null) {
                    return null;
                }
                return this.LIZ.LJII.LIZIZ.LIZIZ(strLJIIJ);
            }
        });
        return linkedHashMap;
    }
}
