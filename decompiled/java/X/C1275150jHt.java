package X;

import Y.ARunnableS120S0100000_20;
import android.os.HandlerThread;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.lyrax.video.RtcVideoFramePoolConfig;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg;

/* JADX INFO: renamed from: X.0jHt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1275150jHt {
    public C1272880jEE LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LJ;
    public final String LJFF;
    public C1273600jFO LJI;
    public final StreamIndex LJII;
    public final C1274890jHT LJIIIIZZ;
    public final C01IN LJIIIZ;
    public C01IR LJIIJ;
    public ARunnableS120S0100000_20 LJIIJJI;
    public View LJIIL;
    public boolean LJIILIIL;
    public final VPassInteractCfg LJIILJJIL;
    public final HandlerThread LJIILL;
    public final BPEAHandler LJIILLIIL;
    public final C1274250jGR LJIIZILJ;
    public float[] LJIJ;
    public float LJIJI;
    public RtcVideoFramePoolConfig LJIJJ;
    public boolean LJIJJLI;
    public C1275600jIc LJIL;
    public int LIZLLL = 1;
    public EnumC1276080jJO LJJ = EnumC1276080jJO.None;

    public static int[] LIZ(int i, int i2) {
        int i3;
        int[] iArr = {i, i2};
        int i4 = 720;
        if (i > i2) {
            i3 = (int) ((720.0f / i) * i2);
        } else {
            i4 = (int) ((720.0f / i2) * i);
            i3 = 720;
        }
        iArr[0] = i4;
        iArr[1] = i3;
        return iArr;
    }

    public final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop:");
        sbLIZ.append(this.LJFF);
        AVLog.logKibana(4, "AuxStream", C2188811AlT.LIZIZ(sbLIZ), null);
        C786410Ut5.LJJZZIII(this.LJIILLIIL, new ARunnableS120S0100000_20(this, 305));
    }

    public C1275150jHt(String str, StreamIndex streamIndex, C1274890jHT c1274890jHT, C01IN c01in, VPassInteractCfg vPassInteractCfg, C1274250jGR c1274250jGR) {
        this.LJFF = str;
        this.LJII = streamIndex;
        this.LJIIIIZZ = c1274890jHT;
        this.LJIIIZ = c01in;
        this.LJIILJJIL = vPassInteractCfg;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuxStreamThread_");
        sbLIZ.append(streamIndex.value());
        HandlerThread handlerThread = new HandlerThread(C2188811AlT.LIZIZ(sbLIZ));
        this.LJIILL = handlerThread;
        handlerThread.start();
        this.LJIILLIIL = new BPEAHandler(C786410Ut5.W2(handlerThread));
        this.LJIIZILJ = c1274250jGR;
    }
}
