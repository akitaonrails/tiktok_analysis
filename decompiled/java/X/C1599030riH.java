package X;

import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS568S0100000_24;
import njp.a;

/* JADX INFO: renamed from: X.0riH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.loadmore.InboxSkylightPostRefreshAutoLoadHandler$maybeSchedulePostRefreshLoadMore$job$1", f = "InboxSkylightPostRefreshAutoLoadHandler.kt", l = {71}, m = "invokeSuspend")
public final class C1599030riH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ SkylightListViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1599030riH(long j, SkylightListViewModel skylightListViewModel, InterfaceC1364105Vn<? super C1599030riH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = skylightListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1599030riH(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSkylightPostRefreshAutoLoadHandler@bd79.maybeSchedulePostRefreshLoadMore$job$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("InboxSkylightPostRefreshAutoLoadHandler@bd79.maybeSchedulePostRefreshLoadMore$job$1");
                return objLJFF;
            }
        }
        C1599060riK c1599060riK = C1599060riK.LIZ;
        if (C1599060riK.LIZIZ.LIZIZ.LIZIZ()) {
            C1599020riG.LIZIZ.decrementAndGet();
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("PostRefreshAutoLoad", "skip post-refresh auto load: coordinator already triggering");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("InboxSkylightPostRefreshAutoLoadHandler@bd79.maybeSchedulePostRefreshLoadMore$job$1");
            return unit;
        }
        if (!this.LLILLL.LJJIIJZLJL() && !this.LLILLL.GQ2()) {
            SkylightListViewModel skylightListViewModel = this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("post-refresh auto load, consecutiveCount=");
            AtomicInteger atomicInteger = C1599020riG.LIZIZ;
            sbLIZ.append(atomicInteger.get());
            if (!c1599060riK.LIZ(skylightListViewModel, skylightListViewModel, C2188811AlT.LIZIZ(sbLIZ), new AwS568S0100000_24(this.LLILLL, 1855))) {
                atomicInteger.decrementAndGet();
                int i3 = C2187451AjH.LIZ;
                C1720106oR.LJI("PostRefreshAutoLoad", "skip post-refresh auto load: lost race to coordinator");
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("InboxSkylightPostRefreshAutoLoadHandler@bd79.maybeSchedulePostRefreshLoadMore$job$1");
            return unit2;
        }
        C1599020riG.LIZIZ.decrementAndGet();
        int i4 = C2187451AjH.LIZ;
        C1720106oR.LJI("PostRefreshAutoLoad", "skip post-refresh auto load: already refreshing or loading");
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("InboxSkylightPostRefreshAutoLoadHandler@bd79.maybeSchedulePostRefreshLoadMore$job$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
