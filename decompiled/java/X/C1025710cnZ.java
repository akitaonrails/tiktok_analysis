package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0cnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025710cnZ {
    public static final C1025720cna LIZ(AbstractC1025700cnY abstractC1025700cnY, Context context) {
        if (!(abstractC1025700cnY instanceof AbstractC1025450cn9)) {
            return new C1025720cna(-1.0f, null, null, -1, Boolean.FALSE, -1, -1, Boolean.FALSE);
        }
        AbstractC1025450cn9 abstractC1025450cn9 = (AbstractC1025450cn9) abstractC1025700cnY;
        C1025720cna c1025720cna = new C1025720cna(0.0f, Boolean.valueOf(abstractC1025450cn9.LIZJ), Boolean.valueOf(abstractC1025450cn9.LIZIZ), 0, Boolean.FALSE, 0, 0, Boolean.FALSE);
        if (abstractC1025450cn9 instanceof C1025470cnB) {
            c1025720cna.setVariant(3);
            c1025720cna.setDefaultHeightRatio(((C1025470cnB) abstractC1025700cnY).LJIIJ);
        } else {
            if (abstractC1025450cn9 instanceof C1025730cnb) {
                int iLIZJ = C418440Gaw.LIZJ(context);
                c1025720cna.setVariant(2);
                float f = iLIZJ;
                C1025730cnb c1025730cnb = (C1025730cnb) abstractC1025700cnY;
                c1025720cna.setPeekHeight((int) (c1025730cnb.LJIIJ * f));
                c1025720cna.setDynamicHeight((int) (f * c1025730cnb.LJIIJJI));
                return c1025720cna;
            }
            if (abstractC1025450cn9 instanceof C1025740cnc) {
                c1025720cna.setVariant(1);
                c1025720cna.setDefaultHeightRatio(((C1025740cnc) abstractC1025700cnY).LJIIJ);
                return c1025720cna;
            }
        }
        return c1025720cna;
    }
}
