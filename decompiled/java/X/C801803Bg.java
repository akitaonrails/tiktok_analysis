package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuantityControlInfo;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS88S0201000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Bg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C801803Bg extends C801903Bh {
    public C801803Bg(BillInfoData billInfoData, int i, C802003Bi c802003Bi, HashMap<String, Object> map) {
        super(billInfoData, i, c802003Bi, map);
    }

    @Override // X.C801903Bh
    public final void LIZ(TuxTextView tuxTextView, C719102rN c719102rN, boolean z, MainOrderSetting mainOrderSetting, Function1<? super Boolean, Unit> function1) {
        String strLIZ;
        Integer num;
        String str;
        int iIntValue;
        Integer num2;
        Integer num3 = c719102rN.LLJJIJIIJIL;
        if (num3 != null && (iIntValue = num3.intValue()) > 0 && c719102rN.LLIZ > iIntValue) {
            strLIZ = C799803Am.LIZ(iIntValue, (String) this.LJI.getValue());
            C802003Bi c802003Bi = this.LIZJ;
            if (c802003Bi != null && Intrinsics.LJFF(c802003Bi.LIZ, c719102rN.LLILZLL) && (num2 = c802003Bi.LIZIZ) != null && num2.intValue() <= iIntValue) {
                String strLIZ2 = C799803Am.LIZ(iIntValue, (String) this.LJFF.getValue());
                C1389890mGx c1389890mGx = new C1389890mGx(tuxTextView);
                c1389890mGx.LJIIJ(strLIZ2);
                c1389890mGx.LJIIJJI();
                C1018703yb.LIZLLL("tiktokec_toast_show", new AwS88S0201000_1(this, iIntValue, c719102rN, 1));
            }
        } else {
            strLIZ = null;
        }
        QuantityControlInfo quantityControlInfo = c719102rN.LLLF;
        if (quantityControlInfo != null && (str = quantityControlInfo.notice) != null) {
            strLIZ = str;
        }
        C0H1U.LJIIL(tuxTextView, strLIZ, true);
        QuantityControlInfo quantityControlInfo2 = c719102rN.LLLF;
        if (quantityControlInfo2 != null && (num = quantityControlInfo2.noticeColor) != null) {
            tuxTextView.setTextColorRes(C7736030k.LIZ(Integer.valueOf(num.intValue()), null));
        } else {
            tuxTextView.setTextColorRes(R.attr.a1q);
        }
    }
}
