package X;

import Y.AgS285S0100000_4;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.videmodel.TakoFeedRightBottomEntranceFixedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ckc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.videmodel.TakoFeedRightBottomEntranceFixedViewModel$initViewPagerListenerIfNot$3", f = "TakoFeedRightBottomEntranceViewModel.kt", l = {228}, m = "invokeSuspend")
public final class C322520Ckc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoFeedRightBottomEntranceFixedViewModel LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C322520Ckc(TakoFeedRightBottomEntranceFixedViewModel takoFeedRightBottomEntranceFixedViewModel, C013C c013c, InterfaceC1364105Vn<? super C322520Ckc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoFeedRightBottomEntranceFixedViewModel;
        this.LLILLL = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C322520Ckc(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoFeedRightBottomEntranceFixedViewModel@ccb0.initViewPagerListenerIfNot$3");
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
            TakoFeedRightBottomEntranceFixedViewModel takoFeedRightBottomEntranceFixedViewModel = this.LLILLJJLI;
            C515901zh c515901zhLJIIIZ = C09IC.LJIIIZ(takoFeedRightBottomEntranceFixedViewModel.LLILLJJLI, takoFeedRightBottomEntranceFixedViewModel.LLILLL, takoFeedRightBottomEntranceFixedViewModel.LLILZ, takoFeedRightBottomEntranceFixedViewModel.LLILZIL, new C322500Cka(this.LLILLL, null));
            AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(this.LLILLJJLI, 74);
            this.LL = 1;
            if (c515901zhLJIIIZ.collect(agS285S0100000_4, this) == objLJFF) {
                C1C7U.LIZIZ("TakoFeedRightBottomEntranceFixedViewModel@ccb0.initViewPagerListenerIfNot$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoFeedRightBottomEntranceFixedViewModel@ccb0.initViewPagerListenerIfNot$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
