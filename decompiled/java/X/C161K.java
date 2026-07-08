package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.translation.service.ITranslationKevaService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.161K, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C161K extends C09AY implements Function0<ITranslationKevaService> {
    public C161K() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.translation.service.ITranslationKevaService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ITranslationKevaService invoke() {
        return ServiceManager.get().getService(ITranslationKevaService.class);
    }
}
