package X;

/* JADX INFO: renamed from: X.0pCb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502510pCb implements InterfaceC1502430pCT {
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    @Override // X.InterfaceC1502430pCT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.Map<java.lang.String, ? extends java.lang.Object> r12, java.util.Map<java.lang.String, ? extends java.lang.Object> r13, X.C1757320vpa r14, X.InterfaceC1364105Vn<? super X.C1502470pCX> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof X.C1502520pCc
            if (r0 == 0) goto L72
            r6 = r15
            X.0pCc r6 = (X.C1502520pCc) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 6
            r3 = 0
            r7 = 1
            if (r0 == 0) goto L2c
            if (r0 != r7) goto L78
            X.C155000ia.LIZIZ(r1)
        L24:
            X.0pCX r1 = new X.0pCX
            X.0pCY r0 = X.EnumC1502480pCY.SUCCESS
            r1.<init>(r0, r3, r3, r4)
            return r1
        L2c:
            X.C155000ia.LIZIZ(r1)
            if (r12 == 0) goto L80
            java.lang.String r0 = "delay_time"
            java.lang.Object r10 = r12.get(r0)
            if (r10 == 0) goto L80
            boolean r0 = r10 instanceof java.lang.Long
            if (r0 == 0) goto L58
            java.lang.Long r10 = (java.lang.Long) r10
        L3f:
            if (r10 == 0) goto L80
            long r8 = r10.longValue()
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L80
            long r0 = r10.longValue()
            r6.LLILLL = r7
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r6)
            if (r0 != r5) goto L24
            return r5
        L58:
            boolean r0 = r10 instanceof java.lang.Number
            if (r0 == 0) goto L67
            java.lang.Number r10 = (java.lang.Number) r10
            long r0 = r10.longValue()
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            goto L3f
        L67:
            boolean r0 = r10 instanceof java.lang.String
            if (r0 == 0) goto L80
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Long r10 = X.C2095008Iq.LJIILIIL(r10)
            goto L3f
        L72:
            X.0pCc r6 = new X.0pCc
            r6.<init>(r11, r15)
            goto L12
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L80:
            X.0pCX r1 = new X.0pCX
            X.0pCY r0 = X.EnumC1502480pCY.INVALID_INPUT_PARAMS
            r1.<init>(r0, r3, r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1502510pCb.LIZ(java.util.Map, java.util.Map, X.0vpa, X.05Vn):java.lang.Object");
    }
}
