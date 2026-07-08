package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.LabelCountdown;
import defpackage.d6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS493S0200000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.184g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC212248184g<T extends ViewGroup> extends C185J<T, C212257184p> implements InterfaceC212261184t, C185Z {
    public boolean LIZLLL;
    public final Map<PromotionLabel, View> LJ;
    public Map<EnumC1981207pS, ? extends InterfaceC212247184f> LJFF;
    public C212249184h<ViewGroup> LJI;
    public final Map<String, String> LJII;
    public boolean LJIIIIZZ;
    public C212257184p LJIIIZ;

    @Override // X.InterfaceC212261184t
    public final void destroy() {
        C0NOH c0noh;
        this.LIZIZ = null;
        C212249184h<ViewGroup> c212249184h = this.LJI;
        if (c212249184h != null && (c0noh = c212249184h.LJIIIIZZ) != null) {
            c0noh.LIZJ();
        }
        ((LinkedHashMap) this.LJ).clear();
        this.LJI = null;
        this.LIZLLL = false;
    }

    @Override // X.C185Z
    public final Map<String, String> LIZIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIILJJIL(linkedHashMap);
        return linkedHashMap;
    }

    @Override // X.C185Z
    public final void LIZJ() {
        if (this.LJIIIIZZ) {
            this.LJIIIIZZ = false;
            LJIILJJIL(this.LJII);
        }
    }

    public final List<String> LJIIJJI() {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.LJ).entrySet()) {
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

    public final String LJIIL() {
        C0NOH c0noh;
        C212249184h<ViewGroup> c212249184h = this.LJI;
        if (c212249184h == null || (c0noh = c212249184h.LJIIIIZZ) == null) {
            return null;
        }
        long j = c0noh.LIZ;
        return j > 86400000 ? "gt_24" : j > 3600000 ? "in_24" : j > 0 ? "in_1" : "no_countdown";
    }

    public final String LJIILIIL() {
        Integer num;
        C0NOH c0noh;
        C212249184h<ViewGroup> c212249184h = this.LJI;
        if (c212249184h == null || (num = c212249184h.LJIIJ) == null || num.intValue() != 4 || (c0noh = c212249184h.LJIIIIZZ) == null) {
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

    @Override // X.C185Z
    public final Map<String, String> LIZ() {
        return (!LJFF() || this.LIZ.getAlpha() < 0.0f) ? C2097608Jq.LJ() : this.LJII;
    }

    public AbstractC212248184g(T t) {
        super(t);
        this.LJ = new LinkedHashMap();
        this.LJFF = C1917107f7.LIZ();
        this.LJII = new LinkedHashMap();
        this.LJIIIIZZ = true;
    }

    @Override // X.C185J
    public boolean LJIIIZ(boolean z) {
        boolean zLJIIIZ = super.LJIIIZ(z);
        if (zLJIIIZ) {
            this.LJIIIIZZ = true;
        }
        return zLJIIIZ;
    }

    public final void LJIILJJIL(Map<String, String> map) {
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        if (!this.LJ.isEmpty() && LJFF()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setShowPromotionEventWithoutCountDownTag view count = ");
            sbLIZ.append(((ViewGroup) this.LIZ).getChildCount());
            sbLIZ.append(" , item count = ");
            sbLIZ.append(this.LJ.size());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
            Iterator it2 = ((LinkedHashMap) this.LJ).entrySet().iterator();
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
                }
            }
            if (arrayList.isEmpty()) {
                strLJJLIIIJ2 = "";
            } else {
                strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            }
            map.put("discount_tag_info", strLJJLIIIJ2);
            map.put("discount_tag_cnt", String.valueOf(arrayList.size()));
            if (!arrayList2.isEmpty()) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
            }
            map.put("product_tag", strLJJLIIIJ);
            return;
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJII("promotionShowItems is empty or promotion is hidden");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.184n] */
    public final void LJIIJ(PromotionLabel promotionLabel, long j, long j2, boolean z) {
        long jLongValue;
        long jLongValue2;
        Object obj;
        C0NOH c0noh;
        String str;
        Long lLJIILIIL;
        String str2;
        Long lLJIILIIL2;
        LabelCountdown labelCountdown = promotionLabel.countdown;
        if (labelCountdown != null && (str2 = labelCountdown.startTime) != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str2)) != null) {
            jLongValue = lLJIILIIL2.longValue();
        } else {
            jLongValue = 0;
        }
        LabelCountdown labelCountdown2 = promotionLabel.countdown;
        if (labelCountdown2 != null && (str = labelCountdown2.endTime) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            jLongValue2 = lLJIILIIL.longValue();
        } else {
            jLongValue2 = 0;
        }
        if ((4 == promotionLabel.type || C05IU.LIZ(promotionLabel.defaultStyle)) && jLongValue > 0 && jLongValue2 > 0) {
            C0NOI c0noiLIZ = C0NOL.LIZ(jLongValue, jLongValue2, j, j2);
            if (c0noiLIZ != null) {
                C212249184h<ViewGroup> c212249184h = this.LJI;
                if (c212249184h != null && (c0noh = c212249184h.LJIIIIZZ) != null) {
                    c0noh.LIZJ();
                }
                ViewGroup viewGroup = (ViewGroup) this.LIZ;
                final C212252184k c212252184k = (C212252184k) this;
                C212249184h<ViewGroup> c212249184h2 = new C212249184h<>(viewGroup, z, new InterfaceC212259184r<ViewGroup>() { // from class: X.184n
                    @Override // X.InterfaceC212259184r
                    public final void LIZ() {
                        AbstractC212248184g<ViewGroup> abstractC212248184g = c212252184k;
                        abstractC212248184g.LJIIIZ(((ViewGroup) abstractC212248184g.LIZ).getChildCount() > 0);
                    }
                });
                Object objLIZ = C7726030a.LIZ(EnumC1981207pS.FLASH_SALE, this.LJFF);
                if (objLIZ == null) {
                    objLIZ = new C1916707f3();
                }
                c212249184h2.LJIILIIL(objLIZ);
                C212260184s c212260184s = new C212260184s(promotionLabel, c0noiLIZ);
                C0NOH c0noh2 = c212249184h2.LJIIIIZZ;
                if (c0noh2 != null) {
                    c0noh2.LIZJ();
                }
                C212334187o c212334187o = c212249184h2.LJIIIZ;
                if (c212334187o != null) {
                    C786410Ut5.LJJJLZIJ(c212334187o, viewGroup);
                }
                Integer num = null;
                c212249184h2.LJIIIZ = null;
                c212249184h2.LJIILJJIL(false);
                c212249184h2.LJIIJ = Integer.valueOf(promotionLabel.type);
                Map<String, Object> map = promotionLabel.daInfo;
                if (map != null && (obj = map.get("activity_name")) != null) {
                    obj.toString();
                }
                if (!c212249184h2.LJI && C212258184q.LJ(promotionLabel)) {
                    if (c212249184h2.LJIIIZ == null) {
                        C212334187o c212334187oLJIIIIZZ = c212249184h2.LJIIL().LJIIIIZZ(c212249184h2.LIZJ, promotionLabel);
                        viewGroup.addView(c212334187oLJIIIIZZ);
                        c212249184h2.LJIIIZ = c212334187oLJIIIIZZ;
                        if (c212334187oLJIIIIZZ != null) {
                            LabelCountdown labelCountdown3 = promotionLabel.countdown;
                            if (labelCountdown3 != null) {
                                num = labelCountdown3.showStyle;
                            }
                            c212334187oLJIIIIZZ.setCountDownShowStyle(num);
                        }
                    }
                } else {
                    C0NOH c0noh3 = new C0NOH();
                    c0noh3.LIZLLL(c0noiLIZ);
                    if (c0noh3.LIZIZ()) {
                        c0noh3.LIZ(new AwS493S0200000_32((C212249184h) c212249184h2, (C212249184h<ViewGroup>) c212260184s, (C212260184s) 2));
                        C0NOH.LJ(c0noh3);
                        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Type[");
                        sbLIZ.append(c212249184h2.LJIIJ);
                        sbLIZ.append("] first show state = ");
                        sbLIZ.append(c0noh3.LIZJ);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c2341109Fh.getClass();
                        C2341109Fh.LJ(strLIZIZ);
                        c212249184h2.LJIILL(c0noh3.LIZJ, promotionLabel, c0noh3.LIZ);
                    } else {
                        C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Type[");
                        sbLIZ2.append(c212249184h2.LJIIJ);
                        sbLIZ2.append("] is out of time");
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        c2341109Fh2.getClass();
                        C2341109Fh.LJ(strLIZIZ2);
                    }
                    c212249184h2.LJIIIIZZ = c0noh3;
                }
                this.LJI = c212249184h2;
                return;
            }
            return;
        }
        int i = promotionLabel.type;
        if (i == 8) {
            this.LIZLLL = true;
        }
        Context context = this.LIZJ;
        C212337187r c212337187rLIZ = C18QY.LIZ(promotionLabel, context, d6.LIZ(i));
        C212336187q c212336187q = new C212336187q(context, null, 0);
        c212336187q.LIZJ(c212337187rLIZ);
        this.LJ.put(promotionLabel, c212336187q);
        ((ViewGroup) this.LIZ).addView(c212336187q);
    }
}
