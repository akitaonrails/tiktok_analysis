package X;

import android.content.Context;
import com.bytedance.push.settings.ILocalSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0WFD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WFD {
    public final ConcurrentHashMap<Class<? extends ILocalSettings>, ILocalSettings> LIZ = new ConcurrentHashMap<>();
    public final C0WFF LIZIZ;

    public C0WFD(C0WFG c0wfg) {
        this.LIZIZ = c0wfg;
    }

    public final <T extends ILocalSettings> T LIZ(Context context, Class<T> cls) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(cls.getName());
            sbLIZ.append("$$SettingImpl");
            Constructor<?> constructor = Class.forName(C2188811AlT.LIZIZ(sbLIZ), true, cls.getClassLoader()).getConstructor(Context.class, InterfaceC810050Vq7.class);
            C0WFB c0wfb = (C0WFB) cls.getAnnotation(C0WFB.class);
            if (c0wfb != null) {
                return (T) constructor.newInstance(context, C0WFG.LIZ(context, c0wfb.storageKey(), c0wfb.supportMultiProcess()));
            }
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
        } catch (InstantiationException e3) {
            TryCatchGuardChecker.doCheck(e3);
        } catch (NoSuchMethodException e4) {
            TryCatchGuardChecker.doCheck(e4);
        } catch (InvocationTargetException e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        throw new IllegalStateException("get settings instance error，please check warning log");
    }

    public final <T extends ILocalSettings> T LIZIZ(Context context, Class<T> cls) {
        T t;
        T t2 = (T) this.LIZ.get(cls);
        if (t2 == null) {
            synchronized (this) {
                try {
                    t = (T) this.LIZ.get(cls);
                    if (t == null) {
                        t = (T) LIZ(context, cls);
                        this.LIZ.put((Class<? extends ILocalSettings>) cls, t);
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
