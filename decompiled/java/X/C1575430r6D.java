package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.offlinepush.experiment.OfflinePushSettingsValue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0r6D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575430r6D {
    public static final C1575430r6D LIZ = new C1575430r6D();
    public static final OfflinePushSettingsValue LIZIZ = new OfflinePushSettingsValue(180, 3, (int) TimeUnit.MINUTES.toSeconds(5), Mp4ScreenVideoLoadTimeout.CONTROL, (int) TimeUnit.HOURS.toMinutes(24), 20, 24, TimeUnit.MINUTES.toMillis(5), 7, 5, 3, 5);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(666));

    public static OfflinePushSettingsValue LIZ() {
        return (OfflinePushSettingsValue) LIZJ.getValue();
    }
}
