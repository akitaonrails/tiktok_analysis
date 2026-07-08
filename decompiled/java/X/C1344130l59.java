package X;

import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l59, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel$publishComment$2", f = "CommentPublishViewModel.kt", l = {334, 343, 348}, m = "invokeSuspend")
public final class C1344130l59 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CommentPublishViewModel LLILLL;
    public final /* synthetic */ C1345120l6k LLILZ;
    public final /* synthetic */ Aweme LLILZIL;
    public final /* synthetic */ C0O8X LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1344130l59(CommentPublishViewModel commentPublishViewModel, C1345120l6k c1345120l6k, Aweme aweme, C0O8X c0o8x, InterfaceC1364105Vn<? super C1344130l59> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = commentPublishViewModel;
        this.LLILZ = c1345120l6k;
        this.LLILZIL = aweme;
        this.LLILZLL = c0o8x;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1344130l59 c1344130l59 = new C1344130l59(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1344130l59.LLILLJJLI = obj;
        return c1344130l59;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r5 = r19
            java.lang.String r11 = "CommentPublishViewModel@7f7.publishComment$2"
            X.C1C7U.LIZ(r11)
            java.lang.Object r3 = X.C099R.LJFF()
            r4 = r18
            int r0 = r4.LL
            r2 = 3
            r6 = 2
            r10 = 1
            if (r0 == 0) goto L23
            if (r0 == r10) goto L3d
            if (r0 == r6) goto L7d
            if (r0 != r2) goto La6
            X.C155000ia.LIZIZ(r5)
        L1d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L23:
            X.C155000ia.LIZIZ(r5)
            com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel r9 = r4.LLILLL
            X.0l6k r8 = r4.LLILZ
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r4.LLILZIL
            X.1DFB r5 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> L46
            X.0l5B r1 = new X.0l5B     // Catch: java.lang.Throwable -> L46
            r0 = 0
            r1.<init>(r9, r8, r7, r0)     // Catch: java.lang.Throwable -> L46
            r4.LL = r10     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = X.C23250099c.LJI(r4, r5, r1)     // Catch: java.lang.Throwable -> L46
            if (r5 != r3) goto L40
            goto Lae
        L3d:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L46
        L40:
            com.ss.android.ugc.aweme.comment.model.CommentResponse r5 = (com.ss.android.ugc.aweme.comment.model.CommentResponse) r5     // Catch: java.lang.Throwable -> L46
            X.C189200o6.m2constructorimpl(r5)     // Catch: java.lang.Throwable -> L46
            goto L52
        L46:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r5 = new X.00Yq
            r5.<init>(r0)
            X.C189200o6.m2constructorimpl(r5)
        L52:
            r1 = r5
            com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel r13 = r4.LLILLL
            X.0l6k r14 = r4.LLILZ
            X.0O8X r15 = r4.LLILZLL
            boolean r0 = X.C189200o6.m8isSuccessimpl(r5)
            if (r0 == 0) goto L82
            r5 = r1
            com.ss.android.ugc.aweme.comment.model.CommentResponse r5 = (com.ss.android.ugc.aweme.comment.model.CommentResponse) r5
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0l5A r12 = new X.0l5A
            r17 = 0
            r16 = r5
            r12.<init>(r13, r14, r15, r16, r17)
            r4.LLILLJJLI = r1
            r4.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r4, r0, r12)
            if (r0 != r3) goto L82
            X.C1C7U.LIZIZ(r11)
            return r3
        L7d:
            java.lang.Object r1 = r4.LLILLJJLI
            X.C155000ia.LIZIZ(r5)
        L82:
            com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel r6 = r4.LLILLL
            X.0l6k r7 = r4.LLILZ
            X.0O8X r9 = r4.LLILZLL
            java.lang.Throwable r8 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r8 == 0) goto L1d
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0l58 r5 = new X.0l58
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r4.LLILLJJLI = r1
            r4.LL = r2
            java.lang.Object r0 = X.C23250099c.LJI(r4, r0, r5)
            if (r0 != r3) goto L1d
            X.C1C7U.LIZIZ(r11)
            return r3
        La6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lae:
            X.C1C7U.LIZIZ(r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1344130l59.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
