package X;

import android.text.TextUtils;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530750pw9 extends C1536330q59 {
    public final String LLILLJJLI;
    public final C1530840pwI LLILLL;
    public final InterfaceC1530620pvw LLILZ;
    public final C1530760pwA LLILZIL;
    public final String LLILZLL;
    public final AtomicBoolean LLIZ = new AtomicBoolean(false);
    public final AtomicBoolean LLIZLLLIL = new AtomicBoolean(false);
    public SSPResponse.Data LLJ;

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        if (this.LLIZ.get()) {
            C1490740otc.LIZIZ(C1490740otc.LIZ, "onLoaded after release", null, "SspLifeCycle_", 2);
        } else if (!this.LLIZLLLIL.compareAndSet(false, true)) {
            C1490740otc.LIZIZ(C1490740otc.LIZ, "duplicate onLoaded", null, "SspLifeCycle_", 2);
        } else {
            C2283708x9.LIZ(new Runnable() { // from class: X.0pw7
                public final void LIZ() {
                    SSPResponse.PreConnect[] preConnectArr;
                    C1530750pw9 c1530750pw9 = this.LL;
                    SSPResponse.Data data = c1530750pw9.LLJ;
                    if (data == null || (preConnectArr = data.subpagePreConnectList) == null) {
                        return;
                    }
                    for (SSPResponse.PreConnect preConnect : preConnectArr) {
                        c1530750pw9.LLILZ.LIZIZ(preConnect);
                        C1490740otc c1490740otc = C1490740otc.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("preconnect sub url ");
                        sbLIZ.append(preConnect.domain);
                        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "SspLifeCycle_", 2);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SSPContext@eef5.onLoadFinish$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SSPContext@eef5.onLoadFinish$1");
                }
            });
        }
    }

    public final void LJLJLJ(String str) {
        if (this.LLIZ.get() || this.LLIZLLLIL.get()) {
            return;
        }
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchAndConsumeSSP. url: ");
        sbLIZ.append(str);
        sbLIZ.append(", timestamp: ");
        sbLIZ.append(System.currentTimeMillis());
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "SspLifeCycle_", 2);
        C1042900dFI c1042900dFI = C1042900dFI.LIZ;
        C1042950dFN c1042950dFN = new C1042950dFN(this.LLILZLL, 0, false, false, 62);
        InterfaceC1042970dFP interfaceC1042970dFP = new InterfaceC1042970dFP() { // from class: X.0pwB
            @Override // X.InterfaceC1042970dFP
            public final void LIZ(String str2, SSPResponse.Data data) {
                if (data != null) {
                    C1490740otc c1490740otc2 = C1490740otc.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("fetch ssp response data success. url: ");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(", timestamp: ");
                    sbLIZ2.append(System.currentTimeMillis());
                    C1490740otc.LIZIZ(c1490740otc2, C2188811AlT.LIZIZ(sbLIZ2), null, "SspLifeCycle_", 2);
                    if (this.LIZ.LLIZ.get() || this.LIZ.LLIZLLLIL.get()) {
                        return;
                    }
                    if (Intrinsics.LJFF(str2, this.LIZ.LLILLJJLI)) {
                        C1530750pw9 c1530750pw9 = this.LIZ;
                        if (c1530750pw9.LLJ == null) {
                            c1530750pw9.LLJ = data;
                            C1530760pwA c1530760pwA = c1530750pw9.LLILZIL;
                            c1530760pwA.LLJJJIL = data;
                            c1530760pwA.LLJILLL = data.logID;
                            c1530760pwA.LLJILJILJ = data.mode;
                        }
                    }
                    final C1530750pw9 c1530750pw92 = this.LIZ;
                    c1530750pw92.getClass();
                    C2283708x9.LIZ(new Runnable() { // from class: X.0pw8
                        public final void LIZ() {
                            SSPResponse.Prefetch[] prefetchArr;
                            SSPResponse.PreConnect[] preConnectArr;
                            C1530750pw9 c1530750pw93 = c1530750pw92;
                            SSPResponse.Data data2 = c1530750pw93.LLJ;
                            if (data2 == null) {
                                return;
                            }
                            c1530750pw93.LLILZIL.LLJJJ = Long.valueOf(System.currentTimeMillis());
                            C1530750pw9 c1530750pw94 = c1530750pw92;
                            if (c1530750pw94.LLILLL.LIZLLL && (preConnectArr = data2.preConnectList) != null) {
                                for (SSPResponse.PreConnect preConnect : preConnectArr) {
                                    c1530750pw94.LLILZ.LIZIZ(preConnect);
                                    C1490740otc c1490740otc3 = C1490740otc.LIZ;
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("preConnect url ");
                                    sbLIZ3.append(preConnect.domain);
                                    C1490740otc.LIZIZ(c1490740otc3, C2188811AlT.LIZIZ(sbLIZ3), null, "SspLifeCycle_", 2);
                                }
                                c1530750pw94.LLILZIL.LLJILJIL = 1;
                            }
                            C1530750pw9 c1530750pw95 = c1530750pw92;
                            if (!c1530750pw95.LLILLL.LIZIZ || (prefetchArr = data2.prefetchList) == null) {
                                return;
                            }
                            for (SSPResponse.Prefetch prefetch : prefetchArr) {
                                c1530750pw95.LLILZ.LIZ(prefetch);
                            }
                            c1530750pw95.LLILZIL.LLJIJIL = 1;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("SSPContext@eef5.consumeSSPResponse$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("SSPContext@eef5.consumeSSPResponse$1");
                        }
                    });
                    return;
                }
                C1490740otc c1490740otc3 = C1490740otc.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("fetch ssp response data failed. url: ");
                sbLIZ3.append(str2);
                c1490740otc3.LIZ(C2188811AlT.LIZIZ(sbLIZ3), EnumC1490770otf.E, "SspLifeCycle_");
            }
        };
        C1530760pwA c1530760pwA = this.LLILZIL;
        if (!(!TextUtils.isEmpty(r5))) {
            interfaceC1042970dFP.LIZ(str, null);
        } else {
            C2283708x9.LIZ(new RunnableC1042910dFJ(c1530760pwA, c1042950dFN, interfaceC1042970dFP, str));
        }
    }

    public final void LJLJLLL(boolean z) {
        SSPResponse.Prefetch[] prefetchArr;
        int length = 0;
        Integer numValueOf = null;
        if (!this.LLIZ.compareAndSet(false, true)) {
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("duplicate release ssp context. url:");
            sbLIZ.append(this.LLILLJJLI);
            C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "SspLifeCycle_", 2);
            return;
        }
        if (!z) {
            C1530760pwA c1530760pwA = this.LLILZIL;
            c1530760pwA.getClass();
            try {
                if (C1533950q1J.LJ(c1530760pwA.LLILLJJLI)) {
                    SSPResponse.Data data = c1530760pwA.LLJJJIL;
                    if (data != null && (prefetchArr = data.prefetchList) != null && (length = prefetchArr.length) > 0) {
                        float f = length;
                        c1530760pwA.LLJJIJI = Float.valueOf(c1530760pwA.LLJJJJ / f);
                        c1530760pwA.LLJJIJIIJIL = Float.valueOf((c1530760pwA.LLJJJJJIL + c1530760pwA.LLJJJJ) / f);
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ssp_config", c1530760pwA.LLILLL);
                    jSONObject.put("ssp_feature_request_bid", c1530760pwA.LLILZ);
                    EnumC994680bzW enumC994680bzW = c1530760pwA.LLILZIL;
                    if (enumC994680bzW != null) {
                        numValueOf = Integer.valueOf(enumC994680bzW.getVa());
                    }
                    jSONObject.put("ssp_feature_cache_state", numValueOf);
                    jSONObject.put("ssp_feature_response_state", c1530760pwA.LLILZLL);
                    jSONObject.put("ssp_feature_response_code", c1530760pwA.LLIZ);
                    jSONObject.put("ssp_feature_server_code", c1530760pwA.LLIZLLLIL);
                    jSONObject.put("ssp_feature_response_err", c1530760pwA.LLJ);
                    jSONObject.put("ssp_response_parse_error", c1530760pwA.LLJI);
                    jSONObject.put("ssp_prefetch_list_size", length);
                    jSONObject.put("ssp_prefetch_hit_size", c1530760pwA.LLJJJJ);
                    jSONObject.put("ssp_request_reuse_size", c1530760pwA.LLJJJJJIL);
                    jSONObject.put("ssp_trigger_prefetch", c1530760pwA.LLJIJIL);
                    jSONObject.put("ssp_trigger_preconnect", c1530760pwA.LLJILJIL);
                    jSONObject.put("ssp_response_log_id", c1530760pwA.LLJILLL);
                    jSONObject.put("ssp_response_mode", c1530760pwA.LLJILJILJ);
                    jSONObject.put("ssp_unKnow_error", c1530760pwA.LLJJ);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("ssp_feature_cache_query_duration", c1530760pwA.LLJJI);
                    jSONObject2.put("ssp_feature_request_duration", c1530760pwA.LLJJIII);
                    Long l = c1530760pwA.LLJJIJIL;
                    if (l != null && c1530760pwA.LLJJJ != null) {
                        jSONObject2.put("ssp_load_optimize_duration", l.longValue() - c1530760pwA.LLJJJ.longValue());
                    }
                    jSONObject2.put("ssp_prefetch_finish_rate", c1530760pwA.LLJJIJI);
                    jSONObject2.put("ssp_prefetch_hit_rate", c1530760pwA.LLJJIJIIJIL);
                    C1520200pf8 c1520200pf8 = C1520200pf8.LIZ;
                    C1520360pfO c1520360pfO = new C1520360pfO("spark_server_push_client");
                    c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
                    c1520360pfO.LIZ = c1530760pwA.LLILLJJLI;
                    c1520360pfO.LIZIZ = c1530760pwA.LLILZ;
                    c1520360pfO.LIZLLL = jSONObject;
                    c1520360pfO.LJ = jSONObject2;
                    C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                    c1520200pf8.getClass();
                    C1520200pf8.LIZ(c1520350pfNLIZ);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1490740otc c1490740otc2 = C1490740otc.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("do report exception. error: ");
                sbLIZ2.append(e.getMessage());
                sbLIZ2.append(", url: ");
                sbLIZ2.append(c1530760pwA.LLILLJJLI);
                c1490740otc2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), EnumC1490770otf.E, "SspLifeCycle_");
            }
        }
        C1042900dFI c1042900dFI = C1042900dFI.LIZ;
        String str = this.LLILZIL.LLILLJJLI;
        if (str != null) {
            HashMap<String, Pair<InterfaceC1042970dFP, C1530760pwA>> map = C1042900dFI.LJII;
            if (map.get(str) != null) {
                map.remove(str);
            }
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        if (this.LLIZ.get()) {
            return;
        }
        this.LLILZIL.LJLIIL(interfaceC1541990qEH, str);
    }

    public C1530750pw9(String str, C1530840pwI c1530840pwI, C1530520pvm c1530520pvm, C1530760pwA c1530760pwA, String str2) {
        this.LLILLJJLI = str;
        this.LLILLL = c1530840pwI;
        this.LLILZ = c1530520pvm;
        this.LLILZIL = c1530760pwA;
        this.LLILZLL = str2;
    }
}
