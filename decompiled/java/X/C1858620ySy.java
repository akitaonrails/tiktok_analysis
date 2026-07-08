package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0ySy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858620ySy extends TuxTextView {
    public final ObjectAnimator LLJJJJ;
    public C1858640yT0 LLJJJJJIL;
    public ValueAnimator LLJJJJLIIL;

    public C1858620ySy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final void setCurrentStatus(int i) {
        this.LLJJJJJIL.LIZ = i;
    }

    private final void setCurrentText(String str) {
        this.LLJJJJJIL.LIZJ = str;
    }

    public final void LJJJJJ(CharSequence charSequence) {
        this.LLJJJJJIL.LIZJ = charSequence;
        setCurrentStatus(3);
    }

    public final void LJJJJL(CharSequence charSequence) {
        this.LLJJJJJIL.LIZJ = charSequence;
        setCurrentStatus(1);
    }

    public C1858620ySy(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<C1858620ySy, Float>) View.ALPHA, 1.0f, 0.0f, 1.0f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setDuration(1000L);
        this.LLJJJJ = objectAnimatorOfFloat;
        this.LLJJJJJIL = new C1858640yT0(0, 0, "");
    }
}
