package X;

import Y.ARunnableS103S0200000_34;
import android.app.Activity;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Awk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195801Awk extends AbstractC2195791Awj {
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());

    /* JADX WARN: Type inference failed for: r1v6, types: [T, X.1Awv] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1Awa] */
    public final void LIZJ(InterfaceC1052960dVW interfaceC1052960dVW, final CompletionBlock completionBlock) {
        String str;
        final Activity activityLIZIZ;
        Map<String, String> mapLJ;
        String strLIZ;
        Set<String> setKeySet;
        String string;
        Object obj;
        String tradeOrderId = interfaceC1052960dVW.getTradeOrderId();
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData == null || (str = schemaParserData.clientKey) == null) {
            str = "";
        }
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        final C259800zU c259800zU = new C259800zU();
        ?? r3 = new C1B09() { // from class: X.1Awa
            @Override // X.C1B09
            public final void LIZ(C2195941Awy c2195941Awy) {
                if (C123100dR.LIZ(c2195941Awy.LIZIZ.LIZJ)) {
                    C786410Ut5.LJJZZIII(this.LIZ.LLILLL, new ARunnableS103S0200000_34(activityLIZIZ, c2195941Awy, 16));
                }
            }

            @Override // X.C1B09
            public final void LIZIZ(C2195941Awy c2195941Awy) {
                boolean z;
                String str2;
                EnumC2197771Azv enumC2197771Azv;
                String str3 = c2195941Awy.LIZIZ.LIZJ;
                if (str3 == null || str3.length() == 0) {
                    str3 = c2195941Awy.LIZIZ.LIZIZ;
                }
                if (C123100dR.LIZ(c2195941Awy.LIZIZ.LIZJ)) {
                    C786410Ut5.LJJZZIII(this.LIZ.LLILLL, new ARunnableS103S0200000_34(activityLIZIZ, c2195941Awy, 15));
                }
                C2195911Awv c2195911Awv = c259800zU.element;
                if (c2195911Awv != null) {
                    c2195911Awv.LIZ.LJIIIZ(c2195941Awy);
                }
                C2195801Awk c2195801Awk = this.LIZ;
                CompletionBlock<InterfaceC2195741Awe> completionBlock2 = completionBlock;
                C2195911Awv c2195911Awv2 = c259800zU.element;
                c2195801Awk.getClass();
                Object obj2 = c2195941Awy.LIZJ.get("subscription_mock_debug_result");
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.LJFF(obj2, bool) || ((enumC2197771Azv = c2195941Awy.LIZ) != EnumC2197771Azv.IAP_PAY_CANCEL && enumC2197771Azv != EnumC2197771Azv.IAP_PAY_FAIL)) {
                    if (c2195941Awy.LIZ == EnumC2197771Azv.SUCCESS_RECHARGE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Integer num = null;
                    if (z) {
                        InterfaceC2195741Awe interfaceC2195741Awe = (InterfaceC2195741Awe) C1909107dp.LIZJ(InterfaceC2195741Awe.class, null);
                        interfaceC2195741Awe.setSuccess(bool);
                        InterfaceC2195881Aws interfaceC2195881Aws = (InterfaceC2195881Aws) C1909107dp.LIZJ(InterfaceC2195881Aws.class, null);
                        interfaceC2195881Aws.setTradeOrderId(String.valueOf(c2195941Awy.LIZJ.get("trade_order_id")));
                        interfaceC2195881Aws.setSubscriptionId(String.valueOf(c2195941Awy.LIZJ.get("subscription_id")));
                        interfaceC2195741Awe.setData(interfaceC2195881Aws);
                        if (c2195911Awv2 != null) {
                            c2195911Awv2.LIZ.LJFF();
                        }
                        completionBlock2.onSuccess(interfaceC2195741Awe, "");
                    } else {
                        C1232850iBf c1232850iBf = c2195941Awy.LIZLLL;
                        if (c1232850iBf == null || (str2 = c1232850iBf.LIZIZ) == null || str2.length() == 0) {
                            str2 = c2195941Awy.LIZIZ.LIZJ;
                        }
                        InterfaceC2195741Awe interfaceC2195741Awe2 = (InterfaceC2195741Awe) C1909107dp.LIZJ(InterfaceC2195741Awe.class, null);
                        interfaceC2195741Awe2.setSuccess(Boolean.FALSE);
                        interfaceC2195741Awe2.setErrorCode(Integer.valueOf(c2195941Awy.LIZIZ.LIZ));
                        interfaceC2195741Awe2.setErrorMsg(str2);
                        InterfaceC2195881Aws interfaceC2195881Aws2 = (InterfaceC2195881Aws) C1909107dp.LIZJ(InterfaceC2195881Aws.class, null);
                        interfaceC2195881Aws2.setTradeOrderId(String.valueOf(c2195941Awy.LIZJ.get("trade_order_id")));
                        interfaceC2195881Aws2.setSubscriptionId(String.valueOf(c2195941Awy.LIZJ.get("subscription_id")));
                        interfaceC2195741Awe2.setData(interfaceC2195881Aws2);
                        C1232850iBf c1232850iBf2 = c2195941Awy.LIZLLL;
                        if (c1232850iBf2 != null) {
                            num = c1232850iBf2.LIZJ;
                        }
                        interfaceC2195741Awe2.setSubErrorCode(num);
                        if (c2195911Awv2 != null) {
                            C2195931Awx c2195931Awx = c2195941Awy.LIZIZ;
                            c2195911Awv2.LIZ.LJ(c2195931Awx.LIZ, str2, c2195931Awx.LIZLLL, c2195941Awy.LIZLLL);
                        }
                        completionBlock2.onSuccess(interfaceC2195741Awe2, "");
                    }
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("JSB Result - ");
                sbLIZ.append(c2195941Awy.LIZ.name());
                sbLIZ.append(", ");
                sbLIZ.append(str3);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        };
        if (activityLIZIZ != null) {
            new HashMap();
            SchemaParserData schemaParserData2 = C2195221Avo.LJII;
            if (schemaParserData2 != null) {
                mapLJ = schemaParserData2.LIZLLL();
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            SchemaParserData schemaParserData3 = C2195221Avo.LJII;
            if (schemaParserData3 == null) {
                strLIZ = "";
            } else {
                strLIZ = schemaParserData3.LIZ();
            }
            C2197361AzG c2197361AzG = new C2197361AzG(strLIZ, 2);
            try {
                Map<String, Object> logExtra = interfaceC1052960dVW.getLogExtra();
                if (logExtra != null && (setKeySet = logExtra.keySet()) != null) {
                    for (String str2 : setKeySet) {
                        Map<String, Object> logExtra2 = interfaceC1052960dVW.getLogExtra();
                        if (logExtra2 == null || (obj = logExtra2.get(str2)) == null || (string = obj.toString()) == null) {
                            string = "";
                        }
                        c2197361AzG.LIZIZ.put(str2, string);
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
                String message = e.getMessage();
                if (message == null) {
                    message = "MinisRechargeMethodIDL logExtra error";
                }
                C1720106oR.LIZ("minis-MinisSubscriptionCreateMethodIDL", message);
            }
            C1378950lzJ.LIZ.getClass();
            ?? c2195911Awv = new C2195911Awv(activityLIZIZ, c2197361AzG, r3);
            c2195911Awv.LIZ.LJII(tradeOrderId, str);
            int i = C2187451AjH.LIZ;
            c259800zU.element = c2195911Awv;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle, params:");
        sbLIZ.append(interfaceC1052960dVW);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1549150qPp
    public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        LIZJ((InterfaceC1052960dVW) xBaseParamModel, completionBlock);
    }
}
