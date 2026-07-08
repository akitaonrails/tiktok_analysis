package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.GsonProvider;

/* JADX INFO: renamed from: X.05N6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05N6 {
    public static final GsonProvider LIZ() {
        return (GsonProvider) ServiceManager.get().getService(GsonProvider.class);
    }
}
