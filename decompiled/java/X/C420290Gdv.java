package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gdv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420290Gdv extends LinearLayout {
    public boolean LL;
    public ViewGroup LLILLJJLI;
    public ViewGroup LLILLL;
    public TuxTextView LLILZ;
    public GradientDrawable LLILZIL;
    public boolean LLILZLL;

    public final void LIZ(EnumC429230GsL enumC429230GsL) {
        int i;
        if (this.LL) {
            return;
        }
        this.LL = true;
        int i2 = C420300Gdw.LIZ[enumC429230GsL.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = R.layout.d6k;
            } else {
                throw new C1954807lC();
            }
        } else {
            i = R.layout.d6l;
        }
        LinearLayout.inflate(getContext(), i, this);
        setOrientation(1);
        this.LLILZ = (TuxTextView) findViewById(R.id.gw9);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.gw5);
        this.LLILLL = viewGroup;
        GradientDrawable gradientDrawable = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        ViewGroup viewGroup2 = this.LLILLL;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        viewGroup.setBackground(c384050F3z.LIZ(viewGroup2.getContext()));
        this.LLILLJJLI = (ViewGroup) findViewById(R.id.gw6);
        ViewGroup viewGroup3 = this.LLILLL;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        Drawable background = viewGroup3.getBackground();
        if (background instanceof GradientDrawable) {
            gradientDrawable = (GradientDrawable) background;
        }
        this.LLILZIL = gradientDrawable;
    }

    public final void LIZIZ(boolean z) {
        GradientDrawable gradientDrawable;
        if (z) {
            this.LLILZLL = true;
            GradientDrawable gradientDrawable2 = this.LLILZIL;
            if (gradientDrawable2 != null) {
                gradientDrawable2.mutate();
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zs, getContext());
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                GradientDrawable gradientDrawable3 = this.LLILZIL;
                if (gradientDrawable3 != null) {
                    gradientDrawable3.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), iIntValue);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.LLILZLL || (gradientDrawable = this.LLILZIL) == null) {
            return;
        }
        gradientDrawable.setStroke(0, 0);
    }

    public final void setContentFieldView(View view) {
        ViewGroup viewGroup = this.LLILLL;
        ViewGroup viewGroup2 = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.LJJJJI(viewGroup);
        ViewGroup viewGroup3 = this.LLILLL;
        if (viewGroup3 != null) {
            viewGroup2 = viewGroup3;
        }
        viewGroup2.addView(view);
    }

    public final void setFooterFieldView(View view) {
        ViewGroup viewGroup = this.LLILLJJLI;
        ViewGroup viewGroup2 = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.LJJJJI(viewGroup);
        ViewGroup viewGroup3 = this.LLILLJJLI;
        if (viewGroup3 != null) {
            viewGroup2 = viewGroup3;
        }
        viewGroup2.addView(view);
    }

    public final void setTitleText(CharSequence charSequence) {
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(charSequence);
    }

    public final void setTitleTextFont(int i) {
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setTuxFont(i);
    }

    public final void setTitleTextMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TuxTextView tuxTextView = this.LLILZ;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
            TuxTextView tuxTextView3 = this.LLILZ;
            if (tuxTextView3 != null) {
                tuxTextView2 = tuxTextView3;
            }
            C786410Ut5.R6(tuxTextView2, marginLayoutParams);
        }
    }

    public C420290Gdv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
