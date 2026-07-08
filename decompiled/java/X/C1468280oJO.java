package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;

/* JADX INFO: renamed from: X.0oJO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468280oJO {
    public InterfaceC1468520oJm LJ;
    public PthreadTimer LJFF;
    public C1468290oJP LJI;
    public List<Integer> LIZ = Collections.emptyList();
    public List<Integer> LIZIZ = Collections.emptyList();
    public List<String> LIZJ = Collections.emptyList();
    public Map<Long, Float> LIZLLL = Collections.emptyMap();
    public volatile int LJII = 100;
    public volatile int LJIIIIZZ = 0;
    public volatile int LJIIIZ = 120000;

    public final synchronized void LIZJ() {
        if (this.LJIIIIZZ <= 0) {
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("NetworkPortraitData", "invalid parameter");
            return;
        }
        List<Integer> list = this.LIZ;
        List<Integer> list2 = Collections.EMPTY_LIST;
        if (list == list2) {
            this.LIZ = new ArrayList();
        }
        if (this.LIZIZ == list2) {
            this.LIZIZ = new ArrayList();
        }
        if (this.LIZJ == list2) {
            this.LIZJ = new ArrayList();
        }
        if (this.LIZLLL == Collections.EMPTY_MAP) {
            this.LIZLLL = new LinkedHashMap();
        }
        C1468290oJP c1468290oJP = this.LJI;
        if (c1468290oJP != null) {
            c1468290oJP.cancel();
        }
        if (this.LJFF == null) {
            this.LJFF = new PthreadTimer("net-portrait-data");
        }
        C1468290oJP c1468290oJP2 = new C1468290oJP(this);
        this.LJI = c1468290oJP2;
        this.LJFF.schedule(c1468290oJP2, 500L, this.LJIIIIZZ);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("network timer task scheduled, interval ");
        sbLIZ.append(this.LJIIIIZZ);
        TTVideoEngineLog.d("NetworkPortraitData", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final List LIZ(List list) {
        if (this.LJIIIIZZ == 0) {
            return new ArrayList();
        }
        int i = this.LJIIIZ / this.LJIIIIZZ;
        if (i <= 0) {
            return new ArrayList();
        }
        if (i > list.size()) {
            return new ArrayList(list);
        }
        return list.subList(list.size() - i, list.size());
    }

    public final synchronized void LIZIZ(TimerTask timerTask, int i) {
        if (this.LJFF == null) {
            this.LJFF = new PthreadTimer("net-portrait-data");
        }
        PthreadTimer pthreadTimer = this.LJFF;
        if (i <= 0) {
            i = this.LJIIIIZZ;
        }
        pthreadTimer.schedule(timerTask, 1000L, i);
        if (this.LJI == null) {
            C1468290oJP c1468290oJP = new C1468290oJP(this);
            this.LJI = c1468290oJP;
            this.LJFF.schedule(c1468290oJP, 1000L, this.LJIIIIZZ);
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("network timer task scheduled, interval ");
        sbLIZ.append(this.LJIIIIZZ);
        TTVideoEngineLog.d("NetworkPortraitData", C2188811AlT.LIZIZ(sbLIZ));
    }
}
