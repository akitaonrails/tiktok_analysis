package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostOpenDepend;

/* JADX INFO: renamed from: X.0zHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1890050zHf extends AbstractC1890060zHg {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        IHostOpenDepend iHostOpenDepend;
        InterfaceC1890090zHj interfaceC1890090zHj = (InterfaceC1890090zHj) xBaseParamModel;
        String channel = interfaceC1890090zHj.getChannel();
        if (channel.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, -3, "channel in the params is empty", null, 4);
            return;
        }
        String accessKey = interfaceC1890090zHj.getAccessKey();
        if (accessKey.length() == 0) {
            C2382909Vj.LIZ(completionBlock, -3, "accessKey in the params is empty", null, 4);
            return;
        }
        C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
        if (c1874950ytJ != null && (iHostOpenDepend = c1874950ytJ.LJIIJ) != null && iHostOpenDepend.getGeckoInfo(accessKey, channel, new InterfaceC1889950zHV() { // from class: X.0zHi
            @Override // X.InterfaceC1889950zHV
            public final void LIZ(C1890100zHk c1890100zHk) {
                CompletionBlock<InterfaceC1890070zHh> completionBlock2 = completionBlock;
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1890070zHh.class, null);
                InterfaceC1890070zHh interfaceC1890070zHh = (InterfaceC1890070zHh) xBaseModelLIZJ;
                interfaceC1890070zHh.setNeedUpdate(Boolean.valueOf(c1890100zHk.LIZ));
                Long l = c1890100zHk.LIZIZ;
                if (l != null) {
                    interfaceC1890070zHh.setTotalSize(Long.valueOf(l.longValue()));
                }
                String str = c1890100zHk.LIZJ;
                if (str != null) {
                    interfaceC1890070zHh.setVersion(str);
                }
                interfaceC1890070zHh.setLocalVersion(c1890100zHk.LIZLLL);
                interfaceC1890070zHh.setStatus(c1890100zHk.LJ);
                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            }
        }) != null) {
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "getGeckoInfo ability is not implemented", null, 4);
    }
}
