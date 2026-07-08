package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.viewmodel.SeriesPanelSquareViewModel;
import com.ss.android.ugc.aweme.model.PaidCollectionPanelResponse;
import com.ss.android.ugc.aweme.service.MiniDramaNetworkApiService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.viewmodel.SeriesPanelSquareViewModel$fetchBothData$2$panelResponse$1", f = "SeriesPanelSquareViewModel.kt", l = {268}, m = "invokeSuspend")
public final class C1411290mpT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PaidCollectionPanelResponse>, Object> {
    public int LL;
    public final /* synthetic */ SeriesPanelSquareViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411290mpT(SeriesPanelSquareViewModel seriesPanelSquareViewModel, InterfaceC1364105Vn<? super C1411290mpT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = seriesPanelSquareViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1411290mpT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PaidCollectionPanelResponse paidCollectionPanelResponse;
        C1C7U.LIZ("SeriesPanelSquareViewModel@be88.fetchBothData$2$panelResponse$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            MiniDramaNetworkApiService.LIZ.getClass();
            MiniDramaNetworkApiService miniDramaNetworkApiServiceLIZ = C1411300mpU.LIZ();
            if (miniDramaNetworkApiServiceLIZ != null) {
                Long lLJFF = C2286608xc.LJFF(this.LLILLJJLI.vQ2());
                this.LL = 1;
                obj = miniDramaNetworkApiServiceLIZ.LIZJ(lLJFF, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SeriesPanelSquareViewModel@be88.fetchBothData$2$panelResponse$1");
                    return objLJFF;
                }
            }
            paidCollectionPanelResponse = null;
            C1C7U.LIZIZ("SeriesPanelSquareViewModel@be88.fetchBothData$2$panelResponse$1");
            return paidCollectionPanelResponse;
        }
        paidCollectionPanelResponse = (PaidCollectionPanelResponse) obj;
        C1C7U.LIZIZ("SeriesPanelSquareViewModel@be88.fetchBothData$2$panelResponse$1");
        return paidCollectionPanelResponse;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PaidCollectionPanelResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
