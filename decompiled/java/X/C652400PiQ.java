package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0PiQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652400PiQ {
    public static final Field LIZ;

    static {
        Field declaredField;
        try {
            declaredField = RecyclerView.class.getDeclaredField("mTouchSlop");
            declaredField.setAccessible(true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            declaredField = null;
        }
        LIZ = declaredField;
    }
}
