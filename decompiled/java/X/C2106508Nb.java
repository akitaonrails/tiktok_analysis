package X;

import android.net.NetworkInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08Nb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2106508Nb {
    public static NetworkInfo LIZ() {
        try {
            Class<?> cls = Class.forName("android.net.NetworkInfo");
            Class<?> cls2 = Integer.TYPE;
            return (NetworkInfo) cls.getConstructor(cls2, cls2, String.class, String.class).newInstance(1, 0, "CONNECTED", "CONNECTED");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
            return null;
        }
    }
}
