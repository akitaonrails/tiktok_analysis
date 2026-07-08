package X;

import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsBidViewModel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.17xT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21198117xT {
    public static final C21198117xT LIZ = new C21198117xT();

    public static void LIZIZ(String str, Map map) {
        map.put("step", str);
        C1421105hJ.LIZJ("tiktokec_rd_auction_step_event", map);
    }

    public static void LIZ(String str, UsBidViewModel usBidViewModel, Map map) {
        Map<String, String> linkedHashMap;
        Integer numValueOf;
        String strLIZIZ;
        Integer numValueOf2;
        Integer numValueOf3;
        Boolean boolValueOf;
        String str2;
        UsPopupCardVO usPopupCardVO;
        C181U c181u;
        SinglePriceItem singlePriceItem;
        C181U c181u2;
        C181U c181u3;
        C181U c181u4;
        C181U c181u5;
        C1563990qnl c1563990qnl = null;
        if (usBidViewModel != null) {
            LIZ.getClass();
            linkedHashMap = usBidViewModel.xQ2(null, null, true);
        } else {
            linkedHashMap = new LinkedHashMap<>();
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("step", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("auction_status:");
        C1840020xyy c1840020xyy = InterfaceC1840030xyz.LJIILL;
        if (usBidViewModel != null && (c181u5 = usBidViewModel.LLJIJIL) != null) {
            numValueOf = Integer.valueOf(c181u5.LJI);
        } else {
            numValueOf = null;
        }
        c1840020xyy.getClass();
        if (numValueOf != null) {
            numValueOf.intValue();
            strLIZIZ = C1840020xyy.LIZIZ.get(numValueOf);
            if (strLIZIZ == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("unknown_");
                sbLIZ2.append(numValueOf);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
        } else {
            strLIZIZ = "unknown_null";
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(", auction_text_type:");
        C1840000xyw c1840000xyw = InterfaceC1840010xyx.LJIILLIIL;
        if (usBidViewModel != null && (c181u4 = usBidViewModel.LLJIJIL) != null) {
            numValueOf2 = Integer.valueOf(c181u4.LJII);
        } else {
            numValueOf2 = null;
        }
        c1840000xyw.getClass();
        sbLIZ.append(C1840000xyw.LIZ(numValueOf2));
        sbLIZ.append(", drawing_state_text_type:");
        if (usBidViewModel != null && (c181u3 = usBidViewModel.LLJIJIL) != null) {
            numValueOf3 = Integer.valueOf(c181u3.LJIILL);
        } else {
            numValueOf3 = null;
        }
        sbLIZ.append(C1840000xyw.LIZ(numValueOf3));
        sbLIZ.append(", is_carousel:");
        if (usBidViewModel != null && (c181u2 = usBidViewModel.LLJIJIL) != null) {
            boolValueOf = Boolean.valueOf(c181u2.LJIIIZ);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", bid_price:");
        if (usBidViewModel != null && (c181u = usBidViewModel.LLJIJIL) != null && (singlePriceItem = c181u.LIZJ) != null) {
            str2 = singlePriceItem.salePriceFormat;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        linkedHashMap.put("step_extra", C2188811AlT.LIZIZ(sbLIZ));
        if (usBidViewModel != null && (usPopupCardVO = usBidViewModel.LLILLJJLI) != null) {
            c1563990qnl = usPopupCardVO.chainInfo;
        }
        C21183117v3.LIZ(linkedHashMap, c1563990qnl);
        C1421105hJ.LIZJ("tiktokec_rd_auction_step_event", linkedHashMap);
    }
}
