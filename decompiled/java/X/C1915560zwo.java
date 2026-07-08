package X;

import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zwo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1915560zwo extends C09AY implements Function0<TTKUserCommunicationService> {
    public C1915560zwo() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final TTKUserCommunicationService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(TTKUserCommunicationService.class, false, false, false, 14, null);
    }
}
