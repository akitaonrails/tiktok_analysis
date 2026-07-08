package X;

/* JADX INFO: renamed from: X.19ON, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19ON {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C19OK LIZ(X.C19OA r7, int r8, java.util.ArrayList<X.C19OK> r9, X.C19OK r10) {
        /*
            if (r8 != 0) goto L11
            int r3 = r7.horizontalGroup
        L4:
            r5 = 0
            r6 = -1
            if (r3 == r6) goto L32
            if (r10 == 0) goto L14
            int r0 = r10.LIZIZ
            if (r3 != r0) goto L14
            if (r3 == r6) goto L32
            return r10
        L11:
            int r3 = r7.verticalGroup
            goto L4
        L14:
            r2 = 0
        L15:
            int r0 = r9.size()
            if (r2 >= r0) goto L32
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r2)
            X.19OK r1 = (X.C19OK) r1
            int r0 = r1.LIZIZ
            if (r0 != r3) goto L2f
            if (r10 == 0) goto L2d
            r10.LIZLLL(r8, r1)
            r9.remove(r10)
        L2d:
            r10 = r1
            goto L73
        L2f:
            int r2 = r2 + 1
            goto L15
        L32:
            r4 = 1
            if (r10 != 0) goto L73
            boolean r0 = r7 instanceof X.C21530019Nq
            if (r0 == 0) goto L6b
            r3 = r7
            X.19Nq r3 = (X.C21530019Nq) r3
            r1 = 0
        L3d:
            int r0 = r3.LIZIZ
            if (r1 >= r0) goto L6b
            X.19OA[] r0 = r3.LIZ
            r0 = r0[r1]
            if (r8 != 0) goto L61
            int r2 = r0.horizontalGroup
            if (r2 == r6) goto L68
        L4b:
            if (r2 == r6) goto L6b
            r1 = 0
        L4e:
            int r0 = r9.size()
            if (r1 >= r0) goto L6b
            java.lang.Object r10 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r1)
            X.19OK r10 = (X.C19OK) r10
            int r0 = r10.LIZIZ
            if (r0 == r2) goto L70
            int r1 = r1 + 1
            goto L4e
        L61:
            if (r8 != r4) goto L68
            int r2 = r0.verticalGroup
            if (r2 == r6) goto L68
            goto L4b
        L68:
            int r1 = r1 + 1
            goto L3d
        L6b:
            X.19OK r10 = new X.19OK
            r10.<init>(r8)
        L70:
            r9.add(r10)
        L73:
            boolean r0 = r10.LIZ(r7)
            if (r0 == 0) goto L9f
            boolean r0 = r7 instanceof X.C19OI
            if (r0 == 0) goto L8a
            r0 = r7
            X.19OI r0 = (X.C19OI) r0
            X.19OG r1 = r0.LIZLLL
            int r0 = r0.LJ
            if (r0 != 0) goto L87
            r5 = 1
        L87:
            r1.LIZJ(r5, r10, r9)
        L8a:
            if (r8 != 0) goto La0
            int r0 = r10.LIZIZ
            r7.horizontalGroup = r0
            X.19OG r0 = r7.mLeft
            r0.LIZJ(r8, r10, r9)
            X.19OG r0 = r7.mRight
            r0.LIZJ(r8, r10, r9)
        L9a:
            X.19OG r0 = r7.mCenter
            r0.LIZJ(r8, r10, r9)
        L9f:
            return r10
        La0:
            int r0 = r10.LIZIZ
            r7.verticalGroup = r0
            X.19OG r0 = r7.mTop
            r0.LIZJ(r8, r10, r9)
            X.19OG r0 = r7.mBaseline
            r0.LIZJ(r8, r10, r9)
            X.19OG r0 = r7.mBottom
            r0.LIZJ(r8, r10, r9)
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19ON.LIZ(X.19OA, int, java.util.ArrayList, X.19OK):X.19OK");
    }

    public static boolean LIZIZ(C19O3 c19o3, C19O3 c19o32, C19O3 c19o33, C19O3 c19o34) {
        boolean z;
        boolean z2;
        C19O3 c19o35;
        C19O3 c19o36;
        C19O3 c19o37 = C19O3.FIXED;
        if (c19o33 == c19o37 || c19o33 == (c19o36 = C19O3.WRAP_CONTENT) || (c19o33 == C19O3.MATCH_PARENT && c19o3 != c19o36)) {
            z = true;
        } else {
            z = false;
        }
        if (c19o34 == c19o37 || c19o34 == (c19o35 = C19O3.WRAP_CONTENT) || (c19o34 == C19O3.MATCH_PARENT && c19o32 != c19o35)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }
}
