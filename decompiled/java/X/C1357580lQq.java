package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357580lQq extends RelativeLayout {
    public final Context LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    public final int getDescId() {
        return R.id.tjq;
    }

    public final int getImageId() {
        return R.id.tjs;
    }

    private final RelativeLayout getMContentView() {
        return (RelativeLayout) this.LLILLL.getValue();
    }

    private final TuxTextView getMDescTextView() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    private final ImageView getMImageView() {
        return (ImageView) this.LLILZIL.getValue();
    }

    public final View getMRootView() {
        return (View) this.LLILLJJLI.getValue();
    }

    public final ViewGroup.LayoutParams getDescViewParams() {
        return getMDescTextView().getLayoutParams();
    }

    public final ViewGroup.LayoutParams getImageViewParams() {
        return getMImageView().getLayoutParams();
    }

    public final ViewGroup.LayoutParams getTagViewParams() {
        return getMContentView().getLayoutParams();
    }

    public final void LIZ(C1357510lQj c1357510lQj) {
        if (TextUtils.isEmpty(c1357510lQj.LIZ)) {
            return;
        }
        getMDescTextView().setText(c1357510lQj.LIZ);
        Integer num = c1357510lQj.LIZIZ;
        if (num != null) {
            getMDescTextView().setTextColor(num.intValue());
        }
        Integer num2 = c1357510lQj.LIZJ;
        if (num2 != null) {
            getMDescTextView().setTuxFont(num2.intValue());
        }
        if (c1357510lQj.LIZLLL != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            Integer num3 = c1357510lQj.LIZLLL;
            if (num3 != null) {
                gradientDrawable.setColor(num3.intValue());
            }
            Float f = c1357510lQj.LJ;
            if (f != null) {
                gradientDrawable.setCornerRadius(f.floatValue());
            }
            getMContentView().setBackground(gradientDrawable);
        }
    }

    public C1357580lQq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = context;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1467));
        this.LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1464));
        this.LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1465));
        this.LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1466));
    }
}
