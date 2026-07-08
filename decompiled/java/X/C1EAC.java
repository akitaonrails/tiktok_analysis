package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.service.ILinkMicInteractAbilityService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.1EAC, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EAC extends C1EAA {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String str;
        List<String> listLJIILLIIL;
        long jLIZLLL;
        C1EAB c1eab = (C1EAB) C1909107dp.LIZJ(C1EAB.class, null);
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        ILinkMicInteractAbilityService iLinkMicInteractAbilityService = (ILinkMicInteractAbilityService) C1161920gLG.LIZJ(ILinkMicInteractAbilityService.class);
        if (iInteractService.J8()) {
            str = "anchor";
        } else if (iInteractService.Nf2()) {
            str = "guest";
        } else {
            str = "audience";
        }
        c1eab.setChannelId(Long.valueOf(iInteractService.getChannelId()));
        String strMO1 = iInteractService.mO1();
        if (strMO1 == null) {
            strMO1 = "";
        }
        c1eab.setLayoutId(strMO1);
        c1eab.setGuestCount(Integer.valueOf(iInteractService.getGuestCount()));
        InterfaceC941720ac6 interfaceC941720ac6LI = iLinkMicInteractAbilityService.LI();
        if (interfaceC941720ac6LI == null || (listLJIILLIIL = interfaceC941720ac6LI.LJIILLIIL()) == null) {
            listLJIILLIIL = C13BV.INSTANCE;
        }
        c1eab.setOngoingPlayList(listLJIILLIIL);
        InterfaceC941720ac6 interfaceC941720ac6LI2 = iLinkMicInteractAbilityService.LI();
        if (interfaceC941720ac6LI2 != null) {
            jLIZLLL = interfaceC941720ac6LI2.LIZLLL("top_guests");
        } else {
            jLIZLLL = 0;
        }
        c1eab.setTopGuestPlayId(Long.valueOf(jLIZLLL));
        c1eab.setUserType(str);
        completionBlock.onSuccess(c1eab, "");
    }
}
