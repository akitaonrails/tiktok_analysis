package X;

import android.app.Activity;
import android.app.Instrumentation;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.08B9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08B9 extends Instrumentation {
    public static final C08BE LIZJ = new Object() { // from class: X.08BE
    };
    public static volatile boolean LIZLLL;
    public final Instrumentation LIZ;
    public final C08BD LIZIZ;

    public C08B9(Instrumentation instrumentation) {
        C08B5 c08b5 = new C08BD() { // from class: X.08B5
            @Override // X.C08BD
            public final Bundle LIZ(Activity activity, Bundle bundle) {
                boolean z;
                Bundle bundle2;
                if ((activity instanceof C08B7) && bundle == null) {
                    if (Build.VERSION.SDK_INT >= 30 && !C08B3.LIZ.isEmpty()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        try {
                            Object objLIZIZ = C08B3.LIZIZ(activity);
                            if (objLIZIZ != null && (bundle2 = C08B3.LIZ.get(objLIZIZ)) != null) {
                                Object objLIZ = C08B3.LIZ(activity);
                                Field field = (Field) C08B3.LIZLLL.getValue();
                                if (objLIZ != null && field != null) {
                                    field.set(objLIZ, bundle2);
                                    return bundle2;
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
                return bundle;
            }
        };
        this.LIZ = instrumentation;
        this.LIZIZ = c08b5;
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnCreate(Activity activity, Bundle bundle) {
        this.LIZ.callActivityOnCreate(activity, this.LIZIZ.LIZ(activity, bundle));
    }

    @Override // android.app.Instrumentation
    public final void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.LIZ.callActivityOnCreate(activity, this.LIZIZ.LIZ(activity, bundle), persistableBundle);
    }
}
