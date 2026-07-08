package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.085W, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C085W extends C09AY implements Function0<Boolean> {
    public C085W() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C08Q0.LJ(C1BWL.LIZ(), "optimize_cold_boot_hook_app_context", true));
    }
}
