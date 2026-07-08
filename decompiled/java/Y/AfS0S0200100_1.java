package Y;

import X.C03O0;
import X.C09AJ;
import X.C09JN;
import X.C0X52;
import X.C1C7U;
import X.C2188811AlT;
import X.C2341109Fh;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS16S0001000_1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public class AfS0S0200100_1 implements C09JN {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS0S0200100_1 afS0S0200100_1, Object obj) {
        C1C7U.LIZ("AddressSelectViewModel@235c.getAddressList$1");
        Response response = (Response) ((C0X52) obj).LIZIZ;
        T t = response.data;
        if (response.isCodeOK() && t != 0) {
            ((AddressSelectViewModel) afS0S0200100_1.l0).mR2(afS0S0200100_1.j2, null, true);
            ((Function1) afS0S0200100_1.l1).invoke(t);
            ((AddressSelectViewModel) afS0S0200100_1.l0).SB1(-1);
        } else {
            ((AddressSelectViewModel) afS0S0200100_1.l0).mR2(afS0S0200100_1.j2, response.message, false);
            ((AddressSelectViewModel) afS0S0200100_1.l0).SB1(3);
        }
        C1C7U.LIZIZ("AddressSelectViewModel@235c.getAddressList$1");
    }

    public static final void accept$1(AfS0S0200100_1 afS0S0200100_1, Object obj) {
        C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestByChunkObservable$observer$1$2");
        Throwable th = (Throwable) obj;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFailed, ");
        sbLIZ.append(th.getMessage());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        ((C09AJ) afS0S0200100_1.l0).onError(th);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C03O0 c03o0 = C03O0.LIZ;
        String message = th.getMessage();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis - afS0S0200100_1.j2);
        Boolean firstLoad = ((BillInfoRequest) afS0S0200100_1.l1).getFirstLoad();
        c03o0.getClass();
        C03O0.LJJIJLIJ(message, lValueOf, firstLoad);
        C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestByChunkObservable$observer$1$2");
    }

    public static final void accept$2(AfS0S0200100_1 afS0S0200100_1, Object obj) {
        C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestByChunkPbObservable$observer$1$2");
        Throwable th = (Throwable) obj;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFailed, ");
        sbLIZ.append(th.getMessage());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        ((C09AJ) afS0S0200100_1.l0).onError(th);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C03O0 c03o0 = C03O0.LIZ;
        String message = th.getMessage();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis - afS0S0200100_1.j2);
        Boolean firstLoad = ((BillInfoRequest) afS0S0200100_1.l1).getFirstLoad();
        c03o0.getClass();
        C03O0.LJJIJLIJ(message, lValueOf, firstLoad);
        C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestByChunkPbObservable$observer$1$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS0S0200100_1 afS0S0200100_1, Object obj) {
        C1C7U.LIZ("DeliveryPanelViewModel@1cc7.getLogisticForPDP$dispose$1");
        Response response = (Response) obj;
        DeliveryData deliveryData = (DeliveryData) response.data;
        if (response.isCodeOK() && deliveryData != null) {
            ((DeliveryPanelViewModel) afS0S0200100_1.l0).BR2(afS0S0200100_1.j2, null, true);
            DeliveryPanelViewModel deliveryPanelViewModel = (DeliveryPanelViewModel) afS0S0200100_1.l0;
            deliveryPanelViewModel.LLJI = deliveryData;
            deliveryPanelViewModel.setState(new AwS580S0100000_1(deliveryData, 377));
            if (deliveryData.exceptionUX != null) {
                ((DeliveryPanelViewModel) afS0S0200100_1.l0).setState(new AwS580S0100000_1(deliveryData, 378));
            }
            DeliveryPanelViewModel deliveryPanelViewModel2 = (DeliveryPanelViewModel) afS0S0200100_1.l0;
            deliveryPanelViewModel2.setState(new AwS210S0300000_1(deliveryPanelViewModel2, deliveryData, (DeliveryPanelStarter.EnterParamForProductDetailPage) afS0S0200100_1.l1, 47));
        } else {
            DeliveryPanelViewModel deliveryPanelViewModel3 = (DeliveryPanelViewModel) afS0S0200100_1.l0;
            deliveryPanelViewModel3.getClass();
            deliveryPanelViewModel3.setState(new AwS16S0001000_1(3, 17));
            ((DeliveryPanelViewModel) afS0S0200100_1.l0).BR2(afS0S0200100_1.j2, response.message, false);
        }
        C1C7U.LIZIZ("DeliveryPanelViewModel@1cc7.getLogisticForPDP$dispose$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0007: IPUT (r5 I:java.lang.Object), (r0 I:Y.AfS0S0200100_1) (LINE:67108871) Y.AfS0S0200100_1.l1 java.lang.Object, block:B:2:0x0000 */
    public AfS0S0200100_1(Object obj, AddressSelectViewModel addressSelectViewModel, long j, Function1<? super AddressListData, Unit> function1) {
        Object obj2;
        this.$t = function1;
        this.l0 = obj;
        this.j2 = addressSelectViewModel;
        this.l1 = obj2;
    }
}
