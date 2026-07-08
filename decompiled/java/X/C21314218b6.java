package X;

import com.ss.android.ugc.aweme.localservice.passthrough.rules.EventParamsConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughDefaultOptConfig;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.18b6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21314218b6 {
    public static final EventParamsConfig LIZ = new EventParamsConfig(null, null, null, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(135));

    public static EventParamsConfig LIZ() {
        if (!LSPassThroughDefaultOptConfig.INSTANCE.enable()) {
            return (EventParamsConfig) LIZIZ.getValue();
        }
        C21314118b5 c21314118b5 = C21314118b5.LIZ;
        EventParamsConfig eventParamsConfig = (EventParamsConfig) LIZIZ.getValue();
        c21314118b5.getClass();
        return C21314118b5.LIZ(eventParamsConfig, "passthrough", "local_service_passthrough_params_rules.json");
    }
}
