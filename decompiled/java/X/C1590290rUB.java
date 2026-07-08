package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rUB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590290rUB extends C09AY implements Function0<IHomePageService> {
    public C1590290rUB() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.homepage.IHomePageService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IHomePageService invoke() {
        return ServiceManager.get().getService(IHomePageService.class);
    }
}
