package X;

import Y.ACListenerS147S0100000_12;
import Y.ARunnableS17S1200000_12;
import Y.ARunnableS81S0200000_12;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.IStrategyCenterService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS161S1100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TJB, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TJB extends C0TJC {
    public final ViewGroup LIZIZ;
    public final InterfaceC1368705Xh LIZJ;
    public final String LIZLLL;
    public final Integer LJ;
    public final EnumC742790TBt LJFF;
    public final C1620050sGB LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final IStrategyCenterService LJIIIZ;
    public TuxTextView LJIIJ;
    public TuxTextView LJIIJJI;
    public C197039127h LJIIL;
    public View LJIILIIL;
    public View LJIILJJIL;
    public C0T00 LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public C20656615sK LJIJ;
    public String LJIJI;
    public C1303280k1G LJIJJ;
    public C423100GiS LJIJJLI;
    public SwipeUpGuideStrengthenLayout LJIL;

    public final void LIZ() {
        C20656615sK c20656615sK = this.LJIJ;
        if (c20656615sK != null) {
            c20656615sK.LIZ();
        }
        LIZIZ("slide_up");
    }

    public final boolean LIZJ() {
        View view = this.LJIILIIL;
        return view != null && view.getVisibility() == 0;
    }

    public final void LIZIZ(String str) {
        C0T00 c0t00;
        View view;
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()) && (view = this.LJIILIIL) != null) {
            ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
            if (iSpecActService != null) {
                iSpecActService.LJJJLIIL(false);
            }
            view.animate().alpha(0.0f).setDuration(300L).withEndAction(new ARunnableS17S1200000_12(view, this, str, 11)).start();
        }
        if (this.LJFF == EnumC742790TBt.NOT_INTERESTED_TUTORIAL && (c0t00 = this.LJIILL) != null) {
            c0t00.LIZ((SystemClock.elapsedRealtime() - this.LJIILLIIL) + this.LJIIZILJ, "got_it");
        }
    }

    public final void LIZLLL(C20656615sK c20656615sK) {
        MainActivityScope mainActivityScopeLIZ;
        HomeViewPagerAbility homeViewPagerAbilityLIZ;
        String str;
        View view = this.LJIILIIL;
        if (view == null || view.getParent() == null) {
            this.LIZIZ.addView(this.LJIILIIL);
        }
        this.LJIJ = c20656615sK;
        View view2 = this.LJIILIIL;
        if (view2 != null) {
            C1391850mK7.LIZIZ(view2, "swipe_up_guide_mask");
            C786410Ut5.LJLLLLLL(0, view2);
            C786410Ut5.T4(view2, 0.0f);
            view2.animate().alpha(1.0f).setDuration(300L).withEndAction(new ARunnableS81S0200000_12(view2, this, 126)).start();
            EnumC742790TBt enumC742790TBt = this.LJFF;
            if (enumC742790TBt == EnumC742790TBt.SWIPE_UP_GUIDE) {
                if (this.LJIIIZ.LJIIJ()) {
                    str = "swipe_up_dot_gesture";
                } else {
                    str = "swipe_up_phone_gesture";
                }
                C0CNO.LIZ(C15O7.LJI, new AwS161S1100000_12(str, this, 5));
                this.LJI.LJIIJ(true);
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(false).LJI();
            } else if (enumC742790TBt == EnumC742790TBt.NOT_INTERESTED_TUTORIAL) {
                this.LJI.LJIIIIZZ(true);
            }
        }
        View view3 = this.LJIILIIL;
        if (view3 != null && (mainActivityScopeLIZ = C0S4U.LIZ(view3)) != null && (homeViewPagerAbilityLIZ = C0CUK.LIZ(mainActivityScopeLIZ)) != null) {
            homeViewPagerAbilityLIZ.LLJJI(new C786270Usr(this, 1));
        }
    }

    public C0TJB(ViewGroup viewGroup, VerticalViewPager verticalViewPager, String str, Integer num, EnumC742790TBt enumC742790TBt) {
        boolean z;
        int i;
        View viewTd;
        TuxTextView tuxTextView;
        View viewFindViewById;
        TuxTextView tuxTextView2;
        CharSequence text;
        Integer numValueOf;
        super(viewGroup);
        this.LIZIZ = viewGroup;
        this.LIZJ = verticalViewPager;
        this.LIZLLL = str;
        this.LJ = num;
        this.LJFF = enumC742790TBt;
        this.LJI = C0SHX.LIZ(viewGroup.getContext(), null);
        if (enumC742790TBt == EnumC742790TBt.SWIPE_UP_GUIDE && C0C64.LJIILLIIL().LJIJI(ClientExpManager.launch_opt_swipeup(), "launch_opt_swipeup") == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJII = z;
        this.LJIIIIZZ = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLLI();
        this.LJIIIZ = (IStrategyCenterService) ServiceManager.get().getService(IStrategyCenterService.class);
        this.LJIILLIIL = SystemClock.elapsedRealtime();
        if (this.LJIILIIL == null) {
            int i2 = C0TAT.LIZ[enumC742790TBt.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    i = R.layout.b_l;
                } else {
                    throw new C1954807lC();
                }
            } else {
                i = R.layout.bao;
            }
            if (C104100aN.LIZ().isNewUser()) {
                try {
                    viewTd = C20673215v0.LIZJ(i, C1388190mED.LIZ(viewGroup.getContext()));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZ.getContext()), i, this.LIZIZ, false);
                }
            } else {
                viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false);
            }
            this.LJIILIIL = viewTd;
            if (viewTd != null) {
                tuxTextView = (TuxTextView) viewTd.findViewById(R.id.tv_strengthen_swipe_up_guide);
            } else {
                tuxTextView = null;
            }
            this.LJIIJ = tuxTextView;
            View view = this.LJIILIIL;
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.wsk);
            } else {
                viewFindViewById = null;
            }
            this.LJIILJJIL = viewFindViewById;
            Integer num2 = this.LJ;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                TuxTextView tuxTextView3 = this.LJIIJ;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(this.LIZ.getContext().getString(iIntValue));
                }
            }
            EnumC742790TBt enumC742790TBt2 = this.LJFF;
            if (enumC742790TBt2 == EnumC742790TBt.SWIPE_UP_GUIDE) {
                View view2 = this.LJIILIIL;
                if (view2 instanceof SwipeUpGuideStrengthenLayout) {
                    SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = (SwipeUpGuideStrengthenLayout) view2;
                    this.LJIL = swipeUpGuideStrengthenLayout;
                    C2271391DvN.LIZ(swipeUpGuideStrengthenLayout, (C1A5L) C2271381DvM.LJIIZILJ.getValue());
                }
                SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout2 = this.LJIL;
                if (swipeUpGuideStrengthenLayout2 != null) {
                    swipeUpGuideStrengthenLayout2.setViewPager(this.LIZJ);
                    swipeUpGuideStrengthenLayout2.setFallBackRunnable(new AwS591S0100000_12(this, 1007));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("viewPager ");
                    sbLIZ.append(this.LIZJ);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            } else if (enumC742790TBt2 == EnumC742790TBt.NOT_INTERESTED_TUTORIAL) {
                View view3 = this.LJIILIIL;
                if (view3 != null) {
                    tuxTextView2 = (TuxTextView) view3.findViewById(R.id.tv_strengthen_swipe_up_guide_second_line);
                } else {
                    tuxTextView2 = null;
                }
                this.LJIIJJI = tuxTextView2;
                View view4 = this.LJIILIIL;
                C197039127h c197039127h = view4 != null ? (C197039127h) view4.findViewById(R.id.fy2) : null;
                this.LJIIL = c197039127h;
                if (c197039127h != null) {
                    C786410Ut5.U8(c197039127h, new ACListenerS147S0100000_12(this, 387));
                }
            }
            TuxTextView tuxTextView4 = this.LJIIJ;
            if (tuxTextView4 != null && (text = tuxTextView4.getText()) != null && (numValueOf = Integer.valueOf(text.length())) != null) {
                int iIntValue2 = numValueOf.intValue();
                if (1 <= iIntValue2) {
                    if (iIntValue2 >= 21) {
                        if (iIntValue2 < 41) {
                            TuxTextView tuxTextView5 = this.LJIIJ;
                            if (tuxTextView5 != null) {
                                tuxTextView5.setTextSize(25.0f);
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                }
                TuxTextView tuxTextView6 = this.LJIIJ;
                if (tuxTextView6 == null) {
                    return;
                }
                tuxTextView6.setTextSize(20.0f);
            }
        }
    }
}
