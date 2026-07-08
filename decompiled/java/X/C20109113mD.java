package X;

import Y.AObjectS404S0100000_30;
import Y.ARunnableS99S0200000_30;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AwS644S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13mD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20109113mD implements InterfaceC20110713mT {
    public final C603850NmJ<String, C20108713m9> LIZ;
    public final LinkedHashSet<String> LIZIZ = new LinkedHashSet<>();
    public final InterfaceC20109713mJ LIZJ;
    public final InterfaceC2373909Rx LIZLLL;
    public final Executor LJ;

    @Override // X.InterfaceC20110713mT
    public final void LIZLLL() {
        C603850NmJ<String, C20108713m9> c603850NmJ = this.LIZ;
        synchronized (c603850NmJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Start trimming, entry count: ");
            sbLIZ.append(c603850NmJ.LIZ.size());
            sbLIZ.append('.');
            C20111613mc.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            Iterator<Map.Entry<String, C20108713m9>> it2 = c603850NmJ.LIZ.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, C20108713m9> next = it2.next();
                if (c603850NmJ.LJFF.invoke(next.getKey(), next.getValue()).booleanValue()) {
                    it2.remove();
                    c603850NmJ.LJI.invoke(next.getKey(), next.getValue());
                    int i = c603850NmJ.LIZIZ;
                    next.getKey();
                    next.getValue();
                    c603850NmJ.LIZIZ = i - 1;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Entry removed: ");
                    sbLIZ2.append((Object) next.getKey());
                    sbLIZ2.append('.');
                    C20111613mc.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        InterfaceC20109713mJ interfaceC20109713mJ = this.LIZJ;
        if (interfaceC20109713mJ != null) {
            interfaceC20109713mJ.LIZ(this.LIZIZ);
        }
    }

    public static boolean LJFF(C20108713m9 c20108713m9) {
        if ((System.currentTimeMillis() - c20108713m9.LJIIIIZZ) - c20108713m9.LJIIIZ > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC20110713mT
    public final C20108713m9 LIZ(C20109413mG c20109413mG) throws JSONException {
        String string;
        Object c098200Yq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Start to get from cache for ");
        sbLIZ.append(c20109413mG);
        sbLIZ.append('.');
        C20111613mc.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        String string2 = c20109413mG.toString();
        C20108713m9 c20108713m9LIZ = this.LIZ.LIZ(string2);
        if (c20108713m9LIZ == null) {
            C20111613mc.LIZIZ("Not found in lruCache.");
            InterfaceC20109713mJ interfaceC20109713mJ = this.LIZJ;
            if (interfaceC20109713mJ != null && (string = interfaceC20109713mJ.getString(string2)) != null) {
                try {
                    c098200Yq = C20109513mH.LIZ(new JSONObject(string));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                C20108713m9 c20108713m9 = (C20108713m9) c098200Yq;
                if (c20108713m9 != null && !LJFF(c20108713m9)) {
                    C20111613mc.LIZIZ("Found in local storage.");
                    c20108713m9.LIZJ = EnumC20108613m8.CACHED;
                    LJIIIIZZ(c20109413mG, c20108713m9);
                    return c20108713m9;
                }
                C20111613mc.LIZIZ("Found in local storage but expired.");
                LJIIIZ(c20109413mG);
            }
        } else {
            if (!LJFF(c20108713m9LIZ)) {
                C20111613mc.LIZIZ("Found in lruCache.");
                if (c20108713m9LIZ.LJFF != null) {
                    c20108713m9LIZ.LIZJ = EnumC20108613m8.CACHED;
                }
                return c20108713m9LIZ;
            }
            C20111613mc.LIZIZ("Found in lruCache but expired.");
            LJIIIZ(c20109413mG);
        }
        C20111613mc.LIZIZ("Fallback to normal fetch.");
        return LJI(null, c20109413mG, -1L, true, true);
    }

    @Override // X.InterfaceC20110713mT
    public final C20108713m9 LIZIZ(C20109413mG c20109413mG) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Skip Cache to normal fetch for ");
        sbLIZ.append(c20109413mG);
        sbLIZ.append('.');
        C20111613mc.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        return LJI(null, c20109413mG, -1L, true, true);
    }

    @Override // X.InterfaceC20110713mT
    public final void LJ(AObjectS404S0100000_30 aObjectS404S0100000_30) {
        this.LJ.execute(new ARunnableS99S0200000_30(this, aObjectS404S0100000_30, 32));
    }

    public final void LJIIIZ(C20109413mG c20109413mG) {
        String string = c20109413mG.toString();
        C603850NmJ<String, C20108713m9> c603850NmJ = this.LIZ;
        c603850NmJ.getClass();
        new C259800zU();
        synchronized (c603850NmJ) {
            try {
                if (c603850NmJ.LIZ.remove(string) != null) {
                    c603850NmJ.LIZIZ--;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        InterfaceC20109713mJ interfaceC20109713mJ = this.LIZJ;
        if (interfaceC20109713mJ != null) {
            if (this.LIZIZ.remove(string)) {
                interfaceC20109713mJ.LIZ(this.LIZIZ);
            }
            interfaceC20109713mJ.remove(string);
        }
    }

    public final void LJIIIIZZ(C20109413mG c20109413mG, C20108713m9 c20108713m9) throws JSONException {
        InterfaceC20109713mJ interfaceC20109713mJ;
        JSONObject jSONObjectLIZIZ;
        if (c20108713m9.LJIIIZ <= 0) {
            return;
        }
        String string = c20109413mG.toString();
        this.LIZ.LIZIZ(string, c20108713m9);
        if (c20108713m9.LJFF != null && (interfaceC20109713mJ = this.LIZJ) != null) {
            if (this.LIZIZ.add(string)) {
                interfaceC20109713mJ.LIZ(this.LIZIZ);
            }
            JSONObject jSONObjectPut = new JSONObject().put("page_url", c20108713m9.LJI);
            C01GW c01gw = c20108713m9.LJII.LIZIZ;
            InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C20109413mG.LJIIJ;
            JSONObject jSONObjectPut2 = jSONObjectPut.put("request", c01gw.getValue()).put("timestamp", c20108713m9.LJIIIIZZ).put("expires", c20108713m9.LJIIIZ);
            C20109213mE c20109213mE = c20108713m9.LJFF;
            JSONObject jSONObjectLIZIZ2 = null;
            if (c20109213mE != null) {
                JSONObject jSONObject = new JSONObject();
                Map<String, String> map = c20109213mE.LIZJ;
                if (map != null) {
                    jSONObjectLIZIZ = C20109613mI.LIZIZ(map);
                } else {
                    jSONObjectLIZIZ = null;
                }
                jSONObject.put("headers", jSONObjectLIZIZ);
                jSONObject.put("body", c20109213mE.LIZ());
                jSONObject.put("status_code", c20109213mE.LIZLLL);
                Map<String, String> map2 = c20109213mE.LJ;
                if (map2 != null) {
                    jSONObjectLIZIZ2 = C20109613mI.LIZIZ(map2);
                }
                jSONObject.put("extra", jSONObjectLIZIZ2);
                jSONObjectLIZIZ2 = jSONObject;
            }
            interfaceC20109713mJ.putString(string, C786410Ut5.J3(jSONObjectPut2.put("response", jSONObjectLIZIZ2)));
        }
    }

    public static SortedMap LJII(SortedMap sortedMap, SortedMap sortedMap2, SortedMap sortedMap3) {
        String str;
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : sortedMap3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof C20111813me) {
                str = ((AbstractC20111713md) entry.getValue()).LIZ;
            } else {
                if (!(value instanceof C20112113mh)) {
                    if (value instanceof C20112213mi) {
                        if (sortedMap != null) {
                            str = (String) sortedMap.get(((AbstractC20111713md) entry.getValue()).LIZ);
                        }
                    } else if (sortedMap2 != null) {
                        str = (String) sortedMap2.get(((AbstractC20111713md) entry.getValue()).LIZ);
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("No param '");
                sbLIZ.append(((AbstractC20111713md) entry.getValue()).LIZ);
                sbLIZ.append("' found.");
                C20111613mc.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (str != null) {
                treeMap.put(entry.getKey(), str);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Append param: ");
                sbLIZ2.append((String) entry.getKey());
                sbLIZ2.append(" = ");
                sbLIZ2.append(str);
                C20111613mc.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("No param '");
                sbLIZ3.append(((AbstractC20111713md) entry.getValue()).LIZ);
                sbLIZ3.append("' found.");
                C20111613mc.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return treeMap;
    }

    public C20109113mD(InterfaceC20109713mJ interfaceC20109713mJ, InterfaceC2373909Rx interfaceC2373909Rx, Executor executor, int i) {
        this.LIZJ = interfaceC20109713mJ;
        this.LIZLLL = interfaceC2373909Rx;
        this.LJ = executor;
        this.LIZ = new C603850NmJ<>(i, new AwS644S0100000_30(this, 47), new AwS644S0100000_30(this, 48));
    }

    @Override // X.InterfaceC20110713mT
    public final void LIZJ(String str, SortedMap sortedMap, SortedMap sortedMap2, C20109313mF c20109313mF) throws JSONException {
        SortedMap sortedMapLJII;
        boolean zLJFF;
        C20108713m9 c20108713m9LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Start request: ");
        sbLIZ.append(c20109313mF);
        C20111613mc.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        SortedMap<String, AbstractC20111713md> sortedMap3 = c20109313mF.LJ;
        JSONObject jSONObjectLIZIZ = null;
        if (sortedMap3 != null) {
            sortedMapLJII = LJII(sortedMap, sortedMap2, sortedMap3);
        } else {
            sortedMapLJII = null;
        }
        SortedMap<String, AbstractC20111713md> sortedMap4 = c20109313mF.LJFF;
        if (sortedMap4 != null) {
            jSONObjectLIZIZ = C20109613mI.LIZIZ(LJII(sortedMap, sortedMap2, sortedMap4));
        }
        String str2 = c20109313mF.LIZ;
        String str3 = c20109313mF.LIZIZ;
        C20109413mG c20109413mG = new C20109413mG(str2, str3, c20109313mF.LIZLLL, sortedMapLJII, jSONObjectLIZIZ, c20109313mF.LJII, c20109313mF.LJIIIIZZ);
        Locale locale = Locale.ROOT;
        if (str3 != null) {
            if (!Intrinsics.LJFF(str3.toLowerCase(locale), "post") && (c20108713m9LIZ = this.LIZ.LIZ(c20109413mG.toString())) != null) {
                zLJFF = LJFF(c20108713m9LIZ);
            } else {
                zLJFF = true;
            }
            LJI(str, c20109413mG, c20109313mF.LJI, false, zLJFF);
            return;
        }
        throw new C2482109o3("null cannot be cast to non-null type java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20108713m9 LJI(java.lang.String r21, final X.C20109413mG r22, long r23, boolean r25, boolean r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20109113mD.LJI(java.lang.String, X.13mG, long, boolean, boolean):X.13m9");
    }
}
