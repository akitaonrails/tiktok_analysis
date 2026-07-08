package X;

import Y.ARunnableS7S2200000_34;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bdm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209521Bdm implements InterfaceC467610IVj {
    public final BPEAHandler LIZ;
    public final InterfaceC2210301Bf2 LIZIZ;
    public final String LIZJ;
    public final AtomicInteger LIZLLL = new AtomicInteger(0);
    public boolean LJ = false;
    public final C2209491Bdj LJFF = new C08UT<C2209481Bdi>() { // from class: X.1Bdj
        @Override // X.C08UT
        public final Object LIZ() {
            return new C2209481Bdi(this.LIZIZ.LIZIZ.getContext());
        }
    };

    @Override // X.InterfaceC467610IVj
    public final String LIZ(JSONObject jSONObject) {
        if (!this.LIZIZ.LLIFFJFJJ()) {
            return null;
        }
        String sessionId = this.LIZIZ.getSessionId();
        if (TextUtils.isEmpty(sessionId)) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("_");
        sbLIZ.append(this.LIZLLL.getAndIncrement());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C786410Ut5.LJJZZIII(this.LIZ, new ARunnableS7S2200000_34(this, sessionId, jSONObject, strLIZIZ, 0));
        return strLIZIZ;
    }

    public final void LIZIZ(JSONObject jSONObject) {
        Map<String, JSONObject> mapLJ;
        if (jSONObject == null) {
            return;
        }
        C2209481Bdi c2209481BdiLIZIZ = LIZIZ(new Object[0]);
        c2209481BdiLIZIZ.getClass();
        List listLIZ = C123600dW.LIZ(jSONObject);
        if (!listLIZ.isEmpty()) {
            ArrayList arrayList = new ArrayList(listLIZ.size());
            ArrayList arrayList2 = new ArrayList(listLIZ.size());
            JSONArray jSONArray = new JSONArray();
            if (!listLIZ.isEmpty()) {
                for (Object obj : listLIZ) {
                    C2209501Bdk c2209501Bdk = c2209481BdiLIZIZ.LIZIZ.LIZ.get(obj);
                    if (c2209501Bdk != null) {
                        arrayList.add(c2209501Bdk.LIZ);
                        jSONArray.put(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                try {
                    mapLJ = c2209481BdiLIZIZ.LIZ.LIZIZ(arrayList2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2209791BeD.LJIJJ().LIZJ(C2209481Bdi.LIZJ, "clearCommonParams getByIds failed", e);
                    mapLJ = C2097608Jq.LJ();
                }
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            if (!mapLJ.isEmpty()) {
                for (Map.Entry<String, JSONObject> entry : mapLJ.entrySet()) {
                    String key = entry.getKey();
                    JSONObject value = entry.getValue();
                    C1867260ygu c1867260ygu = c2209481BdiLIZIZ.LIZIZ;
                    c1867260ygu.getClass();
                    System.currentTimeMillis();
                    c1867260ygu.LIZ.put(key, new C2209501Bdk(key, value));
                    jSONArray.put(key);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Iterator<Object> it3 = new C1957407lc(new C1420705hF((JSONObject) it2.next(), null)).iterator();
                while (true) {
                    C2152008bu c2152008bu = (C2152008bu) it3;
                    if (c2152008bu.hasNext()) {
                        String str = (String) c2152008bu.next();
                        if (!Intrinsics.LJFF(str, "__applog_cp_ids")) {
                            try {
                                jSONObject.remove(str);
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                    }
                }
            }
            Iterator<Map.Entry<String, JSONObject>> it4 = mapLJ.entrySet().iterator();
            while (it4.hasNext()) {
                Iterator<Object> it5 = new C1957407lc(new C1420705hF(it4.next().getValue(), null)).iterator();
                while (true) {
                    C2152008bu c2152008bu2 = (C2152008bu) it5;
                    if (c2152008bu2.hasNext()) {
                        String str2 = (String) c2152008bu2.next();
                        if (!Intrinsics.LJFF(str2, "__applog_cp_ids")) {
                            try {
                                jSONObject.remove(str2);
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            }
                        }
                    }
                }
            }
            try {
                if (jSONArray.length() == 0) {
                    jSONObject.remove("__applog_cp_ids");
                } else {
                    jSONObject.put("__applog_cp_ids", jSONArray);
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1Bdj] */
    public C2209521Bdm(InterfaceC2210301Bf2 interfaceC2210301Bf2, Looper looper, String str) {
        this.LIZ = new BPEAHandler(looper);
        this.LIZIZ = interfaceC2210301Bf2;
        this.LIZJ = str;
        C2209541Bdo c2209541BdoLLJZ = interfaceC2210301Bf2.LLJZ();
        ((CopyOnWriteArrayList) c2209541BdoLLJZ.LIZ).add(new AbstractC2210771Bfn() { // from class: X.1Bdn
            @Override // X.AbstractC2210771Bfn
            public final void LIZ() {
                List<String> listLIZLLL;
                int iLIZ;
                C2209521Bdm c2209521Bdm = this.LIZ;
                if (c2209521Bdm.LJ) {
                    return;
                }
                String sessionId = c2209521Bdm.LIZIZ.getSessionId();
                if (TextUtils.isEmpty(sessionId)) {
                    return;
                }
                C2209481Bdi c2209481BdiLIZIZ = c2209521Bdm.LJFF.LIZIZ(new Object[0]);
                c2209481BdiLIZIZ.getClass();
                try {
                    listLIZLLL = c2209481BdiLIZIZ.LIZ.LIZLLL(sessionId);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    InterfaceC2209561Bdq interfaceC2209561BdqLJIJJ = C2209791BeD.LJIJJ();
                    List<String> list = C2209481Bdi.LIZJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("listIdsBySession failed for session=");
                    sbLIZ.append(sessionId);
                    interfaceC2209561BdqLJIJJ.LIZJ(list, C2188811AlT.LIZIZ(sbLIZ), e);
                    listLIZLLL = C13BV.INSTANCE;
                }
                try {
                    iLIZ = c2209481BdiLIZIZ.LIZ.LIZ(sessionId);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2209791BeD.LJIJJ().LIZJ(C2209481Bdi.LIZJ, "deleteBySession failed", e2);
                    iLIZ = 0;
                }
                try {
                    Iterator<String> it2 = listLIZLLL.iterator();
                    while (it2.hasNext()) {
                        c2209481BdiLIZIZ.LIZIZ.LIZ.remove(it2.next());
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C2209791BeD.LJIJJ().LIZJ(C2209481Bdi.LIZJ, "cache remove ids by session failed", e3);
                }
                C2209791BeD.LJIJJ().LJI(C2209481Bdi.LIZJ, "clearHistorySessionData currentSession=" + sessionId + ", historyIdsSize: " + listLIZLLL.size() + ", deleted=" + iLIZ, new Object[0]);
                c2209521Bdm.LJ = true;
            }

            @Override // X.AbstractC2210771Bfn
            public final String LIZIZ(C2209941BeS c2209941BeS, String str2) {
                if (c2209941BeS.LLJLILLLLZIIL && this.LIZ.LIZIZ.LLIFFJFJJ()) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        this.LIZ.LIZIZ(jSONObject);
                        str2 = C786410Ut5.J3(jSONObject);
                        InterfaceC2209561Bdq interfaceC2209561BdqLJIJJ = C2209791BeD.LJIJJ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ParamsExtract clearCommonParams(String) event:");
                        sbLIZ.append(c2209941BeS);
                        interfaceC2209561BdqLJIJJ.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
                        return str2;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LIZ.LIZIZ.LJJJJZ().LJI("params_extract_clear_exception", th, true);
                    }
                }
                return str2;
            }

            @Override // X.AbstractC2210771Bfn
            public final JSONObject LIZJ(C2209941BeS c2209941BeS, JSONObject jSONObject) {
                if (c2209941BeS.LLJLILLLLZIIL && this.LIZ.LIZIZ.LLIFFJFJJ() && jSONObject != null) {
                    try {
                        this.LIZ.LIZIZ(jSONObject);
                        InterfaceC2209561Bdq interfaceC2209561BdqLJIJJ = C2209791BeD.LJIJJ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ParamsExtract clearCommonParams(JSONObject) event:");
                        sbLIZ.append(c2209941BeS);
                        interfaceC2209561BdqLJIJJ.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
                        return jSONObject;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LIZ.LIZIZ.LJJJJZ().LJI("params_extract_clear_exception", th, true);
                    }
                }
                return jSONObject;
            }

            /* JADX WARN: Removed duplicated region for block: B:63:0x01e2  */
            @Override // X.AbstractC2210771Bfn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final org.json.JSONObject LIZLLL(X.C2209941BeS r16, org.json.JSONObject r17) {
                /*
                    Method dump skipped, instruction units count: 510
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2209531Bdn.LIZLLL(X.1BeS, org.json.JSONObject):org.json.JSONObject");
            }
        });
    }
}
