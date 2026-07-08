package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sE1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618710sE1 extends C09AY implements Function0<INoticeCountTabBadgePresentService> {
    public C1618710sE1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final INoticeCountTabBadgePresentService invoke() {
        return ServiceManager.get().getService(INoticeCountTabBadgePresentService.class);
    }
}
