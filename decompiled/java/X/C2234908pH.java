package X;

import com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment;
import com.ss.android.ugc.aweme.comment.model.CommentShareInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08pH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment$awaitCommentShareInfo$2", f = "CommentLongPressFragment.kt", l = {526, 527}, m = "invokeSuspend")
public final class C2234908pH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CommentShareInfo>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CommentLongPressFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234908pH(CommentLongPressFragment commentLongPressFragment, InterfaceC1364105Vn<? super C2234908pH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = commentLongPressFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2234908pH c2234908pH = new C2234908pH(this.LLILLL, interfaceC1364105Vn);
        c2234908pH.LLILLJJLI = obj;
        return c2234908pH;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "CommentLongPressFragment@922.awaitCommentShareInfo$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 2
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L2a
            if (r0 == r1) goto L3e
            if (r0 != r5) goto L80
            java.lang.Object r3 = r8.LLILLJJLI
            X.C155000ia.LIZIZ(r9)
        L19:
            boolean r0 = X.C189200o6.m7isFailureimpl(r3)
            if (r0 == 0) goto L20
            r3 = r4
        L20:
            com.ss.android.ugc.aweme.comment.longpresspanel.api.CommentShareResponse r3 = (com.ss.android.ugc.aweme.comment.longpresspanel.api.CommentShareResponse) r3
            if (r3 == 0) goto L26
            com.ss.android.ugc.aweme.comment.model.CommentShareInfo r4 = r3.shareInfo
        L26:
            X.C1C7U.LIZIZ(r7)
            return r4
        L2a:
            X.C155000ia.LIZIZ(r9)
            com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment r0 = r8.LLILLL
            X.099G r0 = r0.LLJJJ     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L3c
            r8.LL = r1     // Catch: java.lang.Throwable -> L55
            java.lang.Object r9 = r0.LJLIIIL(r8)     // Catch: java.lang.Throwable -> L55
            if (r9 != r6) goto L41
            goto L88
        L3c:
            r3 = r4
            goto L51
        L3e:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L55
        L41:
            X.00o6 r9 = (X.C189200o6) r9     // Catch: java.lang.Throwable -> L55
            java.lang.Object r3 = r9.m10unboximpl()     // Catch: java.lang.Throwable -> L55
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L55
            com.ss.android.ugc.aweme.comment.longpresspanel.api.CommentShareResponse r3 = (com.ss.android.ugc.aweme.comment.longpresspanel.api.CommentShareResponse) r3     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L3c
            r3.checkValid()     // Catch: java.lang.Throwable -> L55
        L51:
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L55
            goto L61
        L55:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L61:
            com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment r2 = r8.LLILLL
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r3)
            if (r0 == 0) goto L19
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.08pG r0 = new X.08pG
            r0.<init>(r2, r4)
            r8.LLILLJJLI = r3
            r8.LL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r8, r1, r0)
            if (r0 != r6) goto L19
            X.C1C7U.LIZIZ(r7)
            return r6
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L88:
            X.C1C7U.LIZIZ(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234908pH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CommentShareInfo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
