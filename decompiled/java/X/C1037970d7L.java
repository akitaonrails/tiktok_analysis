package X;

import Y.ACListenerS119S0200000_16;
import Y.ACListenerS151S0100000_16;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
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
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d7L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037970d7L extends AbstractC1038000d7O implements InterfaceC1036400d4o {
    public final Context LIZ;
    public final SparkContext LIZIZ;
    public final InterfaceC1036860d5Y LIZJ;
    public final InterfaceC1036210d4V LIZLLL;
    public TuxIconView LJ;
    public TuxIconView LJFF;
    public TuxIconView LJI;
    public TuxIconView LJII;
    public TuxIconView LJIIIIZZ;
    public C1038030d7R LJIIIZ;
    public TuxTextView LJIIJ;
    public C1037280d6E LJIIJJI;
    public float LJIIL = 0.34f;
    public float LJIILIIL = 0.34f;

    @Override // X.InterfaceC1036400d4o
    public final void LIZ() {
        C1037280d6E c1037280d6E = this.LJIIJJI;
        if (c1037280d6E != null) {
            c1037280d6E.LJII();
        }
    }

    @Override // X.InterfaceC1036400d4o
    public final boolean LIZJ() {
        C1037280d6E c1037280d6E = this.LJIIJJI;
        return (c1037280d6E == null || c1037280d6E.LJIJJ) ? false : true;
    }

    @Override // X.AbstractC1038000d7O
    public final View LJFF() {
        Object obj = this.LIZLLL;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    @Override // X.AbstractC1038000d7O
    public final View LJI() {
        final C1035880d3y c1035880d3y = (C1035880d3y) this.LIZIZ.LJFF(C1035880d3y.class);
        Context context = this.LIZ;
        final ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, C1385040m98.LIZLLL(context));
        C1038020d7Q.LIZ.getClass();
        C1038030d7R c1038030d7R = new C1038030d7R(this.LIZIZ, new AbstractC1037990d7N() { // from class: X.0d7M
            @Override // X.AbstractC1037990d7N
            public final AbstractC1250290idn LIZ() {
                TuxIconView tuxIconView;
                AwemeRawAd awemeRawAd;
                LandingPageConfig landingPageConfig;
                C1250280idm c1250280idm = new C1250280idm();
                TuxIconView tuxIconView2 = null;
                View viewLJLLJ = C786410Ut5.LJLLJ(contextThemeWrapper, R.layout.lu, null);
                C1037970d7L c1037970d7L = this;
                C1035880d3y c1035880d3y2 = c1035880d3y;
                InterfaceC1036050d4F interfaceC1036050d4F = (InterfaceC1036050d4F) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1036050d4F.class);
                if (interfaceC1036050d4F != null) {
                    interfaceC1036050d4F.UQ0(c1037970d7L.LIZIZ);
                }
                TuxIconView tuxIconView3 = (TuxIconView) viewLJLLJ.findViewById(R.id.jp8);
                c1037970d7L.LJIIIIZZ = tuxIconView3;
                if (tuxIconView3 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
                }
                TuxIconView tuxIconView4 = (TuxIconView) viewLJLLJ.findViewById(R.id.tk1);
                c1037970d7L.LJFF = tuxIconView4;
                if (tuxIconView4 != null) {
                    C786410Ut5.a9(tuxIconView4, new ACListenerS151S0100000_16(c1037970d7L, 123));
                }
                if (Intrinsics.LJFF((c1035880d3y2 == null || (awemeRawAd = c1035880d3y2.getAwemeRawAd()) == null || (landingPageConfig = awemeRawAd.getLandingPageConfig()) == null) ? null : landingPageConfig.forwardBackButtonPosition, "top")) {
                    TuxIconView tuxIconView5 = (TuxIconView) viewLJLLJ.findViewById(R.id.j2m);
                    if (tuxIconView5 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView5, OptIABGestureGoBackOrGoForwardExp.LIZLLL ? 8 : 0);
                        C786410Ut5.x5(tuxIconView5, 0.34f);
                        C786410Ut5.a9(tuxIconView5, new ACListenerS151S0100000_16(c1037970d7L, 124));
                        tuxIconView2 = tuxIconView5;
                    }
                    c1037970d7L.LJII = tuxIconView2;
                } else {
                    TuxIconView tuxIconView6 = (TuxIconView) viewLJLLJ.findViewById(R.id.j2m);
                    if (tuxIconView6 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView6, 8);
                    }
                    if (((IAdWebUIUtils) ServiceManager.get().getService(IAdWebUIUtils.class)).LJIIIZ(c1035880d3y2, 1) && (tuxIconView = c1037970d7L.LJIIIIZZ) != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                        InterfaceC1036050d4F interfaceC1036050d4F2 = (InterfaceC1036050d4F) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1036050d4F.class);
                        if (interfaceC1036050d4F2 != null) {
                            interfaceC1036050d4F2.y11(1, c1037970d7L.LIZIZ, tuxIconView);
                        }
                        C786410Ut5.a9(tuxIconView, new ACListenerS119S0200000_16(c1037970d7L, tuxIconView, 25));
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
                TuxIconView tuxIconView = null;
                View viewLJLLJ = C786410Ut5.LJLLJ(contextThemeWrapper, R.layout.lv, null);
                C1037970d7L c1037970d7L = this;
                C1035880d3y c1035880d3y2 = c1035880d3y;
                TuxIconView tuxIconView2 = (TuxIconView) viewLJLLJ.findViewById(R.id.e1h);
                c1037970d7L.LJ = tuxIconView2;
                if (tuxIconView2 != null) {
                    C786410Ut5.a9(tuxIconView2, new ACListenerS151S0100000_16(c1037970d7L, 125));
                }
                if (Intrinsics.LJFF((c1035880d3y2 == null || (awemeRawAd = c1035880d3y2.getAwemeRawAd()) == null || (landingPageConfig = awemeRawAd.getLandingPageConfig()) == null) ? null : landingPageConfig.forwardBackButtonPosition, "top")) {
                    TuxIconView tuxIconView3 = (TuxIconView) viewLJLLJ.findViewById(R.id.j2l);
                    if (tuxIconView3 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView3, OptIABGestureGoBackOrGoForwardExp.LIZLLL ? 8 : 0);
                        C786410Ut5.x5(tuxIconView3, 0.34f);
                        C786410Ut5.a9(tuxIconView3, new ACListenerS151S0100000_16(c1037970d7L, 126));
                        tuxIconView = tuxIconView3;
                    }
                    c1037970d7L.LJI = tuxIconView;
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
        }, new AbstractC1038140d7c() { // from class: X.0d7U
            @Override // X.AbstractC1038140d7c
            public final boolean LJ() {
                InterfaceC1036190d4T interfaceC1036190d4T = (InterfaceC1036190d4T) this.LIZ.LIZIZ.LJFF(InterfaceC1036190d4T.class);
                if (interfaceC1036190d4T != null) {
                    interfaceC1036190d4T.LJIIL(11);
                }
                C1037280d6E c1037280d6E = this.LIZ.LJIIJJI;
                if (c1037280d6E != null) {
                    c1037280d6E.LJII();
                }
                C1037280d6E c1037280d6E2 = this.LIZ.LJIIJJI;
                return (c1037280d6E2 == null || c1037280d6E2.LJIJJ) ? false : true;
            }

            @Override // X.AbstractC1038140d7c
            public final boolean LJI() {
                InterfaceC1036190d4T interfaceC1036190d4T = (InterfaceC1036190d4T) this.LIZ.LIZIZ.LJFF(InterfaceC1036190d4T.class);
                if (interfaceC1036190d4T != null) {
                    interfaceC1036190d4T.LJIIL(11);
                }
                C1037280d6E c1037280d6E = this.LIZ.LJIIJJI;
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
                int i = C1038120d7a.LIZ[enumC1038130d7b.ordinal()];
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
                int i = C1038120d7a.LIZIZ[enumC1038100d7Y.ordinal()];
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
                    C1035880d3y c1035880d3y2 = (C1035880d3y) this.LIZ.LIZIZ.LJFF(C1035880d3y.class);
                    Long lValueOf = Long.valueOf(j);
                    if (enumC1038090d7X == EnumC1038090d7X.URL) {
                        str = "url";
                    } else {
                        str = "title";
                    }
                    interfaceC1038080d7W.LJJIFFI(c1035880d3y2, lValueOf, str);
                }
            }
        }, Boolean.valueOf(((Boolean) AdSparkWebViewTitleNewConfig.LIZJ.getValue()).booleanValue()), C1038020d7Q.LIZ(contextThemeWrapper, c1035880d3y), ((Number) AdSparkWebViewTitleNewConfig.LIZIZ.getValue()).intValue(), null, contextThemeWrapper, 832);
        this.LJIIIZ = c1038030d7R;
        TuxNavBar navBar = c1038030d7R.getNavBar();
        this.LJIIJ = navBar != null ? (TuxTextView) navBar.findViewById(R.id.p1i) : null;
        C1038030d7R c1038030d7R2 = this.LJIIIZ;
        if (c1038030d7R2 != null) {
            this.LJIIJJI = new C1037280d6E(c1038030d7R2, true, false, true, this.LIZIZ, new AwS595S0100000_16(this, 327), new AwS560S0100000_16(c1038030d7R2, 835), 32);
        }
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1036400d4o
    public final void li() {
        C1037280d6E c1037280d6E = this.LJIIJJI;
        if (c1037280d6E != null) {
            c1037280d6E.LJII();
        }
    }

    @Override // X.InterfaceC1036400d4o
    public final void LIZLLL(MotionEvent motionEvent) {
        C1037280d6E c1037280d6E = this.LJIIJJI;
        if (c1037280d6E != null) {
            c1037280d6E.LJFF(motionEvent);
        }
    }

    public final void LJII(float f) {
        TuxIconView tuxIconView = this.LJI;
        if (tuxIconView != null) {
            C786410Ut5.x5(tuxIconView, this.LJIIL * f);
        }
        TuxIconView tuxIconView2 = this.LJII;
        if (tuxIconView2 != null) {
            C786410Ut5.x5(tuxIconView2, this.LJIILIIL * f);
        }
        TuxIconView tuxIconView3 = this.LJIIIIZZ;
        if (tuxIconView3 != null) {
            C786410Ut5.x5(tuxIconView3, f);
        }
        TuxIconView tuxIconView4 = this.LJ;
        if (tuxIconView4 != null) {
            C786410Ut5.x5(tuxIconView4, f);
        }
        TuxIconView tuxIconView5 = this.LJFF;
        if (tuxIconView5 != null) {
            C786410Ut5.x5(tuxIconView5, f);
        }
        TuxTextView tuxTextView = this.LJIIJ;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, f);
        }
        if (f == 0.0f) {
            TuxIconView tuxIconView6 = this.LJI;
            if (tuxIconView6 != null) {
                tuxIconView6.setClickable(false);
            }
            TuxIconView tuxIconView7 = this.LJII;
            if (tuxIconView7 != null) {
                tuxIconView7.setClickable(false);
            }
            TuxIconView tuxIconView8 = this.LJIIIIZZ;
            if (tuxIconView8 != null) {
                tuxIconView8.setClickable(false);
            }
            TuxIconView tuxIconView9 = this.LJ;
            if (tuxIconView9 != null) {
                tuxIconView9.setClickable(false);
            }
            TuxIconView tuxIconView10 = this.LJFF;
            if (tuxIconView10 != null) {
                tuxIconView10.setClickable(false);
                return;
            }
            return;
        }
        TuxIconView tuxIconView11 = this.LJ;
        if (tuxIconView11 == null || tuxIconView11.isClickable()) {
            return;
        }
        TuxIconView tuxIconView12 = this.LJI;
        if (tuxIconView12 != null) {
            tuxIconView12.setClickable(true);
        }
        TuxIconView tuxIconView13 = this.LJII;
        if (tuxIconView13 != null) {
            tuxIconView13.setClickable(true);
        }
        TuxIconView tuxIconView14 = this.LJIIIIZZ;
        if (tuxIconView14 != null) {
            tuxIconView14.setClickable(true);
        }
        TuxIconView tuxIconView15 = this.LJ;
        if (tuxIconView15 != null) {
            tuxIconView15.setClickable(true);
        }
        TuxIconView tuxIconView16 = this.LJFF;
        if (tuxIconView16 == null) {
            return;
        }
        tuxIconView16.setClickable(true);
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
        this.LJIIL = f;
        if (z2) {
            f3 = 1.0f;
        }
        this.LJIILIIL = f3;
        TuxIconView tuxIconView = this.LJI;
        if (tuxIconView != null) {
            tuxIconView.setClickable(z);
        }
        TuxIconView tuxIconView2 = this.LJII;
        if (tuxIconView2 != null) {
            tuxIconView2.setClickable(z2);
        }
        C1037280d6E c1037280d6E = this.LJIIJJI;
        if (c1037280d6E != null) {
            f2 = c1037280d6E.LJIIIZ;
        } else {
            f2 = 1.0f;
        }
        LJII(C13LZ.LIZLLL(f2, 0.0f, 1.0f));
    }

    public C1037970d7L(Context context, AdSparkHybridContext adSparkHybridContext, InterfaceC1036860d5Y interfaceC1036860d5Y, InterfaceC1036210d4V interfaceC1036210d4V) {
        this.LIZ = context;
        this.LIZIZ = adSparkHybridContext;
        this.LIZJ = interfaceC1036860d5Y;
        this.LIZLLL = interfaceC1036210d4V;
    }

    @Override // X.InterfaceC1036400d4o
    public final void LIZIZ(int i, int i2, int i3, int i4) {
        C1037280d6E c1037280d6E = this.LJIIJJI;
        if (c1037280d6E != null) {
            c1037280d6E.LJ(i2, i4);
        }
    }
}
