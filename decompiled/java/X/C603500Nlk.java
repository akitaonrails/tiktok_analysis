package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0Nlk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C603500Nlk extends AbstractC603490Nlj {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        InterfaceC494301wD interfaceC494301wDLIZ;
        InterfaceC603510Nll interfaceC603510Nll = (InterfaceC603510Nll) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null && (interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(view, null), VerticalSearchAbility.class, null)) != null) {
            C1421105hJ.LIZIZ(interfaceC494301wDLIZ, new AwS547S0100000_3(completionBlock, (CompletionBlock<Object>) 112), new AwS588S0100000_9(interfaceC603510Nll, 503));
        }
    }
}
