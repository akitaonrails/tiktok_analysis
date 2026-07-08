package X;

import com.ss.android.ugc.aweme.experiment.JitCompilerConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Aj5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187331Aj5 extends C09AY implements Function0<JitCompilerConfig> {
    public C2187331Aj5() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.experiment.JitCompilerConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final JitCompilerConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        JitCompilerConfig jitCompilerConfig = C2187321Aj4.LIZIZ;
        ?? LJJIIJ = c0c64LJIILLIIL.LJJIIJ(true, "jit_compile_params", 31744, JitCompilerConfig.class, jitCompilerConfig, 2);
        if (LJJIIJ != 0) {
            return LJJIIJ;
        }
        C2187321Aj4.LIZ.getClass();
        return jitCompilerConfig;
    }
}
