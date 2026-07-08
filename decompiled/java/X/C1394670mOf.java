package X;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextToImageService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS117S0400000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0mOf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394670mOf extends AbstractC1066890drz {
    public final C01GW LLJ = C452501pT.LIZIZ(new C1394680mOg());

    @Override // X.AbstractC1066890drz
    public final boolean LJIJI() {
        return true;
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1394670mOf();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.TEXT_TO_IMAGE_ANCHOR.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        if (!C528180KnY.LIZIZ().enable) {
            C19719612Di.LJJIIJ(list, new AwS600S0100000_21(this, 258), true);
            return EnumC1050190dR3.NOT_FOUND;
        }
        if (!C528180KnY.LIZJ()) {
            C19719612Di.LJJIIJ(list, new AwS600S0100000_21(this, 259), true);
            return EnumC1050190dR3.NOT_FOUND;
        }
        return super.LJJJJLL(list);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            C844470XAv.LIZ.getClass();
            if (creativeToolsPluginService.LIZJ(C844470XAv.LIZ(), "text_to_image_anchor", true)) {
                ((IOpenTextToImageService) this.LLJ.getValue()).openTextToImage(LJIILJJIL(), LJIJJ(), LJIIZILJ(), LJIJJLI());
            }
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        AnchorPanelAction next;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        UrlModel icon = null;
        if (anchorCommonStruct == null) {
            return null;
        }
        C1394730mOl c1394730mOlLIZ = C1066980ds8.LIZ(viewGroup.getContext());
        UrlModel thumbnail = anchorCommonStruct.getThumbnail();
        if (thumbnail != null || (thumbnail = anchorCommonStruct.getIcon()) != null) {
            c1394730mOlLIZ.setIcon(thumbnail);
        }
        c1394730mOlLIZ.setSubTitle(anchorCommonStruct.getDescription());
        String keyword = anchorCommonStruct.getKeyword();
        if (keyword == null) {
            keyword = "";
        }
        c1394730mOlLIZ.setTitle(keyword);
        C786410Ut5.I7(new C1401840maE(dialog, this, c2344009Gk, 1), c1394730mOlLIZ);
        List<AnchorPanelAction> actions = anchorCommonStruct.getActions();
        if (actions != null) {
            Iterator<AnchorPanelAction> it2 = actions.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getActionType() == 1) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorPanelAction anchorPanelAction = next;
            if (anchorPanelAction != null) {
                icon = anchorPanelAction.getIcon();
            }
        }
        c1394730mOlLIZ.setButtonIcon(icon);
        c1394730mOlLIZ.setButtonOnClickListener(new AwS117S0400000_21(dialog, this, c1394730mOlLIZ, c2344009Gk, 9));
        viewGroup.addView(c1394730mOlLIZ);
        return c1394730mOlLIZ;
    }
}
