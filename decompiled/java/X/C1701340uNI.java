package X;

import android.hardware.display.DisplayManager;
import com.ss.ttm.player.VsyncTimeHelper;

/* JADX INFO: renamed from: X.0uNI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701340uNI implements DisplayManager.DisplayListener {
    public final DisplayManager LL;
    public final /* synthetic */ VsyncTimeHelper LLILLJJLI;

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.LLILLJJLI.LIZ();
        }
    }

    public C1701340uNI(VsyncTimeHelper vsyncTimeHelper, DisplayManager displayManager) {
        this.LLILLJJLI = vsyncTimeHelper;
        this.LL = displayManager;
    }
}
