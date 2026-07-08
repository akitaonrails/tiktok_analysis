package Y;

import X.C05P0;
import X.C123100dR;
import X.C1613030s4r;
import X.C1615460s8m;
import X.C1674100tfM;
import X.C2188811AlT;
import X.InterfaceC345960DhK;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.components.purchaseoption.PricePacket;
import com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionWithPrice;
import com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AObserverS81S1200000_24 implements Observer {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS81S1200000_24 aObserverS81S1200000_24, Object obj) {
        C1615460s8m c1615460s8m = (C1615460s8m) ((Map) obj).get(aObserverS81S1200000_24.s0);
        if (c1615460s8m == null) {
            ((Function1) aObserverS81S1200000_24.l1).invoke(null);
        } else {
            ((Function1) aObserverS81S1200000_24.l1).invoke(new C1613030s4r(((PaidContentVideoPanel) aObserverS81S1200000_24.l2).LLLLIIIILLL.getIndex(), c1615460s8m.LIZ, c1615460s8m.LIZIZ, c1615460s8m.LIZJ, c1615460s8m.LIZLLL, c1615460s8m.LJ, c1615460s8m.LJFF, c1615460s8m.LJI, c1615460s8m.LJII, c1615460s8m.LJIIIIZZ, c1615460s8m.LJIIIZ));
        }
    }

    public static final void onChanged$1(AObserverS81S1200000_24 aObserverS81S1200000_24, Object obj) {
        String strLIZIZ;
        C1615460s8m c1615460s8m;
        String str;
        Map map = (Map) obj;
        PricePacket pricePacketCopy = null;
        if (C1674100tfM.LIZIZ((C05P0) aObserverS81S1200000_24.l2).discountedPrice != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('$');
            PricePacket pricePacket = C1674100tfM.LIZIZ((C05P0) aObserverS81S1200000_24.l2).discountedPrice;
            if (pricePacket != null) {
                str = pricePacket.priceInUsd;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('$');
            sbLIZ2.append(C1674100tfM.LIZIZ((C05P0) aObserverS81S1200000_24.l2).originalPrice.priceInUsd);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (map.containsKey(aObserverS81S1200000_24.s0) && (c1615460s8m = (C1615460s8m) map.get(aObserverS81S1200000_24.s0)) != null) {
            C05P0 c05p0 = (C05P0) aObserverS81S1200000_24.l2;
            PurchaseOptionWithPrice purchaseOptionWithPriceLIZIZ = C1674100tfM.LIZIZ(c05p0);
            PricePacket pricePacket2 = ((PurchaseOptionWithPrice) c05p0.getValue()).originalPrice;
            PricePacket pricePacketCopy2 = pricePacket2.copy(pricePacket2.iapId, c1615460s8m.LJII, c1615460s8m.LIZJ, pricePacket2.priceInUsd);
            PricePacket pricePacket3 = ((PurchaseOptionWithPrice) c05p0.getValue()).discountedPrice;
            if (pricePacket3 != null) {
                pricePacketCopy = pricePacket3.copy(pricePacket3.iapId, c1615460s8m.LJII, c1615460s8m.LJFF, pricePacket3.priceInUsd);
            }
            c05p0.setValue(new PurchaseOptionWithPrice(purchaseOptionWithPriceLIZIZ.skuIds, purchaseOptionWithPriceLIZIZ.title, purchaseOptionWithPriceLIZIZ.subtitle, purchaseOptionWithPriceLIZIZ.promotionText, pricePacketCopy2, pricePacketCopy, purchaseOptionWithPriceLIZIZ.discountTag, purchaseOptionWithPriceLIZIZ.isFullWidth, purchaseOptionWithPriceLIZIZ.purchaseCategory));
            if (C123100dR.LIZ(c1615460s8m.LJ)) {
                strLIZIZ = c1615460s8m.LJ;
            } else {
                strLIZIZ = c1615460s8m.LIZIZ;
            }
        }
        ((InterfaceC345960DhK) aObserverS81S1200000_24.l1).setValue(strLIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObserverS81S1200000_24(String str, String str2, InterfaceC345960DhK<String> interfaceC345960DhK, C05P0<PurchaseOptionWithPrice> c05p0) {
        this.$t = c05p0;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = interfaceC345960DhK;
    }
}
