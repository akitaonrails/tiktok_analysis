package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0J9G, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J9G extends C09AY implements Function0<ILiveBubblePopService> {
    public C0J9G() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ILiveBubblePopService invoke() {
        return ServiceManager.get().getService(ILiveBubblePopService.class);
    }
}
