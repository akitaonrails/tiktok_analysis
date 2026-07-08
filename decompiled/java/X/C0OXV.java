package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0OXV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OXV extends C0OXX {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C0OXY c0oxy = (C0OXY) xBaseParamModel;
        List<String> keys = c0oxy.getKeys();
        c0oxy.getAwemeID();
        C619520ORq.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C619520ORq.LIZIZ != null) {
            for (String str : keys) {
                try {
                    Object objOpt = new JSONObject(C7740030o.LIZ().getGson().LJIILL(C619520ORq.LIZIZ)).opt(str);
                    if (objOpt != null) {
                        linkedHashMap.put(str, objOpt);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2344809Gs.LJ("getAwemeData failed");
                }
            }
        }
        C0OXW c0oxw = (C0OXW) C1909107dp.LIZJ(C0OXW.class, null);
        c0oxw.setAwemeItems(linkedHashMap);
        completionBlock.onSuccess(c0oxw, "");
    }
}
