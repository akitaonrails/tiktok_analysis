package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS109S0100000_9;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS18S0600000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C606280NqE extends AbstractC606290NqF {
    public static void LIZJ(Looper looper, Function0 function0) {
        if (!Intrinsics.LJFF(Looper.myLooper(), looper) && looper != null) {
            C786410Ut5.LJJZZIII(new BPEAHandler(looper), new ARunnableS109S0100000_9(function0, 197));
        } else {
            function0.invoke();
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC606310NqH interfaceC606310NqH = (InterfaceC606310NqH) xBaseParamModel;
        boolean z = false;
        if (interfaceC606310NqH.getEventName().length() == 0) {
            z = true;
        }
        String containerID = null;
        if (z) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC606300NqG.class, containerID);
            InterfaceC606300NqG interfaceC606300NqG = (InterfaceC606300NqG) xBaseModelLIZJ;
            interfaceC606300NqG.setCode(0);
            interfaceC606300NqG.setMsg("empty event name");
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        if (!C606170Nq3.LIZ(interfaceC606310NqH.getType())) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC606300NqG.class, containerID);
            InterfaceC606300NqG interfaceC606300NqG2 = (InterfaceC606300NqG) xBaseModelLIZJ2;
            interfaceC606300NqG2.setCode(0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid type ");
            sbLIZ.append(interfaceC606310NqH.getType());
            interfaceC606300NqG2.setMsg(C2188811AlT.LIZIZ(sbLIZ));
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
        if (interfaceC634840OvC3 == null) {
            XBaseModel xBaseModelLIZJ3 = C1909107dp.LIZJ(InterfaceC606300NqG.class, null);
            InterfaceC606300NqG interfaceC606300NqG3 = (InterfaceC606300NqG) xBaseModelLIZJ3;
            interfaceC606300NqG3.setCode(0);
            interfaceC606300NqG3.setMsg("bridge context is empty");
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ3, "");
            return;
        }
        InterfaceC606320NqI interfaceC606320NqI = (InterfaceC606320NqI) interfaceC634840OvC3.LIZIZ(InterfaceC606320NqI.class);
        if (interfaceC606320NqI == null) {
            InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
            if (interfaceC634840OvC4 != null) {
                containerID = interfaceC634840OvC4.getContainerID();
            }
            XBaseModel xBaseModelLIZJ4 = C1909107dp.LIZJ(InterfaceC606300NqG.class, containerID);
            InterfaceC606300NqG interfaceC606300NqG4 = (InterfaceC606300NqG) xBaseModelLIZJ4;
            interfaceC606300NqG4.setCode(0);
            interfaceC606300NqG4.setMsg("event center not registered");
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ4, "");
            return;
        }
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        AwS18S0600000_9 awS18S0600000_9 = new AwS18S0600000_9(interfaceC634840OvC3, (InterfaceC634840OvC) this, (C606280NqE) interfaceC606310NqH, (InterfaceC606310NqH) interfaceC606320NqI, (InterfaceC606320NqI) Looper.myLooper(), (Looper) completionBlock, (CompletionBlock<InterfaceC606300NqG>) 0);
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            awS18S0600000_9.invoke();
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS103S0100000_3((Object) awS18S0600000_9, 118));
        }
    }
}
