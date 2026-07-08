package X;

import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveDaInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.17xG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21196817xG {
    public final AbstractC21194117wp LIZ;
    public InterfaceC21201017xw LIZIZ;
    public final C21194917wx LIZJ;

    public abstract void LIZ();

    public abstract void LIZIZ(String str);

    public abstract void LIZLLL();

    public abstract void LJ(OecInitData oecInitData);

    public abstract void LJFF(PopProductResp popProductResp, boolean z, boolean z2, boolean z3);

    public abstract void LJI();

    public abstract void LJII();

    public abstract void LJIIIIZZ(String str);

    public abstract void LJIIIZ();

    public abstract void LJIIJ();

    public void LJIIJJI(String str, String str2) {
    }

    public final Map<String, String> LIZJ() {
        LiveDaInfo liveDaInfo;
        HashMap<String, String> map;
        Map<String, ? extends Object> map2;
        BcmStandardTrack bcmStandardTrack;
        Map<String, String> map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> mapLJLLL = ((AbstractC21197217xK) this.LIZ.LJJIJIIJI()).LJLLL("atmosphere_layout");
        if (mapLJLLL != null) {
            linkedHashMap.putAll(mapLJLLL);
        }
        Map<String, String> mapLJLLL2 = ((AbstractC21197217xK) this.LIZ.LJJIJIIJI()).LJLLL("promotion_items");
        if (mapLJLLL2 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C125400do.LIZ(mapLJLLL2, ((AbstractC21197217xK) this.LIZ.LJJIJIIJI()).LJLLL("second_promotion_items")));
            linkedHashMap2.remove("label_type");
            linkedHashMap.putAll(linkedHashMap2);
        }
        Map<String, String> mapLJLLL3 = ((AbstractC21197217xK) this.LIZ.LJJIJIIJI()).LJLLL("selling_point_items");
        if (mapLJLLL3 != null) {
            linkedHashMap.putAll(mapLJLLL3);
        }
        C19676111yZ.LIZLLL(linkedHashMap, ((AbstractC21197217xK) this.LIZ.LJJIJIIJI()).LJJIZ());
        UsPopupCardVO usPopupCardVO = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO != null && (bcmStandardTrack = usPopupCardVO.bcmStandardTrack) != null && (map3 = bcmStandardTrack.trackParam) != null) {
            linkedHashMap.putAll(map3);
        }
        UsPopupCardVO usPopupCardVO2 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO2 != null && (map2 = usPopupCardVO2.coverComponentDaInfo) != null) {
            for (Map.Entry<String, ? extends Object> entry : map2.entrySet()) {
                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        UsPopupCardVO usPopupCardVO3 = this.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO3 != null && (liveDaInfo = usPopupCardVO3.commonDaInfo) != null && (map = liveDaInfo.transDaInfo) != null) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }

    public AbstractC21196817xG(AbstractC21194117wp abstractC21194117wp, InterfaceC21201017xw interfaceC21201017xw, C21194917wx c21194917wx) {
        this.LIZ = abstractC21194117wp;
        this.LIZIZ = interfaceC21201017xw;
        this.LIZJ = c21194917wx;
    }
}
