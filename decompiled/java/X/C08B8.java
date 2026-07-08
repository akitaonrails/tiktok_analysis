package X;

import android.app.Activity;
import android.app.Instrumentation;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08B8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08B8 {
    public static void LIZ() {
        Class<?> cls;
        Object objInvoke;
        Instrumentation instrumentation;
        if (((Number) C08BF.LIZ.getValue()).intValue() <= 0) {
            return;
        }
        C08BE c08be = C08B9.LIZJ;
        AFwS189S0000000_3 aFwS189S0000000_3 = AFwS189S0000000_3.get$arr$(1172);
        synchronized (c08be) {
            if (!C08B9.LIZLLL) {
                if (Build.VERSION.SDK_INT >= 30) {
                    try {
                        cls = Class.forName("android.app.ActivityThread");
                        Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
                        declaredMethod.setAccessible(true);
                        objInvoke = declaredMethod.invoke(null, new Object[0]);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    if (objInvoke != null) {
                        Field declaredField = cls.getDeclaredField("mInstrumentation");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(objInvoke);
                        if ((obj instanceof Instrumentation) && (instrumentation = (Instrumentation) obj) != null) {
                            if (instrumentation instanceof C08B9) {
                                C08B9.LIZLLL = true;
                                aFwS189S0000000_3.invoke();
                            } else {
                                declaredField.set(objInvoke, new C08B9(instrumentation));
                                C08B9.LIZLLL = true;
                                aFwS189S0000000_3.invoke();
                            }
                        }
                    }
                }
            }
        }
        if (C08B3.LJFF) {
            C2214201BlK.LJII.LJJLIIJ().LJJIL(C2079508Cr.LL).LJJLL(new C09JN() { // from class: X.08B4
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    Object objLIZIZ;
                    Bundle bundle;
                    C1C7U.LIZ("MainActivityRecycleProtectOpt@db95.start$3");
                    Activity activity = ((C0X4A) obj2).LIZ;
                    if (activity != null && C08B3.LJFF && Build.VERSION.SDK_INT >= 30) {
                        Field field = (Field) C08B3.LIZLLL.getValue();
                        if (C08B3.LIZIZ.getValue() != null && C08B3.LJ.getValue() != null && field != null) {
                            try {
                                Object objLIZ = C08B3.LIZ(activity);
                                if (objLIZ != null && (objLIZIZ = C08B3.LIZIZ(activity)) != null) {
                                    Object obj3 = field.get(objLIZ);
                                    if ((obj3 instanceof Bundle) && (bundle = (Bundle) obj3) != null) {
                                        field.set(objLIZ, null);
                                        C08B3.LIZ.put(objLIZIZ, bundle);
                                    } else {
                                        C08B3.LIZ.remove(objLIZIZ);
                                    }
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                            }
                        }
                    }
                    C1C7U.LIZIZ("MainActivityRecycleProtectOpt@db95.start$3");
                }
            }, new C09JN() { // from class: X.08BA
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                    C1C7U.LIZ("MainActivityRecycleProtectOpt@db95.start$4");
                    C1C7U.LIZIZ("MainActivityRecycleProtectOpt@db95.start$4");
                }
            });
            C2214201BlK.LIZ().LJJIL(new InterfaceC19483011Ki() { // from class: X.08BC
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj2) {
                    return obj2 instanceof C08B7;
                }
            }).LJJLL(new C09JN() { // from class: X.08B6
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    Object objLIZIZ;
                    C1C7U.LIZ("MainActivityRecycleProtectOpt@db95.start$6");
                    Activity activity = (Activity) obj2;
                    if (activity.isFinishing() && Build.VERSION.SDK_INT >= 30 && !C08B3.LIZ.isEmpty() && (objLIZIZ = C08B3.LIZIZ(activity)) != null) {
                        C08B3.LIZ.remove(objLIZIZ);
                    }
                    C1C7U.LIZIZ("MainActivityRecycleProtectOpt@db95.start$6");
                }
            }, new C09JN() { // from class: X.08BB
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                    C1C7U.LIZ("MainActivityRecycleProtectOpt@db95.start$7");
                    C1C7U.LIZIZ("MainActivityRecycleProtectOpt@db95.start$7");
                }
            });
        }
    }
}
