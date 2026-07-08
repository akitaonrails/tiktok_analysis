package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06Xp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1624306Xp extends ConstraintLayout {
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public ObjectAnimator LLILZ;

    public C1624306Xp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1624306Xp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Sd(R.layout.hfu, C786410Ut5.ne(context), this);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ != null) {
            gradientDrawable.setColor(numLIZJ.intValue());
        }
        setBackground(gradientDrawable);
        this.LL = (TuxIconView) findViewById(R.id.awd);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.awf);
        this.LLILLL = (TuxTextView) findViewById(R.id.awa);
    }
}
