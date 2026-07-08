package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.ICartService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.ui.IApplicationService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0vjy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1753840vjy extends ConstraintLayout implements LifecycleEventObserver {
    public static final float LLJJIII;
    public static final float LLJJIJI;
    public static final float LLJJIJIIJIL = C0H9H.LIZ(0);
    public C1753460vjM LL;
    public CardView LLILLJJLI;
    public C7937038d LLILLL;
    public CardView LLILZ;
    public FrameLayout LLILZIL;
    public CardView LLILZLL;
    public TuxTextView LLIZ;
    public C426770GoN LLIZLLLIL;
    public CardView LLJ;
    public int LLJI;
    public InterfaceC1753900vk4 LLJIJIL;
    public String LLJILJIL;
    public C1743360vT4 LLJILJILJ;
    public InterfaceC1753950vk9 LLJILLL;
    public C384050F3z LLJJ;
    public final AwS605S0100000_26 LLJJI;

    static {
        float f = 20;
        LLJJIII = C0H9H.LIZ(f);
        LLJJIJI = C0H9H.LIZ(f);
    }

    public final CardView getCdLlTagFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dku);
            this.LLILZ = (CardView) callbackFindViewById;
        }
        return (CardView) callbackFindViewById;
    }

    public final CardView getCdShoppingCartIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dkw);
            this.LLILLJJLI = (CardView) callbackFindViewById;
        }
        return (CardView) callbackFindViewById;
    }

    public final CardView getCdShoppingCartRedBadgeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dkx);
            this.LLJ = (CardView) callbackFindViewById;
        }
        return (CardView) callbackFindViewById;
    }

    public final CardView getCdSideSlipContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dky);
            this.LLILZLL = (CardView) callbackFindViewById;
        }
        return (CardView) callbackFindViewById;
    }

    public final C7937038d getCevLlTagFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dmo);
            this.LLILLL = (C7937038d) callbackFindViewById;
        }
        return (C7937038d) callbackFindViewById;
    }

    public final C1753460vjM getCevShoppingCartIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dmq);
            this.LL = (C1753460vjM) callbackFindViewById;
        }
        return (C1753460vjM) callbackFindViewById;
    }

    public final C426770GoN getCevShoppingCartRedBadgeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dmu);
            this.LLIZLLLIL = (C426770GoN) callbackFindViewById;
        }
        return (C426770GoN) callbackFindViewById;
    }

    public final FrameLayout getFlSideSlipContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.i_o);
            this.LLILZIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxTextView getTtvSideSlipFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.yyt);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final View getCartIconView() {
        return getCevShoppingCartIconFromXml();
    }

    public final FrameLayout getSideSlipContainer() {
        return getFlSideSlipContainerFromXml();
    }

    public final C7937038d getTagView() {
        return getCevLlTagFromXml();
    }

    public final CardView getTagViewContainer() {
        return getCdLlTagFromXml();
    }

    public final int getAddCartCount() {
        return this.LLJI;
    }

    public final C384050F3z getBenefitBackShape() {
        return this.LLJJ;
    }

    public final InterfaceC1753900vk4 getDelegate() {
        return this.LLJIJIL;
    }

    public final InterfaceC1753950vk9 getOnClickListener() {
        return this.LLJILLL;
    }

    public final void e0(Integer num) {
        if (num == null) {
            C786410Ut5.LLLLLLIL(getCevShoppingCartRedBadgeFromXml(), 8);
            return;
        }
        int iIntValue = num.intValue();
        this.LLJI = iIntValue;
        if (iIntValue > 0) {
            C786410Ut5.LLILLL(getCdShoppingCartRedBadgeFromXml(), 0);
            C786410Ut5.LLLLLLIL(getCevShoppingCartRedBadgeFromXml(), 0);
            getCevShoppingCartRedBadgeFromXml().setCount(this.LLJI);
            getCevShoppingCartRedBadgeFromXml().invalidate();
            return;
        }
        C786410Ut5.LLILLL(getCdShoppingCartRedBadgeFromXml(), 8);
        C786410Ut5.LLLLLLIL(getCevShoppingCartRedBadgeFromXml(), 8);
    }

    public final void setAddCartCount(int i) {
        this.LLJI = i;
    }

    public final void setBackgroundColorRes(int i) {
        getCevShoppingCartIconFromXml().setBackgroundColorRes(i);
    }

    public final void setBenefitBackShape(C384050F3z c384050F3z) {
        this.LLJJ = c384050F3z;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setCartBenefitInfo(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitStyleType r1 = r8.cartBenefitStyleType
            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitStyleType r0 = com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitStyleType.SIDE_SLIP
            if (r1 != r0) goto La9
            android.content.Context r1 = r7.getContext()
            r0 = 2131108793(0x7f0623b9, float:1.7830203E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZ(r0, r1)
            r4 = 0
            r1 = 1
            if (r0 == 0) goto Lc2
            int r0 = r0.intValue()
            if (r0 != 0) goto Lc2
            r6 = 0
        L1c:
            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitItem r0 = r8.dynamicItem
            r2 = 0
            if (r6 == 0) goto Lb5
            if (r0 == 0) goto Lbf
            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitStyleInfo r0 = r0.styleInfo
            if (r0 == 0) goto Lbf
            java.lang.String r0 = r0.bgColor
        L29:
            int r5 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r0)
            X.0F3z r3 = new X.0F3z
            r3.<init>()
            float r0 = (float) r1
            float r0 = X.C0H9H.LIZ(r0)
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.LIZLLL = r0
            r0 = 22
            float r1 = (float) r0
            float r0 = X.C0H9H.LIZ(r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.LJIIIIZZ = r0
            float r0 = X.C0H9H.LIZ(r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.LJIIJ = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r3.LIZ = r0
            r7.LLJJ = r3
            androidx.cardview.widget.CardView r0 = r7.getCdSideSlipContainerFromXml()
            X.C786410Ut5.LLILLL(r0, r4)
            android.widget.FrameLayout r0 = r7.getFlSideSlipContainerFromXml()
            X.C786410Ut5.LJZ(r4, r0)
            androidx.cardview.widget.CardView r0 = r7.getCdSideSlipContainerFromXml()
            r0.setBackgroundColor(r4)
            android.widget.FrameLayout r1 = r7.getFlSideSlipContainerFromXml()
            android.content.Context r0 = r7.getContext()
            android.graphics.drawable.Drawable r0 = r3.LIZ(r0)
            r1.setBackgroundDrawable(r0)
            com.bytedance.tux.input.TuxTextView r1 = r7.getTtvSideSlipFromXml()
            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitItem r0 = r8.dynamicItem
            if (r0 == 0) goto Lb3
            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitContentInfo r0 = r0.contentInfo
            if (r0 == 0) goto Lb3
            java.lang.String r0 = r0.desc
        L8f:
            r1.setText(r0)
            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitItem r0 = r8.dynamicItem
            if (r6 == 0) goto Laa
            if (r0 == 0) goto L9e
            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitStyleInfo r0 = r0.styleInfo
            if (r0 == 0) goto L9e
            java.lang.String r2 = r0.descColor
        L9e:
            int r1 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r2)
            com.bytedance.tux.input.TuxTextView r0 = r7.getTtvSideSlipFromXml()
            r0.setTextColor(r1)
        La9:
            return
        Laa:
            if (r0 == 0) goto L9e
            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitStyleInfo r0 = r0.styleInfo
            if (r0 == 0) goto L9e
            java.lang.String r2 = r0.descColorDark
            goto L9e
        Lb3:
            r0 = r2
            goto L8f
        Lb5:
            if (r0 == 0) goto Lbf
            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitStyleInfo r0 = r0.styleInfo
            if (r0 == 0) goto Lbf
            java.lang.String r0 = r0.bgColorDark
            goto L29
        Lbf:
            r0 = r2
            goto L29
        Lc2:
            r6 = 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1753840vjy.setCartBenefitInfo(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo):void");
    }

    public final void setCartIconBackgroundAlpha(int i) {
        getCevShoppingCartIconFromXml().setBackgroundAlpha(i);
    }

    public final void setCdLlTagFromXml(CardView cardView) {
        this.LLILZ = cardView;
    }

    public final void setCdShoppingCartIconFromXml(CardView cardView) {
        this.LLILLJJLI = cardView;
    }

    public final void setCdShoppingCartRedBadgeFromXml(CardView cardView) {
        this.LLJ = cardView;
    }

    public final void setCdSideSlipContainerFromXml(CardView cardView) {
        this.LLILZLL = cardView;
    }

    public final void setCevLlTagFromXml(C7937038d c7937038d) {
        this.LLILLL = c7937038d;
    }

    public final void setCevShoppingCartIconFromXml(C1753460vjM c1753460vjM) {
        this.LL = c1753460vjM;
    }

    public final void setCevShoppingCartRedBadgeFromXml(C426770GoN c426770GoN) {
        this.LLIZLLLIL = c426770GoN;
    }

    public final void setDelegate(InterfaceC1753900vk4 interfaceC1753900vk4) {
        this.LLJIJIL = interfaceC1753900vk4;
    }

    public final void setFlSideSlipContainerFromXml(FrameLayout frameLayout) {
        this.LLILZIL = frameLayout;
    }

    public final void setOnClickListener(InterfaceC1753950vk9 interfaceC1753950vk9) {
        this.LLJILLL = interfaceC1753950vk9;
    }

    public final void setTtvSideSlipFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void settCartIconTintColorRes(int i) {
        getCevShoppingCartIconFromXml().setTintColorRes(i);
    }

    public C1753840vjy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void h0(C1743360vT4 c1743360vT4, boolean z) {
        int i;
        int i2;
        String str = c1743360vT4.LIZJ;
        if (str != null && str.length() != 0) {
            this.LLJILJILJ = c1743360vT4;
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
            this.LLJILJIL = c1743360vT4.LIZJ;
            EnumC1743310vSz enumC1743310vSz = c1743360vT4.LIZIZ;
            if (enumC1743310vSz == null) {
                i = -1;
            } else {
                i = C1743320vT0.LIZ[enumC1743310vSz.ordinal()];
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        getCdShoppingCartIconFromXml().setBackgroundColor(0);
                        getCevShoppingCartIconFromXml().setBackgroundAlpha(0);
                        getCevShoppingCartIconFromXml().setTintColorRes(R.attr.a1h);
                    } else {
                        getCevShoppingCartIconFromXml().setBackgroundColor(0);
                        getCevShoppingCartIconFromXml().setTintColorRes(R.attr.a1i);
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, getContext());
                        if (numLIZJ != null) {
                            getCevShoppingCartRedBadgeFromXml().setBadgeBackgroundColor(numLIZJ.intValue());
                        }
                    }
                } else {
                    CardView cdShoppingCartIconFromXml = getCdShoppingCartIconFromXml();
                    if (z) {
                        i2 = R.drawable.bjj;
                    } else {
                        i2 = R.drawable.b6t;
                    }
                    cdShoppingCartIconFromXml.setBackgroundResource(i2);
                    getCevShoppingCartIconFromXml().setBackgroundColor(0);
                    getCevShoppingCartIconFromXml().setTintColorRes(R.attr.a1i);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1i, getContext());
                    if (numLIZJ2 != null) {
                        getCevShoppingCartRedBadgeFromXml().setBadgeBackgroundColor(numLIZJ2.intValue());
                    }
                }
            } else {
                getCdShoppingCartIconFromXml().setBackgroundColor(0);
                getCevShoppingCartIconFromXml().setTintColorRes(R.attr.ee);
            }
            if (enumC1743310vSz != EnumC1743310vSz.STYLE_FLOAT_US && enumC1743310vSz != EnumC1743310vSz.STYLE_FLOAT_SEA) {
                getCdShoppingCartIconFromXml().setCardElevation(-1.0f);
                getCdShoppingCartRedBadgeFromXml().setCardElevation(-1.0f);
                getCdLlTagFromXml().setCardElevation(-1.0f);
                getCdSideSlipContainerFromXml().setCardElevation(-1.0f);
            } else {
                float f = 3;
                getCdShoppingCartIconFromXml().setCardElevation(C0H9H.LIZ(f));
                getCdShoppingCartRedBadgeFromXml().setCardElevation(C0H9H.LIZ(f));
                getCdLlTagFromXml().setCardElevation(C0H9H.LIZ(f));
                getCdSideSlipContainerFromXml().setCardElevation(C0H9H.LIZ(2));
            }
            e0(c1743360vT4.LIZ);
            return;
        }
        int visibility2 = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, this);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = C1743320vT0.LIZIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ICartService.LJJI.getClass();
                C1753910vk5.LIZ().LIZIZ(this.LLJJI);
                return;
            }
            return;
        }
        ICartService.LJJI.getClass();
        C1753910vk5.LIZ().LIZJ(this.LLJJI);
    }

    public C1753840vjy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float f = LLJJIII;
        float f2 = LLJJIJI;
        this.LLJI = -1;
        C786410Ut5.Sd(R.layout.al9, C786410Ut5.ne(context), this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CartEntryView);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.CartEntryView_cart_width, f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.CartEntryView_cart_height, f2);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.CartEntryView_cart_card_width, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(R$styleable.CartEntryView_cart_card_height, -1.0f);
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(R$styleable.CartEntryView_cart_icon_padding, LLJJIJIIJIL);
        float dimension6 = typedArrayObtainStyledAttributes.getDimension(R$styleable.CartEntryView_cart_end_margin, -1.0f);
        float dimension7 = typedArrayObtainStyledAttributes.getDimension(R$styleable.CartEntryView_cart_start_margin, -1.0f);
        typedArrayObtainStyledAttributes.recycle();
        getCevShoppingCartIconFromXml().setIconMargin(C679280Qkg.LIZIZ(Integer.valueOf((int) dimension5)));
        getCevShoppingCartIconFromXml().setIconWidth((int) dimension);
        getCevShoppingCartIconFromXml().setIconHeight((int) dimension2);
        if (dimension3 != -1.0f) {
            getCdShoppingCartIconFromXml().setMinimumWidth((int) dimension3);
        }
        if (dimension4 != -1.0f) {
            getCdShoppingCartIconFromXml().setMinimumHeight((int) dimension4);
        }
        if (dimension6 != -1.0f) {
            C0H9H.LIZLLL((int) dimension6, getCdShoppingCartIconFromXml());
        }
        if (dimension7 != -1.0f) {
            C0H9H.LJFF((int) dimension7, getCdShoppingCartIconFromXml());
        }
        C786410Ut5.I7(new AjS44S0200000_26(this, context, 7), this);
        IApplicationService iApplicationService = (IApplicationService) PluggableExtentionKt.pluggableSpi$default(IApplicationService.class, false, false, false, 14, null);
        if (iApplicationService != null && (iApplicationService.isLocalTest() || iApplicationService.isRegressionTest())) {
            setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0TFD
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    C1389890mGx c1389890mGx = new C1389890mGx(view);
                    c1389890mGx.LJIIJ("Debug: CartEntryView From CartService.");
                    c1389890mGx.LJIIJJI();
                    return true;
                }
            });
        }
        this.LLJJI = new AwS605S0100000_26(this, 277);
    }
}
