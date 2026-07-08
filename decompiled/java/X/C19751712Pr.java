package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.12Pr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19751712Pr {
    public static final Field LIZ;
    public static final Field LIZIZ;
    public static final Field LIZJ;
    public static final Field LIZLLL;
    public static final boolean LJ;

    static {
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            Field field = cls.getField("left");
            LIZ = field;
            if (field != null) {
                field.setAccessible(true);
            }
            Field field2 = cls.getField("top");
            LIZIZ = field2;
            if (field2 != null) {
                field2.setAccessible(true);
            }
            Field field3 = cls.getField("right");
            LIZJ = field3;
            if (field3 != null) {
                field3.setAccessible(true);
            }
            Field field4 = cls.getField("bottom");
            LIZLLL = field4;
            if (field4 != null) {
                field4.setAccessible(true);
            }
            LJ = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJ = false;
        }
    }
}
