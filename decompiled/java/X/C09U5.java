package X;

import java.net.DatagramSocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09U5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09U5 {
    public final DatagramSocket LIZ;
    public volatile String LIZIZ = null;
    public volatile Integer LIZJ = null;
    public volatile boolean LIZLLL = false;
    public volatile boolean LJ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C09U5)) {
            return false;
        }
        C09U5 c09u5 = (C09U5) obj;
        return Intrinsics.LJFF(this.LIZ, c09u5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c09u5.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c09u5.LIZJ) && this.LIZLLL == c09u5.LIZLLL && this.LJ == c09u5.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + (this.LIZIZ == null ? 0 : this.LIZIZ.hashCode())) * 31) + (this.LIZJ != null ? this.LIZJ.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        return "SocketEntry(socket=" + this.LIZ + ", defaultAddress=" + this.LIZIZ + ", defaultPort=" + this.LIZJ + ", hasConnect=" + this.LIZLLL + ", broadcastEnabled=" + this.LJ + ")";
    }

    public C09U5(DatagramSocket datagramSocket) {
        this.LIZ = datagramSocket;
    }
}
