package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.ILiveShowApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowMatchTotalScoreUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowSendJsEventForRefreshBannerData;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateUserPlaySettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateUserPlaySettingsResponse;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiExtraInfo;
import com.bytedance.android.livesdk.sei.SeiLiveShowExtra;
import com.bytedance.android.livesdk.sei.SeiLiveShowGuestInfo;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import tikcast.linkmic.common.LinkerMediaChangeOperator;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;
import webcast.data.multi_guest_play.TransitionInfo;
import webcast.im.LiveShowMessage;

/* JADX INFO: renamed from: X.01FJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public abstract class C01FJ implements C01FL {
    public final DataChannel LIZ;
    public volatile ShowContent LIZJ;
    public volatile boolean LJ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C09EA());
    public final CopyOnWriteArrayList<C01FR> LIZLLL = new CopyOnWriteArrayList<>();
    public final C01GW LJFF = C452501pT.LIZIZ(new C01FP());
    public final ConcurrentHashMap<Long, Long> LJI = new ConcurrentHashMap<>();
    public final C01GW LJII = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(331));

    @Override // X.C01FL
    public void LIZ(SeiAppData seiAppData) {
    }

    @Override // X.C01FL
    public void LJ() {
    }

    @Override // X.C01FL
    public void LJI(List<String> list) {
    }

    @Override // X.C01FL
    public void LJIILJJIL(LiveShowMessage liveShowMessage, LinkerMediaChangeOperator linkerMediaChangeOperator) {
    }

    @Override // X.C01FL
    public void LJIILLIIL(LiveShowMessage liveShowMessage, LinkerMediaChangeOperator linkerMediaChangeOperator) {
    }

    @Override // X.C01FL
    public void LJIIZILJ(ShowContent showContent, LinkerMediaChangeOperator linkerMediaChangeOperator) {
    }

    @Override // X.C01FL
    public void LJIJI(LiveShowMessage liveShowMessage) {
    }

    @Override // X.C01FL
    public void LJIJJ(ShowContent showContent, LinkerMediaChangeOperator linkerMediaChangeOperator) {
    }

    @Override // X.C01FL
    public void LJIL(ShowContent showContent, LinkerMediaChangeOperator linkerMediaChangeOperator) {
    }

    @Override // X.C01FL
    public void LJJ(LiveShowMessage liveShowMessage) {
    }

    public abstract String LJJIFFI();

    static {
        new Object() { // from class: X.01FS
        };
    }

    @Override // X.C01FL
    public final Long LJII() {
        ShowContent showContent = this.LIZJ;
        if (showContent != null) {
            return Long.valueOf(showContent.showId);
        }
        return null;
    }

    @Override // X.C01FL
    public final Map<Integer, Boolean> LJIIJJI() {
        return (Map) this.LJFF.getValue();
    }

    @Override // X.C01FL
    public final int LJIIL() {
        ShowContent showContent = this.LIZJ;
        if (showContent != null) {
            return showContent.showStatus;
        }
        return 0;
    }

    @Override // X.C01FL
    public List<CreateShowParams.ListUser> LJIILIIL() {
        return new ArrayList();
    }

    @Override // X.C01FL
    public final void LIZIZ() {
        C20441214yg.LJIIIZ(LJJIFFI(), "clearMatchScoreForCurrentShow");
        this.LJI.clear();
    }

    @Override // X.C01FL
    public void destroy() {
        C20441214yg.LJIIIZ(LJJIFFI(), "destroy");
        this.LIZLLL.clear();
        LIZLLL("destroy");
    }

    @Override // X.C01FL
    public final boolean LJIIJ() {
        return this.LJ;
    }

    @Override // X.C01FL
    public final ShowContent getContent() {
        return this.LIZJ;
    }

    public C01FJ(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // X.C01FL
    public final long LIZJ(long j) {
        if (C01ZE.LIZ()) {
            InterfaceC938250aWV interfaceC938250aWV = (InterfaceC938250aWV) this.LJII.getValue();
            if (interfaceC938250aWV == null) {
                return 0L;
            }
            return interfaceC938250aWV.LIZLLL(j);
        }
        Long l = this.LJI.get(Long.valueOf(j));
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    @Override // X.C01FL
    public final void LIZLLL(String str) {
        String strLJJIFFI = LJJIFFI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearCache source=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(strLJJIFFI, C2188811AlT.LIZIZ(sbLIZ));
        LJJII(null, str);
        LIZIZ();
    }

    @Override // X.C01FL
    public final void LJFF(C01FR c01fr) {
        if (!this.LIZLLL.contains(c01fr)) {
            this.LIZLLL.add(c01fr);
        }
    }

    @Override // X.C01FL
    public final void LJIIIIZZ(ShowContent showContent) {
        LJJII(showContent, "set-content");
    }

    @Override // X.C01FL
    public final void LJIIIZ(C01FR c01fr) {
        if (this.LIZLLL.contains(c01fr)) {
            this.LIZLLL.remove(c01fr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    @Override // X.C01FL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJIILL(java.lang.String r15) {
        /*
            r14 = this;
            webcast.data.multi_guest_play.ShowContent r0 = r14.LIZJ
            r12 = 0
            if (r0 == 0) goto L77
            webcast.data.multi_guest_play.ShowConfig r0 = r0.showConfig
            if (r0 == 0) goto L77
            long r4 = r0.durationPerGuest
            r0 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r0
            long r4 = r4 * r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            webcast.data.multi_guest_play.ShowContent r0 = r14.LIZJ
            if (r0 == 0) goto L20
            java.util.List<webcast.data.multi_guest_play.ShowListUser> r0 = r0.showingAndReadyList
            if (r0 == 0) goto L20
            r1.addAll(r0)
        L20:
            webcast.data.multi_guest_play.ShowContent r0 = r14.LIZJ
            if (r0 == 0) goto L2b
            java.util.List<webcast.data.multi_guest_play.ShowListUser> r0 = r0.finishedList
            if (r0 == 0) goto L2b
            r1.addAll(r0)
        L2b:
            java.util.Iterator r7 = r1.iterator()
        L2f:
            boolean r0 = r7.hasNext()
            r6 = 0
            if (r0 == 0) goto L48
            java.lang.Object r1 = r7.next()
            r0 = r1
            webcast.data.multi_guest_play.ShowListUser r0 = (webcast.data.multi_guest_play.ShowListUser) r0
            if (r0 == 0) goto L41
            java.lang.String r6 = r0.linkmicIdStr
        L41:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r15, r6)
            if (r0 == 0) goto L2f
            r6 = r1
        L48:
            webcast.data.multi_guest_play.ShowListUser r6 = (webcast.data.multi_guest_play.ShowListUser) r6
            if (r6 == 0) goto L7b
            long r8 = r6.showStartTime
            webcast.data.multi_guest_play.ShowContent r0 = r14.LIZJ
            if (r0 == 0) goto L5c
            webcast.data.multi_guest_play.ShowContent r0 = r14.LIZJ
            if (r0 == 0) goto L78
            long r6 = r0.version
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 != 0) goto L78
        L5c:
            long r0 = X.C01HA.LJIIIIZZ()
        L60:
            long r10 = X.C158B.LIZ()
            long r10 = r10 + r0
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 <= 0) goto L7b
            long r6 = -r0
            long r0 = X.C158B.LIZ()
            long r6 = r6 + r0
            long r6 = r6 - r8
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 >= 0) goto L7d
        L74:
            long r4 = r4 - r12
            long r12 = r4 / r2
        L77:
            return r12
        L78:
            r0 = 0
            goto L60
        L7b:
            r6 = 0
        L7d:
            r12 = r6
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01FJ.LJIILL(java.lang.String):long");
    }

    @Override // X.C01FL
    public AbstractC19484711Kz<C470590Icr<FinishShowingGuestResponse.ResponseData>> LJIJ(FinishShowingGuestParams finishShowingGuestParams) {
        return AbstractC19484711Kz.LJIJJLI(new C470590Icr());
    }

    public final void LJJIII(SeiAppData seiAppData) {
        Map<String, String> map;
        Map<String, String> map2;
        long jLongValue;
        boolean z;
        int i;
        long j;
        int i2;
        SeiLiveShowGuestInfo seiLiveShowGuestInfo;
        SeiLiveShowGuestInfo seiLiveShowGuestInfo2;
        SeiLiveShowGuestInfo seiLiveShowGuestInfo3;
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkListUser linkListUser;
        long id;
        ImageModel avatarThumb;
        User.EnigmaInfo enigmaInfo;
        SeiLiveShowGuestInfo seiLiveShowGuestInfo4;
        SeiLiveShowGuestInfo seiLiveShowGuestInfo5;
        SeiLiveShowGuestInfo seiLiveShowGuestInfo6;
        Long lLJIILIIL;
        Map<String, Map<String, String>> map3;
        if (seiAppData != null && (map3 = seiAppData.businessExtraInfo) != null) {
            map = map3.get("live_show_sei");
        } else {
            map = null;
        }
        if (map == null) {
            LJJII(null, "sei");
            return;
        }
        Map<String, Map<String, String>> map4 = seiAppData.businessExtraInfo;
        if (map4 == null || (map2 = map4.get("live_show_sei")) == null) {
            return;
        }
        if (map2.isEmpty()) {
            LJJII(null, "sei");
            return;
        }
        SeiLiveShowExtra seiLiveShowExtra = (SeiLiveShowExtra) GsonProtectorUtils.fromJson((Gson) this.LIZIZ.getValue(), C1516000pYM.LIZJ(map2), SeiLiveShowExtra.class);
        ShowContent showContent = new ShowContent();
        showContent.showId = seiLiveShowExtra.showId;
        showContent.showStatus = seiLiveShowExtra.showStatus;
        ShowConfig showConfig = new ShowConfig();
        showContent.showConfig = showConfig;
        showConfig.durationPerGuest = seiLiveShowExtra.eachShowDuration;
        showConfig.transitionDurationOfConfig = seiLiveShowExtra.transDuration;
        showConfig.allowOpenMicFreely = seiLiveShowExtra.allowOpenMicFreely;
        String str = seiAppData.channelId;
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        showContent.channelId = jLongValue;
        showContent.version = 0L;
        showContent.showingAndReadyList = new ArrayList();
        showContent.finishedList = new ArrayList();
        TransitionInfo transitionInfo = new TransitionInfo();
        transitionInfo.transitionStartTime = seiLiveShowExtra.transStartTime;
        transitionInfo.transitionDurationOfCurrent = seiLiveShowExtra.transDuration;
        showContent.transitionInfo = transitionInfo;
        List<SeiRegion> list = seiAppData.grids;
        if (list != null) {
            for (SeiRegion seiRegion : list) {
                SeiExtraInfo seiExtraInfo = seiRegion.extraInfo;
                if (seiExtraInfo != null) {
                    SeiLiveShowGuestInfo seiLiveShowGuestInfo7 = seiExtraInfo.guestLiveShowInfo;
                    if (seiLiveShowGuestInfo7 != null && seiLiveShowGuestInfo7.show_status == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || (seiExtraInfo != null && (((seiLiveShowGuestInfo5 = seiExtraInfo.guestLiveShowInfo) != null && seiLiveShowGuestInfo5.show_status == 2) || ((seiLiveShowGuestInfo6 = seiExtraInfo.guestLiveShowInfo) != null && seiLiveShowGuestInfo6.show_status == 3)))) {
                        ShowListUser showListUser = new ShowListUser();
                        SeiExtraInfo seiExtraInfo2 = seiRegion.extraInfo;
                        if (seiExtraInfo2 != null && (seiLiveShowGuestInfo4 = seiExtraInfo2.guestLiveShowInfo) != null) {
                            i = seiLiveShowGuestInfo4.show_order;
                        } else {
                            i = 0;
                        }
                        showListUser.order = i;
                        showListUser.linkmicIdStr = seiRegion.uidStr;
                        InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
                        if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (linkListUser = (LinkListUser) abstractC928510aGnLIZ.LJIIZILJ(seiRegion.uidStr)) != null) {
                            User user = linkListUser.user;
                            if (user != null) {
                                id = user.getId();
                            } else {
                                id = 0;
                            }
                            showListUser.userId = id;
                            showListUser.nickname = C0KVU.LIZLLL(linkListUser.user);
                            User user2 = linkListUser.user;
                            if (user2 != null) {
                                avatarThumb = user2.getAvatarThumb();
                            } else {
                                avatarThumb = null;
                            }
                            showListUser.avatarThumb = avatarThumb;
                            User user3 = linkListUser.user;
                            if (user3 != null) {
                                enigmaInfo = user3.enigmaInfo;
                            } else {
                                enigmaInfo = null;
                            }
                            showListUser.enigmaInfo = enigmaInfo;
                        }
                        SeiExtraInfo seiExtraInfo3 = seiRegion.extraInfo;
                        if (seiExtraInfo3 != null && (seiLiveShowGuestInfo3 = seiExtraInfo3.guestLiveShowInfo) != null) {
                            j = seiLiveShowGuestInfo3.start_time;
                        } else {
                            j = 0;
                        }
                        showListUser.showStartTime = j;
                        if (seiExtraInfo3 != null && (seiLiveShowGuestInfo2 = seiExtraInfo3.guestLiveShowInfo) != null) {
                            i2 = seiLiveShowGuestInfo2.show_status;
                        } else {
                            i2 = 0;
                        }
                        showListUser.status = i2;
                        if (seiExtraInfo3 != null && (seiLiveShowGuestInfo = seiExtraInfo3.guestLiveShowInfo) != null && seiLiveShowGuestInfo.show_status == 3) {
                            showContent.finishedList.add(showListUser);
                        } else {
                            showContent.showingAndReadyList.add(showListUser);
                        }
                    }
                }
            }
        }
        List<ShowListUser> list2 = showContent.showingAndReadyList;
        if (list2.size() > 1) {
            C08XD.LJJ(list2, new C512401z8(31));
        }
        LJJII(showContent, "sei");
    }

    @Override // X.C01FL
    public AbstractC19484711Kz<C470590Icr<CreateShowResponse.ResponseData>> createShow(CreateShowParams createShowParams) {
        return AbstractC19484711Kz.LJIJJLI(new C470590Icr());
    }

    @Override // X.C01FL
    public AbstractC19484711Kz<C470590Icr<EndShowResponse.ResponseData>> endShow(EndShowParams endShowParams) {
        return AbstractC19484711Kz.LJIJJLI(new C470590Icr());
    }

    @Override // X.C01FL
    public AbstractC19484711Kz<C470590Icr<GetShowContentResponse.ResponseData>> getShowContent(GetShowContentParams getShowContentParams) {
        return AbstractC19484711Kz.LJIJJLI(new C470590Icr());
    }

    @Override // X.C01FL
    public final AbstractC19484711Kz<C470590Icr<GetShowSettingsResponse.ResponseData>> getShowSetting(GetShowSettingsParams getShowSettingsParams) {
        C480460Ism.LIZ().getClass();
        return ((ILiveShowApi) C480460Ism.LIZLLL(ILiveShowApi.class)).getShowSetting(getShowSettingsParams).LJFF(new C0UO0());
    }

    @Override // X.C01FL
    public AbstractC19484711Kz<C470590Icr<ShowAgainGuestResponse.ResponseData>> showAgainGuest(ShowAgainGuestParams showAgainGuestParams) {
        return AbstractC19484711Kz.LJIJJLI(new C470590Icr());
    }

    @Override // X.C01FL
    public AbstractC19484711Kz<C470590Icr<UpdateShowContentResponse.ResponseData>> updateShowContent(UpdateShowContentParams updateShowContentParams) {
        return AbstractC19484711Kz.LJIJJLI(new C470590Icr());
    }

    @Override // X.C01FL
    public AbstractC19484711Kz<C470590Icr<UpdateUserPlaySettingsResponse.ResponseData>> updateUserPlaySettings(UpdateUserPlaySettingsParams updateUserPlaySettingsParams) {
        return AbstractC19484711Kz.LJIJJLI(new C470590Icr());
    }

    public final boolean LJJI(ShowContent showContent, String str) {
        long j;
        if (Long.valueOf(showContent.version) != null) {
            ShowContent showContent2 = this.LIZJ;
            if (showContent2 != null) {
                j = showContent2.version;
            } else {
                j = 0;
            }
            if (showContent.version > j) {
                LJJII(showContent, str);
                return true;
            }
        }
        String strLJJIFFI = LJJIFFI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ignore update source=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(strLJJIFFI, C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public void LJJII(ShowContent showContent, String str) {
        String strLIZJ;
        ShowListUser showListUserLJIILLIIL;
        List<ShowListUser> list;
        List<ShowListUser> list2;
        String strLJJIFFI = LJJIFFI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateModel showContent=");
        if (showContent != null) {
            strLIZJ = C1516000pYM.LIZJ(showContent);
        } else {
            strLIZJ = null;
        }
        sbLIZ.append(strLIZJ);
        sbLIZ.append(" source=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(strLJJIFFI, C2188811AlT.LIZIZ(sbLIZ));
        int iLJIIL = LJIIL();
        this.LIZJ = showContent;
        int iLJIIL2 = LJIIL();
        if (iLJIIL != iLJIIL2) {
            if (iLJIIL2 != 0) {
                if (iLJIIL2 != 1) {
                    if (iLJIIL2 != 2) {
                        if (iLJIIL2 == 3) {
                            String strLJJIFFI2 = LJJIFFI();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("toStateEnd listeners=");
                            sbLIZ2.append(this.LIZLLL);
                            C20441214yg.LJIIIZ(strLJJIFFI2, C2188811AlT.LIZIZ(sbLIZ2));
                            Iterator<C01FR> it2 = this.LIZLLL.iterator();
                            while (it2.hasNext()) {
                                it2.next().LIZLLL();
                            }
                        }
                    } else {
                        this.LJ = true;
                        String strLJJIFFI3 = LJJIFFI();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("toStateShowing listeners=");
                        sbLIZ3.append(this.LIZLLL);
                        C20441214yg.LJIIIZ(strLJJIFFI3, C2188811AlT.LIZIZ(sbLIZ3));
                        Iterator<C01FR> it3 = this.LIZLLL.iterator();
                        while (it3.hasNext()) {
                            it3.next().LIZIZ();
                        }
                    }
                } else {
                    String strLJJIFFI4 = LJJIFFI();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("toStateReady listeners=");
                    sbLIZ4.append(this.LIZLLL);
                    C20441214yg.LJIIIZ(strLJJIFFI4, C2188811AlT.LIZIZ(sbLIZ4));
                    Iterator<C01FR> it4 = this.LIZLLL.iterator();
                    while (it4.hasNext()) {
                        it4.next().LIZ(this);
                    }
                }
            } else {
                this.LJ = false;
                String strLJJIFFI5 = LJJIFFI();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("toStateIdle listeners=");
                sbLIZ5.append(this.LIZLLL);
                C20441214yg.LJIIIZ(strLJJIFFI5, C2188811AlT.LIZIZ(sbLIZ5));
                Iterator<C01FR> it5 = this.LIZLLL.iterator();
                while (it5.hasNext()) {
                    it5.next().LIZJ();
                }
            }
        }
        ShowContent showContent2 = this.LIZJ;
        if (showContent2 != null && (list2 = showContent2.showingAndReadyList) != null) {
            for (ShowListUser showListUser : list2) {
                LJIJJLI(showListUser.userId, showListUser.score, str);
            }
        }
        ShowContent showContent3 = this.LIZJ;
        if (showContent3 != null && (list = showContent3.finishedList) != null) {
            for (ShowListUser showListUser2 : list) {
                LJIJJLI(showListUser2.userId, showListUser2.score, str);
            }
        }
        DataChannel dataChannel = this.LIZ;
        if (C01HT.LIZJ()) {
            InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
            if (interfaceC302601FgLIZ != null && (showListUserLJIILLIIL = interfaceC302601FgLIZ.LJIILLIIL()) != null && dataChannel != null) {
                dataChannel.zW(LiveShowSendJsEventForRefreshBannerData.class, new Pair(3, showListUserLJIILLIIL));
            }
            C01HA.LJIIIZ(null, null);
            return;
        }
        C01HA.LIZIZ(null);
    }

    @Override // X.C01FL
    public final void LJIJJLI(long j, long j2, String str) {
        long jLongValue;
        Long l = this.LJI.get(Long.valueOf(j));
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        String strLJJIFFI = LJJIFFI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateMatchTotalScore userId=");
        sbLIZ.append(j);
        sbLIZ.append(" matchTotalScore=");
        sbLIZ.append(j2);
        sbLIZ.append(" previousMatchTotalScore=");
        sbLIZ.append(jLongValue);
        sbLIZ.append(" source=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(strLJJIFFI, C2188811AlT.LIZIZ(sbLIZ));
        if (j2 > jLongValue) {
            this.LJI.put(Long.valueOf(j), Long.valueOf(j2));
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                dataChannel.LC0(LiveShowMatchTotalScoreUpdateEvent.class, new C01FU(j, j2));
            }
        }
    }
}
