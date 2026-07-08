package X;

import Y.ACListenerS151S0100000_16;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentSizeModel;
import com.ss.android.ugc.aweme.component.searchcomponent.SearchAdComponentDataModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cDb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003410cDb extends AbstractC1014240cV4 {
    public final InterfaceC1003440cDe LLJLIL;
    public final String LLJLILLLLZIIL;
    public final SearchAdComponentDataModel LLJLL;
    public final View LLJLLIL;
    public TextView LLJLLL;
    public final Product LLJZ;
    public TextView LLJZIJLIL;
    public SmartImageView LLL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIILL() {
    }

    public final void LJJ() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ), R.layout.qs, this.LLJJIII, false);
        this.LLJJIJIL = viewTd;
        TextView textView = viewTd != null ? (TextView) viewTd.findViewById(R.id.yxh) : null;
        this.LLJLLL = textView;
        if (textView != null) {
            Product product = this.LLJZ;
            textView.setText(product != null ? product.title : null);
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZ() {
        super.LIZ();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        super.LJ();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        TextView textView;
        TextView textView2;
        SmartImageView smartImageView;
        String str;
        super.Fk(viewGroup, interfaceC1014340cVE);
        if (this.LLJZ != null) {
            String anchor_style = this.LLJLL.getAnchor_style();
            int iLIZIZ = 0;
            if (!Intrinsics.LJFF(anchor_style, EnumC1991207r4.TEXT_ANCHOR.getValue()) && Intrinsics.LJFF(anchor_style, EnumC1991207r4.IMAGE_ANCHOR.getValue())) {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ), R.layout.qr, this.LLJJIII, false);
                this.LLJJIJIL = viewTd;
                String str2 = null;
                if (viewTd != null) {
                    textView = (TextView) viewTd.findViewById(R.id.yxh);
                } else {
                    textView = null;
                }
                this.LLJLLL = textView;
                View view = this.LLJJIJIL;
                if (view != null) {
                    textView2 = (TextView) view.findViewById(R.id.yxe);
                } else {
                    textView2 = null;
                }
                this.LLJZIJLIL = textView2;
                View view2 = this.LLJJIJIL;
                if (view2 != null) {
                    smartImageView = (SmartImageView) view2.findViewById(R.id.yxf);
                } else {
                    smartImageView = null;
                }
                this.LLL = smartImageView;
                TextView textView3 = this.LLJLLL;
                if (textView3 != null) {
                    Product product = this.LLJZ;
                    if (product != null) {
                        str2 = product.title;
                    }
                    textView3.setText(str2);
                }
                TextView textView4 = this.LLJZIJLIL;
                if (textView4 != null) {
                    textView4.setText(this.LLJLL.getBottomLabelText());
                }
                View view3 = this.LLJJIJIL;
                if (view3 != null) {
                    view3.setClipToOutline(true);
                    view3.setOutlineProvider(new C0ID9(29));
                }
                Product product2 = this.LLJZ;
                if (product2 == null || (str = product2.cover) == null) {
                    str = "";
                }
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJJ(this.LLL);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
            } else {
                LJJ();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initButtonLayout   searchCTAView");
            sbLIZ.append(this.LLJJIJIL);
            sbLIZ.append("  anchor_style ");
            sbLIZ.append(this.LLJLL.getAnchor_style());
            C2188811AlT.LIZIZ(sbLIZ);
            View view4 = this.LLJJIJIL;
            if (view4 != null) {
                C786410Ut5.I7(new ACListenerS151S0100000_16(this, 136), view4);
            }
            View view5 = this.LLJLLIL;
            if (view5 != null) {
                AnoleComponentSizeModel anoleComponentSizeModel = this.LL.size;
                if (anoleComponentSizeModel != null) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(anoleComponentSizeModel.height)));
                }
                C426750GoL.LJIIIZ(view5, 0, 0, 0, Integer.valueOf(iLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), false, 16);
            }
            View view6 = this.LLJJIJIL;
            if (view6 != null) {
                C427690Gpr.LJ(view6, 0.0f);
            }
        }
    }

    public C1003410cDb(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context, InterfaceC1003440cDe interfaceC1003440cDe) {
        View viewLIZIZ;
        AwemeSearchAdModel searchAdInfo;
        List<Product> list;
        Product product;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = interfaceC1003440cDe;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchAdAnchorComponent,type:");
        sbLIZ.append(anoleComponentModel.type);
        this.LLJLILLLLZIIL = C2188811AlT.LIZIZ(sbLIZ);
        this.LLJLL = C1011660cQu.LIZ(this);
        Product product2 = null;
        if (interfaceC1003440cDe != null) {
            viewLIZIZ = interfaceC1003440cDe.LIZIZ();
        } else {
            viewLIZIZ = null;
        }
        this.LLJLLIL = viewLIZIZ;
        AwemeRawAd awemeRawAd = c1009340cNA.LIZLLL;
        if (awemeRawAd != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && (list = searchAdInfo.productsInfo) != null && (product = (Product) C13LP.LJJJLL(list)) != null && product.LIZIZ().length() > 0) {
            product2 = product;
        }
        this.LLJZ = product2;
    }
}
