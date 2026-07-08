package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0grg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182020grg extends AbstractC1182080grm {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1182190grx interfaceC1182190grx = (InterfaceC1182190grx) xBaseParamModel;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(interfaceC1182190grx.getEffectId());
        if (lLJIILIIL == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("effect id parse failed: ");
            sbLIZ.append(interfaceC1182190grx.getEffectId());
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PreDownloadGiftAssets = ");
        sbLIZ2.append(lLJIILIIL);
        C20441214yg.LIZIZ("preloadGiftEffect", C2188811AlT.LIZIZ(sbLIZ2));
        final AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(lLJIILIIL, 2444);
        if (((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getAssets(null, lLJIILIIL.longValue()) != null) {
            awS562S0100000_18.invoke();
        } else {
            IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
            ArrayList<Long> arrayList = new ArrayList<>();
            arrayList.add(lLJIILIIL);
            iGiftService.syncAssetList(7, arrayList, new InterfaceC1133140faq() { // from class: X.0gHj
                @Override // X.InterfaceC1133140faq
                public final void onFailed() {
                    C20441214yg.LIZIZ("preloadGiftEffect", "onResult# onFailed: asset model download failed");
                }

                @Override // X.InterfaceC1133140faq
                public final void onSuccess() {
                    awS562S0100000_18.invoke();
                }
            });
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1182050grj.class, null), "");
    }
}
