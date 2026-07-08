package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.038S, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C038S extends FrameLayout {
    public Function1<? super Integer, Boolean> LL;

    public final Function1<Integer, Boolean> getCanVerticalScrollCallback() {
        return this.LL;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        Function1<? super Integer, Boolean> function1 = this.LL;
        if (function1 == null) {
            return super.canScrollVertically(i);
        }
        return function1.invoke(Integer.valueOf(i)).booleanValue();
    }

    public final void setCanVerticalScrollCallback(Function1<? super Integer, Boolean> function1) {
        this.LL = function1;
    }

    public C038S(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
