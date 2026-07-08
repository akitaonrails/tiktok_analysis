package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03se, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C981803se extends AbstractC982203si {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        OrderSubmitAssemViewModel orderSubmitAssemViewModelLLLZ;
        InterfaceC982703sn interfaceC982703sn = (InterfaceC982703sn) xBaseParamModel;
        C903103fx.LIZ.getClass();
        AbstractActivityC1743740vTg abstractActivityC1743740vTgLIZLLL = C903103fx.LIZLLL();
        String containerID = null;
        if (abstractActivityC1743740vTgLIZLLL == null) {
            C2382909Vj.LIZ(completionBlock, 0, "can't find osp activity", null, 4);
            return;
        }
        Number scene = interfaceC982703sn.getScene();
        if (Intrinsics.LJFF(scene, 1)) {
            if (abstractActivityC1743740vTgLIZLLL instanceof OrderSubmitActivity) {
                orderSubmitAssemViewModelLLLZ = ((OrderSubmitActivity) abstractActivityC1743740vTgLIZLLL).LLLZ();
            } else {
                if (abstractActivityC1743740vTgLIZLLL instanceof CombinedSkuOrderSubmitActivity) {
                    orderSubmitAssemViewModelLLLZ = ((CombinedSkuOrderSubmitActivity) abstractActivityC1743740vTgLIZLLL).LLLZ();
                }
                C2382909Vj.LIZ(completionBlock, 0, "can't find osp view model", null, 4);
                return;
            }
            if (orderSubmitAssemViewModelLLLZ != null) {
                C983603sw c983603sw = orderSubmitAssemViewModelLLLZ.H;
                if (c983603sw != null) {
                    c983603sw.LIZIZ = true;
                }
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    containerID = interfaceC634840OvC.getContainerID();
                }
                completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC983103sr.class, containerID), "Success");
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "can't find osp view model", null, 4);
            return;
        }
        if (Intrinsics.LJFF(scene, 2)) {
            TuxSheet tuxSheetLIZIZ = C903103fx.LIZIZ(abstractActivityC1743740vTgLIZLLL);
            if (tuxSheetLIZIZ == null) {
                C2382909Vj.LIZ(completionBlock, 0, "can't find edit address tux", null, 4);
                return;
            }
            AddressEditFragment addressEditFragmentLIZJ = C903103fx.LIZJ(tuxSheetLIZIZ);
            if (addressEditFragmentLIZJ == null) {
                C2382909Vj.LIZ(completionBlock, 0, "can't find edit fragment", null, 4);
                return;
            }
            AddressEditViewModel addressEditViewModelMS = addressEditFragmentLIZJ.mS();
            if (addressEditViewModelMS == null) {
                C2382909Vj.LIZ(completionBlock, 0, "can't find address edit view model", null, 4);
                return;
            }
            C983603sw c983603sw2 = addressEditViewModelMS.LLLLLJLJLL;
            if (c983603sw2 != null) {
                c983603sw2.LIZIZ = true;
            }
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC983103sr.class, containerID), "Success");
            return;
        }
        if (Intrinsics.LJFF(scene, 3)) {
            CCDCAddCardHalfFragment cCDCAddCardHalfFragmentLIZ = C903103fx.LIZ(abstractActivityC1743740vTgLIZLLL.getSupportFragmentManager());
            if (cCDCAddCardHalfFragmentLIZ == null) {
                C2382909Vj.LIZ(completionBlock, 0, "can't find ccdc add card", null, 4);
                return;
            }
            C983603sw c983603sw3 = cCDCAddCardHalfFragmentLIZ.LLJLLIL;
            if (c983603sw3 != null) {
                c983603sw3.LIZIZ = true;
            }
            InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
            if (interfaceC634840OvC3 != null) {
                containerID = interfaceC634840OvC3.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC983103sr.class, containerID), "Success");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "invalid params: scene", null, 4);
    }
}
