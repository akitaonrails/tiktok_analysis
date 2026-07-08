package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Dmo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349360Dmo {
    public static final long LIZ;
    public static final long LIZIZ;
    public static final /* synthetic */ int LIZJ = 0;

    static {
        new C350670Dov();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.toMicros(1000L);
        timeUnit.toMicros(500L);
        LIZ = timeUnit.toMicros(Mp4ScreenVideoLoadTimeout.CONTROL);
        LIZIZ = timeUnit.toMicros(100L);
    }
}
