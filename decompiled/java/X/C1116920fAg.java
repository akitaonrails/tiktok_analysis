package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fAg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116920fAg extends AbstractC1116930fAh {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object objLIZIZ;
        InterfaceC1116940fAi interfaceC1116940fAi = (InterfaceC1116940fAi) xBaseParamModel;
        InterfaceC1116950fAj interfaceC1116950fAj = (InterfaceC1116950fAj) C1909107dp.LIZJ(InterfaceC1116950fAj.class, null);
        Object objLJFF = C1106750euH.LIZ.LJFF(interfaceC1116940fAi.getPath(), null, interfaceC1116940fAi.getParameters());
        try {
            C1297550js1 c1297550js1 = C1297550js1.LIZ;
            JSONObject jSONObject = new JSONObject(String.valueOf(objLJFF));
            c1297550js1.getClass();
            objLIZIZ = C1297550js1.LIZIZ(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            objLIZIZ = "";
        }
        interfaceC1116950fAj.setResponse(C2097908Jt.LIZJ(new Pair("data", objLIZIZ)));
        completionBlock.onSuccess(interfaceC1116950fAj, "");
    }
}
