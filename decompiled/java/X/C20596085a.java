package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.085a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20596085a implements Application.ActivityLifecycleCallbacks {
    public static boolean LLILLL;
    public Field LL;
    public Field LLILLJJLI;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AnonymousClass0892.LIZ("ViewRootImplHandlerHook", "onActivityStarted！");
        if (this.LL == null) {
            return;
        }
        try {
            final View decorView = activity.getWindow().getDecorView();
            decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.085Y
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                    try {
                        Object obj = this.LLILLJJLI.LL.get(decorView);
                        C20596085a c20596085a = this.LLILLJJLI;
                        if (c20596085a.LLILLJJLI == null) {
                            c20596085a.LLILLJJLI = C1962907mV.LIZ(obj.getClass(), "mHandler");
                        }
                        final Handler handler = (Handler) this.LLILLJJLI.LLILLJJLI.get(obj);
                        Field fieldLIZ = C1962907mV.LIZ(Handler.class, "mCallback");
                        Handler.Callback callback = (Handler.Callback) fieldLIZ.get(handler);
                        if (callback != null && callback.getClass().getName().equals(C085Z.class.getName())) {
                            AnonymousClass0892.LIZ("ViewRootImplHandlerHook", "Already replaced，not need to do it.");
                        } else {
                            fieldLIZ.set(handler, new Handler.Callback(handler) { // from class: X.085Z
                                public final Handler LL;

                                {
                                    this.LL = handler;
                                }

                                @Override // android.os.Handler.Callback
                                public final boolean handleMessage(Message message) {
                                    try {
                                        if (!C20596085a.LLILLL) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("Handle message ");
                                            sbLIZ.append(message);
                                            AnonymousClass0892.LIZ("ViewRootImplHandlerHook", C2188811AlT.LIZIZ(sbLIZ));
                                        }
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
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
