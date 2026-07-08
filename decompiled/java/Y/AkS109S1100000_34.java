package Y;

import X.AbstractC1614570s7L;
import X.AbstractC19484711Kz;
import X.AbstractC19486711Lt;
import X.C0KPG;
import X.C0KPI;
import X.C0KQW;
import X.C11QI;
import X.C1613300s5I;
import X.C1614530s7H;
import X.C1614540s7I;
import X.C1614620s7Q;
import X.C19773912Yf;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2197881B0g;
import X.C2197981B0q;
import X.C518150KTt;
import X.EnumC1792020wjY;
import X.InterfaceC1487280oo2;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.android.livesdk.impl.revenue.enigma.iap.EnigmaPurchaseService;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$CancelContractResponse;
import com.ss.android.ugc.aweme.series.vip.serviceimpl.SeriesSubscriptionServiceImpl;
import java.util.Map;
import kotlin.jvm.internal.AFwS269S0000000_27;

/* JADX INFO: loaded from: classes35.dex */
public class AkS109S1100000_34 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS109S1100000_34 akS109S1100000_34, Object obj) {
        int value;
        String strLIZIZ;
        String strLIZIZ2;
        EnumC1792020wjY enumC1792020wjY;
        C518150KTt c518150KTt = (C518150KTt) obj;
        if (!c518150KTt.LIZ) {
            C0KQW c0kqw = c518150KTt.LIZJ;
            if (c0kqw != null && (enumC1792020wjY = c0kqw.LIZ) != null) {
                value = enumC1792020wjY.getValue();
            } else {
                value = 0;
            }
            C0KQW c0kqw2 = c518150KTt.LIZJ;
            if (c0kqw2 == null || (strLIZIZ = c0kqw2.LIZIZ) == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed to fetch Play product details for product type ");
                sbLIZ.append(akS109S1100000_34.s0);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            C2197881B0g.LIZJ(value, strLIZIZ, ((EnigmaPurchaseService) akS109S1100000_34.l1).LM());
            C0KQW c0kqw3 = c518150KTt.LIZJ;
            if (c0kqw3 == null || (strLIZIZ2 = c0kqw3.LIZIZ) == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Failed to fetch Play product details for product type ");
                sbLIZ2.append(akS109S1100000_34.s0);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            }
            return AbstractC19484711Kz.LJIILLIIL(new C2197981B0q(strLIZIZ2, null));
        }
        Map<String, IapProductDetail> mapLJ = c518150KTt.LIZIZ;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        return AbstractC19484711Kz.LJIJJLI(mapLJ);
    }

    public static final Object apply$1(AkS109S1100000_34 akS109S1100000_34, Object obj) {
        C0KPG c0kpg = (C0KPG) obj;
        if (c0kpg.LIZ != C0KPI.SUCCESS) {
            SeriesSubscriptionServiceImpl seriesSubscriptionServiceImpl = (SeriesSubscriptionServiceImpl) akS109S1100000_34.l1;
            seriesSubscriptionServiceImpl.LIZ.onNext(new C1614540s7I(c0kpg, seriesSubscriptionServiceImpl.LIZJ));
            return AbstractC19486711Lt.LJIIJ(new C1613300s5I(null, null));
        }
        ((SeriesSubscriptionServiceImpl) akS109S1100000_34.l1).LIZ.onNext(C1614620s7Q.LIZ);
        SeriesSubscriptionServiceImpl seriesSubscriptionServiceImpl2 = (SeriesSubscriptionServiceImpl) akS109S1100000_34.l1;
        String str = akS109S1100000_34.s0;
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(340);
        seriesSubscriptionServiceImpl2.getClass();
        return new C11QI(SeriesSubscriptionServiceImpl.LJIILIIL(str, aFwS269S0000000_27)).LIZLLL(AbstractC19486711Lt.LJIIJJI(new C19773912Yf((SeriesSubscriptionServiceImpl) akS109S1100000_34.l1, 4)));
    }

    public static final Object apply$2(AkS109S1100000_34 akS109S1100000_34, Object obj) {
        AbstractC1614570s7L abstractC1614570s7LLJIIL;
        SeriesSubscriptionModels$CancelContractResponse seriesSubscriptionModels$CancelContractResponse = (SeriesSubscriptionModels$CancelContractResponse) obj;
        int i = seriesSubscriptionModels$CancelContractResponse.statusCode;
        if (i != 0) {
            if (i == 4090) {
                abstractC1614570s7LLJIIL = new C1614530s7H(((SeriesSubscriptionServiceImpl) akS109S1100000_34.l1).LIZJ, 2131848137);
            } else {
                abstractC1614570s7LLJIIL = ((SeriesSubscriptionServiceImpl) akS109S1100000_34.l1).LJIIL(seriesSubscriptionModels$CancelContractResponse.statusMsg);
            }
            ((SeriesSubscriptionServiceImpl) akS109S1100000_34.l1).LIZ.onNext(abstractC1614570s7LLJIIL);
            return AbstractC19486711Lt.LJIIJ(new C1613300s5I(null, null));
        }
        SeriesSubscriptionServiceImpl seriesSubscriptionServiceImpl = (SeriesSubscriptionServiceImpl) akS109S1100000_34.l1;
        String str = akS109S1100000_34.s0;
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(339);
        seriesSubscriptionServiceImpl.getClass();
        return new C11QI(SeriesSubscriptionServiceImpl.LJIILIIL(str, aFwS269S0000000_27)).LIZLLL(AbstractC19486711Lt.LJIIJJI(new C19773912Yf((SeriesSubscriptionServiceImpl) akS109S1100000_34.l1, 3))).LJIIIIZZ(new AfS203S0100000_34((SeriesSubscriptionServiceImpl) akS109S1100000_34.l1, 15));
    }

    public static final Object apply$3(AkS109S1100000_34 akS109S1100000_34, Object obj) {
        C0KPG c0kpg = (C0KPG) obj;
        if (c0kpg.LIZ != C0KPI.SUCCESS) {
            SeriesSubscriptionServiceImpl seriesSubscriptionServiceImpl = (SeriesSubscriptionServiceImpl) akS109S1100000_34.l1;
            seriesSubscriptionServiceImpl.LIZ.onNext(new C1614540s7I(c0kpg, seriesSubscriptionServiceImpl.LIZJ));
            return AbstractC19486711Lt.LJIIJ(new C1613300s5I(null, null));
        }
        ((SeriesSubscriptionServiceImpl) akS109S1100000_34.l1).LIZ.onNext(C1614620s7Q.LIZ);
        SeriesSubscriptionServiceImpl seriesSubscriptionServiceImpl2 = (SeriesSubscriptionServiceImpl) akS109S1100000_34.l1;
        String str = akS109S1100000_34.s0;
        seriesSubscriptionServiceImpl2.getClass();
        return new C11QI(SeriesSubscriptionServiceImpl.LJIILJJIL(str).LJIILL(new AfS198S0100000_29((SeriesSubscriptionServiceImpl) akS109S1100000_34.l1, 18)));
    }

    public static final Object apply$4(AkS109S1100000_34 akS109S1100000_34, Object obj) {
        C0KPG c0kpg = (C0KPG) obj;
        if (c0kpg.LIZ != C0KPI.SUCCESS) {
            SeriesSubscriptionServiceImpl seriesSubscriptionServiceImpl = (SeriesSubscriptionServiceImpl) akS109S1100000_34.l1;
            seriesSubscriptionServiceImpl.LIZ.onNext(new C1614540s7I(c0kpg, seriesSubscriptionServiceImpl.LIZJ));
            return AbstractC19486711Lt.LJIIJ(new C1613300s5I(null, c0kpg));
        }
        ((SeriesSubscriptionServiceImpl) akS109S1100000_34.l1).LJIIIIZZ(C1614620s7Q.LIZ);
        SeriesSubscriptionServiceImpl seriesSubscriptionServiceImpl2 = (SeriesSubscriptionServiceImpl) akS109S1100000_34.l1;
        String str = akS109S1100000_34.s0;
        seriesSubscriptionServiceImpl2.getClass();
        return new C11QI(SeriesSubscriptionServiceImpl.LJIILJJIL(str).LJIILL(new AfS203S0100000_34((SeriesSubscriptionServiceImpl) akS109S1100000_34.l1, 20)));
    }

    public AkS109S1100000_34(Object obj, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }
}
