package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C585920MyU extends C09AY implements Function0<Boolean> {
    public C585920MyU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C585930MyV.LIZ.getClass();
        int iIntValue = ((Number) C585930MyV.LIZLLL.getValue()).intValue();
        int i = C585930MyV.LIZJ;
        return Boolean.valueOf((iIntValue & i) == i);
    }
}
