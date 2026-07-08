package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120650fGh extends AbstractC1120660fGi {
    public static User LIZJ(String str) {
        User next;
        Iterator<User> it2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).M30().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(String.valueOf(next.getId()), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, java.lang.String] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        EnumC1120600fGc enumC1120600fGc;
        int iOptInt;
        long firstSubscribeGiftId;
        long j;
        User userLIZJ;
        Long lLJIILIIL;
        InterfaceC1120680fGk interfaceC1120680fGk = (InterfaceC1120680fGk) xBaseParamModel;
        JSONObject json = interfaceC1120680fGk.toJSON();
        int iOptInt2 = json.optInt("default_panel", 0);
        boolean z = true;
        if (iOptInt2 != 0) {
            if (iOptInt2 != 1) {
                if (iOptInt2 != 2) {
                    switch (iOptInt2) {
                        case 15:
                            enumC1120600fGc = EnumC1120600fGc.EXCLUSIVE;
                            break;
                        case 16:
                            enumC1120600fGc = EnumC1120600fGc.BACKPACK;
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            enumC1120600fGc = EnumC1120600fGc.INTERACTIVE;
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            enumC1120600fGc = EnumC1120600fGc.MUSIC;
                            break;
                        default:
                            enumC1120600fGc = EnumC1120600fGc.DEFAULT;
                            break;
                    }
                } else {
                    enumC1120600fGc = EnumC1120600fGc.BACKPACK;
                }
            } else {
                enumC1120600fGc = EnumC1120600fGc.EXCLUSIVE;
            }
        } else {
            enumC1120600fGc = EnumC1120600fGc.GIFT;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        String strOptString = json.optString("gift_enter_from", "");
        if (Intrinsics.LJFF(strOptString, "get_virtual_tickets_popup")) {
            iOptInt = 1;
        } else {
            iOptInt = json.optInt("is_skip_first_recharge_gift", 0);
        }
        if (json.has("gift_id")) {
            firstSubscribeGiftId = JSONObjectProtectorUtils.getLong(json, "gift_id");
        } else {
            firstSubscribeGiftId = 0;
        }
        if (enumC1120600fGc == EnumC1120600fGc.BACKPACK && json.has("card_id")) {
            j = JSONObjectProtectorUtils.getLong(json, "card_id");
        } else {
            j = 0;
        }
        if (json.has("to_guest_user_id")) {
            c259800zU.element = JSONObjectProtectorUtils.getString(json, "to_guest_user_id");
        }
        if (iOptInt == 0 && C500260Jjc.LJJJI(Boolean.valueOf(C1126800fQc.LIZ.M92().LJIIJ()))) {
            C500260Jjc.LJJLIIIJILLIZJL(new C1120670fGj(json, strOptString, interfaceC1120680fGk, c259800zU, this));
            InterfaceC1120690fGl interfaceC1120690fGl = (InterfaceC1120690fGl) C1909107dp.LIZJ(InterfaceC1120690fGl.class, null);
            interfaceC1120690fGl.setCode(1);
            completionBlock.onSuccess(interfaceC1120690fGl, "");
            return;
        }
        C1120640fGg c1120640fGg = new C1120640fGg();
        if (firstSubscribeGiftId == 0 && iOptInt2 == 1) {
            IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
            if (iGiftService != null) {
                firstSubscribeGiftId = iGiftService.getFirstSubscribeGiftId();
                if (firstSubscribeGiftId != 0) {
                    c1120640fGg.LJ = RunnableC915940ZwW.LL;
                }
            } else {
                firstSubscribeGiftId = 0;
            }
        }
        if (((CharSequence) c259800zU.element).length() > 0) {
            userLIZJ = LIZJ((String) c259800zU.element);
        } else {
            userLIZJ = null;
        }
        c1120640fGg.LJIIJ = userLIZJ;
        c1120640fGg.LIZIZ = firstSubscribeGiftId;
        c1120640fGg.LJIILIIL = j;
        c1120640fGg.LJIIL = j;
        if (json.has("gift_enter_from")) {
            c1120640fGg.LIZJ = strOptString;
        }
        if (json.has("enter_from_quick_rose")) {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (JSONObjectProtectorUtils.getInt(json, "enter_from_quick_rose") != 1) {
                z = false;
            }
            c1120640fGg.LJIIIZ = z;
        }
        c1120640fGg.LIZ = enumC1120600fGc;
        String toMemberId = interfaceC1120680fGk.getToMemberId();
        if (toMemberId != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(toMemberId);
        } else {
            lLJIILIIL = null;
        }
        c1120640fGg.LJIIJJI = lLJIILIIL;
        C500260Jjc.LJJLIIIJILLIZJL(new AwS561S0100000_17(c1120640fGg, 294));
        InterfaceC1120690fGl interfaceC1120690fGl2 = (InterfaceC1120690fGl) C1909107dp.LIZJ(InterfaceC1120690fGl.class, null);
        interfaceC1120690fGl2.setCode(1);
        completionBlock.onSuccess(interfaceC1120690fGl2, "");
    }
}
