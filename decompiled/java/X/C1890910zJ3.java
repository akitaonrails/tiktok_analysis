package X;

import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationCreatorResultViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zJ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationCreatorResultViewModel$onLoadMore$1", f = "NotificationCreatorResultViewModel.kt", l = {209, 210}, m = "invokeSuspend")
public final class C1890910zJ3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NotificationCreatorResultViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1890910zJ3(NotificationCreatorResultViewModel notificationCreatorResultViewModel, InterfaceC1364105Vn<? super C1890910zJ3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = notificationCreatorResultViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1890910zJ3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NotificationCreatorResultViewModel@708b.onLoadMore$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    NotificationCreatorResultViewModel notificationCreatorResultViewModel = this.LLILLJJLI;
                    notificationCreatorResultViewModel.LLILZIL = C23250099c.LIZLLL(notificationCreatorResultViewModel.getAssemVMScope(), C0PEM.LIZJ, null, new C1900720zYs(notificationCreatorResultViewModel, EnumC1900710zYr.LOAD_MORE, null), 2);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("NotificationCreatorResultViewModel@708b.onLoadMore$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI.LLILZ;
            if (anonymousClass0956 != null) {
                this.LL = 1;
                if (anonymousClass0956.LJJZ(this) == objLJFF) {
                    C1C7U.LIZIZ("NotificationCreatorResultViewModel@708b.onLoadMore$1");
                    return objLJFF;
                }
            }
        }
        AnonymousClass0956 anonymousClass09562 = this.LLILLJJLI.LLILZIL;
        if (anonymousClass09562 != null) {
            this.LL = 2;
            if (anonymousClass09562.LJJZ(this) == objLJFF) {
                C1C7U.LIZIZ("NotificationCreatorResultViewModel@708b.onLoadMore$1");
                return objLJFF;
            }
        }
        NotificationCreatorResultViewModel notificationCreatorResultViewModel2 = this.LLILLJJLI;
        notificationCreatorResultViewModel2.LLILZIL = C23250099c.LIZLLL(notificationCreatorResultViewModel2.getAssemVMScope(), C0PEM.LIZJ, null, new C1900720zYs(notificationCreatorResultViewModel2, EnumC1900710zYr.LOAD_MORE, null), 2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("NotificationCreatorResultViewModel@708b.onLoadMore$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
