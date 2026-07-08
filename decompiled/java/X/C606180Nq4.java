package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.lynx.tasm.LynxView;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C606180Nq4 extends AbstractC606190Nq5 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        String templateUrl;
        LynxView lynxView;
        InterfaceC606200Nq6 interfaceC606200Nq6 = (InterfaceC606200Nq6) xBaseParamModel;
        if (interfaceC606200Nq6.getEventName().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, 0, "empty event name", null, 4);
            return;
        }
        if (!C606170Nq3.LIZ(interfaceC606200Nq6.getType())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid type ");
            sbLIZ.append(interfaceC606200Nq6.getType());
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null) {
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZIZ();
            C2382909Vj.LIZ(completionBlock, 0, "bridge context is empty", null, 4);
            return;
        }
        InterfaceC606320NqI interfaceC606320NqI = (InterfaceC606320NqI) interfaceC634840OvC.LIZIZ(InterfaceC606320NqI.class);
        if (interfaceC606320NqI == null) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ecMixMallRegisterObserver error, bridgeCenter returns null, url=");
            View view = interfaceC634840OvC.getView();
            if ((view instanceof LynxView) && (lynxView = (LynxView) view) != null) {
                templateUrl = lynxView.getTemplateUrl();
            } else {
                templateUrl = null;
            }
            sbLIZ2.append(templateUrl);
            sbLIZ2.append(", thread=");
            sbLIZ2.append(C786410Ut5.u3());
            C2188811AlT.LIZIZ(sbLIZ2);
            c599820Nfo.getClass();
            C599820Nfo.LIZIZ();
            C2382909Vj.LIZ(completionBlock, 0, "bridge center not registered", null, 4);
            return;
        }
        AwS410S0200000_9 awS410S0200000_9 = new AwS410S0200000_9(completionBlock, (CompletionBlock<InterfaceC606210Nq7>) this, (C606180Nq4) 98);
        String type = interfaceC606200Nq6.getType();
        if (Intrinsics.LJFF(type, EnumC606160Nq2.METHOD.getValue())) {
            interfaceC606320NqI.LJIIJ(interfaceC634840OvC, interfaceC606200Nq6.getEventName());
            awS410S0200000_9.invoke();
        } else {
            if (!Intrinsics.LJFF(type, EnumC606160Nq2.EVENT.getValue())) {
                return;
            }
            if (interfaceC606320NqI.LJIIJJI(interfaceC634840OvC, interfaceC606200Nq6.getEventName()) != null) {
                awS410S0200000_9.invoke();
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("duplicate subscribe event for `");
            sbLIZ3.append(interfaceC606200Nq6.getEventName());
            sbLIZ3.append('`');
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ3), null, 4);
        }
    }
}
