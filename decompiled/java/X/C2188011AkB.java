package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AkB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2188011AkB extends C09AY implements Function0<Boolean> {
    public C2188011AkB() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C2188031AkD.LIZ.getClass();
        int iIntValue = ((Number) C2188031AkD.LIZLLL.getValue()).intValue();
        int i = C2188031AkD.LIZIZ;
        return Boolean.valueOf((iIntValue & i) == i);
    }
}
