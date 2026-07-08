package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TRM, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TRM extends C0TRO {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        long jLongValue;
        String containerID;
        InterfaceC747120TSk interfaceC747120TSk = (InterfaceC747120TSk) xBaseParamModel;
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        Number delay = interfaceC747120TSk.getDelay();
        if (delay != null) {
            jLongValue = delay.longValue();
        } else {
            jLongValue = 0;
        }
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(interfaceC747120TSk, 896);
        if (jLongValue > 0) {
            C1906580ziK.LIZJ().LJIIJ().LJLIIL(1L).LJJLJLI(new C515801zg(bPEAHandler, awS556S0100000_12, 60));
        } else {
            C786410Ut5.LJJZZIII(bPEAHandler, new RunnableC514801zW(awS556S0100000_12, 156));
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0TRN.class, containerID), "");
    }
}
