package X;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import u4.q0;

/* JADX INFO: renamed from: X.13kL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20097513kL {
    public static boolean LIZ;
    public static Method LIZIZ;
    public static boolean LIZJ;
    public static Field LIZLLL;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r0 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(android.view.View r3, android.view.KeyEvent r4) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 >= r0) goto L23
            r0 = 2131393530(0x7f0a7bfa, float:1.8407719E38)
            java.lang.Object r1 = r3.getTag(r0)
            X.13k9 r1 = (X.C20096313k9) r1
            if (r1 != 0) goto L19
            X.13k9 r1 = new X.13k9
            r1.<init>()
            r3.setTag(r0, r1)
        L19:
            java.lang.ref.WeakReference<android.view.KeyEvent> r0 = r1.LIZJ
            if (r0 == 0) goto L25
            java.lang.Object r0 = r0.get()
            if (r0 != r4) goto L25
        L23:
            r3 = 0
        L24:
            return r3
        L25:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r1.LIZJ = r0
            android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r1.LIZIZ
            if (r0 != 0) goto L37
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.LIZIZ = r0
        L37:
            android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r2 = r1.LIZIZ
            int r0 = r4.getAction()
            r3 = 1
            if (r0 != r3) goto L55
            int r0 = r4.getKeyCode()
            int r1 = r2.indexOfKey(r0)
            if (r1 < 0) goto L55
            java.lang.Object r0 = r2.valueAt(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            r2.removeAt(r1)
            if (r0 != 0) goto L61
        L55:
            int r0 = r4.getKeyCode()
            java.lang.Object r0 = r2.get(r0)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L23
        L61:
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L24
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto L24
            X.C20096313k9.LIZIZ(r1, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20097513kL.LIZ(android.view.View, android.view.KeyEvent):boolean");
    }

    public static boolean LIZIZ(InterfaceC20097613kM interfaceC20097613kM, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (interfaceC20097613kM == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC20097613kM.superDispatchKeyEvent(keyEvent);
        }
        KeyEvent.DispatcherState keyDispatcherState = null;
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!LIZ) {
                        try {
                            LIZIZ = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        LIZ = true;
                    }
                    Method method = LIZIZ;
                    if (method != null) {
                        try {
                            Object objInvoke = method.invoke(actionBar, keyEvent);
                            if (objInvoke != null) {
                                if (((Boolean) objInvoke).booleanValue()) {
                                    return true;
                                }
                            }
                        } catch (IllegalAccessException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        } catch (InvocationTargetException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        }
                    }
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (q0.LIZLLL(decorView, keyEvent)) {
                return true;
            }
            if (decorView != null) {
                keyDispatcherState = decorView.getKeyDispatcherState();
            }
            return keyEvent.dispatch(activity, keyDispatcherState, activity);
        }
        if (callback instanceof Dialog) {
            Dialog dialog = (Dialog) callback;
            if (!LIZJ) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    LIZLLL = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
                LIZJ = true;
            }
            Field field = LIZLLL;
            if (field != null) {
                try {
                    DialogInterface.OnKeyListener onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                } catch (IllegalAccessException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                }
            }
            Window window2 = dialog.getWindow();
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView2 = window2.getDecorView();
            if (q0.LIZLLL(decorView2, keyEvent)) {
                return true;
            }
            if (decorView2 != null) {
                keyDispatcherState = decorView2.getKeyDispatcherState();
            }
            return keyEvent.dispatch(dialog, keyDispatcherState, dialog);
        }
        if ((view == null || !q0.LIZLLL(view, keyEvent)) && !interfaceC20097613kM.superDispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }
}
