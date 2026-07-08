package X;

import com.bytedance.android.livesdk.widget.LivePlayPauseWidget;

/* JADX INFO: renamed from: X.0IEp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C463250IEp {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public C0IFP LIZLLL;
    public LivePlayPauseWidget LJ;

    public final void LIZ(int i, int i2, int i3) {
        LivePlayPauseWidget livePlayPauseWidget = this.LJ;
        if (livePlayPauseWidget != null && livePlayPauseWidget.isInitialized()) {
            LivePlayPauseWidget livePlayPauseWidget2 = this.LJ;
            if (livePlayPauseWidget2 != null) {
                livePlayPauseWidget2.A1(i, i2, i3);
                return;
            }
            return;
        }
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
