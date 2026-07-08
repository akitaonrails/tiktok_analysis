package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Reference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.07op, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1977307op {
    public static Application LIZ;

    public static void LIZLLL(Context context) throws Throwable {
        Application application = LIZ;
        if (application != null) {
            try {
                Method declaredMethod = Application.class.getDeclaredMethod("attach", Context.class);
                declaredMethod.setAccessible(true);
                C2204961BRm.a0(declaredMethod, application, new Object[]{context}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOm6YozG2jtp262oY03jxBDoE2HL5u6ovKy+RXIX8qM=", null));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LIZ.onCreate();
        }
    }

    public static Object LIZ(Context context, Class<?> cls) {
        try {
            Method method = cls.getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, new Object[0]);
            if (objInvoke == null && context != null) {
                Field field = context.getClass().getField("mLoadedApk");
                field.setAccessible(true);
                Object obj = field.get(context);
                Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            }
            return objInvoke;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static void LIZJ(Context context, Application application, Application application2) {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objLIZ = LIZ(context, cls);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            Application application3 = (Application) declaredField.get(objLIZ);
            if (application2 != null) {
                if (application3 == application) {
                    declaredField.set(objLIZ, application2);
                }
                Field declaredField2 = cls.getDeclaredField("mAllApplications");
                declaredField2.setAccessible(true);
                List list = (List) declaredField2.get(objLIZ);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == application) {
                        list.set(i, application2);
                    }
                }
            }
            LIZIZ(application, application2, cls, objLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw new IllegalStateException(th);
        }
    }

    public static void LIZIZ(Application application, Application application2, Class cls, Object obj) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        Class<?> cls2;
        Field declaredField;
        try {
            cls2 = Class.forName("android.app.LoadedApk");
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            cls2 = Class.forName("android.app.ActivityThread$PackageInfo");
        }
        Field declaredField2 = cls2.getDeclaredField("mApplication");
        declaredField2.setAccessible(true);
        cls2.getDeclaredField("mResDir").setAccessible(true);
        try {
            declaredField = Application.class.getDeclaredField("mLoadedApk");
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
            declaredField = null;
        }
        String[] strArr = {"mPackages", "mResourcePackages"};
        int i = 0;
        do {
            Field declaredField3 = cls.getDeclaredField(strArr[i]);
            declaredField3.setAccessible(true);
            Iterator it2 = ((Map) declaredField3.get(obj)).entrySet().iterator();
            while (it2.hasNext()) {
                Object obj2 = ((Reference) ((Map.Entry) it2.next()).getValue()).get();
                if (obj2 != null && declaredField2.get(obj2) == application && application2 != null) {
                    declaredField2.set(obj2, application2);
                    if (declaredField != null) {
                        declaredField.set(application2, obj2);
                    }
                }
            }
            i++;
        } while (i < 2);
    }
}
