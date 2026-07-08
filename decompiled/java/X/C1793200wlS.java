package X;

import android.app.Activity;
import android.os.Build;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0wlS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1793200wlS extends AbstractC1793180wlQ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Boolean boolValueOf;
        boolean zIsInMultiWindowMode;
        Activity activityLIZLLL;
        InterfaceC1793190wlR interfaceC1793190wlR = (InterfaceC1793190wlR) C1909107dp.LIZJ(InterfaceC1793190wlR.class, null);
        if (Build.VERSION.SDK_INT >= 24) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
                zIsInMultiWindowMode = activityLIZLLL.isInMultiWindowMode();
            } else {
                zIsInMultiWindowMode = false;
            }
            boolValueOf = Boolean.valueOf(zIsInMultiWindowMode);
        } else {
            boolValueOf = Boolean.FALSE;
        }
        interfaceC1793190wlR.setInMultiWindowMode(boolValueOf);
        completionBlock.onSuccess(interfaceC1793190wlR, "");
    }
}
