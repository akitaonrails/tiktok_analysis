package X;

import com.bytedance.android.btm.api.config.BcmChainEventConfig;
import com.bytedance.android.btm.impl.setting.BugfixModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18BM, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18BM implements InterfaceC1699630uKX {
    public final int LIZ;
    public final boolean LIZIZ;
    public final List<String> LIZJ;
    public final List<String> LIZLLL;
    public final C01GW LJ;

    public C18BM() {
        int iLJIIIIZZ = C21244618Bw.LIZ().LJIIIIZZ();
        this.LIZ = iLJIIIIZZ;
        boolean z = true;
        if (iLJIIIIZZ != 1 && iLJIIIIZZ != 2) {
            z = false;
        }
        this.LIZIZ = z;
        this.LIZJ = C21244618Bw.LIZ().LJI();
        this.LIZLLL = C21244618Bw.LIZ().LJII();
        this.LJ = C452501pT.LIZIZ(new C18BN(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, X.18Br] */
    @Override // X.InterfaceC1699630uKX
    public final void LIZ(String str, String str2, JSONObject jSONObject, Map<String, Object> map) {
        boolean z;
        BcmChainEventConfig bcmChainEventConfig;
        boolean z2;
        int iIntValue;
        C1766940w56 c1766940w56;
        String strOptString;
        String strOptString2;
        if (str != null && str2.length() != 0) {
            C259800zU c259800zU = new C259800zU();
            String string = null;
            if (this.LIZ == 1) {
                AwS611S0100000_32 awS611S0100000_32 = new AwS611S0100000_32(c259800zU, (C259800zU<C18C6>) 379);
                if ((jSONObject == null || !jSONObject.has("bcm_chain")) && (bcmChainEventConfig = (BcmChainEventConfig) ((Map) this.LJ.getValue()).get(str)) != null) {
                    if (bcmChainEventConfig.LIZLLL() == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    List<String> listLIZ = bcmChainEventConfig.LIZ();
                    if (listLIZ.isEmpty()) {
                        listLIZ = this.LIZJ;
                    }
                    List<String> listLIZIZ = bcmChainEventConfig.LIZIZ();
                    if (listLIZIZ.isEmpty()) {
                        listLIZIZ = this.LIZLLL;
                    }
                    if (C189M.LIZJ(listLIZ, str2, listLIZIZ, z2)) {
                        C21244118Br c21244118BrLJ = C18BP.LIZ.LJ(bcmChainEventConfig.LIZJ(), str2, AnonymousClass1896.LIZ);
                        BugfixModel bugfixModelLIZIZ = C18CS.LIZ.LIZIZ();
                        bugfixModelLIZIZ.getClass();
                        Object objLIZIZ = C1972007ny.LIZIZ(bugfixModelLIZIZ, "fix_bcm_chain_0_btm", Integer.valueOf(bugfixModelLIZIZ.fixBcmChain0Btm));
                        if (!(objLIZIZ instanceof Integer)) {
                            objLIZIZ = null;
                        }
                        Integer num = (Integer) objLIZIZ;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = bugfixModelLIZIZ.fixBcmChain0Btm;
                        }
                        bugfixModelLIZIZ.fixBcmChain0Btm = iIntValue;
                        if (iIntValue == 1 && (c1766940w56 = (C1766940w56) C13LP.LJJJLZIJ(0, c21244118BrLJ.LIZ)) != null && c1766940w56.LIZJ != null) {
                            String str3 = c1766940w56.LIZJ;
                            if (jSONObject != null) {
                                strOptString = jSONObject.optString("btm_show_id");
                            } else {
                                strOptString = null;
                            }
                            if (Intrinsics.LJFF(str3, strOptString)) {
                                if (jSONObject != null && (strOptString2 = jSONObject.optString("btm")) != null && strOptString2.length() != 0) {
                                    c1766940w56.LIZIZ = strOptString2;
                                } else {
                                    Regex regex = C18C3.LIZ;
                                    map.put("btm", C18C3.LIZJ(c1766940w56.LIZIZ));
                                }
                            }
                        }
                        map.put("bcm_chain", awS611S0100000_32.invoke(c21244118BrLJ));
                    }
                }
            }
            if (((Number) C18CS.LJIIIIZZ.getValue()).intValue() == 1) {
                if (c259800zU.element != 0 && ((Number) C18CS.LJIIL.getValue()).intValue() == 0) {
                    return;
                }
                if (((Number) C18CS.LJIIIZ.getValue()).intValue() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                List list = (List) C18CS.LJIIJ.getValue();
                List list2 = (List) C18CS.LJIIJJI.getValue();
                if (z) {
                    if (C189M.LJ(str, list2)) {
                        return;
                    }
                } else if (!C189M.LJ(str, list)) {
                    return;
                }
                if (c259800zU.element == 0) {
                    c259800zU.element = C18BP.LIZ.LJ(((Number) C18CS.LIZJ.getValue()).intValue(), str2, AnonymousClass1896.LIZ);
                }
                C18C6 c18c6 = (C18C6) c259800zU.element;
                if (c18c6 != null) {
                    string = C189M.LJFF(c18c6).toString();
                }
                map.put("btm_list", string);
            }
        }
    }
}
