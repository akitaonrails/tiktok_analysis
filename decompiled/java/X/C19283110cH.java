package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10cH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19283110cH extends C09AY implements Function0<PnSDigitalWellbeingSDKService> {
    public C19283110cH() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final PnSDigitalWellbeingSDKService invoke() {
        return ServiceManager.get().getService(PnSDigitalWellbeingSDKService.class);
    }
}
