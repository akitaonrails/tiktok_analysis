package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.feed.TopliveNoticeUnreadCountData;

/* JADX INFO: renamed from: X.0In0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.skylight.SkylightContainerManager$updateNotificationState$1", f = "SkylightContainerManager.kt", l = {414, 417}, m = "invokeSuspend")
public final class C476880In0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC476820Imu LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C476880In0(AbstractC476820Imu abstractC476820Imu, InterfaceC1364105Vn<? super C476880In0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC476820Imu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C476880In0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightContainerManager@b223.updateNotificationState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SkylightContainerManager@b223.updateNotificationState$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            obj = C2296808zG.LJ(new C478710Ipx(null), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SkylightContainerManager@b223.updateNotificationState$1");
                return objLJFF;
            }
        }
        TopliveNoticeUnreadCountData topliveNoticeUnreadCountData = (TopliveNoticeUnreadCountData) obj;
        AbstractC476820Imu abstractC476820Imu = this.LLILLJJLI;
        abstractC476820Imu.LJJJJJL = topliveNoticeUnreadCountData;
        if (topliveNoticeUnreadCountData.unreadCount > 0) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C476870Imz c476870Imz = new C476870Imz(abstractC476820Imu, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c476870Imz) == objLJFF) {
                C1C7U.LIZIZ("SkylightContainerManager@b223.updateNotificationState$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SkylightContainerManager@b223.updateNotificationState$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
