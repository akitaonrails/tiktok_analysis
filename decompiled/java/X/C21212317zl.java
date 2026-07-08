package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionProductPrice;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PDPAccessControl;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17zl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21212317zl implements InterfaceC594230NSj {
    public final AbstractC21198617xY<AbstractC21202217y8> LIZ;

    @Override // X.InterfaceC594230NSj
    public int id() {
        return 0;
    }

    public final Map<String, String> LIZJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> mapLLJJLIIIJLLLLLLLZ = ((AbstractC21197117xJ) this.LIZ).LLJJLIIIJLLLLLLLZ(7);
        if (mapLLJJLIIIJLLLLLLLZ != null) {
            linkedHashMap.putAll(mapLLJJLIIIJLLLLLLLZ);
        }
        Map<String, String> mapLLJJLIIIJLLLLLLLZ2 = ((AbstractC21197117xJ) this.LIZ).LLJJLIIIJLLLLLLLZ(1);
        if (mapLLJJLIIIJLLLLLLLZ2 != null) {
            linkedHashMap.putAll(mapLLJJLIIIJLLLLLLLZ2);
        }
        Map<String, String> mapLLJJLIIIJLLLLLLLZ3 = ((AbstractC21197117xJ) this.LIZ).LLJJLIIIJLLLLLLLZ(2);
        if (mapLLJJLIIIJLLLLLLLZ3 != null) {
            linkedHashMap.putAll(mapLLJJLIIIJLLLLLLLZ3);
        }
        Map<String, String> mapLLJJLIIIJLLLLLLLZ4 = ((AbstractC21197117xJ) this.LIZ).LLJJLIIIJLLLLLLLZ(21);
        if (mapLLJJLIIIJLLLLLLLZ4 != null) {
            linkedHashMap.putAll(mapLLJJLIIIJLLLLLLLZ4);
        }
        C19676311yb.LJ(linkedHashMap, ((AbstractC21197117xJ) this.LIZ).LJJIZ());
        return linkedHashMap;
    }

    public C21212317zl(AbstractC21198617xY<AbstractC21202217y8> abstractC21198617xY) {
        this.LIZ = abstractC21198617xY;
    }

    public static void LJFF(PopupCardVO popupCardVO) {
        String str;
        List<PromotionLabel> list;
        PromotionProductPrice promotionProductPrice;
        List<String> list2 = popupCardVO.skuIds;
        SinglePriceItem singlePriceItem = null;
        if (list2 != null) {
            str = (String) C13LP.LJJJLZIJ(0, list2);
        } else {
            str = null;
        }
        String strValueOf = String.valueOf(popupCardVO.productId);
        String str2 = popupCardVO.title;
        String str3 = popupCardVO.sellerId;
        String str4 = popupCardVO.imageUrl;
        PromotionInfo promotionInfo = popupCardVO.promotionInfo;
        if (promotionInfo != null && (promotionProductPrice = promotionInfo.productPrice) != null) {
            singlePriceItem = promotionProductPrice.minPrice;
        } else {
            if (promotionInfo == null) {
                list = null;
            }
            C1766250w3z c1766250w3z = new C1766250w3z(str, strValueOf, str2, str3, str4, singlePriceItem, list);
            C1766240w3y.LIZ.getClass();
            C1766240w3y.LJIIIIZZ(c1766250w3z);
        }
        list = promotionInfo.promotionLabels;
        C1766250w3z c1766250w3z2 = new C1766250w3z(str, strValueOf, str2, str3, str4, singlePriceItem, list);
        C1766240w3y.LIZ.getClass();
        C1766240w3y.LJIIIIZZ(c1766250w3z2);
    }

    public static void LJI(String str) {
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(topActivity);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
    }

    public final void LIZLLL(String str, PopupCardVO popupCardVO, C1743900vTw c1743900vTw) {
        String str2;
        Context context;
        Map<String, String> map;
        AbstractC21202217y8 abstractC21202217y8;
        int i;
        PDPAccessControl pDPAccessControl;
        String str3;
        if (!Intrinsics.LJFF(str, "button") && (pDPAccessControl = popupCardVO.pdpAccessControl) != null && Intrinsics.LJFF(pDPAccessControl.blocked, Boolean.TRUE)) {
            PDPAccessControl pDPAccessControl2 = popupCardVO.pdpAccessControl;
            if (pDPAccessControl2 != null && (str3 = pDPAccessControl2.displayMsg) != null && str3.length() > 0) {
                LJI(str3);
                return;
            }
            return;
        }
        if (c1743900vTw != null) {
            c1743900vTw.LJII(System.currentTimeMillis(), "start_click_time");
        }
        if (popupCardVO.platform == 5 && Intrinsics.LJFF(str, "button") && ((Boolean) C276560Asg.LIZ.getValue()).booleanValue()) {
            str2 = "skip_pdp";
        } else {
            str2 = "normal";
        }
        if (c1743900vTw != null) {
            c1743900vTw.LJIIIIZZ("purchase_path", str2, false);
        }
        T t = this.LIZ.LLILZIL;
        if (t != 0 && (context = t.getContext()) != null) {
            if (Intrinsics.LJFF(str2, "skip_pdp") && (i = popupCardVO.buyButtonType) != 0) {
                C182S c182s = PopupCardVO.Companion;
                Integer numValueOf = Integer.valueOf(i);
                c182s.getClass();
                String string = C182S.LIZIZ(numValueOf).toast;
                if (string == null) {
                    string = context.getString(2131832645);
                }
                LJI(string);
                return;
            }
            if (Intrinsics.LJFF(str2, "skip_pdp") && (popupCardVO.isSoldOut() || ((abstractC21202217y8 = (AbstractC21202217y8) this.LIZ.LLILZIL) != null && true == abstractC21202217y8.h0()))) {
                LJI(context.getString(2131832645));
                return;
            }
            BcmStandardTrack bcmStandardTrack = popupCardVO.bcmStandardTrack;
            if (bcmStandardTrack != null) {
                map = bcmStandardTrack.chainParam;
            } else {
                map = null;
            }
            String strLIZIZ = LIZIZ(1, 0, str, map);
            AbstractC21202217y8 abstractC21202217y82 = (AbstractC21202217y8) this.LIZ.LLILZIL;
            if (abstractC21202217y82 != null && abstractC21202217y82.LLILZIL) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C21212417zm(c1743900vTw, this, context, popupCardVO, str2, strLIZIZ, null), 3);
            } else {
                LJ(popupCardVO, c1743900vTw, context, str2, strLIZIZ);
            }
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04fd A[PHI: r7
      0x04fd: PHI (r7v7 java.lang.String) = (r7v0 java.lang.String), (r7v9 java.lang.String) binds: [B:147:0x023a, B:145:0x0236] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0507 A[PHI: r21
      0x0507: PHI (r21v2 java.lang.String) = (r21v0 java.lang.String), (r21v3 java.lang.String) binds: [B:140:0x0225, B:138:0x0221] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r75, X.C1743900vTw r76, android.content.Context r77, java.lang.String r78, java.lang.String r79) {
        /*
            Method dump skipped, instruction units count: 1408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21212317zl.LJ(com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO, X.0vTw, android.content.Context, java.lang.String, java.lang.String):void");
    }
}
