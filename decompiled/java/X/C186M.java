package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.model.EnhancedBrandLogo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.186M, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C186M extends FrameLayout {
    public C427660Gpo LL;
    public TuxTextView LLILLJJLI;
    public C427660Gpo LLILLL;

    public C186M(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final C427660Gpo getSellerAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uoi);
            this.LL = (C427660Gpo) callbackFindViewById;
        }
        return (C427660Gpo) callbackFindViewById;
    }

    public final C427660Gpo getSellerBrandVFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uom);
            this.LLILLL = (C427660Gpo) callbackFindViewById;
        }
        return (C427660Gpo) callbackFindViewById;
    }

    public final TuxTextView getSellerNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uox);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setSellerAvatarFromXml(C427660Gpo c427660Gpo) {
        this.LL = c427660Gpo;
    }

    public final void setSellerBrandVFromXml(C427660Gpo c427660Gpo) {
        this.LLILLL = c427660Gpo;
    }

    public final void setSellerNameFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void LIZ(EnhancedBrandLogo enhancedBrandLogo, C186N c186n) {
        C03IT imageUrlModel;
        Boolean bool;
        C03IT imageUrlModel2;
        if (enhancedBrandLogo != null) {
            Image image = enhancedBrandLogo.sellerLogo;
            if (image != null && (imageUrlModel2 = image.toImageUrlModel()) != null) {
                C427660Gpo.LJIIJJI(getSellerAvatarFromXml(), imageUrlModel2, false, null, null, false, false, null, new C463040IDu(null, new AwS576S0100000_32(this, 170), 4), false, null, 894);
                getSellerAvatarFromXml().setForeground(null);
            } else {
                C0H1U.LIZIZ(getSellerAvatarFromXml());
            }
            String str = enhancedBrandLogo.sellerName;
            boolean zBooleanValue = true;
            if (str != null && str.length() != 0) {
                getSellerNameFromXml().setText(str);
            }
            Image image2 = enhancedBrandLogo.blueVImage;
            if (image2 != null && (imageUrlModel = image2.toImageUrlModel()) != null) {
                C427660Gpo sellerBrandVFromXml = getSellerBrandVFromXml();
                if (c186n != null && (bool = c186n.LJ) != null) {
                    zBooleanValue = bool.booleanValue();
                }
                C427660Gpo.LJIIJJI(sellerBrandVFromXml, imageUrlModel, false, null, null, false, zBooleanValue, null, new C463040IDu(null, new AwS576S0100000_32(this, 171), 4), false, null, 862);
                getSellerBrandVFromXml().setForeground(null);
            } else {
                C0H1U.LIZIZ(getSellerBrandVFromXml());
            }
            C12ES.LJIILL(0, this);
        } else {
            C0H1U.LIZIZ(this);
        }
        if (c186n != null) {
            Integer num = c186n.LIZ;
            if (num != null) {
                getSellerNameFromXml().setTextColorRes(num.intValue());
            }
            if (c186n.LIZIZ > 0) {
                getSellerNameFromXml().setTuxFont(c186n.LIZIZ);
            }
            if (c186n.LIZJ > 0) {
                C427660Gpo sellerAvatarFromXml = getSellerAvatarFromXml();
                ViewGroup.LayoutParams layoutParams = sellerAvatarFromXml.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i = c186n.LIZJ;
                    marginLayoutParams.width = i;
                    marginLayoutParams.height = i;
                    C786410Ut5.W5(sellerAvatarFromXml, marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
            Integer num2 = c186n.LIZLLL;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                C427660Gpo sellerBrandVFromXml2 = getSellerBrandVFromXml();
                if (sellerBrandVFromXml2 != null) {
                    ViewGroup.LayoutParams layoutParams2 = sellerBrandVFromXml2.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = iIntValue;
                        layoutParams2.height = iIntValue;
                        C786410Ut5.W5(sellerBrandVFromXml2, layoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
            }
            Integer num3 = c186n.LJFF;
            if (num3 != null) {
                int iIntValue2 = num3.intValue();
                C427660Gpo sellerBrandVFromXml3 = getSellerBrandVFromXml();
                if (sellerBrandVFromXml3 != null) {
                    ViewGroup.LayoutParams layoutParams3 = sellerBrandVFromXml3.getLayoutParams();
                    if (layoutParams3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams2.setMarginStart(iIntValue2);
                        C786410Ut5.W5(sellerBrandVFromXml3, marginLayoutParams2);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
        }
    }

    public C186M(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        C1701430uNR.LIZ(context, R.layout.ay9, this, true);
    }
}
