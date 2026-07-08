package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.df.api.top1.ISearchMarkdownNimblePreloadPlugin;
import com.ss.android.ugc.aweme.search.df.api.top1.SearchMarkdownNimblePreloadPluginDefaultImpl;

/* JADX INFO: renamed from: X.0QG2, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QG2 {
    public static final C0QG2 LIZ = new C0QG2();
    public static volatile ISearchMarkdownNimblePreloadPlugin LIZIZ = LIZ();

    public static ISearchMarkdownNimblePreloadPlugin LIZ() {
        C0QG1.LIZ.getClass();
        if (!C0QG1.LIZIZ.LIZ()) {
            return new SearchMarkdownNimblePreloadPluginDefaultImpl();
        }
        try {
            ISearchMarkdownNimblePreloadPlugin iSearchMarkdownNimblePreloadPlugin = (ISearchMarkdownNimblePreloadPlugin) PluggableExtentionKt.pluggableSpi$default(ISearchMarkdownNimblePreloadPlugin.class, false, false, false, 14, null);
            return iSearchMarkdownNimblePreloadPlugin == null ? new SearchMarkdownNimblePreloadPluginDefaultImpl() : iSearchMarkdownNimblePreloadPlugin;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new SearchMarkdownNimblePreloadPluginDefaultImpl();
        }
    }
}
