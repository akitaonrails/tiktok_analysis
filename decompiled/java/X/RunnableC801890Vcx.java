package X;

import Y.ARunnableS113S0100000_13;
import android.os.Process;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.monitor.k;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import dl3.h;
import im3.b;
import im3.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vcx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC801890Vcx implements Runnable {
    public static final RunnableC801890Vcx LLILZIL = new RunnableC801890Vcx();
    public C1189304l1 LL;
    public final LinkedList<C801810Vcp> LLILLJJLI = new LinkedList<>();
    public final LinkedList<C801810Vcp> LLILLL = new LinkedList<>();
    public final ConcurrentHashMap<String, Integer> LLILZ = new ConcurrentHashMap<>();

    public final void LIZ() {
        ArrayList arrayList;
        if (!this.LL.LIZ) {
            synchronized (this.LLILLJJLI) {
                try {
                    this.LLILLJJLI.clear();
                } finally {
                }
            }
            synchronized (this.LLILLL) {
                try {
                    this.LLILLL.clear();
                } finally {
                }
            }
            return;
        }
        synchronized (this.LLILLJJLI) {
            try {
                if (this.LLILLJJLI.size() > 0) {
                    arrayList = new ArrayList();
                    for (C801810Vcp c801810Vcp : this.LLILLJJLI) {
                        C1189304l1 c1189304l1 = this.LL;
                        String str = c801810Vcp.LIZ;
                        Set<String> set = c1189304l1.LIZIZ;
                        if (set != null && set.contains(str)) {
                            if (C802300Vdc.LIZJ) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(c801810Vcp.LIZ);
                                sbLIZ.append(" message:");
                                sbLIZ.append(c801810Vcp.LIZLLL);
                                sbLIZ.append(" is sample");
                                C2188811AlT.LIZIZ(sbLIZ);
                                C802300Vdc.LIZ();
                            }
                            arrayList.add(c801810Vcp);
                        } else if (C802300Vdc.LIZJ) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(c801810Vcp.LIZ);
                            sbLIZ2.append(" message:");
                            sbLIZ2.append(c801810Vcp.LIZLLL);
                            sbLIZ2.append(" is not sample");
                            C2188811AlT.LIZIZ(sbLIZ2);
                            C802300Vdc.LIZ();
                        }
                    }
                    this.LLILLJJLI.clear();
                } else {
                    arrayList = null;
                }
            } finally {
            }
        }
        if (arrayList != null) {
            synchronized (this.LLILLL) {
                try {
                    this.LLILLL.addAll(arrayList);
                } finally {
                }
            }
        }
        if (C802300Vdc.LIZJ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("report exception size:");
            sbLIZ3.append(this.LLILLL.size());
            C2188811AlT.LIZIZ(sbLIZ3);
            C802300Vdc.LIZ();
        }
    }

    public final void LIZJ() {
        if (C802300Vdc.LIZJ) {
            C802300Vdc.LIZ();
        }
        synchronized (this.LLILLL) {
            try {
                if (this.LLILLL.isEmpty()) {
                    return;
                }
                ArrayList<C801810Vcp> arrayList = new ArrayList();
                int i = 0;
                while (!this.LLILLL.isEmpty() && i <= 30) {
                    i++;
                    arrayList.add(this.LLILLL.remove(0));
                }
                if (arrayList.size() == 0) {
                    return;
                }
                Header headerLIZIZ = Header.LIZIZ(k.LIZ, System.currentTimeMillis(), CrashType.ENSURE, Process.myPid());
                try {
                    HashSet hashSet = C802300Vdc.LIZJ ? new HashSet() : null;
                    JSONArray jSONArray = new JSONArray();
                    for (C801810Vcp c801810Vcp : arrayList) {
                        JSONObject jSONObjectLIZ = c801810Vcp.LIZ(headerLIZIZ);
                        if (hashSet != null) {
                            hashSet.add(c801810Vcp.LIZ);
                        }
                        jSONArray.put(jSONObjectLIZ);
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", jSONArray);
                    JSONObject jSONObject2 = headerLIZIZ.LIZ;
                    jSONObject.put("header", jSONObject2);
                    if (C802300Vdc.LIZJ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("start upload:");
                        sbLIZ.append(hashSet);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C802300Vdc.LIZ();
                    }
                    String strLIZLLL = o.LIZLLL(h.LJIIJJI.LJ, jSONObject2);
                    boolean zLJI = b.LJI(strLIZLLL, jSONObject);
                    if (C802300Vdc.LIZJ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("end upload:");
                        sbLIZ2.append(strLIZLLL);
                        sbLIZ2.append(" ");
                        sbLIZ2.append(zLJI);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C802300Vdc.LIZ();
                    }
                } catch (Throwable th) {
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("BizExceptionManager@8524.run");
        try {
            LIZ();
            LIZJ();
            C0VXF.postDelayed(this, 30000L);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BizExceptionManager@8524.run");
    }

    public final void LIZIZ(String str, Throwable th, String str2, Map<String, String> map, Map<String, String> map2, boolean z) {
        if (!z) {
            Integer num = this.LLILZ.get(str);
            if (num == null) {
                this.LLILZ.put(str, 1);
            } else if (num.intValue() > 10) {
                return;
            } else {
                this.LLILZ.put(str, Integer.valueOf(num.intValue() + 1));
            }
        }
        C1189304l1 c1189304l1 = this.LL;
        if (c1189304l1 == null) {
            synchronized (this.LLILLJJLI) {
                try {
                    if (this.LLILLJJLI.size() >= 90) {
                        this.LLILLJJLI.removeFirst();
                    }
                    this.LLILLJJLI.add(new C801810Vcp(str, th, str2, C786410Ut5.u3().getName(), map, map2));
                } finally {
                }
            }
            if (C802300Vdc.LIZJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("config is not fetch:logType:");
                sbLIZ.append(str);
                sbLIZ.append(" message:");
                sbLIZ.append(str2);
                C2188811AlT.LIZIZ(sbLIZ);
                C802300Vdc.LIZ();
                return;
            }
            return;
        }
        if (!c1189304l1.LIZ) {
            if (C802300Vdc.LIZJ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("enable_upload is not enable:");
                sbLIZ2.append(str);
                sbLIZ2.append(" message:");
                sbLIZ2.append(str2);
                C2188811AlT.LIZIZ(sbLIZ2);
                C802300Vdc.LIZ();
                return;
            }
            return;
        }
        Set<String> set = c1189304l1.LIZIZ;
        if (set != null && set.contains(str)) {
            if (C802300Vdc.LIZJ) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append(" message:");
                sbLIZ3.append(str2);
                sbLIZ3.append(" is sample");
                C2188811AlT.LIZIZ(sbLIZ3);
                C802300Vdc.LIZ();
            }
            LIZ();
            synchronized (this.LLILLL) {
                try {
                    this.LLILLL.add(new C801810Vcp(str, th, str2, C786410Ut5.u3().getName(), map, map2));
                } finally {
                }
            }
            synchronized (this.LLILLL) {
                try {
                    if (this.LLILLL.size() >= 30) {
                        C0VXF.post(new ARunnableS113S0100000_13((Object) this, 205));
                    }
                } finally {
                }
            }
            return;
        }
        if (C802300Vdc.LIZJ) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str);
            sbLIZ4.append(" message:");
            sbLIZ4.append(str2);
            sbLIZ4.append(" is not sample");
            C2188811AlT.LIZIZ(sbLIZ4);
            C802300Vdc.LIZ();
        }
    }
}
