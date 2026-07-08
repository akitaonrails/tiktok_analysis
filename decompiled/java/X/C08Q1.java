package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.08Q1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08Q1 {
    public static String LIZ;
    public static int LIZIZ = 0;
    public static final List<C08Q2> LIZJ = new ArrayList();

    public static boolean LIZ() {
        C844470XAv.LIZ.getClass();
        if (!C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "new_kids_mode").edit().putBoolean("key_is_new_kids_mode", false).commit()) {
            return false;
        }
        if (LIZ == null) {
            LIZ = LIZIZ();
        }
        if (LIZ == null) {
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(LIZ, "child");
        if (c0vsj.exists()) {
            try {
                boolean zDelete = c0vsj.delete();
                Iterator it2 = ((ArrayList) LIZJ).iterator();
                while (it2.hasNext()) {
                    ((C08Q2) it2.next()).LIZ();
                }
                if (!zDelete) {
                    return false;
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        } else {
            Iterator it3 = ((ArrayList) LIZJ).iterator();
            while (it3.hasNext()) {
                ((C08Q2) it3.next()).LIZ();
            }
        }
        return true;
    }

    public static String LIZIZ() {
        String str;
        String str2;
        String str3;
        Iterator it2;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]);
            Field declaredField = objInvoke.getClass().getDeclaredField("mBoundApplication");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objInvoke);
            Field declaredField2 = obj.getClass().getDeclaredField("info");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Field declaredField3 = obj2.getClass().getDeclaredField("mDataDir");
            declaredField3.setAccessible(true);
            str = (String) declaredField3.get(obj2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            str = null;
        }
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("/files");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        try {
            Class<?> cls2 = Class.forName("android.app.ActivityThread");
            Object objInvoke2 = cls2.getMethod("currentActivityThread", new Class[0]).invoke(cls2, new Object[0]);
            Field declaredField4 = objInvoke2.getClass().getDeclaredField("mBoundApplication");
            declaredField4.setAccessible(true);
            Object obj3 = declaredField4.get(objInvoke2);
            Field declaredField5 = obj3.getClass().getDeclaredField("appInfo");
            declaredField5.setAccessible(true);
            Object obj4 = declaredField5.get(obj3);
            Field declaredField6 = obj4.getClass().getDeclaredField("dataDir");
            declaredField6.setAccessible(true);
            str2 = (String) declaredField6.get(obj4);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            str2 = null;
        }
        if (str2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append("/files");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        try {
            Class<?> cls3 = Class.forName("android.app.ActivityThread");
            Object objInvoke3 = cls3.getMethod("currentActivityThread", new Class[0]).invoke(cls3, new Object[0]);
            Field declaredField7 = objInvoke3.getClass().getDeclaredField("mPackages");
            declaredField7.setAccessible(true);
            it2 = ((Map) declaredField7.get(objInvoke3)).entrySet().iterator();
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        if (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            entry.getKey();
            Object obj5 = ((WeakReference) entry.getValue()).get();
            Field declaredField8 = obj5.getClass().getDeclaredField("mDataDir");
            declaredField8.setAccessible(true);
            str3 = (String) declaredField8.get(obj5);
        } else {
            str3 = null;
        }
        if (str3 == null) {
            return null;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str3);
        sbLIZ3.append("/files");
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static boolean LIZJ() {
        if (LIZIZ == 0) {
            if (LIZ == null) {
                LIZ = LIZIZ();
            }
            if (LIZ != null) {
                if (new C0VSJ(LIZ, "child").exists()) {
                    LIZIZ = 1;
                } else {
                    LIZIZ = 2;
                }
            }
        }
        return LIZIZ == 1;
    }

    public static boolean LIZLLL() {
        C844470XAv.LIZ.getClass();
        if (!C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "new_kids_mode").edit().putBoolean("key_is_new_kids_mode", true).commit()) {
            return false;
        }
        if (LIZ == null) {
            LIZ = LIZIZ();
        }
        if (LIZ == null) {
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(LIZ, "child");
        if (c0vsj.exists()) {
            Iterator it2 = ((ArrayList) LIZJ).iterator();
            while (it2.hasNext()) {
                ((C08Q2) it2.next()).LIZ();
            }
        } else {
            try {
                if (!c0vsj.createNewFile()) {
                    return false;
                }
                Iterator it3 = ((ArrayList) LIZJ).iterator();
                while (it3.hasNext()) {
                    ((C08Q2) it3.next()).LIZ();
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return true;
    }
}
