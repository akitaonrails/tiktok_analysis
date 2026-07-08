package X;

import Y.ALAdapterS21S0200000_27;
import Y.AUListenerS275S0100000_27;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0xta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836680xta extends FrameLayout {
    public ValueAnimator LL;
    public boolean LLILLJJLI;
    public EnumC1216890hlv LLILLL;
    public int LLILZ;
    public View LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;

    private final boolean getCollapsedOrCollapsing() {
        return this.LLILLJJLI || this.LLILLL == EnumC1216890hlv.LLILLJJLI;
    }

    public final void LJ() {
        if (this.LLIZ || this.LLILZLL != 0) {
            ValueAnimator valueAnimator = this.LL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.LL = null;
            this.LLIZ = false;
            int i = this.LLILZLL;
            if (i > 0) {
                this.LLILZ = i;
                this.LLILZLL = 0;
            }
            View view = this.LLILZIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        }
    }

    public static void LIZ(C1836680xta c1836680xta) {
        View viewFindViewById;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        c1836680xta.LJ();
        if ((c1836680xta.LLILLJJLI && c1836680xta.LL == null) || (viewFindViewById = c1836680xta.findViewById(R.id.oe5)) == null) {
            return;
        }
        viewFindViewById.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = viewFindViewById.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = c1836680xta.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams.width;
        } else {
            i = 0;
        }
        List listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(c1836680xta.LLILZ), Integer.valueOf(i), Integer.valueOf(c1836680xta.getMeasuredWidth()), Integer.valueOf(measuredWidth + c1836680xta.getPaddingLeft() + c1836680xta.getPaddingRight()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIIJJI) {
            if (((Number) obj).intValue() > 0) {
                arrayList.add(obj);
            }
        }
        Integer num = (Integer) C13LP.LJJLIIIJLJLI(arrayList);
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        c1836680xta.LLILZ = iIntValue;
        int paddingLeft = c1836680xta.getPaddingLeft() + c1836680xta.getPaddingRight() + c1836680xta.LIZLLL(20);
        if (paddingLeft > iIntValue) {
            paddingLeft = iIntValue;
        }
        Integer numValueOf = Integer.valueOf(c1836680xta.getMeasuredWidth());
        if (numValueOf.intValue() > 0) {
            iIntValue = numValueOf.intValue();
        }
        if (iIntValue <= paddingLeft) {
            c1836680xta.LIZJ(paddingLeft);
            c1836680xta.LLILLL = EnumC1216890hlv.LL;
            c1836680xta.LLILLJJLI = true;
        } else {
            c1836680xta.LLILLL = EnumC1216890hlv.LLILLJJLI;
            c1836680xta.LJFF(iIntValue, paddingLeft, 300L, new AwS571S0100000_27(c1836680xta, 609));
        }
    }

    public static void LIZIZ(C1836680xta c1836680xta) {
        int iIntValue;
        c1836680xta.LJ();
        if (!c1836680xta.getCollapsedOrCollapsing() && c1836680xta.LL == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(c1836680xta.LLILZ);
        if (numValueOf.intValue() <= 0 || 1 == 0) {
            return;
        }
        int iIntValue2 = numValueOf.intValue();
        Integer numValueOf2 = Integer.valueOf(c1836680xta.getMeasuredWidth());
        if (numValueOf2.intValue() > 0) {
            iIntValue = numValueOf2.intValue();
        } else {
            iIntValue = iIntValue2;
        }
        c1836680xta.LLILLJJLI = false;
        c1836680xta.LLILLL = EnumC1216890hlv.LLILLL;
        if (iIntValue >= iIntValue2) {
            c1836680xta.LIZJ(iIntValue2);
            c1836680xta.LLILLL = EnumC1216890hlv.LL;
            c1836680xta.LLILLJJLI = false;
            return;
        }
        c1836680xta.LJFF(iIntValue, iIntValue2, 300L, new AwS571S0100000_27(c1836680xta, 610));
    }

    public final void LIZJ(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.width = i;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(marginLayoutParams);
        }
    }

    public final int LIZLLL(int i) {
        return (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public C1836680xta(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = EnumC1216890hlv.LL;
        setClipChildren(true);
        setClipToPadding(true);
        setBackgroundResource(R.drawable.cr2);
        int iLIZLLL = LIZLLL(10);
        int iLIZLLL2 = LIZLLL(6);
        setPadding(iLIZLLL, iLIZLLL2, iLIZLLL, iLIZLLL2);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f895dmt, this, true);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.oe5);
        if (linearLayout != null) {
            linearLayout.setOrientation(0);
            linearLayout.setBaselineAligned(false);
            linearLayout.setGravity(16);
            int iLIZLLL3 = LIZLLL(20);
            int iLIZLLL4 = LIZLLL(1);
            int iLIZLLL5 = LIZLLL(10);
            C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(iLIZLLL3 + iLIZLLL5 + iLIZLLL4 + iLIZLLL5 + iLIZLLL3, -2));
            TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.khq);
            if (tuxIconView != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iLIZLLL3, iLIZLLL3);
                layoutParams.weight = 0.0f;
                layoutParams.setMarginEnd(iLIZLLL5);
                C786410Ut5.M6(tuxIconView, layoutParams);
                tuxIconView.setMinimumWidth(iLIZLLL3);
                tuxIconView.setMinimumHeight(iLIZLLL3);
            }
            TuxIconView tuxIconView2 = (TuxIconView) findViewById(R.id.khs);
            if (tuxIconView2 != null) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iLIZLLL4, iLIZLLL3);
                layoutParams2.weight = 0.0f;
                C786410Ut5.M6(tuxIconView2, layoutParams2);
                tuxIconView2.setMinimumWidth(iLIZLLL4);
                tuxIconView2.setMinimumHeight(iLIZLLL3);
            }
            TuxIconView tuxIconView3 = (TuxIconView) findViewById(R.id.khp);
            if (tuxIconView3 != null) {
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iLIZLLL3, iLIZLLL3);
                layoutParams3.weight = 0.0f;
                layoutParams3.setMarginStart(iLIZLLL5);
                C786410Ut5.M6(tuxIconView3, layoutParams3);
                tuxIconView3.setMinimumWidth(iLIZLLL3);
                tuxIconView3.setMinimumHeight(iLIZLLL3);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View viewFindViewById = findViewById(R.id.oe5);
        if (viewFindViewById == null) {
            super.onMeasure(i, i2);
            return;
        }
        viewFindViewById.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || (measuredWidth = marginLayoutParams.width) <= 0) {
            measuredWidth = viewFindViewById.getMeasuredWidth() + getPaddingLeft() + getPaddingRight();
        }
        int iResolveSize = FrameLayout.resolveSize(measuredWidth, i);
        setMeasuredDimension(iResolveSize, FrameLayout.resolveSize(getPaddingTop() + getPaddingBottom() + viewFindViewById.getMeasuredHeight(), i2));
        if (!this.LLILLJJLI && this.LLILLL != EnumC1216890hlv.LLILLJJLI && iResolveSize > 0 && !this.LLIZ) {
            this.LLILZ = iResolveSize;
        }
    }

    public final void LJFF(int i, int i2, long j, Function0<Unit> function0) {
        ValueAnimator valueAnimator = this.LL;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS275S0100000_27(this, 7));
        valueAnimatorOfInt.addListener(new ALAdapterS21S0200000_27(this, function0, 0));
        this.LL = valueAnimatorOfInt;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        valueAnimatorOfInt.start();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.oe5);
        if (linearLayout == null) {
            return;
        }
        C786410Ut5.Mc(linearLayout, 0.0f);
        C786410Ut5.hd(linearLayout, 0.0f);
        int measuredWidth = linearLayout.getMeasuredWidth();
        int measuredHeight = linearLayout.getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            int paddingTop = getPaddingTop() + ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - measuredHeight) / 2);
            int i5 = measuredHeight + paddingTop;
            if (getLayoutDirection() == 1) {
                int paddingStart = getPaddingStart();
                linearLayout.layout(paddingStart, paddingTop, measuredWidth + paddingStart, i5);
            } else {
                int width = (getWidth() - getPaddingRight()) - measuredWidth;
                linearLayout.layout(width, paddingTop, measuredWidth + width, i5);
            }
        }
    }
}
