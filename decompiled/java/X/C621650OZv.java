package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0OZv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621650OZv extends AbstractC621630OZt {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String aid;
        InterfaceC621660OZw interfaceC621660OZw = (InterfaceC621660OZw) xBaseParamModel;
        List<String> keys = interfaceC621660OZw.getKeys();
        String awemeID = interfaceC621660OZw.getAwemeID();
        C621670OZx.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Aweme aweme = C621670OZx.LIZIZ;
        if (aweme != null && ((aid = aweme.getAid()) == null || aid.equals(awemeID))) {
            for (String str : keys) {
                try {
                    Object objOpt = new JSONObject(C7740030o.LIZ().getGson().LJIILL(C621670OZx.LIZIZ)).opt(str);
                    if (objOpt != null) {
                        linkedHashMap.put(str, objOpt);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2344809Gs.LJ("getAwemeData failed");
                }
            }
        }
        InterfaceC621640OZu interfaceC621640OZu = (InterfaceC621640OZu) C1909107dp.LIZJ(InterfaceC621640OZu.class, null);
        interfaceC621640OZu.setAwemeItems(linkedHashMap);
        completionBlock.onSuccess(interfaceC621640OZu, "");
    }
}
