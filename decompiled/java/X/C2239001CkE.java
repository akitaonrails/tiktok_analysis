package X;

import com.bytedance.android.live.liveinteract.api.monitor.MultiGuestMonitorExternalEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: renamed from: X.1CkE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239001CkE {
    public final String LIZ;
    public final String LIZIZ;
    public final DataChannel LIZJ;
    public final C2238991CkD LIZLLL;
    public final C2238981CkC LJ;
    public final List<AbstractC2238971CkB> LJFF;
    public boolean LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public int LJIILLIIL;

    public final void LIZ() {
        if (this.LJIILIIL) {
            return;
        }
        long j = this.LJIIIIZZ;
        if (j != 0) {
            long j2 = this.LJIIJJI;
            if (j2 != 0) {
                this.LJIILIIL = true;
                C2238981CkC c2238981CkC = this.LJ;
                c2238981CkC.LJIILL = this.LJIILL;
                c2238981CkC.LJIJ = this.LJIILLIIL;
                c2238981CkC.LJ(Math.max(j2, j));
            }
        }
    }

    public final void LIZIZ() {
        if (this.LJIIL) {
            return;
        }
        long j = this.LJIIIIZZ;
        if (j != 0) {
            long j2 = this.LJIIIZ;
            if (j2 != 0) {
                this.LJIIL = true;
                C2238991CkD c2238991CkD = this.LIZLLL;
                c2238991CkD.LJIILJJIL = this.LJIILLIIL;
                long jMax = Math.max(j2, j);
                if (c2238991CkD.LJIIJ) {
                    return;
                }
                c2238991CkD.LJII = jMax;
                c2238991CkD.LJIIJ = true;
                c2238991CkD.LIZIZ();
            }
        }
    }

    public final void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispose: roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomUserId=");
        sbLIZ.append(this.LIZIZ);
        C20441214yg.LIZIZ("RoomMonitor", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public C2239001CkE(DataChannel dataChannel, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = dataChannel;
        C2238991CkD c2238991CkD = new C2238991CkD(str, str2);
        this.LIZLLL = c2238991CkD;
        C2238981CkC c2238981CkC = new C2238981CkC(str, str2, c2238991CkD);
        this.LJ = c2238981CkC;
        this.LJFF = C1697810uHb.LJIIJJI(c2238991CkD, c2238981CkC);
        this.LJI = true;
        this.LJIILLIIL = -1;
        if (dataChannel != null) {
            dataChannel.CQ2(RoomChannel.class, this, new AwS594S0100000_15(this, 857));
            dataChannel.CQ2(MultiGuestMonitorExternalEvent.class, this, new AwS613S0100000_34(this, 122));
        }
    }
}
