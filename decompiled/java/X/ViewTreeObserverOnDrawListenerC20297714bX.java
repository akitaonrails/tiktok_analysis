package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.14bX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class ViewTreeObserverOnDrawListenerC20297714bX extends C088V implements Application.ActivityLifecycleCallbacks, ViewTreeObserver.OnDrawListener, ViewTreeObserver.OnGlobalFocusChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, View.OnAttachStateChangeListener, View.OnLayoutChangeListener {
    public Field LLILLJJLI;
    public long LLILLL;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        LIZ("onDraw");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        LIZ("onGlobalLayout");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        LIZ("onPreDraw");
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        LIZ("onScrollChanged");
    }

    public final void LIZ(String str) {
        if (this.LL != null && System.currentTimeMillis() - this.LLILLL > 1000) {
            C088C.LIZ();
            this.LLILLL = System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyCallback form method = ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            AnonymousClass0888.LIZ();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        LIZ("onActivityDestroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        LIZ("onActivityPaused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        LIZ("onActivityResumed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.LLILLJJLI == null) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
            C786410Ut5.w3(viewTreeObserver, this);
            viewTreeObserver.addOnGlobalFocusChangeListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
            C2187701Ajg.LIZ(viewTreeObserver, this, ViewTreeObserver.OnGlobalLayoutListener.class);
            viewTreeObserver.addOnPreDrawListener(this);
            C2187701Ajg.LIZ(viewTreeObserver, this, ViewTreeObserver.OnPreDrawListener.class);
            viewTreeObserver.addOnScrollChangedListener(this);
            C2187701Ajg.LIZ(viewTreeObserver, this, ViewTreeObserver.OnScrollChangedListener.class);
            viewTreeObserver.addOnTouchModeChangeListener(this);
            decorView.addOnAttachStateChangeListener(this);
            decorView.addOnLayoutChangeListener(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        LIZ("onActivityStopped");
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        LIZ("onTouchModeChanged");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        LIZ("onViewAttachedToWindow");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        LIZ("onViewDetachedFromWindow");
    }

    public ViewTreeObserverOnDrawListenerC20297714bX(Application application, C088C c088c) {
        super("PerformTraversalsHook", c088c);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        LIZ("onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        LIZ("onActivitySaveInstanceState");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        LIZ("onGlobalFocusChanged");
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        LIZ("onLayoutChange");
    }
}
