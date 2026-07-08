package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import wh6.AbS699S0100000_18;

/* JADX INFO: renamed from: X.0hDj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195690hDj extends FrameLayout {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;
    public final TuxIconView LLJILJILJ;
    public final SmartImageView LLJILLL;
    public final TuxTextView LLJJ;
    public final TuxTextView LLJJI;
    public final LinearLayout LLJJIII;
    public Function1<? super C1195690hDj, Unit> LLJJIJI;

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
    }

    private final GradientDrawable getContainerBackground() {
        Drawable background = this.LLJJIII.getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    public final void LIZ() {
        this.LLJJI.setTextColor(this.LLIZLLLIL);
        this.LLJJI.setTuxFont(this.LLJI);
        if (isSelected()) {
            GradientDrawable containerBackground = getContainerBackground();
            if (containerBackground != null) {
                containerBackground.setColor(this.LLILLJJLI);
                containerBackground.setStroke(this.LLJ, this.LLILLL);
            }
            this.LLJJ.setTextColor(this.LLILZIL);
            this.LLJJ.setTuxFont(this.LLJIJIL);
            return;
        }
        GradientDrawable containerBackground2 = getContainerBackground();
        if (containerBackground2 != null) {
            containerBackground2.setColor(this.LL);
            int i = this.LLILZ;
            if (i != 0) {
                containerBackground2.setStroke(this.LLJ, i);
            } else {
                containerBackground2.setStroke(0, 0);
            }
        }
        this.LLJJ.setTextColor(this.LLILZLL);
        this.LLJJ.setTuxFont(this.LLJILJIL);
    }

    public final Function1<C1195690hDj, Unit> getClickListener() {
        return this.LLJJIJI;
    }

    public final void setClickListener(Function1<? super C1195690hDj, Unit> function1) {
        this.LLJJIJI = function1;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        LIZ();
    }

    public C1195690hDj(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.fs, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.IconTagView);
        int i = R$styleable.IconTagView_unSelectedBackgroundColor;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LL = typedArrayObtainStyledAttributes.getColor(i, iIntValue);
        int i2 = R$styleable.IconTagView_selectedBackgroundColor;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getColor(i2, iIntValue2);
        this.LLILLL = typedArrayObtainStyledAttributes.getColor(R$styleable.IconTagView_selectStrokeColor, 0);
        this.LLILZ = typedArrayObtainStyledAttributes.getColor(R$styleable.IconTagView_unSelectStrokeColor, 0);
        int i3 = R$styleable.IconTagView_selectTextColor;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        this.LLILZIL = typedArrayObtainStyledAttributes.getColor(i3, iIntValue3);
        int i4 = R$styleable.IconTagView_unSelectTextColor;
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ4 != null) {
            iIntValue4 = numLIZJ4.intValue();
        } else {
            iIntValue4 = 0;
        }
        this.LLILZLL = typedArrayObtainStyledAttributes.getColor(i4, iIntValue4);
        int i5 = R$styleable.IconTagView_startIconTintColor;
        Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.a01, context);
        if (numLIZJ5 != null) {
            iIntValue5 = numLIZJ5.intValue();
        } else {
            iIntValue5 = 0;
        }
        this.LLIZ = typedArrayObtainStyledAttributes.getColor(i5, iIntValue5);
        int i6 = R$styleable.IconTagView_rightTextColor;
        Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.a1k, context);
        if (numLIZJ6 != null) {
            iIntValue6 = numLIZJ6.intValue();
        } else {
            iIntValue6 = 0;
        }
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getColor(i6, iIntValue6);
        this.LLJI = typedArrayObtainStyledAttributes.getColor(R$styleable.IconTagView_rightTextFont, 51);
        this.LLJIJIL = typedArrayObtainStyledAttributes.getInt(R$styleable.IconTagView_selectTextFont, 51);
        this.LLJILJIL = typedArrayObtainStyledAttributes.getInt(R$styleable.IconTagView_unSelectTextFont, 51);
        this.LLJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.IconTagView_strokeWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.LLJILJILJ = (TuxIconView) findViewById(R.id.k4e);
        this.LLJILLL = (SmartImageView) findViewById(R.id.k4f);
        this.LLJJ = (TuxTextView) findViewById(R.id.k4g);
        this.LLJJI = (TuxTextView) findViewById(R.id.k4h);
        findViewById(R.id.k4i);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.k4k);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(6));
        linearLayout.setBackground(gradientDrawable);
        this.LLJJIII = linearLayout;
        C786410Ut5.I7(new AbS699S0100000_18(this, 36, 42), this);
    }
}
