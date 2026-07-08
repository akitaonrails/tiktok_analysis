package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CDM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CDM extends C09AY implements Function0<Boolean> {
    public C0CDM() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C0CD2.LJFF().getBoolean("optimize_degrade_firebase", false));
    }
}
