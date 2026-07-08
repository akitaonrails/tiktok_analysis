package X;

import com.ss.android.ugc.aweme.api.IDebugConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0C76, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C76 {
    public static final IDebugConfig LIZ() {
        return (IDebugConfig) ServiceManager.get().getService(IDebugConfig.class);
    }
}
