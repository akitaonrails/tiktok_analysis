package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;

/* JADX INFO: renamed from: X.0TVm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747920TVm extends AbstractC747900TVk {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        int i;
        InterfaceC747910TVl interfaceC747910TVl = (InterfaceC747910TVl) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            C1544050qHb c1544050qHb = C1544050qHb.LIZ;
            String jsbSecureDataflowId = interfaceC747910TVl.getJsbSecureDataflowId();
            String name = getName();
            c1544050qHb.getClass();
            C443120HZe c443120HZeLIZ = C1544050qHb.LIZ(jsbSecureDataflowId, name);
            Integer num = (Integer) c443120HZeLIZ.getSecond();
            if (num == null) {
                C2382909Vj.LIZ(completionBlock, 0, (String) c443120HZeLIZ.getThird(), null, 4);
                return;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC747880TVi.class, null);
            InterfaceC747880TVi interfaceC747880TVi = (InterfaceC747880TVi) xBaseModelLIZJ;
            if (BAProfilePageServiceImpl.LJIIL().LJ(context, interfaceC747910TVl.getType().intValue(), interfaceC747910TVl.getContent(), null, interfaceC747910TVl.getUid(), interfaceC747910TVl.getExtra(), num)) {
                i = 1;
            } else {
                i = 0;
            }
            interfaceC747880TVi.setCode(i);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        }
    }
}
