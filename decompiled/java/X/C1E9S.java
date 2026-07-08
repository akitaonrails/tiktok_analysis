package X;

import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushColdStartExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E9S, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E9S extends C09AY implements Function0<InnerPushColdStartExp.Config> {
    public C1E9S() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushColdStartExp$Config, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final InnerPushColdStartExp.Config invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        InnerPushColdStartExp.Config config = InnerPushColdStartExp.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(InnerPushColdStartExp.Config.class, config, "inner_push_cold_start_exp", true);
        return LJJII != 0 ? LJJII : config;
    }
}
