package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793810VBz implements InterfaceC794060VCy {
    public static final AtomicInteger LJ = new AtomicInteger(0);
    public long LIZJ;
    public final AtomicLong LIZ = new AtomicLong(0);
    public final ConcurrentLinkedQueue<C793820VCa> LIZIZ = new ConcurrentLinkedQueue<>();
    public int LIZLLL = 0;

    public final void LIZ() {
        C0VC0 c0vc0 = C793900VCi.LIZ;
        synchronized (c0vc0) {
            c0vc0.LIZIZ();
            File fileLIZLLL = C0VC2.LIZLLL();
            if (fileLIZLLL != null) {
                File[] fileArrListFiles = fileLIZLLL.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    for (File file : fileArrListFiles) {
                        C2404609bY.LIZ(file);
                    }
                    c0vc0.LIZLLL.clear();
                    SharedPreferences.Editor editorEdit = c0vc0.LIZ.edit();
                    editorEdit.clear();
                    editorEdit.commit();
                    SharedPreferences.Editor editorEdit2 = c0vc0.LIZIZ.edit();
                    editorEdit2.clear();
                    editorEdit2.commit();
                }
            }
        }
        this.LIZIZ.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0181, code lost:
    
        r2 = X.C793920VCk.LIZ.LJFF(r4.LIZLLL, r4.LIZ);
        X.C0VCV.LJFF = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0191, code lost:
    
        if (r2 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0193, code lost:
    
        r15.LIZIZ.remove(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019a, code lost:
    
        r1 = r4.LIZIZ + 1;
        r4.LIZIZ = r1;
        X.C793870VCf.LIZ.getClass();
        r4.LIZJ = X.C0VC9.LIZ(r1) + java.lang.System.currentTimeMillis();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C793810VBz.LJ():void");
    }

    public static void LIZJ(List list) {
        for (C0VCA c0vca : (ArrayList) list) {
            try {
                File file = c0vca.LIZJ;
                if (file != null) {
                    C2404609bY.LIZ(file);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("delete LogFile's source File failed. logFile=");
                sbLIZ.append(c0vca.LIZJ);
                C2188811AlT.LIZIZ(sbLIZ);
                InterfaceC792920V8o interfaceC792920V8o = C0VCY.LIZ;
                if (interfaceC792920V8o != null) {
                    interfaceC792920V8o.w();
                }
            }
        }
    }

    public static Map LIZLLL(List list) {
        HashMap map = new HashMap();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            for (C0VCP c0vcp : ((C0VCA) it2.next()).LIZLLL) {
                long j = c0vcp.LIZ;
                long j2 = c0vcp.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(j);
                sbLIZ.append("_");
                sbLIZ.append(j2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                List arrayList = (List) map.get(strLIZIZ);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(strLIZIZ, arrayList);
                }
                arrayList.add(c0vcp);
            }
        }
        return map;
    }

    @Override // X.InterfaceC794060VCy
    public final void LIZIZ(long j) {
        if (j - this.LIZJ >= 90000) {
            try {
                LJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C0VCY.LIZIZ("onTimeEvent", th);
            }
            this.LIZJ = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.util.List<X.C0VCA> r15) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C793810VBz.LJFF(java.util.List):void");
    }

    public final Pair LJI(List list) {
        boolean z;
        try {
            Map mapLIZLLL = LIZLLL(list);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayLJII = LJII(arrayList, mapLIZLLL);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("list", jSONArrayLJII);
            if (C0VC5.LIZJ()) {
                if (this.LIZLLL == 0) {
                    C793880VCg.LIZ.getClass();
                    this.LIZLLL = (int) 1048576;
                }
                int i = C0VC5.LJ.LIZJ;
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    i = this.LIZLLL;
                }
                C08SI c08si = new C08SI(new C793720VBq(i));
                c08si.LJI(jSONObject);
                if (!z) {
                    this.LIZLLL = (int) (((double) c08si.LIZ.LLILLJJLI) * 1.1d);
                }
                C793720VBq c793720VBq = c08si.LIZ;
                return new Pair(arrayList, new C793730VBr(c793720VBq.LL, c793720VBq.LLILLJJLI));
            }
            return new Pair(arrayList, new C793730VBr(C0VCR.LIZ(C786410Ut5.J3(jSONObject))));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0VCY.LIZIZ("LogSender serialize failed.", th);
            return null;
        }
    }

    public static JSONArray LJII(List list, Map map) {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            entry.getKey();
            List list2 = (List) entry.getValue();
            if (!C08GN.LIZIZ(list2)) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < list2.size(); i++) {
                    C0VCP c0vcp = (C0VCP) ListProtector.get(list2, i);
                    try {
                        JSONObject jSONObject = new JSONObject(new String(c0vcp.LIZJ));
                        if (C793930VCl.LIZ.LIZIZ((int) c0vcp.LIZIZ, jSONObject)) {
                            String strOptString = jSONObject.optString("store_region");
                            if (!TextUtils.isEmpty(strOptString)) {
                                ArrayList arrayList = (ArrayList) list;
                                if (!arrayList.contains(strOptString)) {
                                    arrayList.add(strOptString);
                                }
                            }
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("_debug_self");
                            if (jSONObjectOptJSONObject == null) {
                                try {
                                    jSONObjectOptJSONObject = new JSONObject();
                                    jSONObject.put("_debug_self", jSONObjectOptJSONObject);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            jSONObjectOptJSONObject.put("debug_sender_number", LJ.getAndIncrement());
                            jSONArray2.put(jSONObject);
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C0VCY.LIZIZ("toJSON", e2);
                    }
                }
                JSONObject jSONObjectLIZIZ = C0VC4.LIZJ().LIZIZ(((C0VCP) ListProtector.get(list2, 0)).LIZIZ, ((C0VCP) ListProtector.get(list2, 0)).LIZ);
                if (jSONObjectLIZIZ != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("data", jSONArray2);
                        jSONObject2.put("header", jSONObjectLIZIZ);
                        jSONArray.put(jSONObject2);
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        C0VCY.LIZIZ("toJSON", e3);
                    }
                }
            }
        }
        return jSONArray;
    }
}
