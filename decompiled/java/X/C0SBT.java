package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SBT, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SBT extends C09AY implements Function0<C0K77> {
    public C0SBT() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0K77 invoke() {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).C3();
    }
}
