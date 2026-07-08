package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0Qfn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676250Qfn extends AbstractC676260Qfo {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        InterfaceC494301wD interfaceC494301wDLIZ;
        InterfaceC676270Qfp interfaceC676270Qfp = (InterfaceC676270Qfp) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null && (interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(view, null), VerticalSearchAbility.class, null)) != null) {
            C1421105hJ.LIZIZ(interfaceC494301wDLIZ, new AwS547S0100000_3(completionBlock, (CompletionBlock<Object>) 111), new AwS589S0100000_10(interfaceC676270Qfp, 460));
        }
    }
}
