package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.lynx.tasm.LynxView;

/* JADX INFO: renamed from: X.0vlY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1754820vlY extends AbstractC1754830vlZ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        View viewFindViewByName;
        boolean z;
        LynxView lynxView;
        InterfaceC1754840vla interfaceC1754840vla = (InterfaceC1754840vla) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        } else {
            view = null;
        }
        if ((view instanceof C1537720q7O) && (lynxView = (LynxView) view) != null) {
            viewFindViewByName = lynxView.findViewByName(interfaceC1754840vla.getElementName());
        } else {
            viewFindViewByName = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC1754840vla.getElementName());
        sbLIZ.append(" view ==null ");
        if (viewFindViewByName == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C1326490kch.LJI(C2188811AlT.LIZIZ(sbLIZ));
        if (viewFindViewByName != null) {
            C450720Hlu c450720Hlu = new C450720Hlu(viewFindViewByName.getContext());
            c450720Hlu.LLILZ = interfaceC1754840vla.getTipsMsg();
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZIZ = viewFindViewByName;
            c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
            c1391600mJi.LJIIIZ = true;
            c1391600mJi.LJIIL = true;
            c450720Hlu.LIZIZ().show();
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1754850vlb.class, null), "");
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("can not find view ");
        sbLIZ2.append(interfaceC1754840vla.getElementName());
        C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ2), null, 4);
    }
}
