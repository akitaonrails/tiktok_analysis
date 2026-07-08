package X;

import android.view.View;
import com.ss.android.ugc.aweme.service.IFeedSkylightCommonService;

/* JADX INFO: renamed from: X.0Tei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@InterfaceC20647615qs("friends_feed_update_pills")
public final class C752020Tei extends AbstractC20660115st<View> {
    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 1;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        C19EG c19egLIZIZ;
        IFeedSkylightCommonService iFeedSkylightCommonServiceLJ = C614770O9j.LIZIZ.LJ();
        C688120Qyw c688120QywI2 = this.scene.i2();
        if (c688120QywI2 != null) {
            c19egLIZIZ = c688120QywI2.LIZIZ();
        } else {
            c19egLIZIZ = null;
        }
        if (!iFeedSkylightCommonServiceLJ.LJJIIJ(0, c19egLIZIZ)) {
            return null;
        }
        throw null;
    }
}
