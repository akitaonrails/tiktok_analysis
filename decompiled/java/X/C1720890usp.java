package X;

import android.view.View;
import com.bytedance.pipo.stellar.base.model.PriceDO;
import com.bytedance.pipo.ttpay.portal.wallet.BalanceCardAdapter;
import com.bytedance.pipo.ttpay.portal.wallet.BalanceDO;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0usp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720890usp extends C09AY implements Function2<C03H5, Boolean, Unit> {
    public final /* synthetic */ C1720610usN LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1720890usp(C1720610usN c1720610usN, View view, boolean z) {
        super(2);
        this.LL = c1720610usN;
        this.LLILLJJLI = view;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(C03H5 c03h5, Boolean bool) {
        PriceDO priceDO;
        String amount;
        boolean zBooleanValue = bool.booleanValue();
        BalanceDO balanceDO = this.LL.LLJILLL;
        if (balanceDO != null && (priceDO = balanceDO.balance) != null && (amount = priceDO.getAmount()) != null) {
            View view = this.LLILLJJLI;
            boolean z = this.LLILLL;
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ayo);
            if (!zBooleanValue) {
                amount = "******";
            }
            tuxTextView.setText(amount);
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            BalanceCardAdapter.V5(view, z);
        } else {
            View view2 = this.LLILLJJLI;
            boolean z2 = this.LLILLL;
            C786410Ut5.LLLLZLL((TuxTextView) view2.findViewById(R.id.ayo), 8);
            BalanceCardAdapter.V5(view2, z2);
        }
        return Unit.LIZ;
    }
}
