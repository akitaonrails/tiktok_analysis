package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.thirdpartylink.PcsThirdPartyLinkData;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view.PcsThirdPartyLinkFragment;

/* JADX INFO: renamed from: X.0xVC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821560xVC {
    public static PcsThirdPartyLinkFragment LIZ(C1821560xVC c1821560xVC, PcsThirdPartyLinkData pcsThirdPartyLinkData, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        c1821560xVC.getClass();
        PcsThirdPartyLinkFragment pcsThirdPartyLinkFragment = new PcsThirdPartyLinkFragment();
        pcsThirdPartyLinkFragment.LL = pcsThirdPartyLinkData;
        pcsThirdPartyLinkFragment.LLILZ = z;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "third_party_link_page_params", pcsThirdPartyLinkData);
        bundle.putBoolean("show_header", z);
        bundle.putBoolean("use_rounded_container", z2);
        pcsThirdPartyLinkFragment.setArguments(bundle);
        return pcsThirdPartyLinkFragment;
    }
}
