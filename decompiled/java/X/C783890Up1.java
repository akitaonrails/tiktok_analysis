package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.LivePodcastResponse;

/* JADX INFO: renamed from: X.0Up1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.live.LivePodcastDataManager$requestPodcastData$1$1$3$1", f = "LivePodcastDataManager.kt", l = {}, m = "invokeSuspend")
public final class C783890Up1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LivePodcastResponse.ResponseData LL;
    public final /* synthetic */ Function1<LivePodcastResponse.ResponseData, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C783890Up1(LivePodcastResponse.ResponseData responseData, Function1<? super LivePodcastResponse.ResponseData, Unit> function1, InterfaceC1364105Vn<? super C783890Up1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = responseData;
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C783890Up1(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LivePodcastDataManager@2f90.requestPodcastData$1$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20441214yg.LIZIZ("LivePodcastDataManager", "return FileCacheData");
        C783820Uou c783820Uou = C783820Uou.LIZ;
        LivePodcastResponse.ResponseData responseData = this.LL;
        Function1<LivePodcastResponse.ResponseData, Unit> function1 = this.LLILLJJLI;
        c783820Uou.getClass();
        C783820Uou.LJIIIIZZ(responseData, function1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LivePodcastDataManager@2f90.requestPodcastData$1$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
