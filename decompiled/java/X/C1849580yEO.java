package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yEO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849580yEO extends AbstractC1849540yEK {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C1882810z5z c1882810z5zHU0;
        InterfaceC1849570yEN interfaceC1849570yEN = (InterfaceC1849570yEN) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null) {
            IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
            if (iGamePartnershipService != null) {
                c1882810z5zHU0 = iGamePartnershipService.HU0();
            } else {
                c1882810z5zHU0 = null;
            }
            String str = "";
            if (c1882810z5zHU0 != null) {
                boolean zLJFF = Intrinsics.LJFF(interfaceC1849570yEN.getDataType(), "COMMON");
                boolean zLJFF2 = Intrinsics.LJFF(interfaceC1849570yEN.getType(), "GET");
                Intrinsics.LJFF(interfaceC1849570yEN.getType(), "EVENT");
                interfaceC1849570yEN.getEventParams();
                String keyPath = interfaceC1849570yEN.getKeyPath();
                String value = interfaceC1849570yEN.getValue();
                if (value == null) {
                    value = "";
                }
                Pair pairLIZIZ = C1882810z5z.LIZIZ(containerID, keyPath, zLJFF, value, zLJFF2);
                if (pairLIZIZ != null) {
                    if (((Boolean) pairLIZIZ.getFirst()).booleanValue()) {
                        InterfaceC1849550yEL interfaceC1849550yEL = (InterfaceC1849550yEL) C1909107dp.LIZJ(InterfaceC1849550yEL.class, null);
                        interfaceC1849550yEL.setResult((String) pairLIZIZ.getSecond());
                        completionBlock.onSuccess(interfaceC1849550yEL, "");
                        return;
                    } else {
                        String str2 = (String) pairLIZIZ.getSecond();
                        if (str2 != null) {
                            str = str2;
                        }
                    }
                }
            }
            C2382909Vj.LIZ(completionBlock, -1, str, null, 4);
        }
    }
}
