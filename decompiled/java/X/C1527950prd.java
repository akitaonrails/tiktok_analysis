package X;

import android.content.ComponentName;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0prd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527950prd {
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

    public final LiveWsMessage LIZ() {
        if (this.LIZ <= 0) {
            throw new IllegalArgumentException("illegal channelId");
        }
        if (this.LIZLLL <= 0) {
            throw new IllegalArgumentException("illegal service");
        }
        if (this.LJ <= 0) {
            throw new IllegalArgumentException("illegal method");
        }
        if (this.LJFF == null) {
            throw new IllegalArgumentException("illegal payload");
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (Map.Entry entry : ((HashMap) this.LIZIZ).entrySet()) {
                LiveWsMessage.MsgHeader msgHeader = new LiveWsMessage.MsgHeader();
                msgHeader.key = (String) entry.getKey();
                msgHeader.value = (String) entry.getValue();
                arrayList.add(msgHeader);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return new LiveWsMessage(this.LIZ, this.LJIIIIZZ, this.LIZJ, this.LIZLLL, this.LJ, arrayList, this.LJII, this.LJI, this.LJFF, this.LJIIIZ);
    }

    public C1527950prd(int i) {
        this.LIZ = i;
    }
}
