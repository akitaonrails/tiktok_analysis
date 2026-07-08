package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C716260S7s extends C09AY implements Function0<C0K77> {
    public C716260S7s() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0K77 invoke() {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).C3();
    }
}
