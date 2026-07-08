package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeDisableActionInfo;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS40S0010000_28;
import njp.a;

/* JADX INFO: renamed from: X.0No2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel$disableNoticeAction$3", f = "NotificationFragmentV2ViewModel.kt", l = {340}, m = "invokeSuspend")
public final class C604920No2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NoticeDisableActionInfo LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ NotificationFragmentV2ViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C604920No2(NoticeDisableActionInfo noticeDisableActionInfo, boolean z, NotificationFragmentV2ViewModel notificationFragmentV2ViewModel, InterfaceC1364105Vn<? super C604920No2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = noticeDisableActionInfo;
        this.LLILLL = z;
        this.LLILZ = notificationFragmentV2ViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C604920No2(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        int errorCode;
        boolean z;
        C1C7U.LIZ("NotificationFragmentV2ViewModel@a7ac.disableNoticeAction$3");
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
                boolean z2 = this.LLILLL;
                NotificationApi.Api apiLIZ = NotificationApi.LIZ();
                String str = noticeDisableActionInfo.disableKey;
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                this.LL = 1;
                obj = apiLIZ.dispatchNoticeAction(str, boolValueOf, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("NotificationFragmentV2ViewModel@a7ac.disableNoticeAction$3");
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
        NotificationFragmentV2ViewModel notificationFragmentV2ViewModel = this.LLILZ;
        boolean z3 = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            notificationFragmentV2ViewModel.setState(new AwS40S0010000_28(z3, 26));
            C1075780e6K.LJ(0, true);
        }
        NotificationFragmentV2ViewModel notificationFragmentV2ViewModel2 = this.LLILZ;
        boolean z4 = this.LLILLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            notificationFragmentV2ViewModel2.setState(new AwS40S0010000_28(z4, 27));
            if (thM5exceptionOrNullimpl instanceof C0XIR) {
                errorCode = ((C23112093u) thM5exceptionOrNullimpl).getErrorCode();
            } else {
                errorCode = -1;
            }
            C1075780e6K.LJ(errorCode, false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NotificationFragmentV2ViewModel@a7ac.disableNoticeAction$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
