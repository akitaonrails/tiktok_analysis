package X;

import Y.ARunnableS132S0100000_32;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsResponse;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.zhiliaoapp.musically.R;
import g1c.AjS72S0100000_32;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18PX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18PX {
    public final Context LIZ;
    public final C0P0T LIZIZ;
    public final C18PS LIZJ;
    public volatile boolean LIZLLL;
    public volatile boolean LJ;

    public final boolean LIZIZ() {
        C0P0T c0p0t = this.LIZIZ;
        return c0p0t != null && c0p0t.isShowing();
    }

    public final void LIZLLL() {
        if (!this.LIZLLL || LIZIZ()) {
            return;
        }
        this.LJ = true;
        try {
            ExecutorC1592406Li.LLILLJJLI.execute(new ARunnableS132S0100000_32(this, 76));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZ() {
        if (LIZIZ() || this.LJ) {
            try {
                ExecutorC1592406Li.LLILLJJLI.execute(new ARunnableS132S0100000_32(this, 74));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LIZJ() {
        LIZ();
        this.LIZLLL = false;
        this.LJ = false;
        try {
            ExecutorC1592406Li.LLILLJJLI.execute(new ARunnableS132S0100000_32(this, 75));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C18PX(final Context context, final Fragment fragment, String str) {
        C18PS c18ps;
        HomeTabAbility homeTabAbilityLIZ;
        AbstractC1591090rVT abstractC1591090rVTHQ1;
        View viewLJIJI;
        boolean z;
        int iLIZIZ;
        int i;
        int iLIZIZ2;
        View view;
        Object objLIZ;
        Fragment fragment2;
        List<InterfaceC1583870rJp> listTz;
        InterfaceC1583870rJp interfaceC1583870rJp;
        this.LIZ = context;
        if (C294640Bgk.LIZ() == 4) {
            c18ps = new C18PS(context, fragment) { // from class: X.18PR
                public TuxIconView LLJILLL;
                public C197039127h LLJJ;
                public C18Q6 LLJJI;

                @Override // X.C18PS
                public final boolean LIZ() {
                    return false;
                }

                @Override // X.C18PS
                public int getBgColor() {
                    return R.attr.ee;
                }

                public final C197039127h getBtnShopFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LLJJ;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.cv1);
                        this.LLJJ = (C197039127h) callbackFindViewById;
                    }
                    return (C197039127h) callbackFindViewById;
                }

                public final TuxIconView getIvCloseFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LLJILLL;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.lc0);
                        this.LLJILLL = (TuxIconView) callbackFindViewById;
                    }
                    return (TuxIconView) callbackFindViewById;
                }

                public final C18Q6 getSwitcherProductDetailFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LLJJI;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.wvm);
                        this.LLJJI = (C18Q6) callbackFindViewById;
                    }
                    return (C18Q6) callbackFindViewById;
                }

                @Override // X.C18PS
                public final EnumC1782280wTq LIZIZ() {
                    return EnumC1782280wTq.BENEFIT_IMPACT_CARD;
                }

                public final void setBtnShopFromXml(C197039127h c197039127h) {
                    this.LLJJ = c197039127h;
                }

                public final void setIvCloseFromXml(TuxIconView tuxIconView) {
                    this.LLJILLL = tuxIconView;
                }

                public final void setSwitcherProductDetailFromXml(C18Q6 c18q6) {
                    this.LLJJI = c18q6;
                }

                {
                    super(0, context, null, fragment);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(278)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(142)));
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                    setLayoutParams(layoutParams);
                    C786410Ut5.Td(C786410Ut5.ne(new ContextThemeWrapper(context, R.style.z5)), R.layout.btd, this, true);
                    C786410Ut5.LLLLLLZZ(getIvCloseFromXml(), 8);
                    C786410Ut5.LLLLLLJ(getBtnShopFromXml(), 0);
                    C1744700vVE.LJIIIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), getBtnShopFromXml());
                    C2271391DvN.LIZ(getBtnShopFromXml(), (C1A5L) C2271381DvM.LLJZ.getValue());
                }

                @Override // X.C18PS
                public final C18Q6 LIZLLL(VSACardsResponse.VSACardData vSACardData, List list, C18PN c18pn) {
                    getBtnShopFromXml().setText(C123500dV.LIZIZ(vSACardData.btnText));
                    C786410Ut5.I7(new AjS72S0100000_32(this, 12), getBtnShopFromXml());
                    C426750GoL.LJIIIZ(getSwitcherProductDetailFromXml(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), false, 16);
                    return getSwitcherProductDetailFromXml().LIZ(list, c18pn);
                }
            };
        } else if (C294640Bgk.LIZIZ()) {
            c18ps = new C18PS(context, fragment) { // from class: X.18PP
                public TuxIconView LLJILLL;
                public C197039127h LLJJ;
                public C18Q6 LLJJI;
                public final boolean LLJJIII;

                @Override // X.C18PS
                public int getBgColor() {
                    return this.LLJJIII ? R.attr.ee : R.attr.e2;
                }

                public final C197039127h getBtnShopFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LLJJ;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.cv1);
                        this.LLJJ = (C197039127h) callbackFindViewById;
                    }
                    return (C197039127h) callbackFindViewById;
                }

                public final TuxIconView getIvCloseFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LLJILLL;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.lc0);
                        this.LLJILLL = (TuxIconView) callbackFindViewById;
                    }
                    return (TuxIconView) callbackFindViewById;
                }

                public final C18Q6 getSwitcherProductDetailFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LLJJI;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.wvm);
                        this.LLJJI = (C18Q6) callbackFindViewById;
                    }
                    return (C18Q6) callbackFindViewById;
                }

                @Override // X.C18PS
                public final EnumC1782280wTq LIZIZ() {
                    return EnumC1782280wTq.LARGE_CARD;
                }

                public final void setBtnShopFromXml(C197039127h c197039127h) {
                    this.LLJJ = c197039127h;
                }

                public final void setIvCloseFromXml(TuxIconView tuxIconView) {
                    this.LLJILLL = tuxIconView;
                }

                public final void setSwitcherProductDetailFromXml(C18Q6 c18q6) {
                    this.LLJJI = c18q6;
                }

                {
                    boolean z2;
                    ContextThemeWrapper contextThemeWrapper;
                    super(0, context, null, fragment);
                    if (C294640Bgk.LIZIZ() && C294640Bgk.LIZ() != 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.LLJJIII = z2;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(104)));
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                    setLayoutParams(layoutParams);
                    if (z2) {
                        contextThemeWrapper = new ContextThemeWrapper(context, R.style.z5);
                    } else {
                        contextThemeWrapper = new ContextThemeWrapper(context, R.style.y0);
                    }
                    C786410Ut5.Td(C786410Ut5.ne(contextThemeWrapper), R.layout.btd, this, true);
                    if (z2) {
                        getIvCloseFromXml().setTintColorRes(R.attr.a1j);
                    } else {
                        getIvCloseFromXml().setTintColorRes(R.attr.eg);
                    }
                    C786410Ut5.LLLLLLZZ(getIvCloseFromXml(), 0);
                    C786410Ut5.LLLLLLJ(getBtnShopFromXml(), 0);
                    C2271391DvN.LIZ(getBtnShopFromXml(), (C1A5L) C2271381DvM.LLJZ.getValue());
                    C2271391DvN.LIZ(getIvCloseFromXml(), (C1A5L) C2271381DvM.LLJZIJLIL.getValue());
                }

                @Override // X.C18PS
                public final C18Q6 LIZLLL(VSACardsResponse.VSACardData vSACardData, List list, C18PN c18pn) {
                    getBtnShopFromXml().setText(C123500dV.LIZIZ(vSACardData.btnText));
                    C786410Ut5.I7(new AjS72S0100000_32(this, 13), getBtnShopFromXml());
                    C786410Ut5.I7(new AjS72S0100000_32(this, 14), getIvCloseFromXml());
                    C426750GoL.LJIIIZ(getSwitcherProductDetailFromXml(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), 0, false, 16);
                    return getSwitcherProductDetailFromXml().LIZ(list, c18pn);
                }
            };
        } else {
            c18ps = new C18PS(context, fragment) { // from class: X.18PQ
                public TuxIconView LLJILLL;
                public C197039127h LLJJ;
                public C18Q6 LLJJI;
                public final boolean LLJJIII;

                @Override // X.C18PS
                public final boolean LIZ() {
                    return !this.LLJJIII;
                }

                @Override // X.C18PS
                public int getBgColor() {
                    return this.LLJJIII ? R.attr.ze : R.attr.e2;
                }

                public final C197039127h getBtnShopFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LLJJ;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.cv1);
                        this.LLJJ = (C197039127h) callbackFindViewById;
                    }
                    return (C197039127h) callbackFindViewById;
                }

                public final TuxIconView getIvCloseFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LLJILLL;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.lc0);
                        this.LLJILLL = (TuxIconView) callbackFindViewById;
                    }
                    return (TuxIconView) callbackFindViewById;
                }

                public final C18Q6 getSwitcherProductDetailFromXml() {
                    KeyEvent.Callback callbackFindViewById = this.LLJJI;
                    if (callbackFindViewById == null) {
                        callbackFindViewById = findViewById(R.id.wvm);
                        this.LLJJI = (C18Q6) callbackFindViewById;
                    }
                    return (C18Q6) callbackFindViewById;
                }

                @Override // X.C18PS
                public final EnumC1782280wTq LIZIZ() {
                    return EnumC1782280wTq.SMALL_CARD;
                }

                public final void setBtnShopFromXml(C197039127h c197039127h) {
                    this.LLJJ = c197039127h;
                }

                public final void setIvCloseFromXml(TuxIconView tuxIconView) {
                    this.LLJILLL = tuxIconView;
                }

                public final void setSwitcherProductDetailFromXml(C18Q6 c18q6) {
                    this.LLJJI = c18q6;
                }

                {
                    super(0, context, null, fragment);
                    this.LLJJIII = C294640Bgk.LIZ() == 3;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(262)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70)));
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                    setLayoutParams(layoutParams);
                    C786410Ut5.Td(C786410Ut5.ne(new ContextThemeWrapper(context, R.style.z4)), R.layout.btd, this, true);
                    C786410Ut5.LLLLLLZZ(getIvCloseFromXml(), 8);
                    C786410Ut5.LLLLLLJ(getBtnShopFromXml(), 8);
                }

                @Override // X.C18PS
                public final C18Q6 LIZLLL(VSACardsResponse.VSACardData vSACardData, List list, C18PN c18pn) {
                    int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    C426750GoL.LJIIIZ(getSwitcherProductDetailFromXml(), Integer.valueOf(iLIZIZ3), Integer.valueOf(iLIZIZ3), Integer.valueOf(iLIZIZ3), Integer.valueOf(iLIZIZ3), false, 16);
                    return getSwitcherProductDetailFromXml().LIZ(list, c18pn);
                }
            };
        }
        this.LIZJ = c18ps;
        C1618390sDV.LIZ.getClass();
        boolean zLIZIZ = C1618390sDV.LIZIZ(context);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZIZ);
            if (mainActivityScopeLIZJ != null) {
                homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ);
            } else {
                homeTabAbilityLIZ = null;
            }
            if (zLIZIZ) {
                String strTag = (homeTabAbilityLIZ == null || (listTz = homeTabAbilityLIZ.Tz()) == null || (interfaceC1583870rJp = (InterfaceC1583870rJp) C13LP.LJJJLZIJ(1, listTz)) == null || (strTag = interfaceC1583870rJp.tag()) == null) ? "" : "SHOP_MALL";
                abstractC1591090rVTHQ1 = homeTabAbilityLIZ.hQ1(c19egLIZIZ);
                if (abstractC1591090rVTHQ1 == null && (viewLJIJI = abstractC1591090rVTHQ1.LJIJI(strTag)) != null) {
                    if (!zLIZIZ && c18ps.LIZ()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1391550mJd c1391550mJd = new C1391550mJd(context);
                    c1391550mJd.LLILLJJLI.LIZIZ = viewLJIJI;
                    c1391550mJd.LIZLLL();
                    EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
                    C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
                    c1391600mJi.LIZLLL = enumC1235690iGF;
                    c1391600mJi.LJIIZILJ = c18ps;
                    c1391550mJd.LJII(c18ps.getBgColor());
                    C1391600mJi c1391600mJi2 = c1391550mJd.LLILLJJLI;
                    c1391600mJi2.LJIJJ = false;
                    c1391600mJi2.LJII = -1001L;
                    c1391600mJi2.LJIIJ = 200L;
                    c1391550mJd.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    if (z) {
                        iLIZIZ = 0;
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-10));
                    }
                    c1391550mJd.LLILLJJLI.LJFF = iLIZIZ;
                    c1391550mJd.LJIIIZ(true, null);
                    C1391600mJi c1391600mJi3 = c1391550mJd.LLILLJJLI;
                    c1391600mJi3.LJIIL = z;
                    c1391600mJi3.LJIIJJI = z;
                    c1391550mJd.LJ(new AwS576S0100000_32(this, 670));
                    c1391550mJd.LIZJ(new AwS611S0100000_32(this, 324));
                    if (IMainSAFLifecycleKt.getEnableViewSAFLifecycleRefactor()) {
                        InterfaceC1670800ta2 interfaceC1670800ta2LIZIZ = C1388190mED.LIZIZ(context);
                        if (interfaceC1670800ta2LIZIZ != null && (interfaceC1670800ta2LIZIZ instanceof C199Y) && (objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) interfaceC1670800ta2LIZIZ)) != null && (objLIZ instanceof C0J5E) && (fragment2 = (Fragment) objLIZ) != null) {
                            view = fragment2.getView();
                        } else {
                            view = null;
                        }
                        c1391550mJd.LLILLJJLI.LIZJ = view instanceof ViewGroup ? (ViewGroup) view : null;
                    }
                    if (str != null && !a0.LJJJIL(str)) {
                        C419600Gco c419600Gco = new C419600Gco(context);
                        if (!a0.LJJJIL(str)) {
                            try {
                                if (C294640Bgk.LIZ() == 4) {
                                    i = 82;
                                } else {
                                    i = 92;
                                }
                                if (C294640Bgk.LIZ() == 4) {
                                    iLIZIZ2 = Color.argb(153, 37, 37, 37);
                                } else {
                                    iLIZIZ2 = C475630Ikz.LIZIZ(R.attr.ei, c419600Gco.getContext());
                                }
                                C21279518Ph c21279518PhLIZ = C988900bqC.LIZ();
                                c21279518PhLIZ.LJIIL(str);
                                c21279518PhLIZ.LJIILJJIL(i);
                                c21279518PhLIZ.LJIILIIL(C475630Ikz.LIZIZ(R.attr.ee, c419600Gco.getContext()));
                                c21279518PhLIZ.LIZ(iLIZIZ2);
                                c21279518PhLIZ.LIZIZ(C418440Gaw.LIZIZ(2));
                                C21279618Pi c21279618Pi = c21279518PhLIZ.LIZ;
                                if (c21279618Pi != null) {
                                    c21279618Pi.LJIIIIZZ = -2;
                                }
                                c21279518PhLIZ.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                                c21279518PhLIZ.LIZJ(TextUtils.TruncateAt.END);
                                c21279518PhLIZ.LJI();
                                c21279518PhLIZ.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                                c21279518PhLIZ.LJIIIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                                C21279618Pi c21279618Pi2 = c21279518PhLIZ.LIZ;
                                if (c21279618Pi2 != null) {
                                    c419600Gco.LL.LIZ(c21279618Pi2);
                                    int visibility = c419600Gco.getVisibility();
                                    c419600Gco.setVisibility(0);
                                    C1602160rnK.LIZIZ(visibility, 0, c419600Gco);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                int visibility2 = c419600Gco.getVisibility();
                                c419600Gco.setVisibility(8);
                                C1602160rnK.LIZIZ(visibility2, 8, c419600Gco);
                            }
                        } else {
                            int visibility3 = c419600Gco.getVisibility();
                            c419600Gco.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility3, 8, c419600Gco);
                        }
                        EnumC1235690iGF enumC1235690iGF2 = EnumC1235690iGF.TOP;
                        C1391600mJi c1391600mJi4 = c1391550mJd.LLILLJJLI;
                        c1391600mJi4.LJIJ = c419600Gco;
                        c1391600mJi4.LJIJI = enumC1235690iGF2;
                    }
                    C0P0T c0p0tLIZIZ = c1391550mJd.LIZIZ();
                    this.LIZIZ = c0p0tLIZIZ;
                    C1905750zgz.LIZIZ.LJIIIZ(c0p0tLIZIZ, "vsa_bubble");
                    return;
                }
            }
            if (homeTabAbilityLIZ == null) {
                return;
            }
            abstractC1591090rVTHQ1 = homeTabAbilityLIZ.hQ1(c19egLIZIZ);
            if (abstractC1591090rVTHQ1 == null) {
            }
        }
    }

    public final void LJ(VSACardsResponse.VSACardData vSACardData, final C18PF c18pf, Map map, Map map2) {
        EnumC1780190wQT enumC1780190wQT;
        if (this.LIZIZ == null) {
            this.LIZLLL = false;
            LIZ();
            c18pf.LIZIZ();
            return;
        }
        this.LIZLLL = true;
        C18PS c18ps = this.LIZJ;
        if (c18ps != null) {
            C18PW c18pw = new C18PW() { // from class: X.18Pm
                @Override // X.C18PW
                public final void LIZIZ() {
                    this.LIZ.LIZLLL = false;
                    this.LIZ.LIZ();
                    c18pf.LIZIZ();
                }

                @Override // X.C18PW
                public final void LIZJ() {
                    c18pf.LIZLLL();
                }

                @Override // X.C18PW
                public final void LJ() {
                    c18pf.LIZ();
                }

                @Override // X.C18PW
                public final void LJFF() {
                    c18pf.LIZJ(this.LIZ.LIZ);
                }

                @Override // X.C18PW
                public final void LIZ(int i, EcUgProduct ecUgProduct) {
                    c18pf.LJFF(ecUgProduct);
                }

                @Override // X.C18PW
                public final void LIZLLL(int i, EcUgProduct ecUgProduct, C1740600vOc c1740600vOc) {
                    c18pf.LJ(this.LIZ.LIZ, ecUgProduct, c1740600vOc);
                }
            };
            c18ps.LJFF();
            c18ps.LLILLJJLI = c18pw;
            C18PS.LLJILJILJ.getClass();
            int iLIZ = C18PV.LIZ(vSACardData);
            if (iLIZ <= 0) {
                c18ps.LLJI = false;
                int visibility = c18ps.getVisibility();
                c18ps.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c18ps);
                C18PW c18pw2 = c18ps.LLILLJJLI;
                if (c18pw2 != null) {
                    c18pw2.LIZIZ();
                    return;
                }
                return;
            }
            List<EcUgProduct> list = vSACardData.productList;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (EcUgProduct ecUgProduct : list) {
                    EcUgProduct.EcUgProductPrice ecUgProductPrice = ecUgProduct.price;
                    if (ecUgProductPrice != null && ecUgProductPrice.minSalesPrice != null) {
                        arrayList.add(ecUgProduct);
                    }
                }
                List listLL = C13LP.LL(arrayList, iLIZ);
                if (listLL != null && !listLL.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                    Iterator it2 = listLL.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((EcUgProduct) it2.next()).productId);
                    }
                    map.put("real_show_product_list", C13LP.LJJLIIIJ(arrayList2, "|", null, null, 0, null, null, 62));
                    c18ps.LLILLL.putAll(map);
                    c18ps.LLILZ.putAll(map2);
                    c18ps.LLJI = true;
                    int visibility2 = c18ps.getVisibility();
                    c18ps.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility2, 0, c18ps);
                    if (listLL.size() == 1) {
                        C18PM c18pm = C18PM.LIZ;
                        String str = vSACardData.cardSchema;
                        enumC1780190wQT = EnumC1780190wQT.AD_SINGLE_BUBBLE;
                        c18pm.getClass();
                        c18ps.LLILZLL = C18PM.LIZLLL(str, enumC1780190wQT);
                    } else {
                        c18ps.LLILZLL = false;
                        enumC1780190wQT = EnumC1780190wQT.AD_MULTI_BUBBLE;
                    }
                    c18ps.LLILZIL = enumC1780190wQT;
                    c18ps.LLIZ = c18ps.LIZLLL(vSACardData, listLL, new C18PN(c18ps));
                    C786410Ut5.I7(new AjS72S0100000_32(c18ps, 11), c18ps);
                    return;
                }
            }
            c18ps.LLJI = false;
            int visibility3 = c18ps.getVisibility();
            c18ps.setVisibility(8);
            C1602160rnK.LIZIZ(visibility3, 8, c18ps);
            C18PW c18pw3 = c18ps.LLILLJJLI;
            if (c18pw3 == null) {
                return;
            }
            c18pw3.LIZIZ();
        }
    }
}
