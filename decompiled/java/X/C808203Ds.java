package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03Ds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C808203Ds extends ConstraintLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public View LLILZ;

    public final View getUsOrderSummaryLayoutSeparatorFromXml() {
        View view = this.LLILZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.us_order_summary_layout_separator);
        this.LLILZ = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxTextView getUsOrderSummaryShippingSheetItemOriginalPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_summary_shipping_sheet_item_original_price);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getUsOrderSummaryShippingSheetItemPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_summary_shipping_sheet_item_price);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getUsOrderSummaryShippingSheetItemTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_summary_shipping_sheet_item_title);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public /* synthetic */ C808203Ds(Context context) {
        this(context, null, 0);
    }

    public final void setOriginPriceWithConfig(C21717319z1 c21717319z1) {
        C21717219z0.LIZJ(getUsOrderSummaryShippingSheetItemOriginalPriceFromXml(), c21717319z1, true);
    }

    public final void setPriceWithConfig(C21717319z1 c21717319z1) {
        C21717219z0.LIZJ(getUsOrderSummaryShippingSheetItemPriceFromXml(), c21717319z1, false);
    }

    public final void setSeparatorWithConfig(boolean z) {
        int i;
        View usOrderSummaryLayoutSeparatorFromXml = getUsOrderSummaryLayoutSeparatorFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, usOrderSummaryLayoutSeparatorFromXml);
    }

    public final void setTitleWithConfig(C21717319z1 c21717319z1) {
        C21717219z0.LIZJ(getUsOrderSummaryShippingSheetItemTitleFromXml(), c21717319z1, false);
    }

    public final void setUsOrderSummaryLayoutSeparatorFromXml(View view) {
        this.LLILZ = view;
    }

    public final void setUsOrderSummaryShippingSheetItemOriginalPriceFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setUsOrderSummaryShippingSheetItemPriceFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setUsOrderSummaryShippingSheetItemTitleFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public C808203Ds(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.an2, this, true);
    }
}
