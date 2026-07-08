package X;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0R0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewTreeObserverOnPreDrawListenerC688950R0r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public static final /* synthetic */ int LLILZ = 0;
    public final View LL;
    public final Function1<Function0<Unit>, Boolean> LLILLJJLI;
    public ViewTreeObserver LLILLL;

    public final void LIZ() {
        if (this.LLILLL.isAlive()) {
            C786410Ut5.D3(this.LLILLL, this);
        } else {
            C786410Ut5.D3(this.LL.getViewTreeObserver(), this);
        }
        this.LL.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        return this.LLILLJJLI.invoke(new AwS554S0100000_10(this, 925)).booleanValue();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.LLILLL = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        LIZ();
    }

    public ViewTreeObserverOnPreDrawListenerC688950R0r(View view, Function1 function1) {
        this.LL = view;
        this.LLILLJJLI = function1;
        this.LLILLL = view.getViewTreeObserver();
    }
}
