package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ddD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057730ddD extends AbstractC1057710ddB {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1057720ddC interfaceC1057720ddC = (InterfaceC1057720ddC) xBaseParamModel;
        ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
        if (iTouchPointModuleService == null) {
            C2382909Vj.LIZ(completionBlock, 1, "client code error", null, 4);
        } else {
            iTouchPointModuleService.LJIJJ(interfaceC1057720ddC.getPopupIdentifier(), interfaceC1057720ddC.getPageIdentifier(), interfaceC1057720ddC.getSchema(), Intrinsics.LJFF(interfaceC1057720ddC.getShowImmediately(), Boolean.TRUE), interfaceC1057720ddC.getLogExtra(), new AwS595S0100000_16(completionBlock, (CompletionBlock<InterfaceC1057700ddA>) 44));
        }
    }
}
