package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.14uy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20418214uy extends AbstractC20418414v0 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        FragmentManager fragmentManagerLJ;
        InterfaceC20418314uz interfaceC20418314uz = (InterfaceC20418314uz) xBaseParamModel;
        Context context = null;
        C0UTJ c0utjPl1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(null);
        if (c0utjPl1 != null) {
            c0utjPl1.LJIJI("ShowCPPDialogMethod");
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C520010KaN.LJ(context);
        if (abstractC1387200mCcLJ != null && (fragmentManagerLJ = abstractC1387200mCcLJ.LJ()) != null) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room != null && room.cppVersion == 2) {
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).showCppUnlockGuideDialogV2(interfaceC20418314uz.getFeatureName(), interfaceC20418314uz.getFeatureNameET(), Boolean.valueOf(interfaceC20418314uz.getNeedBackgroundMask()), fragmentManagerLJ);
                return;
            }
            Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room2 == null || room2.cppVersion != 1) {
                return;
            }
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).showCppUnlockGuideDialog(interfaceC20418314uz.getFeatureName(), interfaceC20418314uz.getFeatureNameET(), Boolean.valueOf(interfaceC20418314uz.getNeedBackgroundMask()), fragmentManagerLJ);
        }
    }
}
