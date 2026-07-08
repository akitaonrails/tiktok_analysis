package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.IIMService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SCt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717570SCt extends C09AY implements Function0<IIMService> {
    public C717570SCt() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.service.IIMService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IIMService invoke() {
        return ServiceManager.get().getService(IIMService.class);
    }
}
