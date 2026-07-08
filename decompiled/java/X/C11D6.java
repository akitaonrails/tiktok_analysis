package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11D6, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11D6 implements View.OnAttachStateChangeListener {
    public final Function1<RecyclerView, Unit> LL = null;
    public final Function1<RecyclerView, Unit> LLILLJJLI = null;
    public RecyclerView LLILLL;

    public C11D6(int i) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.LLILLL = (RecyclerView) view;
        Function1<RecyclerView, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(view);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.LLILLL = null;
        Function1<RecyclerView, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(view);
        }
    }
}
