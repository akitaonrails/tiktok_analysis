package X;

import androidx.lifecycle.ViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: X.07nN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1968307nN {
    public static final /* synthetic */ int LIZ = 0;

    public static ViewModel LIZ(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                try {
                    return (ViewModel) declaredConstructor.newInstance(new Object[0]);
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Cannot create an instance of ");
                    sbLIZ.append(cls);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
                } catch (InstantiationException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Cannot create an instance of ");
                    sbLIZ2.append(cls);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), e2);
                }
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Cannot create an instance of ");
            sbLIZ3.append(cls);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Cannot create an instance of ");
            sbLIZ4.append(cls);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4), e3);
        }
    }
}
