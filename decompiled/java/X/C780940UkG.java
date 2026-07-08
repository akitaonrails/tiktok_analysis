package X;

import Y.ARunnableS112S0100000_12;
import android.os.HandlerThread;
import com.bytedance.android.livesdk.broadcast.RestartLiveThreshold;
import com.bytedance.android.livesdk.livesetting.broadcast.RestartLiveSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UkG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780940UkG {
    public final DataChannel LIZ;
    public HandlerThread LIZIZ;
    public BPEAHandler LIZJ;
    public ARunnableS112S0100000_12 LIZLLL;
    public C780970UkJ LJ;
    public final C780950UkH LJFF = new C780950UkH();
    public final C780950UkH LJI = new C780950UkH();
    public final C780950UkH LJII = new C780950UkH();
    public C780960UkI LJIIIIZZ;

    public C780940UkG(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public final void LIZ(int i) {
        int iLIZIZ;
        int iLIZIZ2;
        int poorTimes;
        DataChannel dataChannel;
        int iLIZIZ3 = 0;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i == 1) {
            iLIZIZ3 = this.LJI.LIZIZ();
            iLIZIZ2 = 0;
            iLIZIZ = 0;
        } else if (i == 2) {
            iLIZIZ = this.LJFF.LIZIZ();
            iLIZIZ2 = 0;
        } else {
            if (i == 3) {
                iLIZIZ2 = this.LJII.LIZIZ();
                iLIZIZ = 0;
            }
            iLIZIZ = 0;
            iLIZIZ2 = 0;
            poorTimes = RestartLiveSetting.INSTANCE.getConfig().getPoorTimes();
            if ((iLIZIZ3 < poorTimes || iLIZIZ >= poorTimes || iLIZIZ2 >= poorTimes) && (dataChannel = this.LIZ) != null) {
                dataChannel.FQ2(RestartLiveThreshold.class);
            }
            return;
        }
        poorTimes = RestartLiveSetting.INSTANCE.getConfig().getPoorTimes();
        if (iLIZIZ3 < poorTimes) {
        }
        dataChannel.FQ2(RestartLiveThreshold.class);
    }
}
