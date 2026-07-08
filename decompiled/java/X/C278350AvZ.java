package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0AvZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C278350AvZ extends C09AY implements Function0<Boolean> {
    public C278350AvZ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        return Boolean.valueOf(C278330AvX.LIZIZ() && ((iLiveOuterService == null || (interfaceC20673515v3K4 = iLiveOuterService.k4()) == null) ? null : interfaceC20673515v3K4.LJJLIIIJJI(((Boolean) C258650ABr.LIZ.getValue()).booleanValue())) != null);
    }
}
