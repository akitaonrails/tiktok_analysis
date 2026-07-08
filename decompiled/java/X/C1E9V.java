package X;

import com.ss.android.ugc.aweme.innerpush.settings.InnerPushAIExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E9V, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E9V extends C09AY implements Function0<InnerPushAIExp.AIConfig> {
    public C1E9V() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.innerpush.settings.InnerPushAIExp$AIConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final InnerPushAIExp.AIConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        InnerPushAIExp.AIConfig aIConfig = InnerPushAIExp.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(InnerPushAIExp.AIConfig.class, aIConfig, "in_app_push_ai_exp", true);
        return LJJII != 0 ? LJJII : aIConfig;
    }
}
