package X;

import android.os.Debug;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.07mN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1962107mN {
    public static final Field LIZ;

    static {
        try {
            Class cls = Integer.TYPE;
            Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", cls).setAccessible(true);
            Debug.MemoryInfo.class.getDeclaredMethod("getOtherPrivate", cls).setAccessible(true);
            Debug.MemoryInfo.class.getDeclaredMethod("getOtherPrivateDirty", cls).setAccessible(true);
            Field declaredField = Debug.MemoryInfo.class.getDeclaredField("otherStats");
            declaredField.setAccessible(true);
            LIZ = declaredField;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static int LIZ(int i, int[] iArr) {
        int i2;
        int i3 = i * 9;
        int i4 = 0;
        try {
            i2 = iArr[i3 + 5];
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            i2 = 0;
        }
        try {
            i4 = iArr[i3 + 3];
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return i2 + i4;
    }

    public static int[] LIZIZ(Debug.MemoryInfo memoryInfo, boolean z) {
        Object obj;
        try {
            Field field = LIZ;
            int[] iArr = null;
            if (field != null) {
                obj = field.get(memoryInfo);
            } else {
                obj = null;
            }
            if (obj instanceof int[]) {
                iArr = (int[]) obj;
            }
            if (iArr == null) {
                iArr = new int[0];
            }
            if (z) {
                if (iArr.length % 9 != 0) {
                    return new int[0];
                }
                if (iArr.length / 9 != 32) {
                    return new int[0];
                }
                return iArr;
            }
            return iArr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new int[0];
        }
    }
}
