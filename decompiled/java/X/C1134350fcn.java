package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftStrategyData;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0fcn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134350fcn extends AbstractC1134370fcp {
    public static InterfaceC1134360fco LIZJ(Gift gift) {
        InterfaceC1134360fco interfaceC1134360fco = (InterfaceC1134360fco) C1909107dp.LIZJ(InterfaceC1134360fco.class, null);
        interfaceC1134360fco.setGiftName(gift.name);
        interfaceC1134360fco.setGiftCoins(Integer.valueOf(gift.diamondCount));
        interfaceC1134360fco.setGiftPrice(((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIIZILJ(gift.diamondCount, false));
        return interfaceC1134360fco;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        long id;
        boolean z;
        final long jLongValue = ((InterfaceC1134380fcq) xBaseParamModel).getGiftId().longValue();
        Gift giftFindGiftById = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).findGiftById(jLongValue);
        if (giftFindGiftById == null) {
            IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
            AbstractC1132980faa abstractC1132980faa = new AbstractC1132980faa() { // from class: X.0fcm
                @Override // X.AbstractC1132980faa
                public final void LIZ(int i, String str) {
                    C2382909Vj.LIZ(completionBlock, i, str, null, 4);
                }

                @Override // X.AbstractC1132980faa
                public final void LIZJ(List list, GiftsInfo giftsInfo, GiftStrategyData giftStrategyData, long j, int i) {
                    Object next;
                    if (list != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            C19719612Di.LJJI(((GiftPage) it2.next()).gifts, arrayList);
                        }
                        long j2 = jLongValue;
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (((Gift) next).id == j2) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        Gift gift = (Gift) next;
                        if (gift != null) {
                            CompletionBlock<InterfaceC1134360fco> completionBlock2 = completionBlock;
                            this.getClass();
                            completionBlock2.onSuccess(C1134350fcn.LIZJ(gift), "");
                            return;
                        }
                    }
                    C2382909Vj.LIZ(completionBlock, 0, "gift not found", null, 4);
                }
            };
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room roomLJJLI = C500260Jjc.LJJLI();
            if (roomLJJLI != null) {
                id = roomLJJLI.getId();
            } else {
                id = 0;
            }
            Room roomLJJLI2 = C500260Jjc.LJJLI();
            if (roomLJJLI2 != null && roomLJJLI2.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
                z = true;
            } else {
                z = false;
            }
            iGiftService.syncGiftList(abstractC1132980faa, id, 11, z);
            return;
        }
        completionBlock.onSuccess(LIZJ(giftFindGiftById), "");
    }
}
