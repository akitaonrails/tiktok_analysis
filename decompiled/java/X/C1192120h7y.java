package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiBizInfo;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.SkuPrice;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192120h7y extends ConstraintLayout {
    public final ContextThemeWrapper LL;

    public final ContextThemeWrapper getDarkContext() {
        return this.LL;
    }

    public final void setData(PoiBizInfo poiBizInfo) {
        SkuPrice skuPrice;
        String str;
        String str2;
        int iIntValue;
        String str3;
        String str4;
        String str5;
        String str6;
        C337180DJs.LIZJ(findViewById(R.id.r86));
        String str7 = null;
        if (poiBizInfo != null) {
            skuPrice = poiBizInfo.priceInfo;
        } else {
            skuPrice = null;
        }
        TextView textView = (TextView) findViewById(R.id.r89);
        C041W c041w = new C041W();
        if (skuPrice != null) {
            str = skuPrice.offerPrice;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (skuPrice == null || (str2 = skuPrice.currencySymbol) == null) {
            str2 = "";
        }
        c041w.LIZJ(0, str, str2, "");
        c041w.LJ = 33;
        c041w.LJFF = 13;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, this.LL);
        int iIntValue2 = -1;
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        c041w.LJI = Integer.valueOf(iIntValue);
        c041w.LJIIIIZZ = false;
        CharSequence charSequenceLIZIZ = c041w.LIZIZ(getContext());
        if (textView != null) {
            textView.setText(charSequenceLIZIZ);
        }
        TextView textView2 = (TextView) findViewById(R.id.r88);
        C041W c041w2 = new C041W();
        if (skuPrice == null || (str3 = skuPrice.originalPrice) == null) {
            str3 = "";
        }
        if (skuPrice == null || (str4 = skuPrice.currencySymbol) == null) {
            str4 = "";
        }
        c041w2.LIZJ(0, str3, str4, "");
        c041w2.LJ = 71;
        c041w2.LJFF = 71;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, this.LL);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        }
        c041w2.LJI = Integer.valueOf(iIntValue2);
        c041w2.LJIIIIZZ = true;
        CharSequence charSequenceLIZIZ2 = c041w2.LIZIZ(getContext());
        if (textView2 != null) {
            textView2.setText(charSequenceLIZIZ2);
        }
        View viewFindViewById = findViewById(R.id.r84);
        if (skuPrice != null && Intrinsics.LJFF(skuPrice.isUsePromotion(), Boolean.TRUE)) {
            if (viewFindViewById != null) {
                C337180DJs.LIZJ(viewFindViewById);
            }
        } else if (viewFindViewById != null) {
            C339190DRl.LIZIZ(viewFindViewById);
        }
        TextView textView3 = (TextView) findViewById(R.id.r85);
        if (skuPrice != null) {
            str5 = skuPrice.discountTag;
        } else {
            str5 = null;
        }
        if (C1200890hM7.LIZ(str5)) {
            if (textView3 != null) {
                C337180DJs.LIZJ(textView3);
                if (skuPrice != null) {
                    str6 = skuPrice.discountTag;
                } else {
                    str6 = null;
                }
                textView3.setText(str6);
            }
        } else if (textView3 != null) {
            C339190DRl.LIZIZ(textView3);
        }
        TextView textView4 = (TextView) findViewById(R.id.r87);
        if (textView4 != null) {
            if (poiBizInfo != null) {
                str7 = poiBizInfo.productName;
            }
            textView4.setText(str7);
        }
    }

    public C1192120h7y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1192120h7y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.z4);
        this.LL = contextThemeWrapper;
        C786410Ut5.Td(C786410Ut5.ne(contextThemeWrapper), R.layout.e1i, this, true);
    }
}
