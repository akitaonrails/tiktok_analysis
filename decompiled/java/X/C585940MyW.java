package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C585940MyW extends C09AY implements Function0<Boolean> {
    public C585940MyW() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C585930MyV.LIZ.getClass();
        int iIntValue = ((Number) C585930MyV.LIZLLL.getValue()).intValue();
        int i = C585930MyV.LIZIZ;
        return Boolean.valueOf((iIntValue & i) == i);
    }
}
