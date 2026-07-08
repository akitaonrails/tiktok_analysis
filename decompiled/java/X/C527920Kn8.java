package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.live.LiveRecordModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Kn8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527920Kn8 implements InterfaceC855650XhT {
    @Override // X.InterfaceC855650XhT
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC855650XhT
    public final void LIZJ(CreativeModel creativeModel) {
    }

    @Override // X.InterfaceC855650XhT
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC855650XhT
    public final void LIZ(CreativeModel creativeModel) {
        creativeModel.autoCutModel = new AutoCutModel(null, null, null, null, 0, 0, false, false, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, 0, null, false, null, 0, 0, null, false, false, null, null, -1, 7, null);
        creativeModel.liveRecordModel = new LiveRecordModel(new ArrayList());
    }
}
