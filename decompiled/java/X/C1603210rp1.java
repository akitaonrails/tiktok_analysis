package X;

import Y.AAListenerS334S0100000_24;
import Y.ACListenerS158S0100000_24;
import Y.AUListenerS72S0101000_24;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0rp1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1603210rp1 extends FrameLayout {
    public static final String[] LLJLILLLLZIIL = {"personal_homepage", "others_homepage", "challenge", "single_song", "prop_page", "duet_page", "mv_page", "poi_detail", "tts_page", "places_discover", "fan_spotlight_pick_page", "shared_feed", "shared_feed_like_history", "ls_creator_center_page", "creator_ai_assistant", "spotlight_video_play"};
    public final List<String> LL;
    public int LLILLJJLI;
    public C1235870iGX LLILLL;
    public AbstractC1616230sA1 LLILZ;
    public InterfaceC1581880rGc LLILZIL;
    public IRefreshAbility LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public float LLJI;
    public float LLJIJIL;
    public InterfaceC1603280rp8 LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public ValueAnimator LLJJI;
    public InterfaceC1603260rp6 LLJJIII;
    public boolean LLJJIJI;
    public long LLJJIJIIJIL;
    public String LLJJIJIL;
    public boolean LLJJJ;
    public Drawable LLJJJIL;
    public View LLJJJJ;
    public final List<InterfaceC1603270rp7> LLJJJJJIL;
    public InterfaceC1568180quW LLJJJJLIIL;
    public String LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final ArrayList<C0RAS> LLJLIL;

    public C1603210rp1() {
        throw null;
    }

    public final void LIZ() {
        this.LLJJI = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int viewPagerMarginTop = getViewPagerMarginTop();
        this.LLJJI.setDuration(200);
        this.LLJJI.setInterpolator(new DecelerateInterpolator());
        this.LLJJI.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0rp2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iPow;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int viewPagerMarginTop2 = this.LLILLJJLI.getViewPagerMarginTop();
                C1603210rp1 c1603210rp1 = this.LLILLJJLI;
                if (animatedFraction == 1.0f) {
                    iPow = -viewPagerMarginTop2;
                } else {
                    iPow = (int) (((1.0d - Math.pow(animatedFraction, 3.0d)) * ((double) viewPagerMarginTop)) - ((double) this.LLILLJJLI.getViewPagerMarginTop()));
                }
                c1603210rp1.setViewPagerMarginTopByDelta(iPow);
            }
        });
        this.LLJJI.addListener(new Animator.AnimatorListener() { // from class: X.0rp5
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                InterfaceC1603260rp6 interfaceC1603260rp6;
                this.LL.setBackground(null);
                C1603210rp1 c1603210rp1 = this.LL;
                if (c1603210rp1.LLJJIJI && (interfaceC1603260rp6 = c1603210rp1.LLJJIII) != null) {
                    interfaceC1603260rp6.LIZIZ();
                }
                this.LL.LLJJIJI = false;
            }
        });
        this.LLJJI.start();
        LIZLLL();
    }

    public final void LIZIZ() {
        this.LLJJI = ValueAnimator.ofFloat(0.0f, 1.0f);
        int viewPagerMarginTop = getViewPagerMarginTop();
        int i = ((this.LLJJ + viewPagerMarginTop) * (-200)) / this.LLJILLL;
        if (i < 0) {
            i = 200;
        }
        this.LLJJI.setDuration(i);
        this.LLJJI.addUpdateListener(new AUListenerS72S0101000_24(this, viewPagerMarginTop, 0));
        this.LLJJI.addListener(new AAListenerS334S0100000_24(this, 3));
        this.LLJJI.start();
    }

    public final void LIZLLL() {
        C1235870iGX c1235870iGXLIZJ = LIZJ(false);
        if (c1235870iGXLIZJ != null) {
            C786410Ut5.LJLLLLLL(8, c1235870iGXLIZJ);
        }
        for (InterfaceC1603270rp7 interfaceC1603270rp7 : (ArrayList) this.LLJJJJJIL) {
            if (interfaceC1603270rp7 != null) {
                interfaceC1603270rp7.onHide();
            }
        }
    }

    public final boolean LJ() {
        C1235870iGX c1235870iGXLIZJ = LIZJ(false);
        return c1235870iGXLIZJ != null && c1235870iGXLIZJ.LLILLJJLI == 0 && getViewPagerMarginTop() < 0;
    }

    public final void LJIIIIZZ() {
        this.LLJILJILJ = 0;
        if (this.LLJJIJIIJIL == -1) {
            this.LLJJIJIIJIL = System.currentTimeMillis();
        }
    }

    public final void LJIIJ() {
        C1235870iGX c1235870iGXLIZJ = LIZJ(false);
        if (c1235870iGXLIZJ != null) {
            c1235870iGXLIZJ.LJI();
        }
        this.LLJILJILJ = -1;
        if (this.LLILZ != null) {
            LIZ();
        }
        if (this.LLJJIJIIJIL == -1 || TextUtils.isEmpty(this.LLJJIJIL)) {
            return;
        }
        C794240VDq.LJFF("aweme_feed_load_more_duration", this.LLJJIJIL, System.currentTimeMillis() - this.LLJJIJIIJIL);
        this.LLJJIJIIJIL = -1L;
    }

    public final void LJIIJJI() {
        C1235870iGX c1235870iGXLIZJ = LIZJ(true);
        if (c1235870iGXLIZJ != null) {
            C786410Ut5.LJLLLLLL(0, c1235870iGXLIZJ);
        }
        if (!this.LLJL && !C994010byR.LIZ.LIZ()) {
            setBackgroundColor(C960203pA.LIZ(R.attr.e1, getContext()));
        }
        for (InterfaceC1603270rp7 interfaceC1603270rp7 : (ArrayList) this.LLJJJJJIL) {
            if (interfaceC1603270rp7 != null) {
                interfaceC1603270rp7.onShow();
            }
        }
    }

    public final void LJIIL() {
        C1235870iGX c1235870iGXLIZJ = LIZJ(true);
        if (c1235870iGXLIZJ != null) {
            c1235870iGXLIZJ.LJII();
        }
        this.LLJILJILJ = 1;
        if (this.LLILZ != null) {
            LIZ();
        }
        if (this.LLJJIJIIJIL == -1 || TextUtils.isEmpty(this.LLJJIJIL)) {
            return;
        }
        C794240VDq.LJFF("aweme_feed_load_more_duration", this.LLJJIJIL, System.currentTimeMillis() - this.LLJJIJIIJIL);
        this.LLJJIJIIJIL = -1L;
    }

    public final void LJIILIIL() {
        C1235870iGX c1235870iGXLIZJ = LIZJ(true);
        if (c1235870iGXLIZJ != null) {
            C786410Ut5.LLLLIILL(c1235870iGXLIZJ, 0);
            c1235870iGXLIZJ.setStatus(2);
        }
        this.LLJILJILJ = 2;
        LJIIJ();
    }

    public final boolean LJFF() {
        IRefreshAbility iRefreshAbility = this.LLILZLL;
        if (iRefreshAbility != null) {
            return iRefreshAbility.LJJIIJZLJL();
        }
        InterfaceC1581880rGc interfaceC1581880rGc = this.LLILZIL;
        return interfaceC1581880rGc != null && interfaceC1581880rGc.LJJIIJZLJL();
    }

    public final void LJII() {
        if (this.LLILZ.getCurrentItem() != this.LLILZ.getAdapter().getCount() - 1 || this.LLJJJJ == null) {
            return;
        }
        C1440005kM.LIZ(new IEvent() { // from class: X.0R1G
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    public final void LJIILJJIL() {
        if (this.LLJ) {
            InterfaceC1568180quW interfaceC1568180quW = this.LLJJJJLIIL;
            if (interfaceC1568180quW != null) {
                interfaceC1568180quW.LIZ();
            }
            this.LLJ = false;
        }
        if (getViewPagerMarginTop() != 0) {
            LIZ();
        }
    }

    public int getViewPagerMarginTop() {
        AbstractC1616230sA1 abstractC1616230sA1 = this.LLILZ;
        if (abstractC1616230sA1 == null) {
            return 0;
        }
        return ((ViewGroup.MarginLayoutParams) abstractC1616230sA1.getLayoutParams()).topMargin;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        try {
            super.onFinishInflate();
            this.LLJJJ = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final C1235870iGX LIZJ(boolean z) {
        if (this.LLILLL == null && z && this.LLJJJ) {
            try {
                this.LLILLL = new C1235870iGX(getContext(), null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C341940Daq.LIZ(60.0d));
                layoutParams.gravity = 80;
                layoutParams.setMargins(0, 0, 0, C341940Daq.LIZ(49.0d));
                addView(this.LLILLL, 0, layoutParams);
                if (this.LLJJJJ == null) {
                    TextView textView = (TextView) C786410Ut5.Sd(R.layout.i9w, C786410Ut5.ne(getContext()), null);
                    textView.setGravity(17);
                    textView.setTextColor(C960203pA.LIZ(R.attr.eh, getContext()));
                    this.LLJJJJ = textView;
                }
                C1209530ha3 c1209530ha3LIZ = C1209530ha3.LIZ(getContext());
                ACListenerS158S0100000_24 aCListenerS158S0100000_24 = new ACListenerS158S0100000_24(this, 19);
                c1209530ha3LIZ.LIZJ(2131836754);
                C786410Ut5.I7(aCListenerS158S0100000_24, c1209530ha3LIZ.LIZLLL);
                if (!LJI(this.LLJJL)) {
                    c1209530ha3LIZ.LIZIZ(this.LLJJJJ);
                }
                this.LLILLL.setBuilder(c1209530ha3LIZ);
                Drawable drawable = this.LLJJJIL;
                if (drawable != null) {
                    this.LLILLL.setBackgroundDrawable(drawable);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILLL = null;
                this.LLJJJIL = null;
            }
        }
        C1235870iGX c1235870iGX = this.LLILLL;
        if (c1235870iGX != null && c1235870iGX.LIZLLL()) {
            this.LLJILJILJ = -1;
        }
        return this.LLILLL;
    }

    public final boolean LJI(String str) {
        IPoiService iPoiService;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals("poi_detail") && (iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi(IPoiService.class)) != null && iPoiService.LJIJJLI()) {
            return false;
        }
        Iterator it2 = ((ArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            if (str.equals(it2.next())) {
                return true;
            }
        }
        for (String str2 : LLJLILLLLZIIL) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final void LJIIIZ(InterfaceC1603270rp7 interfaceC1603270rp7) {
        List<InterfaceC1603270rp7> list = this.LLJJJJJIL;
        if (list != null && !((ArrayList) list).isEmpty()) {
            try {
                ((ArrayList) this.LLJJJJJIL).remove(interfaceC1603270rp7);
            } catch (ClassCastException e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream = System.out;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("catch ClassCastException: ");
                sbLIZ.append(e.getMessage());
                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            } catch (NullPointerException e2) {
                TryCatchGuardChecker.doCheck(e2);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("catch NullPointerException: ");
                sbLIZ2.append(e2.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            } catch (UnsupportedOperationException e3) {
                TryCatchGuardChecker.doCheck(e3);
                PrintStream printStream3 = System.out;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("catch UnsupportedOperationException: ");
                sbLIZ3.append(e3.getMessage());
                printStream3.println(C2188811AlT.LIZIZ(sbLIZ3));
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                PrintStream printStream4 = System.out;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("catch other exception: ");
                sbLIZ4.append(e4.getMessage());
                printStream4.println(C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            X.0sA1 r0 = r6.LLILZ
            r2 = 0
            if (r0 == 0) goto Lc7
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            if (r0 == 0) goto Lc7
            X.0sA1 r0 = r6.LLILZ
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            int r0 = r0.getCount()
            if (r0 == 0) goto Lc7
            X.0sA1 r0 = r6.LLILZ
            int r0 = r0.getCurrentItem()
            r4 = 1
            if (r0 <= 0) goto L33
            X.0sA1 r0 = r6.LLILZ
            int r1 = r0.getCurrentItem()
            X.0sA1 r0 = r6.LLILZ
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            int r0 = r0.getCount()
            int r0 = r0 - r4
            if (r1 < r0) goto Lc7
        L33:
            X.0sA1 r0 = r6.LLILZ
            boolean r0 = r0.LJ()
            if (r0 != 0) goto Lc7
            boolean r0 = r6.LJFF()
            if (r0 != 0) goto Lc7
            boolean r0 = r6.LLJJLIIIJLLLLLLLZ
            if (r0 != 0) goto Lc7
            int r1 = r7.getAction()
            if (r1 == 0) goto Lbc
            if (r1 == r4) goto Lb9
            r0 = 2
            if (r1 == r0) goto L56
            r0 = 3
            if (r1 == r0) goto Lb9
        L53:
            boolean r0 = r6.LLIZLLLIL
            return r0
        L56:
            float r5 = r7.getY()
            X.0sA1 r0 = r6.LLILZ
            int r0 = r0.getCurrentItem()
            if (r0 != 0) goto L7b
            float r0 = r6.LLJI
            float r1 = r5 - r0
            int r0 = r6.LLIZ
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L7b
            boolean r0 = r6.LLIZLLLIL
            if (r0 != 0) goto L7b
            r6.LLIZLLLIL = r4
            android.animation.ValueAnimator r0 = r6.LLJJI
            if (r0 == 0) goto L53
            r0.cancel()
            goto L53
        L7b:
            X.0sA1 r0 = r6.LLILZ
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            int r1 = r0.getCount()
            int r1 = r1 - r4
            X.0sA1 r0 = r6.LLILZ
            int r0 = r0.getCurrentItem()
            if (r1 != r0) goto L53
            float r3 = r6.LLJI
            float r2 = r3 - r5
            int r1 = r6.LLIZ
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L9d
            boolean r0 = r6.LLIZLLLIL
            if (r0 == 0) goto Laf
        L9d:
            float r5 = r5 - r3
            float r0 = (float) r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L53
            boolean r0 = r6.LLIZLLLIL
            if (r0 != 0) goto L53
            X.0sA1 r0 = r6.LLILZ
            int r0 = r0.getTop()
            if (r0 >= 0) goto L53
        Laf:
            r6.LLIZLLLIL = r4
            android.animation.ValueAnimator r0 = r6.LLJJI
            if (r0 == 0) goto L53
            r0.cancel()
            goto L53
        Lb9:
            r6.LLIZLLLIL = r2
            goto L53
        Lbc:
            r6.LLIZLLLIL = r2
            float r0 = r7.getY()
            r6.LLJI = r0
            r6.LLJIJIL = r0
            goto L53
        Lc7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1603210rp1.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d7, code lost:
    
        if (r5 < 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1603210rp1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBottomViewBackground(Drawable drawable) {
        C1235870iGX c1235870iGXLIZJ = LIZJ(false);
        if (c1235870iGXLIZJ != null) {
            c1235870iGXLIZJ.setBackgroundDrawable(drawable);
        } else {
            this.LLJJJIL = drawable;
        }
    }

    public void setEnableOverdarwOpt(boolean z) {
        this.LLJL = z;
    }

    public void setEnterFromPage(String str) {
        this.LLJJL = str;
    }

    public void setLabel(String str) {
        this.LLJJIJIL = str;
    }

    public void setLoadMoreEmptyView(View view) {
        this.LLJJJJ = view;
        this.LLILLL = null;
    }

    public void setLoadMoreListener(InterfaceC1603280rp8 interfaceC1603280rp8) {
        this.LLJILJIL = interfaceC1603280rp8;
    }

    public void setMaxHeight(int i) {
        this.LLJILLL = i;
    }

    public void setOnGestureTriggerExit(InterfaceC1568180quW interfaceC1568180quW) {
        this.LLJJJJLIIL = interfaceC1568180quW;
    }

    public void setReleaseListener(InterfaceC1603260rp6 interfaceC1603260rp6) {
        this.LLJJIII = interfaceC1603260rp6;
    }

    public void setSkipTouchEvent(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    public void setViewPagerMarginTopByDelta(int i) {
        AbstractC1616230sA1 abstractC1616230sA1 = this.LLILZ;
        if (abstractC1616230sA1 == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) abstractC1616230sA1.getLayoutParams();
        int i2 = marginLayoutParams.topMargin + i;
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.bottomMargin = -i2;
        if (!this.LLJLIL.isEmpty()) {
            Iterator<C0RAS> it2 = this.LLJLIL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ(marginLayoutParams.topMargin);
            }
        }
        AbstractC1616230sA1 abstractC1616230sA12 = this.LLILZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC1616230sA12);
        abstractC1616230sA12.setLayoutParams(marginLayoutParams);
    }

    public C1603210rp1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new ArrayList();
        this.LLILLJJLI = 0;
        this.LLJILJILJ = -1;
        this.LLJJIJI = false;
        this.LLJJIJIIJIL = -1L;
        this.LLJJJ = false;
        this.LLJJJIL = null;
        this.LLJJJJJIL = new ArrayList();
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJL = false;
        this.LLJLIL = new ArrayList<>();
        this.LLIZ = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLJJ = (int) (getContext().getResources().getDisplayMetrics().density * 109.0f);
        this.LLJILLL = (int) (getContext().getResources().getDisplayMetrics().density * 218.0f);
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LJJIFFI.getValue());
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C0DR8.LJLLILLLL.getClass();
        if (C0DR7.LIZ(view) && super.drawChild(canvas, view, j)) {
            return true;
        }
        return false;
    }
}
