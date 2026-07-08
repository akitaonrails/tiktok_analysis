package X;

import com.ss.android.ugc.aweme.experiment.JitProfileSaverConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AjE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187421AjE extends C09AY implements Function0<JitProfileSaverConfig> {
    public C2187421AjE() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.experiment.JitProfileSaverConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final JitProfileSaverConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        JitProfileSaverConfig jitProfileSaverConfig = C2187411AjD.LIZIZ;
        ?? LJJIIJ = c0c64LJIILLIIL.LJJIIJ(true, "jit_profilesaver_opt_launch", 31744, JitProfileSaverConfig.class, jitProfileSaverConfig, 2);
        if (LJJIIJ != 0) {
            return LJJIIJ;
        }
        C2187411AjD.LIZ.getClass();
        return jitProfileSaverConfig;
    }
}
