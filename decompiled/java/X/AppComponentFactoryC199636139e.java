package X;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import jv6.a;

/* JADX INFO: renamed from: X.139e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class AppComponentFactoryC199636139e extends AppComponentFactory {
    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return androidx_core_app_CoreComponentFactory_com_ss_android_ugc_aweme_lancet_CoreComponentFactoryLancet_instantiateService(this, classLoader, str, intent);
    }

    public static <T> T checkCompatWrapper(T t) {
        T t2;
        if ((t instanceof InterfaceC199637139f) && (t2 = (T) ((InterfaceC199637139f) t).getWrapper()) != null) {
            return t2;
        }
        return t;
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) checkCompatWrapper(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) checkCompatWrapper(super.instantiateProvider(classLoader, str));
    }

    public Service androidx_core_app_CoreComponentFactory__instantiateService$___twin___(ClassLoader classLoader, String str, Intent intent) {
        return (Service) checkCompatWrapper(super.instantiateService(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) checkCompatWrapper(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) checkCompatWrapper(super.instantiateReceiver(classLoader, str, intent));
    }

    public static Service androidx_core_app_CoreComponentFactory_com_ss_android_ugc_aweme_lancet_CoreComponentFactoryLancet_instantiateService(AppComponentFactoryC199636139e appComponentFactoryC199636139e, ClassLoader classLoader, String str, Intent intent) {
        try {
            return appComponentFactoryC199636139e.androidx_core_app_CoreComponentFactory__instantiateService$___twin___(classLoader, str, intent);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (th instanceof ClassNotFoundException) {
                try {
                    C844470XAv.LIZ.getClass();
                    try {
                        a.install(C844470XAv.LIZ());
                        try {
                            return appComponentFactoryC199636139e.androidx_core_app_CoreComponentFactory__instantiateService$___twin___(classLoader, str, intent);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("GP Service Crash:");
                            sbLIZ.append(str);
                            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), th2);
                        }
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("GP Service Crash:");
                        sbLIZ2.append(str);
                        sbLIZ2.append(" , Dynamic Feature initialize error.");
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), th3);
                    }
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("GP Service Crash:");
                    sbLIZ3.append(str);
                    sbLIZ3.append(" , Application not initialized yet");
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            throw th;
        }
    }
}
