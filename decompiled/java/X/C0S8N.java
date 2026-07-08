package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S8N, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S8N extends C09AY implements Function0<C0K77> {
    public C0S8N() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0K77 invoke() {
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null) {
            return iLiveOuterService.C3();
        }
        return null;
    }
}
