package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1640, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1640 extends C09AY implements Function0<ITranslationService> {
    public AnonymousClass1640() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.translation.service.ITranslationService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ITranslationService invoke() {
        return ServiceManager.get().getService(ITranslationService.class);
    }
}
