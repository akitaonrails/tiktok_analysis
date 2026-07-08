package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420260Gds extends LinearLayout {
    public final ViewGroup LL;
    public final ViewGroup LLILLJJLI;
    public final TuxTextView LLILLL;
    public final GradientDrawable LLILZ;
    public boolean LLILZIL;

    public final void LIZ(boolean z) {
        GradientDrawable gradientDrawable;
        if (z) {
            this.LLILZIL = true;
            GradientDrawable gradientDrawable2 = this.LLILZ;
            if (gradientDrawable2 != null) {
                gradientDrawable2.mutate();
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zs, getContext());
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                GradientDrawable gradientDrawable3 = this.LLILZ;
                if (gradientDrawable3 != null) {
                    gradientDrawable3.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), iIntValue);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.LLILZIL || (gradientDrawable = this.LLILZ) == null) {
            return;
        }
        gradientDrawable.setStroke(0, 0);
    }

    public final void setContentFieldView(View view) {
        C786410Ut5.LJJJJI(this.LLILLJJLI);
        this.LLILLJJLI.addView(view);
    }

    public final void setFooterFieldView(View view) {
        C786410Ut5.LJJJJI(this.LL);
        this.LL.addView(view);
    }

    public final void setTitleText(CharSequence charSequence) {
        this.LLILLL.setText(charSequence);
    }

    public C420260Gds(Context context, AttributeSet attributeSet) {
        GradientDrawable gradientDrawable;
        super(context, attributeSet, 0);
        LinearLayout.inflate(context, R.layout.d6m, this);
        setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        this.LLILLL = (TuxTextView) findViewById(R.id.gw9);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.gw5);
        this.LLILLJJLI = viewGroup;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bv);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        viewGroup.setBackground(c384050F3z.LIZ(viewGroup.getContext()));
        this.LL = (ViewGroup) findViewById(R.id.gw6);
        Drawable background = viewGroup.getBackground();
        if (background instanceof GradientDrawable) {
            gradientDrawable = (GradientDrawable) background;
        } else {
            gradientDrawable = null;
        }
        this.LLILZ = gradientDrawable;
    }
}
