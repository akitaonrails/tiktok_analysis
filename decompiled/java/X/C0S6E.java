package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S6E, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S6E extends C09AY implements Function0<ITranslationService> {
    public C0S6E() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.translation.service.ITranslationService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ITranslationService invoke() {
        return ServiceManager.get().getService(ITranslationService.class);
    }
}
