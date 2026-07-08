package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS236S0300000_27;

/* JADX INFO: renamed from: X.0wxQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1800620wxQ extends AbstractC1800590wxN {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        InterfaceC1800610wxP interfaceC1800610wxP = (InterfaceC1800610wxP) xBaseParamModel;
        AnonymousClass0112 anonymousClass0112 = AnonymousClass0112.LIZ;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        String roomId = interfaceC1800610wxP.getRoomId();
        String string = interfaceC1800610wxP.getSizeMb().toString();
        AwS236S0300000_27 awS236S0300000_27 = new AwS236S0300000_27(interfaceC1800610wxP, (InterfaceC1800610wxP) this, (C1800620wxQ) completionBlock, (CompletionBlock<InterfaceC1800580wxM>) 25);
        anonymousClass0112.getClass();
        AnonymousClass0112.LIZ(activityLIZLLL, roomId, string, awS236S0300000_27);
    }
}
