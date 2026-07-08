package X;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: X.0WYW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WYW {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public long LIZLLL;
    public byte[] LJ;
    public String LJFF;
    public long LJI;
    public EnumC1527610pr5 LJII;
    public EnumC825070WYf LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public EnumC1527250pqV LJIIJJI;
    public String LJIIL;
    public EnumC1525890poJ LJIILIIL;
    public EnumC1527270pqX LJIILJJIL;
    public long LJIILL;
    public EnumC1527260pqW LJIILLIIL;
    public Map<String, String> LJIIZILJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SyncLog{syncId='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", did='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", uid='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", syncCursor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", data=");
        sbLIZ.append(Arrays.toString(this.LJ));
        sbLIZ.append(", md5='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", business=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", consumeType=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", dataType=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", publishTs=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", receiveTs=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", bucket=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", reqId='");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append('\'');
        sbLIZ.append(", topicType=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", packetStatus=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", packetCtrl=");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append(", expireTs=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
