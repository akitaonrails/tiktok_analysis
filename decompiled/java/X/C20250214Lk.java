package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.ttmock.ITtmockService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14Lk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20250214Lk extends C09AY implements Function0<ITtmockService> {
    public C20250214Lk() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.offline.ttmock.ITtmockService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ITtmockService invoke() {
        return ServiceManager.get().getService(ITtmockService.class, false, false);
    }
}
