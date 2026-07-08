package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13qW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20135813qW {
    public static final C830530Wi3<ClassLoader, C830530Wi3<String, Class<?>>> LIZ = new C830530Wi3<>();

    public Fragment LIZ(String str) {
        throw null;
    }

    public static Class<?> LIZIZ(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C830530Wi3<ClassLoader, C830530Wi3<String, Class<?>>> c830530Wi3 = LIZ;
        C830530Wi3<String, Class<?>> c830530Wi32 = c830530Wi3.get(classLoader);
        if (c830530Wi32 == null) {
            c830530Wi32 = new C830530Wi3<>();
            c830530Wi3.put(classLoader, c830530Wi32);
        }
        Class<?> cls = c830530Wi32.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            c830530Wi32.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Class, java.lang.Class<? extends androidx.fragment.app.Fragment>] */
    public static Class<? extends Fragment> LIZJ(ClassLoader classLoader, String str) {
        String strLIZIZ = "Unable to instantiate fragment ";
        try {
            strLIZIZ = LIZIZ(classLoader, str);
            return strLIZIZ;
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(str);
            sbLIZ.append(": make sure class is a valid subclass of Fragment");
            throw new C20135913qX(C2188811AlT.LIZIZ(sbLIZ), e);
        } catch (ClassNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(str);
            sbLIZ2.append(": make sure class name exists");
            throw new C20135913qX(C2188811AlT.LIZIZ(sbLIZ2), e2);
        }
    }
}
