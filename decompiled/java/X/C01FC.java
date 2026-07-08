package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.IMultiGuestPlayApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.ToolsTypeStateUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.ILiveShowApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowContentChangedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowFinishGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowNextGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowShowAgainGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowTransitionStartEvent;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateUserPlaySettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateUserPlaySettingsResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.sei.SeiLiveShowExtra;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.linkmic.common.LinkerMediaChangeOperator;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;
import webcast.data.multi_guest_play.TransitionInfo;
import webcast.im.LiveShowMessage;

/* JADX INFO: renamed from: X.01FC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01FC extends C01FJ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
    public final C01FE LJIIIIZZ;
    public final C304201Fw LJIIIZ;
    public List<String> LJIIJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C01FC.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/common/IZoomInterface;", 0);
        C13LE.LIZ.getClass();
        LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C01FJ
    public final String LJJIFFI() {
        return "LiveShowAnchorModel";
    }

    @Override // X.C01FJ, X.C01FL
    public final List<CreateShowParams.ListUser> LJIILIIL() {
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        CreateShowParams.ListUser listUser;
        InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        int i = 0;
        if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJJIII) {
                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                if ((room == null && (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) || linkPlayerInfo.mUser.getId() != room.getOwnerUserId()) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                if (this.LJIIJ.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    for (Object obj2 : arrayList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                        LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) obj2;
                        CreateShowParams.ListUser listUser2 = new CreateShowParams.ListUser();
                        listUser2.userId = linkPlayerInfo2.mUser.getId();
                        listUser2.linkmicId = linkPlayerInfo2.mInteractIdStr;
                        listUser2.order = i2;
                        arrayList2.add(listUser2);
                        i = i2;
                    }
                    return new ArrayList(arrayList2);
                }
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (Object obj3 : arrayList) {
                    linkedHashMap.put(((LinkPlayerInfo) obj3).mInteractIdStr, obj3);
                }
                List<String> list = this.LJIIJ;
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (String str : list) {
                    int i3 = i + 1;
                    if (i < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    LinkPlayerInfo linkPlayerInfo3 = (LinkPlayerInfo) linkedHashMap.get(str);
                    if (linkPlayerInfo3 != null) {
                        listUser = new CreateShowParams.ListUser();
                        listUser.userId = linkPlayerInfo3.mUser.getId();
                        listUser.linkmicId = linkPlayerInfo3.mInteractIdStr;
                        listUser.order = i;
                    } else {
                        listUser = null;
                    }
                    arrayList3.add(listUser);
                    i = i3;
                }
                return new ArrayList(C13LP.LJJJJLI(arrayList3));
            }
        }
        return new ArrayList();
    }

    @Override // X.C01FJ, X.C01FL
    public final void destroy() {
        DataChannel dataChannel;
        this.LJIIIIZZ.LIZ();
        super.destroy();
        if (!C758560TpG.LIZ() || (dataChannel = this.LIZ) == null) {
            return;
        }
        dataChannel.LC0(ToolsTypeStateUpdateEvent.class, new C935490aS3(EnumC936960aUQ.LIVE_SHOW, false));
    }

    @Override // X.C01FJ, X.C01FL
    public final void LJ() {
        List<ShowListUser> list;
        ShowListUser next;
        ShowConfig showConfig;
        LinkUser linkUserLLD;
        String str;
        DataChannel dataChannel;
        if (C01HT.LIZJ()) {
            ShowContent showContent = this.LIZJ;
            if (showContent != null && showContent.transitionInfo != null && (dataChannel = this.LIZ) != null) {
                dataChannel.LC0(LiveShowTransitionStartEvent.class, showContent);
            }
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.LC0(LiveShowContentChangedEvent.class, this.LIZJ);
            }
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL == null || (linkUserLLD = interfaceC954180awCLLJLL.LLD(UserService.getInstance().user().getCurrentUserId())) == null || (str = linkUserLLD.linkMicId) == null) {
                return;
            }
            C304201Fw c304201Fw = this.LJIIIZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJIIJJI;
            InterfaceC927510aFB interfaceC927510aFB = (InterfaceC927510aFB) c304201Fw.LIZ();
            if (interfaceC927510aFB != null) {
                interfaceC927510aFB.LIZLLL(str, true);
                return;
            }
            return;
        }
        ShowContent showContent2 = this.LIZJ;
        if (showContent2 == null || (list = showContent2.showingAndReadyList) == null) {
            return;
        }
        Iterator<ShowListUser> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (next.status == 2) {
                    break;
                }
            }
        }
        ShowListUser showListUser = next;
        if (showListUser != null) {
            DataChannel dataChannel3 = this.LIZ;
            if (dataChannel3 != null) {
                ShowContent showContent3 = this.LIZJ;
                Long lValueOf = (showContent3 == null || (showConfig = showContent3.showConfig) == null) ? null : Long.valueOf(showConfig.durationPerGuest);
                ShowContent showContent4 = this.LIZJ;
                List<ShowListUser> list2 = showContent4 != null ? showContent4.showingAndReadyList : null;
                ShowContent showContent5 = this.LIZJ;
                dataChannel3.LC0(LiveShowNextGuestEvent.class, new C303501Fp(lValueOf, showListUser, list2, showContent5 != null ? showContent5.finishedList : null));
            }
            DataChannel dataChannel4 = this.LIZ;
            if (dataChannel4 != null) {
                dataChannel4.LC0(LiveShowContentChangedEvent.class, this.LIZJ);
            }
            C304201Fw c304201Fw2 = this.LJIIIZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LJIIJJI;
            InterfaceC927510aFB interfaceC927510aFB2 = (InterfaceC927510aFB) c304201Fw2.LIZ();
            if (interfaceC927510aFB2 != null) {
                interfaceC927510aFB2.LIZLLL(showListUser.linkmicIdStr, false);
            }
        }
    }

    public C01FC(DataChannel dataChannel) {
        super(dataChannel);
        this.LJIIIIZZ = new C01FE(dataChannel, this);
        this.LJIIIZ = new C304201Fw("ZOOM_SERVICE");
        this.LJIIJ = new ArrayList();
        C20441214yg.LJIIIZ("LiveShowAnchorModel", "init");
    }

    public static ShowListUser LJJIIJ(ShowContent showContent) {
        List<ShowListUser> list;
        ShowListUser showListUser = null;
        if (showContent == null || (list = showContent.showingAndReadyList) == null) {
            return null;
        }
        Iterator<ShowListUser> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ShowListUser next = it2.next();
            if (next.status == 2) {
                showListUser = next;
                break;
            }
        }
        return showListUser;
    }

    @Override // X.C01FJ, X.C01FL
    public final void LJI(List<String> list) {
        this.LJIIJ = list;
    }

    @Override // X.C01FJ, X.C01FL
    public final AbstractC19484711Kz<C470590Icr<FinishShowingGuestResponse.ResponseData>> LJIJ(FinishShowingGuestParams finishShowingGuestParams) {
        C480460Ism.LIZ().getClass();
        return C01NB.LIZIZ(((ILiveShowApi) C480460Ism.LIZLLL(ILiveShowApi.class)).finishGuest(finishShowingGuestParams), "LiveShowAnchorModel", "finishGuest").LJIILL(new C516201zk(this, 154)).LJFF(new C0UO0());
    }

    @Override // X.C01FJ, X.C01FL
    public final void LJIJI(LiveShowMessage liveShowMessage) {
        C923330a8R c923330a8R = C923330a8R.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShowAnchorModel");
        sbLIZ.append("_onEndShowMessageReceived");
        C923330a8R.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
        C923330a8R.LJIIJJI(liveShowMessage.operatorUserInfo, new C020W(this, liveShowMessage, 36));
        ShowContent showContent = liveShowMessage.showContent;
        if (showContent != null) {
            LJJI(showContent, "onEndShowMessageReceived");
        }
    }

    @Override // X.C01FJ, X.C01FL
    public final void LJJ(LiveShowMessage liveShowMessage) {
        C923330a8R c923330a8R = C923330a8R.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShowAnchorModel");
        sbLIZ.append("_onContentChangedMessageReceived");
        C923330a8R.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
        C923330a8R.LJIIJJI(liveShowMessage.operatorUserInfo, new C020W(this, liveShowMessage, 35));
        ShowContent showContent = liveShowMessage.showContent;
        if (showContent != null) {
            LJJI(showContent, "onContentChangedMessageReceived");
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                dataChannel.LC0(LiveShowContentChangedEvent.class, this.LIZJ);
            }
        }
    }

    @Override // X.C01FJ, X.C01FL
    public final AbstractC19484711Kz<C470590Icr<CreateShowResponse.ResponseData>> createShow(CreateShowParams createShowParams) {
        C480460Ism.LIZ().getClass();
        return C01NB.LIZIZ(((ILiveShowApi) C480460Ism.LIZLLL(ILiveShowApi.class)).createShow(createShowParams), "LiveShowAnchorModel", "createShow").LJFF(new C0UO0()).LJIILL(new C516201zk(this, 152));
    }

    @Override // X.C01FJ, X.C01FL
    public final AbstractC19484711Kz<C470590Icr<EndShowResponse.ResponseData>> endShow(EndShowParams endShowParams) {
        C480460Ism.LIZ().getClass();
        return C01NB.LIZIZ(((ILiveShowApi) C480460Ism.LIZLLL(ILiveShowApi.class)).endShow(endShowParams), "LiveShowAnchorModel", "endShow").LJIILL(new C516201zk(this, 153)).LJFF(new C0UO0());
    }

    @Override // X.C01FJ, X.C01FL
    public final AbstractC19484711Kz<C470590Icr<GetShowContentResponse.ResponseData>> getShowContent(GetShowContentParams getShowContentParams) {
        C480460Ism.LIZ().getClass();
        return C01NB.LIZIZ(((ILiveShowApi) C480460Ism.LIZLLL(ILiveShowApi.class)).getShowContent(getShowContentParams), "LiveShowAnchorModel", "getShowContent").LJIILL(new C516201zk(this, 155)).LJFF(new C0UO0());
    }

    @Override // X.C01FJ, X.C01FL
    public final AbstractC19484711Kz<C470590Icr<ShowAgainGuestResponse.ResponseData>> showAgainGuest(ShowAgainGuestParams showAgainGuestParams) {
        C480460Ism.LIZ().getClass();
        return C01NB.LIZIZ(((ILiveShowApi) C480460Ism.LIZLLL(ILiveShowApi.class)).showAgainGuest(showAgainGuestParams), "LiveShowAnchorModel", "showAgainGuest").LJIILL(new C516201zk(this, 156)).LJFF(new C0UO0());
    }

    @Override // X.C01FJ, X.C01FL
    public final AbstractC19484711Kz<C470590Icr<UpdateShowContentResponse.ResponseData>> updateShowContent(UpdateShowContentParams updateShowContentParams) {
        C480460Ism.LIZ().getClass();
        return C01NB.LIZIZ(((ILiveShowApi) C480460Ism.LIZLLL(ILiveShowApi.class)).updateShowContent(updateShowContentParams), "LiveShowAnchorModel", "updateShowContent").LJIILL(new C516201zk(this, 157)).LJFF(new C0UO0());
    }

    @Override // X.C01FJ, X.C01FL
    public final AbstractC19484711Kz<C470590Icr<UpdateUserPlaySettingsResponse.ResponseData>> updateUserPlaySettings(UpdateUserPlaySettingsParams updateUserPlaySettingsParams) {
        C480460Ism.LIZ().getClass();
        return C01NB.LIZIZ(((IMultiGuestPlayApi) C480460Ism.LIZLLL(IMultiGuestPlayApi.class)).updateUserPlaySettings(updateUserPlaySettingsParams), "LiveShowAnchorModel", "updateUserPlaySettings").LJFF(new C0UO0());
    }

    @Override // X.C01FJ, X.C01FL
    public final void LJIILJJIL(LiveShowMessage liveShowMessage, LinkerMediaChangeOperator linkerMediaChangeOperator) {
        List<ShowListUser> list;
        ShowListUser next;
        Long lValueOf;
        ShowListUser showListUser;
        List<ShowListUser> list2;
        List<ShowListUser> list3;
        ShowListUser next2;
        ShowConfig showConfig;
        C923330a8R c923330a8R = C923330a8R.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShowAnchorModel");
        sbLIZ.append("_onNextGuestMessageReceived operatorUserInfo:");
        sbLIZ.append(linkerMediaChangeOperator);
        C923330a8R.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
        C923330a8R.LJIIJJI(linkerMediaChangeOperator, new C020W(this, liveShowMessage, 37));
        ShowContent showContent = liveShowMessage.showContent;
        if (showContent != null) {
            Iterator<ShowListUser> it2 = showContent.showingAndReadyList.iterator();
            while (true) {
                list = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.status == 2) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ShowListUser showListUser2 = next;
            if (showListUser2 != null) {
                C306901Gx.LJIIIZ(showListUser2.userId);
            }
            LJJI(showContent, "onNextGuestMessageReceived");
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                ShowContent showContent2 = this.LIZJ;
                if (showContent2 != null && (showConfig = showContent2.showConfig) != null) {
                    lValueOf = Long.valueOf(showConfig.durationPerGuest);
                } else {
                    lValueOf = null;
                }
                ShowContent showContent3 = this.LIZJ;
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
                    showListUser = next2;
                } else {
                    showListUser = null;
                }
                ShowContent showContent4 = this.LIZJ;
                if (showContent4 != null) {
                    list2 = showContent4.showingAndReadyList;
                } else {
                    list2 = null;
                }
                ShowContent showContent5 = this.LIZJ;
                if (showContent5 != null) {
                    list = showContent5.finishedList;
                }
                dataChannel.LC0(LiveShowNextGuestEvent.class, new C303501Fp(lValueOf, showListUser, list2, list));
            }
        }
    }

    @Override // X.C01FJ, X.C01FL
    public final void LJIILLIIL(LiveShowMessage liveShowMessage, LinkerMediaChangeOperator linkerMediaChangeOperator) {
        C923330a8R c923330a8R = C923330a8R.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShowAnchorModel");
        sbLIZ.append("_onTransitionMessageReceived operatorUserInfo:");
        sbLIZ.append(linkerMediaChangeOperator);
        C923330a8R.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
        C923330a8R.LJIIJJI(linkerMediaChangeOperator, new C5183020f(this, 171));
        ShowContent showContent = liveShowMessage.showContent;
        if (showContent != null) {
            LJJI(showContent, "onTransitionMessageReceived");
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                dataChannel.LC0(LiveShowTransitionStartEvent.class, showContent);
            }
        }
    }

    @Override // X.C01FJ, X.C01FL
    public final void LJIIZILJ(ShowContent showContent, LinkerMediaChangeOperator linkerMediaChangeOperator) {
        DataChannel dataChannel;
        C923330a8R c923330a8R = C923330a8R.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShowAnchorModel");
        sbLIZ.append("_onShowAgainGuestMessageReceived operatorUserInfo:");
        sbLIZ.append(linkerMediaChangeOperator);
        C923330a8R.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
        C923330a8R.LJIIJJI(linkerMediaChangeOperator, new C020W(this, showContent, 38));
        if (LJJI(showContent, "onShowAgainGuestMessageReceived") && (dataChannel = this.LIZ) != null) {
            dataChannel.LC0(LiveShowShowAgainGuestEvent.class, this.LIZJ);
        }
    }

    @Override // X.C01FJ, X.C01FL
    public final void LJIJJ(ShowContent showContent, LinkerMediaChangeOperator linkerMediaChangeOperator) {
        LJJI(showContent, "onCreateShowMessageReceived");
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LJIIJJI(linkerMediaChangeOperator, AnonymousClass0207.get$arr$(76));
    }

    @Override // X.C01FJ, X.C01FL
    public final void LJIL(ShowContent showContent, LinkerMediaChangeOperator linkerMediaChangeOperator) {
        DataChannel dataChannel;
        C923330a8R c923330a8R = C923330a8R.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShowAnchorModel");
        sbLIZ.append("_onFinishGuestMessageReceived operatorUserInfo:");
        sbLIZ.append(linkerMediaChangeOperator);
        C923330a8R.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
        C923330a8R.LJIIJJI(linkerMediaChangeOperator, new C5183020f(this, 170));
        if (LJJI(showContent, "onFinishGuestMessageReceived") && (dataChannel = this.LIZ) != null) {
            dataChannel.LC0(LiveShowFinishGuestEvent.class, this.LIZJ);
        }
    }

    @Override // X.C01FJ
    public final void LJJII(ShowContent showContent, String str) throws JSONException {
        int i;
        long j;
        long j2;
        ShowConfig showConfig;
        ShowConfig showConfig2;
        TransitionInfo transitionInfo;
        ShowConfig showConfig3;
        DataChannel dataChannel;
        boolean z;
        super.LJJII(showContent, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateModel showContent.config:");
        ShowConfig showConfig4 = null;
        if (showContent != null) {
            showConfig4 = showContent.showConfig;
        }
        sbLIZ.append(showConfig4);
        sbLIZ.append(" source:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("LiveShowAnchorModel", C2188811AlT.LIZIZ(sbLIZ));
        if (C758560TpG.LIZ() && (dataChannel = this.LIZ) != null) {
            EnumC936960aUQ enumC936960aUQ = EnumC936960aUQ.LIVE_SHOW;
            if (LJIIL() > 0) {
                z = true;
            } else {
                z = false;
            }
            dataChannel.LC0(ToolsTypeStateUpdateEvent.class, new C935490aS3(enumC936960aUQ, z));
        }
        if (LJIIL() == 0) {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC954180awCLLJLL.LJJIII();
                return;
            }
            return;
        }
        boolean z2 = false;
        SeiLiveShowExtra seiLiveShowExtra = new SeiLiveShowExtra(0, 0L, 0, 0L, 0L, false);
        ShowContent showContent2 = this.LIZJ;
        if (showContent2 != null && (showConfig3 = showContent2.showConfig) != null) {
            i = (int) showConfig3.durationPerGuest;
        } else {
            i = 0;
        }
        seiLiveShowExtra.eachShowDuration = i;
        ShowContent showContent3 = this.LIZJ;
        long j3 = 0;
        if (showContent3 != null) {
            j = showContent3.showId;
        } else {
            j = 0;
        }
        seiLiveShowExtra.showId = j;
        seiLiveShowExtra.showStatus = LJIIL();
        ShowContent showContent4 = this.LIZJ;
        if (showContent4 != null && (transitionInfo = showContent4.transitionInfo) != null) {
            j2 = transitionInfo.transitionStartTime;
        } else {
            j2 = 0;
        }
        seiLiveShowExtra.transStartTime = j2;
        ShowContent showContent5 = this.LIZJ;
        if (showContent5 != null && (showConfig2 = showContent5.showConfig) != null) {
            j3 = showConfig2.transitionDurationOfConfig;
        }
        seiLiveShowExtra.transDuration = j3;
        ShowContent showContent6 = this.LIZJ;
        if (showContent6 != null && (showConfig = showContent6.showConfig) != null) {
            z2 = showConfig.allowOpenMicFreely;
        }
        seiLiveShowExtra.allowOpenMicFreely = z2;
        HashMap map = new HashMap();
        ShowContent showContent7 = this.LIZJ;
        if (showContent7 != null) {
            ArrayList<ShowListUser> arrayList = new ArrayList();
            arrayList.addAll(showContent7.showingAndReadyList);
            arrayList.addAll(showContent7.finishedList);
            for (ShowListUser showListUser : arrayList) {
                String str2 = showListUser.linkmicIdStr;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("order", showListUser.order);
                jSONObject.put("time", showListUser.showStartTime);
                jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, showListUser.status);
                map.put(str2, jSONObject);
            }
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("show_status", String.valueOf(seiLiveShowExtra.showStatus));
        linkedHashMap.put("each_show_duration", String.valueOf(seiLiveShowExtra.eachShowDuration));
        linkedHashMap.put("show_id", String.valueOf(seiLiveShowExtra.showId));
        if (C01HT.LIZJ()) {
            linkedHashMap.put("trans_t", String.valueOf(seiLiveShowExtra.transStartTime));
        }
        linkedHashMap.put("trans_d", String.valueOf(seiLiveShowExtra.transDuration));
        linkedHashMap.put("mic_ctrl", String.valueOf(seiLiveShowExtra.allowOpenMicFreely));
        interfaceC954180awCLLJLL2.LJJIL(linkedHashMap, map);
    }
}
