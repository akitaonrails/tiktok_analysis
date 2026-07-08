package X;

import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08Eq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2084608Eq {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1518));

    public static C1883907Zl LIZ() {
        WeakHashMap weakHashMap;
        int i = 0;
        long allocationByteCount = 0;
        if (Build.VERSION.SDK_INT < 35) {
            return new C1883907Zl(0, 0L);
        }
        try {
            Field field = (Field) LIZ.getValue();
            if (field == null) {
                return new C1883907Zl(0, 0L);
            }
            synchronized (Bitmap.class) {
                try {
                    Object obj = field.get(null);
                    if ((obj instanceof WeakHashMap) && (weakHashMap = (WeakHashMap) obj) != null && (!weakHashMap.isEmpty())) {
                        for (Bitmap bitmap : weakHashMap.keySet()) {
                            if (bitmap != null && !bitmap.isRecycled()) {
                                i++;
                                allocationByteCount += (long) bitmap.getAllocationByteCount();
                            }
                        }
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th) {
        }
        return new C1883907Zl(i, allocationByteCount);
    }
}
