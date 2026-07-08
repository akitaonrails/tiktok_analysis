package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03CC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03CC extends LinearLayout {
    public final LinearLayout LL;
    public final TuxTextView LLILLJJLI;
    public final SmartImageView LLILLL;

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
                for (ECRichText eCRichText : list) {
                    TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                    C426750GoL.LJIIL(tuxTextView, null, Integer.valueOf(C0H9H.LIZIZ(2)), null, null, 29);
                    C03C8.LJ(tuxTextView, eCRichText, "use_location", null);
                    LinearLayout linearLayout3 = this.LL;
                    if (linearLayout3 != null) {
                        linearLayout3.addView(tuxTextView);
                    }
                }
            }
        }
    }

    public final void setUseBtnClickListener(Function0<Unit> function0) {
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            C786410Ut5.I7(new AjS60S0100000_1((Function0) function0, 13), tuxTextView);
        }
    }

    public C03CC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View viewSd = C786410Ut5.Sd(R.layout.ajl, C786410Ut5.ne(context), this);
        if (viewSd != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0c);
            viewSd.setBackground(c384050F3z.LIZ(getContext()));
        }
        this.LL = (LinearLayout) findViewById(R.id.fm9);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.use_btn);
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = (SmartImageView) findViewById(R.id.noc);
        if (tuxTextView != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
            tuxTextView.setBackground(c384050F3z2.LIZ(getContext()));
        }
    }
}
