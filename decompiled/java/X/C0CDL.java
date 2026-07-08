package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CDL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CDL extends C09AY implements Function0<Boolean> {
    public C0CDL() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C0CD2.LJFF().getBoolean("optimize_preload_keva_v2", false));
    }
}
