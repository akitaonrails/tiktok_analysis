package X;

import android.app.Activity;
import android.content.Context;
import android.util.ArrayMap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.08P2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08P2 {
    public static volatile int LIZ = -1;
    public static volatile String LIZIZ = "";

    public static Activity LIZ() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
            if (arrayMap.size() < 1) {
                return null;
            }
            for (Object obj : arrayMap.values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    public static String LIZIZ(Context context) {
        try {
            if (LIZIZ == "") {
                LIZIZ = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0).versionName;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return LIZIZ;
    }
}
