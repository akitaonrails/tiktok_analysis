package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.pns.IScreenTimeService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XUB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XUB extends C09AY implements Function0<IScreenTimeService> {
    public C0XUB() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.tiktok.pns.IScreenTimeService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IScreenTimeService invoke() {
        return ServiceManager.get().getService(IScreenTimeService.class);
    }
}
