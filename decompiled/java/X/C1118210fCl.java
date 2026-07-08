package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fCl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1118210fCl extends C2217421BqW implements Function1<C512220K6y, Unit> {
    public C1118210fCl(C1118220fCm c1118220fCm) {
        super(1, c1118220fCm, C1118220fCm.class, "doOnSubscribeSuccessEvent", "doOnSubscribeSuccessEvent(Lcom/bytedance/android/live/room/SubscribeSuccessData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C512220K6y c512220K6y) {
        long id;
        boolean z;
        Room room;
        Room room2;
        C1118220fCm c1118220fCm = (C1118220fCm) this.receiver;
        c1118220fCm.getClass();
        C1129650fVD giftRepository = GiftManager.inst().getGiftRepository();
        DataChannel dataChannel = c1118220fCm.LIZ;
        if (dataChannel != null && (room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            id = room2.getId();
        } else {
            id = 0;
        }
        DataChannel dataChannel2 = c1118220fCm.LIZ;
        if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null && UserService.getInstance().user().getCurrentUserId() == room.getOwnerUserId()) {
            z = true;
        } else {
            z = false;
        }
        giftRepository.LJFF(5, id, z, c1118220fCm.LJIIIZ, "");
        return Unit.LIZ;
    }
}
