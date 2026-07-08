package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BE8, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BE8 extends C1BED {
    public static volatile C1BE8 LJIIIZ;
    public boolean LIZ;
    public Context LIZIZ;
    public C1BER LIZJ;
    public C1BEA LJFF;
    public C1BEG LJI;
    public AbstractC2201671BEv LJII;
    public final List<Pair<View, C1BEL>> LJIIIIZZ = Collections.synchronizedList(new ArrayList());
    public final C1BE4 LIZLLL = new C1BE4();
    public final C1BEH LJ = new Object() { // from class: X.1BEH
    };

    public static C1BE8 LIZIZ() {
        if (LJIIIZ == null) {
            synchronized (C1BE8.class) {
                try {
                    if (LJIIIZ == null) {
                        LJIIIZ = new C1BE8();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIIZ;
    }

    @Override // X.C1BED
    public final void LIZ(C1BER c1ber) {
        boolean zLJI = MethodIDManager.LJI(202256);
        if (!this.LIZ) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        this.LIZJ = c1ber;
        getClass();
        C1BE8 c1be8LIZIZ = LIZIZ();
        if (c1be8LIZIZ.LIZ && c1be8LIZIZ.LIZJ.LIZ) {
            C1BE2.LIZ(new C05F1() { // from class: X.1BE3
                @Override // X.C05F0
                public final void LIZ() {
                    try {
                        for (C1BE6 c1be6 : ((ConcurrentHashMap) C1BE8.LIZIZ().LIZLLL.LIZ).values()) {
                            if (c1be6 != null) {
                                ((C1BEN) c1be6).LJI();
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            });
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LIZJ(C1BEK c1bek) {
        int size;
        int size2;
        boolean zLJI = MethodIDManager.LJI(138005);
        C1BEC c1becLIZIZ = C1BEC.LIZIZ();
        c1bek.LJIIJ.getClass();
        List<String> list = c1bek.LJFF;
        c1becLIZIZ.getClass();
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        try {
            new JSONObject().putOpt("url_count", Integer.valueOf(size));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1BEE.LIZ();
        List<String> list2 = c1bek.LJFF;
        if (list2 != null && !list2.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            List<String> list3 = c1bek.LJFF;
            if (list3 != null) {
                size2 = list3.size();
            } else {
                size2 = 0;
            }
            C1BEJ.LIZIZ(jSONObject, "track_url_size", Integer.valueOf(size2));
            C1BEJ.LIZ("start_track", c1bek, jSONObject);
            if (this.LIZ) {
                getClass();
                C1BE8 c1be8LIZIZ = LIZIZ();
                if (c1be8LIZIZ.LIZ && c1be8LIZIZ.LIZJ.LIZ) {
                    C1BE2.LIZ(new C1BE9(SystemClock.uptimeMillis(), null, c1bek));
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pending event:");
                sbLIZ.append(c1bek.LIZIZ);
                sbLIZ.append("-");
                sbLIZ.append(c1bek.LJIIJ);
                C2188811AlT.LIZIZ(sbLIZ);
                this.LJIIIIZZ.add(Pair.create(null, c1bek));
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (!zLJI) {
            return;
        }
        MethodIDManager.LJ();
    }
}
