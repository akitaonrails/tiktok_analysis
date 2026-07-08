package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.toplives.notifications.vm.LiveNotificationListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Iz4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.toplives.notifications.vm.LiveNotificationListViewModel$removeAt$1", f = "LiveNotificationListViewModel.kt", l = {78}, m = "invokeSuspend")
public final class C484360Iz4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<C0160003a> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ LiveNotificationListViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C484360Iz4(List<C0160003a> list, int i, LiveNotificationListViewModel liveNotificationListViewModel, InterfaceC1364105Vn<? super C484360Iz4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = liveNotificationListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C484360Iz4(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveNotificationListViewModel@527e.removeAt$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C0160003a c0160003a = this.LLILLJJLI.get(this.LLILLL);
                InterfaceC484330Iz1 interfaceC484330Iz1 = (InterfaceC484330Iz1) this.LLILZ.LL.getValue().getOperator();
                long j = c0160003a.LLILLJJLI.noticeId;
                this.LL = 1;
                if (interfaceC484330Iz1.LJLLLL(2, j, this) == objLJFF) {
                    C1C7U.LIZIZ("LiveNotificationListViewModel@527e.removeAt$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveNotificationListViewModel@527e.removeAt$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
