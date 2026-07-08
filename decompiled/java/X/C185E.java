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

/* JADX INFO: renamed from: X.185E, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C185E extends C185J<C18QS, C212276185i> {
    public final Map<String, String> LIZLLL;
    public C0GS5 LJ;

    public C185E(C18QS c18qs) {
        super(c18qs);
        this.LIZLLL = new LinkedHashMap();
        this.LJ = new C0GS3();
    }

    public final void LJIIJ(C212276185i c212276185i) {
        Image image;
        List<String> urls;
        ((LinkedHashMap) this.LIZLLL).clear();
        ArrayList arrayList = new ArrayList();
        List<PlacementLabel> list = c212276185i.LIZIZ;
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
                        LabelIcon labelIcon = promotionLabel.icon;
                        if ((labelIcon != null && (image = labelIcon.lightIcon) != null && (urls = image.getUrls()) != null && (!urls.isEmpty())) || C123100dR.LIZ(promotionLabel.text)) {
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
                            this.LIZLLL.putAll(linkedHashMap);
                        }
                    }
                }
            }
        }
        ((C18QS) this.LIZ).LJJJJLL(c212276185i.LIZ, arrayList, this.LJ.LIZ(), false, null);
        int i = c212276185i.LIZJ;
        if (i > 0) {
            ((TextView) this.LIZ).setMaxLines(i);
        }
    }

    public final void LJIIJJI(int i) {
        if (i != ((TextView) this.LIZ).getMaxLines()) {
            ((TextView) this.LIZ).setMaxLines(i);
        }
    }
}
