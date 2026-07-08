package X;

import com.ss.android.ugc.aweme.memory.MemoryWatcherAB;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09QA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09QA extends C09AY implements Function0<MemoryWatcherAB.WatcherConfig> {
    public C09QA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.memory.MemoryWatcherAB$WatcherConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final MemoryWatcherAB.WatcherConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        MemoryWatcherAB.WatcherConfig watcherConfig = MemoryWatcherAB.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(MemoryWatcherAB.WatcherConfig.class, watcherConfig, "memory_watcher_ab", true);
        return LJJII != 0 ? LJJII : watcherConfig;
    }
}
