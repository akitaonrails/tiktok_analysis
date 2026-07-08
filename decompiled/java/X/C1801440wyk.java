package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0wyk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801440wyk extends AbstractC1801460wym {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean zBooleanValue;
        View view;
        Activity activityLIZLLL;
        Context context;
        C1389890mGx c1389890mGx;
        Number position;
        InterfaceC1801450wyl interfaceC1801450wyl = (InterfaceC1801450wyl) xBaseParamModel;
        Boolean showTop = interfaceC1801450wyl.getShowTop();
        if (showTop != null) {
            zBooleanValue = showTop.booleanValue();
        } else {
            zBooleanValue = false;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        } else {
            view = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            activityLIZLLL = interfaceC634840OvC2.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
        if (interfaceC634840OvC3 != null) {
            context = interfaceC634840OvC3.getContext();
        } else {
            context = null;
        }
        if (view != null && activityLIZLLL != null && context != null) {
            if (zBooleanValue || ((position = interfaceC1801450wyl.getPosition()) != null && position.intValue() == 1)) {
                c1389890mGx = new C1389890mGx(view);
            } else {
                c1389890mGx = new C1389890mGx(activityLIZLLL);
            }
            c1389890mGx.LJIIJ(interfaceC1801450wyl.getText());
            c1389890mGx.LJIIJJI();
            InterfaceC1801470wyn interfaceC1801470wyn = (InterfaceC1801470wyn) C1909107dp.LIZJ(InterfaceC1801470wyn.class, null);
            interfaceC1801470wyn.setCode(1);
            completionBlock.onSuccess(interfaceC1801470wyn, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
    }
}
