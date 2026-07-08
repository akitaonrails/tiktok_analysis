package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0eVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091650eVv extends ConstraintLayout {
    public final int LL;
    public final float LLILLJJLI;
    public final float LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;

    private final C16F5 getActionView() {
        return (C16F5) this.LLIZLLLIL.getValue();
    }

    private final C16F5 getTopicView() {
        return (C16F5) this.LLIZ.getValue();
    }

    public C1091650eVv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        GradientDrawable gradientDrawable;
        GradientDrawable gradientDrawable2;
        getTopicView().setTextSize(1, this.LLILLJJLI);
        getActionView().setTextSize(1, this.LLILLJJLI);
        int i3 = this.LLILZLL;
        setPadding(getPaddingLeft(), i3, getPaddingRight(), i3);
        super.onMeasure(i, i2);
        if (getActionView().getMeasuredWidth() > this.LL || getTopicView().getLineCount() > 2) {
            getActionView().setTextSize(1, this.LLILLL);
            getTopicView().setTextSize(1, this.LLILLL);
            super.onMeasure(i, i2);
        }
        if (getTopicView().getLineCount() > 2) {
            Drawable background = getBackground();
            if ((background instanceof GradientDrawable) && (gradientDrawable2 = (GradientDrawable) background) != null) {
                gradientDrawable2.setCornerRadius(C439101nJ.LIZ(20));
            }
        } else {
            Drawable background2 = getBackground();
            if ((background2 instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background2) != null) {
                gradientDrawable.setCornerRadius(getMeasuredHeight() / 2.0f);
            }
        }
        if (C500260Jjc.LJJJJIZL(getActionView())) {
            if (getTopicView().getLineCount() == 1) {
                setMeasuredDimension(getMeasuredWidth(), this.LLILZIL);
            }
        } else {
            if (getTopicView().getLineCount() != 1) {
                return;
            }
            setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
            super.onMeasure(getMeasuredWidth(), View.MeasureSpec.makeMeasureSpec(this.LLILZ, 1073741824));
        }
    }

    public C1091650eVv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C439101nJ.LIZ(64);
        this.LLILLJJLI = 13.0f;
        this.LLILLL = 12.0f;
        this.LLILZ = C439101nJ.LIZ(34);
        this.LLILZIL = C439101nJ.LIZ(40);
        this.LLILZLL = C439101nJ.LIZ(6);
        this.LLIZ = C292401Bi.LIZ(new AwS561S0100000_17(this, 96));
        this.LLIZLLLIL = C292401Bi.LIZ(new AwS561S0100000_17(this, 95));
        ViewGroup.inflate(context, R.layout.hui, this);
    }
}
