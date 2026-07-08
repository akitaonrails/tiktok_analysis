package Y;

import X.AbstractC1086560eNi;
import X.AnonymousClass0368;
import X.C034S;
import X.C03WW;
import X.C1010503xH;
import X.C1064604Ei;
import X.C1064904El;
import X.C1120604Zw;
import X.C123100dR;
import X.C1389890mGx;
import X.C1AQS;
import X.C1C7U;
import X.C2097908Jt;
import X.C7879035x;
import android.app.Activity;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.TouchDelegate;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShippingAddressParam;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ChunkConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class ARunnableS10S0201000_1 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$0() {
        BillInfoData billInfoData;
        IECommerceHostService iECommerceHostService;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) this.l0;
        BillInfoResponse billInfoResponse = (BillInfoResponse) this.l1;
        Map mapLIZJ = null;
        mapLIZJ = null;
        orderSubmitAssemViewModel.LLJJIJI = billInfoResponse != null ? Integer.valueOf(billInfoResponse.code).toString() : null;
        BillInfoResponse billInfoResponse2 = (BillInfoResponse) this.l1;
        if ((billInfoResponse2 != null ? billInfoResponse2.data : null) == null) {
            C1120604Zw c1120604Zw = C1120604Zw.LIZ;
            String string = C7879035x.LIZ().getResources().getString(2131848101);
            if (C034S.LIZ()) {
                c1120604Zw.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                IActivityStackDependencyService iActivityStackDependencyServiceCreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, IActivityStackDependencyService.class.getName(), iActivityStackDependencyServiceCreateIActivityStackDependencyServicebyMonsterPlugin != null ? iActivityStackDependencyServiceCreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName() : null, iActivityStackDependencyServiceCreateIActivityStackDependencyServicebyMonsterPlugin != null);
                iECommerceHostService = iActivityStackDependencyServiceCreateIActivityStackDependencyServicebyMonsterPlugin;
            } else {
                c1120604Zw.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
            }
            Activity topActivity = ((IActivityStackDependencyService) iECommerceHostService).getTopActivity();
            if (topActivity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(topActivity);
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
            }
            if (((ChunkConfig) C03WW.LIZIZ.getValue()).showLoading) {
                ((OrderSubmitAssemViewModel) this.l0).setState(AFwS228S0000000_1.get$arr$(501));
            }
            ((OrderSubmitAssemViewModel) this.l0).cT2(false);
            return;
        }
        T t = billInfoResponse2.data;
        if ((t instanceof BillInfoData) && (billInfoData = (BillInfoData) t) != null && Intrinsics.LJFF(billInfoData.lastChunk, Boolean.TRUE)) {
            if (((ChunkConfig) C03WW.LIZIZ.getValue()).showLoading) {
                ((OrderSubmitAssemViewModel) this.l0).setState(AFwS228S0000000_1.get$arr$(502));
            }
            ((OrderSubmitAssemViewModel) this.l0).cT2(false);
            if (((OrderSubmitAssemViewModel) this.l0).LLLZIL) {
                ((OrderSubmitAssemViewModel) this.l0).LLLZIL = false;
                OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = (OrderSubmitAssemViewModel) this.l0;
                BillInfoData billInfoData2 = orderSubmitAssemViewModel2.LLJJI;
                if (billInfoData2 != null) {
                    orderSubmitAssemViewModel2.xS2(billInfoData2);
                }
            }
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = (OrderSubmitAssemViewModel) this.l0;
        BillInfoData billInfoData3 = (BillInfoData) ((BillInfoResponse) this.l1).data;
        int i = this.i2;
        Boolean boolValueOf = Boolean.valueOf(orderSubmitAssemViewModel3.q);
        OrderSubmitAssemViewModel orderSubmitAssemViewModel4 = (OrderSubmitAssemViewModel) this.l0;
        ShippingAddressParam shippingAddressParam = orderSubmitAssemViewModel4.LLZL;
        String str = orderSubmitAssemViewModel4.s;
        if (str != null && C123100dR.LIZ(str)) {
            mapLIZJ = C2097908Jt.LIZJ(new Pair("pdp_bnpl_selected_tenure", str));
        }
        OrderSubmitAssemViewModel.RQ2(orderSubmitAssemViewModel3, billInfoData3, new BillInfoRequest(null, 0, null, true, true, true, AnonymousClass0368.LIZ(), null, null, null, null, true, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, i, boolValueOf, null, null, null, null, null, null, null, null, null, shippingAddressParam, null, null, null, null, null, null, null, mapLIZJ, null, null, null, null, null, null, null, null, null, null, null), false, false, true, ((BillInfoResponse) this.l1).chunkIndex, null, false, 204);
    }

    public final void LIZ$1() {
        Rect rect = new Rect();
        ((View) this.l0).getHitRect(rect);
        int i = this.i2;
        rect.left -= i;
        rect.top -= i;
        rect.right += i;
        rect.bottom += i;
        ((View) this.l1).setTouchDelegate(new TouchDelegate(rect, (View) this.l0));
    }

    public final void LIZ$2() {
        if (((View) this.l0).getParent() == null) {
            return;
        }
        Rect rect = new Rect();
        ((View) this.l1).getHitRect(rect);
        int i = -((int) (this.i2 * ((View) this.l1).getResources().getDisplayMetrics().density));
        rect.inset(i, i);
        ((View) this.l0).setTouchDelegate(new TouchDelegate(rect, (View) this.l1));
    }

    public final void LIZ$3() {
        if (((View) this.l0).getParent() == null) {
            return;
        }
        int[] iArr = new int[2];
        ((View) this.l0).getLocationOnScreen(iArr);
        int i = iArr[1];
        int height = ((View) this.l0).getHeight() + i;
        int[] iArr2 = new int[2];
        ((AbstractC1086560eNi) this.l1).getLocationOnScreen(iArr2);
        int i2 = iArr2[1];
        int height2 = ((AbstractC1086560eNi) this.l1).getRootView().getHeight() - this.i2;
        int i3 = ((height2 - i2) / 2) + i2;
        ((AbstractC1086560eNi) this.l1).smoothScrollBy(0, (i < i2 || height > height2 || i > i3) ? ((i + height) / 2) - i3 : 0);
    }

    public static final void run$0(ARunnableS10S0201000_1 aRunnableS10S0201000_1) {
        boolean zLIZ;
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.handleBillInfoChunkAsync$2$1$runnable$1");
        try {
            aRunnableS10S0201000_1.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.handleBillInfoChunkAsync$2$1$runnable$1");
    }

    public static final void run$1(ARunnableS10S0201000_1 aRunnableS10S0201000_1) {
        boolean zLIZ;
        C1C7U.LIZ("TouchDelegateUtils@2a9f.expandTouchArea$1");
        try {
            aRunnableS10S0201000_1.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TouchDelegateUtils@2a9f.expandTouchArea$1");
    }

    public static final void run$2(ARunnableS10S0201000_1 aRunnableS10S0201000_1) {
        boolean zLIZ;
        C1C7U.LIZ("TouchDelegateUtilsKt@a246.expandTouchArea$1");
        try {
            aRunnableS10S0201000_1.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TouchDelegateUtilsKt@a246.expandTouchArea$1");
    }

    public static final void run$3(ARunnableS10S0201000_1 aRunnableS10S0201000_1) {
        boolean zLIZ;
        C1C7U.LIZ("SpecLayoutV2@e2c4.updateAdapterList$1$1");
        try {
            C1064604Ei c1064604Ei = (C1064604Ei) aRunnableS10S0201000_1.l0;
            if (c1064604Ei.LLJILJIL != aRunnableS10S0201000_1.i2) {
                ((C1064904El) aRunnableS10S0201000_1.l1).getClass();
                c1064604Ei.getSpecListFromXml().scrollToPosition(aRunnableS10S0201000_1.i2);
                C1064604Ei c1064604Ei2 = (C1064604Ei) aRunnableS10S0201000_1.l0;
                c1064604Ei2.LLJILJIL = c1064604Ei2.LLJIJIL;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SpecLayoutV2@e2c4.updateAdapterList$1$1");
    }

    public static final void run$4(ARunnableS10S0201000_1 aRunnableS10S0201000_1) {
        boolean zLIZ;
        C1C7U.LIZ("BasePowerList@4e15.scrollAboveKeyboard$1");
        try {
            aRunnableS10S0201000_1.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BasePowerList@4e15.scrollAboveKeyboard$1");
    }

    public static final void run$5(ARunnableS10S0201000_1 aRunnableS10S0201000_1) {
        boolean zLIZ;
        C1C7U.LIZ("GeneralInfoTextOverlapResolver@1795.checkAndHandleOverlap$1");
        try {
            C1010503xH.LIZ((View) aRunnableS10S0201000_1.l0, aRunnableS10S0201000_1.i2 + 1, (Function0) aRunnableS10S0201000_1.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GeneralInfoTextOverlapResolver@1795.checkAndHandleOverlap$1");
    }

    public ARunnableS10S0201000_1(View view, TuxTextView tuxTextView, int i) {
        this.$t = i;
        this.l0 = view;
        this.l1 = tuxTextView;
        this.i2 = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS10S0201000_1(Object obj, View view, int i, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = obj;
        this.i2 = view;
        this.l1 = i;
    }
}
