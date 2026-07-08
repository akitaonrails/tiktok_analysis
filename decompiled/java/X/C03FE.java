package X;

import android.os.SystemClock;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ExtraLogisticsInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03FE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03FE extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ ExtraLogisticsInfoViewHolder LLILLJJLI;
    public final /* synthetic */ LogisticDTO LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03FE(long j, ExtraLogisticsInfoViewHolder extraLogisticsInfoViewHolder, LogisticDTO logisticDTO) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = extraLogisticsInfoViewHolder;
        this.LLILLL = logisticDTO;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String priceVal;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LL;
        Set<String> set = C03FA.LIZ;
        String str = ((DeliveryPanelViewModel) this.LLILLJJLI.LLJILLL.getValue()).LLJILLL;
        Price price = this.LLILLL.shippingFee;
        Float fLJIIIIZZ = (price == null || (priceVal = price.getPriceVal()) == null) ? null : C2327809Ae.LJIIIIZZ(priceVal);
        Price price2 = this.LLILLL.shippingFee;
        C03FA.LJIIIZ(str, fLJIIIIZZ, price2 != null ? price2.getCurrency() : null, Long.valueOf(jElapsedRealtime), null, 48);
        TuxSheet tuxSheet = this.LLILLJJLI.LLJJI;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        return Unit.LIZ;
    }
}
