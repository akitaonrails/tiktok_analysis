package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.ShareH5Service;

/* JADX INFO: renamed from: X.0d8S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038660d8S {
    public static final /* synthetic */ C1038660d8S LIZ = new C1038660d8S();

    public static ShareH5Service LIZIZ() {
        return (ShareH5Service) PluggableExtentionKt.pluggableSpi$default(ShareH5Service.class, false, false, false, 14, null);
    }

    public static ShareH5Service LIZ() {
        return (ShareH5Service) ServiceManager.get().getService(ShareH5Service.class);
    }
}
