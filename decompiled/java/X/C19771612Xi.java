package X;

import Y.ACListenerS163S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Xi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19771612Xi extends FrameLayout {
    public int LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public InterfaceC19771712Xj LLIZ;
    public final View LLIZLLLIL;
    public final LinearLayout LLJ;
    public final ValueAnimator LLJI;
    public final ACListenerS163S0100000_29 LLJIJIL;

    public final LinearLayout getContainer() {
        return this.LLJ;
    }

    public final int getItemTextNormalColor() {
        return this.LLILZIL;
    }

    public final int getItemTextSelectColor() {
        return this.LLILZLL;
    }

    public final float getItemTextSize() {
        return this.LLILZ;
    }

    public final void LIZ(String str) {
        TextView textView = (TextView) C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ekb, this.LLJ, false);
        textView.setText(str);
        textView.setTextSize(0, this.LLILZ);
        textView.setTextColor(this.LLILZIL);
        C786410Ut5.T7(textView, this.LLJIJIL);
        this.LLJ.addView(textView);
    }

    public final void setCurrentItem(int i) {
        InterfaceC19771712Xj interfaceC19771712Xj;
        if (i != this.LL && (interfaceC19771712Xj = this.LLIZ) != null) {
            interfaceC19771712Xj.LIZ(i);
        }
        this.LL = i;
        LIZIZ(this.LLILZLL, this.LLJ.getChildAt(i));
    }

    public final void setItemTextNormalColor(int i) {
        this.LLILZIL = i;
    }

    public final void setItemTextSelectColor(int i) {
        this.LLILZLL = i;
    }

    public final void setItemTextSize(float f) {
        this.LLILZ = f;
    }

    public final void setOnItemChangeListener(InterfaceC19771712Xj interfaceC19771712Xj) {
        this.LLIZ = interfaceC19771712Xj;
    }

    public final void setSelectedItemBackground(Drawable drawable) {
        this.LLIZLLLIL.setBackground(drawable);
    }

    public C19771612Xi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = -1;
        View view = new View(context);
        C786410Ut5.W5(view, new FrameLayout.LayoutParams(-1, -1));
        this.LLIZLLLIL = view;
        LinearLayout linearLayout = new LinearLayout(context);
        C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        this.LLJ = linearLayout;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 38));
        this.LLJI = valueAnimatorOfFloat;
        this.LLJIJIL = new ACListenerS163S0100000_29(this, 69);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.DMTBgAnimRadioGroup, 0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.DMTBgAnimRadioGroup_item_background);
        this.LLILZ = typedArrayObtainStyledAttributes.getDimension(R$styleable.DMTBgAnimRadioGroup_item_textSize, 0.0f);
        this.LLILZIL = typedArrayObtainStyledAttributes.getColor(R$styleable.DMTBgAnimRadioGroup_item_normal_textColor, 0);
        this.LLILZLL = typedArrayObtainStyledAttributes.getColor(R$styleable.DMTBgAnimRadioGroup_item_select_textColor, -1);
        typedArrayObtainStyledAttributes.recycle();
        view.setBackground(drawable);
        addView(view);
        addView(linearLayout);
    }

    public final void LIZIZ(int i, View view) {
        if (view != null && (view instanceof TextView) && this.LLILZLL != -1) {
            ((TextView) view).setTextColor(i);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureChild(this.LLIZLLLIL, View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()) / this.LLJ.getChildCount(), Integer.MIN_VALUE), i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View childAt = this.LLJ.getChildAt(this.LL);
        if (childAt != null) {
            C786410Ut5.Fd(this.LLIZLLLIL, childAt.getX());
        }
    }
}
