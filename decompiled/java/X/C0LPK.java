package X;

import java.util.List;

/* JADX INFO: renamed from: X.0LPK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LPK implements InterfaceC534890KyN {
    @Override // X.InterfaceC534890KyN
    public final int LIZ() {
        return 2;
    }

    @Override // X.InterfaceC534890KyN
    public final C11NZ<List<C535020Kya>> LIZIZ(C534900KyO c534900KyO) {
        return C538760LBa.LIZIZ(C11NZ.LJIJJLI(new C581220Mqu(c534900KyO, this, 4)), "AiEffectCDS", "fetchAiContentList");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C1346605Ou r11, X.InterfaceC1364105Vn<? super java.lang.String> r12) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LPK.LIZJ(X.05Ou, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c2 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0063 -> B:14:0x003f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0125 -> B:47:0x0141). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0147 -> B:51:0x0148). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.Set<java.lang.String> r20, X.InterfaceC1364105Vn<? super java.util.List<X.C535020Kya>> r21) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LPK.LIZLLL(java.util.Set, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.draft.model.AwemeDraft r19, X.InterfaceC1364105Vn<? super X.C535020Kya> r20) {
        /*
            r18 = this;
            r3 = r20
            r4 = r19
            boolean r0 = r3 instanceof X.C535000KyY
            if (r0 == 0) goto L56
            r5 = r3
            X.0KyY r5 = (X.C535000KyY) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r5.LLILZ = r2
        L16:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            r9 = 0
            if (r0 == 0) goto L32
            if (r0 != r2) goto L89
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r4 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L29:
            java.util.List r1 = (java.util.List) r1
            X.0LSZ r1 = X.C0LAK.LIZ(r1)
            if (r1 != 0) goto L5e
            return r9
        L32:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r0 = r4.LIZ()
            int r0 = r0.length()
            if (r0 != 0) goto L40
            return r9
        L40:
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r1 = X.C09BV.LIZ()
            if (r1 != 0) goto L47
            return r9
        L47:
            java.lang.String r0 = r4.LIZ()
            r5.LL = r4
            r5.LLILZ = r2
            java.lang.Object r1 = r1.LJJIJLIJ(r0, r5)
            if (r1 != r3) goto L29
            return r3
        L56:
            X.0KyY r5 = new X.0KyY
            r0 = r18
            r5.<init>(r0, r3)
            goto L16
        L5e:
            java.lang.String r0 = r1.LJIILIIL
            boolean r0 = X.C538760LBa.LIZ(r0)
            if (r0 == 0) goto L68
            java.lang.String r9 = r1.LJIILIIL
        L68:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r4.LIZ
            com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel r0 = r0.aigcOfflineModel
            X.0Kya r2 = new X.0Kya
            java.lang.String r3 = r4.LIZ()
            java.lang.String r4 = r1.LIZ
            r5 = 3
            r6 = 2
            r7 = 0
            r10 = 0
            java.lang.String r12 = r0.propName
            java.lang.String r13 = r0.propId
            java.lang.String r14 = r0.iconUrl
            long r15 = r1.LJIJJ
            r17 = 41328(0xa170, float:5.7913E-41)
            r8 = r7
            r11 = r7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17)
            return r2
        L89:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LPK.LJ(com.ss.android.ugc.aweme.draft.model.AwemeDraft, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(kotlin.Pair<java.lang.String, X.C552940LmO> r22, com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r23, X.InterfaceC1364105Vn<? super X.C535020Kya> r24) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LPK.LJFF(kotlin.Pair, com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi, X.05Vn):java.lang.Object");
    }
}
