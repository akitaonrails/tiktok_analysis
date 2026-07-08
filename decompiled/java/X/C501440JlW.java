package X;

import Y.AfS176S0100000_7;
import Y.AfS3S0100100_7;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLinkMicMatchConfigSettings;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0JlW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501440JlW {
    public int LIZ;
    public C11JF LIZIZ;
    public C11JL LIZJ;

    public final void LIZ() {
        if (this.LIZIZ != null) {
            return;
        }
        long anchorReportTimeSec = MultiGuestLinkMicMatchConfigSettings.INSTANCE.getAnchorReportTimeSec();
        this.LIZIZ = (C11JF) C19490011Na.LIZLLL(1L, anchorReportTimeSec, 0L, 1L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLL(new AfS3S0100100_7(anchorReportTimeSec, this, 6), new AfS176S0100000_7(this, 164));
    }
}
