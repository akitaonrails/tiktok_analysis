package X;

import com.ss.android.ugc.aweme.experiment.ExtAppLogConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MsL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C582110MsL extends C09AY implements Function0<ExtAppLogConfig> {
    public C582110MsL() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.experiment.ExtAppLogConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ExtAppLogConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        ExtAppLogConfig extAppLogConfig = C582100MsK.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(ExtAppLogConfig.class, extAppLogConfig, "player_ext_app_log", true);
        return LJJII != 0 ? LJJII : extAppLogConfig;
    }
}
