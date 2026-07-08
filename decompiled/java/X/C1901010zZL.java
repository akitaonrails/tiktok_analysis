package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupFilterStruct;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationResultViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0zZL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationResultViewModel$onRefresh$1$1", f = "NotificationResultViewModel.kt", l = {134}, m = "invokeSuspend")
public final class C1901010zZL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NotificationResultViewModel LLILLJJLI;
    public final /* synthetic */ EnumC1599580rjA LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1901010zZL(NotificationResultViewModel notificationResultViewModel, EnumC1599580rjA enumC1599580rjA, InterfaceC1364105Vn<? super C1901010zZL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = notificationResultViewModel;
        this.LLILLL = enumC1599580rjA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1901010zZL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1900750zYv enumC1900750zYv;
        boolean zLIZIZ;
        int i;
        int i2;
        boolean z;
        GroupFilterStruct groupFilterStruct;
        GroupFilterStruct groupFilterStruct2;
        C1C7U.LIZ("NotificationResultViewModel@830a.onRefresh$1$1");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LL;
        if (i3 != 0) {
            if (i3 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            NotificationResultViewModel notificationResultViewModel = this.LLILLJJLI;
            EnumC1599580rjA enumC1599580rjA = this.LLILLL;
            notificationResultViewModel.getClass();
            if (Intrinsics.LJFF(enumC1599580rjA.getDetail(), "first_refresh")) {
                enumC1900750zYv = EnumC1900750zYv.FIRST_REFRESH;
            } else {
                enumC1900750zYv = EnumC1900750zYv.REFRESH;
            }
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            try {
                zLIZIZ = C036E.LIZ.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zLIZIZ = false;
            }
            if (!zLIZIZ) {
                int i4 = C2187451AjH.LIZ;
                C1720106oR.LIZ("NotificationResultViewModel", "refresh but no network");
                this.LLILLJJLI.HQ2(enumC1900750zYv);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("NotificationResultViewModel@830a.onRefresh$1$1");
                return unit;
            }
            this.LLILLJJLI.wQ2();
            NotificationResultViewModel notificationResultViewModel2 = this.LLILLJJLI;
            C1869670ykn c1869670yknFQ2 = notificationResultViewModel2.FQ2();
            if (c1869670yknFQ2 != null && (groupFilterStruct2 = c1869670yknFQ2.LLILZ) != null) {
                i = groupFilterStruct2.filterType;
            } else {
                i = Integer.MIN_VALUE;
            }
            C1869670ykn c1869670yknFQ22 = notificationResultViewModel2.FQ2();
            if (c1869670yknFQ22 != null && (groupFilterStruct = c1869670yknFQ22.LLILZ) != null) {
                i2 = groupFilterStruct.noticeGroup;
            } else {
                i2 = 0;
            }
            notificationResultViewModel2.vQ2(i, i2);
            notificationResultViewModel2.setState(AFwS271S0000000_28.get$arr$(404));
            EnumC1900750zYv enumC1900750zYv2 = EnumC1900750zYv.FIRST_REFRESH;
            if (enumC1900750zYv == enumC1900750zYv2) {
                this.LLILLJJLI.setStateImmediate(AFwS271S0000000_28.get$arr$(193));
            }
            if (enumC1900750zYv != EnumC1900750zYv.LOAD_MORE) {
                NotificationResultViewModel notificationResultViewModel3 = this.LLILLJJLI;
                notificationResultViewModel3.LLILZLL = 0L;
                notificationResultViewModel3.LLIZ = "";
                notificationResultViewModel3.LLIZLLLIL = new C1901270zZl();
            }
            C1901060zZQ c1901060zZQ = C1901060zZQ.LJI;
            if (enumC1900750zYv == enumC1900750zYv2) {
                z = true;
            } else {
                z = false;
            }
            c1901060zZQ.LIZLLL();
            if (c1901060zZQ.LIZ.compareAndSet(0, 1)) {
                C1901060zZQ.LJIIIIZZ = z;
                C1901060zZQ.LJIIIZ = false;
            }
            NotificationResultViewModel notificationResultViewModel4 = this.LLILLJJLI;
            String strDQ2 = NotificationResultViewModel.DQ2(notificationResultViewModel4, notificationResultViewModel4.getGroupType(), 0L, 0L, 0L, null, 126);
            this.LL = 1;
            if (NotificationResultViewModel.GQ2(notificationResultViewModel4, strDQ2, enumC1900750zYv, this) == objLJFF) {
                C1C7U.LIZIZ("NotificationResultViewModel@830a.onRefresh$1$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("NotificationResultViewModel@830a.onRefresh$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
