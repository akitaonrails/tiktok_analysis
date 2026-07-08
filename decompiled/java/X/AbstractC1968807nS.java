package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07nS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1968807nS implements InterfaceC1969407nY {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1818));

    @Override // X.InterfaceC1969407nY
    public final <T extends C1054730dYN> T LIZIZ(Class<T> cls) {
        T tNewInstance;
        if (((HashMap) this.LIZ.getValue()).containsKey(cls)) {
            return (T) ((HashMap) this.LIZ.getValue()).get(cls);
        }
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(AbstractC1968807nS.class);
                declaredConstructor.setAccessible(true);
                tNewInstance = declaredConstructor.newInstance(this);
            } catch (Exception e) {
                e = e;
                tNewInstance = null;
            }
            try {
                ((HashMap) this.LIZ.getValue()).put(cls, tNewInstance);
                return tNewInstance;
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                return tNewInstance;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("can't use abstract class!");
        sbLIZ.append(cls.getSimpleName());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }
}
