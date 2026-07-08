package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0738, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0738 extends C09AY implements Function0<Boolean> {
    public AnonymousClass0738() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        AnonymousClass0737.LIZ.getClass();
        int iIntValue = ((Number) AnonymousClass0737.LIZLLL.getValue()).intValue();
        int i = AnonymousClass0737.LIZJ;
        return Boolean.valueOf((iIntValue & i) == i);
    }
}
