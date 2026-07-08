package X;

import Y.AObserverS222S0100000_18;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.model.PurchaseOption;
import com.ss.android.ugc.aweme.series.singleepisode.fragment.SeriesPurchaseOptionFragment;
import com.ss.android.ugc.aweme.service.ISeriesPricingService;
import com.ss.android.ugc.aweme.service.MiniDramaPaymentService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0s6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.singleepisode.fragment.SeriesPurchaseOptionFragment$onViewCreated$2$1$1", f = "SeriesPurchaseOptionFragment.kt", l = {}, m = "invokeSuspend")
public final class C1614170s6h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SeriesPurchaseOptionFragment LL;
    public final /* synthetic */ C05P0<Map<String, String>> LLILLJJLI;
    public final /* synthetic */ C05P0<Boolean> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1614170s6h(SeriesPurchaseOptionFragment seriesPurchaseOptionFragment, C05P0<Map<String, String>> c05p0, C05P0<Boolean> c05p02, InterfaceC1364105Vn<? super C1614170s6h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = seriesPurchaseOptionFragment;
        this.LLILLJJLI = c05p0;
        this.LLILLL = c05p02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1614170s6h(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0s6g, X.0s6z] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesPurchaseOptionFragment@53ea.onViewCreated$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LL.getContext();
        if (context != null) {
            final SeriesPurchaseOptionFragment seriesPurchaseOptionFragment = this.LL;
            C05P0<Map<String, String>> c05p0 = this.LLILLJJLI;
            final C05P0<Boolean> c05p02 = this.LLILLL;
            ISeriesPricingService.LIZ.getClass();
            ISeriesPricingService iSeriesPricingServiceLIZ = C1613940s6K.LIZ();
            if (iSeriesPricingServiceLIZ != null) {
                List<PurchaseOption> list = seriesPurchaseOptionFragment.LLJI;
                ArrayList arrayList = new ArrayList();
                for (PurchaseOption purchaseOption : list) {
                    PriceInfo priceInfo = purchaseOption.discountedPrice;
                    if (priceInfo != null || (priceInfo = purchaseOption.price) != null) {
                        arrayList.add(priceInfo);
                    }
                }
                MutableLiveData mutableLiveDataLIZ = iSeriesPricingServiceLIZ.LIZ(context, arrayList);
                if (mutableLiveDataLIZ != null) {
                    mutableLiveDataLIZ.observe(seriesPurchaseOptionFragment, new AObserverS222S0100000_18(c05p0, 14));
                }
            }
            ?? r1 = new InterfaceC1614350s6z() { // from class: X.0s6g
                @Override // X.InterfaceC1614350s6z
                public final void jI1(boolean z) {
                    c05p02.setValue(Boolean.valueOf(z));
                }

                @Override // X.InterfaceC1614350s6z
                public final void sX0(AbstractC1159090gGh abstractC1159090gGh) {
                    CollectionDetailModel collectionDetailModel;
                    C1614180s6i c1614180s6iSR = seriesPurchaseOptionFragment.SR();
                    if ((c1614180s6iSR != null && (collectionDetailModel = c1614180s6iSR.collectionDetailModel) != null && abstractC1159090gGh.LIZ() == collectionDetailModel.collectionId) || seriesPurchaseOptionFragment.isResumed()) {
                        if (abstractC1159090gGh instanceof C1159110gGj) {
                            c05p02.setValue(Boolean.TRUE);
                            return;
                        }
                        if (abstractC1159090gGh instanceof C1159130gGl) {
                            String str = TuxSheet._pnsPageId;
                            C1391190mJ3.LJFF(seriesPurchaseOptionFragment, C343970De7.LIZ);
                        } else {
                            if ((abstractC1159090gGh instanceof C1159260gGy) || !(abstractC1159090gGh instanceof C1159120gGk)) {
                                return;
                            }
                            c05p02.setValue(Boolean.FALSE);
                        }
                    }
                }
            };
            MiniDramaPaymentService miniDramaPaymentService = (MiniDramaPaymentService) seriesPurchaseOptionFragment.LLJIJIL.getValue();
            if (miniDramaPaymentService != 0) {
                miniDramaPaymentService.LJIIJ(r1);
            }
            seriesPurchaseOptionFragment.LLJILLL = r1;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeriesPurchaseOptionFragment@53ea.onViewCreated$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
