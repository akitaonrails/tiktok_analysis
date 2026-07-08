package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0k6X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306550k6X extends C09AY implements Function0<Boolean> {
    public C1306550k6X() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C1306580k6a.LIZJ().getBoolean("debug_trace_config", true));
    }
}
