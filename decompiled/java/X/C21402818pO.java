package X;

import androidx.emoji2.text.e;
import java.text.BreakIterator;

/* JADX INFO: renamed from: X.18pO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21402818pO {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LIZ(int r12, java.lang.String r13) {
        /*
            boolean r0 = androidx.emoji2.text.e.LJ()
            r4 = 0
            r10 = 1
            r6 = r13
            if (r0 == 0) goto L6f
            androidx.emoji2.text.e r1 = androidx.emoji2.text.e.LIZ()
            int r0 = r1.LIZJ()
            if (r0 != r10) goto L6f
            X.18pQ r0 = r1.LJ
            X.18pT r5 = r0.LIZIZ
            r5.getClass()
            r2 = -1
            if (r12 < 0) goto L6d
            int r0 = r6.length()
            if (r12 >= r0) goto L6d
            boolean r0 = r6 instanceof android.text.Spanned
            if (r0 == 0) goto L4c
            r3 = r6
            android.text.Spanned r3 = (android.text.Spanned) r3
            int r1 = r12 + 1
            java.lang.Class<X.18pU> r0 = X.AbstractC21403418pU.class
            java.lang.Object[] r1 = r3.getSpans(r12, r1, r0)
            X.18pU[] r1 = (X.AbstractC21403418pU[]) r1
            int r0 = r1.length
            if (r0 <= 0) goto L4c
            r0 = r1[r4]
            int r0 = r3.getSpanEnd(r0)
        L3d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 == r2) goto L6f
            int r0 = r1.intValue()
            return r0
        L4c:
            int r0 = r12 + (-16)
            int r7 = java.lang.Math.max(r4, r0)
            int r1 = r6.length()
            int r0 = r12 + 16
            int r8 = java.lang.Math.min(r1, r0)
            r9 = 2147483647(0x7fffffff, float:NaN)
            X.18pb r11 = new X.18pb
            r11.<init>(r12)
            java.lang.Object r0 = r5.LIZJ(r6, r7, r8, r9, r10, r11)
            X.18pb r0 = (X.C21404118pb) r0
            int r0 = r0.LIZJ
            goto L3d
        L6d:
            r0 = -1
            goto L3d
        L6f:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r6)
            int r0 = r0.following(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21402818pO.LIZ(int, java.lang.String):int");
    }

    public static final int LIZIZ(int i, String str) {
        if (e.LJ()) {
            e eVarLIZ = e.LIZ();
            if (eVarLIZ.LIZJ() == 1) {
                Integer numValueOf = Integer.valueOf(eVarLIZ.LIZIZ(Math.max(0, i - 1), str));
                if (numValueOf.intValue() != -1) {
                    return numValueOf.intValue();
                }
            }
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }
}
