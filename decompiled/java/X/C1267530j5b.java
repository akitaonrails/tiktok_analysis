package X;

import Y.ARunnableS89S0200000_20;
import android.os.Handler;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture;

/* JADX INFO: renamed from: X.0j5b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1267530j5b extends C1270350jA9 {
    public final ARunnableS89S0200000_20 LLJJIJIIJIL;
    public long LLJJIJIL;
    public int LLJJJ;
    public final /* synthetic */ LiveStreamVideoCapture LLJJJIL;

    @Override // X.AbstractC1268600j7K
    public final float LLIZLLLIL() {
        return this.LLJJJ;
    }

    @Override // X.C1270350jA9, X.AbstractC1268600j7K
    public final void stop() {
        super.stop();
        this.LLJJJIL.LLJILJIL.removeCallbacks(this.LLJJIJIIJIL);
        AVLog.iod("LiveStreamVideoCapture", "RadioModeVideoCapture stopped");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1267530j5b(LiveStreamVideoCapture liveStreamVideoCapture, InterfaceC1270200j9u interfaceC1270200j9u, Handler handler) {
        super(interfaceC1270200j9u, handler, null);
        this.LLJJJIL = liveStreamVideoCapture;
        this.LLJJJ = 30;
        liveStreamVideoCapture.LLJIJIL();
        int i = liveStreamVideoCapture.LLJJI;
        if (i > 0) {
            this.LLJJJ = i;
        }
        this.LLJJIJIL = LSPassThroughRecordSizeConfig.DEFAULT / this.LLJJJ;
        this.LLJJIJIIJIL = new ARunnableS89S0200000_20(this, liveStreamVideoCapture, 71);
    }

    @Override // X.C1270350jA9, X.AbstractC1268600j7K
    public final void LLJI(int i, int i2, int i3) {
        super.LLJI(i, i2, i3);
        LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJJIL;
        liveStreamVideoCapture.LLJILJILJ = i;
        liveStreamVideoCapture.LLJILLL = i2;
        this.LLIZLLLIL = i3;
        int i4 = liveStreamVideoCapture.LLJJI;
        if (i4 > 0) {
            this.LLJJJ = i4;
        } else {
            this.LLJJJ = i3;
        }
        this.LLJJIJIL = LSPassThroughRecordSizeConfig.DEFAULT / this.LLJJJ;
        C786410Ut5.LJJZZIII(liveStreamVideoCapture.LLJILJIL, this.LLJJIJIIJIL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RadioModeVideoCapture started: width:");
        sbLIZ.append(i);
        sbLIZ.append(" height");
        sbLIZ.append(i2);
        sbLIZ.append(" fps:");
        sbLIZ.append(i3);
        AVLog.iod("LiveStreamVideoCapture", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1268600j7K
    public final int LLJ(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        return this.LLJJJIL.LLJ(buffer, i, i2, 0, j);
    }
}
