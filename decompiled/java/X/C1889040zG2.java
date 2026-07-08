package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.AwS60S0010000_17;

/* JADX INFO: renamed from: X.0zG2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1889040zG2 extends AbstractC1889030zG1 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean zBooleanValue;
        Boolean visible = ((InterfaceC1889050zG3) xBaseParamModel).getVisible();
        if (visible != null) {
            zBooleanValue = visible.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new AwS60S0010000_17(zBooleanValue, 0));
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1889060zG4.class, null), "");
    }
}
