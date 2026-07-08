package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* JADX INFO: renamed from: X.0Njg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C602220Njg extends AbstractC602230Njh {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Map<String, ? extends Object> mapLJ;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Object obj = C602250Njj.LIZ;
        Object objLJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("minis_drama_player_config", n.class, obj);
        if (objLJIIIIZZ != null) {
            obj = objLJIIIIZZ;
        }
        String strLIZIZ = C309390CAv.LIZIZ(obj);
        if (strLIZIZ == null || (mapLJ = (Map) C309390CAv.LIZ(strLIZIZ, new TypeToken<Map<String, ? extends Object>>() { // from class: X.00WE
        }.getType())) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        InterfaceC602210Njf interfaceC602210Njf = (InterfaceC602210Njf) C1909107dp.LIZJ(InterfaceC602210Njf.class, null);
        interfaceC602210Njf.setData(mapLJ);
        completionBlock.onSuccess(interfaceC602210Njf, "");
    }
}
