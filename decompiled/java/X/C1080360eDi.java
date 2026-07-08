package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUnionPraiseGiftInToolBarSetting;
import com.bytedance.android.livesdk.model.RoomAuthOffReasons;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eDi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080360eDi extends GroupableElementSpecImpl {
    public boolean LL;
    public boolean LLILLJJLI;
    public final /* synthetic */ C1080530eDz LLILLL;

    public final void LIZ() {
        RoomLinkInfo linkMicInfo;
        List<Long> list;
        EnumC1090760eUU unAvailableClickReason;
        RoomLinkInfo linkMicInfo2;
        List<Long> list2;
        RoomAuthStatus roomAuthStatus;
        RoomAuthOffReasons roomAuthOffReasons;
        RoomAuthStatus roomAuthStatus2;
        if (this.LL || this.LLILLJJLI) {
            return;
        }
        Room room = (Room) this.LLILLL.getDataChannel().gg0(RoomChannel.class);
        DataChannel dataChannel = this.LLILLL.getDataChannel();
        boolean z = (room == null || (roomAuthStatus2 = room.getRoomAuthStatus()) == null || !roomAuthStatus2.isEnableGift()) ? false : true;
        boolean zLJJJI = C500260Jjc.LJJJI(dataChannel != null ? (Boolean) dataChannel.gg0(UserIsAnchorChannel.class) : null);
        EnumC1118300fCu enumC1118300fCuLIZIZ = C1118310fCv.LIZIZ(false, ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0() > 0, z);
        if (enumC1118300fCuLIZIZ != EnumC1118300fCu.GREY) {
            if (enumC1118300fCuLIZIZ == EnumC1118300fCu.SHOW) {
                ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).monitorGiftIconShow(dataChannel, true, EnumC1090760eUU.UNKNOWN, zLJJJI ? "anchor" : "user", "icon", (room == null || (linkMicInfo = room.getLinkMicInfo()) == null || (list = linkMicInfo.audienceIdList) == null) ? 0 : list.size());
                return;
            }
            return;
        }
        IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
        if (room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || (roomAuthOffReasons = roomAuthStatus.getRoomAuthOffReasons()) == null || (unAvailableClickReason = roomAuthOffReasons.getUnAvailableClickReason()) == null) {
            unAvailableClickReason = EnumC1090760eUU.UNKNOWN;
        }
        iGiftService.monitorGiftIconShow(dataChannel, false, unAvailableClickReason, zLJJJI ? "anchor" : "user", "icon", (room == null || (linkMicInfo2 = room.getLinkMicInfo()) == null || (list2 = linkMicInfo2.audienceIdList) == null) ? 0 : list2.size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1080360eDi(C1080530eDz c1080530eDz) {
        super(R.id.tml);
        this.LLILLL = c1080530eDz;
        if (LiveUnionPraiseGiftInToolBarSetting.isEnable()) {
            bindGroups(C1080000eD8.LJFF);
            ((ArrayList) c1080530eDz.LJIILJJIL).add(new AwS596S0100000_17(this, 391));
            ((ArrayList) c1080530eDz.LJIILL).add(new AwS596S0100000_17(this, 392));
        } else {
            bindGroup(C1080000eD8.LIZIZ);
        }
        ElementSpecImplKt.onAttach(this, new AwS383S0200000_17(this, c1080530eDz, 74));
        bindGroup(C1080000eD8.LIZLLL);
    }
}
