package X;

import com.lynx.tasm.LynxEnv;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kDX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310890kDX extends C09AY implements Function0<Boolean> {
    public C1310890kDX() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return LynxEnv.inst().getEnableMemoryMonitor();
    }
}
