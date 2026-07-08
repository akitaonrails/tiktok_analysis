package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReserveFailedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReserveSucceedEvent;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse;
import com.bytedance.android.livesdk.model.message.AudienceReserveUserInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0aCL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925750aCL implements InterfaceC921410a5L {
    public final /* synthetic */ C925710aCH LIZ;
    public final /* synthetic */ String LIZIZ = "isReserveDirect_true";
    public final /* synthetic */ boolean LIZJ;

    @Override // X.InterfaceC921410a5L
    public final void LIZ(MultiGuestReserveResponse.ResponseData responseData) {
        long j;
        long j2;
        LiveMode streamType;
        User owner;
        FollowInfo followInfo;
        AudienceReserveUserInfo audienceReserveUserInfo;
        AudienceReserveUserInfo audienceReserveUserInfo2;
        PerceptionMessage perceptionMessage;
        PerceptionMessage perceptionMessage2;
        AbstractC923750a97 abstractC923750a97 = this.LIZ.LLILLJJLI;
        String str = null;
        if (abstractC923750a97 != null) {
            if (responseData != null) {
                perceptionMessage = responseData.perceptionInfo;
            } else {
                perceptionMessage = null;
            }
            if (AbstractC923750a97.onInterceptPunishedMessageNew$liveinteract_impl_release$default(abstractC923750a97, perceptionMessage, null, 2, null)) {
                String strLJIJ = C925710aCH.LJIJ(179);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("from source: ");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", callReserveApi failed, for is onInterceptPunished, MessageNew:");
                if (responseData != null) {
                    perceptionMessage2 = responseData.perceptionInfo;
                } else {
                    perceptionMessage2 = null;
                }
                sbLIZ.append(perceptionMessage2);
                C1AZW.LJFF(strLJIJ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                return;
            }
        }
        if (this.LIZJ) {
            this.LIZ.LJIJI();
        }
        long followStatus = 0;
        if (responseData != null && (audienceReserveUserInfo2 = responseData.reserveUserInfo) != null) {
            j = audienceReserveUserInfo2.reserveId;
        } else {
            j = 0;
        }
        C929810aIt.LIZLLL = j;
        C925710aCH c925710aCH = this.LIZ;
        int i = c925710aCH.LLIZLLLIL;
        if (responseData != null && (audienceReserveUserInfo = responseData.reserveUserInfo) != null) {
            j2 = audienceReserveUserInfo.reserveId;
        } else {
            j2 = 0;
        }
        Room room = c925710aCH.LLILLL;
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            followStatus = followInfo.getFollowStatus();
        }
        C925710aCH c925710aCH2 = this.LIZ;
        int i2 = c925710aCH2.LLILZLL;
        Room room2 = c925710aCH2.LLILLL;
        if (room2 != null && (streamType = room2.getStreamType()) != null) {
            str = streamType.logStreamingType;
        }
        C925600aC6.LJIILJJIL(i, "reservation", j2, "cohost", followStatus, i2, null, str, C932290aMt.LIZ(), false);
        T t = this.LIZ.LL;
        if (t == 0) {
            C305801Gm.LIZIZ(2131841221);
            C929810aIt.LIZIZ(2);
            DataChannel dataChannel = this.LIZ.LLIZ;
            if (dataChannel != null) {
                dataChannel.FQ2(LinkInRoomGuestReserveSucceedEvent.class);
                return;
            }
            return;
        }
        ((InterfaceC925780aCO) t).ht();
    }

    @Override // X.InterfaceC921410a5L
    public final void onFailed(Throwable th) {
        String strLJIJ = C925710aCH.LJIJ(213);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("from source: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", callReserveApi failed, throwable:");
        sbLIZ.append(th);
        C1AZW.LJFF(strLJIJ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C925710aCH c925710aCH = this.LIZ;
        T t = c925710aCH.LL;
        if (t == 0) {
            DataChannel dataChannel = c925710aCH.LLIZ;
            if (dataChannel != null) {
                dataChannel.LC0(LinkInRoomGuestReserveFailedEvent.class, th);
                return;
            }
            return;
        }
        ((InterfaceC925780aCO) t).Kh(th);
    }

    public C925750aCL(C925710aCH c925710aCH, boolean z) {
        this.LIZ = c925710aCH;
        this.LIZJ = z;
    }
}
