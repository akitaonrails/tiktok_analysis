package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Z8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C894760Z8g extends C09AY implements Function0<ILightInteractionPlatformService> {
    public C894760Z8g() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ILightInteractionPlatformService invoke() {
        return ServiceManager.get().getService(ILightInteractionPlatformService.class);
    }
}
