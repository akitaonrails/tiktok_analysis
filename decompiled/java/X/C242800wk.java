package X;

import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftUserConsumeLayerSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.CapsuleBizParams;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsRandomGift;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00wk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C242800wk implements InterfaceC1112400f3O {
    @Override // X.InterfaceC1112400f3O
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
        return false;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJIIZILJ() {
        return 0;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIL(C1112330f3H c1112330f3H) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIFFI(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJJIIZI(CapsuleMessage capsuleMessage) {
        return -1;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIJIIJI() {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJJIJL(CapsuleMessage capsuleMessage) {
        return -1;
    }

    public static final int LIZJ() {
        Object obj;
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C1148040fys.class);
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = 0;
        }
        return Intrinsics.LJFF(strValueOf, obj) ? 1 : 0;
    }

    @Override // X.InterfaceC1112400f3O
    public final LiveCapsuleStyleItemConfig LJI() {
        return C952230at3.LIZ();
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
        return C952230at3.LIZJ();
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIIZ(C1112330f3H c1112330f3H) {
        Long lValueOf;
        Long lValueOf2;
        CapsuleBizParamsRandomGift capsuleBizParamsRandomGift;
        CapsuleBizParamsRandomGift capsuleBizParamsRandomGift2;
        Gift gift;
        Room room;
        DataChannel dataChannel = c1112330f3H.LLIIIILZ().LJIIIZ;
        Long lValueOf3 = null;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
            lValueOf2 = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
            lValueOf2 = null;
        }
        CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
        if (capsuleBizParams != null && (capsuleBizParamsRandomGift2 = capsuleBizParams.randomGift) != null && (gift = capsuleBizParamsRandomGift2.gift) != null) {
            lValueOf3 = Long.valueOf(gift.id);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((CapsuleMessage) c1112330f3H.LJIL).schema);
        sbLIZ.append("&gift_id=");
        sbLIZ.append(lValueOf3);
        sbLIZ.append("&anchor_id=");
        sbLIZ.append(lValueOf);
        sbLIZ.append("&room_id=");
        sbLIZ.append(lValueOf2);
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(C786410Ut5.N3(c1112330f3H.LLIIIILZ().LIZ), UriProtector.parse(new C495520Jby(C2188811AlT.LIZIZ(sbLIZ)).LIZLLL()));
        CapsuleBizParams capsuleBizParams2 = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
        if (capsuleBizParams2 != null && (capsuleBizParamsRandomGift = capsuleBizParams2.randomGift) != null) {
            long j = capsuleBizParamsRandomGift.round;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("travel_gift_massage_click");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Long.valueOf(j), "round");
            c474500IjALIZ.LJJII(Integer.valueOf(LIZJ()), "is_anchor");
            c474500IjALIZ.LIZ();
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIIJ(C1112330f3H c1112330f3H) {
        CapsuleBizParamsRandomGift capsuleBizParamsRandomGift;
        CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
        if (capsuleBizParams != null && (capsuleBizParamsRandomGift = capsuleBizParams.randomGift) != null) {
            long j = capsuleBizParamsRandomGift.round;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("travel_gift_massage_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Long.valueOf(j), "round");
            c474500IjALIZ.LJJII(Integer.valueOf(LIZJ()), "is_anchor");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
        return C952230at3.LIZIZ(c1112330f3H);
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
        boolean z;
        CapsuleBizParamsRandomGift capsuleBizParamsRandomGift;
        Gift gift;
        CapsuleBizParams capsuleBizParams;
        CapsuleBizParamsRandomGift capsuleBizParamsRandomGift2;
        if (LIZJ() == 0 || c1109770ez9.LJJ) {
            return true;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (C500260Jjc.LJIJ(dataChannelGlobal) && (capsuleBizParams = capsuleMessage.bizParams) != null && (capsuleBizParamsRandomGift2 = capsuleBizParams.randomGift) != null && capsuleBizParamsRandomGift2.filterHost) {
            return true;
        }
        if (C500260Jjc.LJIJ(dataChannelGlobal)) {
            return false;
        }
        if (LiveGiftUserConsumeLayerSetting.INSTANCE.getValue() < 3) {
            z = true;
        } else {
            z = false;
        }
        CapsuleBizParams capsuleBizParams2 = capsuleMessage.bizParams;
        if (capsuleBizParams2 != null && (capsuleBizParamsRandomGift = capsuleBizParams2.randomGift) != null && (gift = capsuleBizParamsRandomGift.gift) != null) {
            Gift giftFindGiftById = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).findGiftById(gift.id);
            if (giftFindGiftById != null && giftFindGiftById.isDisplayedOnPanel) {
                return z;
            }
        }
        return true;
    }
}
