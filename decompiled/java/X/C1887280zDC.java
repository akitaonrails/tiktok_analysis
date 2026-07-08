package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.runtime.depend.DialogBuilder;
import com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zDC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887280zDC extends AbstractC1887300zDE {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        String confirmText;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        DialogInterfaceOnClickListenerC19332910kJ dialogInterfaceOnClickListenerC19332910kJ;
        DialogInterfaceOnCancelListenerC19332810kI dialogInterfaceOnCancelListenerC19332810kI;
        IHostStyleUIDepend iHostStyleUIDepend;
        InterfaceC1887290zDD interfaceC1887290zDD = (InterfaceC1887290zDD) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        Boolean boolShowDialog = null;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            if (interfaceC1887290zDD.getConfirmText().length() > 0) {
                confirmText = interfaceC1887290zDD.getConfirmText();
            } else {
                confirmText = "confirm";
            }
            String content = interfaceC1887290zDD.getContent();
            if (!(content instanceof String)) {
                content = null;
            }
            String str = "";
            if (content == null) {
                content = "";
            }
            String title = interfaceC1887290zDD.getTitle();
            if (!(title instanceof String) || title == null) {
                title = "";
            }
            Boolean boolValueOf = Boolean.valueOf(interfaceC1887290zDD.getShowCancel());
            if (boolValueOf != null) {
                zBooleanValue = boolValueOf.booleanValue();
            } else {
                zBooleanValue = false;
            }
            String cancelText = interfaceC1887290zDD.getCancelText();
            if ((cancelText instanceof String) && cancelText != null) {
                str = cancelText;
            }
            Boolean boolValueOf2 = Boolean.valueOf(interfaceC1887290zDD.getTapMaskToDismiss());
            if (boolValueOf2 != null) {
                zBooleanValue2 = boolValueOf2.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            DialogInterfaceOnClickListenerC19332910kJ dialogInterfaceOnClickListenerC19332910kJ2 = new DialogInterfaceOnClickListenerC19332910kJ(completionBlock, 3);
            if (zBooleanValue) {
                if (str.length() == 0) {
                    str = "cancel";
                }
                dialogInterfaceOnClickListenerC19332910kJ = new DialogInterfaceOnClickListenerC19332910kJ(completionBlock, 2);
            } else {
                str = null;
                dialogInterfaceOnClickListenerC19332910kJ = null;
            }
            if (zBooleanValue2) {
                dialogInterfaceOnCancelListenerC19332810kI = new DialogInterfaceOnCancelListenerC19332810kI(completionBlock, 4);
            } else {
                dialogInterfaceOnCancelListenerC19332810kI = null;
            }
            DialogBuilder dialogBuilder = new DialogBuilder(context, title, content, confirmText, dialogInterfaceOnClickListenerC19332910kJ2, str, dialogInterfaceOnClickListenerC19332910kJ, dialogInterfaceOnCancelListenerC19332810kI, zBooleanValue2);
            C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
            if (c1874950ytJ != null && (iHostStyleUIDepend = c1874950ytJ.LIZIZ) != null) {
                boolShowDialog = iHostStyleUIDepend.showDialog(dialogBuilder);
            }
            Intrinsics.LJFF(boolShowDialog, Boolean.TRUE);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
    }
}
