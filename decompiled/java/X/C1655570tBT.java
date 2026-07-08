package X;

import android.view.KeyEvent;
import com.ss.android.ugc.aweme.feed.assem.music.mute.OpenOnMuteImpl;
import com.ss.android.ugc.aweme.port.in.IToolsVolumeKeydownRunnerSpi;

/* JADX INFO: renamed from: X.0tBT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1655570tBT implements IToolsVolumeKeydownRunnerSpi {
    public static final C1655570tBT LIZIZ = new C1655570tBT();
    public final /* synthetic */ IToolsVolumeKeydownRunnerSpi LIZ;

    @Override // com.ss.android.ugc.aweme.port.in.IToolsVolumeKeydownRunnerSpi
    public final void LJIIIZ(int i, KeyEvent keyEvent) {
        this.LIZ.LJIIIZ(i, keyEvent);
    }

    public C1655570tBT() {
        IToolsVolumeKeydownRunnerSpi iToolsVolumeKeydownRunnerSpi;
        Object objLIZ = C04TD.LIZ(IToolsVolumeKeydownRunnerSpi.class, false);
        if (objLIZ != null) {
            iToolsVolumeKeydownRunnerSpi = (IToolsVolumeKeydownRunnerSpi) objLIZ;
        } else {
            if (C04TD.q0 == null) {
                synchronized (IToolsVolumeKeydownRunnerSpi.class) {
                    if (C04TD.q0 == null) {
                        C04TD.q0 = new OpenOnMuteImpl();
                    }
                }
            }
            iToolsVolumeKeydownRunnerSpi = C04TD.q0;
        }
        this.LIZ = iToolsVolumeKeydownRunnerSpi;
    }
}
