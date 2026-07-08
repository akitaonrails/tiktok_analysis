package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0aC1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925550aC1 {
    public final Room LIZ;
    public final Context LIZIZ;
    public final DataChannel LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestDataPackage(room=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", context=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dataChannel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C925550aC1(Context context, Room room, DataChannel dataChannel) {
        this.LIZ = room;
        this.LIZIZ = context;
        this.LIZJ = dataChannel;
    }
}
