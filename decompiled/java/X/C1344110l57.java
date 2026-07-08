package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l57, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel$publishComment$3", f = "CommentPublishViewModel.kt", l = {361, 376, 408}, m = "invokeSuspend")
public final class C1344110l57 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1345120l6k LLILLL;
    public final /* synthetic */ CommentPublishViewModel LLILZ;
    public final /* synthetic */ Comment LLILZIL;
    public final /* synthetic */ Aweme LLILZLL;
    public final /* synthetic */ C0O8X LLIZ;
    public final /* synthetic */ Function1<Comment, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1344110l57(C1345120l6k c1345120l6k, CommentPublishViewModel commentPublishViewModel, Comment comment, Aweme aweme, C0O8X c0o8x, Function1<? super Comment, Unit> function1, InterfaceC1364105Vn<? super C1344110l57> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1345120l6k;
        this.LLILZ = commentPublishViewModel;
        this.LLILZIL = comment;
        this.LLILZLL = aweme;
        this.LLIZ = c0o8x;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1344110l57 c1344110l57 = new C1344110l57(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1344110l57.LLILLJJLI = obj;
        return c1344110l57;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r4 = r16
            java.lang.String r6 = "CommentPublishViewModel@7f7.publishComment$3"
            X.C1C7U.LIZ(r6)
            java.lang.Object r0 = X.C099R.LJFF()
            int r1 = r15.LL
            r3 = 3
            r2 = 2
            r5 = 1
            if (r1 == 0) goto L21
            if (r1 == r5) goto L48
            if (r1 == r2) goto L87
            if (r1 != r3) goto Lb4
            X.C155000ia.LIZIZ(r4)
        L1b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L21:
            X.C155000ia.LIZIZ(r4)
            X.0l6k r8 = r15.LLILLL
            com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel r9 = r15.LLILZ
            com.ss.android.ugc.aweme.comment.model.Comment r10 = r15.LLILZIL
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r15.LLILZLL
            com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil r4 = com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil.LIZ     // Catch: java.lang.Throwable -> L51
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L51
            r4.getClass()     // Catch: java.lang.Throwable -> L51
            com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil.LIZJ(r1)     // Catch: java.lang.Throwable -> L51
            X.1DFB r1 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> L51
            X.0l6t r7 = new X.0l6t     // Catch: java.lang.Throwable -> L51
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L51
            r15.LL = r5     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = X.C23250099c.LJI(r15, r1, r7)     // Catch: java.lang.Throwable -> L51
            if (r4 != r0) goto L4b
            goto Lbc
        L48:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L51
        L4b:
            com.ss.android.ugc.aweme.comment.model.CommentResponse r4 = (com.ss.android.ugc.aweme.comment.model.CommentResponse) r4     // Catch: java.lang.Throwable -> L51
            X.C189200o6.m2constructorimpl(r4)     // Catch: java.lang.Throwable -> L51
            goto L5d
        L51:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r4 = new X.00Yq
            r4.<init>(r1)
            X.C189200o6.m2constructorimpl(r4)
        L5d:
            r1 = r4
            com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel r8 = r15.LLILZ
            X.0l6k r9 = r15.LLILLL
            X.0O8X r10 = r15.LLIZ
            com.ss.android.ugc.aweme.comment.model.Comment r12 = r15.LLILZIL
            boolean r4 = X.C189200o6.m8isSuccessimpl(r4)
            if (r4 == 0) goto L8c
            r11 = r1
            com.ss.android.ugc.aweme.comment.model.CommentResponse r11 = (com.ss.android.ugc.aweme.comment.model.CommentResponse) r11
            X.1DFH r4 = X.C0PEM.LIZ
            X.08pq r4 = X.C2107308Nj.LIZ
            X.0l5D r7 = new X.0l5D
            r13 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r15.LLILLJJLI = r1
            r15.LL = r2
            java.lang.Object r2 = X.C23250099c.LJI(r15, r4, r7)
            if (r2 != r0) goto L8c
            X.C1C7U.LIZIZ(r6)
            return r0
        L87:
            java.lang.Object r1 = r15.LLILLJJLI
            X.C155000ia.LIZIZ(r4)
        L8c:
            com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel r8 = r15.LLILZ
            X.0l6k r9 = r15.LLILLL
            X.0O8X r11 = r15.LLIZ
            com.ss.android.ugc.aweme.comment.model.Comment r12 = r15.LLILZIL
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.comment.model.Comment, kotlin.Unit> r13 = r15.LLIZLLLIL
            java.lang.Throwable r10 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r10 == 0) goto L1b
            X.1DFH r2 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0l56 r7 = new X.0l56
            r14 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r15.LLILLJJLI = r1
            r15.LL = r3
            java.lang.Object r1 = X.C23250099c.LJI(r15, r2, r7)
            if (r1 != r0) goto L1b
            X.C1C7U.LIZIZ(r6)
            return r0
        Lb4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lbc:
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1344110l57.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
