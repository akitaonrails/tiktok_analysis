package X;

import com.bytedance.android.livesdk.gift.model.GiftStrategyData;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;

/* JADX INFO: renamed from: X.0UeS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777340UeS implements C0UU8 {
    public final Room LIZ;
    public final C777350UeT LIZIZ = new AbstractC1132980faa() { // from class: X.0UeT
        @Override // X.AbstractC1132980faa
        public final void LIZIZ(List<Gift> list) {
        }

        @Override // X.AbstractC1132980faa
        public final void LIZJ(List list, GiftsInfo giftsInfo, GiftStrategyData giftStrategyData, long j, int i) {
        }
    };

    public final void LIZ() {
        C781270Ukn.LJII().resetRoomStatus(false);
        RoomAuthStatus roomAuthStatus = this.LIZ.getRoomAuthStatus();
        if (C500260Jjc.LJJJI(roomAuthStatus != null ? Boolean.valueOf(roomAuthStatus.enableGift) : null)) {
            C781270Ukn.LJII().clearFastGift(this.LIZ.getId());
            C781270Ukn.LJII().syncGiftList(this.LIZIZ, this.LIZ.getId(), 2, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0UeT] */
    public C777340UeS(Room room) {
        this.LIZ = room;
    }
}
