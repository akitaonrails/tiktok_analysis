package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttm.player.TTPlayerClient;

/* JADX INFO: renamed from: X.0oKW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1468980oKW {
    public Context LIZ;

    public final C1470430oMr LIZ() {
        C1470430oMr c1470430oMr = new C1470430oMr();
        try {
            c1470430oMr.LIZ = TTPlayerClient.create(c1470430oMr, this.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1471660oOq.LIZIZ("MediaPlayerWrapper", th.toString());
            c1470430oMr.LIZIZ = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append(";");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c1470430oMr.LIZJ);
            sbLIZ2.append((Object) strLIZIZ);
            c1470430oMr.LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (c1470430oMr.LIZIZ) {
            String str = ",sHasLoadPlayerClass:" + C1469080oKg.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(c1470430oMr.LIZJ);
            sbLIZ3.append((Object) str);
            c1470430oMr.LIZJ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        return c1470430oMr;
    }
}
