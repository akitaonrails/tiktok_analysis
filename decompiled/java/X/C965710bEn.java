package X;

import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0bEn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965710bEn {
    public final long LIZ;
    public final int LIZIZ;
    public final Room LIZJ;
    public final LinkLayerMessage LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkInfo(channelId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", room=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", disposed=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", recreate=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C965710bEn(long j, int i, Room room, LinkLayerMessage linkLayerMessage, boolean z, boolean z2, int i2) {
        linkLayerMessage = (i2 & 8) != 0 ? null : linkLayerMessage;
        z = (i2 & 16) != 0 ? false : z;
        z2 = (i2 & 32) != 0 ? false : z2;
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = room;
        this.LIZLLL = linkLayerMessage;
        this.LJ = z;
        this.LJFF = z2;
    }
}
