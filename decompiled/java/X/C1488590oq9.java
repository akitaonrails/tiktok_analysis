package X;

import androidx.viewpager.widget.ViewPager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0oq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488590oq9 {
    public static final Field LIZ;

    static {
        try {
            Field declaredField = ViewPager.LayoutParams.class.getDeclaredField("position");
            LIZ = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }
}
