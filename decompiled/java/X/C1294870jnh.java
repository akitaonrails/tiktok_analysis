package X;

import android.graphics.Color;
import android.graphics.PointF;

/* JADX INFO: renamed from: X.0jnh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294870jnh {
    public static C1295450jod LIZ(C1296380jq8 c1296380jq8, C1294720jnS c1294720jnS) {
        return new C1295450jod(C1294800jna.LIZ(c1296380jq8, c1294720jnS, 1.0f, new InterfaceC1295730jp5<Integer>() { // from class: X.0jnl
            @Override // X.InterfaceC1295730jp5
            public final Integer LIZ(AbstractC1295900jpM abstractC1295900jpM, float f) {
                boolean z;
                double dLJIILLIIL;
                if (abstractC1295900jpM.LJIJJLI() == EnumC1295540jom.BEGIN_ARRAY) {
                    z = true;
                    abstractC1295900jpM.LIZ();
                } else {
                    z = false;
                }
                double dLJIILLIIL2 = abstractC1295900jpM.LJIILLIIL();
                double dLJIILLIIL3 = abstractC1295900jpM.LJIILLIIL();
                double dLJIILLIIL4 = abstractC1295900jpM.LJIILLIIL();
                if (abstractC1295900jpM.LJIJJLI() == EnumC1295540jom.NUMBER) {
                    dLJIILLIIL = abstractC1295900jpM.LJIILLIIL();
                } else {
                    dLJIILLIIL = 1.0d;
                }
                if (z) {
                    abstractC1295900jpM.LIZLLL();
                }
                if (dLJIILLIIL2 <= 1.0d && dLJIILLIIL3 <= 1.0d && dLJIILLIIL4 <= 1.0d) {
                    dLJIILLIIL2 *= 255.0d;
                    dLJIILLIIL3 *= 255.0d;
                    dLJIILLIIL4 *= 255.0d;
                    if (dLJIILLIIL <= 1.0d) {
                        dLJIILLIIL *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dLJIILLIIL, (int) dLJIILLIIL2, (int) dLJIILLIIL3, (int) dLJIILLIIL4));
            }
        }, false));
    }

    public static C1295460joe LIZJ(C1296380jq8 c1296380jq8, C1294720jnS c1294720jnS) {
        return new C1295460joe(C1294800jna.LIZ(c1296380jq8, c1294720jnS, 1.0f, new InterfaceC1295730jp5<Integer>() { // from class: X.0jon
            @Override // X.InterfaceC1295730jp5
            public final Integer LIZ(AbstractC1295900jpM abstractC1295900jpM, float f) {
                return Integer.valueOf(Math.round(C1294770jnX.LIZLLL(abstractC1295900jpM) * f));
            }
        }, false));
    }

    public static C1294640jnK LIZLLL(C1296380jq8 c1296380jq8, C1294720jnS c1294720jnS) {
        return new C1294640jnK(C1294800jna.LIZ(c1296380jq8, c1294720jnS, C1294350jmr.LIZJ(), new InterfaceC1295730jp5<PointF>() { // from class: X.0jnf
            @Override // X.InterfaceC1295730jp5
            public final PointF LIZ(AbstractC1295900jpM abstractC1295900jpM, float f) {
                EnumC1295540jom enumC1295540jomLJIJJLI = abstractC1295900jpM.LJIJJLI();
                if (enumC1295540jomLJIJJLI == EnumC1295540jom.BEGIN_ARRAY) {
                    return C1294770jnX.LIZIZ(abstractC1295900jpM, f);
                }
                if (enumC1295540jomLJIJJLI == EnumC1295540jom.BEGIN_OBJECT) {
                    return C1294770jnX.LIZIZ(abstractC1295900jpM, f);
                }
                if (enumC1295540jomLJIJJLI == EnumC1295540jom.NUMBER) {
                    PointF pointF = new PointF(((float) abstractC1295900jpM.LJIILLIIL()) * f, ((float) abstractC1295900jpM.LJIILLIIL()) * f);
                    while (abstractC1295900jpM.LJII()) {
                        abstractC1295900jpM.LJJJ();
                    }
                    return pointF;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Cannot convert json to point. Next token is ");
                sbLIZ.append(enumC1295540jomLJIJJLI);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }, true));
    }

    public static C1295020jnw LIZIZ(AbstractC1295900jpM abstractC1295900jpM, C1294720jnS c1294720jnS, boolean z) {
        float fLIZJ;
        if (z) {
            fLIZJ = C1294350jmr.LIZJ();
        } else {
            fLIZJ = 1.0f;
        }
        return new C1295020jnw(C1294800jna.LIZ(abstractC1295900jpM, c1294720jnS, fLIZJ, new InterfaceC1295730jp5<Float>() { // from class: X.0jow
            @Override // X.InterfaceC1295730jp5
            public final Float LIZ(AbstractC1295900jpM abstractC1295900jpM2, float f) {
                return Float.valueOf(C1294770jnX.LIZLLL(abstractC1295900jpM2) * f);
            }
        }, false));
    }
}
