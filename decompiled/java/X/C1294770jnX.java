package X;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jnX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294770jnX {
    public static final C1296750jqj LIZ = C1296750jqj.LIZ("x", "y");

    public static int LIZ(AbstractC1295900jpM abstractC1295900jpM) {
        abstractC1295900jpM.LIZ();
        int iLJIILLIIL = (int) (abstractC1295900jpM.LJIILLIIL() * 255.0d);
        int iLJIILLIIL2 = (int) (abstractC1295900jpM.LJIILLIIL() * 255.0d);
        int iLJIILLIIL3 = (int) (abstractC1295900jpM.LJIILLIIL() * 255.0d);
        while (abstractC1295900jpM.LJII()) {
            abstractC1295900jpM.LJJJ();
        }
        abstractC1295900jpM.LIZLLL();
        return Color.argb(255, iLJIILLIIL, iLJIILLIIL2, iLJIILLIIL3);
    }

    public static float LIZLLL(AbstractC1295900jpM abstractC1295900jpM) {
        EnumC1295540jom enumC1295540jomLJIJJLI = abstractC1295900jpM.LJIJJLI();
        int i = C1295530jol.LIZ[enumC1295540jomLJIJJLI.ordinal()];
        if (i != 1) {
            if (i == 2) {
                abstractC1295900jpM.LIZ();
                float fLJIILLIIL = (float) abstractC1295900jpM.LJIILLIIL();
                while (abstractC1295900jpM.LJII()) {
                    abstractC1295900jpM.LJJJ();
                }
                abstractC1295900jpM.LIZLLL();
                return fLJIILLIIL;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unknown value for token of type ");
            sbLIZ.append(enumC1295540jomLJIJJLI);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return (float) abstractC1295900jpM.LJIILLIIL();
    }

    public static PointF LIZIZ(AbstractC1295900jpM abstractC1295900jpM, float f) {
        int i = C1295530jol.LIZ[abstractC1295900jpM.LJIJJLI().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    abstractC1295900jpM.LIZIZ();
                    float fLIZLLL = 0.0f;
                    float fLIZLLL2 = 0.0f;
                    while (abstractC1295900jpM.LJII()) {
                        int iLJJIL = abstractC1295900jpM.LJJIL(LIZ);
                        if (iLJJIL != 0) {
                            if (iLJJIL != 1) {
                                abstractC1295900jpM.LJJIZ();
                                abstractC1295900jpM.LJJJ();
                            } else {
                                fLIZLLL2 = LIZLLL(abstractC1295900jpM);
                            }
                        } else {
                            fLIZLLL = LIZLLL(abstractC1295900jpM);
                        }
                    }
                    abstractC1295900jpM.LJFF();
                    return new PointF(fLIZLLL * f, fLIZLLL2 * f);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown point starts with ");
                sbLIZ.append(abstractC1295900jpM.LJIJJLI());
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            abstractC1295900jpM.LIZ();
            float fLJIILLIIL = (float) abstractC1295900jpM.LJIILLIIL();
            float fLJIILLIIL2 = (float) abstractC1295900jpM.LJIILLIIL();
            while (abstractC1295900jpM.LJIJJLI() != EnumC1295540jom.END_ARRAY) {
                abstractC1295900jpM.LJJJ();
            }
            abstractC1295900jpM.LIZLLL();
            return new PointF(fLJIILLIIL * f, fLJIILLIIL2 * f);
        }
        float fLJIILLIIL3 = (float) abstractC1295900jpM.LJIILLIIL();
        float fLJIILLIIL4 = (float) abstractC1295900jpM.LJIILLIIL();
        while (abstractC1295900jpM.LJII()) {
            abstractC1295900jpM.LJJJ();
        }
        return new PointF(fLJIILLIIL3 * f, fLJIILLIIL4 * f);
    }

    public static List<PointF> LIZJ(AbstractC1295900jpM abstractC1295900jpM, float f) {
        ArrayList arrayList = new ArrayList();
        abstractC1295900jpM.LIZ();
        while (abstractC1295900jpM.LJIJJLI() == EnumC1295540jom.BEGIN_ARRAY) {
            abstractC1295900jpM.LIZ();
            arrayList.add(LIZIZ(abstractC1295900jpM, f));
            abstractC1295900jpM.LIZLLL();
        }
        abstractC1295900jpM.LIZLLL();
        return arrayList;
    }
}
