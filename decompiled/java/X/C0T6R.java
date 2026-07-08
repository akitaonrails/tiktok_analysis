package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0T6R, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T6R implements View.OnAttachStateChangeListener {
    public final View LL;
    public final Function1<View, Unit> LLILLJJLI;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.LL.removeOnAttachStateChangeListener(this);
        this.LLILLJJLI.invoke(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0T6R(View view, Function1<? super View, Unit> function1) {
        this.LL = view;
        this.LLILLJJLI = function1;
    }
}
