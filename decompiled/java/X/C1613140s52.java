package X;

import Y.AgS304S0100000_24;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.viewmodel.SeriesPanelSquareViewModel;
import com.ss.android.ugc.aweme.service.MiniDramaDetailOperator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0s52, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.viewmodel.SeriesPanelSquareViewModel$syncCollectionDetailModel$1", f = "SeriesPanelSquareViewModel.kt", l = {414}, m = "invokeSuspend")
public final class C1613140s52 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SeriesPanelSquareViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1613140s52(SeriesPanelSquareViewModel seriesPanelSquareViewModel, InterfaceC1364105Vn<? super C1613140s52> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = seriesPanelSquareViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1613140s52(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252321DDq c2252321DDqWm;
        C1C7U.LIZ("SeriesPanelSquareViewModel@be88.syncCollectionDetailModel$1");
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
            if (miniDramaDetailOperatorLIZ != null && (c2252321DDqWm = miniDramaDetailOperatorLIZ.Wm(this.LLILLJJLI.vQ2())) != null) {
                AgS304S0100000_24 agS304S0100000_24 = new AgS304S0100000_24(this.LLILLJJLI, 2);
                this.LL = 1;
                if (c2252321DDqWm.collect(agS304S0100000_24, this) == objLJFF) {
                    C1C7U.LIZIZ("SeriesPanelSquareViewModel@be88.syncCollectionDetailModel$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeriesPanelSquareViewModel@be88.syncCollectionDetailModel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
