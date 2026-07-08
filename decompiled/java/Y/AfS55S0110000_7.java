package Y;

import X.C09JN;
import X.C0IZG;
import X.C0J9Q;
import X.C1161920gLG;
import X.C1C7U;
import X.C472830IgT;
import X.C786410Ut5;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3;
import com.bytedance.android.livesdk.drawerfeed.tab.DrawerTabsItem;
import com.bytedance.android.livesdk.live.data.RoomStatsViewModel;
import com.bytedance.android.livesdk.mvp.PaidRoomCheckDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class AfS55S0110000_7 implements C09JN {
    public final int $t;
    public Object l0;
    public boolean z1;

    public static final void accept$5(AfS55S0110000_7 afS55S0110000_7, Object obj) {
        ((RoomStatsViewModel) afS55S0110000_7.l0).lambda$getRoomStats$0(afS55S0110000_7.z1, (C472830IgT) obj);
    }

    public static final void accept$6(AfS55S0110000_7 afS55S0110000_7, Object obj) {
        ((RoomStatsViewModel) afS55S0110000_7.l0).lambda$getRoomStats$1(afS55S0110000_7.z1, (Throwable) obj);
    }

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS55S0110000_7 afS55S0110000_7, Object obj) {
        C1C7U.LIZ("LiveSearchFeedProvider@c4ae.load$1$2");
        C0IZG c0izg = (C0IZG) afS55S0110000_7.l0;
        c0izg.LIZJ = false;
        c0izg.LIZ.LIZJ(afS55S0110000_7.z1);
        C1C7U.LIZIZ("LiveSearchFeedProvider@c4ae.load$1$2");
    }

    public static final void accept$1(AfS55S0110000_7 afS55S0110000_7, Object obj) {
        C1C7U.LIZ("LiveDrawerDialogV3@d1bf.getTabData$dispose$1");
        BaseListResponse baseListResponse = (BaseListResponse) obj;
        LiveDrawerDialogV3 liveDrawerDialogV3 = (LiveDrawerDialogV3) afS55S0110000_7.l0;
        List list = baseListResponse.data;
        liveDrawerDialogV3.LLJJJJLIIL = list;
        if (!afS55S0110000_7.z1) {
            ((LiveDrawerDialogV3) afS55S0110000_7.l0).mS(baseListResponse.data, afS55S0110000_7.z1);
        } else if (list != null && (!list.isEmpty()) && Intrinsics.LJFF("game", ((DrawerTabsItem) ListProtector.get(list, 0)).tabType)) {
            ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).Cz1(liveDrawerDialogV3.getActivity(), "game");
        }
        C1C7U.LIZIZ("LiveDrawerDialogV3@d1bf.getTabData$dispose$1");
    }

    public static final void accept$2(AfS55S0110000_7 afS55S0110000_7, Object obj) {
        C1C7U.LIZ("LiveDrawerDialogV3@d1bf.getTabData$dispose$2");
        if (!afS55S0110000_7.z1) {
            ((LiveDrawerDialogV3) afS55S0110000_7.l0).mS(null, afS55S0110000_7.z1);
        }
        C1C7U.LIZIZ("LiveDrawerDialogV3@d1bf.getTabData$dispose$2");
    }

    public static final void accept$3(AfS55S0110000_7 afS55S0110000_7, Object obj) {
        C1C7U.LIZ("PaidRoomCheckDialog@f81a.initData$queryRoomData$2");
        C786410Ut5.LLLIZZ(((PaidRoomCheckDialog) afS55S0110000_7.l0).getLoadingViewFromXml(), 8);
        if (!afS55S0110000_7.z1) {
            ((PaidRoomCheckDialog) afS55S0110000_7.l0).loadError();
        }
        ((PaidRoomCheckDialog) afS55S0110000_7.l0).loadErrorMsg();
        C1C7U.LIZIZ("PaidRoomCheckDialog@f81a.initData$queryRoomData$2");
    }

    public static final void accept$4(AfS55S0110000_7 afS55S0110000_7, Object obj) {
        Room room;
        C1C7U.LIZ("ToolbarAiGeneratedBehavior@46ce.reportServerSwitchStatus$1$1");
        DataChannel dataChannel = ((C0J9Q) afS55S0110000_7.l0).LLILLJJLI;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            room.aigcSelfDisclosureSwitch = afS55S0110000_7.z1;
        }
        C1C7U.LIZIZ("ToolbarAiGeneratedBehavior@46ce.reportServerSwitchStatus$1$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS55S0110000_7(com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3 r2, boolean r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 1 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.z1 = r3
            r0.l0 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r2
            r0.z1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS55S0110000_7.<init>(com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3, boolean, int):void");
    }

    public AfS55S0110000_7(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
