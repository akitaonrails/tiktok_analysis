package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS236S0300000_27;

/* JADX INFO: renamed from: X.0wxJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1800550wxJ extends AbstractC1800540wxI {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        InterfaceC1800560wxK interfaceC1800560wxK = (InterfaceC1800560wxK) xBaseParamModel;
        AnonymousClass0112 anonymousClass0112 = AnonymousClass0112.LIZ;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        String roomId = interfaceC1800560wxK.getRoomId();
        String string = interfaceC1800560wxK.getSizeMb().toString();
        AwS236S0300000_27 awS236S0300000_27 = new AwS236S0300000_27(interfaceC1800560wxK, (InterfaceC1800560wxK) this, (C1800550wxJ) completionBlock, (CompletionBlock<InterfaceC1800530wxH>) 24);
        anonymousClass0112.getClass();
        AnonymousClass0112.LIZ(activityLIZLLL, roomId, string, awS236S0300000_27);
    }
}
