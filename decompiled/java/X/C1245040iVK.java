package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.inbox.followerv2.FollowerViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.AwS70S1000000_19;
import njp.a;

/* JADX INFO: renamed from: X.0iVK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.followerv2.FollowerViewModel$deleteNotice$1$1$1$1", f = "FollowerViewModel.kt", l = {288}, m = "invokeSuspend")
public final class C1245040iVK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ MusNotice LLILLL;
    public final /* synthetic */ FollowerViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1245040iVK(String str, MusNotice musNotice, FollowerViewModel followerViewModel, InterfaceC1364105Vn<? super C1245040iVK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = musNotice;
        this.LLILZ = followerViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1245040iVK(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("FollowerViewModel@1b87.deleteNotice$1$1$1$1");
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
                C11NZ<BaseResponse> c11nzLJIILL = NotificationApi.LIZ().LJIILL(this.LLILLJJLI);
                this.LL = 1;
                obj = C11UD.LIZJ(c11nzLJIILL, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("FollowerViewModel@1b87.deleteNotice$1$1$1$1");
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
        MusNotice musNotice = this.LLILLL;
        FollowerViewModel followerViewModel = this.LLILZ;
        String str = this.LLILLJJLI;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C1245050iVL.LIZ("FollowerViewModel, Server deleted Notice success");
            C1075780e6K.LIZJ(musNotice, (BaseResponse) c098200Yq, null);
            followerViewModel.setStateImmediate(new AwS133S1100000_19(musNotice, str, 6));
        }
        MusNotice musNotice2 = this.LLILLL;
        FollowerViewModel followerViewModel2 = this.LLILZ;
        String str2 = this.LLILLJJLI;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("FollowerRefactor", "FollowerViewModel, deleteData error", thM5exceptionOrNullimpl);
            C1075780e6K.LIZJ(musNotice2, null, thM5exceptionOrNullimpl);
            followerViewModel2.setStateImmediate(new AwS70S1000000_19(str2, 5));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowerViewModel@1b87.deleteNotice$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
