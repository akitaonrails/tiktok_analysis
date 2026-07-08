package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.AnchorConfig;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.multi.ui.AnchorPanelExtraInfo;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS382S0200000_16;

/* JADX INFO: renamed from: X.0dsi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067340dsi extends AbstractC1066890drz {
    public final C01GW LLJ = C452501pT.LIZIZ(new C1067360dsk(this));

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        return new C1400390mXt(null, null, AFwS204S0000000_16.get$arr$(377), null, null, 27);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1067340dsi();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.CAMERA_LAYOUT_ANCHOR_TYPE.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        if (!((IExternalService) ServiceManager.get().getService(IExternalService.class)).anchorService().enableCameraLayoutAnchor()) {
            C19719612Di.LJJIIJ(list, new C1067350dsj(this), true);
            return EnumC1050190dR3.NOT_FOUND;
        }
        return super.LJJJJLL(list);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        Context context = view.getContext();
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        C1392810mLf.LIZJ(context, anchorCommonStruct, interfaceC1392640mLO.LJJLIIIJJIZ(), new AnchorPanelExtraInfo(((AnchorConfig) C310650CFr.LIZIZ.getValue()).icons.anchorOnPanel, view.getResources().getString(2131828263), null, false), (String) this.LLJ.getValue());
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            C1394730mOl c1394730mOlLIZ = C1066980ds8.LIZ(viewGroup.getContext());
            UrlModel thumbnail = anchorCommonStruct.getThumbnail();
            if (thumbnail != null || (thumbnail = anchorCommonStruct.getIcon()) != null) {
                c1394730mOlLIZ.setIcon(thumbnail);
            }
            c1394730mOlLIZ.setSubTitle(anchorCommonStruct.getDescription());
            c1394730mOlLIZ.setTitle(viewGroup.getResources().getString(2131828263));
            C786410Ut5.I7(new C1077250e8h(c1394730mOlLIZ, this, 1), c1394730mOlLIZ);
            c1394730mOlLIZ.setButtonIcon(C1392810mLf.LIZIZ(anchorCommonStruct));
            c1394730mOlLIZ.setButtonOnClickListener(new AwS382S0200000_16(c1394730mOlLIZ, this, 70));
            viewGroup.addView(c1394730mOlLIZ);
            return c1394730mOlLIZ;
        }
        return null;
    }
}
