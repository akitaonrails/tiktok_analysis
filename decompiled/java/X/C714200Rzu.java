package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.depend.AdLandPageSlideDependImpl;
import com.ss.android.ugc.aweme.commercialize.model.LeftSlideGuideConfig;
import com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterAdapterService;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterModelTransform;
import com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0Rzu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714200Rzu extends AbstractC714000Rza {
    public final Activity LLILZIL;
    public final RootCellComponent LLILZLL;
    public final List<C714230Rzx> LLIZ;
    public final Aweme LLIZLLLIL;
    public final Map<Integer, View> LLJ;
    public final List<View> LLJI;
    public InterfaceC714210Rzv LLJIJIL;

    @Override // X.AbstractC714000Rza
    public final String LJJIJL() {
        return "";
    }

    @Override // X.AbstractC714000Rza
    public final Fragment LJJIJLIJ(View view) {
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLIZ.size();
    }

    @Override // X.AbstractC714000Rza
    public final int LJJIL(int i) {
        return ((C714230Rzx) ListProtector.get(this.LLIZ, i)).LIZ;
    }

    @Override // X.AbstractC714000Rza
    public final int LJJIZ(View view) {
        Object tag;
        if (view != null) {
            tag = view.getTag(R.id.vjq);
        } else {
            tag = null;
        }
        if (tag instanceof Integer) {
            return ((Number) tag).intValue();
        }
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("expect tag is type int,but no:");
        sbLIZ.append(tag);
        c2276411E8h.LIZIZ("common_feed", new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
        return 0;
    }

    @Override // X.AbstractC714000Rza
    public final void LJJJJI(View view) {
        InterfaceC714210Rzv interfaceC714210Rzv;
        Object tag = null;
        if (view != null) {
            tag = view.getTag(R.id.vjp);
        }
        if ((tag instanceof InterfaceC714210Rzv) && (interfaceC714210Rzv = (InterfaceC714210Rzv) tag) != null) {
            interfaceC714210Rzv.LIZ();
        }
    }

    public final InterfaceC714210Rzv LJJJJIZL(int i) {
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        InteractAreaCommonAbility interactAreaCommonAbility;
        int iLJJIL = LJJIL(i);
        if (iLJJIL != 0) {
            if (iLJJIL != 1) {
                return new InterfaceC714210Rzv() { // from class: X.0Rzw
                    @Override // X.InterfaceC714210Rzv
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC714210Rzv
                    public final void LJ(View view) {
                    }

                    @Override // X.InterfaceC714210Rzv
                    public final void LJFF() {
                    }
                };
            }
            final Context context = this.LLILLL;
            final Aweme aweme = this.LLIZLLLIL;
            final RootCellComponent rootCellComponent = this.LLILZLL;
            RootCellComponent rootCellComponent2 = this.LLILZLL;
            if (rootCellComponent2 != null && (interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(rootCellComponent2)) != null && (interactAreaCommonAbility = (InteractAreaCommonAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, InteractAreaCommonAbility.class, null)) != null) {
                interactAreaCommonAbility.LQ("right_container");
            }
            return new InterfaceC714210Rzv(context, aweme, rootCellComponent) { // from class: X.0SOq
                public final Context LIZ;
                public final Aweme LIZIZ;
                public final RootCellComponent LIZJ;
                public TuxIconView LIZLLL;
                public TuxTextView LJ;
                public RelativeLayout LJFF;
                public boolean LJI;
                public final boolean LJII;
                public final float LJIIIIZZ;
                public final String LJIIIZ;

                @Override // X.InterfaceC714210Rzv
                public final void LJFF() {
                    ViewGroup.MarginLayoutParams marginLayoutParams;
                    RootCellComponent rootCellComponent3;
                    InterfaceC665370Q7z interfaceC665370Q7zLJIIL2;
                    CellAdaptionComponentAbility cellAdaptionComponentAbility;
                    AdaptionPaddingValues adaptionPaddingValuesNs0;
                    InterfaceC665370Q7z interfaceC665370Q7zLJIIL3;
                    InteractAreaCommonAbility interactAreaCommonAbility2;
                    C720670SOr c720670SOrLQ;
                    RelativeLayout relativeLayout = this.LJFF;
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
                    ViewGroup.LayoutParams layoutParams = relativeLayout != null ? relativeLayout.getLayoutParams() : null;
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        RootCellComponent rootCellComponent4 = this.LIZJ;
                        int bottom = 0;
                        int i2 = (rootCellComponent4 == null || (interfaceC665370Q7zLJIIL3 = C1558520qew.LJIIL(rootCellComponent4)) == null || (interactAreaCommonAbility2 = (InteractAreaCommonAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL3, InteractAreaCommonAbility.class, null)) == null || (c720670SOrLQ = interactAreaCommonAbility2.LQ("right_container")) == null) ? 0 : c720670SOrLQ.LIZJ;
                        if (C0BUH.LIZJ && (rootCellComponent3 = this.LIZJ) != null && (interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(rootCellComponent3)) != null && (cellAdaptionComponentAbility = (CellAdaptionComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL2, CellAdaptionComponentAbility.class, null)) != null && (adaptionPaddingValuesNs0 = cellAdaptionComponentAbility.Ns0()) != null) {
                            bottom = adaptionPaddingValuesNs0.getBottom();
                        }
                        if (i2 == 0) {
                            marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(387));
                        } else {
                            marginLayoutParams.bottomMargin = (i2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) - bottom;
                        }
                        marginLayoutParams2 = marginLayoutParams;
                    }
                    RelativeLayout relativeLayout2 = this.LJFF;
                    if (relativeLayout2 != null) {
                        C786410Ut5.e6(relativeLayout2, marginLayoutParams2);
                    }
                }

                @Override // X.InterfaceC714210Rzv
                public final void LIZ() {
                    C622680Oba.LIZLLL(this);
                }

                public final void LIZIZ(EnumC714390S0n enumC714390S0n) {
                    String aid;
                    AwemeRawAd awemeRawAdLJJIJLIJ;
                    AwemeRawAd awemeRawAdLJJIJLIJ2;
                    C0SQJ.LIZJ = true;
                    Context context2 = null;
                    if (((ICRouterAdapterService) ServiceManager.get().getService(ICRouterAdapterService.class)).LIZJ(40, this.LIZIZ, this.LJIIIZ)) {
                        AdLandPageSlideDependImpl.LIZIZ().LIZ(this.LIZ, this.LIZIZ);
                        if (this.LJII && !C1017070cZd.LJLZ(this.LIZIZ)) {
                            C0SPE c0spe = new C0SPE(this.LIZ.hashCode());
                            c0spe.LIZJ = "click_app_full_screen_ad";
                            C1440005kM.LIZ(new C690450R6l("homepage_hot"));
                            C1440005kM.LIZ(c0spe);
                        } else {
                            ICRouterManager iCRouterManager = (ICRouterManager) ServiceManager.get().getService(ICRouterManager.class);
                            Context context3 = this.LIZ;
                            Aweme aweme2 = this.LIZIZ;
                            if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                                aid = "";
                            }
                            Aweme aweme3 = this.LIZIZ;
                            if (aweme3 != null) {
                                awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme3);
                            } else {
                                awemeRawAdLJJIJLIJ = null;
                            }
                            ICRouterModelTransform iCRouterModelTransform = (ICRouterModelTransform) ServiceManager.get().getService(ICRouterModelTransform.class);
                            Aweme aweme4 = this.LIZIZ;
                            if (aweme4 != null) {
                                awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme4);
                            } else {
                                awemeRawAdLJJIJLIJ2 = null;
                            }
                            iCRouterManager.LIZLLL(new C1025880cnq(context3, aid, aweme3, awemeRawAdLJJIJLIJ, iCRouterModelTransform.LIZ(awemeRawAdLJJIJLIJ2)), new C1025520cnG(EnumC345560Dgg.TYPE_SLIDE_GO, "fyp_slide", null, "slide", "draw_ad", 40, null, null, 964), null, false).LJI();
                        }
                    } else if (this.LJII) {
                        AdLandPageSlideDependImpl.LIZIZ().LIZ(this.LIZ, this.LIZIZ);
                        if (C1017070cZd.LJLZ(this.LIZIZ)) {
                            C1029590ctp.LIZIZ();
                            C0SQ9.LIZ(this.LIZ, this.LIZIZ, 40, null);
                        } else {
                            C0SPE c0spe2 = new C0SPE(this.LIZ.hashCode());
                            c0spe2.LIZJ = "click_app_full_screen_ad";
                            C1440005kM.LIZ(new C690450R6l("homepage_hot"));
                            C1440005kM.LIZ(c0spe2);
                        }
                    } else {
                        IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
                        if (iAdSceneService != null && iAdSceneService.LIZIZ() != null) {
                            TuxIconView tuxIconView = this.LIZLLL;
                            if (tuxIconView != null) {
                                context2 = tuxIconView.getContext();
                            }
                            C1022290ci3.LJIILLIIL(context2, this.LJIIIZ);
                        }
                    }
                    TuxIconView tuxIconView2 = this.LIZLLL;
                    if (tuxIconView2 != null) {
                        tuxIconView2.setIconRes(R.raw.icon_arrow_left_circle_ltr);
                    }
                    C0SQJ.LIZJ = false;
                    C0SQJ.LIZ.getClass();
                    C0SQJ.LIZIZ = true;
                    Objects.toString(enumC714390S0n);
                }

                @Override // X.InterfaceC714210Rzv
                public final void LJ(View view) {
                    String string;
                    AwemeRawAd awemeRawAd;
                    LeftSlideGuideConfig leftSlideGuideConfig;
                    C622680Oba.LIZJ(this);
                    this.LIZLLL = (TuxIconView) view.findViewById(R.id.video_slide_ad_hint_icon);
                    this.LJ = (TuxTextView) view.findViewById(R.id.video_slide_ad_hint_text);
                    this.LJFF = (RelativeLayout) view.findViewById(R.id.jba);
                    LJFF();
                    Aweme aweme2 = this.LIZIZ;
                    if (aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null || (leftSlideGuideConfig = awemeRawAd.getLeftSlideGuideConfig()) == null || (string = leftSlideGuideConfig.getGuideText()) == null) {
                        string = this.LIZ.getString(2131836454);
                    }
                    TuxTextView tuxTextView = this.LJ;
                    if (tuxTextView != null) {
                        tuxTextView.setText(string);
                    }
                }

                @C14EU(threadMode = ThreadMode.MAIN)
                public final void onPageChanged(C714410S0p c714410S0p) {
                    TuxIconView tuxIconView;
                    boolean z;
                    ISamsungPageService iSamsungPageService;
                    Context context2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPageChanged(),event.onPageChangeMode =");
                    sbLIZ.append(c714410S0p.LIZ);
                    sbLIZ.append(",event.position = ");
                    sbLIZ.append(c714410S0p.LIZIZ);
                    sbLIZ.append(",event.positionOffsetPixels = ");
                    sbLIZ.append(c714410S0p.LIZLLL);
                    sbLIZ.append(",event.state = ");
                    sbLIZ.append(c714410S0p.LJ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    int i2 = C714380S0m.LIZ[c714410S0p.LIZ.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 != 5) {
                                        throw new C1954807lC();
                                    }
                                    return;
                                } else {
                                    if (c714410S0p.LIZIZ == 1) {
                                        C0SQJ.LIZ.getClass();
                                        if (!C0SQJ.LIZIZ) {
                                            LIZIZ(EnumC714390S0n.PAGE_SELECTED);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            this.LJI = false;
                            C0SQJ.LIZ.getClass();
                            C0SQJ.LIZIZ = false;
                            return;
                        }
                        TuxIconView tuxIconView2 = this.LIZLLL;
                        if (tuxIconView2 != null && tuxIconView2.getContext() != null && this.LJI) {
                            C0SQJ.LIZ.getClass();
                            if (!C0SQJ.LIZIZ) {
                                LIZIZ(EnumC714390S0n.ACTION_UP);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (c714410S0p.LIZJ != null && c714410S0p.LIZLLL != null && (tuxIconView = this.LIZLLL) != null && tuxIconView.getContext() != null) {
                        float fIntValue = c714410S0p.LIZLLL.intValue();
                        float fLIZJ = this.LJIIIIZZ;
                        if (fLIZJ == 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        AwemeRawAd awemeRawAd = null;
                        if (z) {
                            TuxIconView tuxIconView3 = this.LIZLLL;
                            if (tuxIconView3 != null) {
                                context2 = tuxIconView3.getContext();
                            } else {
                                context2 = null;
                            }
                            fLIZJ = C12ES.LIZJ(110.0f, context2);
                        }
                        if (fIntValue >= fLIZJ) {
                            this.LJI = true;
                            TuxIconView tuxIconView4 = this.LIZLLL;
                            if (tuxIconView4 != null) {
                                tuxIconView4.setIconRes(R.raw.icon_tick_circle_fill);
                            }
                            C0SQJ.LIZ.getClass();
                            if (!C0SQJ.LIZIZ && (iSamsungPageService = (ISamsungPageService) PluggableExtentionKt.pluggableSpi$default(ISamsungPageService.class, false, false, false, 14, null)) != null) {
                                Aweme aweme2 = this.LIZIZ;
                                if (aweme2 != null) {
                                    awemeRawAd = aweme2.getAwemeRawAd();
                                }
                                if (iSamsungPageService.LJ(awemeRawAd)) {
                                    LIZIZ(EnumC714390S0n.PAGE_SCROLL);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        this.LJI = false;
                        TuxIconView tuxIconView5 = this.LIZLLL;
                        if (tuxIconView5 != null) {
                            tuxIconView5.setIconRes(R.raw.icon_arrow_left_circle_ltr);
                        }
                    }
                }

                {
                    C690870R8b c690870R8bJm;
                    C0RF0 c0rf0;
                    String str;
                    this.LIZ = context;
                    this.LIZIZ = aweme;
                    this.LIZJ = rootCellComponent;
                    this.LJII = !C1017070cZd.LL(aweme);
                    float fLIZ = C07D6.LIZ();
                    ScreenUtils.getScreenWidth(context);
                    C0IKF.LIZ.getClass();
                    this.LJIIIIZZ = fLIZ * C465320IMo.LIZ().LIZIZ(context).LIZ().width();
                    this.LJIIIZ = (rootCellComponent == null || (c690870R8bJm = rootCellComponent.jm()) == null || (c0rf0 = c690870R8bJm.LIZLLL) == null || (str = c0rf0.LJIIIZ) == null) ? "" : str;
                }
            };
        }
        return new InterfaceC714210Rzv() { // from class: X.0Rzw
            @Override // X.InterfaceC714210Rzv
            public final void LIZ() {
            }

            @Override // X.InterfaceC714210Rzv
            public final void LJ(View view) {
            }

            @Override // X.InterfaceC714210Rzv
            public final void LJFF() {
            }
        };
    }

    @Override // X.AbstractC714000Rza
    public final View LJJJI(int i, View view, ViewGroup viewGroup) {
        int i2;
        View viewRemove;
        int iLJJIL = LJJIL(i);
        if (this.LLJ.containsKey(Integer.valueOf(i)) && (viewRemove = this.LLJ.remove(Integer.valueOf(i))) != null) {
            InterfaceC714210Rzv interfaceC714210RzvLJJJJIZL = LJJJJIZL(i);
            this.LLJIJIL = interfaceC714210RzvLJJJJIZL;
            viewRemove.setTag(R.id.vjp, interfaceC714210RzvLJJJJIZL);
            viewRemove.setTag(R.id.vjq, Integer.valueOf(iLJJIL));
            interfaceC714210RzvLJJJJIZL.LJ(viewRemove);
            ((ArrayList) this.LLJI).add(viewRemove);
            return viewRemove;
        }
        if (view == null || !Objects.equals(Integer.valueOf(iLJJIL), view.getTag(R.id.vjq))) {
            Activity activity = this.LLILZIL;
            if (LJJIL(i) != 1) {
                i2 = R.layout.baa;
            } else {
                i2 = R.layout.ba_;
            }
            view = C20673215v0.LIZJ(i2, activity);
        }
        InterfaceC714210Rzv interfaceC714210RzvLJJJJIZL2 = LJJJJIZL(i);
        this.LLJIJIL = interfaceC714210RzvLJJJJIZL2;
        view.setTag(R.id.vjp, interfaceC714210RzvLJJJJIZL2);
        view.setTag(R.id.vjq, Integer.valueOf(iLJJIL));
        interfaceC714210RzvLJJJJIZL2.LJ(view);
        ((ArrayList) this.LLJI).add(view);
        return view;
    }

    public C714200Rzu(C19EG c19eg, RootCellComponent rootCellComponent, List list, Aweme aweme) {
        super(c19eg, 2);
        this.LLILZIL = c19eg;
        this.LLILZLL = rootCellComponent;
        this.LLIZ = list;
        this.LLIZLLLIL = aweme;
        this.LLJ = new LinkedHashMap();
        this.LLJI = new ArrayList();
    }
}
