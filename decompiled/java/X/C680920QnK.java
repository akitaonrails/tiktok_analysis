package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QnK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C680920QnK extends AbstractC680940QnM {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object c098200Yq;
        String containerID;
        String containerID2;
        String containerID3;
        InterfaceC680930QnL interfaceC680930QnL = (InterfaceC680930QnL) xBaseParamModel;
        String str = "";
        try {
            String key = interfaceC680930QnL.getKey();
            String action = interfaceC680930QnL.getAction();
            if (Intrinsics.LJFF(action, "get")) {
                if (key != null && key.length() != 0) {
                    String strLIZLLL = C341050DYp.LIZLLL(key);
                    InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                    if (interfaceC634840OvC != null) {
                        containerID3 = interfaceC634840OvC.getContainerID();
                    } else {
                        containerID3 = null;
                    }
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC680950QnN.class, containerID3);
                    ((InterfaceC680950QnN) xBaseModelLIZJ).setUserActData(strLIZLLL);
                    completionBlock.onSuccess((InterfaceC680950QnN) xBaseModelLIZJ, "");
                    return;
                }
                C2232408os c2232408os = C341050DYp.LIZ;
                String strLIZ = C341050DYp.LIZ(Integer.valueOf(C0QCT.LIZ()));
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID2 = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID2 = null;
                }
                XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC680950QnN.class, containerID2);
                ((InterfaceC680950QnN) xBaseModelLIZJ2).setUserActData(strLIZ);
                completionBlock.onSuccess((InterfaceC680950QnN) xBaseModelLIZJ2, "");
                return;
            }
            if (Intrinsics.LJFF(action, "append")) {
                try {
                    String id = interfaceC680930QnL.getId();
                    String actionType = interfaceC680930QnL.getActionType();
                    Map map = (Map) C7740030o.LIZ().getGson().LJIIIIZZ(interfaceC680930QnL.getActionParams(), new TypeToken<Map<String, Object>>() { // from class: X.04YR
                    }.getType());
                    if (C123100dR.LIZ(id)) {
                        C2232408os c2232408os2 = C341050DYp.LIZ;
                        if (actionType != null && map != null && id != null) {
                            C23250099c.LIZLLL(C817503Hh.LL, C341050DYp.LIZ, null, new C0CRY(actionType, id, map, null), 2);
                        }
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                    InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC3 != null) {
                        containerID = interfaceC634840OvC3.getContainerID();
                    } else {
                        containerID = null;
                    }
                    completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC680950QnN.class, containerID), "");
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    String message = thM5exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
                    return;
                }
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "something error", null, 4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message2 = e.getMessage();
            if (message2 != null) {
                str = message2;
            }
            C2382909Vj.LIZ(completionBlock, 0, str, null, 4);
        }
    }
}
