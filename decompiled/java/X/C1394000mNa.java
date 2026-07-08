package X;

import Y.ACListenerS124S0200000_21;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.api.IAnchorBusinessApi;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS230S0300000_21;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394000mNa extends AbstractC1066890drz {
    public static final /* synthetic */ int LLJI = 0;
    public final String LLJ = "PhotoModeTemplateAnchorMaker";

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        return new C1400390mXt(new AwS565S0100000_21(this, 1272), new AwS565S0100000_21(this, 1273), new AwS565S0100000_21(this, 1274), null, null, 24);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1394000mNa();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        String strSubType;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        String id = null;
        if (anchorCommonStruct != null) {
            strSubType = anchorCommonStruct.subType();
        } else {
            strSubType = null;
        }
        c2344009Gk.LJFF("tt_template_type", strSubType);
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 != null) {
            id = anchorCommonStruct2.getId();
        }
        c2344009Gk.LJFF("tt_template_id", id);
        LJJIIJ(c2344009Gk);
    }

    public final void LJJIJIIJI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MAL_AA ");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getType() == type()) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.isEmpty()) {
            C487080J8g.LIZ(LJIIZILJ(), EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPENAME(), "no anchors", false);
            return EnumC1050190dR3.NOT_FOUND;
        }
        if (!((IAnchorBusinessApi) ServiceManager.get().getService(IAnchorBusinessApi.class)).LJIIL(LJIIZILJ())) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        C487080J8g.LIZ(LJIIZILJ(), EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPENAME(), "", true);
        return super.LJJJJLL(list);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        String strSubType;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        String id = null;
        if (anchorCommonStruct != null) {
            strSubType = anchorCommonStruct.subType();
        } else {
            strSubType = null;
        }
        c2344009Gk.LJFF("tt_template_type", strSubType);
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 != null) {
            id = anchorCommonStruct2.getId();
        }
        c2344009Gk.LJFF("tt_template_id", id);
        LJJIIJZLJL(c2344009Gk);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String strSubType;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        String id = null;
        if (anchorCommonStruct != null) {
            strSubType = anchorCommonStruct.subType();
        } else {
            strSubType = null;
        }
        c2344009Gk.LJFF("tt_template_type", strSubType);
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 != null) {
            id = anchorCommonStruct2.getId();
        }
        c2344009Gk.LJFF("tt_template_id", id);
        c2344009Gk.LIZJ(LJIIZILJ().getAwemeType(), "aweme_type");
        LJJIJIIJI("startAlbumActivity");
        LJJIJ(new AwS374S0200000_8(this, c2344009Gk, 153));
        LJJII(c2344009Gk, true, true);
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
        if (thumbnail != null) {
            c1394730mOlLIZ.setIcon(thumbnail);
        }
        c1394730mOlLIZ.setTitle(LIZLLL());
        c1394730mOlLIZ.setSubTitle(anchorCommonStruct.getDescription());
        C786410Ut5.ca(c1394730mOlLIZ, new ACListenerS124S0200000_21(c2344009Gk, this, 37));
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
        c1394730mOlLIZ.setButtonOnClickListener(new AwS230S0300000_21(this, c1394730mOlLIZ, c2344009Gk, 23));
        viewGroup.addView(c1394730mOlLIZ);
        return c1394730mOlLIZ;
    }
}
