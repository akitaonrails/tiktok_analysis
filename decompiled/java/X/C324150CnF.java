package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.toplives.notifications.repo.ILiveNoticeActivityApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.feed.TopliveNoticeOperateResponse;

/* JADX INFO: renamed from: X.0CnF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.toplives.notifications.repo.LiveNotificationDataManager$operateNotification$2", f = "LiveNotificationDataManager.kt", l = {91}, m = "invokeSuspend")
public final class C324150CnF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324150CnF(int i, long j, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324150CnF(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("LiveNotificationDataManager@748d.operateNotification$2");
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
                C480460Ism.LIZ().getClass();
                C11NZ<C470590Icr<TopliveNoticeOperateResponse>> c11nzOperateLiveNotification = ((ILiveNoticeActivityApi) C480460Ism.LIZLLL(ILiveNoticeActivityApi.class)).operateLiveNotification(this.LLILLJJLI, this.LLILLL);
                this.LL = 1;
                obj = C324160CnG.LIZ(c11nzOperateLiveNotification, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveNotificationDataManager@748d.operateNotification$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LiveNotificationDataManager@748d.operateNotification$2");
            return unit;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
