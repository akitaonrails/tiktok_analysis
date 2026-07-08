package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.ILiveShowApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowContentChangedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowEndWhenAnchorResumeLive;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowNextGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowSeiUpdateStart;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowTransitionStartEvent;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: renamed from: X.01FB, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01FB extends C01FJ {
    @Override // X.C01FJ
    public final String LJJIFFI() {
        return "LiveShowAudienceModel";
    }

    public C01FB(DataChannel dataChannel) {
        super(dataChannel);
        C20441214yg.LJIIIZ("LiveShowAudienceModel", "init");
    }

    @Override // X.C01FJ, X.C01FL
    public final void LIZ(SeiAppData seiAppData) {
        LJJIII(seiAppData);
    }

    @Override // X.C01FJ, X.C01FL
    public final AbstractC19484711Kz<C470590Icr<GetShowContentResponse.ResponseData>> getShowContent(GetShowContentParams getShowContentParams) {
        C480460Ism.LIZ().getClass();
        return C01NB.LIZIZ(((ILiveShowApi) C480460Ism.LIZLLL(ILiveShowApi.class)).getShowContent(getShowContentParams), "LiveShowAudienceModel", "getShowContent").LJIILL(new C516201zk(this, 163)).LJFF(new C0UO0());
    }

    @Override // X.C01FJ
    public final void LJJII(ShowContent showContent, String str) {
        ShowListUser showListUser;
        ShowListUser showListUser2;
        String str2;
        String str3;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        Long lValueOf;
        ShowListUser showListUser3;
        List<ShowListUser> list;
        List<ShowListUser> list2;
        ShowListUser next;
        ShowConfig showConfig;
        List<ShowListUser> list3;
        ShowListUser next2;
        List<ShowListUser> list4;
        ShowListUser next3;
        DataChannel dataChannel3;
        ShowContent showContent2 = this.LIZJ;
        if (showContent2 == null) {
            if (showContent == null) {
                return;
            }
        } else if (showContent != null && showContent2.roomId == showContent.roomId && showContent2.channelId == showContent.channelId && showContent2.showId == showContent.showId && showContent2.showStatus == showContent.showStatus && showContent2.version == showContent.version && showContent2.showCreateTime == showContent.showCreateTime && C01HA.LJFF(showContent2.showConfig, showContent.showConfig) && C01HA.LIZLLL(showContent2.showingAndReadyList, showContent.showingAndReadyList) && C01HA.LIZLLL(showContent2.finishedList, showContent.finishedList)) {
            return;
        }
        super.LJJII(showContent, str);
        ShowContent showContent3 = this.LIZJ;
        if (showContent2 == null && showContent3 != null && (dataChannel3 = this.LIZ) != null) {
            dataChannel3.LC0(LiveShowSeiUpdateStart.class, showContent3);
        }
        DataChannel dataChannel4 = this.LIZ;
        if (dataChannel4 != null) {
            dataChannel4.LC0(LiveShowContentChangedEvent.class, showContent3);
        }
        List<ShowListUser> list5 = null;
        if (showContent2 != null && (list4 = showContent2.showingAndReadyList) != null) {
            Iterator<ShowListUser> it2 = list4.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next3 = it2.next();
                    if (next3.status == 2) {
                        break;
                    }
                } else {
                    next3 = null;
                    break;
                }
            }
            showListUser = next3;
        } else {
            showListUser = null;
        }
        if (showContent3 != null && (list3 = showContent3.showingAndReadyList) != null) {
            Iterator<ShowListUser> it3 = list3.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (next2.status == 2) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            showListUser2 = next2;
        } else {
            showListUser2 = null;
        }
        if (showListUser != null) {
            str2 = showListUser.linkmicIdStr;
        } else {
            str2 = null;
        }
        if (showListUser2 != null) {
            str3 = showListUser2.linkmicIdStr;
        } else {
            str3 = null;
        }
        if (!Intrinsics.LJFF(str2, str3) && showListUser2 != null && showListUser2.linkmicIdStr != null) {
            DataChannel dataChannel5 = this.LIZ;
            if (dataChannel5 != null) {
                ShowContent showContent4 = this.LIZJ;
                if (showContent4 != null && (showConfig = showContent4.showConfig) != null) {
                    lValueOf = Long.valueOf(showConfig.durationPerGuest);
                } else {
                    lValueOf = null;
                }
                ShowContent showContent5 = this.LIZJ;
                if (showContent5 != null && (list2 = showContent5.showingAndReadyList) != null) {
                    Iterator<ShowListUser> it4 = list2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (next.status == 2) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    showListUser3 = next;
                } else {
                    showListUser3 = null;
                }
                ShowContent showContent6 = this.LIZJ;
                if (showContent6 != null) {
                    list = showContent6.showingAndReadyList;
                } else {
                    list = null;
                }
                ShowContent showContent7 = this.LIZJ;
                if (showContent7 != null) {
                    list5 = showContent7.finishedList;
                }
                dataChannel5.LC0(LiveShowNextGuestEvent.class, new C303501Fp(lValueOf, showListUser3, list, list5));
            }
            C306901Gx.LJII();
        }
        if (showContent3 != null && showContent3.transitionInfo != null && C01HT.LIZJ() && (dataChannel2 = this.LIZ) != null) {
            dataChannel2.LC0(LiveShowTransitionStartEvent.class, showContent3);
        }
        if (showContent != null || !Intrinsics.LJFF(str, "sei") || showContent2 == null || showContent2.showStatus != 2 || LJIIL() != 0 || (dataChannel = this.LIZ) == null) {
            return;
        }
        dataChannel.FQ2(LiveShowEndWhenAnchorResumeLive.class);
    }
}
