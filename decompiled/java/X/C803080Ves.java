package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Ves, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803080Ves {
    public static volatile C803080Ves LIZ;
    public static String LIZIZ;

    public static void LIZIZ() {
        if (LIZ == null) {
            synchronized (C803080Ves.class) {
                try {
                    LIZ = new C803080Ves();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public C803080Ves() {
        new ArrayList();
    }

    public static String LIZ(Context context) {
        if (LIZIZ == null) {
            C0VSJ c0vsj = new C0VSJ(C786410Ut5.y2(context, null), "mmt");
            if (!c0vsj.exists()) {
                c0vsj.mkdir();
            }
            LIZIZ = c0vsj.getAbsolutePath();
        }
        return LIZIZ;
    }
}
