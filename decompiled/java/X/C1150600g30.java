package X;

import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionEnigmaParams;
import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionInput;
import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionMagicGiftParams;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.HashMap;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g30, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1150600g30 extends AbstractC1150630g33 {
    public static final HashMap<String, Boolean> LLILLL = new HashMap<>();

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        long jLongValue;
        Number productId;
        InterfaceC1150620g32 interfaceC1150620g32 = (InterfaceC1150620g32) xBaseParamModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle,  type = ");
        sbLIZ.append(enumC1063300dmC);
        sbLIZ.append(", sceneType = ");
        sbLIZ.append(interfaceC1150620g32.getSceneType());
        sbLIZ.append(", sceneSource=");
        sbLIZ.append(interfaceC1150620g32.getSceneSource());
        sbLIZ.append(", coinAmount=");
        sbLIZ.append(interfaceC1150620g32.getCoinAmount());
        sbLIZ.append(", retryTimes = ");
        sbLIZ.append(interfaceC1150620g32.getRetryTimes());
        sbLIZ.append(", magicGiftParams = ");
        sbLIZ.append(interfaceC1150620g32.getMagicGiftParams());
        C20441214yg.LIZIZ("LiveCoinConsumptionMethodImpl", C2188811AlT.LIZIZ(sbLIZ));
        HashMap<String, Boolean> map = LLILLL;
        if (map == null || map.isEmpty()) {
            String type = EnumC1150610g31.TYPE_MAGIC_GIFT_CREATE.getType();
            Boolean bool = Boolean.TRUE;
            map.put(type, bool);
            map.put(EnumC1150610g31.TYPE_JOIN_ENIGMA.getType(), bool);
        }
        String sceneType = interfaceC1150620g32.getSceneType();
        String sceneSource = interfaceC1150620g32.getSceneSource();
        int iIntValue = interfaceC1150620g32.getCoinAmount().intValue();
        int iIntValue2 = interfaceC1150620g32.getRetryTimes().intValue();
        boolean zLIZIZ = C176600m4.LIZIZ(map.get(sceneType));
        String containerID = null;
        LiveCoinConsumptionMagicGiftParams liveCoinConsumptionMagicGiftParams = null;
        if (zLIZIZ) {
            LiveCoinConsumptionInput liveCoinConsumptionInput = new LiveCoinConsumptionInput();
            liveCoinConsumptionInput.isFromJSB = true;
            EnumC1150610g31.Companion.getClass();
            EnumC1150610g31 enumC1150610g31 = EnumC1150610g31.TYPE_MAGIC_GIFT_CREATE;
            if (!Intrinsics.LJFF(sceneType, enumC1150610g31.getType())) {
                enumC1150610g31 = EnumC1150610g31.TYPE_JOIN_ENIGMA;
                if (!Intrinsics.LJFF(sceneType, enumC1150610g31.getType())) {
                    enumC1150610g31 = EnumC1150610g31.TYPE_UNKNOWN;
                }
            }
            liveCoinConsumptionInput.sceneType = enumC1150610g31;
            if (C500260Jjc.LJJIIZ(sceneSource)) {
                sceneType = sceneSource;
            }
            liveCoinConsumptionInput.sceneSource = sceneType;
            liveCoinConsumptionInput.coinAmount = iIntValue;
            liveCoinConsumptionInput.retryTimes = iIntValue2;
            InterfaceC1150660g36 magicGiftParams = interfaceC1150620g32.getMagicGiftParams();
            if (magicGiftParams != null) {
                liveCoinConsumptionMagicGiftParams = new LiveCoinConsumptionMagicGiftParams();
                liveCoinConsumptionMagicGiftParams.giftId = magicGiftParams.getGiftId().longValue();
                liveCoinConsumptionMagicGiftParams.magicGiftId = magicGiftParams.getMagicGiftId().longValue();
                String specificMagicResultId = magicGiftParams.getSpecificMagicResultId();
                String str = "";
                if (specificMagicResultId == null) {
                    specificMagicResultId = "";
                }
                liveCoinConsumptionMagicGiftParams.specificMagicResultId = specificMagicResultId;
                String requestExtra = magicGiftParams.getRequestExtra();
                if (requestExtra != null) {
                    str = requestExtra;
                }
                liveCoinConsumptionMagicGiftParams.requestExtra = str;
            }
            liveCoinConsumptionInput.magicGiftParams = liveCoinConsumptionMagicGiftParams;
            LiveCoinConsumptionEnigmaParams liveCoinConsumptionEnigmaParams = new LiveCoinConsumptionEnigmaParams();
            InterfaceC1150670g37 enigmaParams = interfaceC1150620g32.getEnigmaParams();
            if (enigmaParams != null && (productId = enigmaParams.getProductId()) != null) {
                jLongValue = productId.longValue();
            } else {
                jLongValue = 1;
            }
            liveCoinConsumptionEnigmaParams.productId = jLongValue;
            liveCoinConsumptionInput.enigmaParams = liveCoinConsumptionEnigmaParams;
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                interfaceC634840OvC.getContext();
            }
            liveCoinConsumptionInput.LIZ = new C1150590g2z(this, liveCoinConsumptionInput, completionBlock);
            C500260Jjc.LJJLIIIJILLIZJL(new AwS561S0100000_17(liveCoinConsumptionInput, 298));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handle error, sceneType not register, type = ");
        sbLIZ2.append(enumC1063300dmC);
        sbLIZ2.append(", sceneType = ");
        sbLIZ2.append(interfaceC1150620g32.getSceneType());
        sbLIZ2.append(", retryTimes = ");
        sbLIZ2.append(interfaceC1150620g32.getRetryTimes());
        sbLIZ2.append(", magicGiftParams = ");
        sbLIZ2.append(interfaceC1150620g32.getMagicGiftParams());
        C20441214yg.LJ("LiveCoinConsumptionMethodImpl", C2188811AlT.LIZIZ(sbLIZ2));
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        }
        InterfaceC1150650g35 interfaceC1150650g35 = (InterfaceC1150650g35) C1909107dp.LIZJ(InterfaceC1150650g35.class, containerID);
        interfaceC1150650g35.setStatusCode(-9);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("LiveCoinConsumptionFail: sceneType=");
        sbLIZ3.append(sceneType);
        sbLIZ3.append(" , isFromJSB=true, statusCode=-9");
        completionBlock.onFailure(-9, C2188811AlT.LIZIZ(sbLIZ3), interfaceC1150650g35);
    }
}
