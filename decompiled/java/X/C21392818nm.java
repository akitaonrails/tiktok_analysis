package X;

import Y.ACListenerS166S0100000_32;
import Y.ALAdapterS26S0100000_32;
import Y.AUListenerS261S0100000_11;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18nm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21392818nm extends FrameLayout implements InterfaceC487330J9f, InterfaceC1349170lDH {
    public final C01GW LL;
    public FrameLayout LLILLJJLI;
    public C0F96 LLILLL;
    public TuxTextView LLILZ;
    public TuxIconView LLILZIL;
    public FrameLayout LLILZLL;
    public FrameLayout LLIZ;
    public TuxIconView LLIZLLLIL;
    public TuxIconView LLJ;
    public Activity LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;

    public final void LIZ() {
        if (this.LLJ == null) {
            return;
        }
        C21392918nn.LIZ.getClass();
        C21392918nn.LIZJ = true;
        C0F96 c0f96 = this.LLILLL;
        if (c0f96 != null) {
            c0f96.clearFocus();
        }
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout != null) {
            frameLayout.setBackground(new ColorDrawable(0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(0);
        layoutParams.gravity = 8388629;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        TuxIconView tuxIconView = this.LLJ;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
        TuxIconView tuxIconView2 = this.LLIZLLLIL;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        }
        C0F96 c0f962 = this.LLILLL;
        if (c0f962 != null) {
            int visibility = c0f962.getVisibility();
            c0f962.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c0f962);
        }
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        TuxIconView tuxIconView3 = this.LLILZIL;
        if (tuxIconView3 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
        }
        FrameLayout frameLayout2 = this.LLILZLL;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        FrameLayout frameLayout3 = this.LLIZ;
        if (frameLayout3 != null) {
            C786410Ut5.LJZ(8, frameLayout3);
        }
        TuxIconView tuxIconView4 = this.LLIZLLLIL;
        if (tuxIconView4 != null) {
            C426750GoL.LJIIL(tuxIconView4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 16);
        }
    }

    public final void LJFF() {
        Editable editableU;
        C0F96 c0f96;
        TuxIconView tuxIconView;
        C0F96 c0f962 = this.LLILLL;
        if (c0f962 == null || (editableU = C2204961BRm.u(c0f962, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6pYZPLyHy7bgWZ5xp5THjV6R2Hh0NDR+i4MFrPc7hsrDtl+A7Cw3mVcE6R4DDALrM=", null))) == null || (c0f96 = this.LLILLL) == null || c0f96.getVisibility() != 0 || editableU.length() <= 0 || (tuxIconView = this.LLILZIL) == null) {
            return;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
    }

    public final FypAutoScrollService getFypAutoScrollService() {
        return (FypAutoScrollService) this.LLJILJIL.getValue();
    }

    public final HomeTabAbility getHomeTabAbility() {
        return (HomeTabAbility) this.LL.getValue();
    }

    public final View getTopTabContainer() {
        return (View) this.LLJIJIL.getValue();
    }

    private final String getDefaultSearchHint() {
        return getContext().getString(2131847157);
    }

    public final int getScreenWidthDp() {
        return C1389340mG4.LIZJ(getContext(), null).LIZIZ();
    }

    public final Activity getActivity() {
        return this.LLJI;
    }

    public final TuxIconView getClearTextBtn() {
        return this.LLILZIL;
    }

    public final FrameLayout getFramelayout() {
        return this.LLILLJJLI;
    }

    public final FrameLayout getInvisibleLayerBottom() {
        return this.LLIZ;
    }

    public final FrameLayout getInvisibleLayerLeft() {
        return this.LLILZLL;
    }

    public final TuxIconView getSearchButton() {
        return this.LLIZLLLIL;
    }

    public final TuxIconView getSearchButtonBarDisabled() {
        return this.LLJ;
    }

    public final TuxIconView getSearchButtonBarDisabled$tablet_release() {
        return this.LLJ;
    }

    public final C0F96 getSearchEditTextView() {
        return this.LLILLL;
    }

    public final TuxTextView getSearchTextView() {
        return this.LLILZ;
    }

    public C21392818nm(C19EG c19eg) {
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        C0F96 c0f96;
        TuxTextView tuxTextView;
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        super(c19eg, null, 0);
        this.LL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1321));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 460));
        this.LLJILJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(457));
        C487280J9a.LIZ(c19eg.hashCode(), this);
        this.LLJI = C1388190mED.LIZ(c19eg);
        this.LLILZLL = new FrameLayout(c19eg);
        Activity activity = this.LLJI;
        if (activity != null) {
            viewGroup = (ViewGroup) activity.findViewById(R.id.nwj);
        } else {
            viewGroup = null;
        }
        FrameLayout frameLayout2 = this.LLILZLL;
        if (frameLayout2 != null) {
            C786410Ut5.U4(frameLayout2, 0.0f);
            C786410Ut5.LJZ(8, frameLayout2);
            C786410Ut5.O7(frameLayout2, new ACListenerS166S0100000_32(this, 49));
            if (viewGroup != null) {
                viewGroup.addView(frameLayout2);
            }
        }
        LJ(C341940Daq.LIZIZ(C497820Jfg.LIZIZ(c19eg)), C341940Daq.LIZIZ(C497820Jfg.LIZ(c19eg)));
        this.LLIZ = new FrameLayout(c19eg);
        FrameLayout frameLayout3 = this.LLIZ;
        if (frameLayout3 != null) {
            C786410Ut5.U4(frameLayout3, 0.0f);
            C786410Ut5.LJZ(8, frameLayout3);
            C786410Ut5.O7(frameLayout3, new ACListenerS166S0100000_32(this, 50));
            if (viewGroup != null) {
                viewGroup.addView(frameLayout3);
            }
        }
        LIZLLL(C341940Daq.LIZIZ(C497820Jfg.LIZIZ(c19eg)), C341940Daq.LIZIZ(C497820Jfg.LIZ(c19eg)));
        View viewSd = C786410Ut5.Sd(R.layout.fj6, C786410Ut5.ne(c19eg), this);
        if (viewSd instanceof FrameLayout) {
            frameLayout = (FrameLayout) viewSd;
        } else {
            frameLayout = null;
        }
        this.LLILLJJLI = frameLayout;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(199, -2);
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        FrameLayout frameLayout4 = this.LLILLJJLI;
        if (frameLayout4 != null) {
            c0f96 = (C0F96) frameLayout4.findViewById(R.id.x0f);
        } else {
            c0f96 = null;
        }
        this.LLILLL = c0f96;
        FrameLayout frameLayout5 = this.LLILLJJLI;
        if (frameLayout5 != null) {
            tuxTextView = (TuxTextView) frameLayout5.findViewById(R.id.x0h);
        } else {
            tuxTextView = null;
        }
        this.LLILZ = tuxTextView;
        FrameLayout frameLayout6 = this.LLILLJJLI;
        if (frameLayout6 != null) {
            tuxIconView = (TuxIconView) frameLayout6.findViewById(R.id.x0e);
        } else {
            tuxIconView = null;
        }
        this.LLILZIL = tuxIconView;
        FrameLayout frameLayout7 = this.LLILLJJLI;
        if (frameLayout7 != null) {
            tuxIconView2 = (TuxIconView) frameLayout7.findViewById(R.id.x0g);
        } else {
            tuxIconView2 = null;
        }
        this.LLIZLLLIL = tuxIconView2;
        View inflatedSearchIcon = ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getInflatedSearchIcon(C1388190mED.LIZIZ(c19eg));
        TuxIconView tuxIconView3 = inflatedSearchIcon instanceof TuxIconView ? (TuxIconView) inflatedSearchIcon : null;
        this.LLJ = tuxIconView3;
        if (tuxIconView3 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
            FrameLayout frameLayout8 = this.LLILLJJLI;
            if (frameLayout8 != null) {
                frameLayout8.addView(tuxIconView3);
            }
        }
        TuxTextView tuxTextView2 = this.LLILZ;
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new ACListenerS166S0100000_32(this, 47));
        }
        int screenWidthDp = getScreenWidthDp();
        C0F96 c0f962 = this.LLILLL;
        LIZJ(screenWidthDp, c0f962 != null ? c0f962.isFocused() : false);
        C0F96 c0f963 = this.LLILLL;
        if (c0f963 != null) {
            c0f963.setHint(getDefaultSearchHint());
            c0f963.setOnFocusChangeListener(new C19LW(this, c19eg, 1));
            c0f963.addTextChangedListener(new C853720XeM() { // from class: X.10eW
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    Object obj = editable;
                    if (editable == null) {
                        obj = "";
                    }
                    this.LL.LIZIZ(obj.toString());
                }
            });
        }
        TuxIconView tuxIconView4 = this.LLILZIL;
        if (tuxIconView4 != null) {
            C786410Ut5.a9(tuxIconView4, new ACListenerS166S0100000_32(this, 48));
        }
        C21392918nn.LIZ.LJ(Integer.valueOf(getScreenWidthDp()));
        LIZ();
        setTag("floating_search_bar");
    }

    public final void LIZIZ(String str) {
        C0F96 c0f96;
        CharSequence defaultSearchHint;
        CharSequence defaultSearchHint2;
        if (Intrinsics.LJFF(str, "")) {
            TuxTextView tuxTextView = this.LLILZ;
            if (tuxTextView != null) {
                C0F96 c0f962 = this.LLILLL;
                if (c0f962 == null || (defaultSearchHint2 = c0f962.getHint()) == null) {
                    defaultSearchHint2 = getDefaultSearchHint();
                }
                tuxTextView.setText(defaultSearchHint2);
            }
            TuxIconView tuxIconView = this.LLILZIL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLILZ;
        if (tuxTextView2 != null) {
            C0F96 c0f963 = this.LLILLL;
            if ((c0f963 == null || (defaultSearchHint = C2204961BRm.u(c0f963, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6pYZPLyHy7bgWZ5xp5THjV6R2Hh0NDR+i4MFrPc7hsrDtl+A7Cw3mVcE6R4DDALrM=", null))) == null) && ((c0f96 = this.LLILLL) == null || (defaultSearchHint = c0f96.getHint()) == null)) {
                defaultSearchHint = getDefaultSearchHint();
            }
            tuxTextView2.setText(defaultSearchHint);
        }
        LJFF();
    }

    public final void setActivity(Activity activity) {
        this.LLJI = activity;
    }

    public final void setClearTextBtn(TuxIconView tuxIconView) {
        this.LLILZIL = tuxIconView;
    }

    public final void setFramelayout(FrameLayout frameLayout) {
        this.LLILLJJLI = frameLayout;
    }

    public final void setInvisibleLayerBottom(FrameLayout frameLayout) {
        this.LLIZ = frameLayout;
    }

    public final void setInvisibleLayerLeft(FrameLayout frameLayout) {
        this.LLILZLL = frameLayout;
    }

    public final void setSearchButton(TuxIconView tuxIconView) {
        this.LLIZLLLIL = tuxIconView;
    }

    public final void setSearchButtonBarDisabled(TuxIconView tuxIconView) {
        this.LLJ = tuxIconView;
    }

    public final void setSearchEditTextView(C0F96 c0f96) {
        this.LLILLL = c0f96;
    }

    public final void setSearchTextView(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setVisibilities(boolean z) {
        if (z) {
            FrameLayout frameLayout = this.LLILZLL;
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
            }
            FrameLayout frameLayout2 = this.LLIZ;
            if (frameLayout2 != null) {
                C786410Ut5.LJZ(0, frameLayout2);
            }
            LJFF();
            return;
        }
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        C0F96 c0f96 = this.LLILLL;
        if (c0f96 != null) {
            int visibility = c0f96.getVisibility();
            c0f96.setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, c0f96);
        }
        FrameLayout frameLayout3 = this.LLILZLL;
        if (frameLayout3 != null) {
            C786410Ut5.LJZ(4, frameLayout3);
        }
        FrameLayout frameLayout4 = this.LLIZ;
        if (frameLayout4 != null) {
            C786410Ut5.LJZ(4, frameLayout4);
        }
        TuxIconView tuxIconView = this.LLILZIL;
        if (tuxIconView == null) {
            return;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
    }

    public final void LIZJ(int i, boolean z) {
        C21392918nn.LIZ.getClass();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C21392918nn.LJI(i, z), -2);
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        layoutParams.gravity = 8388629;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    public final void LIZLLL(int i, int i2) {
        int height;
        int iLIZIZ;
        View viewW31;
        FrameLayout frameLayout = this.LLIZ;
        if (frameLayout != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C341940Daq.LIZ(i), C341940Daq.LIZ(i2));
            int iLJIIJJI = C12ES.LJIIJJI(getContext());
            HomeTabAbility homeTabAbility = getHomeTabAbility();
            if (homeTabAbility != null && (viewW31 = homeTabAbility.w31()) != null) {
                height = viewW31.getHeight();
            } else {
                height = 0;
            }
            if (iLJIIJJI > 0 && height > 0) {
                iLIZIZ = iLJIIJJI + height + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            }
            layoutParams.topMargin = iLIZIZ;
            C786410Ut5.a6(frameLayout, layoutParams);
        }
    }

    public final void LJ(int i, int i2) {
        FrameLayout frameLayout = this.LLILZLL;
        if (frameLayout != null) {
            int iLIZ = C341940Daq.LIZ(i);
            C21392918nn.LIZ.getClass();
            C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(iLIZ - ((C21392918nn.LJI(i, true) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25))), C341940Daq.LIZ(i2)));
        }
    }

    public final void LJI(int i, int i2) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setInterpolator(new C21388418n4());
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS261S0100000_11(this, 6));
        valueAnimatorOfInt.addListener(new ALAdapterS26S0100000_32(this, 5));
        valueAnimatorOfInt.start();
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C21392918nn.LIZ.LJ(Integer.valueOf(configuration.screenWidthDp));
        LIZ();
        HomeTabAbility homeTabAbility = getHomeTabAbility();
        View viewW31 = null;
        if (homeTabAbility != null) {
            viewW31 = homeTabAbility.w31();
        }
        boolean z = viewW31 instanceof View;
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        LJ(i, i2);
        LIZLLL(i, i2);
    }

    @Override // X.InterfaceC1349170lDH
    public final void u2(int i, boolean z) {
        C0F96 c0f96;
        if (!z && (c0f96 = this.LLILLL) != null) {
            c0f96.clearFocus();
        }
    }
}
