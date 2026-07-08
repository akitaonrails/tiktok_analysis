package X;

import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.livesetting.level.FansClubJoinPanelUpgradeSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubAwarenessEnhancementSetting;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanViewModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS136S0400000_7;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.fans.GetNonFansUserDataResponse;

/* JADX INFO: renamed from: X.0KTA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KTA extends C0KTC {
    public final void LIZJ(C0KTB c0ktb, SuperFanViewModel superFanViewModel, CompletionBlock<C0KTD> completionBlock) {
        AwS136S0400000_7 awS136S0400000_7 = new AwS136S0400000_7(superFanViewModel, (SuperFanViewModel) c0ktb, (C0KTB) completionBlock, (CompletionBlock<C0KTD>) this, (C0KTA) 5);
        C0KTE dialogInfo = c0ktb.getDialogInfo();
        if (dialogInfo != null) {
            C500260Jjc.LJJLIIIJILLIZJL(new AwS408S0200000_7(new C0KTF(dialogInfo.getTitle(), dialogInfo.getMessage(), dialogInfo.getNegativeText(), dialogInfo.getPositiveText(), awS136S0400000_7), (C0KTF) completionBlock, (CompletionBlock<C0KTD>) 74));
        } else {
            awS136S0400000_7.invoke();
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        SuperFanViewModel superFanViewModel;
        String strLIZ;
        C0KTB c0ktb = (C0KTB) xBaseParamModel;
        WeakReference<SuperFanViewModel> weakReference = C517910KSv.LIZ;
        String containerID = null;
        if (weakReference != null) {
            superFanViewModel = weakReference.get();
        } else {
            superFanViewModel = null;
        }
        if (superFanViewModel == null) {
            C2382909Vj.LIZ(completionBlock, -100, "super fan viewmodel is not found", null, 4);
            return;
        }
        Number action = c0ktb.getAction();
        if (Intrinsics.LJFF(action, 1)) {
            C0KT6.LIZ = Intrinsics.LJFF(c0ktb.getFansClubMainPageIsOpen(), 1);
            LIZJ(c0ktb, superFanViewModel, completionBlock);
            return;
        }
        if (Intrinsics.LJFF(action, 2)) {
            C500260Jjc.LJJLIIIJILLIZJL(new AwS408S0200000_7(new C0KTF(C497740JfY.LJIJI(2131856694), C497740JfY.LJIJI(2131856693), C497740JfY.LJIJI(2131856691), C497740JfY.LJIJI(2131856692), new AwS136S0400000_7(superFanViewModel, (SuperFanViewModel) c0ktb, (C0KTB) completionBlock, (CompletionBlock<C0KTD>) this, (C0KTA) 7)), (C0KTF) completionBlock, (CompletionBlock<C0KTD>) 74));
            return;
        }
        if (Intrinsics.LJFF(action, 3)) {
            C500260Jjc.LJJLIIIJILLIZJL(new AwS408S0200000_7(new C0KTF(C497740JfY.LJIJI(2131856690), C497740JfY.LJIJI(2131856688), C497740JfY.LJIJI(2131856689), C497740JfY.LJIJI(2131856687), new AwS136S0400000_7(superFanViewModel, (SuperFanViewModel) c0ktb, (C0KTB) completionBlock, (CompletionBlock<C0KTD>) this, (C0KTA) 6)), (C0KTF) completionBlock, (CompletionBlock<C0KTD>) 74));
            return;
        }
        int i = 5;
        if (Intrinsics.LJFF(action, 5)) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0KTD.class, containerID);
            C0KTD c0ktd = (C0KTD) xBaseModelLIZJ;
            ISubscribeService iSubscribeService = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class);
            if (iSubscribeService == null || iSubscribeService.Ae() == null) {
                strLIZ = "";
            } else {
                strLIZ = C516700KOe.LIZ();
            }
            c0ktd.setCountryCode(strLIZ);
            c0ktd.setSuccess(Boolean.TRUE);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        if (Intrinsics.LJFF(action, 6)) {
            C0KT6.LIZ = Intrinsics.LJFF(c0ktb.getFansClubMainPageIsOpen(), 1);
            LIZJ(c0ktb, superFanViewModel, completionBlock);
        } else {
            if (Intrinsics.LJFF(action, 7)) {
                C0KT2 c0kt2 = C0KT2.PREFETCH;
                if (!LiveFansClubAwarenessEnhancementSetting.INSTANCE.isEnabled()) {
                    i = 0;
                }
                superFanViewModel.vQ2(new C0KT0(c0kt2, "prefetch", i), FansClubJoinPanelUpgradeSetting.INSTANCE.getValue(), new InterfaceC517900KSu() { // from class: X.0KT7
                    @Override // X.InterfaceC517900KSu
                    public final void onFailure() {
                        CompletionBlock<C0KTD> completionBlock2 = completionBlock;
                        this.getClass();
                        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                        XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(C0KTD.class, interfaceC634840OvC2 != null ? interfaceC634840OvC2.getContainerID() : null);
                        ((C0KTD) xBaseModelLIZJ2).setSuccess(Boolean.TRUE);
                        completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
                    }

                    @Override // X.InterfaceC517900KSu
                    public final void LIZ(C0KSY<GetNonFansUserDataResponse.Data> c0ksy, C0KS8 c0ks8) {
                        String containerID2;
                        CompletionBlock<C0KTD> completionBlock2 = completionBlock;
                        this.getClass();
                        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                        if (interfaceC634840OvC2 != null) {
                            containerID2 = interfaceC634840OvC2.getContainerID();
                        } else {
                            containerID2 = null;
                        }
                        XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(C0KTD.class, containerID2);
                        ((C0KTD) xBaseModelLIZJ2).setSuccess(Boolean.TRUE);
                        completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
                    }
                });
                return;
            }
            C2382909Vj.LIZ(completionBlock, -100, "unSupported action", null, 4);
        }
    }
}
