package X;

import com.ss.android.ugc.aweme.offlinemode.experiment.UpdateWatchedSettings;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0OgT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625710OgT {
    public static final C625710OgT LIZ = new C625710OgT();
    public static final UpdateWatchedSettings LIZIZ = new UpdateWatchedSettings(0.5f, 0, 10, false, false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(378));

    public static UpdateWatchedSettings LIZIZ() {
        return (UpdateWatchedSettings) LIZJ.getValue();
    }

    public static int LIZ() {
        if (!C0BMC.LIZ()) {
            return 0;
        }
        return (int) (LIZIZ().min_request_interval_second + (AbstractC19994813Le.Default.nextFloat() * (LIZIZ().max_request_interval_second - LIZIZ().min_request_interval_second)));
    }
}
