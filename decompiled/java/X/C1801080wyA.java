package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wyA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801080wyA extends AbstractC1801090wyB {
    public static Function2<? super Integer, ? super Function1<? super C1801100wyC, Unit>, Unit> LLILLL;

    public final void LIZJ(C09WX c09wx, CompletionBlock completionBlock) {
        String containerID = null;
        if (!C286810BLz.LIZ()) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1801070wy9.class);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
            InterfaceC1801070wy9 interfaceC1801070wy9 = (InterfaceC1801070wy9) xBaseModelLIZJ;
            interfaceC1801070wy9.setSuccess(Boolean.FALSE);
            interfaceC1801070wy9.setErrorMsg("Function not supported");
            interfaceC1801070wy9.setErrorCode(10004);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        if (!Intrinsics.LJFF(c09wx.getMethod(), 1) && !Intrinsics.LJFF(c09wx.getMethod(), 2)) {
            C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(InterfaceC1801070wy9.class);
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            XBaseModel xBaseModelLIZJ2 = C1549500qQO.LIZJ(containerID, c19719912DlLIZ2);
            InterfaceC1801070wy9 interfaceC1801070wy92 = (InterfaceC1801070wy9) xBaseModelLIZJ2;
            interfaceC1801070wy92.setSuccess(Boolean.FALSE);
            interfaceC1801070wy92.setErrorMsg("Invalid params");
            interfaceC1801070wy92.setErrorCode(10005);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
            return;
        }
        Function2<? super Integer, ? super Function1<? super C1801100wyC, Unit>, Unit> function2 = LLILLL;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(c09wx.getMethod().intValue()), new AwS393S0200000_27(completionBlock, (CompletionBlock<InterfaceC1801070wy9>) this, (C1801080wyA) 86));
        }
    }

    @Override // X.AbstractC1549150qPp
    public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        LIZJ((C09WX) xBaseParamModel, completionBlock);
    }
}
