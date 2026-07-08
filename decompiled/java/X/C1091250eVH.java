package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS117S0100000_17;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eVH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1091250eVH extends FrameLayout implements InterfaceC1112810f43, InterfaceC060500Kd {
    public final C01GW LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public Function2<? super Integer, ? super Integer, Unit> LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final ARunnableS117S0100000_17 LLJ;

    public C1091250eVH(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final Rect getFixedRect() {
        return (Rect) this.LL.getValue();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.LLILLJJLI && getParent() != null && !getFixedRect().isEmpty() && isAttachedToWindow() && !this.LLILZIL && !this.LLIZ) {
            if (!this.LLILLL) {
                postOnAnimation(this.LLJ);
            }
            this.LLILLL = true;
        } else if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()) || !isAttachedToWindow()) {
            super.requestLayout();
        } else {
            HandlerHook.viewPost(this, new ARunnableS113S0100000_13(this, 51));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILZIL = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILZIL = true;
        getFixedRect().setEmpty();
    }

    public final boolean getEnableFixedSize() {
        return this.LLILLJJLI;
    }

    public final boolean getEnableSizeChange() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1112810f43
    public final void LIZ(boolean z) {
        this.LLIZ = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        try {
            return super.dispatchApplyWindowInsets(windowInsets);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            String strLIZIZ = C2450809j0.LIZIZ(this);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current view ids: ");
            sbLIZ.append(strLIZIZ);
            C13SZ.LIZ(e, new Exception(C2188811AlT.LIZIZ(sbLIZ)));
            throw e;
        }
    }

    @Override // X.InterfaceC1112810f43
    public void setEnableFixedSize(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setEnableSizeChange(boolean z) {
        this.LLIZLLLIL = z;
    }

    @Override // X.InterfaceC060500Kd
    public void setOnPreMeasureListener(Function2<? super Integer, ? super Integer, Unit> function2) {
        this.LLILZLL = function2;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        if (i != getVisibility()) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZIL = z;
        super.setVisibility(i);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Function2<? super Integer, ? super Integer, Unit> function2 = this.LLILZLL;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        }
        if (!this.LLIZLLLIL && this.LLILLJJLI && !this.LLILZIL && !this.LLILZ && !getFixedRect().isEmpty()) {
            setMeasuredDimension(getMeasuredWidthAndState(), getMeasuredHeightAndState());
        } else {
            super.onMeasure(i, i2);
        }
    }

    public C1091250eVH(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(102));
        this.LLIZLLLIL = true;
        this.LLJ = new ARunnableS117S0100000_17(this, 112);
    }

    @Override // android.view.ViewGroup
    public void addView(final View view, final int i, final ViewGroup.LayoutParams layoutParams) {
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()) && isAttachedToWindow()) {
            HandlerHook.viewPost(this, new Runnable() { // from class: X.0Utt
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FixedSizeFrameLayout@e1d3.addView$1");
                    try {
                        super/*android.widget.FrameLayout*/.addView(view, i, layoutParams);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FixedSizeFrameLayout@e1d3.addView$1");
                }
            });
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    public /* synthetic */ C1091250eVH(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.LLILLJJLI) {
            getFixedRect().left = i;
            getFixedRect().top = i2;
            getFixedRect().right = i3;
            getFixedRect().bottom = i4;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.LLILZIL = false;
    }
}
