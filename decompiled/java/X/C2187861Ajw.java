package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Ajw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187861Ajw extends C09AY implements Function0<Boolean> {
    public C2187861Ajw() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean zLJJIFFI;
        if (C104100aN.LIZ().isNewUser()) {
            zLJJIFFI = C2187851Ajv.LIZ();
        } else if (C104100aN.LIZ().LJIIZILJ()) {
            zLJJIFFI = C104100aN.LIZ().LJJIFFI();
        } else {
            if (C104100aN.LIZ().LJIIIZ()) {
                C104100aN.LIZ().LJ();
            } else {
                int iLIZ = C2187891Ajz.LIZ();
                C2187951Ak5.LIZ.getClass();
                int i = C2187951Ak5.LJIIL;
                if ((iLIZ & i) != i) {
                    zLJJIFFI = false;
                }
            }
            zLJJIFFI = true;
        }
        return Boolean.valueOf(zLJJIFFI);
    }
}
