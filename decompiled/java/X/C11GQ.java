package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.11GQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11GQ extends TuxTextView {
    public final C11GS LLJJJJ;

    public C11GQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final void setCurrentStatus(int i) {
        getClass();
    }

    private final void setCurrentText(String str) {
        getClass();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.11GS] */
    public C11GQ(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setTextAlignment(5);
        setGravity(8388611);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<C11GQ, Float>) View.ALPHA, 1.0f, 0.0f, 1.0f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setDuration(1000L);
        this.LLJJJJ = new Object() { // from class: X.11GS
        };
    }
}
