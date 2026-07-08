package X;

import Y.AUListenerS272S0100000_24;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabTransformer;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.SelectedTabBackToOriginAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.tabicon.ITabIconService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0rXf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@InterfaceC21561419Zs
public final class C1592450rXf extends HorizontalScrollView implements InterfaceC1770806wc, InterfaceC20343214is, InterfaceC1146704e9 {
    public static final C337800DMc LLLIZZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJ;
    public static final C12DM LLLJIL;
    public static final C1085640eME LLLJL;
    public static final int LLLL;
    public final ArrayList<C1591980rWu> LL;
    public C1591980rWu LLILLJJLI;
    public final C1592470rXh LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public final int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public final ArrayList<InterfaceC1592590rXt> LLJILJILJ;
    public ValueAnimator LLJILLL;
    public C1592500rXk LLJJ;
    public boolean LLJJI;
    public final int LLJJIII;
    public final int LLJJIJI;
    public InterfaceC1591380rVw LLJJIJIIJIL;
    public final C1085650eMF LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;
    public final boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public Function2<? super Integer, ? super Integer, Unit> LLJL;
    public Function1<? super Boolean, Unit> LLJLIL;
    public List<? extends TopTabProtocol> LLJLILLLLZIIL;
    public HomeTabAbility LLJLL;
    public int LLJLLIL;
    public SelectedTabBackToOriginAbility LLJLLL;
    public final C01GW LLJZ;
    public ITabTransformer LLJZIJLIL;
    public final int LLL;
    public Map<Integer, Integer> LLLF;
    public int LLLFF;
    public int LLLFFI;
    public final int LLLFZ;
    public final C01GW LLLI;
    public final boolean LLLII;
    public boolean LLLIIII;
    public final int[] LLLIIIIL;
    public C1591700rWS LLLIIIL;
    public C1591470rW5 LLLIIL;
    public int LLLIILIL;
    public EnumC1571190qzN LLLIL;
    public volatile HomeTabAbility LLLILZ;
    public InterfaceC665370Q7z LLLILZJ;
    public C0QSJ LLLILZLLLI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0DMc] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1592450rXf.class, "homeTabAbilityByDI", "getHomeTabAbilityByDI()Lcom/bytedance/tiktok/homepage/mainfragment/HomeTabAbility;", 0);
        C13LE.LIZ.getClass();
        LLLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLIZZ = new Object() { // from class: X.0DMc
        };
        LLLJIL = new C12DM();
        LLLJL = new C1085640eME(16);
        LLLL = C1581510rG1.LIZIZ() ? 44 : 58;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC20343214is
    public String getCustomRiskId() {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC20343214is
    public String getRiskId() {
        return "TAB_TOP/borderlayout";
    }

    public void setCustomRiskId(String str) {
    }

    public final void setOverBorderOffset(float f) {
    }

    private final int getDefaultHeight() {
        int size = this.LL.size();
        for (int i = 0; i < size; i++) {
            View view = ((C1591980rWu) ListProtector.get(this.LL, i)).LIZIZ;
            int height = view != null ? view.getHeight() : 0;
            if (height > LLLL || (((Boolean) C074Z.LIZJ.getValue()).booleanValue() && height == 0)) {
                return LLLL;
            }
        }
        return 48;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility getHomeTabAbilityByDI() {
        /*
            r4 = this;
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = r4.LLLILZ
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = r4.LLLILZ     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLLILZLLLI     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLLILZJ     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLLILZJ = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r1 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLLILZLLLI = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility> r0 = com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = (com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLLILZ = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1592450rXf.getHomeTabAbilityByDI():com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility");
    }

    private final float getScrollPosition() {
        return this.LLILLL.getIndicatorPosition();
    }

    private final SelectedTabBackToOriginAbility getSelectedTabBackToOriginAbility() {
        if (this.LLJLLL == null && (C1388190mED.LIZ(getContext()) instanceof C19EG)) {
            this.LLJLLL = (SelectedTabBackToOriginAbility) C1558520qew.LIZ(C1558360qeg.LJI((C19EG) C1388190mED.LIZ(getContext()), null), SelectedTabBackToOriginAbility.class, null);
        }
        return this.LLJLLL;
    }

    private final int getSelectedTuxFont() {
        float f = this.LLJJJ;
        if (f == 17.0f) {
            return 33;
        }
        if (f == 16.0f) {
            return 103;
        }
        return f == 15.0f ? 43 : 33;
    }

    private final int getTabMinWidth() {
        int i = this.LLIZ;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    private final int getTabScrollRange() {
        return Math.max(0, ((this.LLILLL.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private final int getUnSelectedTuxFont() {
        float f = this.LLJJJ;
        if (f == 17.0f) {
            return 32;
        }
        if (f == 16.0f) {
            return 102;
        }
        return f == 15.0f ? 42 : 32;
    }

    public final void LIZJ() {
        int iLIZIZ;
        C1591460rW4.LIZ.getClass();
        C1591800rWc c1591800rWc = C1591460rW4.LJIIIZ;
        if (c1591800rWc != null) {
            iLIZIZ = (int) (c1591800rWc.LIZIZ / 2);
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((float) this.LLJJJ) == 17.0f ? 8.0f : 5.0f)));
        }
        this.LLLFFI = iLIZIZ;
        this.LLLF = new LinkedHashMap();
        Iterator<C1591980rWu> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            LIZLLL(it2.next());
        }
    }

    public final void LJFF() {
        this.LLILLL.setPaddingRelative(0, 0, 0, 0);
        int i = this.LLJI;
        if (i == 0) {
            this.LLILLL.setGravity(8388611);
        } else if (i == 1) {
            this.LLILLL.setGravity(1);
        }
        LJJIIJ(true);
    }

    public final int LJI() {
        getLocationOnScreen(this.LLLIIIIL);
        return (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJJLL(C497820Jfg.LIZIZ(getContext()), C1388190mED.LIZIZ(getContext())) / 2) - (this.LLLIIIIL[0] + (getWidth() / 2));
    }

    public final void LJIIJ() {
        if (this.LLJILLL == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LLJILLL = valueAnimator;
            valueAnimator.setInterpolator(LLLJIL);
            this.LLJILLL.setDuration(200L);
            this.LLJILLL.addUpdateListener(new AUListenerS272S0100000_24(this, 3));
        }
    }

    @Override // android.view.View
    public final ViewPropertyAnimator animate() {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ANIMATE;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, "");
        ViewPropertyAnimator viewPropertyAnimatorAnimate = super.animate();
        C2180551AVp.LIZ(enumC2180541AVo, this, "");
        return viewPropertyAnimatorAnimate;
    }

    public final int getSelectedTabPosition() {
        C1591980rWu c1591980rWu = this.LLILLJJLI;
        if (c1591980rWu != null) {
            return c1591980rWu.LIZ;
        }
        return -1;
    }

    public final C1592630rXx getTabAnimationHelper() {
        return (C1592630rXx) this.LLJZ.getValue();
    }

    public final int getTabCount() {
        return this.LL.size();
    }

    public final int getTabLayoutScrollRange() {
        return this.LLILLL.getWidth() - getWidth();
    }

    public final int getTabStripLeftPadding() {
        return this.LLILLL.getPaddingLeft();
    }

    public final int getTabStripRightPadding() {
        return this.LLILLL.getPaddingRight();
    }

    public final List<TopTabProtocol> getTopTabProtocolList() {
        if (this.LLJLILLLLZIIL == null) {
            HomeTabAbility homeTabAbility = getHomeTabAbility();
            this.LLJLILLLLZIIL = homeTabAbility != null ? homeTabAbility.b9() : null;
        }
        return this.LLJLILLLLZIIL;
    }

    public final void LJ() {
        C1591790rWb.LIZ();
        C1592470rXh c1592470rXh = this.LLILLL;
        C1591980rWu c1591980rWu = this.LLILLJJLI;
        c1592470rXh.LJIIJ(c1591980rWu != null ? c1591980rWu.LIZLLL : null, this.LLJJJ);
    }

    public final boolean LJIILLIIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isScrollAnimRunning: ");
        ValueAnimator valueAnimator = this.LLJILLL;
        sbLIZ.append(valueAnimator != null ? Boolean.valueOf(valueAnimator.isRunning()) : null);
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
        ValueAnimator valueAnimator2 = this.LLJILLL;
        if (valueAnimator2 != null) {
            return valueAnimator2.isRunning();
        }
        return false;
    }

    public final HomeTabAbility getHomeTabAbility() {
        if (C296200BjG.LIZ()) {
            return getHomeTabAbilityByDI();
        }
        if (this.LLJLL == null && (C1388190mED.LIZ(getContext()) instanceof C19EG)) {
            this.LLJLL = (HomeTabAbility) C1558520qew.LIZ(C1558360qeg.LJI((C19EG) C1388190mED.LIZ(getContext()), null), HomeTabAbility.class, null);
        }
        return this.LLJLL;
    }

    public final int getTabScrollX() {
        return getTabScrollRange();
    }

    public final int getTabStripScrollX() {
        return getScrollX();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final Function1<Boolean, Unit> getBackToFirstIconVisibilityListener() {
        return this.LLJLIL;
    }

    public final boolean getEnableAnimation() {
        return this.LLJJJJLIIL;
    }

    public final int getGradientWidth() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final int getMCustomTabResId() {
        return this.LLJIJIL;
    }

    public final int getMMode() {
        return this.LLJI;
    }

    public final C1592500rXk getMPageChangeListener() {
        return this.LLJJ;
    }

    public final int getMTabBackgroundResId() {
        return this.LLILZIL;
    }

    public final int getMTabGravity() {
        return this.LLJ;
    }

    public final boolean getRepeatAnim() {
        return this.LLJJJJJIL;
    }

    public final Function2<Integer, Integer, Unit> getScrollChangedListener() {
        return this.LLJL;
    }

    public final int getSelectedScrollX() {
        return this.LLJLLIL;
    }

    public final boolean getSwipeMode() {
        return this.LLJJL;
    }

    public final int getTabGravity() {
        return this.LLJ;
    }

    public final int getTabMode() {
        return this.LLJI;
    }

    public final int getTabPadding() {
        return this.LLLFFI;
    }

    public final C1591470rW5 getTopTabPreloadTriggerDispatcher$homepage_common_release() {
        return this.LLLIIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public C1592450rXf(Context context) {
        super(context, null, 0);
        this.LL = new ArrayList<>();
        this.LLILZLL = Integer.MAX_VALUE;
        this.LLJILJILJ = new ArrayList<>();
        C12ES.LIZJ(12.0f, context);
        this.LLJJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        this.LLJJIJIL = new C1085650eMF(12);
        this.LLJJJ = 17;
        this.LLJJJIL = true;
        this.LLJJJJ = C444960Hcc.LIZJ(context);
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL = true;
        this.LLJLIL = new C1592550rXp(this);
        this.LLJZ = C452501pT.LIZIZ(new C1592540rXo(this));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C1581510rG1.LIZ() ? 40 : 24));
        this.LLLF = new LinkedHashMap();
        this.LLLFFI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f)));
        this.LLLFZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LLLI = C452501pT.LIZIZ(new C1591770rWZ());
        this.LLLII = true;
        this.LLLIIIIL = new int[2];
        setHorizontalScrollBarEnabled(false);
        C1592470rXh c1592470rXh = new C1592470rXh(this, context);
        this.LLILLL = c1592470rXh;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "main_tab_accessibility_label_enable", true, false)) {
            c1592470rXh.setImportantForAccessibility(1);
            c1592470rXh.setFocusable(false);
        }
        super.addView(c1592470rXh, 0, new FrameLayout.LayoutParams(-2, -1));
        if (C1581510rG1.LIZ()) {
            C426750GoL.LJIIL(c1592470rXh, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, 26);
        }
        c1592470rXh.setSelectedIndicatorHeight(0);
        c1592470rXh.setSelectedIndicatorColor(0);
        this.LLIZ = -1;
        this.LLIZLLLIL = -1;
        this.LLILZIL = 0;
        this.LLJI = 1;
        this.LLJ = 0;
        getResources();
        C12ES.LIZJ(1.5f, getContext());
        C12ES.LIZJ(1.5f, getContext());
        this.LLJJIII = getResources().getConfiguration().orientation;
        LJFF();
        if (((Boolean) C2259011DbP.LIZJ.getValue()).booleanValue()) {
            this.LLJJJJLIIL = false;
        }
        setOverScrollMode(2);
        setDescendantFocusability(393216);
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LJJIL.getValue());
        this.LLLIL = EnumC1571190qzN.DARK;
    }

    private final void setTabMinWidth(int i) {
        this.LLIZ = i;
    }

    @Override // X.InterfaceC1770806wc
    public final void LIZIZ(int i) {
        C1592470rXh c1592470rXh = this.LLILLL;
        if (c1592470rXh != null) {
            c1592470rXh.LJI(i, 0.0f);
            this.LLILLL.LJII();
        }
    }

    public final void LIZLLL(C1591980rWu c1591980rWu) {
        int tabCount;
        ImageView customImageView$homepage_common_release;
        TextView mCustomTextView$homepage_common_release;
        ImageView customImageView$homepage_common_release2;
        TextView mCustomTextView$homepage_common_release2;
        ImageView customImageView$homepage_common_release3;
        TextView mCustomTextView$homepage_common_release3;
        ImageView customImageView$homepage_common_release4;
        TextView mCustomTextView$homepage_common_release4;
        ImageView customImageView$homepage_common_release5;
        TextView mCustomTextView$homepage_common_release5;
        ImageView customImageView$homepage_common_release6;
        TextView mCustomTextView$homepage_common_release6;
        TextView mCustomTextView$homepage_common_release7;
        ImageView customImageView$homepage_common_release7;
        TextView mCustomTextView$homepage_common_release8;
        View viewFindViewById;
        ImageView customImageView$homepage_common_release8;
        TextView mCustomTextView$homepage_common_release9;
        TextView mCustomTextView$homepage_common_release10;
        ImageView customImageView$homepage_common_release9;
        TextView mCustomTextView$homepage_common_release11;
        View viewFindViewById2;
        if (C296130Bj9.LIZ()) {
            C1591790rWb.LIZ();
            View view = c1591980rWu.LIZIZ;
            if (view != null && (viewFindViewById2 = view.findViewById(R.id.jqj)) != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            }
            C1592080rX4 c1592080rX4 = c1591980rWu.LIZLLL;
            if (c1592080rX4 != null && (mCustomTextView$homepage_common_release11 = c1592080rX4.getMCustomTextView$homepage_common_release()) != null) {
                C786410Ut5.Hc(0.0f, mCustomTextView$homepage_common_release11);
            }
            C1592080rX4 c1592080rX42 = c1591980rWu.LIZLLL;
            if (c1592080rX42 != null && (customImageView$homepage_common_release9 = c1592080rX42.getCustomImageView$homepage_common_release()) != null) {
                C786410Ut5.Lc(customImageView$homepage_common_release9, 0.0f);
            }
            C1592080rX4 c1592080rX43 = c1591980rWu.LIZLLL;
            if (c1592080rX43 != null && (mCustomTextView$homepage_common_release10 = c1592080rX43.getMCustomTextView$homepage_common_release()) != null) {
                mCustomTextView$homepage_common_release10.setMinWidth(0);
            }
            C1592080rX4 c1592080rX44 = c1591980rWu.LIZLLL;
            if (c1592080rX44 != null && (mCustomTextView$homepage_common_release9 = c1592080rX44.getMCustomTextView$homepage_common_release()) != null) {
                int i = this.LLLFFI;
                mCustomTextView$homepage_common_release9.setPadding(i, 0, i, 0);
            }
            C1592080rX4 c1592080rX45 = c1591980rWu.LIZLLL;
            if (c1592080rX45 != null && (customImageView$homepage_common_release8 = c1592080rX45.getCustomImageView$homepage_common_release()) != null) {
                int i2 = this.LLLFFI;
                customImageView$homepage_common_release8.setPadding(i2, 0, i2, 0);
            }
            c1591980rWu.LIZJ(new C1592620rXw(this));
            return;
        }
        C1591790rWb.LIZ();
        View view2 = c1591980rWu.LIZIZ;
        if (view2 != null && (viewFindViewById = view2.findViewById(R.id.jqj)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        C1592080rX4 c1592080rX46 = c1591980rWu.LIZLLL;
        if (c1592080rX46 != null && (mCustomTextView$homepage_common_release8 = c1592080rX46.getMCustomTextView$homepage_common_release()) != null) {
            C786410Ut5.Hc(0.0f, mCustomTextView$homepage_common_release8);
        }
        C1592080rX4 c1592080rX47 = c1591980rWu.LIZLLL;
        if (c1592080rX47 != null && (customImageView$homepage_common_release7 = c1592080rX47.getCustomImageView$homepage_common_release()) != null) {
            C786410Ut5.Lc(customImageView$homepage_common_release7, 0.0f);
        }
        C1592080rX4 c1592080rX48 = c1591980rWu.LIZLLL;
        if (c1592080rX48 != null && (mCustomTextView$homepage_common_release7 = c1592080rX48.getMCustomTextView$homepage_common_release()) != null) {
            mCustomTextView$homepage_common_release7.setMinWidth(0);
        }
        List<TopTabProtocol> topTabProtocolList = getTopTabProtocolList();
        if (topTabProtocolList != null) {
            tabCount = topTabProtocolList.size();
        } else {
            tabCount = getTabCount();
        }
        if (!C0S4G.LIZ()) {
            C1592080rX4 c1592080rX49 = c1591980rWu.LIZLLL;
            if (c1592080rX49 != null && (mCustomTextView$homepage_common_release6 = c1592080rX49.getMCustomTextView$homepage_common_release()) != null) {
                int i3 = this.LLLFFI;
                mCustomTextView$homepage_common_release6.setPadding(i3, 0, i3, 0);
            }
            C1592080rX4 c1592080rX410 = c1591980rWu.LIZLLL;
            if (c1592080rX410 != null && (customImageView$homepage_common_release6 = c1592080rX410.getCustomImageView$homepage_common_release()) != null) {
                int i4 = this.LLLFFI;
                customImageView$homepage_common_release6.setPadding(i4, 0, i4, 0);
            }
            c1591980rWu.LIZJ(new AwS603S0100000_24(this, 94));
            return;
        }
        int i5 = c1591980rWu.LIZ;
        if (i5 == tabCount - 1) {
            C1591790rWb.LIZ();
            if (!this.LLJJJJ) {
                C1592080rX4 c1592080rX411 = c1591980rWu.LIZLLL;
                if (c1592080rX411 != null && (mCustomTextView$homepage_common_release5 = c1592080rX411.getMCustomTextView$homepage_common_release()) != null) {
                    mCustomTextView$homepage_common_release5.setPadding(this.LLLFFI, 0, 0, 0);
                }
                C1592080rX4 c1592080rX412 = c1591980rWu.LIZLLL;
                if (c1592080rX412 != null && (customImageView$homepage_common_release5 = c1592080rX412.getCustomImageView$homepage_common_release()) != null) {
                    customImageView$homepage_common_release5.setPadding(this.LLLFFI, 0, 0, 0);
                }
                c1591980rWu.LIZJ(new AwS603S0100000_24(this, 95));
            } else {
                C1592080rX4 c1592080rX413 = c1591980rWu.LIZLLL;
                if (c1592080rX413 != null && (mCustomTextView$homepage_common_release4 = c1592080rX413.getMCustomTextView$homepage_common_release()) != null) {
                    mCustomTextView$homepage_common_release4.setPadding(0, 0, this.LLLFFI, 0);
                }
                C1592080rX4 c1592080rX414 = c1591980rWu.LIZLLL;
                if (c1592080rX414 != null && (customImageView$homepage_common_release4 = c1592080rX414.getCustomImageView$homepage_common_release()) != null) {
                    customImageView$homepage_common_release4.setPadding(0, 0, this.LLLFFI, 0);
                }
                c1591980rWu.LIZJ(new AwS603S0100000_24(this, 96));
            }
            View view3 = c1591980rWu.LIZIZ;
            if (view3 == null) {
                return;
            }
            view3.setPadding(0, 0, 0, 0);
            return;
        }
        if (i5 == 0) {
            C1591790rWb.LIZ();
            if (!this.LLJJJJ) {
                C1592080rX4 c1592080rX415 = c1591980rWu.LIZLLL;
                if (c1592080rX415 != null && (mCustomTextView$homepage_common_release3 = c1592080rX415.getMCustomTextView$homepage_common_release()) != null) {
                    mCustomTextView$homepage_common_release3.setPadding(0, 0, this.LLLFFI, 0);
                }
                C1592080rX4 c1592080rX416 = c1591980rWu.LIZLLL;
                if (c1592080rX416 != null && (customImageView$homepage_common_release3 = c1592080rX416.getCustomImageView$homepage_common_release()) != null) {
                    customImageView$homepage_common_release3.setPadding(0, 0, this.LLLFFI, 0);
                }
                c1591980rWu.LIZJ(new AwS603S0100000_24(this, 97));
                return;
            }
            C1592080rX4 c1592080rX417 = c1591980rWu.LIZLLL;
            if (c1592080rX417 != null && (mCustomTextView$homepage_common_release2 = c1592080rX417.getMCustomTextView$homepage_common_release()) != null) {
                mCustomTextView$homepage_common_release2.setPadding(this.LLLFFI, 0, 0, 0);
            }
            C1592080rX4 c1592080rX418 = c1591980rWu.LIZLLL;
            if (c1592080rX418 != null && (customImageView$homepage_common_release2 = c1592080rX418.getCustomImageView$homepage_common_release()) != null) {
                customImageView$homepage_common_release2.setPadding(this.LLLFFI, 0, 0, 0);
            }
            c1591980rWu.LIZJ(new AwS603S0100000_24(this, 98));
            return;
        }
        C1592080rX4 c1592080rX419 = c1591980rWu.LIZLLL;
        if (c1592080rX419 != null && (mCustomTextView$homepage_common_release = c1592080rX419.getMCustomTextView$homepage_common_release()) != null) {
            int i6 = this.LLLFFI;
            mCustomTextView$homepage_common_release.setPadding(i6, 0, i6, 0);
        }
        C1592080rX4 c1592080rX420 = c1591980rWu.LIZLLL;
        if (c1592080rX420 != null && (customImageView$homepage_common_release = c1592080rX420.getCustomImageView$homepage_common_release()) != null) {
            int i7 = this.LLLFFI;
            customImageView$homepage_common_release.setPadding(i7, 0, i7, 0);
        }
        c1591980rWu.LIZJ(new AwS603S0100000_24(this, 99));
    }

    public final void LJIIIIZZ(int i) {
        C296130Bj9.LIZ();
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            C1592470rXh c1592470rXh = this.LLILLL;
            int childCount = c1592470rXh.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c1592470rXh.getChildAt(i2).getWidth() > 0) {
                }
            }
            scrollTo(LJII(i, 0.0f), 0);
            this.LLILLL.LJI(i, 0.0f);
            this.LLJLLIL = getScrollX();
            this.LLILLL.requestLayout();
            this.LLILLL.invalidate();
            return;
        }
        LJIJJLI(0.0f, i, true, true, false);
        this.LLILLL.LJI(i, 0.0f);
        if (((Number) C18027074f.LIZ.getValue()).intValue() == 1) {
            scrollTo(LJII(i, 0.0f), 0);
        }
    }

    public final int LJIIIZ(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public final C1591980rWu LJIIJJI(Object obj) {
        int childCount = this.LLILLL.getChildCount();
        int i = 0;
        while (true) {
            Object obj2 = null;
            if (i >= childCount) {
                return null;
            }
            C1591980rWu c1591980rWuLJIILIIL = LJIILIIL(i);
            if (c1591980rWuLJIILIIL != null) {
                obj2 = c1591980rWuLJIILIIL.LJ;
            }
            if (Intrinsics.LJFF(obj, obj2)) {
                return LJIILIIL(i);
            }
            i++;
        }
    }

    public final C1591980rWu LJIIL(String str) {
        Object obj;
        C1591980rWu next;
        Iterator<C1591980rWu> it2 = this.LL.iterator();
        do {
            obj = null;
            if (!it2.hasNext()) {
                return null;
            }
            next = it2.next();
            Object obj2 = next.LJ;
            if (obj2 instanceof String) {
                obj = obj2;
            }
        } while (!Intrinsics.LJFF(obj, str));
        return next;
    }

    public final C1591980rWu LJIILIIL(int i) {
        if (i >= 0 && i < getTabCount()) {
            return (C1591980rWu) ListProtector.get(this.LL, i);
        }
        return null;
    }

    public final View LJIILJJIL(int i) {
        if (i >= 0 && i < getTabCount()) {
            return this.LLILLL.getChildAt(i);
        }
        return null;
    }

    public final int LJIILL(String str) {
        Iterator<C1591980rWu> it2 = this.LL.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (!Intrinsics.LJFF(it2.next().LIZIZ(), str)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public final void LJIJ(C1592080rX4 c1592080rX4) {
        C592330NLb c592330NLb;
        C592360NLe c592360NLe;
        int paddingStart;
        Integer numValueOf;
        C1591980rWu tab = c1592080rX4.getTab();
        if (tab != null && (c592330NLb = tab.LJIIIZ) != null && (c592360NLe = c592330NLb.LJFF) != null) {
            float f = this.LLJJJ / 15.0f;
            int i = (int) (c592360NLe.LIZ * f);
            ImageView customImageView$homepage_common_release = c1592080rX4.getCustomImageView$homepage_common_release();
            int paddingEnd = 0;
            if (customImageView$homepage_common_release != null) {
                paddingStart = customImageView$homepage_common_release.getPaddingStart();
            } else {
                paddingStart = 0;
            }
            int i2 = i + paddingStart;
            ImageView customImageView$homepage_common_release2 = c1592080rX4.getCustomImageView$homepage_common_release();
            if (customImageView$homepage_common_release2 != null) {
                paddingEnd = customImageView$homepage_common_release2.getPaddingEnd();
            }
            int i3 = i2 + paddingEnd;
            int i4 = (int) (c592360NLe.LIZIZ * f);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("showCustomIcon, ratio: ");
            sbLIZ.append(f);
            sbLIZ.append(", width: ");
            sbLIZ.append(i3);
            sbLIZ.append(", height: ");
            sbLIZ.append(i4);
            sbLIZ.append(", padding: ");
            ImageView customImageView$homepage_common_release3 = c1592080rX4.getCustomImageView$homepage_common_release();
            if (customImageView$homepage_common_release3 != null) {
                numValueOf = Integer.valueOf(customImageView$homepage_common_release3.getPaddingStart());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            ImageView customImageView$homepage_common_release4 = c1592080rX4.getCustomImageView$homepage_common_release();
            if (customImageView$homepage_common_release4 != null) {
                C1383370m6R.LJIILJJIL(i3, i4, customImageView$homepage_common_release4);
            }
        }
    }

    public final void LJIJI(String str) {
        C1591980rWu c1591980rWuLJIIJJI = LJIIJJI(str);
        if (c1591980rWuLJIIJJI != null) {
            c1591980rWuLJIIJJI.LJII = null;
            c1591980rWuLJIIJJI.LJIIIIZZ = null;
            c1591980rWuLJIIJJI.LJIIIZ = null;
            c1591980rWuLJIIJJI.LIZJ(AFwS264S0000000_24.get$arr$(169));
        }
    }

    public final void LJJII(Function1<? super C1592080rX4, Unit> function1) {
        int size = this.LL.size();
        for (int i = 0; i < size; i++) {
            ((C1591980rWu) ListProtector.get(this.LL, i)).LIZJ(function1);
        }
    }

    public final void LJJIII(LinearLayout.LayoutParams layoutParams) {
        if (this.LLJI == 1 && this.LLJ == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        int i = this.LLILZ;
        if (i != 0) {
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = i;
        }
    }

    public final void LJJIIJ(boolean z) {
        int childCount = this.LLILLL.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.LLILLL.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LJJIII((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        int iComputeHorizontalScrollOffset = computeHorizontalScrollOffset();
        int iComputeHorizontalScrollRange = computeHorizontalScrollRange() - computeHorizontalScrollExtent();
        if (iComputeHorizontalScrollRange == 0) {
            return false;
        }
        if (i < 0) {
            if (iComputeHorizontalScrollOffset <= 0) {
                return false;
            }
        } else if (iComputeHorizontalScrollOffset >= iComputeHorizontalScrollRange - 1) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLJJI && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ALPHA;
        if (C2180571AVr.LIZIZ(enumC2180541AVo, Float.valueOf(f))) {
            super.setAlpha(f);
            return;
        }
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Float.valueOf(f));
        super.setAlpha(f);
        C2180551AVp.LIZ(enumC2180541AVo, this, Float.valueOf(f));
    }

    public final void setAutoFillWhenScrollable(boolean z) {
        this.LLJILJIL = z;
    }

    public final void setBackToFirstIconVisibilityListener(Function1<? super Boolean, Unit> function1) {
        this.LLJLIL = function1;
    }

    public final void setCollectionInfoForTabs(final int i) {
        q0.LJIJ(this.LLILLL, new C20094213jo() { // from class: X.0rXr
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                int i2 = i;
                if (i2 > 0) {
                    accessibilityNodeInfoCompat.setCollectionInfo(C20093113jd.LIZ(1, i2));
                }
            }
        });
    }

    public final void setCustomTabViewResId(int i) {
        this.LLJIJIL = i;
    }

    public final void setEnableAnimation(boolean z) {
        this.LLJJJJLIIL = z;
    }

    public final void setGradientWidth(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
    }

    public final void setMCustomTabResId(int i) {
        this.LLJIJIL = i;
    }

    public final void setMMode(int i) {
        this.LLJI = i;
    }

    public final void setMPageChangeListener(C1592500rXk c1592500rXk) {
        this.LLJJ = c1592500rXk;
    }

    public final void setMTabBackgroundResId(int i) {
        this.LLILZIL = i;
    }

    public final void setMTabGravity(int i) {
        this.LLJ = i;
    }

    public final void setOnTabClickListener(InterfaceC1591380rVw interfaceC1591380rVw) {
        this.LLJJIJIIJIL = interfaceC1591380rVw;
    }

    public final void setOverBorderTransparentWidth(float f) {
        this.LLILLL.setOverBorderWidth(f);
    }

    public final void setRelayoutHelper(C1591700rWS c1591700rWS) {
        this.LLLIIIL = c1591700rWS;
    }

    public final void setRepeatAnim(boolean z) {
        this.LLJJJJJIL = z;
    }

    public final void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        LJIIJ();
        this.LLJILLL.addListener(animatorListener);
    }

    public final void setScrollChangedListener(Function2<? super Integer, ? super Integer, Unit> function2) {
        this.LLJL = function2;
    }

    public final void setSelectedIndicatorCorner(float f) {
        this.LLILLL.setIndicatorLineCorner(f);
    }

    public final void setSelectedScrollX(int i) {
        this.LLJLLIL = i;
    }

    public final void setSelectedTabHorizontalPadding(int i) {
        this.LLILLL.setSelectedTabHorizontalPadding(i);
    }

    public final void setSelectedTabIndicatorColor(int i) {
        this.LLILLL.setSelectedIndicatorColor(i);
    }

    public final void setSelectedTabIndicatorHeight(int i) {
        this.LLILLL.setSelectedIndicatorHeight(i);
    }

    public final void setSwipeMode(boolean z) {
        this.LLJJL = z;
    }

    public final void setTabGravity(int i) {
        if (this.LLJ != i) {
            this.LLJ = i;
            LJFF();
        }
    }

    public final void setTabMargin(int i) {
        this.LLILZ = LJIIIZ(i);
        int tabCount = getTabCount();
        for (int i2 = 0; i2 < tabCount; i2++) {
            View childAt = this.LLILLL.getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = LJIIIZ(i);
            marginLayoutParams.rightMargin = LJIIIZ(i);
            C786410Ut5.W5(childAt, marginLayoutParams);
        }
    }

    public final void setTabMode(String str) {
        if (Intrinsics.LJFF(str, "fixed")) {
            if (this.LLJI != 1) {
                this.LLJI = 1;
                LJFF();
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "scrollable") || this.LLJI == 0) {
            return;
        }
        this.LLJI = 0;
        LJFF();
    }

    public final void setTabPadding(int i) {
        this.LLLFFI = i;
    }

    public final void setTabStripMargin(float f) {
        this.LLILLL.setTabStripMargin(f);
    }

    public final void setTabTransformer(ITabTransformer iTabTransformer) {
        this.LLJZIJLIL = iTabTransformer;
    }

    public final void setTextSize(int i) {
        this.LLJJJ = i;
    }

    public final void setTopTabPreloadTriggerDispatcher$homepage_common_release(C1591470rW5 c1591470rW5) {
        this.LLLIIL = c1591470rW5;
    }

    public final void setTouchable(boolean z) {
        this.LLJJI = z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_VISIBLITY;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Integer.valueOf(i));
        super.setVisibility(i);
        C2180551AVp.LIZ(enumC2180541AVo, this, Integer.valueOf(i));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final void setTabMode(int i) {
        if (i != this.LLJI) {
            this.LLJI = i;
            LJFF();
        }
    }

    @Override // X.InterfaceC1770806wc
    public final void LIZ(int i, Integer num) {
        int iIntValue;
        if (C296130Bj9.LIZ()) {
            if (num != null) {
                if (num.intValue() == 0) {
                    LJIIIIZZ(i);
                    return;
                }
                iIntValue = num.intValue();
            }
            iIntValue = 200;
        } else if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 200;
        }
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            C1592470rXh c1592470rXh = this.LLILLL;
            int childCount = c1592470rXh.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c1592470rXh.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iLJII = LJII(i, 0.0f);
            if (scrollX != iLJII) {
                LJIIJ();
                this.LLJILLL.setIntValues(scrollX, iLJII);
                this.LLJILLL.start();
            }
            this.LLILLL.LIZIZ(i, iIntValue);
            return;
        }
        LJIJJLI(0.0f, i, true, true, false);
        this.LLILLL.LJI(i, 0.0f);
    }

    public final int LJII(int i, float f) {
        View childAt;
        View childAt2;
        int left;
        int width;
        int width2 = 0;
        if (this.LLJI != 0 || (childAt = this.LLILLL.getChildAt(i)) == null) {
            return 0;
        }
        int i2 = i + 1;
        if (i2 < this.LLILLL.getChildCount()) {
            childAt2 = this.LLILLL.getChildAt(i2);
        } else {
            childAt2 = null;
        }
        int width3 = childAt.getWidth();
        if (childAt2 != null) {
            width2 = childAt2.getWidth();
        }
        if (C1581510rG1.LIZJ()) {
            left = childAt.getLeft() + (width3 / 2);
            width = (getWidth() / 2) + LJI();
        } else {
            left = childAt.getLeft() + (width3 / 2);
            width = getWidth() / 2;
        }
        int i3 = left - width;
        int i4 = (int) ((width3 + width2 + (this.LLILZ * 4)) * 0.5f * f);
        if (getLayoutDirection() == 0) {
            return i3 + i4;
        }
        return i3 - i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1591980rWu LJIIZILJ(View view, InterfaceC1583870rJp interfaceC1583870rJp) {
        C1592080rX4 c1592080rX4;
        C1591980rWu c1591980rWu = (C1591980rWu) LLLJL.LIZIZ();
        if (c1591980rWu == null) {
            c1591980rWu = new C1591980rWu();
        }
        c1591980rWu.LIZJ = this;
        c1591980rWu.LJ = interfaceC1583870rJp.tag();
        c1591980rWu.LJFF = interfaceC1583870rJp;
        c1591980rWu.LJI = new C1591990rWv(interfaceC1583870rJp.LJIIJJI(), interfaceC1583870rJp.LJIILIIL());
        C1085650eMF c1085650eMF = this.LLJJIJIL;
        if (c1085650eMF == null || (c1592080rX4 = (C1592080rX4) c1085650eMF.LIZIZ()) == null) {
            c1592080rX4 = new C1592080rX4(this, getContext());
        }
        c1592080rX4.setFocusable(true);
        c1592080rX4.setMinimumWidth(getTabMinWidth());
        c1591980rWu.LIZLLL = c1592080rX4;
        if (!Intrinsics.LJFF(c1591980rWu, c1592080rX4.LL)) {
            c1592080rX4.LL = c1591980rWu;
        }
        c1591980rWu.LIZIZ = view;
        C1592080rX4 c1592080rX42 = c1591980rWu.LIZLLL;
        if (c1592080rX42 != null) {
            c1592080rX42.LIZ();
        }
        return c1591980rWu;
    }

    public final void LJIJJ(C1591980rWu c1591980rWu, boolean z) {
        int i;
        int size;
        int size2;
        C1592450rXf c1592450rXf = this;
        C1591980rWu c1591980rWu2 = c1592450rXf.LLILLJJLI;
        if (Intrinsics.LJFF(c1591980rWu2, c1591980rWu)) {
            if (c1591980rWu2 != null) {
                int size3 = c1592450rXf.LLJILJILJ.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        int i2 = size3 - 1;
                        ((InterfaceC1592590rXt) ListProtector.get(c1592450rXf.LLJILJILJ, size3)).LIZ();
                        if (i2 < 0) {
                            break;
                        } else {
                            size3 = i2;
                        }
                    }
                }
                c1592450rXf.LJIIIIZZ(c1591980rWu.LIZ);
                return;
            }
            return;
        }
        if (c1591980rWu != null) {
            i = c1591980rWu.LIZ;
        } else {
            i = -1;
        }
        if (z) {
            if ((c1591980rWu2 == null || c1591980rWu2.LIZ == -1) && i != -1) {
                c1592450rXf.LJIJJLI(0.0f, i, true, true, false);
            } else {
                c1592450rXf.LIZ(i, null);
            }
            if (i != -1) {
                c1592450rXf = c1592450rXf;
                int i3 = i;
                c1592450rXf.LJIL(0.0f, i3, i3, false, true);
            }
        }
        if (c1591980rWu2 != null && c1592450rXf.LLJILJILJ.size() - 1 >= 0) {
            while (true) {
                int i4 = size2 - 1;
                ((InterfaceC1592590rXt) ListProtector.get(c1592450rXf.LLJILJILJ, size2)).LIZJ(c1591980rWu2);
                if (i4 < 0) {
                    break;
                } else {
                    size2 = i4;
                }
            }
        }
        c1592450rXf.LLILLJJLI = c1591980rWu;
        if (c1591980rWu == null || c1592450rXf.LLJILJILJ.size() - 1 < 0) {
            return;
        }
        while (true) {
            int i5 = size - 1;
            ((InterfaceC1592590rXt) ListProtector.get(c1592450rXf.LLJILJILJ, size)).LIZIZ(c1591980rWu);
            if (i5 >= 0) {
                size = i5;
            } else {
                return;
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iLJIIIZ = LJIIIZ(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(iLJIIIZ, 1073741824);
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(iLJIIIZ, View.MeasureSpec.getSize(i2)), 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iLJIIIZ2 = this.LLIZLLLIL;
            if (iLJIIIZ2 <= 0) {
                iLJIIIZ2 = size - LJIIIZ(56);
            }
            this.LLILZLL = iLJIIIZ2;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.LLJI;
            if (i3 != 0) {
                if (i3 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    public final void LJJ(float f, float f2, int i) {
        C1592470rXh c1592470rXh = this.LLILLL;
        c1592470rXh.getClass();
        if (f > 0.0f && f2 > 0.0f) {
            Paint paint = new Paint(1);
            paint.setColor(i);
            c1592470rXh.LLJJIJIL = new C443120HZe<>(Float.valueOf(f), Float.valueOf(f2), paint);
            return;
        }
        c1592470rXh.LLJJIJIL = null;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Function2<? super Integer, ? super Integer, Unit> function2 = this.LLJL;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(i), Integer.valueOf(i3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(float r12, int r13, boolean r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            r7 = r13
            float r0 = (float) r7
            r6 = r12
            float r0 = r0 + r6
            int r8 = java.lang.Math.round(r0)
            if (r8 < 0) goto L36
            r5 = r11
            X.0rXh r0 = r5.LLILLL
            int r0 = r0.getChildCount()
            if (r8 >= r0) goto L36
            r3 = 0
            r9 = r16
            if (r15 == 0) goto L99
            if (r9 == 0) goto L99
            X.0rXh r0 = r5.LLILLL
            r0.LJI(r7, r6)
        L1f:
            r2 = 1
            r1 = 0
            if (r9 != 0) goto L39
            X.C1591790rWb.LIZ()
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L39
        L2a:
            if (r14 == 0) goto L36
            X.0rXx r0 = r5.getTabAnimationHelper()
            if (r0 != 0) goto L37
            r10 = 1
        L33:
            r5.LJIL(r6, r7, r8, r9, r10)
        L36:
            return
        L37:
            r10 = 0
            goto L33
        L39:
            android.animation.ValueAnimator r0 = r5.LLJILLL
            if (r0 == 0) goto L4a
            boolean r0 = r0.isRunning()
            if (r0 != r2) goto L4a
            android.animation.ValueAnimator r0 = r5.LLJILLL
            if (r0 == 0) goto L4a
            r0.cancel()
        L4a:
            int r4 = r5.LJII(r7, r6)
            r5.scrollTo(r4, r1)
            boolean r0 = X.C1581510rG1.LIZJ()
            if (r0 == 0) goto L88
            kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r3 = r5.LLJL
            if (r3 == 0) goto L2a
            int r2 = r5.getWidth()
            int r0 = r5.getPaddingRight()
            int r2 = r2 - r0
            int r0 = r5.getPaddingLeft()
            int r2 = r2 - r0
            X.0rXh r0 = r5.LLILLL
            int r1 = r0.getWidth()
            if (r2 >= r1) goto L86
            if (r4 < 0) goto L86
            int r0 = r2 + r4
            if (r0 <= r1) goto L79
            int r4 = r1 - r2
        L79:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            int r0 = (int) r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.invoke(r1, r0)
            goto L2a
        L86:
            r4 = 0
            goto L79
        L88:
            kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r2 = r5.LLJL
            if (r2 == 0) goto L2a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            int r0 = (int) r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.invoke(r1, r0)
            goto L2a
        L99:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L1f
            X.0rXh r0 = r5.LLILLL
            r0.LJI(r7, r6)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1592450rXf.LJIJJLI(float, int, boolean, boolean, boolean):void");
    }

    public final void LJIL(float f, int i, int i2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        float f2;
        EnumC1571190qzN enumC1571190qzN;
        C1592080rX4 c1592080rX4;
        C1591980rWu tab;
        C1591990rWv c1591990rWv;
        boolean z5;
        if (this.LLJZIJLIL != null) {
            int childCount = this.LLILLL.getChildCount();
            if (i2 < childCount) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = this.LLILLL.getChildAt(i3);
                    if (i3 == i2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    childAt.setSelected(z5);
                    ITabTransformer iTabTransformer = this.LLJZIJLIL;
                    if (iTabTransformer != null) {
                        boolean z6 = childAt instanceof C1592080rX4;
                        iTabTransformer.iP0();
                    }
                }
                return;
            }
            return;
        }
        int childCount2 = this.LLILLL.getChildCount();
        if (i2 != this.LLLIILIL) {
            z3 = true;
            this.LLLIILIL = i2;
            View childAt2 = this.LLILLL.getChildAt(i2);
            if (!(childAt2 instanceof C1592080rX4) || (c1592080rX4 = (C1592080rX4) childAt2) == null || (tab = c1592080rX4.getTab()) == null || (c1591990rWv = tab.LJI) == null || (enumC1571190qzN = c1591990rWv.LIZ) == null) {
                enumC1571190qzN = EnumC1571190qzN.DARK;
            }
            this.LLLIL = enumC1571190qzN;
        } else {
            z3 = false;
        }
        if (i2 < childCount2) {
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt3 = this.LLILLL.getChildAt(i4);
                if (i4 == i2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                childAt3.setSelected(z4);
                if (z2 && (childAt3 instanceof C1592080rX4)) {
                    C1592080rX4 c1592080rX42 = (C1592080rX4) childAt3;
                    TextView mCustomTextView$homepage_common_release = c1592080rX42.getMCustomTextView$homepage_common_release();
                    ImageView customImageView$homepage_common_release = c1592080rX42.getCustomImageView$homepage_common_release();
                    if (c1592080rX42.isSelected()) {
                        if (mCustomTextView$homepage_common_release != null) {
                            C786410Ut5.S4(1.0f, mCustomTextView$homepage_common_release);
                        }
                        if (customImageView$homepage_common_release != null) {
                            C786410Ut5.V4(customImageView$homepage_common_release, 1.0f);
                        }
                        TuxIconView tuxIconView = (TuxIconView) c1592080rX42.findViewById(R.id.jqj);
                        if (tuxIconView != null) {
                            C786410Ut5.x5(tuxIconView, 1.0f);
                        }
                    } else if (C1591480rW6.LJFF()) {
                        if (z3) {
                            if (this.LLLIL == EnumC1571190qzN.LIGHT) {
                                f2 = C1592730rY7.LJFF;
                            } else {
                                f2 = C1592730rY7.LJ;
                            }
                            if (mCustomTextView$homepage_common_release != null) {
                                C786410Ut5.S4(f2, mCustomTextView$homepage_common_release);
                            }
                            C1591980rWu c1591980rWuLJIILIIL = LJIILIIL(i4);
                            if (c1591980rWuLJIILIIL != null && c1591980rWuLJIILIIL.LIZ() && customImageView$homepage_common_release != null) {
                                C786410Ut5.V4(customImageView$homepage_common_release, f2);
                            }
                            TuxIconView tuxIconView2 = (TuxIconView) c1592080rX42.findViewById(R.id.jqj);
                            if (tuxIconView2 != null) {
                                C786410Ut5.x5(tuxIconView2, f2);
                            }
                        }
                    } else {
                        if (mCustomTextView$homepage_common_release != null) {
                            C786410Ut5.S4(this.LLILLL.getMinAlpha(), mCustomTextView$homepage_common_release);
                        }
                        C1591980rWu c1591980rWuLJIILIIL2 = LJIILIIL(i4);
                        if (c1591980rWuLJIILIIL2 != null && c1591980rWuLJIILIIL2.LIZ() && customImageView$homepage_common_release != null) {
                            C786410Ut5.V4(customImageView$homepage_common_release, this.LLILLL.getMinAlpha());
                        }
                        TuxIconView tuxIconView3 = (TuxIconView) c1592080rX42.findViewById(R.id.jqj);
                        if (tuxIconView3 != null) {
                            C786410Ut5.x5(tuxIconView3, this.LLILLL.getMinAlpha());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003e A[PHI: r11
      0x003e: PHI (r11v2 java.lang.Boolean) = (r11v1 java.lang.Boolean), (r11v3 java.lang.Boolean) binds: [B:14:0x0023, B:23:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Type inference failed for: r2v0, types: [REQUEST, X.0kbR] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJI(final X.C1592450rXf r7, final X.C1592080rX4 r8, X.C592330NLb r9, boolean r10, java.lang.Boolean r11, boolean r12, int r13) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1592450rXf.LJJI(X.0rXf, X.0rX4, X.0NLb, boolean, java.lang.Boolean, boolean, int):boolean");
    }

    public final void LJJIFFI(C1592080rX4 c1592080rX4, C592330NLb c592330NLb, boolean z, Pair<Integer, Integer> pair, String str, String str2, C0NLT c0nlt) {
        String str3;
        String str4;
        boolean z2 = z;
        String str5 = str;
        if (c592330NLb == null) {
            return;
        }
        Object obj = null;
        if (!z2) {
            C1591980rWu tab = c1592080rX4.getTab();
            if (tab != null) {
                obj = tab.LJ;
            }
            if ((obj instanceof String) && (str4 = (String) obj) != null) {
                LJIJI(str4);
            }
        } else {
            ITabIconService iTabIconService = (ITabIconService) PluggableExtentionKt.pluggableSpi$default(ITabIconService.class, false, false, false, 14, null);
            if (iTabIconService != null && iTabIconService.LJ(c592330NLb.LJFF, pair)) {
                ImageView customImageView$homepage_common_release = c1592080rX4.getCustomImageView$homepage_common_release();
                if (customImageView$homepage_common_release != null) {
                    C786410Ut5.LJZI(0, customImageView$homepage_common_release);
                }
                TextView mCustomTextView$homepage_common_release = c1592080rX4.getMCustomTextView$homepage_common_release();
                if (mCustomTextView$homepage_common_release != null) {
                    C786410Ut5.LLIL(mCustomTextView$homepage_common_release, 4);
                }
            } else {
                C1591980rWu tab2 = c1592080rX4.getTab();
                if (tab2 != null) {
                    obj = tab2.LJ;
                }
                if ((obj instanceof String) && (str3 = (String) obj) != null) {
                    LJIJI(str3);
                }
                str5 = "icon_size_invalid";
                z2 = false;
            }
        }
        ITabIconService iTabIconService2 = (ITabIconService) PluggableExtentionKt.pluggableSpi$default(ITabIconService.class, false, false, false, 14, null);
        if (iTabIconService2 != null) {
            iTabIconService2.LIZIZ(c592330NLb, c0nlt, str2, z2, str5);
        }
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        C1592470rXh c1592470rXh = this.LLILLL;
        if (c1592470rXh.LLJJJJ.LLJJI && i3 > 0 && c1592470rXh.LLILZ > 0.0f) {
            c1592470rXh.postInvalidateOnAnimation();
        }
        return super.overScrollBy(i, i2, i3, i4, i5, i6, 10, i8, z);
    }
}
