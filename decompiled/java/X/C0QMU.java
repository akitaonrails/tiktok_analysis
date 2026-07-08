package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.middle.IntermediateAbility;

/* JADX INFO: renamed from: X.0QMU, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QMU extends C0QMW {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        IntermediateAbility intermediateAbility;
        String containerID;
        try {
            String showedSuggestWords = ((C0QMY) xBaseParamModel).getShowedSuggestWords();
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null && (intermediateAbility = (IntermediateAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IntermediateAbility.class, null)) != null) {
                intermediateAbility.WF2(showedSuggestWords);
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID = null;
                }
                completionBlock.onSuccess((InterfaceC669020QMa) C1909107dp.LIZJ(InterfaceC669020QMa.class, containerID), "");
                return;
            }
            throw new IllegalStateException("vscope failed");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2382909Vj.LIZ(completionBlock, 0, String.valueOf(e.getMessage()), null, 4);
        }
    }
}
