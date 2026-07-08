package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gY8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169900gY8 extends FrameLayout {
    public Function0<Boolean> LL;

    public final Function0<Boolean> getOnBackPressedPreIme() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        Function0<Boolean> function0;
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (function0 = this.LL) != null && function0.invoke().booleanValue()) {
            return true;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public final void setOnBackPressedPreIme(Function0<Boolean> function0) {
        this.LL = function0;
    }

    public C1169900gY8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
