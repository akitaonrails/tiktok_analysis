package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.LivePodcastApiPreRequestExperiment;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.LivePodcastResponse;

/* JADX INFO: renamed from: X.0Uoz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.live.LivePodcastDataManager$requestPodcastData$1", f = "LivePodcastDataManager.kt", l = {111, 118, 130}, m = "invokeSuspend")
public final class C783870Uoz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function1<LivePodcastResponse.ResponseData, Unit> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C783870Uoz(String str, Function1 function1, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C783870Uoz(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LivePodcastDataManager@2f90.requestPodcastData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C783820Uou c783820Uou = C783820Uou.LIZ;
            Function1<LivePodcastResponse.ResponseData, Unit> function1 = this.LLILLJJLI;
            c783820Uou.getClass();
            C783820Uou.LJIIIIZZ(null, function1);
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LivePodcastDataManager@2f90.requestPodcastData$1");
                    return unit;
                }
                C155000ia.LIZIZ(obj);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("LivePodcastDataManager@2f90.requestPodcastData$1");
                return unit2;
            }
            C155000ia.LIZIZ(obj);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("LivePodcastDataManager@2f90.requestPodcastData$1");
            return unit3;
        }
        C155000ia.LIZIZ(obj);
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null) {
            Function1<LivePodcastResponse.ResponseData, Unit> function12 = this.LLILLJJLI;
            String str = this.LLILLL;
            if (LivePodcastApiPreRequestExperiment.isV2()) {
                C783820Uou.LIZ.getClass();
                LivePodcastResponse.ResponseData responseDataLJ = C783820Uou.LJ(iUserService);
                if (responseDataLJ != null) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                    C783900Up2 c783900Up2 = new C783900Up2(responseDataLJ, function12, null);
                    this.LL = 1;
                    if (C23250099c.LJI(this, abstractC2238408pq, c783900Up2) == objLJFF) {
                        C1C7U.LIZIZ("LivePodcastDataManager@2f90.requestPodcastData$1");
                        return objLJFF;
                    }
                    Unit unit32 = Unit.LIZ;
                    C1C7U.LIZIZ("LivePodcastDataManager@2f90.requestPodcastData$1");
                    return unit32;
                }
                LivePodcastResponse.ResponseData responseDataLIZLLL = C783820Uou.LIZLLL();
                if (responseDataLIZLLL != null) {
                    C1DFH c1dfh2 = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
                    C783880Up0 c783880Up0 = new C783880Up0(responseDataLIZLLL, function12, null);
                    this.LL = 2;
                    if (C23250099c.LJI(this, abstractC2238408pq2, c783880Up0) == objLJFF) {
                        C1C7U.LIZIZ("LivePodcastDataManager@2f90.requestPodcastData$1");
                        return objLJFF;
                    }
                    Unit unit22 = Unit.LIZ;
                    C1C7U.LIZIZ("LivePodcastDataManager@2f90.requestPodcastData$1");
                    return unit22;
                }
                C783820Uou.LIZJ(str, function12);
            } else {
                C783820Uou.LIZ.getClass();
                LivePodcastResponse.ResponseData responseDataLIZLLL2 = C783820Uou.LIZLLL();
                if (responseDataLIZLLL2 != null) {
                    C1DFH c1dfh3 = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pq3 = C2107308Nj.LIZ;
                    C783890Up1 c783890Up1 = new C783890Up1(responseDataLIZLLL2, function12, null);
                    this.LL = 3;
                    if (C23250099c.LJI(this, abstractC2238408pq3, c783890Up1) == objLJFF) {
                        C1C7U.LIZIZ("LivePodcastDataManager@2f90.requestPodcastData$1");
                        return objLJFF;
                    }
                    Unit unit4 = Unit.LIZ;
                    C1C7U.LIZIZ("LivePodcastDataManager@2f90.requestPodcastData$1");
                    return unit4;
                }
                C783820Uou.LIZJ(str, function12);
            }
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("LivePodcastDataManager@2f90.requestPodcastData$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
