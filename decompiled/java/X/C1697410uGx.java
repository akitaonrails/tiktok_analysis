package X;

/* JADX INFO: renamed from: X.0uGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697410uGx {
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[PHI: r4
      0x0064: PHI (r4v2 X.13Aw) = (r4v1 X.13Aw), (r4v1 X.13Aw), (r4v4 X.13Aw) binds: [B:17:0x0033, B:19:0x0037, B:34:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf A[PHI: r0
      0x00bf: PHI (r0v5 int) = (r0v4 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:53:0x00a1, B:55:0x00a4, B:57:0x00a7, B:59:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[LOOP:2: B:14:0x002b->B:83:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T LIZ(androidx.compose.ui.focus.FocusTargetNode r9, int r10, kotlin.jvm.functions.Function1<? super X.InterfaceC1691390u7F, ? extends T> r11) {
        /*
            X.13dY r0 = r9.LL
            boolean r0 = r0.LLJILLL
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            X.C1696250uF5.LIZIZ(r0)
        Lb:
            X.13dY r0 = r9.LL
            X.13dY r7 = r0.LLILZIL
            X.13dH r6 = X.C20052513d5.LJFF(r9)
        L13:
            r3 = 1
            r8 = 0
            if (r6 == 0) goto L80
            X.13dT r0 = r6.LLJLLIL
            X.13dY r0 = r0.LJ
            int r0 = r0.LLILZ
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L71
        L21:
            if (r7 == 0) goto L71
            int r0 = r7.LLILLL
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L6e
            r5 = r7
            r4 = r8
        L2b:
            boolean r0 = r5 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r0 != 0) goto L81
            int r0 = r5.LLILLL
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L64
            boolean r0 = r5 instanceof X.AbstractC20055313dX
            if (r0 == 0) goto L64
            r0 = r5
            X.13dX r0 = (X.AbstractC20055313dX) r0
            X.13dY r2 = r0.LLJJI
            r1 = 0
        L3f:
            if (r2 == 0) goto L69
            int r0 = r2.LLILLL
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L4c
            int r1 = r1 + 1
            if (r1 != r3) goto L4f
            r5 = r2
        L4c:
            X.13dY r2 = r2.LLILZLL
            goto L3f
        L4f:
            if (r4 != 0) goto L5a
            X.13Aw r4 = new X.13Aw
            r0 = 16
            X.13dY[] r0 = new X.AbstractC20055413dY[r0]
            r4.<init>(r0)
        L5a:
            if (r5 == 0) goto L60
            r4.LIZLLL(r5)
            r5 = r8
        L60:
            r4.LIZLLL(r2)
            goto L4c
        L64:
            X.13dY r5 = X.C20052513d5.LIZIZ(r4)
            goto L6b
        L69:
            if (r1 != r3) goto L64
        L6b:
            if (r5 == 0) goto L6e
            goto L2b
        L6e:
            X.13dY r7 = r7.LLILZIL
            goto L21
        L71:
            X.13dH r6 = r6.LJJIJIL()
            if (r6 == 0) goto L7e
            X.13dT r0 = r6.LLJLLIL
            if (r0 == 0) goto L7e
            X.13dE r7 = r0.LIZLLL
            goto L13
        L7e:
            r7 = r8
            goto L13
        L80:
            r5 = r8
        L81:
            androidx.compose.ui.focus.FocusTargetNode r5 = (androidx.compose.ui.focus.FocusTargetNode) r5
            if (r5 == 0) goto L96
            X.0u77<X.0u7D> r0 = X.C1691340u7A.LIZ
            java.lang.Object r1 = X.C1697420uGy.LIZ(r5, r0)
            java.lang.Object r0 = X.C1697420uGy.LIZ(r9, r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L96
            return r8
        L96:
            X.0u77<X.0u7D> r0 = X.C1691340u7A.LIZ
            java.lang.Object r2 = X.C1697420uGy.LIZ(r9, r0)
            X.0u7D r2 = (X.InterfaceC1691370u7D) r2
            if (r2 == 0) goto Lc6
            r0 = 5
            if (r10 == r0) goto Lbf
            r0 = 6
            if (r10 == r0) goto Lbf
            r0 = 3
            if (r10 == r0) goto Lbf
            r0 = 4
            if (r10 == r0) goto Lbf
            if (r10 == r3) goto Lc1
            r1 = 0
            r0 = 2
            if (r1 != 0) goto Lc1
            if (r10 == r0) goto Lc2
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unsupported direction for beyond bounds layout"
            r0.toString()
            r1.<init>(r0)
            throw r1
        Lbf:
            r3 = r0
            goto Lc2
        Lc1:
            r3 = 2
        Lc2:
            java.lang.Object r8 = r2.LJJLJLI(r3, r11)
        Lc6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1697410uGx.LIZ(androidx.compose.ui.focus.FocusTargetNode, int, kotlin.jvm.functions.Function1):java.lang.Object");
    }
}
