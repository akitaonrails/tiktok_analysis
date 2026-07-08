package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarMetaDataService;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;

/* JADX INFO: renamed from: X.0ZlS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C909080ZlS implements IActionBarMetaDataService {
    public static final C909080ZlS LIZ = new C909080ZlS();

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarMetaDataService
    public final InterfaceC1707406mO LJ() {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarMetaDataService
    public final C908980ZlI LJFF() {
        return new C908980ZlI(((InterfaceC894810Z8l) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJFF());
    }
}
