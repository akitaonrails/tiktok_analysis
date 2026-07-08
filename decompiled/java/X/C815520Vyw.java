package X;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Vyw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815520Vyw {
    public static String LIZLLL;
    public static ServiceConnectionC815590Vz3 LJI;
    public final Context LIZ;
    public final NotificationManager LIZIZ;
    public static final Object LIZJ = new Object();
    public static Set<String> LJ = new HashSet();
    public static final Object LJFF = new Object();

    public final boolean LIZ() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C815530Vyx.LIZ(this.LIZIZ);
        }
        Object objH2 = C786410Ut5.H2(this.LIZ, "appops");
        ApplicationInfo applicationInfo = this.LIZ.getApplicationInfo();
        String packageName = C786410Ut5.N3(this.LIZ).getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(objH2, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            return true;
        }
    }

    public C815520Vyw(Context context) {
        this.LIZ = context;
        this.LIZIZ = (NotificationManager) C786410Ut5.H2(context, "notification");
    }

    public final void LIZIZ(int i, String str) {
        this.LIZIZ.cancel(str, i);
    }

    public final void LIZJ(final int i, final Notification notification) {
        boolean z;
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            final String packageName = this.LIZ.getPackageName();
            InterfaceC815550Vyz interfaceC815550Vyz = new InterfaceC815550Vyz(i, notification, packageName) { // from class: X.0Vyy
                public final String LIZ;
                public final int LIZIZ;
                public final String LIZJ = null;
                public final Notification LIZLLL;

                public final String toString() {
                    return "NotifyTask[packageName:" + this.LIZ + ", id:" + this.LIZIZ + ", tag:" + this.LIZJ + e3.f;
                }

                @Override // X.InterfaceC815550Vyz
                public final void LIZ(InterfaceC815560Vz0 interfaceC815560Vz0) {
                    String str = this.LIZ;
                    interfaceC815560Vz0.LLLLLZIL(this.LIZIZ, this.LIZLLL, str, this.LIZJ);
                }

                {
                    this.LIZ = packageName;
                    this.LIZIZ = i;
                    this.LIZLLL = notification;
                }
            };
            synchronized (LJFF) {
                try {
                    if (LJI == null) {
                        LJI = new ServiceConnectionC815590Vz3(C786410Ut5.N3(this.LIZ));
                    }
                    LJI.LLILLJJLI.obtainMessage(0, interfaceC815550Vyz).sendToTarget();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LIZIZ.cancel(null, i);
            return;
        }
        this.LIZIZ.notify(null, i, notification);
    }
}
