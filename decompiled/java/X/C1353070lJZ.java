package X;

import Y.AAListenerS332S0100000_21;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lJZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1353070lJZ extends LinearLayout implements InterfaceC1318530kPr {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIL;
    public static final C1085640eME<Rect> LLLILZ;
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public ObjectAnimator LLJJJ;
    public boolean LLJJJIL;
    public final C1353120lJe LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public View LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public boolean LLJLLIL;
    public final C01GW LLJLLL;
    public boolean LLJZ;
    public Function1<? super Boolean, Unit> LLJZIJLIL;
    public final C01GW LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public String LLLI;
    public boolean LLLII;
    public Function1<? super C1352420lIW, Unit> LLLIIII;
    public InterfaceC1352430lIX LLLIIIIL;
    public Function1<? super Boolean, Unit> LLLIIIL;
    public final AAListenerS332S0100000_21 LLLIIL;
    public final AAListenerS332S0100000_21 LLLIILIL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C1353070lJZ.class, "touchScrollingChild", "getTouchScrollingChild()Z", 0);
        C13LE.LIZ.getClass();
        LLLIL = new InterfaceC2217461Bqa[]{c2217371BqR};
        LLLILZ = new C1085640eME<>(12);
    }

    public final void LIZLLL() {
        this.LLJJIJIL = false;
        setTouchScrollingChild(false);
        this.LLJLIL = false;
        this.LLJILLL = 0.0f;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return 0;
    }

    public final InterfaceC1353170lJj getOnShowHeightChangeListener() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC1318530kPr
    public final void onNestedScrollAccepted(View view, View view2, int i) {
    }

    public final void setOnShowHeightChangeListener(InterfaceC1353170lJj interfaceC1353170lJj) {
    }

    private final boolean getAnimating() {
        return this.LLLFF || this.LLLFZ;
    }

    private final View getCommentListContainer() {
        return (View) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final C1066370dr9 getHandleView() {
        return (C1066370dr9) this.LLJLL.getValue();
    }

    private final View getInputView() {
        return (View) this.LLJLLL.getValue();
    }

    private final float getMaximumVelocity() {
        return ((Number) this.LLILZ.getValue()).floatValue();
    }

    private final float getMinimumVelocity() {
        return ((Number) this.LLILLL.getValue()).floatValue();
    }

    private final View getPlaceholder() {
        return (View) this.LLJJJJJIL.getValue();
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.LLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getTouchScrollingChild() {
        C1353120lJe c1353120lJe = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIL;
        return ((Boolean) c1353120lJe.LL).booleanValue();
    }

    private final int getTouchSlop() {
        return ((Number) this.LLILLJJLI.getValue()).intValue();
    }

    private final VelocityTracker getVelocityTracker() {
        return (VelocityTracker) this.LLILZIL.getValue();
    }

    private final ViewPager getViewPager() {
        return (ViewPager) this.LLJL.getValue();
    }

    public final View getCommentBgContainer() {
        return (View) this.LLJJJJLIIL.getValue();
    }

    public final View getCommentContainer() {
        if (this.LLJJL == null) {
            this.LLJJL = findViewById(R.id.i4h);
        }
        return this.LLJJL;
    }

    public final RecyclerView getScrollingChild() {
        InterfaceC1352430lIX interfaceC1352430lIX = this.LLLIIIIL;
        RecyclerView recyclerViewLJJLIIIJILLIZJL = interfaceC1352430lIX != null ? interfaceC1352430lIX.LJJLIIIJILLIZJL() : null;
        return (!(recyclerViewLJJLIIIJILLIZJL instanceof RecyclerView) || recyclerViewLJJLIIIJILLIZJL == null) ? getRecyclerView() : recyclerViewLJJLIIIJILLIZJL;
    }

    public final ViewConfiguration getViewConfiguration() {
        return (ViewConfiguration) this.LL.getValue();
    }

    private final int getInputAreaHeight() {
        View inputView = getInputView();
        if (inputView != null) {
            return inputView.getHeight();
        }
        return 0;
    }

    public final boolean getEnableSwipeDown() {
        return this.LLJJJIL;
    }

    public final Function1<Boolean, Unit> getHideOuterListener() {
        return this.LLJZIJLIL;
    }

    public final InterfaceC1352430lIX getScrollableContainer() {
        return this.LLLIIIIL;
    }

    private final void setTouchScrollingChild(boolean z) {
        setValue(this, LLLIL[0], Boolean.valueOf(z));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchTouchEvent   ");
        sbLIZ.append(motionEvent);
        sbLIZ.append("  ");
        sbLIZ.append(this.LLJJ);
        sbLIZ.append("   ");
        sbLIZ.append(this.LLJILLL);
        C1349760lEE.LIZ("CommentNestedLayout", C2188811AlT.LIZIZ(sbLIZ));
        if (motionEvent.getActionMasked() == 0) {
            this.LLILZLL = getAnimating();
        }
        if (this.LLILZLL && !getAnimating() && motionEvent.getActionMasked() == 2) {
            motionEvent.setAction(0);
            this.LLILZLL = false;
        }
        if (getVisibility() == 8) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2 && this.LLIZ && Math.abs(motionEvent.getRawX() - this.LLJILJILJ) > getTouchSlop()) {
                if (Math.abs(motionEvent.getRawX() - this.LLJILJILJ) >= ((double) Math.abs(motionEvent.getRawY() - this.LLJILJIL)) * 0.7d) {
                    z = true;
                } else {
                    z = false;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("horizontalScroll ");
                sbLIZ2.append(z);
                sbLIZ2.append(' ');
                sbLIZ2.append(true ^ LIZJ(motionEvent, getInputView()));
                sbLIZ2.append("  slop ");
                sbLIZ2.append(Math.abs(motionEvent.getRawX() - this.LLJILJILJ));
                sbLIZ2.append(' ');
                sbLIZ2.append(getTouchSlop());
                C2188811AlT.LIZIZ(sbLIZ2);
                this.LLIZ = false;
            }
        } else {
            this.LLIZ = true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zLIZJ;
        Function1<? super Boolean, Unit> function1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInterceptTouchEvent   ");
        sbLIZ.append(motionEvent);
        C1349760lEE.LIZ("CommentNestedLayout", C2188811AlT.LIZIZ(sbLIZ));
        if (motionEvent.getAction() == 0 && this.LLJLLIL && getHeight() - motionEvent.getY() > getInputAreaHeight()) {
            if (C1388190mED.LIZ(getContext()) != null && (function1 = this.LLJZIJLIL) != null) {
                function1.invoke(Boolean.TRUE);
            }
            this.LLJZ = true;
            return true;
        }
        if (motionEvent.getAction() == 0) {
            this.LLJZ = false;
        }
        if (!this.LLJJJIL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 0) {
            LIZLLL();
            float x = motionEvent.getX();
            this.LLIZLLLIL = x;
            this.LLJI = x;
            float y = motionEvent.getY();
            this.LLJ = y;
            this.LLJIJIL = y;
            this.LLJILJIL = motionEvent.getRawY();
            this.LLJILJILJ = motionEvent.getRawX();
            motionEvent.getRawX();
            motionEvent.getRawY();
            getVelocityTracker().clear();
            getVelocityTracker().addMovement(motionEvent);
            this.LLJLIL = LIZJ(motionEvent, getPlaceholder());
            if (this.LLLFFI) {
                if (!LIZJ(motionEvent, getScrollingChild()) && !LIZJ(motionEvent, getCommentContainer())) {
                    zLIZJ = false;
                } else {
                    zLIZJ = true;
                }
            } else {
                zLIZJ = LIZJ(motionEvent, getScrollingChild());
            }
            setTouchScrollingChild(zLIZJ);
        }
        if (getAnimating()) {
            return true;
        }
        if (getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 3) {
            LIZLLL();
        }
        if (motionEvent.getActionMasked() == 1) {
            LIZLLL();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                float y2 = motionEvent.getY() - this.LLJIJIL;
                float x2 = motionEvent.getX() - this.LLJI;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onInterceptTouchEvent move diffx ");
                sbLIZ2.append(x2);
                sbLIZ2.append(" diffy");
                sbLIZ2.append(y2);
                sbLIZ2.append(" mTouchPlaceholderChild ");
                sbLIZ2.append(this.LLJLIL);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (x2 > 0.0f && Math.abs(x2) > Math.abs(y2) && Math.abs(x2) > getTouchSlop() && this.LLLFFI) {
                    this.LLJLILLLLZIIL = true;
                    return true;
                }
                this.LLJLILLLLZIIL = false;
                if (this.LLJLIL) {
                    return false;
                }
                float y3 = this.LLJIJIL - motionEvent.getY();
                if (!getTouchScrollingChild() && (this.LLJJIJIL || Math.abs(y3) > getTouchSlop())) {
                    this.LLJJIJIL = true;
                    return true;
                }
            }
        } else if (this.LLJLIL) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.LLJJJIL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStopNestedScroll touchback ");
        sbLIZ.append(this.LLJLILLLLZIIL);
        sbLIZ.append(" readyUp ");
        float f = 3;
        sbLIZ.append(this.LLJJIII / f);
        sbLIZ.append("  tra:");
        sbLIZ.append(getTranslationY());
        C2188811AlT.LIZIZ(sbLIZ);
        boolean z = true;
        if (this.LLJLILLLLZIIL) {
            if (getTranslationY() >= this.LLJJIII / f) {
                z = false;
            }
            LIZ("slide_right", z, false);
        } else {
            if (getTranslationY() * 2 >= this.LLJJI) {
                z = false;
            }
            LIZ("pull_down", z, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0269  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1353070lJZ.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCommentContainer(View view) {
        this.LLJJL = view;
    }

    public final void setEnableSwipeDown(boolean z) {
        this.LLJJJIL = z;
    }

    public final void setEnableSwipeRightToClose(boolean z) {
        this.LLLFFI = z;
        if (C426750GoL.LIZLLL(getContext())) {
            this.LLLFFI = false;
        }
    }

    public final void setFocus(boolean z) {
        if (this.LLLII ^ z) {
            setFocusable(z);
            setFocusableInTouchMode(z);
            if (z) {
                requestFocus();
            } else {
                clearFocus();
            }
            this.LLLII = z;
        }
    }

    public final void setHideOuterListener(Function1<? super Boolean, Unit> function1) {
        this.LLJZIJLIL = function1;
    }

    public final void setPreScrollChangeListener(Function1<? super Boolean, Unit> function1) {
        this.LLLIIIL = function1;
    }

    public final void setScrollableContainer(InterfaceC1352430lIX interfaceC1352430lIX) {
        this.LLLIIIIL = interfaceC1352430lIX;
    }

    public final void setShowKeyboard(boolean z) {
        this.LLJLLIL = z;
        setFocus(!z);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
    }

    public final void setVisibleChangedListener(Function1<? super C1352420lIW, Unit> function1) {
        this.LLLIIII = function1;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0lJe] */
    public C1353070lJZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS565S0100000_21(context, 1542));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1541));
        this.LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1538));
        this.LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1537));
        this.LLILZIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(602));
        this.LLJJIJI = -1.0f;
        int iLIZ = C497820Jfg.LIZ(context);
        this.LLJJIJIIJIL = iLIZ > 0 ? 1.0f * iLIZ : 1.0f;
        this.LLJJJIL = true;
        final Boolean bool = Boolean.FALSE;
        this.LLJJJJ = new C0NTU<Boolean>(bool) { // from class: X.0lJe
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                boolean z;
                if (((Boolean) obj).booleanValue() ^ ((Boolean) obj2).booleanValue()) {
                    C1353070lJZ c1353070lJZ = this;
                    if (c1353070lJZ.getScrollingChild().computeVerticalScrollExtent() >= this.getScrollingChild().computeVerticalScrollRange()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1353070lJZ.LLLF = z;
                }
            }
        };
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1539));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1533));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1534));
        this.LLJL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1543));
        this.LLJLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1535));
        this.LLJLLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1536));
        this.LLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1540));
        this.LLLI = "";
        this.LLLIIL = new AAListenerS332S0100000_21(this, 20);
        this.LLLIILIL = new AAListenerS332S0100000_21(this, 19);
        setFocus(true);
        setOnKeyListener(new View.OnKeyListener() { // from class: X.0lJc
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (this.LL.getEnableSwipeDown()) {
                    C1353070lJZ c1353070lJZ = this.LL;
                    if ((c1353070lJZ.LLLFZ || (!c1353070lJZ.LLLFF && c1353070lJZ.getTranslationY() < c1353070lJZ.LLJJI)) && i == 4) {
                        if (keyEvent.getAction() == 1) {
                            this.LL.LIZ("back_pressed", false, true);
                        }
                        return true;
                    }
                }
                return false;
            }
        });
    }

    public final boolean LIZJ(MotionEvent motionEvent, View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        C1085640eME<Rect> c1085640eME = LLLILZ;
        Rect rectLIZIZ = c1085640eME.LIZIZ();
        if (rectLIZIZ == null) {
            rectLIZIZ = new Rect();
        }
        C1292450jjn.LIZ(rectLIZIZ, view, this);
        try {
            boolean zContains = rectLIZIZ.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            rectLIZIZ.setEmpty();
            c1085640eME.LIZ(rectLIZIZ);
            return zContains;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            rectLIZIZ.setEmpty();
            LLLILZ.LIZ(rectLIZIZ);
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        float fLIZJ;
        super.onMeasure(i, i2);
        float measuredHeight2 = getMeasuredHeight();
        View placeholder = getPlaceholder();
        if (placeholder != null) {
            measuredHeight = placeholder.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        float f = measuredHeight2 - measuredHeight;
        this.LLJJI = f;
        if (this.LLJJIJI < 0.0f && f > 0.0f) {
            this.LLJJIJI = f;
        }
        float measuredHeight3 = getMeasuredHeight();
        if (measuredHeight3 > 0.0f) {
            fLIZJ = (measuredHeight3 - C497820Jfg.LIZJ(getContext())) * 1.0f;
        } else {
            fLIZJ = (C14KQ.LIZJ(getContext()) - C497820Jfg.LIZJ(getContext())) - C14KQ.LIZLLL(getContext());
        }
        this.LLJJIJIIJIL = fLIZJ;
        this.LLJJIII = getMeasuredWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r7, boolean r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.getAnimating()
            if (r0 == 0) goto L7
            return
        L7:
            r6.LLLI = r7
            r2 = 0
            if (r8 == 0) goto L9c
            r4 = 0
        Ld:
            float r0 = r6.getTranslationY()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r3 = 1
            r5 = 0
            if (r0 != 0) goto L4c
            if (r8 == 0) goto L91
            int r0 = r6.getVisibility()
            if (r0 == 0) goto L9b
        L1f:
            r1 = 0
        L20:
            int r0 = r6.getVisibility()
            r6.setVisibility(r1)
            X.C1602160rnK.LIZIZ(r0, r1, r6)
            r6.LIZLLL()
            if (r9 == 0) goto L4c
            if (r8 == 0) goto L46
            float r1 = r6.LLJJI
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L8f
            r0 = 1140457472(0x43fa0000, float:500.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            float r2 = (float) r0
        L46:
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r6)
            r6.setTranslationY(r2)
        L4c:
            android.animation.ObjectAnimator r0 = r6.LLJJJ
            if (r0 == 0) goto L5d
            boolean r0 = r0.isRunning()
            if (r0 != r3) goto L5d
            android.animation.ObjectAnimator r0 = r6.LLJJJ
            if (r0 == 0) goto L5d
            r0.cancel()
        L5d:
            android.util.Property r2 = android.view.View.TRANSLATION_Y
            r0 = 2
            float[] r1 = new float[r0]
            float r0 = r6.getTranslationY()
            r1[r5] = r0
            r1[r3] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r6, r2, r1)
            r6.LLJJJ = r0
            android.animation.ObjectAnimator r2 = r6.LLJJJ
            if (r2 == 0) goto L8b
            r0 = 150(0x96, double:7.4E-322)
            r2.setDuration(r0)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r2.setInterpolator(r0)
            if (r8 == 0) goto L8c
            Y.AAListenerS332S0100000_21 r0 = r6.LLLIIL
        L85:
            r2.addListener(r0)
            X.C786410Ut5.Pd(r2)
        L8b:
            return
        L8c:
            Y.AAListenerS332S0100000_21 r0 = r6.LLLIILIL
            goto L85
        L8f:
            r2 = r1
            goto L46
        L91:
            r1 = 8
            if (r8 != 0) goto L1f
            int r0 = r6.getVisibility()
            if (r0 != r1) goto L20
        L9b:
            return
        L9c:
            float r4 = r6.LLJJI
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1353070lJZ.LIZ(java.lang.String, boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        int iComputeVerticalScrollOffset;
        boolean z;
        if (!this.LLJJJIL) {
            return false;
        }
        if (view instanceof InterfaceC1354050lL9) {
            iComputeVerticalScrollOffset = ((InterfaceC1354050lL9) view).computeVerticalScrollOffset();
        } else {
            iComputeVerticalScrollOffset = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNestedPreFling ");
        sbLIZ.append(f2);
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
        if (iComputeVerticalScrollOffset != 0 || Math.abs(f2) <= 3000.0f) {
            return false;
        }
        if (f2 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        LIZ("pull_down", z, false);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStartNestedScroll nestedScrollAxes ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if ((view2 instanceof InterfaceC1338650kwJ) && (i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (!this.LLJJJIL) {
            return;
        }
        float translationY = getTranslationY();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNestedPreScroll dx:");
        sbLIZ.append(i);
        sbLIZ.append("  dy:");
        sbLIZ.append(i2);
        sbLIZ.append("  translationY:");
        sbLIZ.append(translationY);
        C2188811AlT.LIZIZ(sbLIZ);
        int iComputeVerticalScrollOffset = 0;
        float f = 0.0f;
        if (this.LLJLILLLLZIIL) {
            if (translationY > 0.0f) {
                float f2 = translationY - i;
                if (f2 >= 0.0f) {
                    f = f2;
                }
                float f3 = this.LLJJI;
                if (f > f3) {
                    f = f3;
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setTranslationY(f);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onNestedPreScroll mTouchBack translationY:");
                sbLIZ2.append(getTranslationY());
                C2188811AlT.LIZIZ(sbLIZ2);
                if (getTouchScrollingChild() && !this.LLLF) {
                    iArr[1] = iArr[1] + i;
                    return;
                }
                return;
            }
            if (translationY != 0.0f) {
                return;
            }
            if (view instanceof InterfaceC1354050lL9) {
                iComputeVerticalScrollOffset = ((InterfaceC1354050lL9) view).computeVerticalScrollOffset();
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onNestedPreScroll ty=0 dy:");
            sbLIZ3.append(i2);
            sbLIZ3.append(" offsetY:");
            sbLIZ3.append(iComputeVerticalScrollOffset);
            sbLIZ3.append(" mTouchScrollingChild:");
            sbLIZ3.append(getTouchScrollingChild());
            sbLIZ3.append("mHeight:");
            sbLIZ3.append(this.LLJJI);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (i >= 0) {
                return;
            }
            float f4 = translationY - i;
            if (f4 >= 0.0f) {
                f = f4;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationY(f);
            return;
        }
        if (translationY > 0.0f) {
            float f5 = translationY - i2;
            if (f5 >= 0.0f) {
                f = f5;
            }
            float f6 = this.LLJJI;
            if (f > f6) {
                f = f6;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationY(f);
            if (getTouchScrollingChild() && !this.LLLF) {
                iArr[1] = iArr[1] + i2;
                return;
            }
            return;
        }
        if (translationY != 0.0f) {
            return;
        }
        if (view instanceof InterfaceC1354050lL9) {
            iComputeVerticalScrollOffset = ((InterfaceC1354050lL9) view).computeVerticalScrollOffset();
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("onNestedPreScroll ty=0 dy:");
        sbLIZ4.append(i2);
        sbLIZ4.append(" offsetY:");
        sbLIZ4.append(iComputeVerticalScrollOffset);
        sbLIZ4.append(" mTouchScrollingChild:");
        sbLIZ4.append(getTouchScrollingChild());
        sbLIZ4.append("mHeight:");
        sbLIZ4.append(this.LLJJI);
        C2188811AlT.LIZIZ(sbLIZ4);
        if (i2 >= 0) {
            return;
        }
        if (iComputeVerticalScrollOffset != 0 && getTouchScrollingChild()) {
            return;
        }
        float f7 = translationY - i2;
        float f8 = this.LLJJI;
        if (f7 > f8) {
            f7 = f8;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setTranslationY(f7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNestedScroll dyConsumed ");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
