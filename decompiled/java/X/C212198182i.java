package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.LabelIcon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.182i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212198182i extends AbstractC212220183e<C18QS, C212199182j> {
    public final Map<String, String> LJ;
    public InterfaceC212200182k LJFF;

    public C212198182i(C18QS c18qs) {
        super(c18qs, "product_info");
        this.LJ = new LinkedHashMap();
        this.LJFF = new C0GS1();
    }

    public final void LJIIJJI(C212199182j c212199182j) {
        Image image;
        List<String> urls;
        Image image2;
        List<String> urls2;
        LabelIcon labelIcon;
        Image image3;
        EnumC1769850w9n enumC1769850w9n;
        ((LinkedHashMap) this.LJ).clear();
        ArrayList arrayList = new ArrayList();
        List<PlacementLabel> list = c212199182j.LIZIZ;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (PlacementLabel placementLabel : list) {
                Integer num = placementLabel.placement;
                if (num != null && num.intValue() == 2) {
                    arrayList2.add(placementLabel);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                List<PromotionLabel> list2 = ((PlacementLabel) it2.next()).placementLabelList;
                if (list2 != null) {
                    for (PromotionLabel promotionLabel : list2) {
                        LabelIcon labelIcon2 = promotionLabel.icon;
                        if (labelIcon2 != null && (image = labelIcon2.lightIcon) != null && (urls = image.getUrls()) != null && (!urls.isEmpty())) {
                            LabelIcon labelIcon3 = promotionLabel.icon;
                            if (labelIcon3 != null && (image2 = labelIcon3.lightIcon) != null && (urls2 = image2.getUrls()) != null && (labelIcon = promotionLabel.icon) != null && (image3 = labelIcon.lightIcon) != null) {
                                C19411510wz c19411510wz = C19411510wz.LIZ;
                                if (c212199182j.LIZLLL) {
                                    enumC1769850w9n = EnumC1769850w9n.LIVE_AUCTION_CARD_TITLE_PREFIX;
                                } else {
                                    enumC1769850w9n = EnumC1769850w9n.LIVE_POP_CARD_TITLE_PREFIX;
                                }
                                image3.setUrls(C19411510wz.LIZJ(c19411510wz, urls2, enumC1769850w9n));
                            }
                            arrayList.add(promotionLabel);
                        } else if (C123100dR.LIZ(promotionLabel.text)) {
                            arrayList.add(promotionLabel);
                        }
                        Map<String, Object> map = promotionLabel.daInfo;
                        if (map != null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
                            Iterator<T> it3 = map.entrySet().iterator();
                            while (it3.hasNext()) {
                                Map.Entry entry = (Map.Entry) it3.next();
                                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                            }
                            this.LJ.putAll(linkedHashMap);
                        }
                    }
                }
            }
        }
        ((C18QS) this.LIZ).LJJJJLL(c212199182j.LIZ, arrayList, this.LJFF.LIZ(), false, null);
        int i = c212199182j.LIZJ;
        if (i > 0) {
            ((TextView) this.LIZ).setMaxLines(i);
        }
    }

    public final void LJIIL(int i) {
        if (i != ((TextView) this.LIZ).getMaxLines()) {
            ((TextView) this.LIZ).setMaxLines(i);
        }
    }
}
