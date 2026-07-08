package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CIp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311410CIp extends C09AY implements Function0<Boolean> {
    public C311410CIp() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        if (((Number) C311420CIq.LIZJ.getValue()).intValue() != 1) {
            return Boolean.FALSE;
        }
        int iIntValue = ((Number) C311420CIq.LIZLLL.getValue()).intValue();
        return (iIntValue == 1 || iIntValue == 2) ? Boolean.TRUE : Boolean.FALSE;
    }
}
