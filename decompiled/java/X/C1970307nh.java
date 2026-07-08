package X;

import android.animation.ValueAnimator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07nh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1970307nh {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(float f) {
        try {
            for (Field field : ValueAnimator.class.getDeclaredFields()) {
                if (Intrinsics.LJFF(field.getName(), "sDurationScale")) {
                    field.setAccessible(true);
                    field.set(ValueAnimator.class, Float.valueOf(f));
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
