package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oJA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468140oJA {
    public C1468180oJE LIZ;
    public final C1468230oJJ LIZIZ;
    public long LJ;
    public ArrayList<String> LJFF = new ArrayList<>();
    public long LJI = -2147483648L;
    public int LJII = 0;
    public HashMap LIZJ = new HashMap();
    public C1468150oJB LIZLLL = new C1468150oJB();

    public final long LIZ() {
        if (this.LIZLLL.LJFF > 0) {
            return 0L;
        }
        synchronized (this.LIZJ) {
            try {
                if (!this.LIZJ.containsKey("block_net")) {
                    return -1L;
                }
                return ((Long) this.LIZJ.get("block_net")).longValue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(String str) {
        InterfaceC1468020oIy interfaceC1468020oIy;
        C1468150oJB c1468150oJB = this.LIZLLL;
        if (c1468150oJB.LJFF > 0 && !c1468150oJB.LIZ.isEmpty()) {
            this.LIZLLL.LJI = System.currentTimeMillis();
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d("VideoEventOneEvent", "movieStallEnd");
            C1468150oJB c1468150oJB2 = this.LIZLLL;
            long j = c1468150oJB2.LJI - c1468150oJB2.LJFF;
            c1468150oJB2.LIZIZ = j;
            if (j > 0) {
                this.LJ += j;
            }
            c1468150oJB2.LIZJ = str;
            C1468230oJJ c1468230oJJ = this.LIZIZ;
            if (c1468230oJJ != null) {
                c1468150oJB2.LJII = c1468230oJJ.LIZIZ();
            }
            C1468150oJB c1468150oJB3 = this.LIZLLL;
            if (c1468150oJB3.LJII == 0) {
                c1468150oJB3.LJII = c1468150oJB3.LJFF;
            }
            C1468180oJE c1468180oJE = this.LIZ;
            if (c1468180oJE != null && (interfaceC1468020oIy = c1468180oJE.LIZ) != null) {
                c1468150oJB3.LJJIIZI = c1468180oJE.LJJJ;
                c1468150oJB3.LJJIJIIJI = c1468180oJE.LJJJI;
                c1468150oJB3.LJJIJL = c1468180oJE.LJJJZ;
                Map<String, Long> mapLIZ = ((C1467030oHN) interfaceC1468020oIy).LIZ();
                if (mapLIZ != null) {
                    HashMap map = (HashMap) mapLIZ;
                    this.LIZLLL.LJIIL = C795730VJj.LJIILL((Long) map.get("vlen"));
                    this.LIZLLL.LJIILIIL = C795730VJj.LJIILL((Long) map.get("alen"));
                    this.LIZLLL.LJIIZILJ = C795730VJj.LJIILL((Long) map.get("vDecLen"));
                    this.LIZLLL.LJIJJLI = C795730VJj.LJIILL((Long) map.get("vBaseLen"));
                    this.LIZLLL.LJIJI = C795730VJj.LJIILL((Long) map.get("aDecLen"));
                    this.LIZLLL.LJJ = C795730VJj.LJIILL((Long) map.get("aBaseLen"));
                    this.LIZLLL.LJJIIJZLJL = C795730VJj.LJIILL((Long) map.get("avGap"));
                }
            }
            HashMap map2 = new HashMap();
            map2.put("p", Integer.valueOf(this.LIZLLL.LJIIIIZZ));
            map2.put("t", Long.valueOf(this.LIZLLL.LJI));
            map2.put("c", Long.valueOf(this.LIZLLL.LIZIZ));
            C1468180oJE c1468180oJE2 = this.LIZ;
            if (c1468180oJE2 != null && "dash".equals(c1468180oJE2.LJJIJLIJ)) {
                C1468150oJB c1468150oJB4 = this.LIZLLL;
                long j2 = c1468150oJB4.LJIIJ;
                if (j2 > -1 && c1468150oJB4.LJIIJJI > -1) {
                    map2.put("vb", Long.valueOf(j2));
                    map2.put("ab", Long.valueOf(this.LIZLLL.LJIIJJI));
                }
            }
            this.LJFF.add(C786410Ut5.J3(new JSONObject(map2)));
            this.LIZ.LJIILJJIL();
            C1471660oOq.LIZJ("VideoEventOneEvent", "report async");
            final C1468180oJE c1468180oJE3 = this.LIZ;
            final C1468150oJB c1468150oJB5 = this.LIZLLL;
            EngineThreadPool.addExecuteTask(new Runnable(this, c1468180oJE3, c1468150oJB5) { // from class: X.0oJF
                public final C1468140oJA LL;
                public final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
                public final C1468180oJE LLILLL;
                public final C1468150oJB LLILZ;

                /* JADX WARN: Removed duplicated region for block: B:49:0x053b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 1412
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1468190oJF.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("VideoEventOneEvent$AsyncGetLogDataRunnable@f9d5.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("VideoEventOneEvent$AsyncGetLogDataRunnable@f9d5.run");
                }

                {
                    this.LL = this;
                    this.LLILLL = c1468180oJE3;
                    this.LLILZ = c1468150oJB5;
                }
            });
            C1468180oJE c1468180oJE4 = this.LIZ;
            if (c1468180oJE4 != null && c1468180oJE4.LIZ != null) {
                HashMap map3 = new HashMap();
                map3.put("cost_time", Long.valueOf(this.LIZLLL.LIZIZ));
                map3.put("exit_type", this.LIZLLL.LIZJ);
                JSONObject jSONObjectLJIIIIZZ = this.LIZ.LJIIIIZZ();
                if (jSONObjectLJIIIIZZ != null) {
                    if (!jSONObjectLJIIIIZZ.isNull("video")) {
                        try {
                            C1468180oJE c1468180oJE5 = this.LIZ;
                            JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObjectLJIIIIZZ, "video");
                            c1468180oJE5.getClass();
                            C1468310oJR c1468310oJR = new C1468310oJR();
                            c1468310oJR.LIZ(jSONObject);
                            map3.put("cur_url", c1468310oJR.LIZJ);
                            map3.put("cur_host", UriProtector.parse(c1468310oJR.LIZJ).getHost());
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            int i2 = C2187451AjH.LIZ;
                            TTVideoEngineLog.d(e);
                        }
                    }
                } else {
                    map3.put("cur_url", this.LIZ.LJIJ);
                    map3.put("cur_ip", this.LIZ.LJIJI);
                    try {
                        map3.put("cur_host", UriProtector.parse(this.LIZ.LJIJ).getHost());
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("_triggerBufferEndCb:");
                        sbLIZ.append(e2.toString());
                        C1471660oOq.LIZJ("VideoEventOneEvent", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                ((C1467030oHN) this.LIZ.LIZ).LJFF(1, map3);
            }
            this.LIZLLL = new C1468150oJB();
            return;
        }
        int i4 = C2187451AjH.LIZ;
        TTVideoEngineLog.d("VideoEventOneEvent", "movieStallEnd without movieStalled, return.");
        C1468150oJB c1468150oJB6 = this.LIZLLL;
        c1468150oJB6.LIZLLL = -2147483648L;
        c1468150oJB6.LJ = -1;
    }

    public C1468140oJA(C1468180oJE c1468180oJE, C1468230oJJ c1468230oJJ) {
        this.LIZ = c1468180oJE;
        this.LIZIZ = c1468230oJJ;
    }
}
