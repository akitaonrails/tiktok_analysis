package X;

import Y.ARunnableS123S0100000_23;
import android.content.Context;
import android.os.Debug;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0oHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467310oHp {
    public static final String[] LJIIJJI = {"KSThread", "XYThread", "vdp:vidtask:m"};
    public static final String[] LJIIL = {"MediaLoad", "com.video.mdl.network_manager", "com.video.mdl.network_session"};
    public static ArrayList<String> LJIILIIL;
    public Context LIZ;
    public int LIZIZ = 60;
    public int LIZJ;
    public long LIZLLL;
    public long LJ;
    public C1467430oI1 LJFF;
    public C1467320oHq LJI;
    public C1467300oHo LJII;
    public C1467510oI9 LJIIIIZZ;
    public ArrayList<C1467740oIW> LJIIIZ;
    public C1468090oJ5 LJIIJ;

    public final void LIZ() {
        C1467320oHq c1467320oHq;
        C1467320oHq c1467320oHq2;
        C1468090oJ5 c1468090oJ5;
        int i = C2187451AjH.LIZ;
        TTVideoEngineLog.d("PlayerMetrics", "start collectMetrics");
        C1467740oIW c1467740oIW = new C1467740oIW();
        if ((this.LIZJ & 1) > 0 && (c1468090oJ5 = this.LJIIJ) != null) {
            EngineThreadPool.addExecuteTask(new ARunnableS123S0100000_23(c1468090oJ5, 192));
        }
        if ((this.LIZJ & 2) > 0 && (c1467320oHq2 = this.LJI) != null && c1467320oHq2.LIZJ > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iLIZ = C1468330oJT.LIZ(this.LIZ);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            C1467320oHq c1467320oHq3 = this.LJI;
            int i2 = c1467320oHq3.LIZ;
            if (i2 > 0) {
                c1467320oHq3.LIZIZ = iLIZ - i2;
            } else {
                c1467320oHq3.LIZIZ = 0;
            }
            c1467320oHq3.LIZ = iLIZ;
            c1467740oIW.LIZ = iLIZ;
            long j = jCurrentTimeMillis2 - c1467320oHq3.LIZJ;
            c1467740oIW.LIZIZ = j;
            c1467320oHq3.LIZLLL = j;
            c1467320oHq3.LIZJ = jCurrentTimeMillis2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("METRICS_ABILITY_POWER ");
            sbLIZ.append(this.LJI.LIZ);
            sbLIZ.append(" costTime: ");
            sbLIZ.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
            sbLIZ.append(" powertime: ");
            sbLIZ.append(c1467740oIW.LIZIZ);
            TTVideoEngineLog.d("PlayerMetrics", C2188811AlT.LIZIZ(sbLIZ));
        }
        if ((this.LIZJ & 16) > 0) {
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            int totalPss = memoryInfo.getTotalPss() / 1024;
            long jCurrentTimeMillis4 = System.currentTimeMillis();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("METRICS_ABILITY_MEMORY ");
            sbLIZ2.append(totalPss);
            sbLIZ2.append(" costTime: ");
            sbLIZ2.append(jCurrentTimeMillis4 - jCurrentTimeMillis3);
            TTVideoEngineLog.d("PlayerMetrics", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if ((this.LIZJ & 4) > 0 && (c1467320oHq = this.LJI) != null) {
            if (c1467320oHq.LJ > 0) {
                long jCurrentTimeMillis5 = System.currentTimeMillis();
                c1467320oHq.LJFF += jCurrentTimeMillis5 - c1467320oHq.LJ;
                c1467320oHq.LJ = jCurrentTimeMillis5;
            }
            C1467320oHq c1467320oHq4 = this.LJI;
            if (c1467320oHq4.LJI > 0) {
                long jCurrentTimeMillis6 = System.currentTimeMillis();
                c1467320oHq4.LJII += jCurrentTimeMillis6 - c1467320oHq4.LJI;
                c1467320oHq4.LJI = jCurrentTimeMillis6;
            }
        }
        if ((this.LIZJ & 256) > 0) {
            synchronized (this) {
                try {
                    ArrayList<C1467740oIW> arrayList = this.LJIIIZ;
                    if (arrayList != null) {
                        arrayList.add(c1467740oIW);
                    }
                    LIZIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LIZIZ() {
        ArrayList<C1467740oIW> arrayList;
        ArrayList<C1467740oIW> arrayList2 = this.LJIIIZ;
        if (arrayList2 == null || arrayList2.isEmpty() || this.LJIIIZ.size() <= 5) {
            return;
        }
        C1467430oI1 c1467430oI1 = this.LJFF;
        if (c1467430oI1 != null && (arrayList = this.LJIIIZ) != null) {
            c1467430oI1.LIZ = 0;
            c1467430oI1.LIZIZ = 0;
            c1467430oI1.LIZJ = 0;
            int i = 0;
            int iAbs = 0;
            for (C1467740oIW c1467740oIW : arrayList) {
                if (i > 0) {
                    iAbs = Math.abs(i - c1467740oIW.LIZ);
                }
                C1467430oI1 c1467430oI12 = this.LJFF;
                if (iAbs > c1467430oI12.LIZ) {
                    c1467430oI12.LIZ = iAbs;
                }
                if (iAbs > 1) {
                    c1467430oI12.LIZJ++;
                }
                i = c1467740oIW.LIZ;
            }
            if (this.LJIIIZ.size() > 1) {
                C1467740oIW c1467740oIW2 = (C1467740oIW) ListProtector.get(this.LJIIIZ, 0);
                ArrayList<C1467740oIW> arrayList3 = this.LJIIIZ;
                this.LJFF.LIZIZ = c1467740oIW2.LIZ - ((C1467740oIW) ListProtector.get(arrayList3, arrayList3.size() - 1)).LIZ;
            }
        }
        int i2 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("PlayerMetrics", "startDiagnose");
        ListProtector.remove(this.LJIIIZ, 0);
    }

    public final Map<String, Object> LIZLLL() {
        HashMap map = new HashMap();
        synchronized (this) {
            try {
                C1467430oI1 c1467430oI1 = this.LJFF;
                if (c1467430oI1 != null && c1467430oI1.LIZIZ > 0) {
                    map.putAll(c1467430oI1.LIZ());
                }
                C1467320oHq c1467320oHq = this.LJI;
                if (c1467320oHq != null) {
                    Map mapLIZ = c1467320oHq.LIZ();
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getMetricsLog: ");
                    sbLIZ.append(mapLIZ);
                    TTVideoEngineLog.d("PlayerMetrics", C2188811AlT.LIZIZ(sbLIZ));
                    if (((HashMap) mapLIZ).size() > 0) {
                        map.putAll(mapLIZ);
                    }
                }
                C1468090oJ5 c1468090oJ5 = this.LJIIJ;
                if (c1468090oJ5 != null) {
                    HashMap map2 = new HashMap(c1468090oJ5.LIZ);
                    if (map2.size() > 0) {
                        map.putAll(map2);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return map;
    }

    public static C1467310oHp LIZJ() {
        return C1467660oIO.LIZ;
    }
}
