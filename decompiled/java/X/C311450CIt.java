package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311450CIt extends C09AY implements Function0<Boolean> {
    public C311450CIt() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int iIntValue = ((Number) C311420CIq.LIZ.getValue()).intValue();
        return Boolean.valueOf(1 <= iIntValue && iIntValue < 100);
    }
}
