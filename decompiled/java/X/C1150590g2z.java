package X;

import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionEnigmaResult;
import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionInput;
import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionMagicGiftResponse;
import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionResult;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g2z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1150590g2z {
    public final /* synthetic */ C1150600g30 LIZ;
    public final /* synthetic */ LiveCoinConsumptionInput LIZIZ;
    public final /* synthetic */ CompletionBlock<InterfaceC1150650g35> LIZJ;

    public final void LIZIZ(LiveCoinConsumptionResult liveCoinConsumptionResult) {
        String containerID;
        LiveCoinConsumptionEnigmaResult liveCoinConsumptionEnigmaResult;
        String str;
        this.LIZ.getClass();
        InterfaceC634840OvC interfaceC634840OvC = this.LIZ.IBridgeSdkContext;
        String containerID2 = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1150650g35.class, containerID);
        C1150600g30 c1150600g30 = this.LIZ;
        InterfaceC1150650g35 interfaceC1150650g35 = (InterfaceC1150650g35) xBaseModelLIZJ;
        interfaceC1150650g35.setStatusCode(Integer.valueOf(liveCoinConsumptionResult.statusCode));
        EnumC1150610g31 enumC1150610g31 = liveCoinConsumptionResult.sceneType;
        if (enumC1150610g31 != null) {
            int i = C1150580g2y.LIZ[enumC1150610g31.ordinal()];
            if (i != 1) {
                if (i == 2 && (liveCoinConsumptionEnigmaResult = liveCoinConsumptionResult.enigmaResult) != null && (str = liveCoinConsumptionEnigmaResult.customError) != null) {
                    interfaceC1150650g35.setEnigmaCustomError(str);
                }
            } else {
                InterfaceC634840OvC interfaceC634840OvC2 = c1150600g30.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID2 = interfaceC634840OvC2.getContainerID();
                }
                InterfaceC1150640g34 interfaceC1150640g34 = (InterfaceC1150640g34) C1909107dp.LIZJ(InterfaceC1150640g34.class, containerID2);
                HashMap<String, Boolean> map = C1150600g30.LLILLL;
                LiveCoinConsumptionMagicGiftResponse liveCoinConsumptionMagicGiftResponse = liveCoinConsumptionResult.magicGiftResult;
                if (liveCoinConsumptionMagicGiftResponse != null) {
                    interfaceC1150640g34.setMagicResultId(liveCoinConsumptionMagicGiftResponse.magicResultId);
                    interfaceC1150640g34.setMagicOptionId(liveCoinConsumptionMagicGiftResponse.magicOptionId);
                    interfaceC1150640g34.setImage(liveCoinConsumptionMagicGiftResponse.image);
                    interfaceC1150640g34.setGiftPrice(Long.valueOf(liveCoinConsumptionMagicGiftResponse.giftPrice));
                    interfaceC1150640g34.setExpireTimestamp(Long.valueOf(liveCoinConsumptionMagicGiftResponse.expireTimestamp));
                    interfaceC1150640g34.setResponseExtra(liveCoinConsumptionMagicGiftResponse.responseExtra);
                    interfaceC1150640g34.setContrast(Boolean.valueOf(liveCoinConsumptionMagicGiftResponse.isContrast));
                }
                interfaceC1150650g35.setMagicGiftResult(interfaceC1150640g34);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle success, input=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", result=");
        sbLIZ.append(liveCoinConsumptionResult);
        C20441214yg.LJIIIZ("LiveCoinConsumptionMethodImpl", C2188811AlT.LIZIZ(sbLIZ));
        CompletionBlock<InterfaceC1150650g35> completionBlock = this.LIZJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LiveCoinConsumptionSuccess: sceneType=");
        sbLIZ2.append(liveCoinConsumptionResult.sceneType);
        sbLIZ2.append(" , isFromJSB=");
        sbLIZ2.append(Boolean.valueOf(liveCoinConsumptionResult.isFromJSB));
        completionBlock.onSuccess(interfaceC1150650g35, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LIZ(LiveCoinConsumptionResult liveCoinConsumptionResult, Throwable th) {
        String containerID;
        LiveCoinConsumptionEnigmaResult liveCoinConsumptionEnigmaResult;
        String str;
        this.LIZ.getClass();
        InterfaceC634840OvC interfaceC634840OvC = this.LIZ.IBridgeSdkContext;
        String message = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        InterfaceC1150650g35 interfaceC1150650g35 = (InterfaceC1150650g35) C1909107dp.LIZJ(InterfaceC1150650g35.class, containerID);
        interfaceC1150650g35.setStatusCode(Integer.valueOf(liveCoinConsumptionResult.statusCode));
        interfaceC1150650g35.setMagicGiftResult(null);
        EnumC1150610g31 enumC1150610g31 = liveCoinConsumptionResult.sceneType;
        if (enumC1150610g31 != null && C1150580g2y.LIZ[enumC1150610g31.ordinal()] == 2 && (liveCoinConsumptionEnigmaResult = liveCoinConsumptionResult.enigmaResult) != null && (str = liveCoinConsumptionEnigmaResult.customError) != null) {
            interfaceC1150650g35.setEnigmaCustomError(str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle fail, input=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", result=");
        sbLIZ.append(liveCoinConsumptionResult);
        sbLIZ.append(", exception=");
        sbLIZ.append(th);
        C20441214yg.LJIIIZ("LiveCoinConsumptionMethodImpl", C2188811AlT.LIZIZ(sbLIZ));
        CompletionBlock<InterfaceC1150650g35> completionBlock = this.LIZJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LiveCoinConsumptionFail: sceneType=");
        sbLIZ2.append(liveCoinConsumptionResult.sceneType);
        sbLIZ2.append(" , isFromJSB=");
        sbLIZ2.append(Boolean.valueOf(liveCoinConsumptionResult.isFromJSB));
        sbLIZ2.append(", statusCode=");
        sbLIZ2.append(Integer.valueOf(liveCoinConsumptionResult.statusCode));
        sbLIZ2.append(", msg=");
        if (th != null) {
            message = th.getMessage();
        }
        sbLIZ2.append(message);
        completionBlock.onSuccess(interfaceC1150650g35, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public C1150590g2z(C1150600g30 c1150600g30, LiveCoinConsumptionInput liveCoinConsumptionInput, CompletionBlock<InterfaceC1150650g35> completionBlock) {
        this.LIZ = c1150600g30;
        this.LIZIZ = liveCoinConsumptionInput;
        this.LIZJ = completionBlock;
    }
}
