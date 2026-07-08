package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0581, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.easteregg.util.CommentSurpriseCacheManager$fetchCommentSurprisePreloadData$1", f = "CommentSurpriseCacheManager.kt", l = {69, 74, 86}, m = "invokeSuspend")
public final class AnonymousClass0581 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0581(String str, InterfaceC1364105Vn<? super AnonymousClass0581> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0581(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "CommentSurpriseCacheManager@bb43.fetchCommentSurprisePreloadData$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r9.LLILLJJLI
            r6 = 0
            r4 = 3
            r7 = 2
            r2 = 1
            if (r0 == 0) goto L20
            if (r0 == r2) goto L30
            if (r0 == r7) goto L66
            if (r0 != r4) goto L88
            X.C155000ia.LIZIZ(r10)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L20:
            X.C155000ia.LIZIZ(r10)
            java.lang.String r1 = r9.LLILLL
            com.ss.android.ugc.aweme.commentv2.commentlist.CommentApiV2 r0 = com.ss.android.ugc.aweme.commentv2.commentlist.CommentApiV2.LIZIZ     // Catch: java.lang.Throwable -> L39
            r9.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L39
            java.lang.Object r10 = r0.LJIJ(r1, r9)     // Catch: java.lang.Throwable -> L39
            if (r10 != r5) goto L33
            goto L90
        L30:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Throwable -> L39
        L33:
            com.ss.android.ugc.aweme.comment.easteregg.model.SurpriseResourceResponse r10 = (com.ss.android.ugc.aweme.comment.easteregg.model.SurpriseResourceResponse) r10     // Catch: java.lang.Throwable -> L39
            X.C189200o6.m2constructorimpl(r10)     // Catch: java.lang.Throwable -> L39
            goto L45
        L39:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r10 = new X.00Yq
            r10.<init>(r0)
            X.C189200o6.m2constructorimpl(r10)
        L45:
            r3 = r10
            boolean r0 = X.C189200o6.m8isSuccessimpl(r10)
            if (r0 == 0) goto L6b
            r2 = r3
            com.ss.android.ugc.aweme.comment.easteregg.model.SurpriseResourceResponse r2 = (com.ss.android.ugc.aweme.comment.easteregg.model.SurpriseResourceResponse) r2
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0582 r0 = new X.0582
            r0.<init>(r2, r6)
            r9.LL = r3
            r9.LLILLJJLI = r7
            java.lang.Object r0 = X.C23250099c.LJI(r9, r1, r0)
            if (r0 != r5) goto L6b
            X.C1C7U.LIZIZ(r8)
            return r5
        L66:
            java.lang.Object r3 = r9.LL
            X.C155000ia.LIZIZ(r10)
        L6b:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r3)
            if (r2 == 0) goto L1a
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.057f r0 = new X.057f
            r0.<init>(r2, r6)
            r9.LL = r3
            r9.LLILLJJLI = r4
            java.lang.Object r0 = X.C23250099c.LJI(r9, r1, r0)
            if (r0 != r5) goto L1a
            X.C1C7U.LIZIZ(r8)
            return r5
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L90:
            X.C1C7U.LIZIZ(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0581.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
