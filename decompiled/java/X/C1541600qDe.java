package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0qDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541600qDe implements InterfaceC1541590qDd {
    public HashMap<Class<? extends InterfaceC1541860qE4>, InterfaceC1541860qE4> LIZIZ = new HashMap<>();
    public final String LIZ = "hybrid_web_extension_webkit";

    public static <T> T LIZIZ(Class<? extends T> cls) {
        Constructor<?> constructor;
        try {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            int length = declaredConstructors.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    constructor = declaredConstructors[i];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    }
                    i++;
                } else {
                    constructor = null;
                    break;
                }
            }
            if (constructor != null) {
                try {
                    try {
                        constructor.setAccessible(true);
                        return (T) constructor.newInstance(new Object[0]);
                    } catch (IllegalAccessException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new RuntimeException(e);
                    }
                } catch (InstantiationException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    throw new RuntimeException(e3);
                }
            }
            throw new RuntimeException();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(cls);
            sbLIZ.append("'s new instance return null");
            C2188811AlT.LIZIZ(sbLIZ);
            C786950Utx.LIZ("WebExtensionImpl");
            C1541610qDf.LJII.getClass();
            throw null;
        }
    }

    @Override // X.InterfaceC1541590qDd
    public final <T extends InterfaceC1541860qE4> T LIZ(Class<T> cls) {
        T t;
        T t2 = (T) this.LIZIZ.get(cls);
        if (t2 == null) {
            synchronized (C1152640g6I.class) {
                try {
                    t = (T) this.LIZIZ.get(cls);
                    if (t == null) {
                        C1541610qDf c1541610qDfLIZ = C1541610qDf.LIZ(cls, this.LIZ);
                        if (c1541610qDfLIZ != null) {
                            t = (T) LIZIZ(c1541610qDfLIZ.LIZ);
                            if (!(t instanceof InterfaceC1541730qDr)) {
                                t = null;
                            } else {
                                InterfaceC1541730qDr interfaceC1541730qDr = (InterfaceC1541730qDr) t;
                                interfaceC1541730qDr.LIZIZ(c1541610qDfLIZ);
                                interfaceC1541730qDr.getExtendableContext().LIZIZ(c1541610qDfLIZ.LIZIZ);
                            }
                            HashMap<Class<? extends InterfaceC1541860qE4>, InterfaceC1541860qE4> map = new HashMap<>(this.LIZIZ);
                            map.put(cls, t);
                            this.LIZIZ = map;
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("nameSpace ");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append("& class ");
                            sbLIZ.append(cls.getCanonicalName());
                            sbLIZ.append(" 's env is null");
                            throw new Error(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return t;
        }
        return t2;
    }
}
