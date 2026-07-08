package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0yGV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850890yGV extends AbstractC1850910yGX {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String connectionType;
        long jValueOf;
        long jValueOf2;
        boolean z;
        C2108408Nu c2108408Nu = C2108408Nu.LIZ;
        IInteractService iInteractService = (IInteractService) c2108408Nu.LIZIZ(IInteractService.class);
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) c2108408Nu.LIZIZ(ILiveHostCrossRoomEventHelper.class);
        InterfaceC1850900yGW interfaceC1850900yGW = (InterfaceC1850900yGW) C1909107dp.LIZJ(InterfaceC1850900yGW.class, null);
        if (iInteractService == null || (connectionType = iInteractService.getConnectionType()) == null) {
            connectionType = "normal";
        }
        interfaceC1850900yGW.setConnectionType(connectionType);
        if (iInteractService != null) {
            jValueOf = Long.valueOf(iInteractService.getChannelId());
        } else {
            jValueOf = 0L;
        }
        interfaceC1850900yGW.setChannelId(jValueOf);
        if (iInteractService != null) {
            jValueOf2 = Long.valueOf(iInteractService.getBattleId());
        } else {
            jValueOf2 = 0L;
        }
        interfaceC1850900yGW.setPkId(jValueOf2);
        boolean z2 = false;
        if (iLiveHostCrossRoomEventHelper != null && iLiveHostCrossRoomEventHelper.getIsTransfer() == 0) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1850900yGW.setTransfer(Boolean.valueOf(!z));
        if (iLiveHostCrossRoomEventHelper != null && iLiveHostCrossRoomEventHelper.getIsMatchOpponent() == 0) {
            z2 = true;
        }
        interfaceC1850900yGW.setMatchOpponent(Boolean.valueOf(!z2));
        completionBlock.onSuccess(interfaceC1850900yGW, "");
    }
}
