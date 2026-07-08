package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.lynx.react.bridge.JavaOnlyArray;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fp2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141940fp2 extends AbstractC1141960fp4 {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int iIntValue;
        GiftPage giftPage;
        boolean z;
        List<Gift> list;
        GiftPage next;
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        Number pageType = ((InterfaceC1141970fp5) xBaseParamModel).getPageType();
        if (pageType != null) {
            iIntValue = pageType.intValue();
        } else {
            iIntValue = 0;
        }
        List<GiftPage> giftPages = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getGiftPages();
        boolean z2 = true;
        if (giftPages != null) {
            Iterator<GiftPage> it2 = giftPages.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    GiftPage giftPage2 = next;
                    if (giftPage2 != null && giftPage2.pageType == iIntValue) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            giftPage = next;
        } else {
            giftPage = null;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        if (giftPage != null && (list = giftPage.gifts) != null) {
            Iterator<Gift> it3 = list.iterator();
            while (it3.hasNext()) {
                String json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, it3.next());
                C1297550js1 c1297550js1 = C1297550js1.LIZ;
                JSONObject jSONObject = new JSONObject(json);
                c1297550js1.getClass();
                javaOnlyArray.add(C1297550js1.LIZIZ(jSONObject));
            }
        }
        InterfaceC1141950fp3 interfaceC1141950fp3 = (InterfaceC1141950fp3) C1909107dp.LIZJ(InterfaceC1141950fp3.class, null);
        interfaceC1141950fp3.setData(javaOnlyArray);
        if (iInteractService.ib2() || (iInteractService.Ya1() && iInteractService.LJII() >= 1)) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1141950fp3.setMultiGuestRoom(Boolean.valueOf(z));
        if (giftPage == null || giftPage.gifts == null) {
            z2 = false;
        }
        if (z2) {
            completionBlock.onSuccess(interfaceC1141950fp3, "");
        } else {
            completionBlock.onFailure(0, "", interfaceC1141950fp3);
        }
    }
}
