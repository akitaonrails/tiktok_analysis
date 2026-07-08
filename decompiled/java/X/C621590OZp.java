package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0OZp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621590OZp extends AbstractC621570OZn {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String aid;
        InterfaceC621600OZq interfaceC621600OZq = (InterfaceC621600OZq) xBaseParamModel;
        List<String> keys = interfaceC621600OZq.getKeys();
        String awemeID = interfaceC621600OZq.getAwemeID();
        C621610OZr.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Aweme aweme = C621610OZr.LIZIZ.get(awemeID);
        if (aweme != null && ((aid = aweme.getAid()) == null || aid.equals(awemeID))) {
            for (String str : keys) {
                try {
                    Object objOpt = new JSONObject(C7740030o.LIZ().getGson().LJIILL(aweme)).opt(str);
                    if (objOpt != null) {
                        linkedHashMap.put(str, objOpt);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2344809Gs.LJ("getAwemeData failed");
                }
            }
        }
        InterfaceC621580OZo interfaceC621580OZo = (InterfaceC621580OZo) C1909107dp.LIZJ(InterfaceC621580OZo.class, null);
        interfaceC621580OZo.setAwemeItems(linkedHashMap);
        completionBlock.onSuccess(interfaceC621580OZo, "");
    }
}
