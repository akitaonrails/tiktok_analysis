package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.GoLiveCard;
import java.util.Map;

/* JADX INFO: renamed from: X.182y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC212214182y extends ConstraintLayout {
    public View.OnClickListener LL;
    public View.OnClickListener LLILLJJLI;
    public View.OnClickListener LLILLL;

    public abstract void e0();

    public abstract Map<String, String> getContentShowParams();

    public Map<String, String> getDiscountTagEventParams() {
        return null;
    }

    public Map<String, String> getSellingPointEventParams() {
        return null;
    }

    public abstract void h0(C182T c182t, long j, GoLiveCard goLiveCard, Integer num);

    public final View.OnClickListener getActionClickListener() {
        return this.LLILLL;
    }

    public final View.OnClickListener getCardClickListener() {
        return this.LLILLJJLI;
    }

    public final View.OnClickListener getCloseClickListener() {
        return this.LL;
    }

    public final void setActionClickListener(View.OnClickListener onClickListener) {
        this.LLILLL = onClickListener;
    }

    public final void setCardClickListener(View.OnClickListener onClickListener) {
        this.LLILLJJLI = onClickListener;
    }

    public final void setCloseClickListener(View.OnClickListener onClickListener) {
        this.LL = onClickListener;
    }

    public AbstractC212214182y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
