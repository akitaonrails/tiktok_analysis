package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: renamed from: X.08KJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08KJ {
    public static String LIZ;

    public static String LIZIZ() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.board.platform", "unknown");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "unknown";
        }
    }

    public static void LIZ(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
