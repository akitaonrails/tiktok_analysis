package X;

import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zyk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1916760zyk extends C09AY implements Function0<TTKUserCommunicationService> {
    public C1916760zyk() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final TTKUserCommunicationService invoke() {
        return ServiceManager.get().getService(TTKUserCommunicationService.class);
    }
}
