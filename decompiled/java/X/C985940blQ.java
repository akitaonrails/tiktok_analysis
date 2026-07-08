package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.AnchorGiftModeMetaMap;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMetaList;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMetaV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0blQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985940blQ implements InterfaceC20488315Ez<C981160bdi> {
    public DataChannel LIZ;

    @Override // X.InterfaceC20488315Ez
    public final boolean LIZIZ() {
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        return C156900it.LJIIIZ(interfaceC975810bV5LIZLLL != null ? interfaceC975810bV5LIZLLL.LJJII() : null);
    }

    @Override // X.InterfaceC20488315Ez
    public final Object LIZ(InterfaceC1364105Vn<? super C981160bdi> interfaceC1364105Vn) {
        long id;
        ImageModel imageModel;
        GiftModeMetaV2 giftModeMetaV2LJJII;
        Map<Long, AnchorGiftModeMetaMap> map;
        AnchorGiftModeMetaMap anchorGiftModeMetaMap;
        Map<Long, GiftModeMetaList> map2;
        GiftModeMetaList giftModeMetaList;
        List<GiftModeMeta> list;
        GiftModeMeta giftModeMeta;
        Room room;
        User owner;
        String strLJIJI = C497740JfY.LJIJI(2131853767);
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null) {
            id = owner.getId();
        } else {
            id = 0;
        }
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL != null && (giftModeMetaV2LJJII = interfaceC975810bV5LIZLLL.LJJII()) != null && (map = giftModeMetaV2LJJII.anchorGiftModeMetaByType) != null && (anchorGiftModeMetaMap = map.get(C2286608xc.LJFF(2L))) != null && (map2 = anchorGiftModeMetaMap.anchorGiftModeMetas) != null && (giftModeMetaList = map2.get(C2286608xc.LJFF(id))) != null && (list = giftModeMetaList.giftModeMeta) != null && (giftModeMeta = (GiftModeMeta) C13LP.LJJJLZIJ(0, list)) != null) {
            imageModel = giftModeMeta.giftIconImage;
        } else {
            imageModel = null;
        }
        return new C981160bdi(strLJIJI, imageModel);
    }
}
