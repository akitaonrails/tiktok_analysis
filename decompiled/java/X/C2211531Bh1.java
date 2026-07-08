package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: X.1Bh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2211531Bh1 {
    public static final C1BRO LIZ = new ThreadLocal<SimpleDateFormat>() { // from class: X.1BRO
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        }
    };

    public static String LIZ(long j) {
        SimpleDateFormat simpleDateFormat = LIZ.get();
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(Long.valueOf(j));
        }
        return String.valueOf(j);
    }

    public static String LIZIZ(String str) {
        if (!C2211541Bh2.LIZ(str)) {
            try {
                return new String(Base64.decode(str, 0), "utf-8");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C0VO0.LIZ("error decoding video url");
                return "";
            }
        }
        return "";
    }
}
