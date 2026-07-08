package X;

import android.text.StaticLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0kN9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316850kN9 {
    public static final Field LIZ;
    public static final Field LIZIZ;

    static {
        try {
            Field declaredField = StaticLayout.class.getDeclaredField("mLines");
            LIZ = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = StaticLayout.class.getDeclaredField("mColumns");
            LIZIZ = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
