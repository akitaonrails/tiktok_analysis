package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Q7, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18Q7 extends FrameLayout {
    public static final /* synthetic */ int LLJI = 0;
    public LinearLayout LL;
    public LinearLayout LLILLJJLI;
    public FrameLayout LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public C1203390hQ9 LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public View LLJ;

    public final View getDividerRatingSalesFromXml() {
        View view = this.LLJ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.fzo);
        this.LLJ = viewFindViewById;
        return viewFindViewById;
    }

    public final FrameLayout getFlPromotionFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.i97);
            this.LLILLL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final LinearLayout getLlPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ngn);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getLlRatingSalesFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ngy);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C1203390hQ9 getRatingBarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.srg);
            this.LLILZLL = (C1203390hQ9) callbackFindViewById;
        }
        return (C1203390hQ9) callbackFindViewById;
    }

    public final TuxTextView getTvProductOriginalPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_product_original_price);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvProductSalesPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_product_sales_price);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvRatingFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_rating);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvSalesFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_sales);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public C18Q7(Context context) {
        super(context, null, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C786410Ut5.Td(C786410Ut5.ne(new ContextThemeWrapper(context, R.style.z4)), R.layout.bth, this, true);
    }

    public static void LIZ(String str) {
        C21278918Pb.LIZ.getClass();
        if (!Intrinsics.LJFF(C21278918Pb.LIZJ, "title_price_volume_rate")) {
            C21278918Pb.LIZJ = str;
        }
    }

    public final void setDividerRatingSalesFromXml(View view) {
        this.LLJ = view;
    }

    public final void setFlPromotionFromXml(FrameLayout frameLayout) {
        this.LLILLL = frameLayout;
    }

    public final void setLlPriceFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public final void setLlRatingSalesFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setRatingBarFromXml(C1203390hQ9 c1203390hQ9) {
        this.LLILZLL = c1203390hQ9;
    }

    public final void setTvProductOriginalPriceFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setTvProductSalesPriceFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setTvRatingFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setTvSalesFromXml(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }
}
