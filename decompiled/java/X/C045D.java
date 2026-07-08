package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.045D, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C045D {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, String str2) {
        String string;
        String string2 = null;
        if (str != null) {
            string2 = a0.LJLIIIL(str).toString();
        }
        String str3 = "";
        if (string2 == null) {
            string2 = "";
        }
        if (str2 != null && (string = a0.LJLIIIL(str2).toString()) != null) {
            str3 = string;
        }
        if (string2.length() == 0) {
            return string2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string2);
        sbLIZ.append('.');
        sbLIZ.append(str3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Map LIZIZ(ProductPackStruct productPackStruct, SkuPanelState skuPanelState) {
        Map<String, String> chainParam;
        String str;
        BCMStandardTrack bCMStandardTrack;
        Map<String, String> chainParam2;
        BCMStandardTrack bCMStandardTrack2;
        if (productPackStruct != null && (bCMStandardTrack2 = productPackStruct.bcmStandardTrack) != null) {
            chainParam = bCMStandardTrack2.getChainParam();
        } else {
            chainParam = null;
            if (productPackStruct != null) {
            }
            return chainParam;
        }
        if (skuPanelState == null || (str = skuPanelState.skuId) == null) {
            str = "";
        }
        SkuItem skuItemLIZLLL = C041G.LIZLLL(productPackStruct, str);
        if (skuItemLIZLLL != null && (bCMStandardTrack = skuItemLIZLLL.bcmStandardTrack) != null && (chainParam2 = bCMStandardTrack.getChainParam()) != null) {
            return chainParam2;
        }
        return chainParam;
    }

    public static Map LIZJ(ProductPackStruct productPackStruct, SkuPanelState skuPanelState) {
        Map<String, String> trackParam;
        String str;
        BCMStandardTrack bCMStandardTrack;
        Map<String, String> trackParam2;
        BCMStandardTrack bCMStandardTrack2;
        if (productPackStruct != null && (bCMStandardTrack2 = productPackStruct.bcmStandardTrack) != null) {
            trackParam = bCMStandardTrack2.getTrackParam();
        } else {
            trackParam = null;
            if (productPackStruct != null) {
            }
            return trackParam;
        }
        if (skuPanelState == null || (str = skuPanelState.skuId) == null) {
            str = "";
        }
        SkuItem skuItemLIZLLL = C041G.LIZLLL(productPackStruct, str);
        if (skuItemLIZLLL != null && (bCMStandardTrack = skuItemLIZLLL.bcmStandardTrack) != null && (trackParam2 = bCMStandardTrack.getTrackParam()) != null) {
            return trackParam2;
        }
        return trackParam;
    }
}
