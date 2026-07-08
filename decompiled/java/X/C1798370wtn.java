package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0wtn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798370wtn extends AbstractC1798350wtl {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C1874950ytJ c1874950ytJ;
        IHostContextDepend iHostContextDepend;
        Context application;
        Set<String> setKeySet;
        Map<String, ?> all;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if ((interfaceC634840OvC == null || (application = interfaceC634840OvC.getContext()) == null) && ((c1874950ytJ = C1874950ytJ.LJIIL) == null || (iHostContextDepend = c1874950ytJ.LIZLLL) == null || (application = iHostContextDepend.getApplication()) == null)) {
            C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
            return;
        }
        SharedPreferences sharedPreferences = C1298630jtl.LIZ(application).LIZIZ;
        if (sharedPreferences == null || (all = sharedPreferences.getAll()) == null || (setKeySet = all.keySet()) == null) {
            setKeySet = C08CX.INSTANCE;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1798330wtj.class, null);
        ((InterfaceC1798330wtj) xBaseModelLIZJ).setKeys(C13LP.LLIIII(setKeySet));
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
