package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PurchaseRewardInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.037w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7930037w extends ConstraintLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;

    private final TuxTextView getPurchaseRewardDesp() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    private final TuxTextView getPurchaseRewardTitle() {
        return (TuxTextView) this.LL.getValue();
    }

    public final void e0(PurchaseRewardInfo purchaseRewardInfo) {
        ECRichText eCRichText = purchaseRewardInfo.bannerTitle;
        if (eCRichText != null) {
            C12ES.LJIILL(0, getPurchaseRewardTitle());
            C03C8.LIZJ(getPurchaseRewardTitle(), eCRichText, "us_purchase_reward_title", null);
        } else {
            C0H1U.LIZIZ(getPurchaseRewardTitle());
        }
        ECRichText eCRichText2 = purchaseRewardInfo.bannerDescription;
        if (eCRichText2 != null) {
            C12ES.LJIILL(0, getPurchaseRewardDesp());
            C03C8.LIZJ(getPurchaseRewardDesp(), eCRichText2, "us_purchase_reward_des", null);
        } else {
            C0H1U.LIZIZ(getPurchaseRewardDesp());
        }
    }

    public C7930037w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7930037w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 640));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 639));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b1x, this, true);
    }
}
