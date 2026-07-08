package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS279S0300000_35;

/* JADX INFO: renamed from: X.1E9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2276751E9p extends AbstractC2276731E9n {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC2276741E9o interfaceC2276741E9o = (InterfaceC2276741E9o) xBaseParamModel;
        String actionType = interfaceC2276741E9o.getActionType();
        interfaceC2276741E9o.getScene();
        C500260Jjc.LJJLIIIJILLIZJL(new AwS279S0300000_35(new C2276771E9r(this, completionBlock), this, new C914350Ztx(actionType, interfaceC2276741E9o.getAutoMatchScene(), interfaceC2276741E9o.getAutoMatchEntrance(), interfaceC2276741E9o.getPoolID(), interfaceC2276741E9o.getExtra()), 7));
    }
}
