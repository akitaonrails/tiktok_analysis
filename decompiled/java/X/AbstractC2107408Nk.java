package X;

import X.C19853712m7;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.08Nk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2107408Nk<T extends C19853712m7> {
    public abstract T LIZ();

    public static <T extends C19853712m7> T LIZIZ(Class<T> cls) {
        String strJ4;
        ClassLoader classLoader = AbstractC2107408Nk.class.getClassLoader();
        if (cls.equals(C19853712m7.class)) {
            strJ4 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else if (cls.getPackage().equals(AbstractC2107408Nk.class.getPackage())) {
            strJ4 = C786410Ut5.j4("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                try {
                    try {
                        return cls.cast(((AbstractC2107408Nk) Class.forName(strJ4, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).LIZ());
                    } catch (NoSuchMethodException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new IllegalStateException(e);
                    }
                } catch (InvocationTargetException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw new IllegalStateException(e2);
                }
            } catch (IllegalAccessException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw new IllegalStateException(e3);
            } catch (InstantiationException e4) {
                TryCatchGuardChecker.doCheck(e4);
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException e5) {
            TryCatchGuardChecker.doCheck(e5);
            Iterator it2 = C786410Ut5.o4(AbstractC2107408Nk.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it2.hasNext()) {
                try {
                    arrayList.add(cls.cast(((AbstractC2107408Nk) it2.next()).LIZ()));
                } catch (ServiceConfigurationError e6) {
                    TryCatchGuardChecker.doCheck(e6);
                    Logger.getLogger(AbstractC19901712tr.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e6);
                }
            }
            if (arrayList.size() == 1) {
                return (T) ListProtector.get(arrayList, 0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e7) {
                TryCatchGuardChecker.doCheck(e7);
                throw new IllegalStateException(e7);
            } catch (NoSuchMethodException e8) {
                TryCatchGuardChecker.doCheck(e8);
                throw new IllegalStateException(e8);
            } catch (InvocationTargetException e9) {
                TryCatchGuardChecker.doCheck(e9);
                throw new IllegalStateException(e9);
            }
        }
    }
}
