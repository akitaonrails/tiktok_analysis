package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GnQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426180GnQ extends ViewGroup {
    public boolean LL;
    public View.OnClickListener LLILLJJLI;
    public Function1<? super List<Integer>, Unit> LLILLL;
    public String LLILZ;
    public List<Integer> LLILZIL;
    public final C16F5 LLILZLL;
    public final C426160GnO LLIZ;

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        for (int childCount = this.LLIZ.getChildCount() - 1; -1 < childCount; childCount--) {
            if (this.LLIZ.getChildAt(childCount) != this.LLILZLL) {
                C426160GnO c426160GnO = this.LLIZ;
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c426160GnO, null);
                c426160GnO.removeViewAt(childCount);
            }
        }
        C13BV c13bv = C13BV.INSTANCE;
        this.LLILZIL = c13bv;
        this.LLILZ = null;
        Function1<? super List<Integer>, Unit> function1 = this.LLILLL;
        if (function1 != null) {
            function1.invoke(c13bv);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.LL) {
            return;
        }
        super.requestLayout();
    }

    public final List<Integer> getHiddenIndices() {
        return this.LLILZIL;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void setOnOverflowStateChangedListener(Function1<? super List<Integer>, Unit> function1) {
        this.LLILLL = function1;
        this.LLILZ = null;
    }

    public final void setOnPlusNClickListener(View.OnClickListener onClickListener) {
        this.LLILLJJLI = onClickListener;
        C786410Ut5.l8(this.LLILZLL, onClickListener);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public C426180GnQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZIL = C13BV.INSTANCE;
        C16F5 c16f5 = new C16F5(context, null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C497740JfY.LIZIZ(20));
        gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.exb, context));
        c16f5.setBackground(gradientDrawable);
        c16f5.setPadding(C439101nJ.LIZ(12), C439101nJ.LIZ(6), C439101nJ.LIZ(12), C439101nJ.LIZ(6));
        c16f5.setTextSize(12.0f);
        c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.c9j, context));
        c16f5.setGravity(17);
        c16f5.setMinWidth(C439101nJ.LIZ(48));
        c16f5.setIncludeFontPadding(false);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.topMargin = C439101nJ.LIZ(4);
        marginLayoutParams.bottomMargin = C439101nJ.LIZ(2);
        C786410Ut5.y6(c16f5, marginLayoutParams);
        this.LLILZLL = c16f5;
        C426160GnO c426160GnO = new C426160GnO(context, null, 6);
        c426160GnO.setGravity(-1);
        c426160GnO.setMaxTagLines(2);
        c426160GnO.LLJI = c16f5;
        c426160GnO.addView(c16f5);
        c426160GnO.setShowMore(true);
        this.LLIZ = c426160GnO;
        super.addView(c426160GnO, -1, new ViewGroup.LayoutParams(-1, -2));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredHeight;
        this.LLIZ.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), this.LLIZ.getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), this.LLIZ.getLayoutParams().height));
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            measuredWidth = View.MeasureSpec.getSize(i);
        } else {
            measuredWidth = this.LLIZ.getMeasuredWidth() + getPaddingLeft() + getPaddingRight();
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            measuredHeight = View.MeasureSpec.getSize(i2);
        } else {
            measuredHeight = this.LLIZ.getMeasuredHeight() + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Drawable drawableMutate;
        Drawable.ConstantState constantState;
        Drawable drawableNewDrawable;
        if (view == this.LLIZ) {
            super.addView(view, i, layoutParams);
            return;
        }
        if (view == null) {
            return;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            C16F5 c16f5 = this.LLILZLL;
            Drawable background = textView.getBackground();
            if (background != null && (constantState = background.getConstantState()) != null && (drawableNewDrawable = constantState.newDrawable()) != null) {
                drawableMutate = drawableNewDrawable.mutate();
            } else {
                drawableMutate = null;
            }
            c16f5.setBackground(drawableMutate);
            this.LLILZLL.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
            this.LLILZLL.setTextSize(textView.getTextSize() / getResources().getDisplayMetrics().scaledDensity);
            this.LLILZLL.setTextColor(textView.getCurrentTextColor());
            C16F5 c16f52 = this.LLILZLL;
            C444890HcV c444890HcV = new C444890HcV();
            c444890HcV.LIZ(102);
            c16f52.setTypeface(c444890HcV.getTypeface());
            this.LLILZLL.setGravity(17);
            this.LLILZLL.setIncludeFontPadding(textView.getIncludeFontPadding());
            this.LLILZLL.setMinHeight(textView.getMinHeight());
        }
        this.LLIZ.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        String strLIZIZ;
        boolean z2;
        String string;
        this.LLIZ.layout(getPaddingLeft(), getPaddingTop(), getPaddingLeft() + this.LLIZ.getMeasuredWidth(), getPaddingTop() + this.LLIZ.getMeasuredHeight());
        ArrayList arrayList = new ArrayList();
        int childCount = this.LLIZ.getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = this.LLIZ.getChildAt(i6);
            if (childAt != this.LLILZLL && childAt.getVisibility() != 8) {
                if (childAt.getWidth() == 0 && childAt.getHeight() == 0) {
                    arrayList.add(Integer.valueOf(i5));
                }
                i5++;
            }
        }
        this.LLILZIL = C13LP.LLIIII(arrayList);
        int size = arrayList.size();
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        if (!Intrinsics.LJFF(this.LLILZ, strLJJLIIIJ)) {
            this.LLILZ = strLJJLIIIJ;
            Function1<? super List<Integer>, Unit> function1 = this.LLILLL;
            if (function1 != null) {
                function1.invoke(arrayList);
            }
        }
        if (size > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('+');
            sbLIZ.append(size);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        C16F5 c16f5 = this.LLILZLL;
        if (size > 0 && this.LLILLJJLI != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        c16f5.setClickable(z2);
        CharSequence text = this.LLILZLL.getText();
        if (text != null) {
            string = text.toString();
        } else {
            string = null;
        }
        if (!Intrinsics.LJFF(string, strLIZIZ)) {
            this.LL = true;
            try {
                this.LLILZLL.setText(strLIZIZ);
                this.LL = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LL = false;
                throw th;
            }
        }
    }
}
