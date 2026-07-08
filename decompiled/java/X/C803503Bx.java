package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SwitchRichInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS471S0200000_1;

/* JADX INFO: renamed from: X.03Bx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C803503Bx extends ConstraintLayout {
    public C03IW LL;
    public C803403Bw LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public C803503Bx LLILZIL;
    public TuxIconView LLILZLL;
    public LinearLayout LLIZ;
    public C426770GoN LLIZLLLIL;
    public ShippingAddressRichInfo LLJ;
    public SwitchRichInfo LLJI;

    public final C03IW getEtErrorTipsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hce);
            this.LL = (C03IW) callbackFindViewById;
        }
        return (C03IW) callbackFindViewById;
    }

    public final C803403Bw getLlRichContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n_z);
            this.LLILLJJLI = (C803403Bw) callbackFindViewById;
        }
        return (C803403Bw) callbackFindViewById;
    }

    public final LinearLayout getLlSwitchDetailContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.na9);
            this.LLIZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C426770GoN getUsOrderSubmitAddressBadgeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_address_badge);
            this.LLIZLLLIL = (C426770GoN) callbackFindViewById;
        }
        return (C426770GoN) callbackFindViewById;
    }

    public final C803503Bx getUsOrderSubmitAddressExistFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_address_exist);
            this.LLILZIL = (C803503Bx) callbackFindViewById;
        }
        return (C803503Bx) callbackFindViewById;
    }

    public final TuxIconView getUsOrderSubmitAddressForwardFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_address_forward);
            this.LLILZLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getUsOrderSubmitAddressUserAddressFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_address_user_address);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getUsOrderSubmitAddressUserNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_address_user_name);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final SwitchRichInfo getPudoRichTextInfo() {
        return this.LLJI;
    }

    public final ShippingAddressRichInfo getRichTextInfo() {
        return this.LLJ;
    }

    public final void setEtErrorTipsFromXml(C03IW c03iw) {
        this.LL = c03iw;
    }

    public final void setLlRichContainerFromXml(C803403Bw c803403Bw) {
        this.LLILLJJLI = c803403Bw;
    }

    public final void setLlSwitchDetailContainerFromXml(LinearLayout linearLayout) {
        this.LLIZ = linearLayout;
    }

    public final void setPudoRichTextInfo(SwitchRichInfo switchRichInfo) {
        this.LLJI = switchRichInfo;
    }

    public final void setRichTextInfo(ShippingAddressRichInfo shippingAddressRichInfo) {
        this.LLJ = shippingAddressRichInfo;
    }

    public final void setUsOrderSubmitAddressBadgeFromXml(C426770GoN c426770GoN) {
        this.LLIZLLLIL = c426770GoN;
    }

    public final void setUsOrderSubmitAddressExistFromXml(C803503Bx c803503Bx) {
        this.LLILZIL = c803503Bx;
    }

    public final void setUsOrderSubmitAddressForwardFromXml(TuxIconView tuxIconView) {
        this.LLILZLL = tuxIconView;
    }

    public final void setUsOrderSubmitAddressUserAddressFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setUsOrderSubmitAddressUserNameFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public C803503Bx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C803503Bx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C03XA.LIZ.getClass();
        C03XA.LIZJ(context, R.layout.b1r, this, true);
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
    }

    public static void e0(C803503Bx c803503Bx, boolean z, ShippingAddressRichInfo shippingAddressRichInfo, AwS471S0200000_1 awS471S0200000_1, int i) {
        int i2;
        AwS471S0200000_1 awS471S0200000_12 = awS471S0200000_1;
        if ((i & 4) != 0) {
            i2 = R.attr.a1p;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            awS471S0200000_12 = null;
        }
        C803403Bw llRichContainerFromXml = c803503Bx.getLlRichContainerFromXml();
        if (llRichContainerFromXml != null) {
            C12ES.LJIILL(0, llRichContainerFromXml);
        }
        C03DZ.LIZ(c803503Bx.getUsOrderSubmitAddressUserAddressFromXml());
        C03DZ.LIZ(c803503Bx.getUsOrderSubmitAddressUserNameFromXml());
        c803503Bx.getLlRichContainerFromXml().e0(i2, shippingAddressRichInfo, null, null, awS471S0200000_12, z, false);
    }

    public static void h0(C803503Bx c803503Bx, SwitchRichInfo switchRichInfo, AwS471S0200000_1 awS471S0200000_1, boolean z, int i) {
        List listSingletonList;
        int i2;
        ECRichText eCRichText;
        boolean z2 = z;
        AwS471S0200000_1 awS471S0200000_12 = null;
        if ((i & 2) == 0) {
            awS471S0200000_12 = awS471S0200000_1;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        if (switchRichInfo != null && (eCRichText = switchRichInfo.text) != null) {
            listSingletonList = Collections.singletonList(eCRichText);
        } else {
            listSingletonList = C13BV.INSTANCE;
        }
        LinearLayout llSwitchDetailContainerFromXml = c803503Bx.getLlSwitchDetailContainerFromXml();
        if (!listSingletonList.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, llSwitchDetailContainerFromXml);
        C803303Bv.LIZ(c803503Bx.getLlSwitchDetailContainerFromXml(), listSingletonList, z2, 0, awS471S0200000_12, true);
    }
}
