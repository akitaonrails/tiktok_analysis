package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpFragment;

/* JADX INFO: renamed from: X.0DDA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DDA {
    public static PdpFragment LIZ(Bundle bundle) {
        PdpFragment pdpFragment = new PdpFragment();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJIIZI(bundle2, bundle, "arg_entry_args");
        String string = bundle.getString("extra_ucp_playback_session_id");
        if (string != null) {
            C786410Ut5.LJJJI("extra_ucp_playback_session_id", string, bundle2);
        }
        pdpFragment.setArguments(bundle2);
        return pdpFragment;
    }
}
