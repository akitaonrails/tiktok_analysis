package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CDD, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CDD extends C09AY implements Function0<Boolean> {
    public C0CDD() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C0CD2.LJFF().getBoolean("optimize_deeplink_v2", false));
    }
}
