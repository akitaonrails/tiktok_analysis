package X;

import android.content.ComponentName;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0WKM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WKM {
    public final int LIZ;
    public long LIZJ;
    public int LIZLLL;
    public int LJ;
    public byte[] LJFF;
    public long LJIIIIZZ;
    public ComponentName LJIIIZ;
    public final Map<String, String> LIZIZ = new HashMap();
    public String LJI = "";
    public String LJII = "";

    public final WsChannelMsg LIZIZ() {
        if (this.LIZ <= 0) {
            throw new IllegalArgumentException("illegal channelId");
        }
        if (this.LIZLLL < 0) {
            throw new IllegalArgumentException("illegal service");
        }
        if (this.LJ <= 0) {
            throw new IllegalArgumentException("illegal method");
        }
        if (this.LJFF == null) {
            throw new IllegalArgumentException("illegal payload");
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((HashMap) this.LIZIZ).entrySet()) {
            WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
            msgHeader.key = (String) entry.getKey();
            msgHeader.value = (String) entry.getValue();
            arrayList.add(msgHeader);
        }
        return new WsChannelMsg(this.LIZ, this.LJIIIIZZ, this.LIZJ, this.LIZLLL, this.LJ, arrayList, this.LJII, this.LJI, this.LJFF, this.LJIIIZ);
    }

    public C0WKM(int i) {
        this.LIZ = i;
    }

    public final void LIZ(String str, String str2) {
        ((HashMap) this.LIZIZ).put(str, str2);
    }
}
