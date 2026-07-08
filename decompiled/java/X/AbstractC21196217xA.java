package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveDaInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS398S0200000_32;

/* JADX INFO: renamed from: X.17xA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21196217xA {
    public final AbstractC21194217wq LIZ;
    public InterfaceC21200917xv LIZIZ;
    public final C21194817ww LIZJ;

    public abstract void LIZ(String str);

    public abstract void LIZJ();

    public abstract void LIZLLL(OecInitData oecInitData);

    public abstract void LJ(PopProductResp popProductResp, boolean z, boolean z2, boolean z3);

    public abstract void LJFF();

    public void LJI(ECommerceMessage eCommerceMessage, AwS398S0200000_32 awS398S0200000_32) {
    }

    public abstract void LJII();

    public abstract void LJIIIIZZ(String str);

    public abstract void LJIIIZ();

    public abstract void LJIIJ();

    public void LJIIJJI(String str, String str2) {
    }

    public final Map<String, String> LIZIZ() {
        LiveDaInfo liveDaInfo;
        HashMap<String, String> map;
        Map<String, ? extends Object> map2;
        BcmStandardTrack bcmStandardTrack;
        Map<String, String> map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> mapLLJJLIIIJLLLLLLLZ = ((AbstractC21197117xJ) this.LIZ.LJJIJIIJI()).LLJJLIIIJLLLLLLLZ(7);
        if (mapLLJJLIIIJLLLLLLLZ != null) {
            linkedHashMap.putAll(mapLLJJLIIIJLLLLLLLZ);
        }
        Map<String, String> mapLLJJLIIIJLLLLLLLZ2 = ((AbstractC21197117xJ) this.LIZ.LJJIJIIJI()).LLJJLIIIJLLLLLLLZ(1);
        if (mapLLJJLIIIJLLLLLLLZ2 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapLLJJLIIIJLLLLLLLZ2);
            linkedHashMap2.remove("label_type");
            linkedHashMap.putAll(linkedHashMap2);
        }
        Map<String, String> mapLLJJLIIIJLLLLLLLZ3 = ((AbstractC21197117xJ) this.LIZ.LJJIJIIJI()).LLJJLIIIJLLLLLLLZ(2);
        if (mapLLJJLIIIJLLLLLLLZ3 != null) {
            linkedHashMap.putAll(mapLLJJLIIIJLLLLLLLZ3);
        }
        Map<String, String> mapLLJJLIIIJLLLLLLLZ4 = ((AbstractC21197117xJ) this.LIZ.LJJIJIIJI()).LLJJLIIIJLLLLLLLZ(21);
        if (mapLLJJLIIIJLLLLLLLZ4 != null) {
            linkedHashMap.putAll(mapLLJJLIIIJLLLLLLLZ4);
        }
        C19676311yb.LJ(linkedHashMap, ((AbstractC21197117xJ) this.LIZ.LJJIJIIJI()).LJJIZ());
        PopupCardVO popupCardVO = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO != null && (bcmStandardTrack = popupCardVO.bcmStandardTrack) != null && (map3 = bcmStandardTrack.trackParam) != null) {
            linkedHashMap.putAll(map3);
        }
        PopupCardVO popupCardVO2 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO2 != null && (map2 = popupCardVO2.coverComponentDaInfo) != null) {
            for (Map.Entry<String, ? extends Object> entry : map2.entrySet()) {
                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        PopupCardVO popupCardVO3 = this.LIZ.LJJIJIIJI().LL;
        if (popupCardVO3 != null && (liveDaInfo = popupCardVO3.commonDaInfo) != null && (map = liveDaInfo.transDaInfo) != null) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }

    public AbstractC21196217xA(AbstractC21194217wq abstractC21194217wq, InterfaceC21200917xv interfaceC21200917xv, C21194817ww c21194817ww) {
        this.LIZ = abstractC21194217wq;
        this.LIZIZ = interfaceC21200917xv;
        this.LIZJ = c21194817ww;
    }
}
