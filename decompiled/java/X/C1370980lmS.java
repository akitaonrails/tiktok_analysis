package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lmS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1370980lmS extends C09AY implements Function0<IInternalShareApi> {
    public C1370980lmS() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IInternalShareApi invoke() {
        return ServiceManager.get().getService(IInternalShareApi.class);
    }
}
