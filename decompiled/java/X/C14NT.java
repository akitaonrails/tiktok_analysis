package X;

import Y.ARunnableS63S0300000_30;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.nimblecard.tako.model.Event;
import com.ss.android.ugc.aweme.nimblecard.tako.model.Layout;
import com.ss.android.ugc.aweme.nimblecard.tako.model.NimbleViewProps;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS515S0200000_30;

/* JADX INFO: renamed from: X.14NT, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C14NT<V_TYPE extends View> implements C14NX {
    public final NimbleTemplateContext LIZ;
    public String LIZJ;
    public V_TYPE LIZLLL;
    public String LJI;
    public String LJII;
    public InterfaceC689530R2x LJIIIIZZ;
    public TemplateData LJIIIZ;
    public C14NF LJIIJJI;
    public final Map<String, Object> LJ = new LinkedHashMap();
    public final Map<String, Object> LJFF = new LinkedHashMap();
    public final C14O8 LIZIZ = LJJII();
    public Map<String, ? extends Object> LJIIJ = C2097608Jq.LJ();

    @Override // X.C14NX
    public final void LJIIIZ() {
        this.LJIIIIZZ = null;
    }

    public void LJJIFFI(Map<String, ? extends Object> map, C14NF c14nf) {
    }

    public C14O8 LJJII() {
        return C20256914Nz.LIZ(this, true);
    }

    public abstract V_TYPE LJJIII(Context context);

    public final Context LJJI() {
        return this.LIZ.LLILZ;
    }

    public final void LJJIIJ() {
        String str;
        NimbleViewProps nimbleViewProps;
        Map<String, Object> map;
        ((LinkedHashMap) this.LJ).clear();
        this.LJ.put("data", this.LJIIJ);
        C14NF c14nf = this.LJIIJJI;
        if (c14nf != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<C14ND> it2 = c14nf.LIZ.iterator();
            while (it2.hasNext()) {
                linkedHashMap.putAll(C14NE.LIZIZ(it2.next()));
            }
            this.LJ.putAll(linkedHashMap);
        }
        Map<String, Object> map2 = this.LJ;
        LinkedHashMap linkedHashMap2 = null;
        INimbleModelAbility iNimbleModelAbility = (INimbleModelAbility) C1558520qew.LIZ(LIZIZ(), INimbleModelAbility.class, null);
        map2.put("model", iNimbleModelAbility != null ? iNimbleModelAbility.Zo0() : null);
        Map<String, Object> map3 = this.LJ;
        INimbleModelAbility iNimbleModelAbility2 = (INimbleModelAbility) C1558520qew.LIZ(LIZIZ(), INimbleModelAbility.class, null);
        map3.put("cache", iNimbleModelAbility2 != null ? iNimbleModelAbility2.KD2() : null);
        Map<String, Object> map4 = this.LJ;
        INimbleModelAbility iNimbleModelAbility3 = (INimbleModelAbility) C1558520qew.LIZ(LIZIZ(), INimbleModelAbility.class, null);
        map4.put("tracker", iNimbleModelAbility3 != null ? iNimbleModelAbility3.G7() : null);
        this.LIZ.getClass();
        this.LJ.put("global", this.LIZ.LLILLL.LIZ);
        TemplateData element = getElement();
        if (element != null && (nimbleViewProps = element.props) != null && (map = nimbleViewProps.starlingParams) != null) {
            linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            Iterator<T> it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                linkedHashMap2.put(entry.getKey(), LJ(entry.getValue()));
            }
        }
        this.LJ.put("starlingParams", linkedHashMap2);
        TemplateData element2 = getElement();
        if (element2 == null || (str = element2.id) == null) {
            return;
        }
        this.LJI = LJIJJ(str);
    }

    @Override // X.C14NX
    public final V_TYPE getView() {
        NimbleViewProps nimbleViewProps;
        String str;
        V_TYPE v_type = this.LIZLLL;
        if (v_type != null) {
            return v_type;
        }
        NimbleTemplateContext nimbleTemplateContext = this.LIZ;
        Context c1361400lX0 = nimbleTemplateContext.LLILZ;
        C14NX c14nx = nimbleTemplateContext.LLJIJIL;
        String strLJIJJ = null;
        if (c14nx != null) {
            TemplateData templateData = c14nx.getTemplateData();
            if (templateData != null && (nimbleViewProps = templateData.props) != null && (str = nimbleViewProps.theme) != null) {
                strLJIJJ = c14nx.LJIJJ(str);
            }
            c1361400lX0 = new C1361400lX0(c1361400lX0, Intrinsics.LJFF(C20741716El.LIZIZ(strLJIJJ), "Dark") ? R.style.y0 : R.style.y3);
        }
        V_TYPE v_type2 = (V_TYPE) LJJIII(c1361400lX0);
        this.LIZLLL = v_type2;
        return v_type2;
    }

    @Override // X.C14NX
    public final NimbleTemplateContext LIZIZ() {
        return this.LIZ;
    }

    @Override // X.C14NX
    public final Map<String, Object> LIZJ() {
        return this.LJIIJ;
    }

    @Override // X.C14NX
    public final Map<String, Object> LIZLLL() {
        return this.LJFF;
    }

    @Override // X.C14NX
    public final C14O8 LJFF() {
        return this.LIZIZ;
    }

    @Override // X.C14NX
    public final C14NF LJIIIIZZ() {
        return this.LJIIJJI;
    }

    @Override // X.C14NX
    public final String LJIIJJI() {
        return this.LIZJ;
    }

    @Override // X.C14NX
    public final Map<String, Object> LJIILL() {
        return this.LJ;
    }

    @Override // X.C14NX
    public TemplateData getElement() {
        return this.LJIIIZ;
    }

    @Override // X.C14NX
    public final String getId() {
        return this.LJI;
    }

    @Override // X.C14NX
    public final TemplateData getTemplateData() {
        return this.LJIIIZ;
    }

    @Override // X.C14NX
    public final String getType() {
        return this.LJII;
    }

    public C14NT(NimbleTemplateContext nimbleTemplateContext) {
        this.LIZ = nimbleTemplateContext;
    }

    @Override // X.C14NX
    public final Object LJ(Object obj) {
        if (obj instanceof String) {
            return LJIIZILJ((String) obj);
        }
        return obj;
    }

    @Override // X.C14NX
    public final void LJI(InterfaceC689530R2x interfaceC689530R2x) {
        this.LJIIIIZZ = interfaceC689530R2x;
    }

    @Override // X.C14NX
    public void LJII(TemplateData templateData) {
        String strLIZIZ;
        String str;
        List<Event> list;
        List<Event> list2;
        Integer numValueOf;
        if (templateData == null) {
            return;
        }
        this.LJIIIZ = templateData;
        InterfaceC689530R2x interfaceC689530R2x = this.LJIIIIZZ;
        if (interfaceC689530R2x != null) {
            List<C14NX> listLIZ = interfaceC689530R2x.LIZ();
            String type = null;
            if (listLIZ != null) {
                numValueOf = Integer.valueOf(listLIZ.indexOf(this));
            } else {
                numValueOf = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            InterfaceC689530R2x interfaceC689530R2x2 = this.LJIIIIZZ;
            if (interfaceC689530R2x2 != null) {
                type = interfaceC689530R2x2.getType();
            }
            sbLIZ.append(type);
            sbLIZ.append('_');
            sbLIZ.append(numValueOf);
            sbLIZ.append('_');
            sbLIZ.append(templateData.type);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = templateData.type;
        }
        this.LJII = strLIZIZ;
        if (getView().getLayoutParams() == null) {
            C786410Ut5.W5(getView(), new ViewGroup.MarginLayoutParams(-2, -2));
        }
        InterfaceC689530R2x interfaceC689530R2x3 = this.LJIIIIZZ;
        if (interfaceC689530R2x3 != null) {
            interfaceC689530R2x3.LJIJ();
        }
        LJJIIJZLJL(true);
        Context context = C14P7.LIZ;
        TemplateData element = getElement();
        if (element != null && (list2 = element.event) != null) {
            ArrayList arrayList = new ArrayList();
            for (Event event : list2) {
                if (Intrinsics.LJFF(event.action, "click")) {
                    arrayList.add(event);
                }
            }
            if (!arrayList.isEmpty()) {
                C786410Ut5.I7(new AbS515S0200000_30(arrayList, this, 1), getView());
            }
        }
        TemplateData element2 = getElement();
        if (element2 != null && (list = element2.event) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Event event2 : list) {
                if (Intrinsics.LJFF(event2.action, "longClick")) {
                    arrayList2.add(event2);
                }
            }
            if (!arrayList2.isEmpty()) {
                getView().setOnLongClickListener(new ViewOnLongClickListenerC20306714cz(arrayList2, this, 1));
            }
        }
        TemplateData element3 = getElement();
        if (element3 != null && (str = element3.id) != null) {
            this.LJI = LJIJJ(str);
        }
    }

    @Override // X.C14NX
    public final void LJIIJ(Map map) {
        this.LJIIJ = map;
        this.LJIIJJI = null;
        LJJIIJ();
    }

    @Override // X.C14NX
    public final void LJIILIIL(String str) {
        this.LIZJ = str;
    }

    @Override // X.C14NX
    public final Object LJIIZILJ(String str) {
        if (C20252814Mk.LJFF(str)) {
            Object objLIZ = this.LIZ.LLILZIL.LIZ(C20252814Mk.LJII(str), this.LJ, null, C20252814Mk.LIZ);
            C14NN.LIZ.getClass();
            C14NN.LIZIZ();
            return objLIZ;
        }
        return C20252814Mk.LJ(str);
    }

    @Override // X.C14NX
    public final String LJIJJ(String str) {
        if (C20252814Mk.LJFF(str)) {
            String strValueOf = String.valueOf(this.LIZ.LLILZIL.LIZ(C20252814Mk.LJII(str), this.LJ, null, C20252814Mk.LIZ));
            C14NN.LIZ.getClass();
            C14NN.LIZIZ();
            return strValueOf;
        }
        return str;
    }

    public void LJJIIJZLJL(boolean z) {
        Layout layout;
        TemplateData element = getElement();
        if (element != null) {
            layout = element.layout;
        } else {
            layout = null;
        }
        C14P7.LIZLLL(this, layout, z);
        C14RB.LJII(this, getElement(), z);
    }

    @Override // X.C14NX
    public void LJIILJJIL(Map<String, ? extends Object> map, C14NF c14nf) {
        List<Event> list;
        Map<String, Object> mapKD2;
        C14NJ next;
        this.LJIIJ = map;
        this.LJIIJJI = c14nf;
        LJJIIJ();
        Context context = C14P7.LIZ;
        TemplateData element = getElement();
        if (element != null && (list = element.event) != null) {
            ArrayList<Event> arrayList = new ArrayList();
            for (Event event : list) {
                if (Intrinsics.LJFF(event.action, "show")) {
                    arrayList.add(event);
                }
            }
            if (!arrayList.isEmpty()) {
                for (Event event2 : arrayList) {
                    Iterator<C14NJ> it2 = this.LIZ.LLILLL.LIZJ.iterator();
                    while (true) {
                        mapKD2 = null;
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(next.getName(), event2.eventName)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C14NJ c14nj = next;
                    boolean zLJFF = true;
                    if (((Number) C07EB.LIZ.getValue()).intValue() == 1) {
                        C786410Ut5.h4().execute(new ARunnableS63S0300000_30(c14nj, event2, this, 9));
                    } else if (c14nj != null) {
                        String str = event2.condition;
                        if (str != null) {
                            if (str.length() > 0) {
                                Object objLJIIZILJ = LJIIZILJ(event2.condition);
                                if (!(objLJIIZILJ instanceof Boolean)) {
                                    objLJIIZILJ = null;
                                }
                                zLJFF = Intrinsics.LJFF(objLJIIZILJ, Boolean.TRUE);
                            } else {
                                zLJFF = false;
                            }
                        }
                        Boolean bool = event2.isOnce;
                        if (bool != null && bool.booleanValue()) {
                            INimbleModelAbility iNimbleModelAbility = (INimbleModelAbility) C1558520qew.LIZ(this.LIZ, INimbleModelAbility.class, null);
                            if (iNimbleModelAbility != null) {
                                mapKD2 = iNimbleModelAbility.KD2();
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(event2.eventName);
                            sbLIZ.append('_');
                            sbLIZ.append(event2.action);
                            sbLIZ.append('_');
                            sbLIZ.append(this.LJII);
                            sbLIZ.append("_is_one");
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            if (mapKD2 != null) {
                                if (!Intrinsics.LJFF(mapKD2.get(strLIZIZ), Boolean.TRUE)) {
                                    if (mapKD2 != null) {
                                        mapKD2.put(strLIZIZ, Boolean.TRUE);
                                    }
                                }
                            }
                        }
                        if (zLJFF) {
                            c14nj.LIZ(event2.params, this, this.LJIIJ, this.LJIIJJI);
                        }
                    }
                }
            }
        }
        LJJIIJZLJL(false);
        LJJIFFI(map, c14nf);
    }

    @Override // X.C14NX
    public final Object LJJ(String str, Map<String, ? extends Object> map) {
        if (C20252814Mk.LJFF(str)) {
            this.LJ.putAll(map);
            Object objLIZ = this.LIZ.LLILZIL.LIZ(C20252814Mk.LJII(str), this.LJ, null, C20252814Mk.LIZ);
            ((LinkedHashMap) this.LJ).keySet().removeAll(map.keySet());
            C14NN.LIZ.getClass();
            C14NN.LIZIZ();
            return objLIZ;
        }
        return C20252814Mk.LJ(str);
    }

    @Override // X.C14NX
    public Pair LJIILLIIL(float f, float f2, int i, int i2) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseNimbleViewManager measure ");
        TemplateData templateData = this.LJIIIZ;
        if (templateData != null) {
            str = templateData.type;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append("  width:");
        sbLIZ.append(f);
        sbLIZ.append(" height:");
        sbLIZ.append(f2);
        sbLIZ.append(" widthMode:");
        sbLIZ.append(i);
        sbLIZ.append(" heightMode:");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        getView().measure(View.MeasureSpec.makeMeasureSpec((int) f, i), View.MeasureSpec.makeMeasureSpec((int) f2, i2));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("view.measuredWidth ");
        sbLIZ2.append(getView().getMeasuredWidth());
        sbLIZ2.append("  view.measuredHeight:");
        sbLIZ2.append(getView().getMeasuredWidth());
        C2188811AlT.LIZIZ(sbLIZ2);
        return new Pair(Float.valueOf(getView().getMeasuredWidth()), Float.valueOf(getView().getMeasuredHeight()));
    }

    @Override // X.C14NX
    public void LJIJI(int i, int i2, int i3, int i4) {
        if (getView().getVisibility() == 8) {
            return;
        }
        getView().measure(View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824));
        getView().layout(i, i2, i3, i4);
    }
}
