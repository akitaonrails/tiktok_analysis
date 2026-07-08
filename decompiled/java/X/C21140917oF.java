package X;

import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.17oF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21140917oF extends C09AY implements Function0<IFeedService> {
    public C21140917oF() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.api.IFeedService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IFeedService invoke() {
        return ServiceManager.get().getService(IFeedService.class);
    }
}
