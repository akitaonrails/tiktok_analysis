package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.thirdpartylink.PcsThirdPartyLinkData;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view.PcsThirdPartyLinkDialog;
import com.bytedance.android.livesdkapi.host.user.IHostPad;

/* JADX INFO: renamed from: X.0xV0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821440xV0 {
    public static void LIZ(PcsThirdPartyLinkData pcsThirdPartyLinkData) {
        FragmentManager fragmentManagerLIZJ = C507500JvI.LIZJ((Context) C507500JvI.LIZIZ().get());
        PcsThirdPartyLinkDialog pcsThirdPartyLinkDialog = new PcsThirdPartyLinkDialog();
        pcsThirdPartyLinkDialog.LLJLLL = pcsThirdPartyLinkData;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "third_party_link_data", pcsThirdPartyLinkData);
        pcsThirdPartyLinkDialog.setArguments(bundle);
        C19322110iZ.LJ(fragmentManagerLIZJ, pcsThirdPartyLinkDialog, null, "pcs_third_party_link", null, C467770IVz.LIZ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)), null);
    }
}
