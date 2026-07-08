package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdkapi.host.IHostAction;

/* JADX INFO: renamed from: X.0xW6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822120xW6 {
    public static void LIZ(Context context, PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("show_entrance", pcsServicePlusOptinPageParams.getShowEntrance(), bundle);
        C786410Ut5.LJJJI("anchor_id", pcsServicePlusOptinPageParams.getAnchorId(), bundle);
        C786410Ut5.LJJJI("pcs_track_context", pcsServicePlusOptinPageParams.getPcsTrackContext(), bundle);
        C786410Ut5.LJJIZ(bundle, "extra", pcsServicePlusOptinPageParams.getExtra());
        C786410Ut5.LJJJI("fragment_type", "smb_optin_fragment_type", bundle);
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, "aweme://live/container", bundle);
    }
}
