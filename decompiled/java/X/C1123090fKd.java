package X;

import Y.AfS6S0100100_17;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.QuickGift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0fKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123090fKd {
    public final DataChannel LIZ;
    public Gift LIZIZ;
    public final C11NJ LIZJ = new C11NJ();
    public InterfaceC1104130eq3 LIZLLL;

    public final void LIZ() {
        Room room;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
            return;
        }
        long id = room.getId();
        boolean z = id != C1123130fKh.LIZJ;
        DataChannel dataChannel2 = this.LIZ;
        C01GW c01gw = C1123140fKi.LIZ;
        if (((IGiftService) c01gw.getValue()).isGiftSuspended(dataChannel2) || ((IGiftService) c01gw.getValue()).isNewsAccount(dataChannel2)) {
            if (C083100Sv.LIZ()) {
                QuickGift quickGift = room.quickGift;
                if (quickGift != null) {
                    Gift giftFindGiftById = GiftManager.inst().findGiftById(quickGift.id);
                    if (giftFindGiftById == null) {
                        giftFindGiftById = C083100Sv.LIZIZ(quickGift);
                    }
                    LIZIZ(giftFindGiftById, quickGift.greyImage, quickGift.image);
                } else {
                    LIZIZ(GiftManager.inst().getFastGift(id), GiftManager.inst().getFastGiftGreyIcon(id), GiftManager.inst().getFastGiftColorfulIcon(id));
                }
            } else if (!z) {
                LIZIZ(GiftManager.inst().getFastGift(id), GiftManager.inst().getFastGiftGreyIcon(id), GiftManager.inst().getFastGiftColorfulIcon(id));
            }
            this.LIZJ.LIZ(C784440Upu.LIZ().LJ(C1123110fKf.class).LJJLL(new AfS6S0100100_17(id, this, 8), new C09JN() { // from class: X.01cA
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LiveDummyFastPresenter@e1b8.registerRxBus$2");
                    System.out.println(obj);
                    C1C7U.LIZIZ("LiveDummyFastPresenter@e1b8.registerRxBus$2");
                }
            }));
        }
    }

    public C1123090fKd(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        EnumC1102750enp.DUMMY_FAST_GIFT.hide(dataChannel);
        this.LIZIZ = null;
    }

    public final void LIZIZ(Gift gift, ImageModel imageModel, ImageModel imageModel2) {
        this.LIZIZ = gift;
        if (gift == null) {
            EnumC1102750enp.DUMMY_FAST_GIFT.hide(this.LIZ);
            return;
        }
        EnumC1102750enp enumC1102750enp = EnumC1102750enp.DUMMY_FAST_GIFT;
        if (!enumC1102750enp.isShowing(this.LIZ)) {
            enumC1102750enp.show(this.LIZ);
        }
        InterfaceC1104130eq3 interfaceC1104130eq3 = this.LIZLLL;
        if (interfaceC1104130eq3 != null) {
            interfaceC1104130eq3.LIZ(this.LIZIZ, imageModel, imageModel2);
        }
    }
}
