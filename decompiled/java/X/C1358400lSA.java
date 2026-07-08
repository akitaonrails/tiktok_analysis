package X;

import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lSA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel$deleteReply$1", f = "RepostInteractListViewModel.kt", l = {972, 979}, m = "invokeSuspend")
public final class C1358400lSA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ RepostReplyStruct LLILLL;
    public final /* synthetic */ UpvoteStruct LLILZ;
    public final /* synthetic */ RepostInteractListViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358400lSA(RepostReplyStruct repostReplyStruct, UpvoteStruct upvoteStruct, RepostInteractListViewModel repostInteractListViewModel, InterfaceC1364105Vn<? super C1358400lSA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = repostReplyStruct;
        this.LLILZ = upvoteStruct;
        this.LLILZIL = repostInteractListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1358400lSA c1358400lSA = new C1358400lSA(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1358400lSA.LLILLJJLI = obj;
        return c1358400lSA;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r8 = "RepostInteractListViewModel@3304.deleteReply$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r14.LL
            r6 = 2
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 == r3) goto L5f
            if (r0 != r6) goto L97
            java.lang.Object r7 = r14.LLILLJJLI
            X.C155000ia.LIZIZ(r15)
        L18:
            com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel r1 = r14.LLILZIL
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r7)
            if (r0 == 0) goto L26
            r0 = 2131829141(0x7f112195, float:1.9291243E38)
            r1.L1(r0)
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L2c:
            X.C155000ia.LIZIZ(r15)
            com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct r1 = r14.LLILLL
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r2 = r14.LLILZ
            com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel r0 = r14.LLILZIL
            com.ss.android.ugc.aweme.upvote.api.UpvoteApi r9 = com.ss.android.ugc.aweme.upvote.api.UpvoteApi.LIZIZ     // Catch: java.lang.Throwable -> L69
            java.lang.String r10 = r1.replyId     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = ""
            if (r10 != 0) goto L3e
            r10 = r1
        L3e:
            java.lang.String r11 = r2.upvoteId     // Catch: java.lang.Throwable -> L69
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LL     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L4a
            java.lang.String r12 = r0.getAid()     // Catch: java.lang.Throwable -> L69
            if (r12 != 0) goto L4b
        L4a:
            r12 = r1
        L4b:
            com.ss.android.ugc.aweme.profile.model.User r0 = r2.user     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L55
            java.lang.String r13 = r0.getUid()     // Catch: java.lang.Throwable -> L69
            if (r13 != 0) goto L56
        L55:
            r13 = r1
        L56:
            r14.LL = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r15 = r9.deleteReply(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L69
            if (r15 != r5) goto L62
            goto L9f
        L5f:
            X.C155000ia.LIZIZ(r15)     // Catch: java.lang.Throwable -> L69
        L62:
            r7 = r15
            com.ss.android.ugc.aweme.base.api.BaseResponse r7 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r7     // Catch: java.lang.Throwable -> L69
            X.C189200o6.m2constructorimpl(r7)     // Catch: java.lang.Throwable -> L69
            goto L75
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r7 = new X.00Yq
            r7.<init>(r0)
            X.C189200o6.m2constructorimpl(r7)
        L75:
            com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel r4 = r14.LLILZIL
            com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct r3 = r14.LLILLL
            boolean r0 = X.C189200o6.m8isSuccessimpl(r7)
            if (r0 == 0) goto L18
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0lSB r1 = new X.0lSB
            r0 = 0
            r1.<init>(r4, r3, r0)
            r14.LLILLJJLI = r7
            r14.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r14, r2, r1)
            if (r0 != r5) goto L18
            X.C1C7U.LIZIZ(r8)
            return r5
        L97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9f:
            X.C1C7U.LIZIZ(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1358400lSA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
