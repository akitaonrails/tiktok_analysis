package X;

import Y.AgS304S0100000_24;
import com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel;
import com.ss.android.ugc.aweme.service.MiniDramaDetailOperator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0s2b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel$syncCollectionDetailModel$1", f = "SeriesDetailVideoListViewModel.kt", l = {1090}, m = "invokeSuspend")
public final class C1611630s2b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SeriesDetailVideoListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1611630s2b(SeriesDetailVideoListViewModel seriesDetailVideoListViewModel, InterfaceC1364105Vn<? super C1611630s2b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = seriesDetailVideoListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1611630s2b(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252321DDq c2252321DDqWm;
        C1C7U.LIZ("SeriesDetailVideoListViewModel@30b7.syncCollectionDetailModel$1");
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
            MiniDramaDetailOperator.LIZ.getClass();
            MiniDramaDetailOperator miniDramaDetailOperatorLIZ = C1392670mLR.LIZ();
            if (miniDramaDetailOperatorLIZ != null && (c2252321DDqWm = miniDramaDetailOperatorLIZ.Wm(this.LLILLJJLI.CQ2().LL)) != null) {
                AgS304S0100000_24 agS304S0100000_24 = new AgS304S0100000_24(this.LLILLJJLI, 1);
                this.LL = 1;
                if (c2252321DDqWm.collect(agS304S0100000_24, this) == objLJFF) {
                    C1C7U.LIZIZ("SeriesDetailVideoListViewModel@30b7.syncCollectionDetailModel$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeriesDetailVideoListViewModel@30b7.syncCollectionDetailModel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
