package X;

import Y.AfS6S0100100_17;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreloadInteractionLayerSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.QuickGift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0fKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123100fKe {
    public InterfaceC1123150fKj LIZ;
    public final DataChannel LIZIZ;
    public Gift LIZJ;
    public final C11NJ LIZLLL;

    public C1123100fKe(InterfaceC1123150fKj interfaceC1123150fKj, DataChannel dataChannel) {
        Room room;
        boolean z;
        this.LIZ = interfaceC1123150fKj;
        this.LIZIZ = dataChannel;
        C11NJ c11nj = new C11NJ();
        this.LIZLLL = c11nj;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            if (LivePreloadInteractionLayerSetting.INSTANCE.isEnablePreload(dataChannel)) {
                InterfaceC1123150fKj interfaceC1123150fKj2 = this.LIZ;
                if (interfaceC1123150fKj2 != null) {
                    interfaceC1123150fKj2.setImageDrawable(R.drawable.edf);
                }
            } else {
                EnumC1102750enp.FAST_GIFT.hide(dataChannel);
            }
            long id = room.getId();
            if (id != C1123130fKh.LIZJ) {
                z = true;
            } else {
                z = false;
            }
            if (C083100Sv.LIZ()) {
                C20441214yg.LIZIZ("LiveNewFastPresenter", "initData, optFastGiftFromEnter");
                QuickGift quickGift = room.quickGift;
                if (quickGift != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onRoomEnter, quickGift.greyImage = ");
                    sbLIZ.append(quickGift.greyImage);
                    C20441214yg.LIZIZ("LiveNewFastPresenter", C2188811AlT.LIZIZ(sbLIZ));
                    Gift giftFindGiftById = GiftManager.inst().findGiftById(quickGift.id);
                    LIZ(giftFindGiftById == null ? C083100Sv.LIZIZ(quickGift) : giftFindGiftById, quickGift.greyImage, quickGift.image);
                } else {
                    LIZ(GiftManager.inst().getFastGift(id), GiftManager.inst().getFastGiftGreyIcon(id), GiftManager.inst().getFastGiftColorfulIcon(id));
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("initData, LiveQuickGiftOptSetting., isFirstInit = ");
                sbLIZ2.append(z);
                C20441214yg.LIZIZ("LiveNewFastPresenter", C2188811AlT.LIZIZ(sbLIZ2));
                LIZ(GiftManager.inst().getFastGift(id), GiftManager.inst().getFastGiftGreyIcon(id), GiftManager.inst().getFastGiftColorfulIcon(id));
            }
            c11nj.LIZ(C784440Upu.LIZ().LJ(C1123110fKf.class).LJJLJLI(new AfS6S0100100_17(id, this, 9)));
        }
    }

    public final void LIZ(Gift gift, ImageModel imageModel, ImageModel imageModel2) {
        this.LIZJ = gift;
        if (gift == null) {
            EnumC1102750enp.FAST_GIFT.hide(this.LIZIZ);
            return;
        }
        EnumC1102750enp enumC1102750enp = EnumC1102750enp.FAST_GIFT;
        if (!enumC1102750enp.isShowing(this.LIZIZ)) {
            enumC1102750enp.show(this.LIZIZ);
        }
        InterfaceC1123150fKj interfaceC1123150fKj = this.LIZ;
        if (interfaceC1123150fKj != null) {
            interfaceC1123150fKj.LIZ(this.LIZJ, imageModel, imageModel2);
        }
    }
}
