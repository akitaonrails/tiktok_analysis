package X;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0pep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class ViewTreeObserverOnWindowAttachListenerC1520010pep implements ViewTreeObserver.OnWindowAttachListener {
    public final /* synthetic */ Activity LIZ;

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowDetached() {
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0rmo] */
    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowAttached() {
        try {
            this.LIZ.getWindow().getDecorView().getViewTreeObserver().removeOnWindowAttachListener(this);
            Object objLIZ = C1963607mc.LIZ(this.LIZ.getWindow().getDecorView());
            final Object[] objArr = new Object[1];
            if (objLIZ == null || !C1962207mO.LIZIZ(objLIZ, new InvocationHandler() { // from class: X.0rmo
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr2) throws IllegalAccessException {
                    Class<?> cls;
                    Class<?> cls2;
                    Class<?> cls3;
                    if (!method.isAccessible()) {
                        method.setAccessible(true);
                    }
                    Object[] objArr3 = objArr;
                    if (objArr3[0] == null) {
                        objArr3[0] = obj;
                    }
                    if (C202094145s.LIZLLL == 0 && "finishDrawing".equals(method.getName())) {
                        C202094145s.LIZLLL = SystemClock.uptimeMillis();
                        if (C305230Bxp.LIZ() && !C1601810rml.LJFF) {
                            ViewParent parent = this.LLILLJJLI.LIZ.getWindow().getDecorView().getParent();
                            C1601810rml.LJFF = true;
                            Handler handlerLIZLLL = AnonymousClass0883.LIZLLL(parent);
                            C1601810rml.LJ = handlerLIZLLL;
                            C1601810rml.LIZLLL = parent;
                            if (handlerLIZLLL != null) {
                                if (((Boolean) C1601860rmq.LIZIZ.getValue()).booleanValue()) {
                                    if (parent != null) {
                                        cls3 = parent.getClass();
                                    } else {
                                        cls3 = null;
                                    }
                                    Field fieldLIZ = C1959507lx.LIZ(cls3, "mWindowFocusChanged");
                                    if (fieldLIZ != null) {
                                        fieldLIZ.setAccessible(true);
                                        if (C1601860rmq.LIZIZ()) {
                                            C1601810rml.LIZ = fieldLIZ.getBoolean(parent);
                                        }
                                        fieldLIZ.set(parent, Boolean.TRUE);
                                    }
                                }
                                if (((Boolean) C1601860rmq.LIZJ.getValue()).booleanValue()) {
                                    if (parent != null) {
                                        cls2 = parent.getClass();
                                    } else {
                                        cls2 = null;
                                    }
                                    Field fieldLIZ2 = C1959507lx.LIZ(cls2, "mAdded");
                                    if (fieldLIZ2 != null) {
                                        fieldLIZ2.setAccessible(true);
                                        if (C1601860rmq.LIZIZ()) {
                                            C1601810rml.LIZIZ = fieldLIZ2.getBoolean(parent);
                                        }
                                        fieldLIZ2.set(parent, Boolean.TRUE);
                                    }
                                }
                                if (((Boolean) C1601860rmq.LIZLLL.getValue()).booleanValue()) {
                                    if (parent != null) {
                                        cls = parent.getClass();
                                    } else {
                                        cls = null;
                                    }
                                    Field fieldLIZ3 = C1959507lx.LIZ(cls, "mUpcomingWindowFocus");
                                    if (fieldLIZ3 != null) {
                                        fieldLIZ3.setAccessible(true);
                                        if (C1601860rmq.LIZIZ()) {
                                            C1601810rml.LIZJ = fieldLIZ3.getBoolean(parent);
                                        }
                                        fieldLIZ3.set(parent, Boolean.TRUE);
                                    }
                                }
                            }
                            if (((Boolean) C1601860rmq.LJII.getValue()).booleanValue()) {
                                C1601810rml.LJFF = true;
                                Message messageObtain = Message.obtain();
                                messageObtain.what = 6;
                                Handler handler = C1601810rml.LJ;
                                if (handler != null) {
                                    C786410Ut5.LJLJJL(handler, messageObtain);
                                }
                            }
                        }
                    }
                    C01GW c01gw = C0ADO.LIZ;
                    if (((Number) c01gw.getValue()).intValue() != 0 && "reportSystemGestureExclusionChanged".equals(method.getName())) {
                        if ((((Number) c01gw.getValue()).intValue() & 1) == 1 && C0CFK.LIZ) {
                            return null;
                        }
                        if ((((Number) c01gw.getValue()).intValue() & 2) == 2 && SystemClock.uptimeMillis() - C202094145s.LJIILL < 30000) {
                            return null;
                        }
                    }
                    return C2204961BRm.a0(method, obj, objArr2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatZJDn0SIS/ow8O7CoUvqJ8DCrLG9P398W6+hbqPZ0LjU=", null));
                }
            })) {
                return;
            }
            C1BCA.LJIJJ(EnumC312610CNf.SATRTUP, new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.0peo
                @Override // X.InterfaceC1006670cIr
                public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                    Object obj;
                    Object objLIZ2;
                    int i;
                    Window window;
                    if (c1602200rnO2.LIZIZ()) {
                        C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                        if (((Boolean) C1250604uu.LIZJ.getValue()).booleanValue() && (i = Build.VERSION.SDK_INT) >= 26 && i <= 32 && C2456309jt.LIZ() && C202094145s.LIZLLL == 0 && (window = this.LLILLJJLI.LIZ.getWindow()) != null) {
                            try {
                                C1963607mc.LIZIZ(window.getDecorView());
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                        if (((Boolean) C1250604uu.LIZLLL.getValue()).booleanValue() && (obj = objArr[0]) != null && (objLIZ2 = C1963607mc.LIZ(this.LLILLJJLI.LIZ.getWindow().getDecorView())) != null) {
                            try {
                                Field fieldLIZ = C1962207mO.LIZ(Class.forName("android.view.ViewRootImpl"));
                                if (fieldLIZ != null) {
                                    fieldLIZ.set(objLIZ2, obj);
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public ViewTreeObserverOnWindowAttachListenerC1520010pep(Activity activity) {
        this.LIZ = activity;
    }
}
