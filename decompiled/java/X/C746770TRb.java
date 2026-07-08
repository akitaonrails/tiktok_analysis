package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746770TRb extends C09AY implements Function0<ICaptionKevaService> {
    public C746770TRb() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.service.ICaptionKevaService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ICaptionKevaService invoke() {
        return ServiceManager.get().getService(ICaptionKevaService.class);
    }
}
