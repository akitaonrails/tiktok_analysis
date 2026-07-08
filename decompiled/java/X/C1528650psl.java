package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0psl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528650psl extends C09AY implements InterfaceC1631620sYq<String, Integer, String, Unit> {
    public final /* synthetic */ C1529970put LL;
    public final /* synthetic */ CompletionBlock<InterfaceC1528660psm> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1528650psl(C1529970put c1529970put, CompletionBlock<InterfaceC1528660psm> completionBlock) {
        super(3);
        this.LL = c1529970put;
        this.LLILLJJLI = completionBlock;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, Integer num, String str2) {
        int iIntValue;
        String str3 = str;
        Integer num2 = num;
        String str4 = str2;
        String containerID = null;
        if (C1948507kB.LIZ(str3) && num2 != null && num2.intValue() == 0) {
            InterfaceC634840OvC interfaceC634840OvC = this.LL.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            InterfaceC1528660psm interfaceC1528660psm = (InterfaceC1528660psm) C1909107dp.LIZJ(InterfaceC1528660psm.class, containerID);
            interfaceC1528660psm.setPhoneNumber(str3);
            this.LLILLJJLI.onSuccess(interfaceC1528660psm, "");
        } else {
            CompletionBlock<InterfaceC1528660psm> completionBlock = this.LLILLJJLI;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = -10000;
            }
            if (str4 == null) {
                str4 = "unknown error";
            }
            C2382909Vj.LIZ(completionBlock, iIntValue, str4, null, 4);
        }
        return Unit.LIZ;
    }
}
