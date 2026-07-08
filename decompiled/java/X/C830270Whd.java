package X;

import android.os.SystemClock;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0Whd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830270Whd {
    public static final AtomicLong LIZ;
    public static final AtomicLong LIZIZ;
    public static final SimpleDateFormat LIZJ = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    static {
        long jElapsedRealtime = (((SystemClock.elapsedRealtime() / 1000) * 100) + ((long) new SecureRandom().nextInt(99))) * 100000;
        LIZ = new AtomicLong(jElapsedRealtime);
        LIZIZ = new AtomicLong(jElapsedRealtime);
    }

    public static String LIZ() {
        return LIZJ.format(new Date());
    }
}
