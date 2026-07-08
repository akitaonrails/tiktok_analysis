package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.03XO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03XO extends LinearLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    private final LinearLayout getBannerContainer() {
        return (LinearLayout) this.LL.getValue();
    }

    private final TuxTextView getBannerDesc() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    private final TuxIconView getBannerIcon() {
        return (TuxIconView) this.LLILLJJLI.getValue();
    }

    public C03XO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1681));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1683));
        this.LLILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1682));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.avs, this, true);
    }

    public final void LIZ(C03XN c03xn, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        int iIntValue;
        int iIntValue2;
        Integer num = c03xn.LIZLLL;
        int iIntValue3 = 0;
        if (num != null) {
            int iIntValue4 = num.intValue();
            LinearLayout bannerContainer = getBannerContainer();
            if (bannerContainer != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(iIntValue4, getContext());
                if (numLIZJ != null) {
                    iIntValue2 = numLIZJ.intValue();
                } else {
                    iIntValue2 = 0;
                }
                bannerContainer.setBackgroundColor(iIntValue2);
            }
        }
        TuxTextView bannerDesc = getBannerDesc();
        if (bannerDesc != null) {
            bannerDesc.setText(c03xn.LIZIZ);
            Integer num2 = c03xn.LIZJ;
            if (num2 != null) {
                Integer numLIZJ2 = C1308910kAL.LIZJ(num2.intValue(), bannerDesc.getContext());
                if (numLIZJ2 != null) {
                    iIntValue = numLIZJ2.intValue();
                } else {
                    iIntValue = 0;
                }
                bannerDesc.setTextColor(iIntValue);
            }
        }
        TuxIconView bannerIcon = getBannerIcon();
        if (bannerIcon != null) {
            Integer num3 = c03xn.LJFF;
            if (num3 != null) {
                bannerIcon.setIconRes(num3.intValue());
            }
            Integer num4 = c03xn.LJ;
            if (num4 != null) {
                Integer numLIZJ3 = C1308910kAL.LIZJ(num4.intValue(), bannerIcon.getContext());
                if (numLIZJ3 != null) {
                    iIntValue3 = numLIZJ3.intValue();
                }
                bannerIcon.setTintColor(iIntValue3);
            }
        }
        C1748720vbi.LJFF(getBannerContainer(), new C049G(), new AwS545S0100000_1(c03xn, 114), new AwS367S0200000_1(c03xn, orderSubmitAssemViewModel, 48));
    }
}
