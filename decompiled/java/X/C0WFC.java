package X;

import android.content.Context;
import com.bytedance.push.settings.ISettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0WFC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WFC {
    public final ConcurrentHashMap<Class<? extends ISettings>, ISettings> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class<? extends ISettings>, Object> LIZIZ = new ConcurrentHashMap<>();

    public static <T extends ISettings> T LIZ(Context context, Class<T> cls) {
        try {
            C0WFB c0wfb = (C0WFB) cls.getAnnotation(C0WFB.class);
            if (c0wfb != null) {
                return (T) LIZIZ(context, cls, C0WFG.LIZ(context, c0wfb.storageKey(), c0wfb.supportMultiProcess()));
            }
            e = null;
        } catch (ClassNotFoundException e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
        } catch (IllegalAccessException e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
        } catch (InstantiationException e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
        } catch (NoSuchMethodException e4) {
            e = e4;
            TryCatchGuardChecker.doCheck(e);
        } catch (InvocationTargetException e5) {
            e = e5;
            TryCatchGuardChecker.doCheck(e);
        }
        if (e != null) {
            throw new IllegalStateException("get settings instance error，please check warning log", e);
        }
        throw new IllegalStateException("get settings instance error，please check warning log");
    }

    public static <T extends ISettings> ISettings LIZIZ(Context context, Class<T> cls, InterfaceC810050Vq7 interfaceC810050Vq7) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(cls.getName());
        sbLIZ.append("$$SettingImpl");
        ISettings iSettings = (ISettings) Class.forName(C2188811AlT.LIZIZ(sbLIZ), true, cls.getClassLoader()).getConstructor(InterfaceC810050Vq7.class).newInstance(interfaceC810050Vq7);
        iSettings.updateSettings(context, null);
        return iSettings;
    }
}
