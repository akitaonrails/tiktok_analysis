package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839830xyf extends C09AY implements Function0<ITranslationLangKevaService> {
    public C1839830xyf() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ITranslationLangKevaService invoke() {
        return ServiceManager.get().getService(ITranslationLangKevaService.class);
    }
}
