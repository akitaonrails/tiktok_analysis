package X;

import com.ss.android.ugc.profile.business.photo.text.photoboost.PhotoModeBoostedFeedbackResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.photo.text.photoboost.PhotoBoostFeedbackManager$requestView$1", f = "PhotoBoostFeedbackManager.kt", l = {208, 218}, m = "invokeSuspend")
public final class C566000MHu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function1<PhotoModeBoostedFeedbackResponse, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C566000MHu(Function1<? super PhotoModeBoostedFeedbackResponse, Unit> function1, InterfaceC1364105Vn<? super C566000MHu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C566000MHu(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "PhotoBoostFeedbackManager@3864.requestView$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r9.LL
            r5 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L36
            if (r0 != r3) goto L94
            X.C155000ia.LIZIZ(r10)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r10)
            X.0MHw r0 = X.InterfaceC566010MHv.LIZ     // Catch: java.lang.Exception -> L3c
            r0.getClass()     // Catch: java.lang.Exception -> L3c
            X.01GW<X.0MHv> r0 = X.C566020MHw.LIZIZ     // Catch: java.lang.Exception -> L3c
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L3c
            X.0MHv r0 = (X.InterfaceC566010MHv) r0     // Catch: java.lang.Exception -> L3c
            r9.LL = r2     // Catch: java.lang.Exception -> L3c
            java.lang.Object r10 = r0.LIZ(r9)     // Catch: java.lang.Exception -> L3c
            if (r10 != r4) goto L39
            goto L9c
        L36:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Exception -> L3c
        L39:
            com.ss.android.ugc.profile.business.photo.text.photoboost.PhotoModeBoostedFeedbackResponse r10 = (com.ss.android.ugc.profile.business.photo.text.photoboost.PhotoModeBoostedFeedbackResponse) r10     // Catch: java.lang.Exception -> L3c
            goto L5a
        L3c:
            r7 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r7)
            X.0nq2 r6 = X.C1450080nq2.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "error fetching notice data - "
            r1.append(r0)
            java.lang.String r0 = r7.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJII(r6, r0)
            r10 = r5
        L5a:
            if (r10 == 0) goto La0
            X.0ip3 r0 = X.C1257270ip3.LIZ
            r0.getClass()
            java.lang.String r0 = r10.itemId
            if (r0 != 0) goto L67
            java.lang.String r0 = ""
        L67:
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 != 0) goto L7a
            java.lang.String r0 = r10.thumbnailUrl
            if (r0 == 0) goto L92
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 != 0) goto L92
            r0 = 0
        L78:
            if (r0 == 0) goto L7b
        L7a:
            r2 = 0
        L7b:
            if (r2 == 0) goto La0
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0MHt r1 = new X.0MHt
            kotlin.jvm.functions.Function1<com.ss.android.ugc.profile.business.photo.text.photoboost.PhotoModeBoostedFeedbackResponse, kotlin.Unit> r0 = r9.LLILLJJLI
            r1.<init>(r0, r10, r5)
            r9.LL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r9, r2, r1)
            if (r0 != r4) goto L17
            X.C1C7U.LIZIZ(r8)
            return r4
        L92:
            r0 = 1
            goto L78
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9c:
            X.C1C7U.LIZIZ(r8)
            return r4
        La0:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C566000MHu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
