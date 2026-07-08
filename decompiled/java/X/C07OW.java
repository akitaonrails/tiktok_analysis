package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07OW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07OW extends C09AY implements Function0<Boolean> {
    public C07OW() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int iLIZ = C07OX.LIZ();
        C07OV.LIZ.getClass();
        int i = C07OV.LIZJ;
        return Boolean.valueOf((iLIZ & i) == i);
    }
}
