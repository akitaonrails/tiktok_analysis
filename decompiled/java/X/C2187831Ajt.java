package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Ajt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187831Ajt extends C09AY implements Function0<Boolean> {
    public C2187831Ajt() {
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
                C2187841Aju.LIZ.getClass();
                int iLIZ = C2187841Aju.LIZ();
                int i = C2187841Aju.LJIIIZ;
                if ((iLIZ & i) != i) {
                    int iLIZ2 = C2187841Aju.LIZ();
                    int i2 = C2187841Aju.LJIIJ;
                    if ((iLIZ2 & i2) != i2) {
                        int iLIZ3 = C2187841Aju.LIZ();
                        int i3 = C2187841Aju.LJIIJJI;
                        if ((iLIZ3 & i3) != i3) {
                            zLJJIFFI = false;
                        }
                    }
                }
            }
            zLJJIFFI = true;
        }
        return Boolean.valueOf(zLJJIFFI);
    }
}
