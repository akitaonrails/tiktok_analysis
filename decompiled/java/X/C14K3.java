package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.14K3, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14K3 {
    public static final Field LIZ;
    public static final Field LIZIZ;
    public static final Field LIZJ;
    public static final boolean LIZLLL;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            LIZ = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            LIZIZ = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            LIZJ = declaredField3;
            declaredField3.setAccessible(true);
            LIZLLL = true;
        } catch (ReflectiveOperationException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
