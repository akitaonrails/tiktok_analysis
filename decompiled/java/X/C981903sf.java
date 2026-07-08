package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03sf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C981903sf extends AbstractC982603sm {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        OrderSubmitAssemViewModel orderSubmitAssemViewModelLLLZ;
        InterfaceC982503sl interfaceC982503sl = (InterfaceC982503sl) xBaseParamModel;
        C903103fx.LIZ.getClass();
        AbstractActivityC1743740vTg abstractActivityC1743740vTgLIZLLL = C903103fx.LIZLLL();
        if (abstractActivityC1743740vTgLIZLLL == null) {
            C2382909Vj.LIZ(completionBlock, 0, "can't find osp activity", null, 4);
            return;
        }
        Number scene = interfaceC982503sl.getScene();
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
                if (c983603sw == null) {
                    return;
                }
                c983603sw.LIZ(new AwS367S0200000_1(completionBlock, (CompletionBlock<InterfaceC983003sq>) this, (C981903sf) 159));
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "can't find osp view model", null, 4);
            return;
        }
        if (Intrinsics.LJFF(scene, 2)) {
            TuxSheet tuxSheetLIZIZ = C903103fx.LIZIZ(abstractActivityC1743740vTgLIZLLL);
            if (tuxSheetLIZIZ == null) {
                C2382909Vj.LIZ(completionBlock, 0, "can't find address edit tux", null, 4);
                return;
            }
            AddressEditFragment addressEditFragmentLIZJ = C903103fx.LIZJ(tuxSheetLIZIZ);
            if (addressEditFragmentLIZJ == null) {
                C2382909Vj.LIZ(completionBlock, 0, "can't find address edit fragment", null, 4);
                return;
            }
            AddressEditViewModel addressEditViewModelMS = addressEditFragmentLIZJ.mS();
            if (addressEditViewModelMS == null) {
                C2382909Vj.LIZ(completionBlock, 0, "can't find address edit view model", null, 4);
                return;
            }
            C983603sw c983603sw2 = addressEditViewModelMS.LLLLLJLJLL;
            if (c983603sw2 == null) {
                return;
            }
            c983603sw2.LIZ(new AwS367S0200000_1(completionBlock, (CompletionBlock<InterfaceC983003sq>) this, (C981903sf) 160));
            return;
        }
        if (Intrinsics.LJFF(scene, 3)) {
            CCDCAddCardHalfFragment cCDCAddCardHalfFragmentLIZ = C903103fx.LIZ(abstractActivityC1743740vTgLIZLLL.getSupportFragmentManager());
            if (cCDCAddCardHalfFragmentLIZ == null) {
                C2382909Vj.LIZ(completionBlock, 0, "can't find ccdc add card", null, 4);
                return;
            }
            C983603sw c983603sw3 = cCDCAddCardHalfFragmentLIZ.LLJLLIL;
            if (c983603sw3 == null) {
                return;
            }
            c983603sw3.LIZ(new AwS367S0200000_1(completionBlock, (CompletionBlock<InterfaceC983003sq>) this, (C981903sf) 161));
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "invalid params: scene", null, 4);
    }
}
