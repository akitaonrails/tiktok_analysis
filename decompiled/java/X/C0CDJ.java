package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CDJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CDJ extends C09AY implements Function0<Boolean> {
    public C0CDJ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C0CD2.LJFF().getBoolean("optimize_ab_unregister_store", false));
    }
}
