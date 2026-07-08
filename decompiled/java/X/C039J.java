package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.039J, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C039J extends ConstraintLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;

    private final TuxTextView getLogisticEdtTV() {
        return (TuxTextView) this.LL.getValue();
    }

    private final TuxTextView getLogisticPriceTV() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    public final void e0(LogisticPanelModule logisticPanelModule) {
        List<LogisticExpressionArea> list;
        LogisticExpressionArea logisticExpressionArea;
        LogisticArea logisticArea = logisticPanelModule.logisticArea;
        if (logisticArea != null && (list = logisticArea.logisticExpressionAreas) != null && (logisticExpressionArea = (LogisticExpressionArea) C13LP.LJJJLL(list)) != null) {
            ECRichText eCRichText = logisticExpressionArea.title;
            if (eCRichText != null) {
                C03DZ.LIZJ(getLogisticEdtTV());
                C03C8.LIZJ(getLogisticEdtTV(), eCRichText, "mx_aggregation_logistics_des", null);
            } else {
                C03DZ.LIZ(getLogisticEdtTV());
            }
            ECRichText eCRichText2 = logisticExpressionArea.logisticPrice;
            if (eCRichText2 != null) {
                C03DZ.LIZJ(getLogisticPriceTV());
                C03C8.LIZJ(getLogisticPriceTV(), eCRichText2, "mx_aggregation_logistics_price", null);
            }
        }
    }

    public C039J(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C039J(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 402));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 403));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.aoi, this, true);
    }
}
