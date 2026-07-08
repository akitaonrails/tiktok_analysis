package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03CB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03CB extends LinearLayout {
    public final LinearLayout LL;
    public final TuxTextView LLILLJJLI;

    public final void setCandInputData(ShippingAddressRichInfo shippingAddressRichInfo) {
        Context context;
        LinearLayout linearLayout = this.LL;
        if (linearLayout != null && (context = linearLayout.getContext()) != null) {
            LinearLayout linearLayout2 = this.LL;
            if (linearLayout2 != null) {
                C786410Ut5.LJJJJJL(linearLayout2);
            }
            List<ECRichText> list = shippingAddressRichInfo.descriptionList;
            if (list != null) {
                int i = 0;
                for (ECRichText eCRichText : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                        tuxTextView.setMaxLines(1);
                        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                        tuxTextView.setTuxFont(61);
                        tuxTextView.setTextColorRes(R.attr.a1j);
                        C426750GoL.LJIIL(tuxTextView, null, Integer.valueOf(C0H9H.LIZIZ(2)), null, null, 29);
                        C03C8.LJ(tuxTextView, eCRichText, "use_location", null);
                        LinearLayout linearLayout3 = this.LL;
                        if (linearLayout3 != null) {
                            linearLayout3.addView(tuxTextView);
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
    }

    public final void setUseBtnClickListener(Function0<Unit> function0) {
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            C786410Ut5.I7(new AjS60S0100000_1((Function0) function0, 12), tuxTextView);
        }
    }

    public C03CB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Sd(R.layout.ajk, C786410Ut5.ne(context), this);
        this.LL = (LinearLayout) findViewById(R.id.fm9);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.use_btn);
        this.LLILLJJLI = tuxTextView;
        if (tuxTextView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.g2);
            tuxTextView.setBackground(c384050F3z.LIZ(getContext()));
        }
    }
}
