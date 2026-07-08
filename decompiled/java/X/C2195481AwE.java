package X;

import Y.ARunnableS103S0200000_34;
import android.app.Activity;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.debug.data.M10nMockDebugErrorInfo;
import com.ss.android.ugc.aweme.minis.payment.IMinisPaymentService;
import com.ss.android.ugc.aweme.minis.payment.MinisPaymentService;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.1AwE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195481AwE extends AbstractC2195341Aw0 {
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, X.1AzR] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.1AwI] */
    public final void LIZJ(final InterfaceC2195361Aw2 interfaceC2195361Aw2, final CompletionBlock completionBlock) {
        final Activity activityLIZIZ;
        Map<String, String> mapLJ;
        String strLIZ;
        Set<String> setKeySet;
        String string;
        Object obj;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        final C259800zU c259800zU = new C259800zU();
        ?? r8 = new C1B09() { // from class: X.1AwI
            @Override // X.C1B09
            public final void LIZ(C2195941Awy c2195941Awy) {
                if (C123100dR.LIZ(c2195941Awy.LIZIZ.LIZJ)) {
                    C786410Ut5.LJJZZIII(this.LIZ.LLILLL, new ARunnableS103S0200000_34(activityLIZIZ, c2195941Awy, 22));
                }
            }

            @Override // X.C1B09
            public final void LIZIZ(C2195941Awy c2195941Awy) {
                boolean z;
                String str;
                String str2 = c2195941Awy.LIZIZ.LIZJ;
                if (str2 != null) {
                    str2.length();
                }
                if (C123100dR.LIZ(c2195941Awy.LIZIZ.LIZJ)) {
                    C786410Ut5.LJJZZIII(this.LIZ.LLILLL, new ARunnableS103S0200000_34(activityLIZIZ, c2195941Awy, 21));
                }
                C2197471AzR c2197471AzR = c259800zU.element;
                if (c2197471AzR != null) {
                    c2197471AzR.LJIILLIIL(c2195941Awy);
                }
                C2195481AwE c2195481AwE = this.LIZ;
                CompletionBlock<InterfaceC2195321Avy> completionBlock2 = completionBlock;
                C2197471AzR c2197471AzR2 = c259800zU.element;
                c2195481AwE.getClass();
                EnumC2197771Azv enumC2197771Azv = c2195941Awy.LIZ;
                if (enumC2197771Azv != EnumC2197771Azv.CLIENT_CREATE_ORDER_FAIL && enumC2197771Azv != EnumC2197771Azv.IAP_PAY_CANCEL && enumC2197771Azv != EnumC2197771Azv.IAP_PAY_FAIL) {
                    if (enumC2197771Azv == EnumC2197771Azv.SUCCESS_RECHARGE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Integer num = null;
                    if (z) {
                        InterfaceC2195321Avy interfaceC2195321Avy = (InterfaceC2195321Avy) C1909107dp.LIZJ(InterfaceC2195321Avy.class, null);
                        interfaceC2195321Avy.setSuccess(Boolean.TRUE);
                        InterfaceC2195411Aw7 interfaceC2195411Aw7 = (InterfaceC2195411Aw7) C1909107dp.LIZJ(InterfaceC2195411Aw7.class, null);
                        interfaceC2195411Aw7.setTradeOrderId(String.valueOf(c2195941Awy.LIZJ.get("trade_order_id")));
                        interfaceC2195411Aw7.setTierId(String.valueOf(c2195941Awy.LIZJ.get("tier_id")));
                        interfaceC2195321Avy.setData(interfaceC2195411Aw7);
                        if (c2197471AzR2 != null) {
                            c2197471AzR2.LJFF();
                        }
                        completionBlock2.onSuccess(interfaceC2195321Avy, "");
                        if (c2197471AzR2 != null) {
                            c2197471AzR2.LJII();
                            return;
                        }
                        return;
                    }
                    C1232850iBf c1232850iBf = c2195941Awy.LIZLLL;
                    if (c1232850iBf == null || (str = c1232850iBf.LIZIZ) == null || str.length() == 0) {
                        str = c2195941Awy.LIZIZ.LIZJ;
                    }
                    if (c2197471AzR2 != null) {
                        c2197471AzR2.LJ(c2195941Awy.LIZIZ.LIZ, str, c2195941Awy.LIZLLL);
                    }
                    InterfaceC2195321Avy interfaceC2195321Avy2 = (InterfaceC2195321Avy) C1909107dp.LIZJ(InterfaceC2195321Avy.class, null);
                    interfaceC2195321Avy2.setSuccess(Boolean.FALSE);
                    interfaceC2195321Avy2.setErrorCode(Integer.valueOf(c2195941Awy.LIZIZ.LIZ));
                    interfaceC2195321Avy2.setErrorMsg(str);
                    C1232850iBf c1232850iBf2 = c2195941Awy.LIZLLL;
                    if (c1232850iBf2 != null) {
                        num = c1232850iBf2.LIZJ;
                    }
                    interfaceC2195321Avy2.setSubErrorCode(num);
                    completionBlock2.onSuccess(interfaceC2195321Avy2, "");
                    if (c2197471AzR2 == null) {
                        return;
                    }
                    c2197471AzR2.LJII();
                }
            }
        };
        if (activityLIZIZ != null) {
            new HashMap();
            SchemaParserData schemaParserData = C2195221Avo.LJII;
            if (schemaParserData != null) {
                mapLJ = schemaParserData.LIZLLL();
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            SchemaParserData schemaParserData2 = C2195221Avo.LJII;
            if (schemaParserData2 == null) {
                strLIZ = "";
            } else {
                strLIZ = schemaParserData2.LIZ();
            }
            IMinisPaymentService iMinisPaymentServiceLIZJ = MinisPaymentService.LIZJ();
            C2197361AzG c2197361AzG = new C2197361AzG(strLIZ, 2);
            try {
                Map<String, Object> logExtra = interfaceC2195361Aw2.getLogExtra();
                if (logExtra != null && (setKeySet = logExtra.keySet()) != null) {
                    for (String str : setKeySet) {
                        Map<String, Object> logExtra2 = interfaceC2195361Aw2.getLogExtra();
                        if (logExtra2 == null || (obj = logExtra2.get(str)) == null || (string = obj.toString()) == null) {
                            string = "";
                        }
                        c2197361AzG.LIZIZ.put(str, string);
                    }
                }
                for (Map.Entry<String, String> entry : mapLJ.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (value != null) {
                        c2197361AzG.LIZIZ.put(key, value);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                e.getMessage();
            }
            c259800zU.element = iMinisPaymentServiceLIZJ.LIZIZ(activityLIZIZ, c2197361AzG, r8);
            Activity activityLIZ = C06MM.LIZ(activityLIZIZ);
            if (activityLIZ != null) {
                final C1B0L c1b0l = new C1B0L();
                if (c1b0l.LIZ()) {
                    C1B0S c1b0s = new C1B0S() { // from class: X.1AwB
                        @Override // X.C1B0S
                        public final void LIZ() {
                            C2197471AzR c2197471AzR;
                            C1B0L c1b0l2 = c1b0l;
                            InterfaceC2195361Aw2 interfaceC2195361Aw22 = interfaceC2195361Aw2;
                            CompletionBlock<InterfaceC2195321Avy> completionBlock2 = completionBlock;
                            C2197471AzR c2197471AzR2 = c259800zU.element;
                            c1b0l2.getClass();
                            int i = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onRechargeSelectCancel, params:");
                            sbLIZ.append(interfaceC2195361Aw22);
                            C2188811AlT.LIZIZ(sbLIZ);
                            C1232850iBf c1232850iBf = C2197731Azr.LJIIJ;
                            InterfaceC2195321Avy interfaceC2195321Avy = (InterfaceC2195321Avy) C1909107dp.LIZJ(InterfaceC2195321Avy.class, null);
                            Boolean bool = Boolean.FALSE;
                            interfaceC2195321Avy.setSuccess(bool);
                            InterfaceC2195411Aw7 interfaceC2195411Aw7 = (InterfaceC2195411Aw7) C1909107dp.LIZJ(InterfaceC2195411Aw7.class, null);
                            interfaceC2195321Avy.setSuccess(bool);
                            interfaceC2195321Avy.setErrorCode(Integer.valueOf(c1232850iBf.LIZ));
                            interfaceC2195321Avy.setErrorMsg(c1232850iBf.LIZIZ);
                            interfaceC2195321Avy.setData(interfaceC2195411Aw7);
                            completionBlock2.onSuccess(interfaceC2195321Avy, "");
                            if (!(c2197471AzR2 instanceof C2197471AzR) || (c2197471AzR = c2197471AzR2) == null) {
                                return;
                            }
                            c2197471AzR.LJII();
                        }

                        @Override // X.C1B0S
                        public final void LIZJ() {
                            C2197471AzR c2197471AzR = c259800zU.element;
                            if (c2197471AzR != null) {
                                c2197471AzR.LJIILL(interfaceC2195361Aw2.getTierId());
                            }
                        }

                        @Override // X.C1B0S
                        public final void LIZIZ(M10nMockDebugErrorInfo m10nMockDebugErrorInfo) {
                            C2197471AzR c2197471AzR;
                            C1B0L c1b0l2 = c1b0l;
                            CompletionBlock<InterfaceC2195321Avy> completionBlock2 = completionBlock;
                            C2197471AzR c2197471AzR2 = c259800zU.element;
                            c1b0l2.getClass();
                            int i = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onRechargeSelectFail, debugErrorInfo:");
                            sbLIZ.append(m10nMockDebugErrorInfo);
                            C2188811AlT.LIZIZ(sbLIZ);
                            InterfaceC2195321Avy interfaceC2195321Avy = (InterfaceC2195321Avy) C1909107dp.LIZJ(InterfaceC2195321Avy.class, null);
                            Boolean bool = Boolean.FALSE;
                            interfaceC2195321Avy.setSuccess(bool);
                            InterfaceC2195411Aw7 interfaceC2195411Aw7 = (InterfaceC2195411Aw7) C1909107dp.LIZJ(InterfaceC2195411Aw7.class, null);
                            interfaceC2195321Avy.setSuccess(bool);
                            int i2 = m10nMockDebugErrorInfo.errorCode;
                            if (i2 == null) {
                                i2 = 0;
                            }
                            interfaceC2195321Avy.setErrorCode(i2);
                            interfaceC2195321Avy.setErrorMsg(m10nMockDebugErrorInfo.errorMsg);
                            interfaceC2195321Avy.setData(interfaceC2195411Aw7);
                            completionBlock2.onSuccess(interfaceC2195321Avy, "");
                            if ((c2197471AzR2 instanceof C2197471AzR) && (c2197471AzR = c2197471AzR2) != null) {
                                c2197471AzR.LJII();
                            }
                        }
                    };
                    c1b0l.LIZIZ = c1b0s;
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setSelectResultCallback, selectResultCallback:");
                    sbLIZ.append(c1b0s);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c1b0l.LIZIZ(activityLIZ);
                    return;
                }
            }
            C2197471AzR c2197471AzR = (C2197471AzR) c259800zU.element;
            if (c2197471AzR != null) {
                c2197471AzR.LJIILL(interfaceC2195361Aw2.getTierId());
            }
        }
    }

    @Override // X.AbstractC1549150qPp
    public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        LIZJ((InterfaceC2195361Aw2) xBaseParamModel, completionBlock);
    }
}
