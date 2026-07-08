package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VVV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0VVV {
    public volatile boolean LIZ;
    public final LinkedBlockingDeque<C798790VVd> LIZIZ = new LinkedBlockingDeque<>();
    public final CopyOnWriteArrayList<InterfaceC798840VVi> LIZJ;

    public final void LJFF() {
        this.LIZ = true;
        C0V2E.LLJILJILJ = true;
        C0VV0 c0vv0 = C0VV0.LLILLJJLI;
        c0vv0.getClass();
        if (!C0VV0.LLILZ) {
            if (C798700VUu.LIZ()) {
                C0V2E c0v2e = C0V2E.LLJ;
                if (c0v2e == null) {
                    C0V2E.LJIJI(100L);
                    C0V2E.LLJILJILJ = true;
                    C0V2E.LLJILJIL = true;
                    C791390V2r.LJJIII.LJIIJJI();
                    C0V2K.LJI();
                    new C0V2E(false).LJIJJ();
                    C791560V3i.LIZLLL().getClass();
                } else {
                    c0v2e.LJIILIIL(100L, true, false);
                }
            }
            C791390V2r.LJJIII.LJ(c0vv0);
        }
        C0VV0.LLILZ = true;
        this.LIZIZ.addFirst(new C798790VVd());
    }

    public C0VVV() {
        new DecimalFormat("#.00");
        CopyOnWriteArrayList<InterfaceC798840VVi> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(new InterfaceC798840VVi() { // from class: X.0VVW
            @Override // X.InterfaceC798840VVi
            public final boolean LIZ(C798790VVd c798790VVd, List list, long j) {
                Object next;
                String string;
                long jUptimeMillis;
                long[] jArrLIZIZ;
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((Number) ((C798800VVe) next).LIZLLL.getValue()).longValue() >= 30) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C798800VVe c798800VVe = (C798800VVe) next;
                if (c798800VVe == null) {
                    return false;
                }
                C798820VVg c798820VVg = new C798820VVg();
                c798820VVg.LIZ = 1;
                c798820VVg.LIZIZ = c798800VVe.LIZJ;
                C798830VVh c798830VVh = new C798830VVh();
                long j2 = c798800VVe.LIZ;
                long j3 = c798800VVe.LIZIZ;
                try {
                    jUptimeMillis = SystemClock.uptimeMillis();
                    jArrLIZIZ = C0V2K.LIZIZ(j2, j3);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (jArrLIZIZ != null) {
                    LinkedList linkedList = new LinkedList();
                    C791250V2d.LJFF(jArrLIZIZ, linkedList, jUptimeMillis);
                    C791250V2d.LJI(5, linkedList);
                    StringBuilder sb = new StringBuilder();
                    C791250V2d.LJ(linkedList, sb);
                    string = sb.toString();
                } else {
                    string = "";
                }
                c798830VVh.LIZ = string;
                c798820VVg.LIZJ = C1697810uHb.LJIILJJIL(c798830VVh);
                c798790VVd.LIZ(c798820VVg);
                return true;
            }
        });
        copyOnWriteArrayList.add(new InterfaceC798840VVi() { // from class: X.0VVX
            @Override // X.InterfaceC798840VVi
            public final boolean LIZ(C798790VVd c798790VVd, List list, long j) {
                ArrayList<C798800VVe> arrayList = new ArrayList();
                for (Object obj : list) {
                    long jLongValue = ((Number) ((C798800VVe) obj).LIZLLL.getValue()).longValue();
                    if (5 <= jLongValue && jLongValue < 30) {
                        arrayList.add(obj);
                    }
                }
                if (!(!arrayList.isEmpty())) {
                    return false;
                }
                C798820VVg c798820VVg = new C798820VVg();
                c798820VVg.LIZ = 2;
                ArrayList arrayList2 = new ArrayList();
                for (C798800VVe c798800VVe : arrayList) {
                    C798830VVh c798830VVh = new C798830VVh();
                    c798830VVh.LIZ = "";
                    c798830VVh.LIZIZ = C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(((Number) c798800VVe.LIZLLL.getValue()).longValue() / j)}, 1));
                    arrayList2.add(c798830VVh);
                }
                c798820VVg.LIZJ = arrayList2;
                c798790VVd.LIZ(c798820VVg);
                return true;
            }
        });
        copyOnWriteArrayList.add(new InterfaceC798840VVi() { // from class: X.0VVf
            @Override // X.InterfaceC798840VVi
            public final boolean LIZ(C798790VVd c798790VVd, List list, long j) {
                C798820VVg c798820VVg = new C798820VVg();
                c798820VVg.LIZ = 3;
                c798790VVd.LIZ(c798820VVg);
                return true;
            }
        });
        this.LIZJ = copyOnWriteArrayList;
    }

    public static JSONArray LIZLLL(int i) {
        if (i == 0) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        try {
            C531650Kt9 it2 = C13LZ.LJIILJJIL(0, i).iterator();
            while (it2.LLILLL) {
                it2.nextInt();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dropType", 4);
                jSONArray.put(jSONObject);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return jSONArray;
    }

    public final JSONArray LJ(float f) {
        C798790VVd c798790VVdPollLast;
        boolean z;
        JSONArray jSONArray = new JSONArray();
        while (true) {
            try {
                c798790VVdPollLast = this.LIZIZ.pollLast();
                if (c798790VVdPollLast != null) {
                    if (c798790VVdPollLast.LIZ.size() != f) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    c798790VVdPollLast = null;
                    break;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (c798790VVdPollLast == null) {
            return LIZLLL((int) f);
        }
        for (C798820VVg c798820VVg : c798790VVdPollLast.LIZ) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dropType", c798820VVg.LIZ);
            jSONObject.put("isDoFrame", c798820VVg.LIZIZ);
            JSONArray jSONArray2 = new JSONArray();
            for (C798830VVh c798830VVh : c798820VVg.LIZJ) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("methodStack", c798830VVh.LIZ);
                jSONObject2.put("percent", c798830VVh.LIZIZ);
                jSONArray2.put(jSONObject2);
            }
            jSONObject.put("messageResult", jSONArray2);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
