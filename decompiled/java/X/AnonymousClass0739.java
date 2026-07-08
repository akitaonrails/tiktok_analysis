package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0739, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0739 extends C09AY implements Function0<Boolean> {
    public AnonymousClass0739() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        AnonymousClass0737.LIZ.getClass();
        int iIntValue = ((Number) AnonymousClass0737.LIZLLL.getValue()).intValue();
        int i = AnonymousClass0737.LIZIZ;
        return Boolean.valueOf((iIntValue & i) == i);
    }
}
