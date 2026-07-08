package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.09pO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2490409pO {
    public static final C2490409pO LIZ = new C2490409pO();
    public static final ConcurrentHashMap<String, C2490509pP> LIZIZ = new ConcurrentHashMap<>();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1589));

    public static Bitmap LIZ(Bitmap bitmap) {
        Object c098200Yq;
        if (bitmap.isRecycled()) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > 256 && height > 256) {
            int i = width / 2;
            int i2 = 1;
            if (i < 1) {
                i = 1;
            }
            int i3 = height / 2;
            if (i3 >= 1) {
                i2 = i3;
            }
            try {
                c098200Yq = Bitmap.createScaledBitmap(bitmap, i, i2, false);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Bitmap bitmap2 = (Bitmap) c098200Yq;
            if (bitmap2 != null) {
                return bitmap2;
            }
        }
        return bitmap;
    }
}
