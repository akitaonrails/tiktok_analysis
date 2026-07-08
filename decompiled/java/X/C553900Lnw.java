package X;

import com.ss.android.ugc.aweme.aikit.api.create.MentionService;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Lnw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C553900Lnw implements InterfaceC554050LoB {
    public final /* synthetic */ C553830Lnp LIZ;

    public C553900Lnw(C553830Lnp c553830Lnp) {
        this.LIZ = c553830Lnp;
    }

    @Override // X.InterfaceC554050LoB
    public final Object LIZJ(C554150LoL c554150LoL) {
        MentionService mentionService = this.LIZ.LLJJJJ;
        if (mentionService != null) {
            return mentionService.LJ(c554150LoL);
        }
        return null;
    }

    @Override // X.InterfaceC554050LoB
    public final Object LJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        MentionService mentionService = this.LIZ.LLJJJJ;
        if (mentionService != null) {
            Object objLJI = mentionService.LJI(interfaceC1364105Vn);
            if (objLJI == C099R.LJFF()) {
                return objLJI;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    @Override // X.InterfaceC554050LoB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List r6, X.InterfaceC1364105Vn r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C553930Lnz
            if (r0 == 0) goto L3c
            r4 = r7
            X.0Lnz r4 = (X.C553930Lnz) r4
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
            X.0Lnz r4 = new X.0Lnz
            r4.<init>(r5, r7)
            goto L12
        L42:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C553900Lnw.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    @Override // X.InterfaceC554050LoB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List<com.ss.android.ugc.aweme.creative.model.common.MentionDataItem> r6, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.creative.model.common.MentionDataItem>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C553940Lo0
            if (r0 == 0) goto L39
            r4 = r7
            X.0Lo0 r4 = (X.C553940Lo0) r4
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
            X.0Lo0 r4 = new X.0Lo0
            r4.<init>(r5, r7)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C553900Lnw.LIZIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    @Override // X.InterfaceC554050LoB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r11, java.util.List<java.lang.Long> r12, X.InterfaceC1364105Vn<? super kotlin.Pair<? extends java.util.List<com.ss.android.ugc.aweme.creative.model.common.MentionDataItem>, java.lang.Boolean>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C553950Lo1
            if (r0 == 0) goto L49
            r9 = r13
            X.0Lo1 r9 = (X.C553950Lo1) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r9.LLILLL = r2
        L12:
            java.lang.Object r0 = r9.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r9.LLILLL
            r1 = 1
            if (r2 == 0) goto L31
            if (r2 != r1) goto L4f
            X.C155000ia.LIZIZ(r0)
        L22:
            if (r0 != 0) goto L30
        L24:
            kotlin.Pair r0 = new kotlin.Pair
            X.13BV r2 = X.C13BV.INSTANCE
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.<init>(r2, r1)
        L30:
            return r0
        L31:
            X.C155000ia.LIZIZ(r0)
            X.0Lnp r0 = r10.LIZ
            com.ss.android.ugc.aweme.aikit.api.create.MentionService r4 = r0.LLJJJJ
            if (r4 == 0) goto L24
            java.lang.String r7 = "ai_cast"
            r9.LLILLL = r1
            r6 = 20
            r8 = r12
            r5 = r11
            java.lang.Object r0 = r4.LIZLLL(r5, r6, r7, r8, r9)
            if (r0 != r3) goto L22
            return r3
        L49:
            X.0Lo1 r9 = new X.0Lo1
            r9.<init>(r10, r13)
            goto L12
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C553900Lnw.LIZLLL(int, java.util.List, X.05Vn):java.lang.Object");
    }
}
