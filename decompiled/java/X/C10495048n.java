package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.view.btninterest.model.SeaPdpBottomBtnInterest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.view.btninterest.model.SeaPdpBottomBtnInterestItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.048n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10495048n {
    public static final /* synthetic */ int LIZ = 0;

    public static AbstractC10502048u LIZ(SeaPdpBottomBtnInterestItem seaPdpBottomBtnInterestItem, Map map) {
        Integer num;
        String str;
        if (seaPdpBottomBtnInterestItem != null) {
            num = seaPdpBottomBtnInterestItem.type;
        } else {
            num = null;
        }
        int type = EnumC10498048q.TEXT.getType();
        if (num != null && num.intValue() == type) {
            String str2 = seaPdpBottomBtnInterestItem.text;
            if (str2 == null || a0.LJJJIL(str2)) {
                return null;
            }
            String strLJJIFFI = seaPdpBottomBtnInterestItem.text;
            List<String> list = seaPdpBottomBtnInterestItem.placeholderKeys;
            if (list != null) {
                for (String str3 : list) {
                    if (str3 != null && !a0.LJJJIL(str3)) {
                        if (map == null || (str = (String) map.get(str3)) == null || a0.LJJJIL(str)) {
                            return null;
                        }
                        strLJJIFFI = u.LJJIFFI(strLJJIFFI, str3, str, false);
                    }
                }
            }
            return new C10497048p(strLJJIFFI);
        }
        int type2 = EnumC10498048q.DIVIDER.getType();
        if (num == null || num.intValue() != type2) {
            return null;
        }
        return new AbstractC10502048u() { // from class: X.048s
            {
                EnumC10498048q enumC10498048q = EnumC10498048q.DIVIDER;
            }
        };
    }

    public static void LIZLLL(C10379044b c10379044b, Map map) {
        HashMap<String, Object> mapLJIIJ;
        String str;
        if (map != null && (str = (String) map.get("da_info")) != null) {
            mapLJIIJ = C1741890vQh.LJIIJ(str);
        } else {
            mapLJIIJ = null;
        }
        c10379044b.LIZJ("key_bottom_buy_button_interest", mapLJIIJ);
    }

    public static C10501048t LIZJ(BuyButton buyButton, Boolean bool, Context context) {
        String str;
        String string;
        List listSingletonList;
        String str2 = null;
        if (buyButton != null) {
            str = buyButton.desc;
        } else {
            str = null;
        }
        if (str != null && !a0.LJJJIL(str)) {
            str2 = buyButton.subDesc;
            string = buyButton.desc;
        } else if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            string = context.getString(2131832613);
        } else {
            string = context.getString(2131832557);
        }
        List listSingletonList2 = Collections.singletonList(new C10497048p(string));
        if (str2 != null && !a0.LJJJIL(str2)) {
            listSingletonList = Collections.singletonList(new C10497048p(str2));
        } else {
            listSingletonList = C13BV.INSTANCE;
        }
        return new C10501048t(listSingletonList2, listSingletonList);
    }

    public static C10501048t LIZIZ(Map map, String str, Map map2, BuyButton buyButton, Boolean bool, Context context) {
        SeaPdpBottomBtnInterest seaPdpBottomBtnInterest;
        if (map != null && (seaPdpBottomBtnInterest = (SeaPdpBottomBtnInterest) map.get(str)) != null) {
            ArrayList arrayList = new ArrayList();
            List<SeaPdpBottomBtnInterestItem> list = seaPdpBottomBtnInterest.desc;
            if (list != null) {
                Iterator<SeaPdpBottomBtnInterestItem> it2 = list.iterator();
                while (it2.hasNext()) {
                    AbstractC10502048u abstractC10502048uLIZ = LIZ(it2.next(), map2);
                    if (abstractC10502048uLIZ != null) {
                        arrayList.add(abstractC10502048uLIZ);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return LIZJ(buyButton, bool, context);
            }
            ArrayList arrayList2 = new ArrayList();
            List<SeaPdpBottomBtnInterestItem> list2 = seaPdpBottomBtnInterest.subDesc;
            if (list2 != null) {
                Iterator<SeaPdpBottomBtnInterestItem> it3 = list2.iterator();
                while (it3.hasNext()) {
                    AbstractC10502048u abstractC10502048uLIZ2 = LIZ(it3.next(), map2);
                    if (abstractC10502048uLIZ2 != null) {
                        arrayList2.add(abstractC10502048uLIZ2);
                    }
                }
            }
            return new C10501048t(arrayList, arrayList2);
        }
        return LIZJ(buyButton, bool, context);
    }
}
