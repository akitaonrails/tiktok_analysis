package X;

import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationResultViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uQ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationResultViewModel$onLoadMore$1", f = "NotificationResultViewModel.kt", l = {143, 144}, m = "invokeSuspend")
public final class C1703100uQ8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ NotificationResultViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703100uQ8(NotificationResultViewModel notificationResultViewModel, InterfaceC1364105Vn<? super C1703100uQ8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = notificationResultViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1703100uQ8 c1703100uQ8 = new C1703100uQ8(this.LLILLL, interfaceC1364105Vn);
        c1703100uQ8.LLILLJJLI = obj;
        return c1703100uQ8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("NotificationResultViewModel@830a.onLoadMore$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    NotificationResultViewModel notificationResultViewModel = this.LLILLL;
                    notificationResultViewModel.LLJI = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1901050zZP(notificationResultViewModel, null), 3);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("NotificationResultViewModel@830a.onLoadMore$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            AnonymousClass0956 anonymousClass0956 = this.LLILLL.LLJ;
            if (anonymousClass0956 != null) {
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                if (anonymousClass0956.LJJZ(this) == objLJFF) {
                    C1C7U.LIZIZ("NotificationResultViewModel@830a.onLoadMore$1");
                    return objLJFF;
                }
            }
        }
        AnonymousClass0956 anonymousClass09562 = this.LLILLL.LLJI;
        if (anonymousClass09562 != null) {
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 2;
            if (anonymousClass09562.LJJZ(this) == objLJFF) {
                C1C7U.LIZIZ("NotificationResultViewModel@830a.onLoadMore$1");
                return objLJFF;
            }
        }
        NotificationResultViewModel notificationResultViewModel2 = this.LLILLL;
        notificationResultViewModel2.LLJI = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1901050zZP(notificationResultViewModel2, null), 3);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("NotificationResultViewModel@830a.onLoadMore$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
