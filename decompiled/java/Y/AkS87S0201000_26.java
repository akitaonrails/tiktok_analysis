package Y;

import X.AnonymousClass0408;
import X.C10287040n;
import X.C13LP;
import X.C13LQ;
import X.C1758040vqk;
import X.C1758120vqs;
import X.C1758290vr9;
import X.C1758310vrB;
import X.InterfaceC1487280oo2;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.core.engine.BizParserInfo;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class AkS87S0201000_26 implements InterfaceC1487280oo2 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$0(AkS87S0201000_26 akS87S0201000_26, Object obj) {
        List<ProductPackStruct> list;
        C1758040vqk c1758040vqkLIZ;
        ProductInfoPackData productInfoPackData;
        PopUp popUp;
        C1758290vr9 c1758290vr9 = (C1758290vr9) obj;
        ProductInfoPackData productInfoPackData2 = (ProductInfoPackData) c1758290vr9.data;
        if (productInfoPackData2 != null) {
            list = productInfoPackData2.productionInfoPack;
        } else {
            list = null;
        }
        if (c1758290vr9.isCodeOK()) {
            boolean z = true;
            if (list != null && !list.isEmpty()) {
                ProductPackStruct.Companion.getClass();
                if (C13LQ.LJIILLIIL(((ProductPackStruct) C13LP.LJJJJZI(list)).status, ProductPackStruct.ALL_STATUS)) {
                    ProductPackStruct productPackStruct = (ProductPackStruct) C13LP.LJJJJZI(list);
                    JSONObject jSONObject = c1758290vr9.LLILLJJLI;
                    if (jSONObject != null) {
                        productPackStruct.godaProtocolJSON = jSONObject;
                    }
                    c1758290vr9.LLILLJJLI = null;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
                    Map map = (Map) akS87S0201000_26.l0;
                    IPdpStarter.PdpEnterParam pdpEnterParam = (IPdpStarter.PdpEnterParam) akS87S0201000_26.l1;
                    Map<String, Object> map2 = pdpEnterParam.trackParams;
                    OneClickPayContext oneClickPayContext = pdpEnterParam.ocpContext;
                    String productId = pdpEnterParam.getProductId();
                    int i = akS87S0201000_26.i2;
                    c1758310vrB.getClass();
                    C1758310vrB.LJJIZ(map, map2, oneClickPayContext, productId, productPackStruct, c1758290vr9, i, jCurrentTimeMillis);
                    T t = c1758290vr9.data;
                    if ((t instanceof ProductInfoPackData) && (productInfoPackData = (ProductInfoPackData) t) != null && (popUp = productInfoPackData.popUp) != null) {
                        productPackStruct.popUp = popUp;
                    }
                    List<BizParserInfo> list2 = productPackStruct.pageBizList;
                    if (list2 != null) {
                        AnonymousClass0408.LIZ.getClass();
                        AnonymousClass0408.LJIILJJIL(list2);
                    }
                    String str = ((IPdpStarter.PdpEnterParam) akS87S0201000_26.l1).trackId;
                    if (str != null && (c1758040vqkLIZ = C10287040n.LIZ(str)) != null) {
                        if (productPackStruct.blockPageInfo == null) {
                            z = false;
                        }
                        c1758040vqkLIZ.LIZJ(Boolean.valueOf(z), "has_block_page_info", false);
                    }
                    return productPackStruct;
                }
            }
        }
        throw new C1758120vqs(c1758290vr9.code, c1758290vr9.message, c1758290vr9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$1(AkS87S0201000_26 akS87S0201000_26, Object obj) {
        List<ProductPackStruct> list;
        C1758040vqk c1758040vqkLIZ;
        ProductInfoPackData productInfoPackData;
        PopUp popUp;
        C1758290vr9 c1758290vr9 = (C1758290vr9) obj;
        ProductInfoPackData productInfoPackData2 = (ProductInfoPackData) c1758290vr9.data;
        if (productInfoPackData2 != null) {
            list = productInfoPackData2.productionInfoPack;
        } else {
            list = null;
        }
        if (c1758290vr9.isCodeOK()) {
            boolean z = true;
            if (list != null && !list.isEmpty()) {
                ProductPackStruct.Companion.getClass();
                if (C13LQ.LJIILLIIL(((ProductPackStruct) C13LP.LJJJJZI(list)).status, ProductPackStruct.ALL_STATUS)) {
                    ProductPackStruct productPackStruct = (ProductPackStruct) C13LP.LJJJJZI(list);
                    JSONObject jSONObject = c1758290vr9.LLILLJJLI;
                    if (jSONObject != null) {
                        productPackStruct.godaProtocolJSON = jSONObject;
                    }
                    c1758290vr9.LLILLJJLI = null;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
                    Map map = (Map) akS87S0201000_26.l0;
                    IPdpStarter.PdpEnterParam pdpEnterParam = (IPdpStarter.PdpEnterParam) akS87S0201000_26.l1;
                    Map<String, Object> map2 = pdpEnterParam.trackParams;
                    OneClickPayContext oneClickPayContext = pdpEnterParam.ocpContext;
                    String productId = pdpEnterParam.getProductId();
                    int i = akS87S0201000_26.i2;
                    c1758310vrB.getClass();
                    C1758310vrB.LJJIZ(map, map2, oneClickPayContext, productId, productPackStruct, c1758290vr9, i, jCurrentTimeMillis);
                    T t = c1758290vr9.data;
                    if ((t instanceof ProductInfoPackData) && (productInfoPackData = (ProductInfoPackData) t) != null && (popUp = productInfoPackData.popUp) != null) {
                        productPackStruct.popUp = popUp;
                    }
                    List<BizParserInfo> list2 = productPackStruct.pageBizList;
                    if (list2 != null) {
                        AnonymousClass0408.LIZ.getClass();
                        AnonymousClass0408.LJIILJJIL(list2);
                    }
                    String str = ((IPdpStarter.PdpEnterParam) akS87S0201000_26.l1).trackId;
                    if (str != null && (c1758040vqkLIZ = C10287040n.LIZ(str)) != null) {
                        if (productPackStruct.blockPageInfo == null) {
                            z = false;
                        }
                        c1758040vqkLIZ.LIZJ(Boolean.valueOf(z), "has_block_page_info", false);
                    }
                    return productPackStruct;
                }
            }
        }
        throw new C1758120vqs(c1758290vr9.code, c1758290vr9.message, c1758290vr9);
    }

    public AkS87S0201000_26(Map map, IPdpStarter.PdpEnterParam pdpEnterParam, int i) {
        this.$t = i;
        this.l0 = map;
        this.l1 = pdpEnterParam;
        this.i2 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AkS87S0201000_26(Map map, Map<String, ? extends Object> map2, IPdpStarter.PdpEnterParam pdpEnterParam, int i) {
        this.$t = i;
        this.l0 = map;
        this.l1 = map2;
        this.i2 = pdpEnterParam;
    }
}
