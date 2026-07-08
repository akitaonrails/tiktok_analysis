package X;

import Y.ACListenerS119S0200000_16;
import Y.ACListenerS151S0100000_16;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.experiment.AdSparkWebViewTitleNewConfig;
import com.ss.android.ugc.aweme.web.experiment.OptIABGestureGoBackOrGoForwardExp;
import com.ss.android.ugc.aweme.web.service.IAdWebUIUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d7K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037960d7K extends AbstractC1038000d7O implements InterfaceC1036400d4o, InterfaceC1036620d5A {
    public final Context LIZ;
    public final SparkContext LIZIZ;
    public final InterfaceC1036870d5Z LIZJ;
    public final List<View> LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public TuxIconView LJI;
    public TuxIconView LJII;
    public TuxIconView LJIIIIZZ;
    public TuxIconView LJIIIZ;
    public TuxIconView LJIIJ;
    public TuxTextView LJIIJJI;
    public C1037280d6E LJIIL;
    public View LJIILIIL;
    public C1038030d7R LJIILJJIL;
    public C1038030d7R LJIILL;
    public float LJIILLIIL = 0.34f;
    public float LJIIZILJ = 0.34f;

    @Override // X.InterfaceC1036400d4o
    public final void LIZ() {
        C1037280d6E c1037280d6E = this.LJIIL;
        if (c1037280d6E != null) {
            c1037280d6E.LJII();
        }
    }

    @Override // X.InterfaceC1036400d4o
    public final boolean LIZJ() {
        C1037280d6E c1037280d6E = this.LJIIL;
        return (c1037280d6E == null || c1037280d6E.LJIJJ) ? false : true;
    }

    @Override // X.AbstractC1038000d7O
    public final View LJFF() {
        if (!this.LJFF) {
            InterfaceC1036870d5Z interfaceC1036870d5Z = this.LIZJ;
            C1036000d4A c1036000d4ALIZ = interfaceC1036870d5Z != null ? interfaceC1036870d5Z.LIZ() : null;
            if (c1036000d4ALIZ instanceof View) {
                return c1036000d4ALIZ;
            }
        }
        return null;
    }

    @Override // X.AbstractC1038000d7O
    public final View LJI() {
        final View view;
        final View view2;
        View view3;
        ViewGroup viewGroup;
        C1026310coX adlpPopUpModel;
        C1028100crQ popUpCustomConfig;
        if (this.LJ) {
            return null;
        }
        List<View> list = this.LIZLLL;
        if (list != null) {
            view = (View) C13LP.LJJJLZIJ(0, list);
            view2 = (View) C13LP.LJJJLZIJ(1, this.LIZLLL);
            view3 = (View) C13LP.LJJJLZIJ(2, this.LIZLLL);
        } else {
            view = null;
            view2 = null;
            view3 = null;
        }
        final C1035880d3y c1035880d3y = (C1035880d3y) this.LIZIZ.LJFF(C1035880d3y.class);
        C1038020d7Q c1038020d7Q = C1038020d7Q.LIZ;
        Context context = this.LIZ;
        c1038020d7Q.getClass();
        C1038030d7R c1038030d7R = new C1038030d7R(this.LIZIZ, new AbstractC1037990d7N() { // from class: X.0d7J
            @Override // X.AbstractC1037990d7N
            public final AbstractC1250290idn LIZ() {
                TuxIconView tuxIconView;
                AwemeRawAd awemeRawAd;
                LandingPageConfig landingPageConfig;
                C1250280idm c1250280idm = new C1250280idm();
                View viewLJLLJ = view2;
                TuxIconView tuxIconView2 = null;
                if (viewLJLLJ == null) {
                    viewLJLLJ = C786410Ut5.LJLLJ(this.LIZ, R.layout.lu, null);
                }
                C1037960d7K c1037960d7K = this;
                C1035880d3y c1035880d3y2 = c1035880d3y;
                InterfaceC1036050d4F interfaceC1036050d4F = (InterfaceC1036050d4F) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1036050d4F.class);
                if (interfaceC1036050d4F != null) {
                    interfaceC1036050d4F.UQ0(c1037960d7K.LIZIZ);
                }
                c1037960d7K.LJII = (TuxIconView) viewLJLLJ.findViewById(R.id.tk1);
                TuxIconView tuxIconView3 = (TuxIconView) viewLJLLJ.findViewById(R.id.jp8);
                c1037960d7K.LJIIJ = tuxIconView3;
                if (tuxIconView3 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
                }
                TuxIconView tuxIconView4 = c1037960d7K.LJII;
                if (tuxIconView4 != null) {
                    C786410Ut5.a9(tuxIconView4, new ACListenerS151S0100000_16(c1037960d7K, 97));
                }
                if (Intrinsics.LJFF((c1035880d3y2 == null || (awemeRawAd = c1035880d3y2.getAwemeRawAd()) == null || (landingPageConfig = awemeRawAd.getLandingPageConfig()) == null) ? null : landingPageConfig.forwardBackButtonPosition, "top")) {
                    TuxIconView tuxIconView5 = (TuxIconView) viewLJLLJ.findViewById(R.id.j2m);
                    if (tuxIconView5 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView5, OptIABGestureGoBackOrGoForwardExp.LIZLLL ? 8 : 0);
                        C786410Ut5.x5(tuxIconView5, 0.34f);
                        C786410Ut5.a9(tuxIconView5, new ACListenerS151S0100000_16(c1037960d7K, 98));
                        tuxIconView2 = tuxIconView5;
                    }
                    c1037960d7K.LJIIIZ = tuxIconView2;
                } else {
                    TuxIconView tuxIconView6 = (TuxIconView) viewLJLLJ.findViewById(R.id.j2m);
                    if (tuxIconView6 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView6, 8);
                    }
                    if (((IAdWebUIUtils) ServiceManager.get().getService(IAdWebUIUtils.class)).LJIIIZ(c1035880d3y2, 1) && (tuxIconView = c1037960d7K.LJIIJ) != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                        InterfaceC1036050d4F interfaceC1036050d4F2 = (InterfaceC1036050d4F) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1036050d4F.class);
                        if (interfaceC1036050d4F2 != null) {
                            interfaceC1036050d4F2.y11(1, c1037960d7K.LIZIZ, tuxIconView);
                        }
                        C786410Ut5.a9(tuxIconView, new ACListenerS119S0200000_16(c1037960d7K, tuxIconView, 23));
                    }
                }
                c1250280idm.LIZJ = viewLJLLJ;
                c1250280idm.LIZLLL = true;
                return c1250280idm;
            }

            @Override // X.AbstractC1037990d7N
            public final AbstractC1250290idn LIZIZ() {
                AwemeRawAd awemeRawAd;
                LandingPageConfig landingPageConfig;
                C1250280idm c1250280idm = new C1250280idm();
                View viewLJLLJ = view;
                TuxIconView tuxIconView = null;
                if (viewLJLLJ == null) {
                    viewLJLLJ = C786410Ut5.LJLLJ(this.LIZ, R.layout.lv, null);
                }
                C1037960d7K c1037960d7K = this;
                C1035880d3y c1035880d3y2 = c1035880d3y;
                TuxIconView tuxIconView2 = (TuxIconView) viewLJLLJ.findViewById(R.id.e1h);
                c1037960d7K.LJI = tuxIconView2;
                if (tuxIconView2 != null) {
                    C786410Ut5.a9(tuxIconView2, new ACListenerS151S0100000_16(c1037960d7K, 99));
                }
                if (Intrinsics.LJFF((c1035880d3y2 == null || (awemeRawAd = c1035880d3y2.getAwemeRawAd()) == null || (landingPageConfig = awemeRawAd.getLandingPageConfig()) == null) ? null : landingPageConfig.forwardBackButtonPosition, "top")) {
                    TuxIconView tuxIconView3 = (TuxIconView) viewLJLLJ.findViewById(R.id.j2l);
                    if (tuxIconView3 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView3, OptIABGestureGoBackOrGoForwardExp.LIZLLL ? 8 : 0);
                        C786410Ut5.x5(tuxIconView3, 0.34f);
                        C786410Ut5.a9(tuxIconView3, new ACListenerS151S0100000_16(c1037960d7K, 100));
                        tuxIconView = tuxIconView3;
                    }
                    c1037960d7K.LJIIIIZZ = tuxIconView;
                } else {
                    TuxIconView tuxIconView4 = (TuxIconView) viewLJLLJ.findViewById(R.id.j2l);
                    if (tuxIconView4 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
                    }
                }
                c1250280idm.LIZJ = viewLJLLJ;
                c1250280idm.LIZLLL = true;
                return c1250280idm;
            }
        }, new AbstractC1038140d7c() { // from class: X.0d7V
            @Override // X.AbstractC1038140d7c
            public final boolean LJ() {
                InterfaceC1036190d4T interfaceC1036190d4T = (InterfaceC1036190d4T) this.LIZ.LIZIZ.LJFF(InterfaceC1036190d4T.class);
                if (interfaceC1036190d4T != null) {
                    interfaceC1036190d4T.LJIIL(11);
                }
                C1037280d6E c1037280d6E = this.LIZ.LJIIL;
                if (c1037280d6E != null) {
                    c1037280d6E.LJII();
                }
                C1037280d6E c1037280d6E2 = this.LIZ.LJIIL;
                return (c1037280d6E2 == null || c1037280d6E2.LJIJJ) ? false : true;
            }

            @Override // X.AbstractC1038140d7c
            public final boolean LJI() {
                InterfaceC1036190d4T interfaceC1036190d4T = (InterfaceC1036190d4T) this.LIZ.LIZIZ.LJFF(InterfaceC1036190d4T.class);
                if (interfaceC1036190d4T != null) {
                    interfaceC1036190d4T.LJIIL(11);
                }
                C1037280d6E c1037280d6E = this.LIZ.LJIIL;
                return (c1037280d6E == null || c1037280d6E.LJIJJ) ? false : true;
            }

            @Override // X.AbstractC1038140d7c
            public final void LIZIZ(boolean z) {
                InterfaceC1038080d7W interfaceC1038080d7W = (InterfaceC1038080d7W) this.LIZ.LIZIZ.LJFF(InterfaceC1038080d7W.class);
                if (interfaceC1038080d7W != null) {
                    interfaceC1038080d7W.LJIJJLI(z);
                }
            }

            @Override // X.AbstractC1038140d7c
            public final void LIZJ(EnumC1038130d7b enumC1038130d7b) {
                String str;
                int i = C1038110d7Z.LIZ[enumC1038130d7b.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            str = "";
                        } else {
                            str = "title";
                        }
                    } else {
                        str = "url";
                    }
                } else {
                    str = "lock_icon";
                }
                InterfaceC1038080d7W interfaceC1038080d7W = (InterfaceC1038080d7W) this.LIZ.LIZIZ.LJFF(InterfaceC1038080d7W.class);
                if (interfaceC1038080d7W != null) {
                    interfaceC1038080d7W.LJIL(str);
                }
            }

            @Override // X.AbstractC1038140d7c
            public final void LJFF(boolean z) {
                InterfaceC1038080d7W interfaceC1038080d7W = (InterfaceC1038080d7W) this.LIZ.LIZIZ.LJFF(InterfaceC1038080d7W.class);
                if (interfaceC1038080d7W != null) {
                    interfaceC1038080d7W.LJI(z);
                }
            }

            @Override // X.AbstractC1038140d7c
            public final void LIZ(String str, boolean z) {
                String changeToUrl;
                InterfaceC1036110d4L interfaceC1036110d4L;
                C1035880d3y c1035880d3y2 = (C1035880d3y) this.LIZ.LIZIZ.LJFF(C1035880d3y.class);
                if (c1035880d3y2 != null) {
                    changeToUrl = c1035880d3y2.getChangeToUrl();
                } else {
                    changeToUrl = null;
                }
                if (Intrinsics.LJFF(changeToUrl, str)) {
                    return;
                }
                if (c1035880d3y2 != null) {
                    c1035880d3y2.setChangeToUrl(str);
                }
                if (!z && (interfaceC1036110d4L = (InterfaceC1036110d4L) this.LIZ.LIZIZ.LJFF(InterfaceC1036110d4L.class)) != null) {
                    interfaceC1036110d4L.LJIL(this.LIZ.LIZIZ);
                }
                InterfaceC1039610d9z interfaceC1039610d9z = (InterfaceC1039610d9z) this.LIZ.LIZIZ.LJFF(InterfaceC1039610d9z.class);
                if (interfaceC1039610d9z != null) {
                    interfaceC1039610d9z.checkUrl(str);
                }
                InterfaceC1041400dCs interfaceC1041400dCs = (InterfaceC1041400dCs) this.LIZ.LIZIZ.LJFF(InterfaceC1041400dCs.class);
                if (interfaceC1041400dCs != null) {
                    interfaceC1041400dCs.checkUrl(str);
                }
                InterfaceC1036850d5X interfaceC1036850d5X = (InterfaceC1036850d5X) this.LIZ.LIZIZ.LJFF(InterfaceC1036850d5X.class);
                if (interfaceC1036850d5X != null) {
                    interfaceC1036850d5X.LJIIIIZZ();
                }
                InterfaceC1036110d4L interfaceC1036110d4L2 = (InterfaceC1036110d4L) this.LIZ.LIZIZ.LJFF(InterfaceC1036110d4L.class);
                if (interfaceC1036110d4L2 != null) {
                    interfaceC1036110d4L2.LJJIJLIJ(str);
                }
            }

            @Override // X.AbstractC1038140d7c
            public final void LIZLLL(EnumC1038100d7Y enumC1038100d7Y, long j) {
                String str;
                int i = C1038110d7Z.LIZIZ[enumC1038100d7Y.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        str = "";
                    } else {
                        str = "other_area";
                    }
                } else {
                    str = "exit_button";
                }
                InterfaceC1038080d7W interfaceC1038080d7W = (InterfaceC1038080d7W) this.LIZ.LIZIZ.LJFF(InterfaceC1038080d7W.class);
                if (interfaceC1038080d7W != null) {
                    interfaceC1038080d7W.LJIJ(j, str);
                }
            }

            @Override // X.AbstractC1038140d7c
            public final void LJII(EnumC1038090d7X enumC1038090d7X, long j) {
                String str;
                InterfaceC1038080d7W interfaceC1038080d7W = (InterfaceC1038080d7W) this.LIZ.LIZIZ.LJFF(InterfaceC1038080d7W.class);
                if (interfaceC1038080d7W != null) {
                    C1035880d3y c1035880d3y2 = c1035880d3y;
                    Long lValueOf = Long.valueOf(j);
                    if (enumC1038090d7X == EnumC1038090d7X.URL) {
                        str = "url";
                    } else {
                        str = "title";
                    }
                    interfaceC1038080d7W.LJJIFFI(c1035880d3y2, lValueOf, str);
                }
            }
        }, Boolean.valueOf(((Boolean) AdSparkWebViewTitleNewConfig.LIZJ.getValue()).booleanValue()), C1038020d7Q.LIZ(context, c1035880d3y), (c1035880d3y == null || (adlpPopUpModel = c1035880d3y.getAdlpPopUpModel()) == null || (popUpCustomConfig = adlpPopUpModel.getPopUpCustomConfig()) == null || !Intrinsics.LJFF(popUpCustomConfig.getUseWebViewTitle(), Boolean.TRUE)) ? ((Number) AdSparkWebViewTitleNewConfig.LIZIZ.getValue()).intValue() : 2, view3, this.LIZ, 768);
        this.LJIILL = c1038030d7R;
        TuxNavBar navBar = c1038030d7R.getNavBar();
        this.LJIIJJI = navBar != null ? (TuxTextView) navBar.findViewById(R.id.p1i) : null;
        TuxNavBar navBar2 = c1038030d7R.getNavBar();
        if (navBar2 != null) {
            navBar2.findViewById(R.id.p28);
        }
        c1038030d7R.setId(R.id.ydk);
        N0();
        this.LJIILJJIL = c1038030d7R;
        C1035880d3y c1035880d3y2 = (C1035880d3y) this.LIZIZ.LJFF(C1035880d3y.class);
        if (((IAdWebUIUtils) ServiceManager.get().getService(IAdWebUIUtils.class)).LJFF(c1035880d3y2)) {
            C1038010d7P c1038010d7P = new Object() { // from class: X.0d7P
            };
            SparkContext sparkContext = this.LIZIZ;
            Context context2 = this.LIZ;
            C1038030d7R c1038030d7R2 = this.LJIILJJIL;
            c1038010d7P.getClass();
            LinearLayout linearLayout = new LinearLayout(context2);
            linearLayout.setOrientation(1);
            C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
            linearLayout.addView(c1038030d7R2);
            C1037430d6T c1037430d6TLJIILLIIL = ((IAdWebUIUtils) ServiceManager.get().getService(IAdWebUIUtils.class)).LJIILLIIL(context2);
            sparkContext.LJJ(InterfaceC1038540d8G.class, c1037430d6TLJIILLIIL);
            c1037430d6TLJIILLIIL.getView();
            if (c1035880d3y2 != null) {
                c1037430d6TLJIILLIIL.LJ(c1035880d3y2);
            }
            C786410Ut5.W5(c1037430d6TLJIILLIIL, new LinearLayout.LayoutParams(-1, -2));
            linearLayout.addView(c1037430d6TLJIILLIIL);
            viewGroup = linearLayout;
        } else {
            viewGroup = this.LJIILJJIL;
        }
        this.LJIILIIL = viewGroup;
        if ((viewGroup instanceof ViewGroup) && viewGroup != null) {
            this.LJIIL = new C1037280d6E(viewGroup, true, false, true, this.LIZIZ, new AwS595S0100000_16(this, 297), new AwS560S0100000_16(viewGroup, 789), 32);
        }
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1036620d5A
    public final void N0() {
        TuxTextView tuxTextView;
        Integer iabThemeColor;
        Integer iabThemeColor2;
        C1035880d3y c1035880d3y = (C1035880d3y) this.LIZIZ.LJFF(C1035880d3y.class);
        if (c1035880d3y != null && (iabThemeColor2 = c1035880d3y.getIabThemeColor()) != null) {
            int iIntValue = iabThemeColor2.intValue();
            InterfaceC1036110d4L interfaceC1036110d4L = (InterfaceC1036110d4L) this.LIZIZ.LJFF(InterfaceC1036110d4L.class);
            if (interfaceC1036110d4L != null) {
                interfaceC1036110d4L.LJJJ(Integer.valueOf(iIntValue), c1035880d3y.getIabThemeColorUrl());
            }
        }
        C1038030d7R c1038030d7R = this.LJIILL;
        if (c1038030d7R != null) {
            Boolean iabThemeColorUseDarkForeground = null;
            if (c1035880d3y != null) {
                iabThemeColor = c1035880d3y.getIabThemeColor();
                if (c1035880d3y.getIabThemeColor() != null && c1035880d3y != null) {
                    iabThemeColorUseDarkForeground = c1035880d3y.getIabThemeColorUseDarkForeground();
                }
            } else {
                iabThemeColor = null;
            }
            c1038030d7R.LLJ = iabThemeColorUseDarkForeground;
            if (iabThemeColor == null || iabThemeColor.intValue() == -1) {
                Integer numLJ = c1038030d7R.LJ();
                if (numLJ != null) {
                    c1038030d7R.LIZIZ(numLJ.intValue());
                }
            } else {
                c1038030d7R.LIZIZ(iabThemeColor.intValue());
            }
            c1038030d7R.LIZ();
            TuxNavBar tuxNavBar = c1038030d7R.LLJIJIL;
            if (tuxNavBar != null) {
                c1038030d7R.LJIIIIZZ(tuxNavBar);
            }
            String str = c1038030d7R.LLJI;
            if (str != null && Intrinsics.LJFF(c1038030d7R.LLILLJJLI, Boolean.TRUE)) {
                c1038030d7R.LJIIIZ(str);
            }
        }
        C1038030d7R c1038030d7R2 = this.LJIILL;
        if (c1038030d7R2 != null) {
            C1038020d7Q c1038020d7Q = C1038020d7Q.LIZ;
            Context context = this.LIZ;
            c1038020d7Q.getClass();
            C1250250idj c1250250idjLJI = c1038030d7R2.LJI(C1038020d7Q.LIZ(context, c1035880d3y));
            TuxNavBar tuxNavBar2 = c1038030d7R2.LLJIJIL;
            if (tuxNavBar2 != null) {
                tuxNavBar2.LJIJJ(c1250250idjLJI);
            }
            c1038030d7R2.LIZ();
            TuxNavBar tuxNavBar3 = c1038030d7R2.LLJIJIL;
            if (tuxNavBar3 == null || (tuxTextView = (TuxTextView) tuxNavBar3.findViewById(c1038030d7R2.getTiktokViewId())) == null) {
                return;
            }
            c1038030d7R2.LIZJ(tuxTextView);
        }
    }

    @Override // X.InterfaceC1036400d4o
    public final void li() {
        C1037280d6E c1037280d6E = this.LJIIL;
        if (c1037280d6E != null) {
            c1037280d6E.LJII();
        }
    }

    @Override // X.InterfaceC1036400d4o
    public final void LIZLLL(MotionEvent motionEvent) {
        C1037280d6E c1037280d6E = this.LJIIL;
        if (c1037280d6E != null) {
            c1037280d6E.LJFF(motionEvent);
        }
    }

    public final void LJII(float f) {
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        TuxIconView tuxIconView3 = this.LJIIIIZZ;
        if (tuxIconView3 != null) {
            C786410Ut5.x5(tuxIconView3, this.LJIILLIIL * f);
        }
        TuxIconView tuxIconView4 = this.LJIIIZ;
        if (tuxIconView4 != null) {
            C786410Ut5.x5(tuxIconView4, this.LJIIZILJ * f);
        }
        TuxIconView tuxIconView5 = this.LJIIJ;
        if (tuxIconView5 != null) {
            C786410Ut5.x5(tuxIconView5, f);
        }
        TuxIconView tuxIconView6 = this.LJI;
        if (tuxIconView6 != null) {
            C786410Ut5.x5(tuxIconView6, f);
        }
        TuxIconView tuxIconView7 = this.LJII;
        if (tuxIconView7 != null) {
            C786410Ut5.x5(tuxIconView7, f);
        }
        TuxTextView tuxTextView = this.LJIIJJI;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, f);
        }
        if (f < 0.1f && (tuxIconView2 = this.LJI) != null && tuxIconView2.isClickable()) {
            TuxIconView tuxIconView8 = this.LJIIIIZZ;
            if (tuxIconView8 != null) {
                tuxIconView8.setClickable(false);
            }
            TuxIconView tuxIconView9 = this.LJIIIZ;
            if (tuxIconView9 != null) {
                tuxIconView9.setClickable(false);
            }
            TuxIconView tuxIconView10 = this.LJIIJ;
            if (tuxIconView10 != null) {
                tuxIconView10.setClickable(false);
            }
            TuxIconView tuxIconView11 = this.LJI;
            if (tuxIconView11 != null) {
                tuxIconView11.setClickable(false);
            }
            TuxIconView tuxIconView12 = this.LJII;
            if (tuxIconView12 != null) {
                tuxIconView12.setClickable(false);
            }
        }
        if (f > 0.9f && (tuxIconView = this.LJI) != null && !tuxIconView.isClickable()) {
            TuxIconView tuxIconView13 = this.LJIIIIZZ;
            if (tuxIconView13 != null) {
                tuxIconView13.setClickable(true);
            }
            TuxIconView tuxIconView14 = this.LJIIIZ;
            if (tuxIconView14 != null) {
                tuxIconView14.setClickable(true);
            }
            TuxIconView tuxIconView15 = this.LJIIJ;
            if (tuxIconView15 != null) {
                tuxIconView15.setClickable(true);
            }
            TuxIconView tuxIconView16 = this.LJI;
            if (tuxIconView16 != null) {
                tuxIconView16.setClickable(true);
            }
            TuxIconView tuxIconView17 = this.LJII;
            if (tuxIconView17 != null) {
                tuxIconView17.setClickable(true);
            }
        }
    }

    @Override // X.InterfaceC1036400d4o
    public final void LJ(boolean z, boolean z2) {
        float f;
        float f2;
        float f3 = 0.34f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        this.LJIILLIIL = f;
        if (z2) {
            f3 = 1.0f;
        }
        this.LJIIZILJ = f3;
        TuxIconView tuxIconView = this.LJIIIIZZ;
        if (tuxIconView != null) {
            tuxIconView.setClickable(z);
        }
        TuxIconView tuxIconView2 = this.LJIIIZ;
        if (tuxIconView2 != null) {
            tuxIconView2.setClickable(z2);
        }
        C1037280d6E c1037280d6E = this.LJIIL;
        if (c1037280d6E != null) {
            f2 = c1037280d6E.LJIIIZ;
        } else {
            f2 = 1.0f;
        }
        LJII(C13LZ.LIZLLL(f2, 0.0f, 1.0f));
    }

    @Override // X.InterfaceC1036400d4o
    public final void LIZIZ(int i, int i2, int i3, int i4) {
        C1037280d6E c1037280d6E = this.LJIIL;
        if (c1037280d6E != null) {
            c1037280d6E.LJ(i2, i4);
        }
    }

    public C1037960d7K(Context context, AdSparkHybridContext adSparkHybridContext, InterfaceC1036870d5Z interfaceC1036870d5Z, List list, boolean z, boolean z2) {
        this.LIZ = context;
        this.LIZIZ = adSparkHybridContext;
        this.LIZJ = interfaceC1036870d5Z;
        this.LIZLLL = list;
        this.LJ = z;
        this.LJFF = z2;
    }
}
