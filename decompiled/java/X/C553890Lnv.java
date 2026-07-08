package X;

/* JADX INFO: renamed from: X.0Lnv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C553890Lnv implements InterfaceC555170Lpz {
    public final /* synthetic */ C553830Lnp LIZ;

    @Override // X.InterfaceC555170Lpz
    public final void LIZIZ() {
        this.LIZ.H4(EnumC553970Lo3.NORMAL_INPUT);
    }

    @Override // X.InterfaceC555170Lpz
    public final void LIZJ() {
        this.LIZ.H4(EnumC553970Lo3.USER_CHANGE);
    }

    public C553890Lnv(C553830Lnp c553830Lnp) {
        this.LIZ = c553830Lnp;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    @Override // X.InterfaceC555170Lpz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List r6, X.InterfaceC1364105Vn r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C553920Lny
            if (r0 == 0) goto L3c
            r4 = r7
            X.0Lny r4 = (X.C553920Lny) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L42
            X.C155000ia.LIZIZ(r2)
        L22:
            if (r2 != 0) goto L26
        L24:
            X.13BV r2 = X.C13BV.INSTANCE
        L26:
            return r2
        L27:
            X.C155000ia.LIZIZ(r2)
            X.0Lnp r0 = r5.LIZ
            com.ss.android.ugc.aweme.aikit.api.create.MentionService r2 = r0.LLJJJJ
            if (r2 == 0) goto L24
            r4.LLILLL = r1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0 = 0
            java.lang.Object r2 = r2.LJII(r0, r6, r1, r4)
            if (r2 != r3) goto L22
            return r3
        L3c:
            X.0Lny r4 = new X.0Lny
            r4.<init>(r5, r7)
            goto L12
        L42:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C553890Lnv.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    @Override // X.InterfaceC555170Lpz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List<com.ss.android.ugc.aweme.creative.model.common.MentionDataItem> r6, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.creative.model.common.MentionDataItem>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C553910Lnx
            if (r0 == 0) goto L39
            r4 = r7
            X.0Lnx r4 = (X.C553910Lnx) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L3f
            X.C155000ia.LIZIZ(r3)
        L22:
            if (r3 != 0) goto L26
        L24:
            X.13BV r3 = X.C13BV.INSTANCE
        L26:
            return r3
        L27:
            X.C155000ia.LIZIZ(r3)
            X.0Lnp r0 = r5.LIZ
            com.ss.android.ugc.aweme.aikit.api.create.MentionService r0 = r0.LLJJJJ
            if (r0 == 0) goto L24
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZ(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L39:
            X.0Lnx r4 = new X.0Lnx
            r4.<init>(r5, r7)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C553890Lnv.LIZLLL(java.util.List, X.05Vn):java.lang.Object");
    }
}
