package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.18kP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21371918kP {
    public static Field LIZ;
    public static boolean LIZIZ;

    public void LIZ(int i, View view) {
        if (!LIZIZ) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                LIZ = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LIZIZ = true;
        }
        Field field = LIZ;
        if (field != null) {
            try {
                LIZ.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
