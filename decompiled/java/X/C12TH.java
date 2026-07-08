package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS167S0101000_29;

/* JADX INFO: renamed from: X.12TH, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C12TH extends FrameLayout {
    public static final /* synthetic */ int LLJ = 0;
    public final int LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public Function2<? super Integer, ? super Integer, Unit> LLILZ;
    public Function1<? super Integer, Unit> LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public float LLIZLLLIL;

    public abstract void LJFF();

    public int getMaxScrollY() {
        return 0;
    }

    public void setOnBlankClickListener$tools_camera_edit_release(View.OnClickListener onClickListener) {
    }

    public final void LJII() {
        long j = this.LLILZLL;
        long j2 = 1000;
        if (j >= 1000) {
            j2 = 25000;
            if (j < 25000) {
                long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
                j2 = j3 * (j / j3);
            }
        }
        this.LLIZ = (int) (j2 * this.LLIZLLLIL);
    }

    public final int getMaxScrollX() {
        return Math.max(this.LLIZ, 0);
    }

    public final int getDesireMaxScrollX() {
        return this.LLIZ;
    }

    public final boolean getFromUser() {
        return this.LLILLL;
    }

    public final int getScreenWidth() {
        return this.LL;
    }

    public final Function2<Integer, Integer, Unit> getScrollChangeListener() {
        return this.LLILZ;
    }

    public final float getTimelineScale() {
        return this.LLIZLLLIL;
    }

    public final long getTotalDuration() {
        return this.LLILZLL;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        LJFF();
        super.addView(view);
    }

    public final void setFromUser(boolean z) {
        this.LLILLL = z;
    }

    public final void setMustUpdateScrollXListener(Function1<? super Integer, Unit> function1) {
        this.LLILZIL = function1;
    }

    public final void setScrollChangeListener(Function2<? super Integer, ? super Integer, Unit> function2) {
        this.LLILZ = function2;
    }

    public void setTimelineScale(float f) {
        this.LLIZLLLIL = f;
        LJII();
    }

    public final void setTotalDuration(long j) {
        this.LLILZLL = j;
    }

    public C12TH(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        LJFF();
        super.addView(view, i);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        AwS167S0101000_29 awS167S0101000_29 = new AwS167S0101000_29(i, this, 4);
        if (getChildCount() == 0) {
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                setMeasuredDimension(((Number) awS167S0101000_29.invoke()).intValue(), View.MeasureSpec.getSize(i2));
                return;
            } else {
                setMeasuredDimension(0, 0);
                return;
            }
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec(0, 0), i2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                paddingTop += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + childAt.getMeasuredHeight();
            }
        }
        setMeasuredDimension(((Number) awS167S0101000_29.invoke()).intValue(), paddingTop);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        LJFF();
        super.addView(view, layoutParams);
    }

    public C12TH(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = ScreenUtils.getScreenWidth(context);
        this.LLILLJJLI = true;
        this.LLIZLLLIL = C341940Daq.LIZ(30.0d) / 1000.0f;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LJFF();
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        Function2<? super Integer, ? super Integer, Unit> function2;
        super.onScrollChanged(i, i2, i3, i4);
        if (this.LLILLJJLI && (function2 = this.LLILZ) != null) {
            function2.invoke(Integer.valueOf(getScrollX()), Integer.valueOf(i - i3));
        }
        Function1<? super Integer, Unit> function1 = this.LLILZIL;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(getScrollX()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013 A[PHI: r0
      0x0013: PHI (r0v3 int) = (r0v2 int), (r0v5 int) binds: [B:21:0x002b, B:9:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(boolean r2, int r3, int r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            r1.LLILLJJLI = r2
            if (r5 != 0) goto L14
            boolean r0 = X.C444960Hcc.LIZIZ()
            if (r0 == 0) goto L25
            int r0 = r1.getMaxScrollX()
            if (r3 > 0) goto L2e
            int r0 = -r0
            if (r3 >= r0) goto L14
        L13:
            r3 = r0
        L14:
            if (r6 != 0) goto L1d
            int r0 = r1.getMaxScrollY()
            if (r4 >= 0) goto L21
            r4 = 0
        L1d:
            r1.scrollTo(r3, r4)
            return
        L21:
            if (r4 <= r0) goto L1d
            r4 = r0
            goto L1d
        L25:
            int r0 = r1.getMaxScrollX()
            if (r3 < 0) goto L2e
            if (r3 <= r0) goto L14
            goto L13
        L2e:
            r3 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12TH.LJI(boolean, int, int, boolean, boolean):void");
    }
}
