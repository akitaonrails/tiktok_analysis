package X;

import com.ss.android.ugc.aweme.inbox.followerv2.FollowerViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iVM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.followerv2.FollowerViewModel$deleteNotice$2$1$1$1", f = "FollowerViewModel.kt", l = {323}, m = "invokeSuspend")
public final class C1245060iVM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ User LLILLJJLI;
    public final /* synthetic */ FollowerViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ FollowRequestData LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1245060iVM(User user, FollowerViewModel followerViewModel, String str, FollowRequestData followRequestData, InterfaceC1364105Vn<? super C1245060iVM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = user;
        this.LLILLL = followerViewModel;
        this.LLILZ = str;
        this.LLILZIL = followRequestData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1245060iVM(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "FollowerViewModel@1b87.deleteNotice$2$1$1$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r6.LL
            r2 = 1
            if (r0 == 0) goto L19
            if (r0 != r2) goto L11
            goto L3a
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L19:
            X.C155000ia.LIZIZ(r7)
            com.ss.android.ugc.aweme.profile.model.User r0 = r6.LLILLJJLI
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r1 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = r0.getUid()     // Catch: java.lang.Throwable -> L43
            X.11NZ r0 = r1.rejectRequest(r0)     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L38
            r6.LL = r2     // Catch: java.lang.Throwable -> L43
            java.lang.Object r7 = X.C11UD.LIZJ(r0, r6)     // Catch: java.lang.Throwable -> L43
            if (r7 != r3) goto L3d
            X.C1C7U.LIZIZ(r5)
            return r3
        L38:
            r7 = 0
            goto L3f
        L3a:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Throwable -> L43
        L3d:
            com.ss.android.ugc.aweme.notification.followrequest.model.RejectResponse r7 = (com.ss.android.ugc.aweme.notification.followrequest.model.RejectResponse) r7     // Catch: java.lang.Throwable -> L43
        L3f:
            X.C189200o6.m2constructorimpl(r7)     // Catch: java.lang.Throwable -> L43
            goto L4f
        L43:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r7 = new X.00Yq
            r7.<init>(r0)
            X.C189200o6.m2constructorimpl(r7)
        L4f:
            com.ss.android.ugc.aweme.inbox.followerv2.FollowerViewModel r4 = r6.LLILLL
            java.lang.String r3 = r6.LLILZ
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData r2 = r6.LLILZIL
            boolean r0 = X.C189200o6.m8isSuccessimpl(r7)
            if (r0 == 0) goto L69
            java.lang.String r0 = "FollowerViewModel, Server delete follow request success"
            X.C1245050iVL.LIZ(r0)
            kotlin.jvm.internal.AwS133S1100000_19 r1 = new kotlin.jvm.internal.AwS133S1100000_19
            r0 = 7
            r1.<init>(r3, r2, r0)
            r4.setStateImmediate(r1)
        L69:
            com.ss.android.ugc.aweme.inbox.followerv2.FollowerViewModel r4 = r6.LLILLL
            java.lang.String r3 = r6.LLILZ
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r7)
            if (r2 == 0) goto L85
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r1 = "FollowerRefactor"
            java.lang.String r0 = "FollowerViewModel, delete follow request error"
            X.C1720106oR.LIZIZ(r1, r0, r2)
            kotlin.jvm.internal.AwS70S1000000_19 r1 = new kotlin.jvm.internal.AwS70S1000000_19
            r0 = 6
            r1.<init>(r3, r0)
            r4.setStateImmediate(r1)
        L85:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1245060iVM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
