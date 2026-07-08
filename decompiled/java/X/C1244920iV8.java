package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS271S0000000_28;
import njp.a;

/* JADX INFO: renamed from: X.0iV8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel$deletedNotice$2", f = "NotificationFragmentV2ViewModel.kt", l = {293}, m = "invokeSuspend")
public final class C1244920iV8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MusNotice LLILLJJLI;
    public final /* synthetic */ NotificationFragmentV2ViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1244920iV8(MusNotice musNotice, NotificationFragmentV2ViewModel notificationFragmentV2ViewModel, InterfaceC1364105Vn<? super C1244920iV8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = musNotice;
        this.LLILLL = notificationFragmentV2ViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1244920iV8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("NotificationFragmentV2ViewModel@a7ac.deletedNotice$2");
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
                C11NZ<BaseResponse> c11nzLJIILL = NotificationApi.LIZ().LJIILL(this.LLILLJJLI.nid);
                this.LL = 1;
                obj = C11UD.LIZJ(c11nzLJIILL, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("NotificationFragmentV2ViewModel@a7ac.deletedNotice$2");
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
        NotificationFragmentV2ViewModel notificationFragmentV2ViewModel = this.LLILLL;
        MusNotice musNotice = this.LLILLJJLI;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            int i2 = C2187451AjH.LIZ;
            notificationFragmentV2ViewModel.setState(AFwS271S0000000_28.get$arr$(188));
            C1075780e6K.LIZJ(musNotice, (BaseResponse) c098200Yq, null);
        }
        NotificationFragmentV2ViewModel notificationFragmentV2ViewModel2 = this.LLILLL;
        MusNotice musNotice2 = this.LLILLJJLI;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i3 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("Creators_Inbox", "deleteData error", thM5exceptionOrNullimpl);
            notificationFragmentV2ViewModel2.setState(AFwS271S0000000_28.get$arr$(189));
            C1075780e6K.LIZJ(musNotice2, null, thM5exceptionOrNullimpl);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NotificationFragmentV2ViewModel@a7ac.deletedNotice$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
