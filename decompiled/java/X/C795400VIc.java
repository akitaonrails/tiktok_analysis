package X;

import android.content.Context;
import androidx.work.ListenableWorker;
import com.ss.android.ugc.aweme.pipo.probe.core.regularreport.HeartbeatWorker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0VIc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795400VIc {
    public static boolean LIZIZ;
    public static final C795400VIc LIZ = new C795400VIc();
    public static boolean LIZJ = true;

    public static void LIZ(long j, boolean z, Context context) {
        if (z) {
            C0VI1.LJII(context).LIZJ("probe_sdk", C0VIA.REPLACE, new C0VIM((Class<? extends ListenableWorker>) HeartbeatWorker.class, j, TimeUnit.SECONDS).LIZ());
            LIZIZ = true;
        }
    }
}
