package X;

import Y.ACListenerS151S0100000_16;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.searchcomponent.SearchAdEnhancedStyleAnchorDataModel;
import com.ss.android.ugc.aweme.feed.model.search.SearchAdPromotionAnchorInfo;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0cKT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1007670cKT extends AbstractC1014240cV4 {
    public TextView LLJLIL;
    public TextView LLJLILLLLZIIL;
    public TextView LLJLL;
    public SmartImageView LLJLLIL;
    public final SearchAdEnhancedStyleAnchorDataModel LLJLLL;
    public final int LLJZ;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        super.LJII(anoleComponentAppearModel);
        InterfaceC1014270cV7 interfaceC1014270cV7 = this.LLILLL;
        if (interfaceC1014270cV7 != null) {
            interfaceC1014270cV7.LJIJ(new C989550brF(new C1007630cKP("shop_anchor")), this);
        }
    }

    public final void LJJ(boolean z) {
        String str;
        if (z) {
            str = "anchor_image";
        } else {
            str = "anchor";
        }
        InterfaceC1014270cV7 interfaceC1014270cV7 = this.LLILLL;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(EnumC1005330cGh.ENTER_FROM.getRName(), "search_enhanced_style_anchor"));
        mapLJIIJ.put(EnumC1005330cGh.REFER.getRName(), str);
        interfaceC1014270cV7.LJIJ(new C991670buf(mapLJIIJ), this);
    }

    public final void LJJI(boolean z) {
        String optSellingPointText;
        TextView textView;
        InterfaceC1014270cV7 interfaceC1014270cV7;
        SearchAdPromotionAnchorInfo searchAdPromotionAnchorInfo = this.LLILLJJLI.LIZLLL.getSearchAdInfo().promotionAnchorInfo;
        if (searchAdPromotionAnchorInfo != null && (optSellingPointText = searchAdPromotionAnchorInfo.getOptSellingPointText()) != null) {
            TextView textView2 = this.LLJLL;
            if (textView2 != null) {
                textView2.setText(optSellingPointText);
            }
            TextView textView3 = this.LLJLILLLLZIIL;
            if (textView3 == null || (textView = this.LLJLL) == null) {
                return;
            }
            C1011660cQu.LJ(textView3, textView);
            if (!z && (interfaceC1014270cV7 = this.LLILLL) != null) {
                interfaceC1014270cV7.LJIJ(new C989550brF(new C1007630cKP("opt_selling_point")), this);
            }
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
        if (!(abstractC1003980cEW instanceof C991240bty) || ((C991240bty) abstractC1003980cEW).LIZ.isNull("anchor_promotion_info_request_status")) {
            return;
        }
        LJJI(false);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        int i;
        TextView textView;
        TextView textView2;
        SmartImageView smartImageView;
        TextView textView3;
        String imageUrl;
        String desc;
        String title;
        super.Fk(viewGroup, interfaceC1014340cVE);
        if (this.LLJZ == 2) {
            i = R.layout.qq;
        } else {
            i = R.layout.qp;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ), i, this.LLJJIII, false);
        this.LLJJIJIL = viewTd;
        String desc2 = null;
        if (viewTd != null) {
            textView = (TextView) viewTd.findViewById(R.id.yxh);
        } else {
            textView = null;
        }
        this.LLJLIL = textView;
        View view = this.LLJJIJIL;
        if (view != null) {
            textView2 = (TextView) view.findViewById(R.id.yxe);
        } else {
            textView2 = null;
        }
        this.LLJLILLLLZIIL = textView2;
        View view2 = this.LLJJIJIL;
        if (view2 != null) {
            smartImageView = (SmartImageView) view2.findViewById(R.id.yxf);
        } else {
            smartImageView = null;
        }
        this.LLJLLIL = smartImageView;
        View view3 = this.LLJJIJIL;
        if (view3 != null) {
            textView3 = (TextView) view3.findViewById(R.id.yxg);
        } else {
            textView3 = null;
        }
        this.LLJLL = textView3;
        View view4 = this.LLJJIJIL;
        if (view4 != null) {
            view4.setClipToOutline(true);
            view4.setOutlineProvider(new C0ID9(38));
            C786410Ut5.I7(new ACListenerS151S0100000_16(this, 169), view4);
        }
        SmartImageView smartImageView2 = this.LLJLLIL;
        if (smartImageView2 != null) {
            smartImageView2.setClipToOutline(true);
            smartImageView2.setOutlineProvider(new C0ID9(39));
            C786410Ut5.Q8(smartImageView2, new ACListenerS151S0100000_16(this, 170));
        }
        TextView textView4 = this.LLJLIL;
        if (textView4 != null) {
            SearchAdEnhancedStyleAnchorDataModel searchAdEnhancedStyleAnchorDataModel = this.LLJLLL;
            if (searchAdEnhancedStyleAnchorDataModel != null) {
                title = searchAdEnhancedStyleAnchorDataModel.getTitle();
            } else {
                title = null;
            }
            textView4.setText(title);
        }
        TextView textView5 = this.LLJLILLLLZIIL;
        if (textView5 != null) {
            SearchAdEnhancedStyleAnchorDataModel searchAdEnhancedStyleAnchorDataModel2 = this.LLJLLL;
            if (searchAdEnhancedStyleAnchorDataModel2 != null) {
                desc = searchAdEnhancedStyleAnchorDataModel2.getDesc();
            } else {
                desc = null;
            }
            textView5.setText(desc);
        }
        SearchAdEnhancedStyleAnchorDataModel searchAdEnhancedStyleAnchorDataModel3 = this.LLJLLL;
        if (searchAdEnhancedStyleAnchorDataModel3 != null && searchAdEnhancedStyleAnchorDataModel3.isDescPrimary()) {
            TextView textView6 = this.LLJLILLLLZIIL;
            if (textView6 != null) {
                textView6.setTextColor(C475630Ikz.LIZIZ(R.attr.a1q, this.LLILZ));
            }
            TextView textView7 = this.LLJLL;
            if (textView7 != null) {
                textView7.setTextColor(C475630Ikz.LIZIZ(R.attr.a1q, this.LLILZ));
            }
        }
        SearchAdPromotionAnchorInfo searchAdPromotionAnchorInfo = this.LLILLJJLI.LIZLLL.getSearchAdInfo().promotionAnchorInfo;
        if (searchAdPromotionAnchorInfo != null) {
            SearchAdEnhancedStyleAnchorDataModel searchAdEnhancedStyleAnchorDataModel4 = this.LLJLLL;
            if (searchAdEnhancedStyleAnchorDataModel4 != null) {
                desc2 = searchAdEnhancedStyleAnchorDataModel4.getDesc();
            }
            searchAdPromotionAnchorInfo.setOriginalText(desc2);
        }
        LJJI(true);
        if (this.LLJLLIL != null) {
            SearchAdEnhancedStyleAnchorDataModel searchAdEnhancedStyleAnchorDataModel5 = this.LLJLLL;
            if (searchAdEnhancedStyleAnchorDataModel5 == null || (imageUrl = searchAdEnhancedStyleAnchorDataModel5.getImageUrl()) == null) {
                imageUrl = "";
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(imageUrl);
            c1331670kl3LJIIIZ.LJJ(this.LLJLLIL);
            c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_CROP;
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
    }

    public C1007670cKT(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context, InterfaceC1003440cDe interfaceC1003440cDe) {
        Object c098200Yq;
        int anchorStyle;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Map<String, ? extends Object> map = anoleComponentModel.data;
            c1227904rF.getClass();
            c098200Yq = (SearchAdEnhancedStyleAnchorDataModel) C1227904rF.LIZIZ(C1227904rF.LJI(map), SearchAdEnhancedStyleAnchorDataModel.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        SearchAdEnhancedStyleAnchorDataModel searchAdEnhancedStyleAnchorDataModel = (SearchAdEnhancedStyleAnchorDataModel) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        this.LLJLLL = searchAdEnhancedStyleAnchorDataModel;
        if (searchAdEnhancedStyleAnchorDataModel != null) {
            anchorStyle = searchAdEnhancedStyleAnchorDataModel.getAnchorStyle();
        } else {
            anchorStyle = 0;
        }
        this.LLJZ = anchorStyle;
    }
}
