package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.AdOneStopLandingPageComponentConfig;
import com.ss.android.ugc.aweme.feed.model.ad.AdOneStopLandingPageConfig;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS23S1100100_35;

/* JADX INFO: renamed from: X.0d84, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038420d84 implements InterfaceC1038430d85 {
    public static final List<InterfaceC1038440d86> LIZIZ = C1697810uHb.LJIIJJI(new AbstractC1038460d88() { // from class: X.1DXd
        @Override // X.AbstractC1038460d88
        public final AdOneStopLandingPageComponentConfig LIZJ(C1035880d3y c1035880d3y) {
            AdStyleActionModel adStyleActionModel;
            AdOneStopLandingPageConfig adOneStopLandingPageConfig;
            AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
            if (awemeRawAd != null && (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) != null && (adOneStopLandingPageConfig = adStyleActionModel.landingPageConfig) != null) {
                return adOneStopLandingPageConfig.getBackgroundConfig();
            }
            return null;
        }

        @Override // X.AbstractC1038460d88
        public final InterfaceC1038430d85 LIZIZ(SparkContext sparkContext, C1035880d3y c1035880d3y, AdOneStopLandingPageComponentConfig adOneStopLandingPageComponentConfig) {
            View viewE1;
            View rootView;
            View viewFindViewById;
            ViewGroup viewGroup;
            InterfaceC1541990qEH interfaceC1541990qEHLJIJJ = sparkContext.LJIJJ();
            if (interfaceC1541990qEHLJIJJ == null || (viewE1 = interfaceC1541990qEHLJIJJ.e1()) == null || (rootView = viewE1.getRootView()) == null || (viewFindViewById = rootView.getRootView().findViewById(R.id.fpl)) == null || !(viewFindViewById instanceof ViewGroup) || (viewGroup = (ViewGroup) viewFindViewById) == null) {
                return null;
            }
            C2257401DXe c2257401DXe = new C2257401DXe(viewE1, viewGroup);
            return new AbstractC2257361DXa(c1035880d3y, new C2257371DXb(new C2257581DXw().LIZ(viewE1, adOneStopLandingPageComponentConfig, c2257401DXe), new C2257551DXt().LIZ(viewE1, adOneStopLandingPageComponentConfig, c2257401DXe)), c2257401DXe, viewGroup) { // from class: X.1DXZ
                public final C2257401DXe LIZLLL;
                public final ViewGroup LJ;
                public boolean LJFF;
                public boolean LJI;
                public boolean LJII;
                public long LJIIIIZZ;

                public static final C0N1H LJI() {
                    return C0N1H.BACKGROUND;
                }

                public static C1541940qEC LJFF(ViewGroup viewGroup2) {
                    C1541940qEC c1541940qECLJFF;
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup2.getChildAt(i);
                        if (childAt instanceof C1541940qEC) {
                            return (C1541940qEC) childAt;
                        }
                        if ((childAt instanceof ViewGroup) && (c1541940qECLJFF = LJFF((ViewGroup) childAt)) != null) {
                            return c1541940qECLJFF;
                        }
                    }
                    return null;
                }

                @Override // X.InterfaceC1038430d85
                public final void LIZ(AbstractC1039890dAR abstractC1039890dAR) {
                    Context context;
                    int iIntValue;
                    if (this.LJFF && this.LJI) {
                        return;
                    }
                    if (abstractC1039890dAR instanceof C1036510d4z) {
                        ViewGroup viewGroup2 = this.LJ;
                        int iIntValue2 = -1;
                        if (!this.LJII) {
                            this.LJII = true;
                            C1541940qEC c1541940qECLJFF = LJFF(viewGroup2);
                            if (c1541940qECLJFF != null && (context = viewGroup2.getContext()) != null) {
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, context);
                                if (numLIZJ != null) {
                                    iIntValue = numLIZJ.intValue();
                                } else {
                                    iIntValue = -1;
                                }
                                View viewFindViewById2 = c1541940qECLJFF.findViewById(R.id.vsu);
                                if (viewFindViewById2 != null) {
                                    int paddingTop = viewFindViewById2.getPaddingTop();
                                    View viewFindViewById3 = c1541940qECLJFF.findViewById(R.id.ye_);
                                    if (viewFindViewById3 != null) {
                                        viewFindViewById3.setBackgroundColor(iIntValue);
                                        View viewFindViewById4 = c1541940qECLJFF.findViewById(R.id.jub);
                                        if (viewFindViewById4 == null) {
                                            viewFindViewById4 = new View(context);
                                            viewFindViewById4.setId(R.id.jub);
                                            C19ME c19me = new C19ME(0, paddingTop);
                                            c19me.topToTop = 0;
                                            c19me.startToStart = 0;
                                            c19me.endToEnd = 0;
                                            c1541940qECLJFF.addView(viewFindViewById4, 0, c19me);
                                        } else {
                                            viewFindViewById4.getLayoutParams().height = paddingTop;
                                            viewFindViewById4.requestLayout();
                                        }
                                        viewFindViewById4.setBackgroundColor(iIntValue);
                                    }
                                }
                            }
                        }
                        C2257401DXe c2257401DXe2 = this.LIZLLL;
                        Context context2 = c2257401DXe2.LIZ.getContext();
                        if (context2 != null) {
                            View viewFindViewById5 = c2257401DXe2.LIZ.findViewById(R.id.jua);
                            if (viewFindViewById5 != null) {
                                c2257401DXe2.LIZJ = viewFindViewById5;
                            } else {
                                View view = new View(c2257401DXe2.LIZ.getContext());
                                view.setId(R.id.jua);
                                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1b, context2);
                                if (numLIZJ2 != null) {
                                    iIntValue2 = numLIZJ2.intValue();
                                }
                                view.setBackgroundColor(iIntValue2);
                                c2257401DXe2.LIZ.addView(view, 0, layoutParams);
                                c2257401DXe2.LIZJ = view;
                            }
                        }
                        c2257401DXe2.LIZ.setBackgroundColor(0);
                        C786410Ut5.T4(c2257401DXe2.LIZIZ, 0.0f);
                        LIZ(C1040010dAd.LIZIZ);
                        return;
                    }
                    C2257371DXb c2257371DXb = this.LIZIZ;
                    c2257371DXb.LIZLLL = this;
                    c2257371DXb.LIZ(abstractC1039890dAR);
                    if (abstractC1039890dAR instanceof C1036500d4y) {
                        ((ArrayList) this.LIZJ).clear();
                    }
                }

                @Override // X.InterfaceC2257521DXq
                public final void LIZIZ(EnumC1781620wSm enumC1781620wSm) {
                    float alpha;
                    if (enumC1781620wSm == EnumC1781620wSm.LOADING) {
                        this.LJFF = true;
                        this.LJIIIIZZ = System.currentTimeMillis();
                        return;
                    }
                    if (enumC1781620wSm != EnumC1781620wSm.COMPLETE) {
                        return;
                    }
                    this.LJI = true;
                    C2257401DXe c2257401DXe2 = this.LIZLLL;
                    c2257401DXe2.LIZLLL = true;
                    View view = c2257401DXe2.LIZIZ;
                    View view2 = c2257401DXe2.LIZJ;
                    if (view2 != null) {
                        alpha = view2.getAlpha();
                    } else {
                        alpha = 0.0f;
                    }
                    C786410Ut5.T4(view, alpha);
                    Iterator it2 = ((ArrayList) this.LIZJ).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1036450d4t) it2.next()).LIZIZ(LJI());
                    }
                }

                @Override // X.InterfaceC2257521DXq
                public final void LIZJ(String str, EnumC1781620wSm enumC1781620wSm) {
                    if (enumC1781620wSm == EnumC1781620wSm.COMPLETE) {
                        C2257401DXe c2257401DXe2 = this.LIZLLL;
                        View view = c2257401DXe2.LIZJ;
                        if (view != null) {
                            C786410Ut5.LJJJLZIJ(view, c2257401DXe2.LIZ);
                            c2257401DXe2.LIZJ = null;
                        }
                        new AdWebEventLogger(this.LIZ).logAd(C2257461DXk.LIZ, this.LIZ.getAwemeRawAd(), new AwS23S1100100_35(System.currentTimeMillis() - this.LJIIIIZZ, str, this, 2));
                        Iterator it2 = ((ArrayList) this.LIZJ).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC1036450d4t) it2.next()).LIZ(LJI());
                        }
                    }
                }

                {
                    this.LIZLLL = c2257401DXe;
                    this.LJ = viewGroup;
                }
            };
        }
    }, new AbstractC1038460d88() { // from class: X.1DXc
        @Override // X.AbstractC1038460d88
        public final AdOneStopLandingPageComponentConfig LIZJ(C1035880d3y c1035880d3y) {
            AdStyleActionModel adStyleActionModel;
            AdOneStopLandingPageConfig adOneStopLandingPageConfig;
            AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
            if (awemeRawAd != null && (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) != null && (adOneStopLandingPageConfig = adStyleActionModel.landingPageConfig) != null) {
                return adOneStopLandingPageConfig.getProgressBarConfig();
            }
            return null;
        }

        @Override // X.AbstractC1038460d88
        public final InterfaceC1038430d85 LIZIZ(SparkContext sparkContext, C1035880d3y c1035880d3y, AdOneStopLandingPageComponentConfig adOneStopLandingPageComponentConfig) {
            View viewE1;
            View view;
            View rootView;
            View viewFindViewById;
            InterfaceC1541990qEH interfaceC1541990qEHLJIJJ = sparkContext.LJIJJ();
            if (interfaceC1541990qEHLJIJJ == null || (viewE1 = interfaceC1541990qEHLJIJJ.e1()) == null) {
                return null;
            }
            Object parent = viewE1.getParent();
            if (parent instanceof View) {
                view = (View) parent;
                while (view != null) {
                    if (view.getId() != R.id.vsu || !(view instanceof ViewGroup)) {
                        Object parent2 = view.getParent();
                        if (!(parent2 instanceof View)) {
                            break;
                        }
                        view = (View) parent2;
                    } else {
                        break;
                    }
                }
                view = null;
            } else {
                view = null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup == null || (rootView = viewE1.getRootView()) == null || (viewFindViewById = rootView.findViewById(R.id.s8q)) == null) {
                return null;
            }
            C2257421DXg c2257421DXg = new C2257421DXg(viewGroup);
            return new C1DXY(sparkContext, viewGroup, adOneStopLandingPageComponentConfig.getHeight(), c1035880d3y, new C2257371DXb(new C2257581DXw().LIZ(viewFindViewById, adOneStopLandingPageComponentConfig, c2257421DXg), new C2257551DXt().LIZ(viewFindViewById, adOneStopLandingPageComponentConfig, c2257421DXg)));
        }
    });
    public final List<InterfaceC1038430d85> LIZ;

    public C1038420d84(List list) {
        this.LIZ = list;
    }

    @Override // X.InterfaceC1038430d85
    public final void LIZ(AbstractC1039890dAR abstractC1039890dAR) {
        Iterator<InterfaceC1038430d85> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(abstractC1039890dAR);
        }
    }

    @Override // X.InterfaceC1038430d85
    public final void LJ(C1036250d4Z c1036250d4Z) {
        Iterator<InterfaceC1038430d85> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJ(c1036250d4Z);
        }
    }
}
