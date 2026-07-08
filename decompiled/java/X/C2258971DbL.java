package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2258971DbL extends C09AY implements Function0<Boolean> {
    public C2258971DbL() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean zIsNewUser;
        if (C104100aN.LIZ().isNewUser()) {
            zIsNewUser = C104100aN.LIZ().isNewUser();
        } else {
            int iIntValue = ((Number) C2258961DbK.LIZ.getValue()).intValue();
            C2258981DbM.LIZ.getClass();
            int i = C2258981DbM.LIZIZ;
            zIsNewUser = (iIntValue & i) == i;
        }
        return Boolean.valueOf(zIsNewUser);
    }
}
