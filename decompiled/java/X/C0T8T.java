package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0T8T, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T8T extends FrameLayout {
    public Function1<? super Integer, Boolean> LL;

    public C0T8T(Context context) {
        this(context, null, 6);
    }

    public C0T8T(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final Function1<Integer, Boolean> getChildListCanVerticalScrollCallback() {
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

    public final void setChildListCanVerticalScrollCallback(Function1<? super Integer, Boolean> function1) {
        this.LL = function1;
    }

    public C0T8T(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
