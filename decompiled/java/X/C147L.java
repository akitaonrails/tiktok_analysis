package X;

import android.widget.AbsListView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.147L, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C147L {
    public static final Field LIZ;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = declaredField;
    }
}
