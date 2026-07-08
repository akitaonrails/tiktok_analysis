package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: X.07nG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1967607nG {
    public static long LIZ(NLEModel nLEModel) {
        if (nLEModel == null) {
            return 0L;
        }
        try {
            Field declaredField = NLEModel.class.getDeclaredField("swigCPtr");
            if (declaredField == null) {
                return 0L;
            }
            declaredField.setAccessible(true);
            return declaredField.getLong(nLEModel);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return 0L;
        }
    }

    public static NLEModel LIZIZ(long j) {
        try {
            Constructor declaredConstructor = NLEModel.class.getDeclaredConstructor(Long.TYPE, Boolean.TYPE);
            declaredConstructor.setAccessible(true);
            return (NLEModel) declaredConstructor.newInstance(Long.valueOf(j), Boolean.TRUE);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (InstantiationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return null;
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            return null;
        }
    }
}
