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
import java.util.List;

/* JADX INFO: renamed from: X.185U, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C185U extends FrameLayout {
    public static final /* synthetic */ int LLILZ = 0;
    public C427870Gq9 LL;
    public TuxTextView LLILLJJLI;
    public C427870Gq9 LLILLL;

    public final C427870Gq9 getSellerAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uoi);
            this.LL = (C427870Gq9) callbackFindViewById;
        }
        return (C427870Gq9) callbackFindViewById;
    }

    public final C427870Gq9 getSellerBrandVFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uom);
            this.LLILLL = (C427870Gq9) callbackFindViewById;
        }
        return (C427870Gq9) callbackFindViewById;
    }

    public final TuxTextView getSellerNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uox);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setSellerAvatarFromXml(C427870Gq9 c427870Gq9) {
        this.LL = c427870Gq9;
    }

    public final void setSellerBrandVFromXml(C427870Gq9 c427870Gq9) {
        this.LLILLL = c427870Gq9;
    }

    public final void setSellerNameFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public C185U(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C1701430uNR.LIZ(context, R.layout.bxk, this, true);
    }

    public final void LIZ(EnhancedBrandLogo enhancedBrandLogo, C184O c184o, EnumC1769850w9n enumC1769850w9n, EnumC1769850w9n enumC1769850w9n2) {
        List<String> urls;
        List<String> urls2;
        ViewGroup.LayoutParams layoutParams = null;
        if (enhancedBrandLogo != null) {
            C19411510wz c19411510wz = C19411510wz.LIZ;
            Image image = enhancedBrandLogo.sellerLogo;
            if (image != null) {
                urls = image.getUrls();
            } else {
                urls = null;
            }
            C03IT c03itLIZ = c19411510wz.LIZ(urls, enumC1769850w9n);
            if (c03itLIZ != null) {
                C427870Gq9 sellerAvatarFromXml = getSellerAvatarFromXml();
                if (sellerAvatarFromXml != null) {
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(c03itLIZ);
                    c1331670kl3LIZLLL.LJJ(sellerAvatarFromXml);
                    c1331670kl3LIZLLL.LJIIJ(new C19LI(sellerAvatarFromXml, 0));
                }
                getSellerAvatarFromXml().setForeground(null);
            } else {
                C0H1U.LIZIZ(getSellerAvatarFromXml());
            }
            String str = enhancedBrandLogo.sellerName;
            if (str != null && str.length() != 0) {
                getSellerNameFromXml().setText(str);
            }
            Image image2 = enhancedBrandLogo.blueVImage;
            if (image2 != null) {
                urls2 = image2.getUrls();
            } else {
                urls2 = null;
            }
            C03IT c03itLIZ2 = c19411510wz.LIZ(urls2, enumC1769850w9n2);
            if (c03itLIZ2 != null) {
                C427870Gq9 sellerBrandVFromXml = getSellerBrandVFromXml();
                if (sellerBrandVFromXml != null) {
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(c03itLIZ2);
                    c1331670kl3LIZLLL2.LJJ(sellerBrandVFromXml);
                    c1331670kl3LIZLLL2.LJIIJ(new C19LI(sellerBrandVFromXml, 1));
                }
                getSellerBrandVFromXml().setForeground(null);
            } else {
                C0H1U.LIZIZ(getSellerBrandVFromXml());
            }
            C12ES.LJIILL(0, this);
        } else {
            C0H1U.LIZIZ(this);
        }
        if (c184o != null) {
            Integer num = c184o.LIZ;
            if (num != null) {
                getSellerNameFromXml().setTextColorRes(num.intValue());
            }
            if (c184o.LIZIZ > 0) {
                getSellerNameFromXml().setTuxFont(c184o.LIZIZ);
            }
            if (c184o.LIZJ > 0) {
                C427870Gq9 sellerAvatarFromXml2 = getSellerAvatarFromXml();
                ViewGroup.LayoutParams layoutParams2 = sellerAvatarFromXml2.getLayoutParams();
                if (layoutParams2 instanceof C19ME) {
                    layoutParams = layoutParams2;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    int i = c184o.LIZJ;
                    marginLayoutParams.width = i;
                    marginLayoutParams.height = i;
                    C786410Ut5.W5(sellerAvatarFromXml2, marginLayoutParams);
                }
            }
        }
    }
}
