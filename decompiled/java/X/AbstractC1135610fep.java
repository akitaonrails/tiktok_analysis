package X;

import android.os.Looper;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0fep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1135610fep implements InterfaceC1132200fZK {
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public boolean LIZIZ;
    public boolean LIZJ;
    public DataChannel LIZLLL;
    public InterfaceC1135600feo LJ;

    public abstract void LIZJ(GiftMessage giftMessage);

    public abstract String LIZLLL();

    public abstract void LJIIIZ();

    public final boolean LJFF(int i) {
        int iHashCode;
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null && dataChannel.gg0(RoomChannel.class) != null) {
            InterfaceC1135600feo interfaceC1135600feo = this.LJ;
            if (interfaceC1135600feo != null) {
                iHashCode = interfaceC1135600feo.hashCode();
            } else {
                iHashCode = 0;
            }
            if (i == iHashCode) {
                return false;
            }
        }
        return true;
    }

    public final void LJII(GiftMessage giftMessage) {
        InterfaceC1135600feo interfaceC1135600feo = this.LJ;
        if (interfaceC1135600feo != null) {
            interfaceC1135600feo.LIZIZ(giftMessage);
        }
        this.LIZJ = false;
        LJIIIZ();
    }

    public final boolean LJIIIIZZ(int i) {
        if (!this.LIZIZ && this.LIZLLL != null && !LJFF(i)) {
            return false;
        }
        return true;
    }

    public static void LJI(AbstractC1135610fep abstractC1135610fep, String str) {
        C20441214yg.LJFF(abstractC1135610fep.LIZLLL(), str, null);
    }

    public void LJ(DataChannel dataChannel, C1135580fem c1135580fem) {
        this.LIZLLL = dataChannel;
        this.LJ = c1135580fem;
        this.LIZIZ = false;
        this.LIZJ = false;
    }
}
