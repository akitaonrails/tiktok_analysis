package X;

import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0boE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C987680boE extends C09AY implements Function0<IAdPhotoModeService> {
    public C987680boE() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IAdPhotoModeService invoke() {
        return ServiceManager.get().getService(IAdPhotoModeService.class);
    }
}
