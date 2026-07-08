package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostLogDepend;

/* JADX INFO: renamed from: X.1B1G, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B1G extends C1B1E {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        IHostLogDepend iHostLogDepend;
        C1B1H c1b1h = (C1B1H) xBaseParamModel;
        String label = c1b1h.getLabel();
        if (label.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, -3, "label in the params is empty", null, 4);
            return;
        }
        String tag = c1b1h.getTag();
        if (tag.length() == 0) {
            C2382909Vj.LIZ(completionBlock, -3, "tag in the params is empty", null, 4);
            return;
        }
        C1064320dnq c1064320dnq = new C1064320dnq(label, tag, c1b1h.getRefer(), c1b1h.getGroupID(), c1b1h.getCreativeID(), c1b1h.getLogExtra(), c1b1h.getExtraParams());
        C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
        if (c1874950ytJ == null || (iHostLogDepend = c1874950ytJ.LJ) == null) {
            return;
        }
        iHostLogDepend.handleReportADLog(this.IBridgeSdkContext, getName(), c1064320dnq, new InterfaceC1064360dnu() { // from class: X.1B1C
            @Override // X.InterfaceC1064360dnu
            public final void LJIIJ(String str) {
                C2382909Vj.LIZ(completionBlock, 0, str, null, 4);
            }

            @Override // X.InterfaceC1064360dnu
            public final void onSuccess(String str) {
                completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C1B1D.class, null), str);
            }
        }, enumC1063300dmC);
    }
}
