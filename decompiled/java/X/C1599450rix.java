package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.InboxSkylightStoryCacheConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599450rix extends C09AY implements Function0<InboxSkylightStoryCacheConfig> {
    public C1599450rix() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final InboxSkylightStoryCacheConfig invoke() {
        InboxSkylightStoryCacheConfig inboxSkylightStoryCacheConfig;
        try {
            InboxSkylightStoryCacheConfig inboxSkylightStoryCacheConfig2 = (InboxSkylightStoryCacheConfig) C0C64.LJIILLIIL().LJJIIJ(true, "inbox_skylight_story_disk_cache", 31744, InboxSkylightStoryCacheConfig.class, C1599440riw.LIZ, 2);
            C189200o6.m2constructorimpl(inboxSkylightStoryCacheConfig2);
            inboxSkylightStoryCacheConfig = inboxSkylightStoryCacheConfig2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            inboxSkylightStoryCacheConfig = c098200Yq;
        }
        return (C189200o6.m7isFailureimpl(inboxSkylightStoryCacheConfig) || inboxSkylightStoryCacheConfig == 0) ? C1599440riw.LIZ : inboxSkylightStoryCacheConfig;
    }
}
