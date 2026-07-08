package X;

import Y.ACListenerS110S0200000_6;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS236S0000000_6;
import mf.a;

/* JADX INFO: renamed from: X.0GgT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421870GgT extends FrameLayout {
    public final Context LL;
    public final int LLILLJJLI;
    public C421890GgV LLILLL;
    public LinearLayout LLILZ;
    public final List<C0GRX> LLILZIL;
    public Function1<? super Integer, Unit> LLILZLL;

    public final void LIZIZ() {
        for (C0GRX c0grx : (ArrayList) this.LLILZIL) {
            if (c0grx.LLILLJJLI) {
                LIZJ(c0grx, false);
            }
        }
    }

    private final double getAdaptedColorHMarginDp() {
        double d;
        double d2 = ((double) 8) + 0.35294117647058826d;
        double measuredWidth = ((double) getMeasuredWidth()) - 14.0d;
        double d3 = (1.0d * measuredWidth) / 34.0d;
        double dFloor = Math.floor(d3);
        if (d3 < d2) {
            d = measuredWidth / d2;
        } else {
            double d4 = d3 - dFloor;
            if (0.2529411764705882d <= d4 && d4 <= 0.4529411764705883d) {
                return 5.0d;
            }
            d = measuredWidth / (dFloor + 0.35294117647058826d);
        }
        return (d - 24.0d) / ((double) 2);
    }

    public final void LIZ(int i) {
        boolean z;
        double d;
        LinearLayout linearLayout = this.LLILZ;
        if (linearLayout != null && linearLayout.getChildCount() > 0) {
            return;
        }
        LinearLayout linearLayout2 = this.LLILZ;
        if (linearLayout2 != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(linearLayout2, null);
            linearLayout2.removeAllViewsInLayout();
        }
        List<Integer> listLIZ = C1EAR.LIZ();
        double adaptedColorHMarginDp = getAdaptedColorHMarginDp();
        ((ArrayList) this.LLILZIL).clear();
        int size = ((ArrayList) listLIZ).size();
        for (int i2 = 0; i2 < size; i2++) {
            C0GRX c0grx = new C0GRX(this.LL);
            int iIntValue = ((Number) ListProtector.get(listLIZ, i2)).intValue();
            c0grx.LL = iIntValue;
            c0grx.LLILZ.setColor(iIntValue);
            c0grx.invalidate();
            c0grx.setTag(Integer.valueOf(iIntValue));
            if (iIntValue == i) {
                z = true;
            } else {
                z = false;
            }
            LIZJ(c0grx, z);
            ((ArrayList) this.LLILZIL).add(c0grx);
            int i3 = this.LLILLJJLI;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
            double d2 = 14.0d;
            if (i2 == 0) {
                d = 14.0d;
            } else {
                d = adaptedColorHMarginDp;
            }
            layoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(d)));
            if (i2 != r6.size() - 1) {
                d2 = adaptedColorHMarginDp;
            }
            layoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(d2)));
            layoutParams.gravity = 16;
            LinearLayout linearLayout3 = this.LLILZ;
            if (linearLayout3 != null) {
                linearLayout3.addView(c0grx, layoutParams);
            }
            View.OnClickListener aCListenerS110S0200000_6 = new ACListenerS110S0200000_6(this, c0grx, 3);
            if (C1848410yCV.LIZ) {
                aCListenerS110S0200000_6 = new f(aCListenerS110S0200000_6);
            }
            a aVar = new a(aCListenerS110S0200000_6);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c0grx);
            }
            c0grx.setOnClickListener(aVar);
        }
    }

    public final void setColorChangeListener(Function1<? super Integer, Unit> function1) {
        this.LLILZLL = function1;
    }

    public final void setSelectedColor(int i) {
        Object next;
        Integer num;
        Iterator it2 = ((ArrayList) this.LLILZIL).iterator();
        while (true) {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
            Object tag = ((View) next).getTag();
            if ((tag instanceof Integer) && (num = (Integer) tag) != null && num.intValue() == i) {
                break;
            }
        }
        C0GRX c0grx = (C0GRX) next;
        if (c0grx != null) {
            LIZIZ();
            LIZJ(c0grx, true);
            C421890GgV c421890GgV = this.LLILLL;
            if (c421890GgV != null) {
                c421890GgV.LIZ(c0grx);
            }
        }
    }

    public C421870GgT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = context;
        this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(24.0d)));
        this.LLILZIL = new ArrayList();
        this.LLILZLL = AFwS236S0000000_6.get$arr$(31);
        this.LLILLL = new C421890GgV(context, null);
        this.LLILZ = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C421890GgV c421890GgV = this.LLILLL;
        if (c421890GgV != null) {
            c421890GgV.addView(this.LLILZ, layoutParams);
        }
        C421890GgV c421890GgV2 = this.LLILLL;
        if (c421890GgV2 != null) {
            c421890GgV2.setHorizontalScrollBarEnabled(false);
        }
        addView(this.LLILLL, new FrameLayout.LayoutParams(-1, -1));
    }

    public static void LIZJ(C0GRX c0grx, boolean z) {
        float f;
        ViewPropertyAnimator viewPropertyAnimatorScaleX;
        ViewPropertyAnimator viewPropertyAnimatorScaleY;
        ViewPropertyAnimator duration;
        c0grx.setSelection(z);
        if (c0grx.LLILLJJLI) {
            f = 1.15f;
        } else {
            f = 1.0f;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = c0grx.animate();
        if (viewPropertyAnimatorAnimate != null && (viewPropertyAnimatorScaleX = viewPropertyAnimatorAnimate.scaleX(f)) != null && (viewPropertyAnimatorScaleY = viewPropertyAnimatorScaleX.scaleY(f)) != null && (duration = viewPropertyAnimatorScaleY.setDuration(200L)) != null) {
            duration.start();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
