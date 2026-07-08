package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2276181E7k extends C09AY implements Function0<IAuthFrequencyService> {
    public C2276181E7k() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IAuthFrequencyService invoke() {
        return ServiceManager.get().getService(IAuthFrequencyService.class);
    }
}
