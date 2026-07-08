package X;

import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationResultViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zZP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationResultViewModel$onLoadMore$1$1", f = "NotificationResultViewModel.kt", l = {159}, m = "invokeSuspend")
public final class C1901050zZP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NotificationResultViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1901050zZP(NotificationResultViewModel notificationResultViewModel, InterfaceC1364105Vn<? super C1901050zZP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = notificationResultViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1901050zZP(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NotificationResultViewModel@830a.onLoadMore$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            NotificationResultViewModel notificationResultViewModel = this.LLILLJJLI;
            if (notificationResultViewModel.LLIZLLLIL.LIZ <= 0) {
                notificationResultViewModel.HQ2(EnumC1900750zYv.LOAD_MORE);
            }
            C1902850zcJ.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("position", "new_activities");
            C20684815ws.LJIILLIIL("notice_load_more", c2344009Gk.LIZ);
            C1901060zZQ c1901060zZQ = C1901060zZQ.LJI;
            c1901060zZQ.LIZLLL();
            if (c1901060zZQ.LIZ.compareAndSet(0, 1)) {
                C1901060zZQ.LJIIIIZZ = false;
                C1901060zZQ.LJIIIZ = true;
            }
            NotificationResultViewModel notificationResultViewModel2 = this.LLILLJJLI;
            int groupType = notificationResultViewModel2.getGroupType();
            NotificationResultViewModel notificationResultViewModel3 = this.LLILLJJLI;
            C1901270zZl c1901270zZl = notificationResultViewModel3.LLIZLLLIL;
            String strDQ2 = NotificationResultViewModel.DQ2(notificationResultViewModel2, groupType, c1901270zZl.LIZ, c1901270zZl.LIZIZ, notificationResultViewModel3.LLILZLL, notificationResultViewModel3.LLIZ, 40);
            NotificationResultViewModel notificationResultViewModel4 = this.LLILLJJLI;
            EnumC1900750zYv enumC1900750zYv = EnumC1900750zYv.LOAD_MORE;
            this.LL = 1;
            notificationResultViewModel4.getClass();
            if (NotificationResultViewModel.GQ2(notificationResultViewModel4, strDQ2, enumC1900750zYv, this) == objLJFF) {
                C1C7U.LIZIZ("NotificationResultViewModel@830a.onLoadMore$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NotificationResultViewModel@830a.onLoadMore$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
