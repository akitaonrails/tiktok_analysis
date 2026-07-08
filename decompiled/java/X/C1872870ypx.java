package X;

import android.app.Application;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend;

/* JADX INFO: renamed from: X.0ypx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1872870ypx extends AbstractC1872880ypy {
    public static final /* synthetic */ int LLILLL = 0;

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Application application;
        IHostContextDepend iHostContextDepend;
        InterfaceC1872900yq0 interfaceC1872900yq0 = (InterfaceC1872900yq0) xBaseParamModel;
        C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
        if (c1874950ytJ != null && (iHostContextDepend = c1874950ytJ.LIZLLL) != null) {
            application = iHostContextDepend.getApplication();
        } else {
            application = null;
        }
        if (application == null) {
            C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
            return;
        }
        String key = interfaceC1872900yq0.getKey();
        if (key.length() == 0) {
            C2382909Vj.LIZ(completionBlock, -3, "Key in the params is empty", null, 4);
            return;
        }
        String biz = interfaceC1872900yq0.getBiz();
        if (biz == null) {
            biz = "";
        }
        C1298650jtn.LIZ(application, biz, key);
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1872920yq2.class, null), "");
    }
}
