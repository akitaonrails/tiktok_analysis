package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CDP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CDP extends C09AY implements Function0<Boolean> {
    public C0CDP() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C0CD2.LJFF().getBoolean("optimize_downgrade_share", false));
    }
}
