package X;

import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: X.08Go, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2089608Go implements InvocationHandler {
    public static boolean LLILLJJLI;
    public static Object LLILLL;
    public static Choreographer.FrameCallback LLILZ;
    public static final C2089908Gr LLILZIL;
    public static InterfaceC2090008Gs LLILZLL;
    public static Runnable LLIZ;
    public static Method LLIZLLLIL;
    public static final RunnableC2089708Gp LLJ;
    public final ChoreographerFrameCallbackC2089808Gq LL = new Choreographer.FrameCallback() { // from class: X.08Gq
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            if (C2090408Gw.LIZIZ.booleanValue()) {
                if (C2090208Gu.LIZJ) {
                    Choreographer.FrameCallback frameCallback = C2089608Go.LLILZ;
                    if (frameCallback != null) {
                        frameCallback.doFrame(j);
                        return;
                    }
                    return;
                }
                C2089608Go.LLILZLL.LIZIZ(this.LL.LL);
                return;
            }
            Choreographer.FrameCallback frameCallback2 = C2089608Go.LLILZ;
            if (frameCallback2 == null) {
                return;
            }
            frameCallback2.doFrame(j);
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.08Gr, X.08Gs] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.08Gp] */
    static {
        ?? r0 = new InterfaceC2090008Gs() { // from class: X.08Gr
            @Override // X.InterfaceC2090008Gs
            public final /* synthetic */ void LIZJ() {
            }

            @Override // X.InterfaceC2090008Gs
            public final boolean LJIILIIL() {
                return false;
            }

            @Override // X.InterfaceC2090008Gs
            public final void LIZIZ(Choreographer.FrameCallback frameCallback) {
                C786410Ut5.v2().postFrameCallback(frameCallback);
            }

            @Override // X.InterfaceC2090008Gs
            public final void LIZ(Object obj, Method method, Choreographer.FrameCallback frameCallback) throws IllegalAccessException, InvocationTargetException {
                method.invoke(obj, frameCallback);
            }
        };
        LLILZIL = r0;
        LLILZLL = r0;
        LLJ = new Runnable() { // from class: X.08Gp
            public final void LIZ() {
                if (!C2090408Gw.LIZIZ.booleanValue()) {
                    Runnable runnable = C2089608Go.LLIZ;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                if (C2090208Gu.LIZJ) {
                    Runnable runnable2 = C2089608Go.LLIZ;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                try {
                    C2089608Go.LLIZLLLIL.invoke(C786410Ut5.v2(), 1, this, null, 0);
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (InvocationTargetException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("KitaAnimator@8ba3.<field>$3");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("KitaAnimator@8ba3.<field>$3");
            }
        };
    }

    public static void LIZLLL() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Object objLIZJ;
        if (LLIZ == null && LLIZLLLIL == null) {
            Object[] objArr = new Object[0];
            Field declaredField = null;
            Object objInvoke = C1965907mz.LIZIZ(Class.forName("android.animation.ValueAnimator"), "getOrCreateAnimationHandler", C1965907mz.LIZLLL(objArr)).invoke(null, C1965907mz.LJ(objArr));
            try {
                objLIZJ = C1965907mz.LIZJ(objInvoke, "mAnimate");
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                objLIZJ = null;
            } catch (NoSuchFieldException e2) {
                TryCatchGuardChecker.doCheck(e2);
                objLIZJ = null;
            }
            LLIZ = (Runnable) objLIZJ;
            RunnableC2089708Gp runnableC2089708Gp = LLJ;
            Class<?> superclass = objInvoke.getClass();
            do {
                try {
                    declaredField = superclass.getDeclaredField("mAnimate");
                } catch (NoSuchFieldException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    superclass = superclass.getSuperclass();
                    if (superclass == null) {
                        throw new NoSuchFieldException();
                    }
                }
            } while (declaredField == null);
            declaredField.setAccessible(true);
            Field declaredField2 = Field.class.getDeclaredField("accessFlags");
            declaredField2.setAccessible(true);
            declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            declaredField.set(objInvoke, runnableC2089708Gp);
            Method declaredMethod = Class.forName("android.view.Choreographer").getDeclaredMethod("postCallbackDelayedInternal", Integer.TYPE, Object.class, Object.class, Long.TYPE);
            LLIZLLLIL = declaredMethod;
            declaredMethod.setAccessible(true);
        }
    }

    public static void LIZIZ() {
        try {
            C2090108Gt.LIZ = SystemClock.elapsedRealtime();
            LLILLJJLI = true;
            if (Build.VERSION.SDK_INT >= 24) {
                LIZJ(LLILZLL);
            } else {
                LIZLLL();
            }
            if (C2090108Gt.LIZ == 0) {
                throw new RuntimeException("must call setStartMs first!!!");
            }
            SystemClock.elapsedRealtime();
            C2090108Gt.LIZ = 0L;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.InterfaceC2090008Gs r15) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2089608Go.LIZJ(X.08Gs):void");
    }

    public static Object LIZ(Object obj, C2089608Go c2089608Go) {
        Class<?> cls = obj.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), c2089608Go);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        if (method.getName().contains("postFrameCallback")) {
            if (LLILLJJLI) {
                LLILZLL.LIZ(LLILLL, method, this.LL);
                return null;
            }
            if (objArr != null && objArr.length > 0) {
                LLILZLL.LIZ(LLILLL, method, (Choreographer.FrameCallback) objArr[0]);
                return null;
            }
            LLILZLL.LIZJ();
            method.invoke(LLILLL, objArr);
            return null;
        }
        return method.invoke(LLILLL, objArr);
    }
}
