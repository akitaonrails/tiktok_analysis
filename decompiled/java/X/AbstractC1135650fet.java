package X;

import Y.ARunnableS117S0100000_17;
import android.os.Looper;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fet, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1135650fet implements InterfaceC1135330feN {
    public volatile InterfaceC1135310feL LIZIZ;
    public boolean LIZJ;
    public volatile boolean LIZLLL;
    public DataChannel LJ;
    public InterfaceC1135620feq LJFF;
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS117S0100000_17 LJI = new ARunnableS117S0100000_17(this, 265);

    public abstract void LIZJ(InterfaceC1136020ffU interfaceC1136020ffU);

    public abstract String LIZLLL();

    public abstract void LJIIJJI();

    public final int LJ() {
        InterfaceC1135620feq interfaceC1135620feq = this.LJFF;
        if (interfaceC1135620feq != null) {
            return interfaceC1135620feq.hashCode();
        }
        return 0;
    }

    public final void LJIIJ() {
        LJIIIIZZ(new AwS561S0100000_17(this, 603));
    }

    public final boolean LJI(int i) {
        DataChannel dataChannel = this.LJ;
        if (dataChannel != null && dataChannel.gg0(RoomChannel.class) != null && i == LJ()) {
            return false;
        }
        return true;
    }

    public final void LJIIIIZZ(Function0<Unit> function0) {
        InterfaceC1135310feL interfaceC1135310feL = this.LIZIZ;
        if (interfaceC1135310feL != null && !interfaceC1135310feL.LIZJ()) {
            interfaceC1135310feL.LIZIZ(LIZLLL(), function0);
        } else {
            function0.invoke();
        }
    }

    public final boolean LJIIIZ(int i) {
        if (!this.LIZJ && this.LJ != null && !LJI(i)) {
            return false;
        }
        return true;
    }

    public static void LJII(AbstractC1135650fet abstractC1135650fet, String str) {
        abstractC1135650fet.getClass();
        String strLIZLLL = abstractC1135650fet.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloader_");
        sbLIZ.append(strLIZLLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("gift_receiving_");
        sbLIZ2.append(strLIZIZ);
        C20441214yg.LJFF(C2188811AlT.LIZIZ(sbLIZ2), str, null);
    }

    public void LJFF(DataChannel dataChannel, C1135590fen c1135590fen) {
        this.LJ = dataChannel;
        this.LJFF = c1135590fen;
        this.LIZJ = false;
        this.LIZLLL = false;
    }
}
