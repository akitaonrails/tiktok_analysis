package X;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0e7z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076810e7z extends AbstractC1066890drz {
    public final String LLJ = UUID.randomUUID().toString();

    @Override // X.AbstractC1066890drz, X.InterfaceC1392520mLC
    public final String LJIIJ() {
        return "app_page";
    }

    @Override // X.AbstractC1066890drz
    public final boolean LJIL() {
        return true;
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1076810e7z();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.PHOTO_MV_ANCHOR.getTYPE();
    }

    public final void LJJIJIIJI(C2344009Gk c2344009Gk) {
        LJJII(c2344009Gk, false, true);
        C1385210m9P c1385210m9P = new C1385210m9P();
        c1385210m9P.LIZLLL = "anchor_combine_page";
        c1385210m9P.LJIILLIIL = "anchor_combine_mv";
        c1385210m9P.LJIIZILJ = LJIIZILJ().getAid();
        c1385210m9P.LJII = this.LLJ;
        c1385210m9P.LJIJI = "upload";
        c1385210m9P.LJIJ = "video";
        c1385210m9P.LJIILJJIL();
        LJJIJ(new AwS595S0100000_16(this, 237));
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        LJJIJIIJI(c2344009Gk);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            C1394730mOl c1394730mOlLIZ = C1066980ds8.LIZ(viewGroup.getContext());
            UrlModel thumbnail = anchorCommonStruct.getThumbnail();
            if (thumbnail != null) {
                c1394730mOlLIZ.setIcon(thumbnail);
            }
            String keyword = anchorCommonStruct.getKeyword();
            if (keyword == null) {
                keyword = "";
            }
            c1394730mOlLIZ.setTitle(keyword);
            c1394730mOlLIZ.setSubTitle(anchorCommonStruct.getDescription());
            List<AnchorPanelAction> actions = anchorCommonStruct.getActions();
            if (actions != null && C13LP.LJJJLL(actions) != null) {
                c1394730mOlLIZ.setButtonIcon(anchorCommonStruct.getIcon());
                c1394730mOlLIZ.setButtonOnClickListener(new AwS382S0200000_16(this, c2344009Gk, 68));
            }
            viewGroup.addView(c1394730mOlLIZ);
            return c1394730mOlLIZ;
        }
        return null;
    }
}
