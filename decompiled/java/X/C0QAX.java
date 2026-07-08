package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView;
import com.zhiliaoapp.musically.R;
import g1c.AjS65S0100000_10;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0QAX, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QAX extends LinearLayout implements IExtendedTopLiveProductView {
    public static final /* synthetic */ int LLJILLL = 0;
    public final Function0<Unit> LL;
    public LinearLayout LLILLJJLI;
    public TuxTextView LLILLL;
    public final LinearLayout LLILZ;
    public AnonymousClass0956 LLILZIL;
    public C655440PnK LLILZLL;
    public C654590Plx LLIZ;
    public InterfaceC662740Pz6 LLIZLLLIL;
    public String LLJ;
    public Product LLJI;
    public List<String> LLJIJIL;
    public EnumC657940PrM LLJILJIL;
    public String LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public View getView() {
        return this;
    }

    public final LinearLayout getContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eqx);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getEntryTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.h8f);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public final void pauseDisplay() {
        AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public final void resumeDisplay() {
        AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZIL = C948503nH.LJII(this, new C388940FMu(this, null));
    }

    public final void setContainerFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setEntryTitleFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView
    public void setLiveProductSearchAbility(InterfaceC662740Pz6 interfaceC662740Pz6) {
        this.LLIZLLLIL = interfaceC662740Pz6;
    }

    public C0QAX(Context context, AwS554S0100000_10 awS554S0100000_10) {
        super(context, null, 0);
        this.LL = awS554S0100000_10;
        this.LLJIJIL = new ArrayList();
        LinearLayout linearLayout = (LinearLayout) C786410Ut5.LJLLJ(context, R.layout.f0e, this);
        this.LLILZ = linearLayout;
        C0Q72.LIZ(linearLayout, 6.0f);
        addOnAttachStateChangeListener(new C0R48(context, this, 16));
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView
    public final void bindProductData(C655440PnK c655440PnK, EnumC657940PrM enumC657940PrM) {
        List<String> arrayList;
        Product product;
        String string;
        Product.LiveProductAnchorStyleInfo liveProductAnchorStyleInfo;
        Aweme aweme;
        Product product2;
        this.LLJILJIL = enumC657940PrM;
        this.LLILZLL = c655440PnK;
        if (c655440PnK == null || (arrayList = c655440PnK.LIZJ) == null) {
            arrayList = new ArrayList<>();
        }
        this.LLJIJIL = arrayList;
        if (c655440PnK != null && (aweme = c655440PnK.LIZ) != null) {
            List<Product> productsInfo = aweme.getProductsInfo();
            if (productsInfo != null) {
                product2 = (Product) C13LP.LJJJLL(productsInfo);
            } else {
                product2 = null;
            }
            this.LLJI = product2;
        }
        TuxTextView entryTitleFromXml = getEntryTitleFromXml();
        if (C293650Bf9.LIZ() == 6 || (product = this.LLJI) == null || (liveProductAnchorStyleInfo = product.liveProductAnchorStyle) == null || (string = liveProductAnchorStyleInfo.anchorIconText) == null) {
            string = getContext().getResources().getString(2131835072);
        }
        entryTitleFromXml.setText(string);
        C786410Ut5.I7(new AjS65S0100000_10(this, 14), this);
        C2184581Aee.LIZ(this, new AwS554S0100000_10(this, 1171), new AwS589S0100000_10(this, 565));
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView
    public final void bindExtraProductData(C654590Plx c654590Plx, String str, String str2) {
        this.LLIZ = c654590Plx;
        this.LLJ = str;
        this.LLJILJILJ = str2;
    }
}
