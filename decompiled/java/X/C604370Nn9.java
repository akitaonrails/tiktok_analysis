package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.communication.ChooseSearchMusicScope;

/* JADX INFO: renamed from: X.0Nn9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C604370Nn9 extends AbstractC604350Nn7 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        InterfaceC604400NnC interfaceC604400NnC;
        String containerID;
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null && (interfaceC604400NnC = (InterfaceC604400NnC) C1558520qew.LIZIZ(C1558360qeg.LJ(view, null), C13LE.LIZ(ChooseSearchMusicScope.class), C13LE.LIZ(InterfaceC604400NnC.class))) != null) {
                interfaceC604400NnC.OP(true);
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID = null;
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC604360Nn8.class, containerID);
                ((InterfaceC604360Nn8) xBaseModelLIZJ).setCode(1);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                return;
            }
            throw new NullPointerException("ability not found");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2382909Vj.LIZ(completionBlock, 0, String.valueOf(e.getMessage()), null, 4);
        }
    }
}
