package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeDisableActionInfo;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0No0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.followerv2.FollowerViewModel$doNoticeFeedback$1", f = "FollowerViewModel.kt", l = {249}, m = "invokeSuspend")
public final class C604900No0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NoticeDisableActionInfo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C604900No0(NoticeDisableActionInfo noticeDisableActionInfo, InterfaceC1364105Vn<? super C604900No0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = noticeDisableActionInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C604900No0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        int errorCode;
        C1C7U.LIZ("FollowerViewModel@1b87.doNoticeFeedback$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                NoticeDisableActionInfo noticeDisableActionInfo = this.LLILLJJLI;
                NotificationApi.Api apiLIZ = NotificationApi.LIZ();
                String str = noticeDisableActionInfo.disableKey;
                this.LL = 1;
                obj = apiLIZ.dispatchNoticeAction(str, null, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("FollowerViewModel@1b87.doNoticeFeedback$1");
                    return objLJFF;
                }
            }
            c098200Yq = (BaseResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C1075780e6K.LJ(0, true);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            if (thM5exceptionOrNullimpl instanceof C0XIR) {
                errorCode = ((C23112093u) thM5exceptionOrNullimpl).getErrorCode();
            } else {
                errorCode = -1;
            }
            C1075780e6K.LJ(errorCode, false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowerViewModel@1b87.doNoticeFeedback$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
