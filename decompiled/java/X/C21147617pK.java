package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.17pK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21147617pK extends ConstraintLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public TuxIconView LLILLL;

    public final TuxTextView getUsOrderSubmitAggregationOrderAddonDescriptionFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_order_addon_description);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getUsOrderSubmitAggregationOrderAddonIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_order_addon_icon);
            this.LLILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getUsOrderSubmitAggregationOrderAddonTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_order_addon_title);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setUsOrderSubmitAggregationOrderAddonDescriptionFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setUsOrderSubmitAggregationOrderAddonIconFromXml(TuxIconView tuxIconView) {
        this.LLILLL = tuxIconView;
    }

    public final void setUsOrderSubmitAggregationOrderAddonTitleFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public C21147617pK(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21147617pK(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b1s, this, true);
    }
}
