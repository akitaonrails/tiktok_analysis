package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.communication.SearchMusicMiddlePageScope;

/* JADX INFO: renamed from: X.0OBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615250OBf extends AbstractC615260OBg {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        Object ability;
        Boolean boolValueOf;
        String containerID;
        InterfaceC615280OBi interfaceC615280OBi = (InterfaceC615280OBi) xBaseParamModel;
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null) {
                C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJ(view, null), SearchMusicMiddlePageScope.class);
                if (c0qsjLIZJ != null) {
                    ability = c0qsjLIZJ.getAbility(InterfaceC615300OBk.class);
                } else {
                    ability = null;
                }
                if (!(ability instanceof InterfaceC615300OBk)) {
                    ability = null;
                }
                InterfaceC615300OBk interfaceC615300OBk = (InterfaceC615300OBk) ability;
                if (interfaceC615300OBk != null && (boolValueOf = Boolean.valueOf(interfaceC615300OBk.T0(interfaceC615280OBi.getShowedSuggestWords()))) != null) {
                    boolValueOf.booleanValue();
                    if (boolValueOf.booleanValue()) {
                        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                        if (interfaceC634840OvC2 != null) {
                            containerID = interfaceC634840OvC2.getContainerID();
                        } else {
                            containerID = null;
                        }
                        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC615270OBh.class, containerID);
                        ((InterfaceC615270OBh) xBaseModelLIZJ).setCode(1);
                        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                        return;
                    }
                    throw new IllegalStateException("trending not enabled");
                }
            }
            throw new NullPointerException("ability not found");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2382909Vj.LIZ(completionBlock, 0, String.valueOf(e.getMessage()), null, 4);
        }
    }
}
