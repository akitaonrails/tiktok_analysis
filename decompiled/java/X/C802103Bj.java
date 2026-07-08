package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuantityControlInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS88S0201000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Bj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C802103Bj {
    public final OrderSubmitAssemViewModel LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 14));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 15));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 13));

    public C802103Bj(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZ = orderSubmitAssemViewModel;
    }

    public final void LIZ(TuxTextView tuxTextView, C719102rN c719102rN) {
        String str;
        Integer num;
        int iIntValue;
        Integer num2;
        Integer num3 = c719102rN.LLJJIJIIJIL;
        if (num3 != null && (iIntValue = num3.intValue()) > 0 && c719102rN.LLIZ > iIntValue) {
            C799803Am.LIZ(iIntValue, (String) this.LIZLLL.getValue());
            C802003Bi c802003Bi = this.LIZ.LLLLZIL;
            if (c802003Bi != null && Intrinsics.LJFF(c802003Bi.LIZ, c719102rN.LLILZLL) && (num2 = c802003Bi.LIZIZ) != null && num2.intValue() <= iIntValue) {
                String strLIZ = C799803Am.LIZ(iIntValue, (String) this.LIZJ.getValue());
                C1389890mGx c1389890mGx = new C1389890mGx(tuxTextView);
                c1389890mGx.LJIIJ(strLIZ);
                c1389890mGx.LJIIJJI();
                C1018703yb.LIZLLL("tiktokec_toast_show", new AwS88S0201000_1(this, iIntValue, c719102rN, 0));
            }
        }
        QuantityControlInfo quantityControlInfo = c719102rN.LLLF;
        if (quantityControlInfo != null) {
            str = quantityControlInfo.notice;
        } else {
            str = null;
        }
        C0H1U.LJIIL(tuxTextView, str, true);
        QuantityControlInfo quantityControlInfo2 = c719102rN.LLLF;
        if (quantityControlInfo2 != null && (num = quantityControlInfo2.noticeColor) != null) {
            tuxTextView.setTextColorRes(C7736030k.LIZ(Integer.valueOf(num.intValue()), null));
        } else {
            tuxTextView.setTextColorRes(R.attr.a1q);
        }
    }
}
