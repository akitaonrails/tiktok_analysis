package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.osp.repo.model.PriceBreakdownData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.PriceItem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS255S0000000_18;

/* JADX INFO: renamed from: X.0hA0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193380hA0 extends ConstraintLayout {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final C166U LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1193380hA0.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiOrderSubmitSummaryViewBinding;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public C1193380hA0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final C1193430hA5 getViewBinding() {
        C166U c166u = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        return (C1193430hA5) c166u.LIZ(this);
    }

    public final void e0(PriceBreakdownData priceBreakdownData) {
        String str;
        String str2;
        String str3;
        String str4;
        TuxTextView tuxTextView = getViewBinding().LLILZIL;
        PriceItem priceItem = priceBreakdownData.totalPrice;
        String str5 = null;
        if (priceItem != null) {
            str5 = priceItem.name;
        }
        if (str5 == null) {
            str5 = "";
        }
        tuxTextView.setText(str5);
        C041W c041w = new C041W();
        PriceItem priceItem2 = priceBreakdownData.totalPrice;
        if (priceItem2 == null || (str = priceItem2.price) == null) {
            str = "";
        }
        if (priceItem2 == null || (str2 = priceItem2.currencySymbol) == null) {
            str2 = "";
        }
        c041w.LIZJ(0, str, str2, "");
        c041w.LJ = 22;
        c041w.LJFF = 22;
        c041w.LJII = R.attr.a1h;
        c041w.LJIIIIZZ = false;
        getViewBinding().LLIZ.setText(c041w.LIZIZ(getContext()));
        PriceItem priceItem3 = priceBreakdownData.totalPrice;
        if (priceItem3 != null && (str4 = priceItem3.originalPrice) != null && str4.length() != 0) {
            C337180DJs.LIZJ(getViewBinding().LLILZLL);
            TuxTextView tuxTextView2 = getViewBinding().LLILZLL;
            C041W c041w2 = new C041W();
            PriceItem priceItem4 = priceBreakdownData.totalPrice;
            String str6 = priceItem4.originalPrice;
            String str7 = priceItem4.currencySymbol;
            if (str7 == null) {
                str7 = "";
            }
            c041w2.LIZJ(0, str6, str7, "");
            c041w2.LJ = 91;
            c041w2.LJFF = 91;
            c041w2.LJII = R.attr.a1k;
            c041w2.LJIIIIZZ = true;
            tuxTextView2.setText(c041w2.LIZIZ(getContext()));
        } else {
            C337180DJs.LIZ(getViewBinding().LLILZLL);
        }
        PriceItem priceItem5 = priceBreakdownData.totalPrice;
        if (priceItem5 != null && (str3 = priceItem5.taxAmountDesc) != null && str3.length() != 0) {
            C337180DJs.LIZJ(getViewBinding().LLIZLLLIL);
            TuxTextView tuxTextView3 = getViewBinding().LLIZLLLIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('(');
            sbLIZ.append(priceBreakdownData.totalPrice.taxAmountDesc);
            sbLIZ.append(')');
            tuxTextView3.setText(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            C337180DJs.LIZ(getViewBinding().LLIZLLLIL);
        }
        String str8 = priceBreakdownData.saveAmount;
        if (str8 != null && str8.length() != 0) {
            C337180DJs.LIZJ(getViewBinding().LLILLL);
            C337180DJs.LIZJ(getViewBinding().LLILZ);
            getViewBinding().LLILLL.setText(str8);
        } else {
            C337180DJs.LIZ(getViewBinding().LLILLL);
            C337180DJs.LIZ(getViewBinding().LLILZ);
        }
    }

    public final void setExpandIconVisible(boolean z) {
        if (z) {
            C337180DJs.LIZJ(getViewBinding().LLILLJJLI);
        } else {
            C337180DJs.LIZ(getViewBinding().LLILLJJLI);
        }
    }

    public final void setExpandState(boolean z) {
        float f;
        if (getViewBinding().LLILLJJLI.getVisibility() == 8) {
            return;
        }
        TuxIconView tuxIconView = getViewBinding().LLILLJJLI;
        if (z) {
            f = 180.0f;
        } else {
            f = 0.0f;
        }
        C786410Ut5.Fb(tuxIconView, f);
    }

    public C1193380hA0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new C166U(new AwS255S0000000_18(0));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e5v, this, true);
    }

    public /* synthetic */ C1193380hA0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
