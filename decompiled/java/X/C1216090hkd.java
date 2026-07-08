package X;

import com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hkd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216090hkd extends C09AY implements Function0<IFundraiserService> {
    public C1216090hkd() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IFundraiserService invoke() {
        return ServiceManager.get().getService(IFundraiserService.class);
    }
}
