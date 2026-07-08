package Y;

import X.C05XL;
import X.C09JN;
import X.C1054004Ag;
import X.C1389890mGx;
import X.C1AF0;
import X.C1C7U;
import X.C259800zU;
import X.C726802sc;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;

/* JADX INFO: loaded from: classes2.dex */
public class AfS99S0300000_1 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
    public static final void accept$0(AfS99S0300000_1 afS99S0300000_1, Object obj) {
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.queryRequestByChunk$1$2");
        ((OrderSubmitAssemViewModel) afS99S0300000_1.l0).nT2();
        ((OrderSubmitAssemViewModel) afS99S0300000_1.l0).dS2((BillInfoData) ((C259800zU) afS99S0300000_1.l1).element);
        ((OrderSubmitAssemViewModel) afS99S0300000_1.l0).setState(AFwS228S0000000_1.get$arr$(459));
        ((C05XL) afS99S0300000_1.l2).LJIIZILJ(Unit.LIZ);
        C1AF0.LJ((Throwable) obj);
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.queryRequestByChunk$1$2");
    }

    public static final void accept$1(AfS99S0300000_1 afS99S0300000_1, Object obj) {
        C1C7U.LIZ("PdpPromotionMgr@5d5d.setFlashSaleReminder$dispose$1");
        if (!((Response) obj).isCodeOK()) {
            C1054004Ag c1054004Ag = ((C726802sc) afS99S0300000_1.l0).LIZ.LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                c1054004Ag.LJIJ("app_registration", false);
            }
            C1389890mGx c1389890mGx = new C1389890mGx((View) afS99S0300000_1.l1);
            c1389890mGx.LJIIIZ(2131857270);
            c1389890mGx.LIZLLL(1000L);
            c1389890mGx.LJIIJJI();
        } else {
            C1054004Ag c1054004Ag2 = ((C726802sc) afS99S0300000_1.l0).LIZ.LLJLILLLLZIIL;
            if (c1054004Ag2 != null) {
                c1054004Ag2.LJIJ("app_registration", true);
            }
            ((Function0) afS99S0300000_1.l2).invoke();
        }
        C1C7U.LIZIZ("PdpPromotionMgr@5d5d.setFlashSaleReminder$dispose$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS99S0300000_1(Object obj, OrderSubmitAssemViewModel orderSubmitAssemViewModel, C259800zU<BillInfoData> c259800zU, C05XL<Unit> c05xl) {
        this.$t = c05xl;
        this.l0 = obj;
        this.l1 = orderSubmitAssemViewModel;
        this.l2 = c259800zU;
    }
}
