package Y;

import X.C09JN;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C257100z3;
import X.C500300Jjg;
import X.C784440Upu;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C918230a0D;
import X.C918350a0P;
import X.C918650a0t;
import X.C955590ayT;
import X.EnumC918860a1E;
import X.InterfaceC962270b9F;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Collections;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AfS3S0300100_15 implements C09JN {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS3S0300100_15 afS3S0300100_15, Object obj) {
        long j;
        C1C7U.LIZ("BaseMultiHostUserInfoViewHolderDelegate@36e3.showFollowButton$1$1");
        FollowPair followPair = (FollowPair) obj;
        ImageView imageViewI4 = ((InterfaceC962270b9F) afS3S0300100_15.l0).I4();
        if (imageViewI4 != null) {
            C786410Ut5.LJZI(8, imageViewI4);
        }
        FollowInfo followInfo = ((C955590ayT) afS3S0300100_15.l1).LJ.getOwner().getFollowInfo();
        if (afS3S0300100_15.j3 == 3) {
            j = 2;
        } else {
            j = 1;
        }
        followInfo.setFollowStatus(j);
        DataChannel dataChannel = ((InterfaceC962270b9F) afS3S0300100_15.l0).getDataChannel();
        if (((Room) afS3S0300100_15.l2) != null && dataChannel != null && followPair != null) {
            C500300Jjg.LIZLLL(((C955590ayT) afS3S0300100_15.l1).LJI, C915980Zwa.LJI().LJIIJ().getChannelId(), true, followPair.LIZ, (Room) afS3S0300100_15.l2, dataChannel, "follow_icon", Long.valueOf(afS3S0300100_15.j3), null);
        }
        C784440Upu.LIZ().LIZIZ(new C257100z3(followPair));
        C1C7U.LIZIZ("BaseMultiHostUserInfoViewHolderDelegate@36e3.showFollowButton$1$1");
    }

    public static final void accept$1(AfS3S0300100_15 afS3S0300100_15, Object obj) {
        C1C7U.LIZ("MultiGuestInviteRoutingCapabilityImpl@18e5.sendInvitePush$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("result : ");
        sbLIZ.append(((BaseResponse) obj).statusCode);
        C20441214yg.LIZIZ("LiveInvitePush", C2188811AlT.LIZIZ(sbLIZ));
        ((C918650a0t) afS3S0300100_15.l0).LJIIJJI(((C918650a0t) afS3S0300100_15.l0).LIZ.getId(), Collections.singletonList(Long.valueOf(afS3S0300100_15.j3)));
        ((C918650a0t) afS3S0300100_15.l0).LIZLLL((Function1) afS3S0300100_15.l1, new C918230a0D(((C918350a0P) afS3S0300100_15.l2).LIZIZ(), EnumC918860a1E.LEGACY, true, null, null, null, null, 120));
        C1C7U.LIZIZ("MultiGuestInviteRoutingCapabilityImpl@18e5.sendInvitePush$1");
    }

    public AfS3S0300100_15(Object obj, Object obj2, long j, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.j3 = j;
        this.l2 = obj3;
    }
}
