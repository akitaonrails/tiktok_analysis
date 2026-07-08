package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CDI, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CDI extends C09AY implements Function0<Boolean> {
    public C0CDI() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C0CD2.LJFF().getBoolean("anropt_unreg_skip_lock", false));
    }
}
