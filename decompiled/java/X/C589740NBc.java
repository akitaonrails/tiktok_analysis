package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NBc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589740NBc extends C09AY implements Function0<ScheduledExecutorService> {
    public C589740NBc() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ScheduledExecutorService invoke() {
        return C786410Ut5.g4(1, new ThreadFactoryC638870P4b(3));
    }

    public static Thread lambda$semisugar$invoke$lambda$0$0(Runnable runnable) {
        return new BPEAThread(runnable, "milo-schedule-thread");
    }
}
