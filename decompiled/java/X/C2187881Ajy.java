package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: renamed from: X.1Ajy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187881Ajy extends C09AY implements Function0<Boolean> {
    public C2187881Ajy() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean zLJJIJ;
        if (C104100aN.LIZ().isNewUser()) {
            zLJJIJ = C104100aN.LIZ().LJJIJ(AFwS224S0000000_33.get$arr$(665));
        } else {
            int iLIZ = C2187891Ajz.LIZ();
            C2187951Ak5.LIZ.getClass();
            int i = C2187951Ak5.LJIIJ;
            zLJJIJ = (iLIZ & i) == i;
        }
        return Boolean.valueOf(zLJJIJ);
    }
}
