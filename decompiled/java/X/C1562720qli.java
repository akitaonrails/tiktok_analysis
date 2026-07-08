package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.legoImp.task.experiments.TrackerUploadRate;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qli, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1562720qli extends C09AY implements Function0<TrackerUploadRate> {
    public C1562720qli() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.legoImp.task.experiments.TrackerUploadRate, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final TrackerUploadRate invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        TrackerUploadRate trackerUploadRate = C1562530qlP.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("arch_tracker_reporter_upload_rate_v2", TrackerUploadRate.class, trackerUploadRate);
        return LJIIIIZZ != 0 ? LJIIIIZZ : trackerUploadRate;
    }
}
