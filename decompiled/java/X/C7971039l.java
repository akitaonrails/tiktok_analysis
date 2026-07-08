package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.039l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7971039l extends ConstraintLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public C03EF LLILLL;
    public TuxTextView LLILZ;
    public LinearLayout LLILZIL;
    public View LLILZLL;
    public TuxTextView LLIZ;

    public final TuxTextView getUsCommerceNextDayDeliveryFooterFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_commerce_next_day_delivery_footer);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final View getUsCommerceNextDayDeliveryFooterSeparatorFromXml() {
        View view = this.LLILZLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.us_commerce_next_day_delivery_footer_separator);
        this.LLILZLL = viewFindViewById;
        return viewFindViewById;
    }

    public final LinearLayout getUsOrderSubmitNextDayDeliveryExplainBodyFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_next_day_delivery_explain_body);
            this.LLILZIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getUsOrderSubmitNextDayDeliveryExplainTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_next_day_delivery_explain_title);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getUsOrderSubmitNextDayDeliveryPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_next_day_delivery_price);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C03EF getUsOrderSubmitNextDayDeliveryTimeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_next_day_delivery_time);
            this.LLILLL = (C03EF) callbackFindViewById;
        }
        return (C03EF) callbackFindViewById;
    }

    public final TuxTextView getUsOrderSubmitNextDayDeliveryTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_next_day_delivery_title);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public /* synthetic */ C7971039l(Context context) {
        this(context, null, 0);
    }

    public final void setUsCommerceNextDayDeliveryFooterFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setUsCommerceNextDayDeliveryFooterSeparatorFromXml(View view) {
        this.LLILZLL = view;
    }

    public final void setUsOrderSubmitNextDayDeliveryExplainBodyFromXml(LinearLayout linearLayout) {
        this.LLILZIL = linearLayout;
    }

    public final void setUsOrderSubmitNextDayDeliveryExplainTitleFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setUsOrderSubmitNextDayDeliveryPriceFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setUsOrderSubmitNextDayDeliveryTimeFromXml(C03EF c03ef) {
        this.LLILLL = c03ef;
    }

    public final void setUsOrderSubmitNextDayDeliveryTitleFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public C7971039l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b1n, this, true);
    }
}
