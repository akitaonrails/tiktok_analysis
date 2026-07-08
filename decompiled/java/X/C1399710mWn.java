package X;

import android.view.KeyEvent;
import com.ss.android.ugc.aweme.feed.assem.music.mute.OpenOnMuteImpl;
import com.ss.android.ugc.aweme.feed.utils.IVolumeKeyUnmuteRunnerSpi;

/* JADX INFO: renamed from: X.0mWn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399710mWn implements IVolumeKeyUnmuteRunnerSpi {
    public static final C1399710mWn LIZIZ = new C1399710mWn();
    public final /* synthetic */ IVolumeKeyUnmuteRunnerSpi LIZ;

    @Override // com.ss.android.ugc.aweme.feed.utils.IVolumeKeyUnmuteRunnerSpi
    public final void LIZ(Integer num, KeyEvent keyEvent, Object obj) {
        this.LIZ.LIZ(num, keyEvent, obj);
    }

    public C1399710mWn() {
        IVolumeKeyUnmuteRunnerSpi iVolumeKeyUnmuteRunnerSpi;
        Object objLIZ = C04TD.LIZ(IVolumeKeyUnmuteRunnerSpi.class, false);
        if (objLIZ != null) {
            iVolumeKeyUnmuteRunnerSpi = (IVolumeKeyUnmuteRunnerSpi) objLIZ;
        } else {
            if (C04TD.q0 == null) {
                synchronized (IVolumeKeyUnmuteRunnerSpi.class) {
                    if (C04TD.q0 == null) {
                        C04TD.q0 = new OpenOnMuteImpl();
                    }
                }
            }
            iVolumeKeyUnmuteRunnerSpi = C04TD.q0;
        }
        this.LIZ = iVolumeKeyUnmuteRunnerSpi;
    }
}
