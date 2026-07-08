package X;

import Y.ARunnableS117S0100000_17;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0eRD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088730eRD {
    public final DataChannel LIZ;
    public InterfaceC1088670eR7 LIZIZ;
    public ARunnableS117S0100000_17 LIZJ;
    public C1088740eRE LIZLLL;
    public C1088660eR6 LJ;
    public boolean LJI;
    public final C0JT6<Boolean> LJFF = InterfaceC1106030et7.s4;
    public final BPEAHandler LJII = new BPEAHandler(Looper.getMainLooper());

    public C1088730eRD(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public final void LIZ(int i) {
        C1088740eRE c1088740eRE = this.LIZLLL;
        if (c1088740eRE == null) {
            return;
        }
        this.LIZLLL = null;
        C1102070emj c1102070emj = C1102070emj.LIZ;
        DataChannel dataChannel = this.LIZ;
        String str = c1088740eRE.LIZ;
        c1102070emj.getClass();
        C1102070emj.LJIIL(dataChannel, i, str);
    }
}
