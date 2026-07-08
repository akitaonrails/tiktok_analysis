package X;

import com.bytedance.pumbaa.settings.impl.SandboxAspectConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wxj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840250Wxj extends C09AY implements Function0<SandboxAspectConfig> {
    public C840250Wxj() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.pumbaa.settings.impl.SandboxAspectConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final SandboxAspectConfig invoke() {
        SandboxAspectConfig sandboxAspectConfig = C840230Wxh.LIZ;
        ?? LIZLLL = C308480C7i.LIZLLL(SandboxAspectConfig.class, "pumbaa_sandbox_settings", sandboxAspectConfig);
        return LIZLLL != 0 ? LIZLLL : sandboxAspectConfig;
    }
}
