package X;

import Y.ACListenerS127S0200000_25;
import Y.ACListenerS89S0300000_25;
import Y.AfS194S0100000_25;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ssl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1643970ssl implements InterfaceC1644620sto {
    public final InterfaceC1643980ssm LIZ;
    public final C19YA LIZIZ;
    public final InterfaceC1640280smo LIZJ;
    public final Map<EffectCategoryResponse, List<FilterBean>> LIZLLL = new LinkedHashMap();
    public final Map<Object, View> LJ = new LinkedHashMap();
    public boolean LJFF = true;
    public final C11RK LJI = new C11RK();
    public final C11RK LJII = new C11RK();
    public final C11RK LJIIIIZZ = new C11RK();

    @Override // X.InterfaceC1644620sto
    public final C19475711Hn LIZ() {
        C11RK c11rk = this.LJI;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1643980ssm
    public final FilterBean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // X.InterfaceC1643980ssm
    public final C11NZ<FilterBean> LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // X.InterfaceC1643980ssm
    public final C11NZ<FilterBean> LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // X.InterfaceC1644620sto
    public final C19475711Hn LJII() {
        C11RK c11rk = this.LJII;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1643980ssm
    public final C11NZ<C1641660sp2<C1640210smh>> LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // X.InterfaceC1644620sto
    public final C19475711Hn LJIILL() {
        C11RK c11rk = this.LJIIIIZZ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1644620sto
    public final C19YA LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1643980ssm
    public final void LJ(FilterBean filterBean) {
        this.LIZ.LJ(filterBean);
    }

    @Override // X.InterfaceC1644620sto
    public final void LJIIIIZZ(boolean z) {
        this.LJFF = z;
    }

    @Override // X.InterfaceC1644620sto
    public final void LJIIL(View view) {
        Object obj = C1644630stp.LJFF;
        this.LJ.put(obj, view);
        LJIILLIIL(view, obj);
    }

    @Override // X.InterfaceC1643980ssm
    public final void LJIILIIL(FilterBean filterBean) {
        this.LIZ.LJIILIIL(filterBean);
    }

    @Override // X.InterfaceC1644000sso
    public final void LJIILJJIL(Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map) {
        ((LinkedHashMap) this.LIZLLL).clear();
        this.LIZLLL.putAll(map);
        List<? extends EffectCategoryResponse> listLLIIII = C13LP.LLIIII(((LinkedHashMap) this.LIZLLL).keySet());
        LJIJI(listLLIIII);
        this.LIZ.LJIILJJIL(this.LIZLLL);
        FilterBean filterBeanLIZJ = LIZJ();
        if (filterBeanLIZJ != null) {
            LJIILIIL(filterBeanLIZJ);
            LJIIIZ(filterBeanLIZJ, false);
            return;
        }
        EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) C13LP.LJJJLZIJ(0, listLLIIII);
        if (effectCategoryResponse != null) {
            LJIJ(effectCategoryResponse, false, false);
        } else {
            LJIJ(null, false, false);
        }
    }

    public void LJIJI(List<? extends EffectCategoryResponse> list) {
        this.LIZIZ.removeAllTabs();
        for (EffectCategoryResponse effectCategoryResponse : list) {
            if (!Intrinsics.LJFF(effectCategoryResponse, C1638720skI.LIZJ)) {
                C1642680sqg c1642680sqgLJIIZILJ = LJIIZILJ(this.LIZIZ.getContext(), effectCategoryResponse);
                C12H3 c12h3NewTab = this.LIZIZ.newTab();
                c12h3NewTab.LJ = c1642680sqgLJIIZILJ;
                c12h3NewTab.LIZIZ();
                this.LIZIZ.addTab(c12h3NewTab);
                C786410Ut5.I7(new ACListenerS127S0200000_25(this, effectCategoryResponse, 5), c1642680sqgLJIIZILJ);
                if (C2219091BtD.LIZIZ()) {
                    c1642680sqgLJIIZILJ.setOnLongClickListener(new ViewOnLongClickListenerC1698090uI3(this, effectCategoryResponse, 1));
                }
            }
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LJ).entrySet()) {
            LJIILLIIL((View) entry.getValue(), entry.getKey());
        }
    }

    @Override // X.InterfaceC1643980ssm
    public final void LJI(C1640210smh c1640210smh, boolean z) {
        this.LIZ.LJI(c1640210smh, z);
    }

    @Override // X.InterfaceC1644620sto
    public final void LJIIIZ(FilterBean filterBean, boolean z) {
        EffectCategoryResponse effectCategoryResponse;
        Object next;
        Object next2;
        boolean zLIZJ;
        EffectCategoryResponse effectCategoryResponse2;
        Iterator it2 = ((LinkedHashMap) this.LIZLLL).entrySet().iterator();
        while (true) {
            effectCategoryResponse = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((EffectCategoryResponse) ((Map.Entry) next).getKey()).getKey(), filterBean.getCategoryKey())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null && (effectCategoryResponse2 = (EffectCategoryResponse) entry.getKey()) != null) {
            effectCategoryResponse = effectCategoryResponse2;
        } else {
            Iterator it3 = ((LinkedHashMap) this.LIZLLL).entrySet().iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    Iterator it4 = ((Iterable) ((Map.Entry) next2).getValue()).iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            Object next3 = it4.next();
                            FilterBean filterBean2 = (FilterBean) next3;
                            Boolean boolValueOf = Boolean.valueOf(C1638720skI.LIZIZ(filterBean, filterBean2));
                            if (boolValueOf.booleanValue()) {
                                zLIZJ = boolValueOf.booleanValue();
                            } else {
                                zLIZJ = C1638720skI.LIZJ(filterBean, filterBean2);
                            }
                            if (zLIZJ) {
                                if (next3 != null) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            Map.Entry entry2 = (Map.Entry) next2;
            if (entry2 != null) {
                effectCategoryResponse = (EffectCategoryResponse) entry2.getKey();
            }
        }
        LJIJ(effectCategoryResponse, false, z);
    }

    @Override // X.InterfaceC1643980ssm
    public final void LJIIJ(FilterBean filterBean, boolean z) {
        this.LIZ.LJIIJ(filterBean, false);
    }

    public final void LJIILLIIL(View view, Object obj) {
        C12H3 c12h3NewTab = this.LIZIZ.newTab();
        c12h3NewTab.LJ = view;
        c12h3NewTab.LIZIZ();
        c12h3NewTab.LIZ = obj;
        C786410Ut5.I7(new ACListenerS89S0300000_25(this, view, obj, 3), (View) view.getParent());
        this.LIZIZ.addTab(c12h3NewTab, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0smr] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public C1642680sqg LJIIZILJ(Context context, EffectCategoryResponse effectCategoryResponse) {
        final C1642680sqg c1642680sqgLIZIZ = C1641140soC.LIZIZ(context);
        int iLIZIZ = (int) C11VU.LIZIZ(4.0f, context);
        c1642680sqgLIZIZ.setPadding(iLIZIZ, 0, iLIZIZ, 0);
        if (TextUtils.isEmpty(effectCategoryResponse.getIcon_normal_url())) {
            c1642680sqgLIZIZ.setText(effectCategoryResponse.getName());
        } else {
            String icon_normal_url = effectCategoryResponse.getIcon_normal_url();
            if (icon_normal_url == null) {
                icon_normal_url = "";
            }
            c1642680sqgLIZIZ.setImage(icon_normal_url);
        }
        InterfaceC1640280smo interfaceC1640280smo = this.LIZJ;
        if (interfaceC1640280smo != 0) {
            interfaceC1640280smo.LIZIZ(effectCategoryResponse, new IIsTagNeedUpdatedListener() { // from class: X.0smr
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
                public final void onTagNeedNotUpdate() {
                    c1642680sqgLIZIZ.LIZ(false);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
                public final void onTagNeedUpdate() {
                    c1642680sqgLIZIZ.LIZ(true);
                }
            });
        }
        return c1642680sqgLIZIZ;
    }

    public C1643970ssl(InterfaceC1643980ssm interfaceC1643980ssm, C19YA c19ya, InterfaceC1640280smo interfaceC1640280smo) {
        this.LIZ = interfaceC1643980ssm;
        this.LIZIZ = c19ya;
        this.LIZJ = interfaceC1640280smo;
        C11NJ c11nj = new C11NJ();
        C11NZ<FilterBean> c11nzLIZLLL = interfaceC1643980ssm.LIZLLL();
        AfS194S0100000_25 afS194S0100000_25 = new AfS194S0100000_25(this, 187);
        C1701960uOI c1701960uOI = C19487811Me.LJ;
        c11nj.LIZ(c11nzLIZLLL.LJJLL(afS194S0100000_25, c1701960uOI));
        c11nj.LIZ(interfaceC1643980ssm.LJIIJJI().LJJLL(new AfS194S0100000_25(this, 189), c1701960uOI));
        c11nj.LIZ(interfaceC1643980ssm.LJFF().LJJLL(new AfS194S0100000_25(this, 191), c1701960uOI));
        c19ya.addOnTabSelectedListener(new InterfaceC19561911g9() { // from class: X.0ssk
            @Override // X.InterfaceC19561911g9
            public final void LIZ(C12H3 c12h3) {
            }

            @Override // X.InterfaceC19561911g9
            public final void LIZIZ(C12H3 c12h3) {
            }

            @Override // X.InterfaceC19561911g9
            public final void LIZJ(C12H3 c12h3, boolean z) {
                EffectCategoryResponse effectCategoryResponse;
                C1642680sqg c1642680sqg;
                View view = c12h3.LJ;
                if (view == null) {
                    return;
                }
                if ((view instanceof C1642680sqg) && (c1642680sqg = (C1642680sqg) view) != null) {
                    c1642680sqg.LIZ(false);
                }
                C1643970ssl c1643970ssl = this.LIZ;
                InterfaceC1640280smo interfaceC1640280smo2 = c1643970ssl.LIZJ;
                if (interfaceC1640280smo2 != null && (effectCategoryResponse = (EffectCategoryResponse) C13LP.LJJJJL(((LinkedHashMap) c1643970ssl.LIZLLL).keySet(), c12h3.LIZLLL)) != null) {
                    interfaceC1640280smo2.LIZ(effectCategoryResponse, null);
                }
            }
        });
        c19ya.setOnTabClickListener(new InterfaceC1638460sjs() { // from class: X.0ssn
            @Override // X.InterfaceC1638460sjs
            public final void LIZ(C12H3 c12h3) {
                if (this.LIZ.LIZIZ.getTabCount() - 1 == c12h3.LIZLLL && !Intrinsics.LJFF(c12h3.LIZ, C1644630stp.LJFF)) {
                    c12h3.LIZ();
                }
            }
        });
    }

    public final void LJIJ(EffectCategoryResponse effectCategoryResponse, boolean z, boolean z2) {
        int i;
        View view;
        List list;
        FilterBean filterBean;
        if (effectCategoryResponse != null) {
            i = 0;
            for (Object obj : ((LinkedHashMap) this.LIZLLL).keySet()) {
                if (i >= 0) {
                    if (Intrinsics.LJFF(((EffectCategoryResponse) obj).getId(), effectCategoryResponse.getId())) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        if (z && effectCategoryResponse != null && (list = (List) ((LinkedHashMap) this.LIZLLL).get(effectCategoryResponse)) != null && (filterBean = (FilterBean) C13LP.LJJJLL(list)) != null) {
            this.LIZ.LJ(filterBean);
        }
        C12H3 tabAt = this.LIZIZ.getTabAt(i);
        if (tabAt != null) {
            tabAt.LIZ();
        }
        if (!z2) {
            if (i >= 0) {
                if (this.LIZIZ.getSelectedTabPosition() == i) {
                    return;
                }
            } else {
                if (this.LIZIZ.getCurSelectedTab() != null && (view = this.LIZIZ.getCurSelectedTab().LJ) != null) {
                    view.setSelected(false);
                }
                this.LIZIZ.unSelectTab();
                return;
            }
        }
        C12H3 tabAt2 = this.LIZIZ.getTabAt(i);
        if (tabAt2 != null) {
            tabAt2.LIZ();
        }
    }
}
