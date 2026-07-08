package X;

import com.ss.android.ugc.aweme.lemon.comment.viewmodel.CommentListAssemVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hrg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.lemon.comment.viewmodel.CommentListAssemVM$fetchCommentList$1", f = "CommentListAssemVM.kt", l = {176, 191, 199}, m = "invokeSuspend")
public final class C1220460hrg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CommentListAssemVM LLILLL;
    public final /* synthetic */ C1342550l2b LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<C1342550l2b>> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1220460hrg(CommentListAssemVM commentListAssemVM, C1342550l2b c1342550l2b, int i, String str, InterfaceC1364105Vn<? super AbstractC316870CbV<C1342550l2b>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C1220460hrg> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLL = commentListAssemVM;
        this.LLILZ = c1342550l2b;
        this.LLILZIL = i;
        this.LLILZLL = str;
        this.LLIZ = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1220460hrg c1220460hrg = new C1220460hrg(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1220460hrg.LLILLJJLI = obj;
        return c1220460hrg;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r3 = r19
            java.lang.String r11 = "CommentListAssemVM@3a88.fetchCommentList$1"
            X.C1C7U.LIZ(r11)
            java.lang.Object r8 = X.C099R.LJFF()
            r9 = r18
            int r0 = r9.LL
            r7 = 0
            r6 = 3
            r2 = 2
            r10 = 1
            if (r0 == 0) goto L24
            if (r0 == r10) goto L3d
            if (r0 == r2) goto L7d
            if (r0 != r6) goto La3
            X.C155000ia.LIZIZ(r3)
        L1e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L24:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.lemon.comment.viewmodel.CommentListAssemVM r5 = r9.LLILLL
            X.0l2b r4 = r9.LLILZ
            int r3 = r9.LLILZIL
            X.1DFB r1 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> L46
            X.0hrh r0 = new X.0hrh     // Catch: java.lang.Throwable -> L46
            r0.<init>(r5, r4, r3, r7)     // Catch: java.lang.Throwable -> L46
            r9.LL = r10     // Catch: java.lang.Throwable -> L46
            java.lang.Object r3 = X.C23250099c.LJI(r9, r1, r0)     // Catch: java.lang.Throwable -> L46
            if (r3 != r8) goto L40
            goto Lab
        L3d:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L46
        L40:
            com.ss.android.ugc.aweme.comment.model.CommentItemList r3 = (com.ss.android.ugc.aweme.comment.model.CommentItemList) r3     // Catch: java.lang.Throwable -> L46
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L46
            goto L52
        L46:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L52:
            r5 = r3
            com.ss.android.ugc.aweme.lemon.comment.viewmodel.CommentListAssemVM r13 = r9.LLILLL
            java.lang.String r15 = r9.LLILZLL
            X.05Vn<X.0CbV<X.0l2b>> r1 = r9.LLIZ
            boolean r0 = X.C189200o6.m8isSuccessimpl(r3)
            if (r0 == 0) goto L82
            r14 = r5
            com.ss.android.ugc.aweme.comment.model.CommentItemList r14 = (com.ss.android.ugc.aweme.comment.model.CommentItemList) r14
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0l38 r12 = new X.0l38
            r17 = r7
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r9.LLILLJJLI = r5
            r9.LL = r2
            java.lang.Object r0 = X.C23250099c.LJI(r9, r0, r12)
            if (r0 != r8) goto L82
            X.C1C7U.LIZIZ(r11)
            return r8
        L7d:
            java.lang.Object r5 = r9.LLILLJJLI
            X.C155000ia.LIZIZ(r3)
        L82:
            com.ss.android.ugc.aweme.lemon.comment.viewmodel.CommentListAssemVM r4 = r9.LLILLL
            X.05Vn<X.0CbV<X.0l2b>> r3 = r9.LLIZ
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r5)
            if (r2 == 0) goto L1e
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0hrf r0 = new X.0hrf
            r0.<init>(r4, r2, r3, r7)
            r9.LLILLJJLI = r5
            r9.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r9, r1, r0)
            if (r0 != r8) goto L1e
            X.C1C7U.LIZIZ(r11)
            return r8
        La3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lab:
            X.C1C7U.LIZIZ(r11)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1220460hrg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
