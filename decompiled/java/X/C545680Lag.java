package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Lag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.helper.PostedDraftHelper$clearExpiredPostedDrafts$2", f = "PostedDraftHelper.kt", l = {59, 68}, m = "invokeSuspend")
public final class C545680Lag extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;

    public C545680Lag(InterfaceC1364105Vn<? super C545680Lag> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C545680Lag(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            r17 = this;
            r2 = r18
            java.lang.String r9 = "PostedDraftHelper@4019.clearExpiredPostedDrafts$2"
            X.C1C7U.LIZ(r9)
            java.lang.Object r4 = X.C099R.LJFF()
            r5 = r17
            int r0 = r5.LLILLJJLI
            r6 = 0
            r3 = 2
            r8 = 1
            if (r0 == 0) goto L4a
            if (r0 == r8) goto L79
            if (r0 != r3) goto Lae
            java.lang.Object r1 = r5.LL
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.C155000ia.LIZIZ(r2)
        L1f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r11 = r1.next()
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r11 = (com.ss.android.ugc.aweme.draft.model.AwemeDraft) r11
            X.0MYl r10 = new X.0MYl
            X.0LzJ r12 = new X.0LzJ
            java.lang.String r0 = "clearBeyondExpiryPostedDrafts"
            r12.<init>(r0, r0)
            r13 = 0
            r14 = 0
            r16 = 124(0x7c, float:1.74E-43)
            r15 = r14
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r5.LL = r1
            r5.LLILLJJLI = r3
            java.lang.Object r0 = X.C570340MYm.LIZ(r10, r5)
            if (r0 != r4) goto L1f
            X.C1C7U.LIZIZ(r9)
            return r4
        L4a:
            X.C155000ia.LIZIZ(r2)
            X.0Jhs r0 = X.C499180Jhs.LIZ
            boolean r7 = X.C297360Bl8.LIZ()
            com.bytedance.keva.Keva r2 = X.C499180Jhs.LIZJ
            java.lang.String r1 = "posted_draft_support_reediting_last_status"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            r2.storeBoolean(r1, r7)
            if (r7 != 0) goto L63
            if (r0 == 0) goto Lb6
        L63:
            r5.LLILLJJLI = r8
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0Jhv r1 = new X.0Jhv
            r0 = 86400000(0x5265c00, float:7.82218E-36)
            r1.<init>(r0, r6)
            java.lang.Object r2 = X.C23250099c.LJI(r5, r2, r1)
            if (r2 != r4) goto L7c
            X.C1C7U.LIZIZ(r9)
            return r4
        L79:
            X.C155000ia.LIZIZ(r2)
        L7c:
            r0 = r2
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L88
            r6 = r2
        L88:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto Lb6
            X.0JfW r1 = X.C497720JfW.LIZ
            int r0 = r6.size()
            r1.getClass()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r1 = "draft_cnt"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.put(r1, r0)
            java.lang.String r0 = "delete_expired_posted_draft"
            X.C20684815ws.LJIILLIIL(r0, r2)
            java.util.Iterator r1 = r6.iterator()
            goto L1f
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb6:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C545680Lag.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C545680Lag(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
