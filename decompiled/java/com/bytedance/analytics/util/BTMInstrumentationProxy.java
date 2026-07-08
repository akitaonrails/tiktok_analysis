package com.bytedance.analytics.util;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class BTMInstrumentationProxy extends Instrumentation {
    public final Instrumentation mBaseInstrumentation;

    public static void hook() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mInstrumentation");
            declaredField.setAccessible(true);
            declaredField.set(objInvoke, new BTMInstrumentationProxy((Instrumentation) declaredField.get(objInvoke)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public BTMInstrumentationProxy(Instrumentation instrumentation) {
        this.mBaseInstrumentation = instrumentation;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnDestroy(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnDestroy(activity);
        } else {
            super.callActivityOnDestroy(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPause(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnPause(activity);
        } else {
            super.callActivityOnPause(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestart(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnRestart(activity);
        } else {
            super.callActivityOnRestart(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnResume(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnResume(activity);
        } else {
            super.callActivityOnResume(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStart(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnStart(activity);
        } else {
            super.callActivityOnStart(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStop(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnStop(activity);
        } else {
            super.callActivityOnStop(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnUserLeaving(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnUserLeaving(activity);
        } else {
            super.callActivityOnUserLeaving(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callApplicationOnCreate(Application application) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callApplicationOnCreate(application);
        } else {
            super.callApplicationOnCreate(application);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnCreate(activity, bundle);
        } else {
            super.callActivityOnCreate(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnNewIntent(Activity activity, Intent intent) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnNewIntent(activity, intent);
        } else {
            super.callActivityOnNewIntent(activity, intent);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnRestoreInstanceState(activity, bundle);
        } else {
            super.callActivityOnRestoreInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnSaveInstanceState(activity, bundle);
        } else {
            super.callActivityOnSaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public boolean onException(Object obj, Throwable th) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            return instrumentation.onException(obj, th);
        }
        return super.onException(obj, th);
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) {
        return this.mBaseInstrumentation.newActivity(classLoader, str, intent);
    }

    @Override // android.app.Instrumentation
    public Application newApplication(ClassLoader classLoader, String str, Context context) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            return instrumentation.newApplication(classLoader, str, context);
        }
        return super.newApplication(classLoader, str, context);
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            return instrumentation.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
        }
        return super.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }
}
