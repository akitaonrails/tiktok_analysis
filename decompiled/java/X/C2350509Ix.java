package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: X.09Ix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2350509Ix {
    public static final C830530Wi3<String, Class<?>> LIZ = new C830530Wi3<>();

    public static boolean LIZJ(Scene scene) {
        Class<?> cls = scene.getClass();
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return false;
        }
        int modifiers = cls.getModifiers();
        if (!Modifier.isPublic(modifiers)) {
            return false;
        }
        if (cls.isMemberClass() && !Modifier.isStatic(modifiers)) {
            return false;
        }
        for (Constructor<?> constructor : cls.getConstructors()) {
            if (constructor.getParameterTypes().length > 0) {
                return false;
            }
        }
        return true;
    }

    public static Scene LIZ(Bundle bundle, Class cls) {
        try {
            Scene scene = (Scene) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(scene.getClass().getClassLoader());
                scene.mArguments = bundle;
            }
            return scene;
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unable to instantiate scene ");
            sbLIZ.append(cls);
            sbLIZ.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C2350609Iy(C2188811AlT.LIZIZ(sbLIZ), e);
        } catch (InstantiationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Unable to instantiate scene ");
            sbLIZ2.append(cls);
            sbLIZ2.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C2350609Iy(C2188811AlT.LIZIZ(sbLIZ2), e2);
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Unable to instantiate scene ");
            sbLIZ3.append(cls);
            sbLIZ3.append(": could not find Scene constructor");
            throw new C2350609Iy(C2188811AlT.LIZIZ(sbLIZ3), e3);
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Unable to instantiate scene ");
            sbLIZ4.append(cls);
            sbLIZ4.append(": calling Scene constructor caused an exception");
            throw new C2350609Iy(C2188811AlT.LIZIZ(sbLIZ4), e4);
        }
    }

    public static Scene LIZIZ(Context context, String str, Bundle bundle) {
        C830530Wi3<String, Class<?>> c830530Wi3 = LIZ;
        Class<?> clsLoadClass = c830530Wi3.get(str);
        if (clsLoadClass == null) {
            try {
                clsLoadClass = context.getClassLoader().loadClass(str);
                c830530Wi3.put(str, clsLoadClass);
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unable to instantiate scene ");
                sbLIZ.append(str);
                sbLIZ.append(": make sure class name exists, is public, and has an empty constructor that is public");
                throw new C2350609Iy(C2188811AlT.LIZIZ(sbLIZ), e);
            }
        }
        return LIZ(bundle, clsLoadClass);
    }
}
