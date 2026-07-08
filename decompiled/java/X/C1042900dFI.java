package X;

import android.text.TextUtils;
import com.bytedance.lynx.hybrid.ssp.RecordingTopDomainRequestResult;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.lynx.hybrid.ssp.base.net.DefaultNetAdapter;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.p;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dFI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042900dFI implements InterfaceC1042870dFF {
    public static Function0<String> LIZIZ;
    public static InterfaceC1046890dLj LJ;
    public static final C1042900dFI LIZ = new C1042900dFI();
    public static final C1042930dFL LIZJ = new C1042930dFL();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1042960dFO());
    public static final DefaultNetAdapter LJFF = new DefaultNetAdapter();
    public static RecordingTopDomainRequestResult.RequestMeta LJI = new RecordingTopDomainRequestResult.RequestMeta(null, 0, 3, null);
    public static final HashMap<String, Pair<InterfaceC1042970dFP, C1530760pwA>> LJII = new HashMap<>();
    public static final HashMap<String, InterfaceC1042180dE8> LJIIIIZZ = new HashMap<>();

    public static C1043130dFf LIZJ() {
        return (C1043130dFf) LIZLLL.getValue();
    }

    public static void LIZIZ(final InterfaceC1042180dE8 interfaceC1042180dE8, final C1042950dFN c1042950dFN, final String str) {
        if (!(!TextUtils.isEmpty(c1042950dFN.LIZ))) {
            interfaceC1042180dE8.LIZ(str, null, null);
            return;
        }
        Runnable runnable = new Runnable() { // from class: X.0dFK
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SSPBase@88ad.getMultipleData$runnable$1");
                try {
                    C1042900dFI.LJIIIIZZ.put(str, interfaceC1042180dE8);
                    C1042900dFI.LJFF.LIZJ(str, c1042950dFN, true);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SSPBase@88ad.getMultipleData$runnable$1");
            }
        };
        if (c1042950dFN.LJFF) {
            C2283708x9.LIZ(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // X.InterfaceC1042870dFF
    public final void LIZ(String str, boolean z, C1042940dFM c1042940dFM) {
        SSPResponse sSPResponse;
        InterfaceC1042970dFP first;
        C1530760pwA second;
        SSPResponse.Data data;
        Object c098200Yq;
        Map<String, SSPResponse.Data> map;
        Collection collectionValues;
        int i;
        String str2;
        Integer numValueOf;
        Map<String, SSPResponse.Data> map2;
        n nVarLJIILIIL;
        n nVarLJIILIIL2;
        k kVarLJJIIZ;
        k kVarLJJIIZ2;
        k kVarLJJIIZ3;
        int iLJIIJJI = -1;
        Integer num = -1;
        Map<String, List<SSPResponse.Rule>> map3 = null;
        if (c1042940dFM.LIZ) {
            String str3 = c1042940dFM.LIZJ;
            sSPResponse = new SSPResponse();
            try {
                C1058250de3.LIZJ().getClass();
                n nVarLJIILIIL3 = p.LIZJ(str3).LJIILIIL();
                sSPResponse.LIZ = nVarLJIILIIL3;
                k kVarLJJIIZ4 = nVarLJIILIIL3.LJJIIZ("code");
                if (kVarLJJIIZ4 != null) {
                    iLJIIJJI = kVarLJJIIZ4.LJIIJJI();
                }
                sSPResponse.LIZIZ = iLJIIJJI;
                n nVar = sSPResponse.LIZ;
                if (nVar != null && (kVarLJJIIZ3 = nVar.LJJIIZ("message")) != null) {
                    kVarLJJIIZ3.LJIL();
                }
                if (sSPResponse.LIZIZ == 0) {
                    n nVar2 = sSPResponse.LIZ;
                    if (nVar2 != null && (kVarLJJIIZ2 = nVar2.LJJIIZ("data")) != null && !(kVarLJJIIZ2 instanceof m)) {
                        nVarLJIILIIL = kVarLJJIIZ2.LJIILIIL();
                    } else {
                        nVarLJIILIIL = null;
                    }
                    C1042880dFG.LIZIZ(sSPResponse, nVarLJIILIIL, c1042940dFM.LJFF);
                    n nVar3 = sSPResponse.LIZ;
                    if (nVar3 != null && (kVarLJJIIZ = nVar3.LJJIIZ("rules")) != null && !(kVarLJJIIZ instanceof m)) {
                        nVarLJIILIIL2 = kVarLJJIIZ.LJIILIIL();
                    } else {
                        nVarLJIILIIL2 = null;
                    }
                    C1042880dFG.LJ(sSPResponse, nVarLJIILIIL2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                sSPResponse.LJI = th.getMessage();
            }
        } else {
            sSPResponse = null;
        }
        if (z) {
            HashMap<String, InterfaceC1042180dE8> map4 = LJIIIIZZ;
            if (!map4.containsKey(str)) {
                return;
            }
            InterfaceC1042180dE8 interfaceC1042180dE8 = map4.get(str);
            if (interfaceC1042180dE8 != null) {
                if (sSPResponse != null) {
                    map2 = sSPResponse.LIZLLL;
                    map3 = sSPResponse.LJ;
                } else {
                    map2 = null;
                }
                interfaceC1042180dE8.LIZ(str, map2, map3);
            }
            map4.remove(str);
            return;
        }
        HashMap<String, Pair<InterfaceC1042970dFP, C1530760pwA>> map5 = LJII;
        if (!map5.containsKey(str)) {
            return;
        }
        Pair<InterfaceC1042970dFP, C1530760pwA> pair = map5.get(str);
        if (pair != null) {
            first = pair.getFirst();
        } else {
            first = null;
        }
        Pair<InterfaceC1042970dFP, C1530760pwA> pair2 = map5.get(str);
        if (pair2 != null) {
            second = pair2.getSecond();
        } else {
            second = null;
        }
        map5.remove(str);
        if (second != null) {
            if (c1042940dFM.LIZ) {
                i = 1;
            } else {
                i = 0;
            }
            second.LLILZLL = i;
            second.LLJJIII = c1042940dFM.LJ;
            second.LLJ = c1042940dFM.LIZLLL;
            if (sSPResponse != null) {
                str2 = sSPResponse.LJI;
            } else {
                str2 = null;
            }
            second.LLJI = str2;
            if (sSPResponse != null) {
                numValueOf = Integer.valueOf(sSPResponse.LIZIZ);
            } else {
                numValueOf = num;
            }
            second.LLIZLLLIL = numValueOf;
            Integer num2 = c1042940dFM.LIZIZ;
            if (num2 != null) {
                num = num2;
            }
            second.LLIZ = num;
            String str4 = c1042940dFM.LJFF;
            if (str4 == null) {
                str4 = "";
            }
            second.LLJILLL = str4;
        }
        if (sSPResponse != null && (map = sSPResponse.LIZLLL) != null && (collectionValues = ((LinkedHashMap) map).values()) != null) {
            data = (SSPResponse.Data) C13LP.LJJJLIIL(collectionValues);
        } else {
            data = null;
        }
        if (first != null) {
            first.LIZ(str, data);
        }
        if (data != null && data.validityPeriod > 0) {
            C1042930dFL c1042930dFL = LIZJ;
            c1042930dFL.getClass();
            if (data.matchType == 0) {
                str = C1042930dFL.LIZ(UriProtector.parse(str));
            }
            c1042930dFL.LIZ.storeString(str, C1058250de3.LIZLLL(data));
            if (c1042930dFL.LIZ.count() > 30) {
                for (String str5 : c1042930dFL.LIZ.getAll().keySet()) {
                    try {
                        c098200Yq = (SSPResponse.Data) C1058250de3.LIZ(c1042930dFL.LIZ.getString(str5, ""), SSPResponse.Data.class);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    SSPResponse.Data data2 = (SSPResponse.Data) c098200Yq;
                    if (data2 == null || data2.expire <= System.currentTimeMillis()) {
                        c1042930dFL.LIZ.erase(str5);
                    }
                }
            }
        }
    }
}
