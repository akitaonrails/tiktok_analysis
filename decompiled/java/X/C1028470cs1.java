package X;

import com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cs1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028470cs1 extends C09AY implements Function0<IFeedVideoShrinkService> {
    public C1028470cs1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IFeedVideoShrinkService invoke() {
        return ServiceManager.get().getService(IFeedVideoShrinkService.class);
    }
}
