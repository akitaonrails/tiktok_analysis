package X;

import Y.ACListenerS159S0100000_25;
import Y.ALAdapterS20S0100000_25;
import Y.ARunnableS125S0100000_25;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS550S0100000_6;
import u4.q0;

/* JADX INFO: renamed from: X.0t9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654510t9l extends FrameLayout {
    public C1652680t6o LL;
    public final boolean LLILLJJLI;
    public final C01GW LLILLL;
    public AnimatorSet LLILZ;
    public AnimatorSet LLILZIL;
    public View LLILZLL;
    public final Map<Integer, String> LLIZ;

    private final Rect getAnchorGlobalRect() {
        Rect rect = new Rect();
        View view = this.LL.LIZ;
        if (view != null) {
            view.getGlobalVisibleRect(rect);
        }
        return rect;
    }

    private final LinearLayout getSpeedPanelView() {
        return (LinearLayout) this.LLILLL.getValue();
    }

    public final void LJFF() {
        View view = this.LL.LIZ;
        Integer numValueOf = view != null ? Integer.valueOf(view.getWidth()) : null;
        View view2 = this.LL.LIZ;
        Integer numValueOf2 = view2 != null ? Integer.valueOf(view2.getHeight()) : null;
        if (numValueOf != null) {
            numValueOf.intValue();
            if (numValueOf2 != null) {
                numValueOf2.intValue();
                if (this.LLILLJJLI) {
                    getSpeedPanelView().setPivotX(-((float) ((((double) numValueOf.intValue()) * 0.5d) + ((double) C366700EZg.LIZ(6.0d)))));
                } else {
                    getSpeedPanelView().setPivotX((float) (((double) C366700EZg.LIZ(58.0d)) + (((double) numValueOf.intValue()) * 0.5d) + ((double) C366700EZg.LIZ(6.0d))));
                }
                getSpeedPanelView().setPivotY(C366700EZg.LIZ(210.0d) / 2);
                C21616519il c21616519ilLIZIZ = LIZIZ(AbstractC21616419ik.LJIILL, 1.0f, 0.6f);
                C21616519il c21616519ilLIZIZ2 = LIZIZ(AbstractC21616419ik.LJIILLIIL, 1.0f, 0.6f);
                AnimatorSet animatorSet = this.LLILZIL;
                if (animatorSet != null) {
                    animatorSet.start();
                }
                c21616519ilLIZIZ.LJIIIZ();
                c21616519ilLIZIZ2.LJIIIZ();
                View view3 = this.LL.LIZ;
                if (view3 != null) {
                    view3.performAccessibilityAction(64, null);
                }
            }
        }
    }

    public final void LJII() {
        if (this.LLILLJJLI) {
            getSpeedPanelView().setPivotX(-((float) (((double) C366700EZg.LIZ(58.0d)) * 0.5d)));
        } else {
            getSpeedPanelView().setPivotX((float) (((double) C366700EZg.LIZ(58.0d)) * 1.5d));
        }
        getSpeedPanelView().setPivotY(C366700EZg.LIZ(210.0d) / 2);
        C786410Ut5.Mc(getSpeedPanelView(), 0.0f);
        C21616519il c21616519ilLIZIZ = LIZIZ(AbstractC21616419ik.LJIILL, 0.6f, 1.0f);
        C21616519il c21616519ilLIZIZ2 = LIZIZ(AbstractC21616419ik.LJIILLIIL, 0.6f, 1.0f);
        c21616519ilLIZIZ2.LIZIZ(new InterfaceC1427630nFp() { // from class: X.0t9Z
            @Override // X.InterfaceC1427630nFp
            public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z, float f, float f2) {
                C1653260t7k.LIZJ("click_speed_entrance", true);
            }
        });
        AnimatorSet animatorSet = this.LLILZ;
        if (animatorSet != null) {
            animatorSet.start();
        }
        c21616519ilLIZIZ.LJIIIZ();
        c21616519ilLIZIZ2.LJIIIZ();
        View view = this.LLILZLL;
        if (view != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS125S0100000_25(view, 58), 750L);
        }
    }

    public static String LIZJ(int i) {
        if (i == 4) {
            return C20642515q3.LJI(2131823348);
        }
        if (i == 3) {
            return C20642515q3.LJI(2131823347);
        }
        if (i == 2) {
            return C20642515q3.LJI(2131823344);
        }
        if (i == 1) {
            return C20642515q3.LJI(2131823345);
        }
        if (i == 0) {
            return C20642515q3.LJI(2131823346);
        }
        return C20642515q3.LJI(2131823344);
    }

    public final void LJI(C1652680t6o c1652680t6o) {
        float f;
        this.LL = c1652680t6o;
        setClickable(true);
        addView(getSpeedPanelView());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getSpeedPanelView(), "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(50L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat);
        this.LLILZ = animatorSet;
        LinearLayout speedPanelView = getSpeedPanelView();
        float[] fArr = new float[1];
        if (this.LLILLJJLI) {
            f = -8.0f;
        } else {
            f = 8.0f;
        }
        fArr[0] = f;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(speedPanelView, "translationX", fArr);
        objectAnimatorOfFloat2.setDuration(100L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(getSpeedPanelView(), "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(50L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setStartDelay(100L);
        animatorSet2.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet2.addListener(new ALAdapterS20S0100000_25(this, 3));
        this.LLILZIL = animatorSet2;
        View view = this.LL.LIZ;
        if (view != null) {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1698100uI4(this, 3));
        }
    }

    public final void LJIIIIZZ(int i) {
        LinearLayout speedPanelView = getSpeedPanelView();
        if (i >= speedPanelView.getChildCount()) {
            return;
        }
        int childCount = speedPanelView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ViewGroup viewGroup = (ViewGroup) speedPanelView.getChildAt(i2);
            if (i2 == 0) {
                viewGroup.setBackgroundResource(R.drawable.abs);
            } else if (i2 == speedPanelView.getChildCount() - 1) {
                viewGroup.setBackgroundResource(R.drawable.abo);
            } else {
                viewGroup.setBackgroundColor(0);
            }
            ((TextView) viewGroup.getChildAt(viewGroup.getChildCount() - 1)).setTextColor(C446980Hfs.LIZ(speedPanelView.getContext(), R.color.ac4));
        }
        ViewGroup viewGroup2 = (ViewGroup) speedPanelView.getChildAt(i);
        if (i == 0) {
            viewGroup2.setBackgroundResource(R.drawable.abr);
        } else if (i == speedPanelView.getChildCount() - 1) {
            viewGroup2.setBackgroundResource(R.drawable.abn);
        } else {
            viewGroup2.setBackgroundColor(-1);
        }
        ((TextView) viewGroup2.getChildAt(viewGroup2.getChildCount() - 1)).setTextColor(C960203pA.LIZ(R.attr.ej, speedPanelView.getContext()));
        View view = this.LLILZLL;
        if (view != null) {
            view.setSelected(false);
        }
        this.LLILZLL = viewGroup2;
        viewGroup2.setSelected(true);
        View view2 = this.LL.LIZ;
        if (view2 != null) {
            q0.LJJIFFI(view2, LIZJ(i));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || getAnchorGlobalRect().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 1 && !getAnchorGlobalRect().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.LL.LJ.invoke();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public C1654510t9l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C1652680t6o(null, AFwS214S0000000_25.get$arr$(297), AFwS214S0000000_25.get$arr$(298), 7);
        this.LLILLJJLI = C1388580mEq.LIZIZ(context);
        this.LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 879));
        this.LLIZ = new LinkedHashMap();
    }

    public final C21616519il LIZIZ(AbstractC21615419ia abstractC21615419ia, float f, float f2) {
        C21616519il c21616519il = new C21616519il(getSpeedPanelView(), abstractC21615419ia, f2);
        c21616519il.LJJ.LIZIZ(453.0f);
        c21616519il.LJJ.LIZ(0.83f);
        c21616519il.LJI(f);
        c21616519il.LIZ = 0.0f;
        return c21616519il;
    }

    public final void LIZLLL(int i, int i2, Function1<? super Integer, Unit> function1) {
        int iLIZ;
        if (this.LLILLJJLI) {
            iLIZ = (i - C366700EZg.LIZ(6.0d)) - getSpeedPanelView().getWidth();
        } else {
            iLIZ = i + C366700EZg.LIZ(6.0d) + getSpeedPanelView().getWidth();
        }
        LinearLayout speedPanelView = getSpeedPanelView();
        int childCount = speedPanelView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            Rect rect = new Rect();
            View childAt = speedPanelView.getChildAt(i3);
            rect.left = childAt.getLeft();
            rect.right = childAt.getRight();
            rect.bottom = childAt.getBottom();
            rect.top = childAt.getTop();
            if (rect.contains(iLIZ, i2)) {
                function1.invoke(Integer.valueOf(i3));
                return;
            }
        }
    }

    public final void LJ(int i, int i2, Function0<Unit> function0) {
        int iLIZ;
        if (this.LLILLJJLI) {
            iLIZ = (i - C366700EZg.LIZ(6.0d)) - getSpeedPanelView().getWidth();
        } else {
            iLIZ = i + C366700EZg.LIZ(6.0d) + getSpeedPanelView().getWidth();
        }
        Rect rect = new Rect();
        getSpeedPanelView().getLocalVisibleRect(rect);
        if (!rect.contains(iLIZ, i2)) {
            function0.invoke();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLILLJJLI) {
            Rect anchorGlobalRect = getAnchorGlobalRect();
            getSpeedPanelView().setLeft(anchorGlobalRect.left + anchorGlobalRect.width() + C366700EZg.LIZ(6.0d));
            getSpeedPanelView().setBottom(((anchorGlobalRect.top + anchorGlobalRect.bottom) + C366700EZg.LIZ(210.0d)) / 2);
            getSpeedPanelView().setRight(getSpeedPanelView().getLeft() + C366700EZg.LIZ(58.0d));
            getSpeedPanelView().setTop(((anchorGlobalRect.top + anchorGlobalRect.bottom) - C366700EZg.LIZ(210.0d)) / 2);
            return;
        }
        Rect anchorGlobalRect2 = getAnchorGlobalRect();
        getSpeedPanelView().setLeft((anchorGlobalRect2.left - C366700EZg.LIZ(58.0d)) - C366700EZg.LIZ(6.0d));
        getSpeedPanelView().setBottom(((anchorGlobalRect2.top + anchorGlobalRect2.bottom) + C366700EZg.LIZ(210.0d)) / 2);
        getSpeedPanelView().setRight(getSpeedPanelView().getLeft() + C366700EZg.LIZ(58.0d));
        getSpeedPanelView().setTop(((anchorGlobalRect2.top + anchorGlobalRect2.bottom) - C366700EZg.LIZ(210.0d)) / 2);
    }

    public final void LIZ(String str, int i, int i2, int i3, boolean z, Function0<Unit> function0) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setClickable(true);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, C366700EZg.LIZ(42.0d)));
        frameLayout.setBackgroundResource(i);
        TuxTextView tuxTextView = new TuxTextView(frameLayout.getContext(), null, 6, 0);
        tuxTextView.setText(str);
        C786410Ut5.B5(tuxTextView, 0.9f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C366700EZg.LIZ(18.0d));
        layoutParams.topMargin = C366700EZg.LIZ(12.0d);
        layoutParams.bottomMargin = C366700EZg.LIZ(12.0d);
        C786410Ut5.R6(tuxTextView, layoutParams);
        tuxTextView.setTextAlignment(4);
        tuxTextView.setTuxFont(42);
        tuxTextView.setTextColor(C446980Hfs.LIZ(tuxTextView.getContext(), i2));
        frameLayout.addView(tuxTextView);
        if (z) {
            frameLayout.setSelected(true);
            this.LLILZLL = frameLayout;
        }
        Map<Integer, String> map = this.LLIZ;
        Integer numValueOf = Integer.valueOf(i3);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object objLIZJ = linkedHashMap.get(numValueOf);
        if (objLIZJ == null) {
            objLIZJ = LIZJ(i3);
            linkedHashMap.put(numValueOf, objLIZJ);
        }
        frameLayout.setContentDescription((CharSequence) objLIZJ);
        q0.LJIJ(frameLayout, new C786390Ut3(5));
        C786410Ut5.I7(new ACListenerS159S0100000_25(function0, 43), frameLayout);
        getSpeedPanelView().addView(frameLayout);
    }
}
