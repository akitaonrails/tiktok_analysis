package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardExtendInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VasBadgeModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS0S1400000_1;
import java.util.HashMap;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.037z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7933037z extends ConstraintLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public boolean LLILZ;

    private final TuxIconView getAuthenticIcon() {
        return (TuxIconView) this.LLILLJJLI.getValue();
    }

    private final TuxTextView getAuthenticNameView() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    private final ConstraintLayout getContainer() {
        return (ConstraintLayout) this.LL.getValue();
    }

    public C7933037z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7933037z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ap5, this, true);
        this.LL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 643));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 641));
        this.LLILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 642));
    }

    public final void e0(C719102rN c719102rN, OrderSubmitAssemViewModel orderSubmitAssemViewModel, String str) {
        VasBadgeModule vasBadgeModule;
        Image icon;
        C03IT imageUrlModel;
        String str2;
        SkuCardExtendInfo skuCardExtendInfo = c719102rN.LLLILZLLLI;
        if (skuCardExtendInfo != null && (vasBadgeModule = skuCardExtendInfo.vasBadge) != null) {
            if (!this.LLILZ && !orderSubmitAssemViewModel.LLLZIL) {
                this.LLILZ = true;
                C03O0 c03o0 = C03O0.LIZ;
                HashMap map = new HashMap();
                String str3 = "";
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                map.put("page_name", str2);
                String str4 = c719102rN.LLLLIL;
                if (str4 != null) {
                    str3 = str4;
                }
                map.put("product_id", str3);
                C03O0.LJJJZ(c03o0, "authentic_badge", map, null, null, null, null, null, null, null, orderSubmitAssemViewModel.LLLZLZ.LIZ("c33849.d0"), null, null, null, 1015804);
            }
            if (C960203pA.LIZIZ(getContext())) {
                Icon icon2 = vasBadgeModule.icon;
                if (icon2 != null) {
                    icon = icon2.getIconDark();
                    if (icon != null && (imageUrlModel = icon.toImageUrlModel()) != null) {
                        C1326790kdB.LIZ.getClass();
                        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
                        c1331670kl3LIZLLL.LJJI(getAuthenticIcon());
                        C786410Ut5.h3(c1331670kl3LIZLLL);
                    }
                }
            } else {
                Icon icon3 = vasBadgeModule.icon;
                if (icon3 != null) {
                    icon = icon3.getIcon();
                    if (icon != null) {
                        C1326790kdB.LIZ.getClass();
                        C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(imageUrlModel);
                        c1331670kl3LIZLLL2.LJJI(getAuthenticIcon());
                        C786410Ut5.h3(c1331670kl3LIZLLL2);
                    }
                }
            }
            String str5 = vasBadgeModule.vasName;
            if (str5 != null) {
                getAuthenticNameView().setText(str5);
            }
            ConstraintLayout container = getContainer();
            if (container != null) {
                C786410Ut5.I7(new AjS0S1400000_1(vasBadgeModule, str, orderSubmitAssemViewModel, c719102rN, this, 0), container);
            }
        }
    }
}
