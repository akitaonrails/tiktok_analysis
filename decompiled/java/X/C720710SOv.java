package X;

import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SOv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720710SOv extends C09AY implements Function0<ICommerceChallengeService> {
    public C720710SOv() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ICommerceChallengeService invoke() {
        return ServiceManager.get().getService(ICommerceChallengeService.class);
    }
}
