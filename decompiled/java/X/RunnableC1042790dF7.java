package X;

import com.bytedance.lynx.hybrid.ssp.RecordingTopDomainRequestResult;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.lynx.hybrid.ssp.base.net.DefaultNetAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS31S0000100_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dF7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class RunnableC1042790dF7 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("IABRecordingTopNRunnable@ab4d.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IABRecordingTopNRunnable@ab4d.run");
    }

    public static void LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1042900dFI c1042900dFI = C1042900dFI.LIZ;
        final C1042810dF9 c1042810dF9 = new C1042810dF9(new AwS31S0000100_16(jCurrentTimeMillis, 12));
        if (C1042900dFI.LJI.url.length() == 0 || C1042900dFI.LJI.version <= 0) {
            c1042810dF9.invoke(new RecordingTopDomainRequestResult(false, (RecordingTopDomainRequestResult.RequestMeta) null, EnumC1042820dFA.REQUEST_META_INVALID, (String) null, 16));
            return;
        }
        C1043130dFf c1043130dFfLIZJ = C1042900dFI.LIZJ();
        RecordingTopDomainRequestResult.RequestMeta requestMeta = C1042900dFI.LJI;
        long j = c1043130dFfLIZJ.LIZ().getLong("version", 0L);
        String string = c1043130dFfLIZJ.LIZ().getString("url", "");
        if (j > 0 && !Intrinsics.LJFF(string, "") && j >= requestMeta.version && Intrinsics.LJFF(string, requestMeta.url)) {
            c1042810dF9.invoke(new RecordingTopDomainRequestResult(true, C1042900dFI.LJI, (EnumC1042820dFA) null, "Already the latest data, no need to update.", 8));
            return;
        }
        C1490740otc.LIZIZ(C1490740otc.LIZ, "start send Top Domain Recording Request.", null, "SSPBase_", 2);
        DefaultNetAdapter defaultNetAdapter = C1042900dFI.LJFF;
        RecordingTopDomainRequestResult.RequestMeta requestMeta2 = C1042900dFI.LJI;
        InterfaceC1042870dFF interfaceC1042870dFF = new InterfaceC1042870dFF() { // from class: X.0dFB
            @Override // X.InterfaceC1042870dFF
            public final void LIZ(String str, boolean z, C1042940dFM c1042940dFM) {
                Object c098200Yq;
                long jLJIIZILJ;
                k kVarLJJIIZ;
                k kVarLJJIIZ2;
                if (!c1042940dFM.LIZ) {
                    c1042810dF9.invoke(new RecordingTopDomainRequestResult(false, true, C1042900dFI.LJI, EnumC1042820dFA.NET_REQUEST_FAILED, c1042940dFM.LIZLLL));
                    return;
                }
                String str2 = c1042940dFM.LIZJ;
                SSPResponse sSPResponse = new SSPResponse();
                try {
                    C1058250de3.LIZJ().getClass();
                    n nVarLJIILIIL = p.LIZJ(str2).LJIILIIL();
                    sSPResponse.LIZ = nVarLJIILIIL;
                    k kVarLJJIIZ3 = nVarLJIILIIL.LJJIIZ("updated_at");
                    if (kVarLJJIIZ3 != null) {
                        jLJIIZILJ = kVarLJJIIZ3.LJIIZILJ();
                    } else {
                        jLJIIZILJ = 0;
                    }
                    sSPResponse.LIZJ = jLJIIZILJ;
                    n nVar = sSPResponse.LIZ;
                    if (nVar != null && (kVarLJJIIZ2 = nVar.LJJIIZ("general_domain")) != null) {
                        n nVarLJIILIIL2 = kVarLJJIIZ2.LJIILIIL();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, k> entry : nVarLJIILIIL2.entrySet()) {
                            String key = entry.getKey();
                            String strLJIL = entry.getValue().LJIL();
                            if (strLJIL != null) {
                                linkedHashMap.put(key, strLJIL);
                            }
                        }
                        sSPResponse.LJFF = linkedHashMap;
                    }
                    n nVar2 = sSPResponse.LIZ;
                    n nVarLJIILIIL3 = null;
                    if (nVar2 != null && (kVarLJJIIZ = nVar2.LJJIIZ("rules")) != null && !(kVarLJJIIZ instanceof m)) {
                        nVarLJIILIIL3 = kVarLJJIIZ.LJIILIIL();
                    }
                    C1042880dFG.LJ(sSPResponse, nVarLJIILIIL3);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sSPResponse.LJI = th.getMessage();
                }
                String str3 = sSPResponse.LJI;
                if (str3 != null) {
                    c1042810dF9.invoke(new RecordingTopDomainRequestResult(false, true, C1042900dFI.LJI, EnumC1042820dFA.RESPONSE_PARSE_ERROR, str3));
                    return;
                }
                if (sSPResponse.LIZJ <= 0) {
                    Function1<RecordingTopDomainRequestResult, Unit> function1 = c1042810dF9;
                    RecordingTopDomainRequestResult.RequestMeta requestMeta3 = C1042900dFI.LJI;
                    EnumC1042820dFA enumC1042820dFA = EnumC1042820dFA.SERVER_UPDATE_AT_INVALID;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("invalid server update_at, ");
                    sbLIZ.append(sSPResponse.LIZJ);
                    sbLIZ.append('.');
                    function1.invoke(new RecordingTopDomainRequestResult(false, true, requestMeta3, enumC1042820dFA, C2188811AlT.LIZIZ(sbLIZ)));
                    return;
                }
                if (sSPResponse.LJ == null) {
                    c1042810dF9.invoke(new RecordingTopDomainRequestResult(false, true, C1042900dFI.LJI, EnumC1042820dFA.SERVER_RULES_INVALID, "invalid ruleData."));
                    return;
                }
                try {
                    C1042900dFI c1042900dFI2 = C1042900dFI.LIZ;
                    C1043130dFf c1043130dFfLIZJ2 = C1042900dFI.LIZJ();
                    long j2 = sSPResponse.LIZJ;
                    String str4 = C1042900dFI.LJI.url;
                    Map<String, List<SSPResponse.Rule>> mapLJ = sSPResponse.LJ;
                    if (mapLJ == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    c1043130dFfLIZJ2.LIZJ(str4, mapLJ, sSPResponse.LJFF, j2);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Function1<RecordingTopDomainRequestResult, Unit> function12 = c1042810dF9;
                if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                    function12.invoke(new RecordingTopDomainRequestResult(true, true, C1042900dFI.LJI, (EnumC1042820dFA) null, (String) null));
                    return;
                }
                Function1<RecordingTopDomainRequestResult, Unit> function13 = c1042810dF9;
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    RecordingTopDomainRequestResult.RequestMeta requestMeta4 = C1042900dFI.LJI;
                    EnumC1042820dFA enumC1042820dFA2 = EnumC1042820dFA.CACHE_UPDATE_ERROR;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("exception happen when update cache, ");
                    sbLIZ2.append(thM5exceptionOrNullimpl.getClass());
                    sbLIZ2.append(':');
                    sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
                    function13.invoke(new RecordingTopDomainRequestResult(false, true, requestMeta4, enumC1042820dFA2, C2188811AlT.LIZIZ(sbLIZ2)));
                }
            }
        };
        defaultNetAdapter.getClass();
        defaultNetAdapter.LIZIZ(EnumC1042800dF8.GET, requestMeta2.url, "", defaultNetAdapter.LIZ, null, null, interfaceC1042870dFF, null, false);
    }
}
