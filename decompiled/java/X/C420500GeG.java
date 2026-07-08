package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GeG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420500GeG extends FrameLayout {
    public C0H6M LL;
    public boolean LLILLJJLI;
    public final C01GW LLILLL;
    public final View LLILZ;
    public final C01GW LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL;

    private final Paint getDecorationPaint() {
        return (Paint) this.LLIZLLLIL.getValue();
    }

    private final Paint getFadedOverlayPaint() {
        return (Paint) this.LLILZIL.getValue();
    }

    public final Integer getBackgroundColor() {
        return (Integer) this.LLILLL.getValue();
    }

    public final C0H6M getElementDisplayStrategy() {
        return this.LL;
    }

    public C420500GeG(Context context) {
        int iIntValue;
        super(context);
        this.LLILLJJLI = true;
        this.LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1119));
        View view = new View(context);
        Integer backgroundColor = getBackgroundColor();
        if (backgroundColor != null) {
            iIntValue = backgroundColor.intValue();
        } else {
            iIntValue = -1;
        }
        view.setBackgroundColor(iIntValue);
        view.setClipToOutline(true);
        view.setOutlineProvider(new C0ID9(14));
        view.setElevation(3.0f);
        this.LLILZ = view;
        this.LLILZIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1121));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1120));
        setClipChildren(false);
        setClipToPadding(false);
        setClipToOutline(false);
        addView(view);
        setWillNotDraw(false);
        setHapticFeedbackEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.LLIZ && !(this.LL instanceof C0H6P)) {
            canvas.drawRoundRect(C418440Gaw.LIZIZ(-3), C418440Gaw.LIZIZ(-3), getWidth() + C418440Gaw.LIZIZ(3), getHeight() + C418440Gaw.LIZIZ(3), (getWidth() * 0.23f) + C418440Gaw.LIZIZ(3), (getWidth() * 0.23f) + C418440Gaw.LIZIZ(3), getDecorationPaint());
        }
        C0H6M c0h6m = this.LL;
        if (c0h6m != null) {
            c0h6m.LJII(canvas);
        }
        this.LLILLJJLI = false;
        if (this.LLILZLL) {
            canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), getWidth() * 0.23f, getWidth() * 0.23f, getFadedOverlayPaint());
        }
    }

    public final void setElementDisplayStrategy(C0H6M c0h6m) {
        if (!Intrinsics.LJFF(c0h6m, this.LL)) {
            C0H6M c0h6m2 = this.LL;
            StateListAnimator stateListAnimator = null;
            if (c0h6m2 != null) {
                c0h6m2.LIZLLL = null;
                c0h6m2.LJ = null;
            }
            this.LL = c0h6m;
            if (c0h6m != null) {
                AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 1122);
                AwS550S0100000_6 awS550S0100000_62 = new AwS550S0100000_6(this, 1123);
                c0h6m.LIZLLL = awS550S0100000_6;
                c0h6m.LJ = awS550S0100000_62;
                if (c0h6m.LIZ()) {
                    C786410Ut5.LJLLLLLL(0, this.LLILZ);
                    this.LLILZ.setElevation(3.0f);
                    this.LLILZ.setClipToOutline(true);
                } else {
                    C786410Ut5.LJLLLLLL(8, this.LLILZ);
                    this.LLILZ.setElevation(0.0f);
                    this.LLILZ.setClipToOutline(false);
                }
                List<Pair<int[], PropertyValuesHolder[]>> listLJI = c0h6m.LJI();
                if (listLJI != null) {
                    stateListAnimator = new StateListAnimator();
                    for (Pair<int[], PropertyValuesHolder[]> pair : listLJI) {
                        int[] first = pair.getFirst();
                        PropertyValuesHolder[] second = pair.getSecond();
                        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, (PropertyValuesHolder[]) Arrays.copyOf(second, second.length));
                        objectAnimatorOfPropertyValuesHolder.setDuration(30L);
                        objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
                        stateListAnimator.addState(first, objectAnimatorOfPropertyValuesHolder);
                    }
                }
                setStateListAnimator(stateListAnimator);
            }
            requestLayout();
            invalidate();
            this.LLILLJJLI = true;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || this.LLILLJJLI) {
            C0H6M c0h6m = this.LL;
            if (c0h6m != null) {
                c0h6m.LJIIIIZZ(i3 - i, i4 - i2);
            }
            this.LLILZ.invalidateOutline();
        }
    }
}
