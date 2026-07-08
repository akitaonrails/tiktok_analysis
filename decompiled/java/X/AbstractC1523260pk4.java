package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pk4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1523260pk4 {
    public final String LIZ;
    public PthreadTimer LIZIZ;
    public volatile AtomicInteger LIZJ = new AtomicInteger(EnumC620210OUh.INITIAL_TYPE.getValue());
    public final C620150OUb LIZLLL = new C620150OUb();
    public final C1523290pk7 LJ = new C1523290pk7();

    public abstract Map<String, C1523270pk5> LIZIZ();

    public abstract long LIZJ();

    public final boolean LIZLLL() {
        return this.LIZJ.get() == EnumC620210OUh.RECORDING_TYPE.getValue();
    }

    public void LJ() {
        if (C262080AOw.LIZIZ && this.LIZJ.compareAndSet(EnumC620210OUh.INITIAL_TYPE.getValue(), EnumC620210OUh.RECORDING_TYPE.getValue())) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append(": onEnterPage");
            C1720106oR.LJI("InboxPageQualityTracking", C2188811AlT.LIZIZ(sbLIZ));
            PthreadTimer pthreadTimer = new PthreadTimer("AbsInboxPageQualityTracking");
            pthreadTimer.schedule(new C1554350qYD(this, 0), LIZJ());
            this.LIZIZ = pthreadTimer;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LIZ);
            sbLIZ2.append(": startTimer");
            C1720106oR.LJI("InboxPageQualityTracking", C2188811AlT.LIZIZ(sbLIZ2));
            if (LIZLLL()) {
                this.LIZLLL.LIZLLL();
                Iterator<Map.Entry<String, C1523270pk5>> it2 = LIZIZ().entrySet().iterator();
                while (it2.hasNext()) {
                    C1523270pk5 value = it2.next().getValue();
                    synchronized (value) {
                        value.LIZLLL.LIZLLL();
                    }
                }
            }
        }
    }

    public final void LJI() {
        long jLIZ;
        if (this.LIZJ.compareAndSet(EnumC620210OUh.RECORDING_TYPE.getValue(), EnumC620210OUh.RECORD_FINISH_TYPE.getValue())) {
            String str = this.LIZ;
            C2241008qG c2241008qG = new C2241008qG();
            Iterator<Map.Entry<String, C1523270pk5>> it2 = LIZIZ().entrySet().iterator();
            while (it2.hasNext()) {
                C1523270pk5 value = it2.next().getValue();
                if (value != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(value.LIZ);
                    sbLIZ.append("_state");
                    c2241008qG.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), value.LIZ().getValue());
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(value.LIZ);
                    sbLIZ2.append("_cost");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    synchronized (value) {
                        jLIZ = value.LIZLLL.LIZ();
                    }
                    c2241008qG.LIZJ(Long.valueOf(jLIZ), strLIZIZ);
                }
            }
            c2241008qG.LIZJ(Long.valueOf(this.LIZLLL.LIZ()), "total_cost");
            c2241008qG.LIZIZ(Integer.valueOf(this.LJ.LIZ), "trigger_type");
            Iterator<Map.Entry<String, C1523270pk5>> it3 = LIZIZ().entrySet().iterator();
            float f = 0.0f;
            float f2 = 0.0f;
            while (it3.hasNext()) {
                if (C1889760zHC.LIZ.contains(it3.next().getValue().LIZ())) {
                    f2 += 1.0f;
                }
                f += 1.0f;
            }
            c2241008qG.LIZ.put("completeness", Float.valueOf(f != 0.0f ? f2 / f : 0.0f));
            for (Map.Entry<String, String> entry : LIZ().entrySet()) {
                c2241008qG.LIZLLL(entry.getKey(), entry.getValue());
            }
            JSONObject jSONObjectLJ = c2241008qG.LJ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("reportTrackData: ");
            sbLIZ3.append(jSONObjectLJ != null ? C786410Ut5.J3(jSONObjectLJ) : null);
            C2188811AlT.LIZIZ(sbLIZ3);
            C20684815ws.LJIJ(str, jSONObjectLJ);
            LJII();
        }
    }

    public final void LJII() {
        this.LIZJ.set(EnumC620210OUh.INITIAL_TYPE.getValue());
        C620150OUb c620150OUb = this.LIZLLL;
        c620150OUb.LIZ = 0L;
        c620150OUb.LIZIZ = 0L;
        this.LJ.LIZ = -1;
        Iterator<Map.Entry<String, C1523270pk5>> it2 = LIZIZ().entrySet().iterator();
        while (it2.hasNext()) {
            C1523270pk5 value = it2.next().getValue();
            synchronized (value) {
                value.LIZJ.LIZ = EnumC1889770zHD.UNKNOWN;
                C620150OUb c620150OUb2 = value.LIZLLL;
                c620150OUb2.LIZ = 0L;
                c620150OUb2.LIZIZ = 0L;
            }
        }
        LJIIIZ();
    }

    public final void LJIIIZ() {
        PthreadTimer pthreadTimer = this.LIZIZ;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
            this.LIZIZ = null;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append(": stopTimer");
            C1720106oR.LJI("InboxPageQualityTracking", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public Map<String, String> LIZ() {
        return C2097608Jq.LJ();
    }

    public final void LJFF() {
        if (LIZLLL()) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append(": onExitPage");
            C1720106oR.LJI("InboxPageQualityTracking", C2188811AlT.LIZIZ(sbLIZ));
            LJIIIZ();
            LJIIIIZZ(2);
            LJI();
        }
    }

    public AbstractC1523260pk4(String str) {
        this.LIZ = str;
    }

    public final void LJIIIIZZ(int i) {
        if (LIZLLL()) {
            this.LIZLLL.LIZJ();
            this.LJ.LIZ = i;
            Iterator<Map.Entry<String, C1523270pk5>> it2 = LIZIZ().entrySet().iterator();
            while (it2.hasNext()) {
                C1523270pk5 value = it2.next().getValue();
                synchronized (value) {
                    value.LIZLLL.LIZJ();
                }
            }
        }
    }

    public final void LJIIJ(String str, EnumC1889770zHD enumC1889770zHD) {
        C1523270pk5 c1523270pk5;
        if (LIZLLL() && (c1523270pk5 = LIZIZ().get(str)) != null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append(": updateModuleRecord: ");
            sbLIZ.append(str);
            sbLIZ.append(", state:");
            sbLIZ.append(enumC1889770zHD.getValue());
            sbLIZ.append(", needChange：");
            sbLIZ.append(c1523270pk5.LIZIZ());
            C1720106oR.LJI("InboxPageQualityTracking", C2188811AlT.LIZIZ(sbLIZ));
            if (enumC1889770zHD != EnumC1889770zHD.UNKNOWN && c1523270pk5.LIZIZ()) {
                synchronized (c1523270pk5) {
                    c1523270pk5.LIZJ.LIZ = enumC1889770zHD;
                }
                c1523270pk5.LIZJ();
                Iterator<Map.Entry<String, C1523270pk5>> it2 = LIZIZ().entrySet().iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    if (C1889760zHC.LIZ.contains(it2.next().getValue().LIZ())) {
                        i2++;
                    }
                }
                if (i2 == LIZIZ().size() && LIZLLL()) {
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.LIZ);
                    sbLIZ2.append(": onLoadFinish");
                    C1720106oR.LJI("InboxPageQualityTracking", C2188811AlT.LIZIZ(sbLIZ2));
                    LJIIIZ();
                    LJIIIIZZ(0);
                    LJI();
                }
            }
        }
    }
}
