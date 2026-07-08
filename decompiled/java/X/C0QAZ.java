package X;

import Y.ACListenerS145S0100000_10;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import mf.a;

/* JADX INFO: renamed from: X.0QAZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QAZ extends LinearLayout implements IExtendedTopLiveProductView {
    public static final /* synthetic */ int LLLF = 0;
    public final int LL;
    public final Function0<Unit> LLILLJJLI;
    public SmartImageView LLILLL;
    public SmartImageView LLILZ;
    public LinearLayout LLILZIL;
    public LinearLayout LLILZLL;
    public LinearLayout LLIZ;
    public LinearLayout LLIZLLLIL;
    public FrameLayout LLJ;
    public FrameLayout LLJI;
    public ConstraintLayout LLJIJIL;
    public LinearLayout LLJILJIL;
    public C655440PnK LLJILJILJ;
    public C654590Plx LLJILLL;
    public InterfaceC662740Pz6 LLJJ;
    public String LLJJI;
    public C1295960jpS LLJJIII;
    public SmartImageView LLJJIJI;
    public SmartImageView LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public LinearLayout LLJJJ;
    public LinearLayout LLJJJIL;
    public LinearLayout LLJJJJ;
    public List<Product> LLJJJJJIL;
    public int LLJJJJLIIL;
    public EnumC657940PrM LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public Product LLJLIL;
    public List<String> LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public C099F LLJLLL;
    public AnonymousClass0956 LLJZ;
    public boolean LLJZIJLIL;
    public String LLL;

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public View getView() {
        return this;
    }

    public final void LJ() {
        String strLIZIZ;
        setDisplayIndex(this.LLJL + 1);
        setDisplayIndex(this.LLJL % this.LLJJJJLIIL);
        List<Product> list = this.LLJJJJJIL;
        Product product = list != null ? (Product) ListProtector.get(list, this.LLJL) : null;
        this.LLJLIL = product;
        setCoverWithAnim(product != null ? product.cover : null);
        setPriceWithAnim(this.LLJLIL);
        Product product2 = this.LLJLIL;
        if (product2 == null || (strLIZIZ = product2.LIZIZ()) == null || this.LLJLILLLLZIIL.contains(strLIZIZ)) {
            return;
        }
        C662730Pz5 c662730Pz5 = C662730Pz5.LIZ;
        Product product3 = this.LLJLIL;
        C655440PnK c655440PnK = this.LLJILJILJ;
        C654590Plx c654590Plx = this.LLJILLL;
        InterfaceC662740Pz6 interfaceC662740Pz6 = this.LLJJ;
        String str = this.LLL;
        PageFinder pageFinderVia = PageFinder.via((View) this);
        EnumC657940PrM enumC657940PrM = this.LLJJL;
        c662730Pz5.getClass();
        C662730Pz5.LIZJ(product3, c655440PnK, c654590Plx, interfaceC662740Pz6, "search_live_merge_entrance", str, pageFinderVia, enumC657940PrM);
        this.LLJLILLLLZIIL.add(strLIZIZ);
    }

    public final ConstraintLayout getAnchorContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.azn);
            this.LLJIJIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final Handler getAnimHandler() {
        return (Handler) this.LLJLL.getValue();
    }

    public final LinearLayout getBottomInfo2FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ce8);
            this.LLILZLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final FrameLayout getBottomInfoContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ce9);
            this.LLJ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final LinearLayout getBottomInfoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ce7);
            this.LLILZIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final SmartImageView getProductCover1FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rxh);
            this.LLILLL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final SmartImageView getProductCover2FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rxi);
            this.LLILZ = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final FrameLayout getProductCoverContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rxj);
            this.LLJI = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final Runnable getShowRunnable() {
        return (Runnable) this.LLJLLIL.getValue();
    }

    public final LinearLayout getSideContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vau);
            this.LLJILJIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getSideInfo2FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vax);
            this.LLIZLLLIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getSideInfoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vaw);
            this.LLIZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public final void pauseDisplay() {
        C1295960jpS c1295960jpS;
        if (this.LLJJJJLIIL <= 1) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = false;
        C1295960jpS c1295960jpS2 = this.LLJJIII;
        if (c1295960jpS2 != null && c1295960jpS2.isAnimating() && (c1295960jpS = this.LLJJIII) != null) {
            c1295960jpS.pauseAnimation();
        }
        getAnimHandler().removeCallbacks(getShowRunnable());
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public final void resumeDisplay() {
        if (this.LLJJJJLIIL <= 1) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = true;
        C1295960jpS c1295960jpS = this.LLJJIII;
        if (c1295960jpS != null) {
            c1295960jpS.playAnimation();
        }
        getAnimHandler().removeCallbacks(getShowRunnable());
        C786410Ut5.LJLIIL(4000L, getAnimHandler(), getShowRunnable());
    }

    public static Animator LIZ(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) LinearLayout.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIZ());
        objectAnimatorOfFloat.setDuration(400L);
        return objectAnimatorOfFloat;
    }

    public static Animator LIZIZ(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) LinearLayout.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIZ());
        objectAnimatorOfFloat.setDuration(400L);
        return objectAnimatorOfFloat;
    }

    private final void setCoverWithAnim(String str) {
        SmartImageView smartImageView = this.LLJJIJIIJIL;
        if (smartImageView == null) {
            return;
        }
        Animator animatorLIZ = LIZ(smartImageView);
        SmartImageView smartImageView2 = this.LLJJIJI;
        if (smartImageView2 == null) {
            return;
        }
        Animator animatorLIZIZ = LIZIZ(smartImageView2);
        animatorLIZ.start();
        C948503nH.LJII(this, new C665920QAc(str, animatorLIZIZ, this, null));
    }

    private final void setDisplayIndex(int i) {
        this.LLJL = i;
        C655440PnK c655440PnK = this.LLJILJILJ;
        if (c655440PnK != null) {
            c655440PnK.LIZIZ = i;
        }
    }

    private final void setPriceWithAnim(Product product) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        if (this.LL == 3) {
            linearLayout = this.LLJJJ;
            if (linearLayout == null) {
                return;
            }
        } else {
            linearLayout = this.LLJJJJ;
            if (linearLayout == null) {
                return;
            }
        }
        Animator animatorLIZ = LIZ(linearLayout);
        if (this.LL == 3) {
            linearLayout2 = this.LLJJIJIL;
            if (linearLayout2 == null) {
                return;
            }
        } else {
            linearLayout2 = this.LLJJJIL;
            if (linearLayout2 == null) {
                return;
            }
        }
        Animator animatorLIZIZ = LIZIZ(linearLayout2);
        animatorLIZ.start();
        C948503nH.LJII(this, new C665900QAa(this, product, animatorLIZIZ, null));
    }

    public final void setAnchorContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLJIJIL = constraintLayout;
    }

    public final void setBottomInfo2FromXml(LinearLayout linearLayout) {
        this.LLILZLL = linearLayout;
    }

    public final void setBottomInfoContainerFromXml(FrameLayout frameLayout) {
        this.LLJ = frameLayout;
    }

    public final void setBottomInfoFromXml(LinearLayout linearLayout) {
        this.LLILZIL = linearLayout;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView
    public void setLiveProductSearchAbility(InterfaceC662740Pz6 interfaceC662740Pz6) {
        this.LLJJ = interfaceC662740Pz6;
    }

    public final void setPreloadCover(String str) {
        C099F c099f = this.LLJLLL;
        if (c099f != null && c099f.isCompleted()) {
            SmartImageView smartImageView = this.LLJJIJI;
            if (smartImageView == null) {
                return;
            }
            LIZLLL(smartImageView, str);
            return;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C665930QAd(this, str, null), 3);
    }

    public final void setProductCover1FromXml(SmartImageView smartImageView) {
        this.LLILLL = smartImageView;
    }

    public final void setProductCover2FromXml(SmartImageView smartImageView) {
        this.LLILZ = smartImageView;
    }

    public final void setProductCoverContainerFromXml(FrameLayout frameLayout) {
        this.LLJI = frameLayout;
    }

    public final void setSideContainerFromXml(LinearLayout linearLayout) {
        this.LLJILJIL = linearLayout;
    }

    public final void setSideInfo2FromXml(LinearLayout linearLayout) {
        this.LLIZLLLIL = linearLayout;
    }

    public final void setSideInfoFromXml(LinearLayout linearLayout) {
        this.LLIZ = linearLayout;
    }

    public final void LIZLLL(SmartImageView smartImageView, String str) {
        EnumC1769850w9n enumC1769850w9n;
        EnumC1769850w9n enumC1769850w9n2 = EnumC1769850w9n.GENERAL_SEARCH_LIVE_CARD;
        EnumC657940PrM enumC657940PrM = this.LLJJL;
        if (enumC657940PrM != null && C1202504n9.LIZ()) {
            int i = C657930PrL.LIZIZ[enumC657940PrM.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    enumC1769850w9n = EnumC1769850w9n.GENERAL_SEARCH_LIVE_AGGREGATED_CARD_PRODUCT_ANCHOR;
                }
            } else {
                enumC1769850w9n = EnumC1769850w9n.GENERAL_SEARCH_CHILD_LIVE_CARD_PRODUCT;
            }
            if (enumC1769850w9n != null) {
                enumC1769850w9n2 = enumC1769850w9n;
            }
        }
        if (C1202504n9.LIZ() && C214900sF.LIZ()) {
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            C1334210kp9.LIZIZ(str, enumC1769850w9n2, null, null, false, false, null, null);
            c1326790kdB.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
            c1331670kl3LIZLLL.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LIZLLL);
            return;
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(C1743690vTb.LJI(str, 192, 192, enumC1769850w9n2));
        c1331670kl3LJIIIZ.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public final void bindProductData(C655440PnK c655440PnK, EnumC657940PrM enumC657940PrM) {
        int i;
        List<String> arrayList;
        Product product;
        Product product2;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        List<Product> list;
        Product product3;
        String str;
        EnumC1769850w9n enumC1769850w9n;
        String str2;
        List<Product> list2;
        Aweme aweme;
        int size;
        this.LLJJL = enumC657940PrM;
        this.LLJILJILJ = c655440PnK;
        int i2 = 0;
        if (c655440PnK != null) {
            i = c655440PnK.LIZIZ;
        } else {
            i = 0;
        }
        setDisplayIndex(i);
        if (c655440PnK == null || (arrayList = c655440PnK.LIZJ) == null) {
            arrayList = new ArrayList<>();
        }
        this.LLJLILLLLZIIL = arrayList;
        this.LLJZIJLIL = false;
        if (c655440PnK != null && (aweme = c655440PnK.LIZ) != null) {
            this.LLJJLIIIJLLLLLLLZ = false;
            this.LLJJJJJIL = aweme.getProductsInfo();
            List<Product> productsInfo = aweme.getProductsInfo();
            if (productsInfo != null) {
                size = productsInfo.size();
            } else {
                size = 0;
            }
            this.LLJJJJLIIL = size;
        }
        if (this.LLJJJJLIIL > 0 && (list2 = this.LLJJJJJIL) != null) {
            C655440PnK c655440PnK2 = this.LLJILJILJ;
            if (c655440PnK2 != null) {
                i2 = c655440PnK2.LIZIZ;
            }
            product = (Product) ListProtector.get(list2, i2);
        } else {
            product = null;
        }
        this.LLJLIL = product;
        this.LLJJIJIIJIL = getProductCover1FromXml();
        this.LLJJIJI = getProductCover2FromXml();
        this.LLJJJJ = getBottomInfoFromXml();
        this.LLJJJIL = getBottomInfo2FromXml();
        this.LLJJJ = getSideInfoFromXml();
        this.LLJJIJIL = getSideInfo2FromXml();
        Product product4 = this.LLJLIL;
        if (product4 != null && (str2 = product4.cover) != null) {
            SmartImageView smartImageView = this.LLJJIJIIJIL;
            if (smartImageView != null) {
                LIZLLL(smartImageView, str2);
                product2 = this.LLJLIL;
                linearLayout = this.LLJJJJ;
                if (linearLayout != null) {
                    LIZJ(product2, linearLayout, linearLayout2);
                }
            }
        } else {
            product2 = this.LLJLIL;
            linearLayout = this.LLJJJJ;
            if (linearLayout != null && (linearLayout2 = this.LLJJJ) != null) {
                LIZJ(product2, linearLayout, linearLayout2);
            }
        }
        View.OnClickListener aCListenerS145S0100000_10 = new ACListenerS145S0100000_10(this, 82);
        if (C1848410yCV.LIZ) {
            aCListenerS145S0100000_10 = new f(aCListenerS145S0100000_10);
        }
        a aVar = new a(aCListenerS145S0100000_10);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        C2184581Aee.LIZ(this, new AwS554S0100000_10(this, 1173), new AwS589S0100000_10(this, 567));
        if (this.LLJJJJLIIL > 1 && (list = this.LLJJJJJIL) != null && (product3 = (Product) ListProtector.get(list, 1)) != null && (str = product3.cover) != null) {
            EnumC1769850w9n enumC1769850w9n2 = EnumC1769850w9n.GENERAL_SEARCH_LIVE_CARD;
            EnumC657940PrM enumC657940PrM2 = this.LLJJL;
            if (enumC657940PrM2 != null && C1202504n9.LIZ()) {
                int i3 = C657930PrL.LIZIZ[enumC657940PrM2.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        enumC1769850w9n = EnumC1769850w9n.GENERAL_SEARCH_LIVE_AGGREGATED_CARD_PRODUCT_ANCHOR;
                    }
                } else {
                    enumC1769850w9n = EnumC1769850w9n.GENERAL_SEARCH_CHILD_LIVE_CARD_PRODUCT;
                }
                if (enumC1769850w9n != null) {
                    enumC1769850w9n2 = enumC1769850w9n;
                }
            }
            String strLJI = C1743690vTb.LJI(str, 192, 192, enumC1769850w9n2);
            this.LLJLLL = C090F.LIZIZ();
            this.LLJZ = C23250099c.LIZLLL(C817503Hh.LL, null, null, new C665910QAb(this, strLJI, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.search.ecom.data.Product r26, android.widget.LinearLayout r27, android.widget.LinearLayout r28) {
        /*
            Method dump skipped, instruction units count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QAZ.LIZJ(com.ss.android.ugc.aweme.search.ecom.data.Product, android.widget.LinearLayout, android.widget.LinearLayout):void");
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView
    public final void bindExtraProductData(C654590Plx c654590Plx, String str, String str2) {
        this.LLJILLL = c654590Plx;
        this.LLJJI = str;
        this.LLL = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QAZ(Context context, int i, AwS554S0100000_10 awS554S0100000_10, int i2) {
        super(context, null, 0);
        i = (i2 & 8) != 0 ? 0 : i;
        Function0<Unit> function0 = (i2 & 16) != 0 ? AFwS196S0000000_10.get$arr$(596) : awS554S0100000_10;
        this.LL = i;
        this.LLILLJJLI = function0;
        this.LLJLILLLLZIIL = new ArrayList();
        this.LLJLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(536));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1174));
        LinearLayout linearLayout = (LinearLayout) C786410Ut5.LJLLJ(context, R.layout.f0g, this);
        C0Q72.LIZ(linearLayout, 4.0f);
        addOnAttachStateChangeListener(new C0R48(linearLayout, this, 17));
    }
}
