package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS86S1000000_1;

/* JADX INFO: renamed from: X.03AI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03AI extends AbstractC7925037r {
    public final Context LLILZIL;
    public final OrderSubmitAssemViewModel LLILZLL;
    public TuxTextView LLIZ;
    public C426160GnO LLIZLLLIL;

    public final C426160GnO getUsOspUserTrustFlowlayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_osp_user_trust_flowlayout);
            this.LLIZLLLIL = (C426160GnO) callbackFindViewById;
        }
        return (C426160GnO) callbackFindViewById;
    }

    public final TuxTextView getUsOspUserTrustPanelTitleVariantFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_osp_user_trust_panel_title_variant);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setUsOspUserTrustFlowlayoutFromXml(C426160GnO c426160GnO) {
        this.LLIZLLLIL = c426160GnO;
    }

    public final void setUsOspUserTrustPanelTitleVariantFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public C03AI(ExposeUserRightPanel exposeUserRightPanel, String str, BillStarlingText billStarlingText, HashMap map, Context context, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        List<ExposeUserRight> list;
        C03IT imageUrlModel;
        Image icon;
        super(exposeUserRightPanel, str, map, context, null, 0);
        this.LLILZIL = context;
        this.LLILZLL = orderSubmitAssemViewModel;
        C03XA c03xa = C03XA.LIZ;
        Context context2 = getContext();
        c03xa.getClass();
        C03XA.LIZJ(context2, R.layout.aq1, this, true);
        C0H1U.LJIIL(getUsOspUserTrustPanelTitleVariantFromXml(), exposeUserRightPanel != null ? exposeUserRightPanel.title : null, true);
        if (exposeUserRightPanel != null && (list = exposeUserRightPanel.exposeUserRights) != null) {
            int i = 0;
            for (ExposeUserRight exposeUserRight : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    ExposeUserRight exposeUserRight2 = exposeUserRight;
                    C426160GnO usOspUserTrustFlowlayoutFromXml = getUsOspUserTrustFlowlayoutFromXml();
                    C03AJ c03aj = new C03AJ(this.LLILZIL, null, 6, 0);
                    Icon icon2 = exposeUserRight2.icon;
                    if (icon2 != null && (icon = icon2.getIcon()) != null) {
                        imageUrlModel = icon.toImageUrlModel();
                    } else {
                        imageUrlModel = null;
                    }
                    Pair pair = new Pair(Integer.valueOf(C0H9H.LIZIZ(12)), Integer.valueOf(C0H9H.LIZIZ(12)));
                    if (imageUrlModel != null) {
                        C1326790kdB.LIZ.getClass();
                        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
                        c1331670kl3LIZLLL.LJJ(c03aj.getUsLabelIconFromXml());
                        C786410Ut5.h3(c1331670kl3LIZLLL);
                        C12ES.LJIILL(0, c03aj.getUsLabelIconFromXml());
                    } else {
                        C0H1U.LIZIZ(c03aj.getUsLabelIconFromXml());
                    }
                    C1744700vVE.LJIIL(c03aj.getUsLabelIconFromXml(), ((Number) pair.getFirst()).intValue());
                    C1744700vVE.LJIIIIZZ(((Number) pair.getSecond()).intValue(), c03aj.getUsLabelIconFromXml());
                    new AwS580S0100000_1(exposeUserRight2, 804).invoke(c03aj.getUsLabelContentFromXml());
                    C786410Ut5.I7(new AjS20S0300000_1(this, exposeUserRight2, c03aj, 43), c03aj);
                    String str2 = exposeUserRight2.nameEn;
                    if (str2 != null) {
                        C1748720vbi.LJFF(c03aj, new C049X(), new AwS86S1000000_1(str2, 24), new AwS52S1000000_1(str2, 43));
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C0H9H.LIZIZ(17));
                    layoutParams.setMarginEnd(C0H9H.LIZIZ(12));
                    layoutParams.bottomMargin = C0H9H.LIZIZ(2);
                    usOspUserTrustFlowlayoutFromXml.addView(c03aj, layoutParams);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
