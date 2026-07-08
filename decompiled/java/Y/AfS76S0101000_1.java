package Y;

import X.AnonymousClass0368;
import X.C034S;
import X.C03S2;
import X.C03WX;
import X.C03X2;
import X.C09JN;
import X.C1120604Zw;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1AQS;
import X.C1C7U;
import X.C7879035x;
import X.C857203Wo;
import X.C928103jz;
import X.InterfaceC911603hK;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomOspCallbackOptModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class AfS76S0101000_1 implements C09JN {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS76S0101000_1 afS76S0101000_1, Object obj) {
        String string;
        Object obj2;
        BillInfoData billInfoData;
        IECommerceHostService iECommerceHostService;
        C928103jz top;
        Context context;
        Activity activityLIZ;
        boolean z;
        C1C7U.LIZ("MiniOspViewModel@8f4.handleBillInfoChunkAsync$1$1");
        Response response = (Response) obj;
        MiniOspViewModel miniOspViewModel = (MiniOspViewModel) afS76S0101000_1.l0;
        String name = null;
        if (response != null) {
            string = Integer.valueOf(response.code).toString();
        } else {
            string = null;
        }
        miniOspViewModel.LLJ = string;
        if (response != null) {
            obj2 = response.data;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            C1120604Zw c1120604Zw = C1120604Zw.LIZ;
            String string2 = C7879035x.LIZ().getResources().getString(2131848101);
            if (C034S.LIZ()) {
                c1120604Zw.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                c1120604Zw.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
            if (rootPageMonitor != null && (top = rootPageMonitor.getTop()) != null && (context = top.LIZ) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIJ(string2);
                c1389890mGx.LJIIJJI();
            }
            ((MiniOspViewModel) afS76S0101000_1.l0).setState(AFwS228S0000000_1.get$arr$(489));
            MiniOspViewModel miniOspViewModel2 = (MiniOspViewModel) afS76S0101000_1.l0;
            miniOspViewModel2.getClass();
            miniOspViewModel2.setState(new AwS16S0010000_1(false, 23));
        } else {
            T t = response.data;
            if ((t instanceof BillInfoData) && (billInfoData = (BillInfoData) t) != null && Intrinsics.LJFF(billInfoData.lastChunk, Boolean.TRUE)) {
                ((MiniOspViewModel) afS76S0101000_1.l0).setState(AFwS228S0000000_1.get$arr$(493));
                MiniOspViewModel miniOspViewModel3 = (MiniOspViewModel) afS76S0101000_1.l0;
                miniOspViewModel3.getClass();
                miniOspViewModel3.setState(new AwS16S0010000_1(false, 23));
                if (((MiniOspViewModel) afS76S0101000_1.l0).LLJLLL) {
                    ((MiniOspViewModel) afS76S0101000_1.l0).LLJLLL = false;
                    MiniOspViewModel miniOspViewModel4 = (MiniOspViewModel) afS76S0101000_1.l0;
                    BillInfoData billInfoData2 = miniOspViewModel4.LLIZ;
                    if (billInfoData2 != null) {
                        miniOspViewModel4.WQ2(billInfoData2);
                    }
                }
            }
            ((MiniOspViewModel) afS76S0101000_1.l0).zQ2((BillInfoData) response.data, new BillInfoRequest(null, 0, null, true, true, true, AnonymousClass0368.LIZ(), null, null, null, null, true, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, afS76S0101000_1.i1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), true, response.chunkIndex, null);
        }
        C1C7U.LIZIZ("MiniOspViewModel@8f4.handleBillInfoChunkAsync$1$1");
    }

    public static final void accept$1(AfS76S0101000_1 afS76S0101000_1, Object obj) {
        C03X2 c03x2;
        Integer num;
        C03X2 c03x22;
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.handleBillInfoChunkAsync$2$1");
        ARunnableS10S0201000_1 aRunnableS10S0201000_1 = new ARunnableS10S0201000_1((OrderSubmitAssemViewModel) afS76S0101000_1.l0, afS76S0101000_1.i1, (BillInfoResponse) obj, 0);
        C03S2.LIZ.getClass();
        EcomOspCallbackOptModel ecomOspCallbackOptModel = (EcomOspCallbackOptModel) C03S2.LIZJ.getValue();
        if (ecomOspCallbackOptModel != null && (num = ecomOspCallbackOptModel.optApiCallback) != null && num.intValue() == 2) {
            C03WX c03wx = ((OrderSubmitAssemViewModel) afS76S0101000_1.l0).LLLJIL;
            if (c03wx != null && (c03x22 = c03wx.LIZLLL) != null) {
                c03x22.LIZ(new C857203Wo(aRunnableS10S0201000_1, 1L, 0), true);
            }
        } else if (C03S2.LIZ()) {
            C03WX c03wx2 = ((OrderSubmitAssemViewModel) afS76S0101000_1.l0).LLLJIL;
            if (c03wx2 != null && (c03x2 = c03wx2.LIZLLL) != null) {
                c03x2.LIZ(new C857203Wo(aRunnableS10S0201000_1, null, null), true);
            }
        } else {
            aRunnableS10S0201000_1.run();
        }
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.handleBillInfoChunkAsync$2$1");
    }

    public AfS76S0101000_1(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
