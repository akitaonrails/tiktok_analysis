package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Bun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303350Bun extends C09AY implements Function0<Boolean> {
    public C303350Bun() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int iIntValue = ((Number) C303340Bum.LIZIZ.getValue()).intValue();
        return Boolean.valueOf(iIntValue == 200 || iIntValue == 250 || iIntValue == 300 || iIntValue == 350);
    }
}
