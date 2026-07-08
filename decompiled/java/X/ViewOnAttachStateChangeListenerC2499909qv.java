package X;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.09qv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class ViewOnAttachStateChangeListenerC2499909qv implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC2499909qv viewOnAttachStateChangeListenerC2499909qv, View view) {
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC2499909qv viewOnAttachStateChangeListenerC2499909qv, View view) {
    }

    public static final void onViewDetachedFromWindow$3(ViewOnAttachStateChangeListenerC2499909qv viewOnAttachStateChangeListenerC2499909qv, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
            case 3:
                onViewAttachedToWindow$3(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                break;
        }
    }

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC2499909qv viewOnAttachStateChangeListenerC2499909qv, View view) {
        View view2 = (View) viewOnAttachStateChangeListenerC2499909qv.l0;
        C259800zU c259800zU = (C259800zU) viewOnAttachStateChangeListenerC2499909qv.l1;
        if (view2.getViewTreeObserver().isAlive()) {
            C786410Ut5.x3(view2.getViewTreeObserver(), (ViewTreeObserver.OnGlobalLayoutListener) c259800zU.element);
        }
    }

    public static final void onViewAttachedToWindow$3(ViewOnAttachStateChangeListenerC2499909qv viewOnAttachStateChangeListenerC2499909qv, View view) {
        try {
            Object obj = ((C20597085b) viewOnAttachStateChangeListenerC2499909qv.l1).LL.get((View) viewOnAttachStateChangeListenerC2499909qv.l0);
            C20597085b c20597085b = (C20597085b) viewOnAttachStateChangeListenerC2499909qv.l1;
            if (c20597085b.LLILLJJLI == null) {
                c20597085b.LLILLJJLI = C1962907mV.LIZ(obj.getClass(), "mHandler");
            }
            final Handler handler = (Handler) ((C20597085b) viewOnAttachStateChangeListenerC2499909qv.l1).LLILLJJLI.get(obj);
            Field fieldLIZ = C1962907mV.LIZ(Handler.class, "mCallback");
            Handler.Callback callback = (Handler.Callback) fieldLIZ.get(handler);
            if (callback != null && callback.getClass().getName().equals(C085X.class.getName())) {
                AnonymousClass0892.LIZ("ViewRootImplHandlerHook", "Already replaced，not need to do it.");
            } else {
                fieldLIZ.set(handler, new Handler.Callback(handler) { // from class: X.085X
                    public final Handler LL;

                    {
                        this.LL = handler;
                    }

                    @Override // android.os.Handler.Callback
                    public final boolean handleMessage(Message message) {
                        try {
                            this.LL.handleMessage(message);
                            return true;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            return true;
                        }
                    }
                });
                AnonymousClass0892.LIZ("ViewRootImplHandlerHook", "Prevent handler in ViewRootImpl successful.");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC2499909qv viewOnAttachStateChangeListenerC2499909qv, View view) {
        ((View) viewOnAttachStateChangeListenerC2499909qv.l0).getViewTreeObserver().removeOnGlobalFocusChangeListener((ViewTreeObserver.OnGlobalFocusChangeListener) viewOnAttachStateChangeListenerC2499909qv.l1);
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC2499909qv viewOnAttachStateChangeListenerC2499909qv, View view) {
        C786410Ut5.C3(((View) viewOnAttachStateChangeListenerC2499909qv.l0).getViewTreeObserver(), (ViewTreeObserverOnGlobalLayoutListenerC2355409Ku) viewOnAttachStateChangeListenerC2499909qv.l1);
    }

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC2499909qv viewOnAttachStateChangeListenerC2499909qv, View view) {
        View view2 = (View) viewOnAttachStateChangeListenerC2499909qv.l0;
        C259800zU c259800zU = (C259800zU) viewOnAttachStateChangeListenerC2499909qv.l1;
        try {
            if (view2.getViewTreeObserver().isAlive()) {
                C786410Ut5.C3(view2.getViewTreeObserver(), (ViewTreeObserver.OnGlobalLayoutListener) c259800zU.element);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public ViewOnAttachStateChangeListenerC2499909qv(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
