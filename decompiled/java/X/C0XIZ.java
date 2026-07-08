package X;

import android.util.Pair;
import com.bytedance.bpea.net3rd.api.I3rdRetrofitFactory;
import com.bytedance.ies.android.base.runtime.depend.INetworkDepend;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.track.TraceSDKAttributionApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0XIZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XIZ extends C1BEP {
    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0N4Y] */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, X.0ozz, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, X.0ozZ, java.lang.Throwable] */
    public static C0N4Y LJ(C846340XIa c846340XIa) {
        boolean zLJI = MethodIDManager.LJI(137346);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        new C259800zU();
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        final C259800zU c259800zU2 = new C259800zU();
        try {
            String str = c846340XIa.LIZ;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(new C0XI4(str).LJFF(), linkedHashMap2);
            C443120HZe c443120HZe = new C443120HZe((String) pairLIZJ.first, (String) pairLIZJ.second, linkedHashMap2);
            String str2 = (String) c443120HZe.getFirst();
            String str3 = (String) c443120HZe.getSecond();
            LinkedHashMap linkedHashMap3 = (LinkedHashMap) c443120HZe.getThird();
            List<C080U> listLJFF = LJFF(c846340XIa);
            C1493620oyG c1493620oyG = new C1493620oyG();
            c1493620oyG.LIZJ = c846340XIa.LIZLLL;
            c1493620oyG.LIZLLL = c846340XIa.LJ;
            c1493620oyG.LJ = 0L;
            AbstractC1515220pX6 abstractC1515220pX6LIZ = ((I3rdRetrofitFactory) ServiceManager.get().getService(I3rdRetrofitFactory.class)).createBuilder(str2).LIZ(false);
            abstractC1515220pX6LIZ.LIZJ = true;
            abstractC1515220pX6LIZ.LIZLLL = true;
            C0X9S<String> c0x9sAttribution = ((TraceSDKAttributionApi) abstractC1515220pX6LIZ.LJFF().create(TraceSDKAttributionApi.class)).attribution(str3, linkedHashMap3, listLJFF, false, c1493620oyG);
            c118300cf.element = 0;
            try {
                C0X52<String> c0x52Execute = c0x9sAttribution.execute();
                if (c0x52Execute != null) {
                    C2175508fh c2175508fh = c0x52Execute.LIZ;
                    c118300cf.element = c2175508fh.LIZIZ;
                    List<C080U> list = c2175508fh.LIZLLL;
                    if (list != null) {
                        for (C080U c080u : list) {
                            String str4 = c080u.LIZ;
                            String str5 = c080u.LIZIZ;
                            if (str5 == null) {
                                str5 = "";
                            }
                            linkedHashMap.put(str4, str5);
                        }
                    }
                }
            } catch (C1494430ozZ e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C1494430ozZ.class);
                sbLIZ.append(':');
                sbLIZ.append(e.getMessage());
                sbLIZ.append(',');
                sbLIZ.append(e.getStatusCode());
                c259800zU.element = C2188811AlT.LIZIZ(sbLIZ);
                c118300cf.element = e.getStatusCode();
                c259800zU2.element = e;
            } catch (C1494690ozz e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C1494690ozz.class);
                sbLIZ2.append(':');
                sbLIZ2.append(e2.getMessage());
                sbLIZ2.append(",-1");
                c259800zU.element = C2188811AlT.LIZIZ(sbLIZ2);
                c118300cf.element = e2.getStatusCode();
                c259800zU2.element = e2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            c259800zU.element = "request for string cause exception";
            c259800zU2.element = th;
        }
        ?? r0 = new C0N4Z() { // from class: X.0N4Y
            @Override // X.C0N4Z
            public final String LIZ() {
                return c259800zU.element;
            }

            @Override // X.C0N4Z
            public final Throwable LIZIZ() {
                return c259800zU2.element;
            }

            @Override // X.C0N4Z
            public final Integer LIZJ() {
                return Integer.valueOf(c118300cf.element);
            }

            @Override // X.C0N4Z
            public final LinkedHashMap<String, String> LIZLLL() {
                return linkedHashMap;
            }
        };
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return r0;
    }

    public static List LJFF(C846340XIa c846340XIa) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap<String, String> linkedHashMap = c846340XIa.LIZIZ;
        if (linkedHashMap != null) {
            for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
                arrayList.add(new C080U(entry.getKey(), entry.getValue()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x010c: INVOKE (r0 I:X.1BEW) = (r0v1 ?? I:java.lang.Throwable), (r11 I:X.1BEZ) STATIC call: X.1BEW.LIZ(java.lang.Throwable, X.1BEZ):X.1BEW A[MD:(java.lang.Throwable, X.1BEZ):X.1BEW (m)] (LINE:50331916), block:B:55:0x0106 */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.1BEZ] */
    @Override // X.C1BEP
    public final C1BEW LIZLLL(C1BEZ c1bez, int i, boolean z) {
        ?? LIZ;
        boolean z2;
        LinkedHashMap<String, String> linkedHashMap;
        int iIntValue;
        boolean zLJI = MethodIDManager.LJI(137345);
        try {
            String str = c1bez.LIZIZ;
            boolean z3 = true;
            if (str == null || str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C0N4Z c0n4zRequestForString = null;
            if (z2) {
                C1BEW c1bewLIZ = C1BEW.LIZ(new IllegalArgumentException("empty url"), null);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return c1bewLIZ;
            }
            Map<String, List<String>> map = c1bez.LIZLLL;
            if (map != null && !map.isEmpty()) {
                z3 = false;
            }
            if (z3) {
                linkedHashMap = null;
            } else {
                C08LY c08ly = new C08LY(C09RB.LJIIJ(C09RB.LJIIJ(C2097808Js.LJIJJLI(map), AnonymousClass0207.get$arr$(178)), AnonymousClass0207.get$arr$(179)), AnonymousClass0207.get$arr$(180));
                linkedHashMap = new LinkedHashMap<>();
                C2097608Jq.LJIJI(linkedHashMap, c08ly);
            }
            if (linkedHashMap != null) {
                linkedHashMap.put("x-metasec-bypass-ttnet-features", "1");
            }
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            if (!C839620Wwi.LIZIZ) {
                C2429209fW.LIZ().appendDataFlowId(linkedHashMap, "671088644");
            }
            C846340XIa c846340XIa = new C846340XIa(c1bez.LIZIZ);
            c846340XIa.LIZJ = false;
            long j = i;
            c846340XIa.LIZLLL = j;
            c846340XIa.LJ = j;
            if (!linkedHashMap.isEmpty()) {
                c846340XIa.LIZIZ = linkedHashMap;
            }
            if (C839620Wwi.LIZIZ) {
                c0n4zRequestForString = LJ(c846340XIa);
            } else {
                C0XIY c0xiy = C0XIY.GET;
                INetworkDepend iNetworkDepend = (INetworkDepend) C846340XIa.LJFF.LIZ();
                if (iNetworkDepend != null) {
                    c0n4zRequestForString = iNetworkDepend.requestForString(c0xiy, c846340XIa);
                }
            }
            if (c0n4zRequestForString == null) {
                C1BEW c1bewLIZ2 = C1BEW.LIZ(new IllegalArgumentException("Response is null"), c1bez);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return c1bewLIZ2;
            }
            Integer numLIZJ = c0n4zRequestForString.LIZJ();
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -1;
            }
            String strLIZ = c0n4zRequestForString.LIZ();
            C08LY c08ly2 = new C08LY(C2097808Js.LJIJJLI(c0n4zRequestForString.LIZLLL()), AnonymousClass0207.get$arr$(181));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            C2097608Jq.LJIJI(linkedHashMap2, c08ly2);
            C1BEW c1bew = new C1BEW(iIntValue, strLIZ, linkedHashMap2, c1bez, c0n4zRequestForString.LIZIZ());
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c1bew;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C1BEW c1bewLIZ3 = C1BEW.LIZ(th, LIZ);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c1bewLIZ3;
        }
    }
}
