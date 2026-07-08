package X;

/* JADX INFO: renamed from: X.13uD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20158713uD {
    public static C20159013uG LIZIZ(String str, boolean z, C20159213uI c20159213uI, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        Integer numLJIIJJI = null;
        if ((i & 8) != 0 || c20159213uI == null) {
            c20159213uI = C20159213uI.LJII;
        }
        if (str != null) {
            EnumC20158813uE.Companion.getClass();
            EnumC20158813uE enumC20158813uELIZ = C20159113uH.LIZ(str);
            EnumC20158813uE enumC20158813uE = EnumC20158813uE.DP;
            if (enumC20158813uELIZ == enumC20158813uE) {
                return new C20159013uG(enumC20158813uE, c20159213uI.LIZJ(enumC20158813uE, C2327809Ae.LJIIIIZZ(str.substring(0, str.length() - enumC20158813uE.getSuffix().length())), z), c20159213uI);
            }
            EnumC20158813uE enumC20158813uE2 = EnumC20158813uE.RPX;
            if (enumC20158813uELIZ == enumC20158813uE2) {
                return new C20159013uG(enumC20158813uE2, c20159213uI.LIZJ(enumC20158813uE2, C2327809Ae.LJIIIIZZ(str.substring(0, str.length() - enumC20158813uE2.getSuffix().length())), z), c20159213uI);
            }
        }
        EnumC20158813uE enumC20158813uE3 = EnumC20158813uE.PIX;
        if (str != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(str);
        }
        return new C20159013uG(enumC20158813uE3, numLJIIJJI, c20159213uI);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(X.EnumC20159313uJ r6, int r7, java.util.List r8, java.lang.Integer r9, X.EnumC20158513uB r10) {
        /*
            java.util.Iterator r1 = r8.iterator()
            r5 = 0
            r3 = 0
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            if (r7 >= r4) goto L80
            if (r4 != 0) goto L1b
        L1a:
            r4 = r3
        L1b:
            r2 = 1
            if (r4 <= 0) goto L21
            if (r3 > 0) goto L4e
            r5 = r4
        L21:
            X.13uB r0 = X.EnumC20158513uB.PLUS
            if (r10 == r0) goto L31
            X.13uB r0 = X.EnumC20158513uB.FIRST_PLUS
            if (r10 != r0) goto L82
            if (r9 == 0) goto L82
            int r0 = r9.intValue()
            if (r0 != 0) goto L82
        L31:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            int r0 = r8.indexOf(r0)
            int r1 = r0 + 1
            if (r1 <= 0) goto L82
            int r0 = r8.size()
            if (r1 >= r0) goto L82
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L4e:
            int[] r1 = X.C20159413uK.LIZ
            int r0 = r6.ordinal()
            r1 = r1[r0]
            if (r1 == r2) goto L7c
            r0 = 2
            if (r1 == r0) goto L6a
            r0 = 3
            if (r1 == r0) goto L75
            r0 = 4
            if (r1 == r0) goto L7e
            r0 = 5
            if (r1 == r0) goto L7b
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L6a:
            float r2 = (float) r7
            float r0 = (float) r3
            float r1 = r2 / r0
            float r0 = (float) r4
            float r0 = r0 / r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L7e
            goto L7b
        L75:
            int r1 = r7 - r3
            int r0 = r4 - r7
            if (r1 > r0) goto L7e
        L7b:
            r7 = r3
        L7c:
            r5 = r7
            goto L21
        L7e:
            r7 = r4
            goto L7c
        L80:
            r3 = r4
            goto L6
        L82:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20158713uD.LIZ(X.13uJ, int, java.util.List, java.lang.Integer, X.13uB):int");
    }
}
