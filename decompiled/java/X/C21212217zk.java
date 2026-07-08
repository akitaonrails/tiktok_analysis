package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionProductPrice;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17zk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21212217zk implements InterfaceC21181417um {
    public final AbstractC21198517xX<AbstractC21202917yF> LIZ;

    @Override // X.InterfaceC21181417um
    public int id() {
        return 0;
    }

    public final Map<String, String> LIZJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> mapLJLLL = ((AbstractC21197217xK) this.LIZ).LJLLL("atmosphere_layout");
        if (mapLJLLL != null) {
            linkedHashMap.putAll(mapLJLLL);
        }
        Map<String, String> mapLJLLL2 = ((AbstractC21197217xK) this.LIZ).LJLLL("promotion_items");
        if (mapLJLLL2 != null) {
            linkedHashMap.putAll(C125400do.LIZ(mapLJLLL2, ((AbstractC21197217xK) this.LIZ).LJLLL("second_promotion_items")));
        }
        Map<String, String> mapLJLLL3 = ((AbstractC21197217xK) this.LIZ).LJLLL("selling_point_items");
        if (mapLJLLL3 != null) {
            linkedHashMap.putAll(mapLJLLL3);
        }
        C19676111yZ.LIZLLL(linkedHashMap, ((AbstractC21197217xK) this.LIZ).LJJIZ());
        return linkedHashMap;
    }

    public C21212217zk(AbstractC21198517xX<AbstractC21202917yF> abstractC21198517xX) {
        this.LIZ = abstractC21198517xX;
    }

    public static void LJFF(UsPopupCardVO usPopupCardVO) {
        String str;
        PromotionProductPrice promotionProductPrice;
        List<String> list = usPopupCardVO.skuIds;
        SinglePriceItem singlePriceItem = null;
        if (list != null) {
            str = (String) C13LP.LJJJLZIJ(0, list);
        } else {
            str = null;
        }
        String strValueOf = String.valueOf(usPopupCardVO.productId);
        String str2 = usPopupCardVO.title;
        String str3 = usPopupCardVO.sellerId;
        String str4 = usPopupCardVO.imageUrl;
        PromotionInfo promotionInfo = usPopupCardVO.promotionInfo;
        if (promotionInfo != null && (promotionProductPrice = promotionInfo.productPrice) != null) {
            singlePriceItem = promotionProductPrice.minPrice;
        }
        C1766250w3z c1766250w3z = new C1766250w3z(str, strValueOf, str2, str3, str4, singlePriceItem, null);
        C1766240w3y.LIZ.getClass();
        C1766240w3y.LJIIIIZZ(c1766250w3z);
    }

    public final void LIZLLL(String str, UsPopupCardVO usPopupCardVO, C1743900vTw c1743900vTw) {
        String str2;
        Context context;
        Map<String, String> map;
        AbstractC21202917yF abstractC21202917yF;
        int i;
        if (c1743900vTw != null) {
            c1743900vTw.LJII(System.currentTimeMillis(), "start_click_time");
        }
        if (usPopupCardVO.platform == 5 && Intrinsics.LJFF(str, "button") && ((Boolean) C276560Asg.LIZ.getValue()).booleanValue()) {
            str2 = "skip_pdp";
        } else {
            str2 = "normal";
        }
        if (c1743900vTw != null) {
            c1743900vTw.LJIIIIZZ("purchase_path", str2, false);
        }
        T t = this.LIZ.LLILZIL;
        if (t != 0 && (context = t.getContext()) != null) {
            if (Intrinsics.LJFF(str2, "skip_pdp") && (i = usPopupCardVO.buyButtonType) != 0) {
                C182R c182r = UsPopupCardVO.Companion;
                Integer numValueOf = Integer.valueOf(i);
                c182r.getClass();
                String string = C182R.LIZJ(numValueOf).toast;
                if (string == null) {
                    string = context.getString(2131832645);
                }
                Activity topActivity = ActivityStack.getTopActivity();
                if (topActivity != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(topActivity);
                    c1389890mGx.LJIIJ(string);
                    c1389890mGx.LJIIJJI();
                    return;
                }
                return;
            }
            if (Intrinsics.LJFF(str2, "skip_pdp") && (usPopupCardVO.isSoldOut() || ((abstractC21202917yF = (AbstractC21202917yF) this.LIZ.LLILZIL) != null && true == abstractC21202917yF.h0()))) {
                String string2 = context.getString(2131832645);
                Activity topActivity2 = ActivityStack.getTopActivity();
                if (topActivity2 != null) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(topActivity2);
                    c1389890mGx2.LJIIJ(string2);
                    c1389890mGx2.LJIIJJI();
                    return;
                }
                return;
            }
            BcmStandardTrack bcmStandardTrack = usPopupCardVO.bcmStandardTrack;
            if (bcmStandardTrack != null) {
                map = bcmStandardTrack.chainParam;
            } else {
                map = null;
            }
            LJ(usPopupCardVO, c1743900vTw, context, str2, LIZIZ(1, 0, str, map));
        }
    }

    public final String LIZIZ(int i, Integer num, String str, Map map) {
        int iIntValue;
        if (i == 2) {
            if (Intrinsics.LJFF(str, "button")) {
                return C1739720vNC.LIZJ(new C1741520vQ6("c86894").LIZ("d2095"), this.LIZ.LLILZIL, map);
            }
            if (Intrinsics.LJFF(str, "pic")) {
                C1741510vQ5 c1741510vQ5LIZ = new C1741520vQ6("c86894").LIZ("d4102");
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                c1741510vQ5LIZ.LIZJ = iIntValue;
                return C1739720vNC.LIZJ(c1741510vQ5LIZ, this.LIZ.LLILZIL, map);
            }
            return C1739720vNC.LIZJ(new C1741520vQ6("c86894").LIZ("d32978"), this.LIZ.LLILZIL, map);
        }
        if (Intrinsics.LJFF(str, "button")) {
            C1741510vQ5 c1741510vQ5LIZ2 = new C1741520vQ6("c7068").LIZ("d5479");
            C1741510vQ5 c1741510vQ5 = new C1741510vQ5("w1896");
            c1741510vQ5.LIZIZ = c1741510vQ5LIZ2;
            c1741510vQ5.LIZLLL = true;
            return C1739720vNC.LIZJ(c1741510vQ5, this.LIZ.LLILZIL, map);
        }
        return C1739720vNC.LIZJ(new C1741520vQ6("c7068").LIZ("d5479"), this.LIZ.LLILZIL, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:235:0x04c1 A[PHI: r7
      0x04c1: PHI (r7v11 java.lang.String) = (r7v0 java.lang.String), (r7v13 java.lang.String) binds: [B:130:0x0216, B:128:0x0212] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04cb A[PHI: r19
      0x04cb: PHI (r19v2 java.lang.String) = (r19v0 java.lang.String), (r19v3 java.lang.String) binds: [B:123:0x0201, B:121:0x01fd] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r75, X.C1743900vTw r76, android.content.Context r77, java.lang.String r78, java.lang.String r79) {
        /*
            Method dump skipped, instruction units count: 1348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21212217zk.LJ(com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO, X.0vTw, android.content.Context, java.lang.String, java.lang.String):void");
    }
}
