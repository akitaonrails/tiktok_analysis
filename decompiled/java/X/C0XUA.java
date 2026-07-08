package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XUA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XUA extends C09AY implements Function0<PnSDigitalWellbeingSDKService> {
    public C0XUA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final PnSDigitalWellbeingSDKService invoke() {
        return ServiceManager.get().getService(PnSDigitalWellbeingSDKService.class);
    }
}
