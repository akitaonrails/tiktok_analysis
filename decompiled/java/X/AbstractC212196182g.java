package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.182g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC212196182g<T extends ViewGroup> extends AbstractC212220183e<T, C212244184c> implements C182C, C181P {
    public boolean LJ;
    public final Map<PromotionLabel, View> LJFF;
    public Map<EnumC1981207pS, ? extends InterfaceC212247184f> LJI;
    public C184X<ViewGroup> LJII;
    public final Map<String, String> LJIIIIZZ;
    public boolean LJIIIZ;

    @Override // X.C182C
    public final void destroy() {
        C0NOH c0noh;
        this.LIZJ = null;
        C184X<ViewGroup> c184x = this.LJII;
        if (c184x != null && (c0noh = c184x.LJIIIZ) != null) {
            c0noh.LIZJ();
        }
        ((LinkedHashMap) this.LJFF).clear();
        this.LJII = null;
        this.LJ = false;
    }

    @Override // X.C181P
    public final Map<String, String> LIZIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIILLIIL(linkedHashMap);
        return linkedHashMap;
    }

    public final void LJIIJJI() {
        if (this.LJIIIZ) {
            this.LJIIIZ = false;
            LJIILLIIL(this.LJIIIIZZ);
        }
    }

    public final List<String> LJIIL() {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.LJFF).entrySet()) {
            PromotionLabel promotionLabel = (PromotionLabel) entry.getKey();
            View view = (View) entry.getValue();
            if (Intrinsics.LJFF(view.getParent(), this.LIZ) && view.getWidth() > 0) {
                Map<String, Object> map = promotionLabel.daInfo;
                Object obj2 = null;
                if (map != null && (obj = map.get("activity_name")) != null && C123100dR.LIZ(obj.toString())) {
                    obj2 = obj;
                }
                arrayList.add(String.valueOf(obj2));
            }
        }
        return arrayList;
    }

    public final String LJIILIIL() {
        C0NOH c0noh;
        C184X<ViewGroup> c184x = this.LJII;
        if (c184x == null || (c0noh = c184x.LJIIIZ) == null) {
            return null;
        }
        long j = c0noh.LIZ;
        return j > 86400000 ? "gt_24" : j > 3600000 ? "in_24" : j > 0 ? "in_1" : "no_countdown";
    }

    public final String LJIILJJIL() {
        Integer num;
        C0NOH c0noh;
        C184X<ViewGroup> c184x = this.LJII;
        if (c184x == null || (num = c184x.LJIIJJI) == null || num.intValue() != 4 || (c0noh = c184x.LJIIIZ) == null) {
            return null;
        }
        int i = c0noh.LIZJ;
        if (i == 2) {
            return "on_sale";
        }
        if (i == 4) {
            return "warm_up";
        }
        return null;
    }

    public final List<String> LJIILL() {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.LJFF).entrySet()) {
            PromotionLabel promotionLabel = (PromotionLabel) entry.getKey();
            View view = (View) entry.getValue();
            if (Intrinsics.LJFF(view.getParent(), this.LIZ) && view.getWidth() > 0) {
                Map<String, Object> map = promotionLabel.daInfo;
                Object obj2 = null;
                if (map != null && (obj = map.get("product_promotion_tag")) != null && C123100dR.LIZ(obj.toString())) {
                    obj2 = obj;
                }
                arrayList.add(String.valueOf(obj2));
                Map<String, Object> map2 = promotionLabel.daInfo;
                if (map2 != null) {
                    arrayList.add(map2.toString());
                }
            }
        }
        return arrayList;
    }

    @Override // X.C181P
    public final Map<String, String> LIZ() {
        return (!LJI() || this.LIZ.getAlpha() < 0.0f) ? C2097608Jq.LJ() : this.LJIIIIZZ;
    }

    @Override // X.AbstractC212220183e
    public final boolean LJIIJ(boolean z) {
        boolean zLJIIJ = super.LJIIJ(z);
        if (zLJIIJ) {
            this.LJIIIZ = true;
        }
        return zLJIIJ;
    }

    public final void LJIILLIIL(Map<String, String> map) {
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        String strLJJLIIIJ3;
        String strLJIIIIZZ;
        if (!this.LJFF.isEmpty() && LJI()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setShowPromotionEventWithoutCountDownTag view count = ");
            sbLIZ.append(((ViewGroup) this.LIZ).getChildCount());
            sbLIZ.append(" , item count = ");
            sbLIZ.append(this.LJFF.size());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
            Iterator it2 = ((LinkedHashMap) this.LJFF).entrySet().iterator();
            while (true) {
                strLJJLIIIJ = "";
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                PromotionLabel promotionLabel = (PromotionLabel) entry.getKey();
                View view = (View) entry.getValue();
                if (Intrinsics.LJFF(view.getParent(), this.LIZ) && view.getWidth() > 0) {
                    Map<String, Object> map2 = promotionLabel.daInfo;
                    if (map2 != null) {
                        C115500cD.LIZIZ(map2, map);
                    }
                    String str = promotionLabel.text;
                    if (str != null) {
                        strLJJLIIIJ = str;
                    }
                    arrayList.add(strLJJLIIIJ);
                    arrayList2.add(Integer.valueOf(promotionLabel.type));
                    Map<String, Object> map3 = promotionLabel.daInfo;
                    if (map3 != null && (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map3)) != null) {
                        arrayList3.add(strLJIIIIZZ);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                strLJJLIIIJ2 = "";
            } else {
                strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            }
            map.put("discount_tag_info", strLJJLIIIJ2);
            map.put("discount_tag_cnt", String.valueOf(arrayList.size()));
            if (arrayList2.isEmpty()) {
                strLJJLIIIJ3 = "";
            } else {
                strLJJLIIIJ3 = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
            }
            map.put("product_tag", strLJJLIIIJ3);
            if (!arrayList3.isEmpty()) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList3, "|||", null, null, 0, null, null, 62);
            }
            map.put("product_promotion_tag", strLJJLIIIJ);
            return;
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJII("promotionShowItems is empty or promotion is hidden");
    }

    public AbstractC212196182g(String str, ViewGroup viewGroup) {
        super(viewGroup, str);
        this.LJFF = new LinkedHashMap();
        this.LJI = C1917107f7.LIZ();
        this.LJIIIIZZ = new LinkedHashMap();
        this.LJIIIZ = true;
    }
}
