package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0eQA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088080eQA {
    public int LIZ;
    public boolean LIZIZ;
    public DataChannel LIZJ;

    public final void LIZ(String str, boolean z) {
        if (this.LIZIZ != z) {
            if (z) {
                this.LIZ = 0;
            } else if (this.LIZ < 0) {
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_comment_slide_up", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
                c474500IjALIZIZ.LJIJJLI(this.LIZJ);
                c474500IjALIZIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Fc2(), "comment_slide_up_scene");
                c474500IjALIZIZ.LJJII(str, "admin_type");
                c474500IjALIZIZ.LJJII(C466640IRq.LIZJ().LIZLLL(), "enter_live_method");
                c474500IjALIZIZ.LIZ();
            }
            this.LIZIZ = z;
        }
    }
}
