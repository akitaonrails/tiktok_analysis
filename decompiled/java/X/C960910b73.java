package X;

import Y.ARunnableS115S0100000_15;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListExtra;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostFriendOnlineAppendExperimentSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostInviteListPreloadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostServerOptVersionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.RivalSectionConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.RivalSectionExtraConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b73, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960910b73 {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static final Map<AbstractC961450b7v, String> LIZIZ = new LinkedHashMap();
    public static final Map<EnumC952640ati, C961480b7y> LIZJ = new LinkedHashMap();
    public static final Map<EnumC952640ati, BaseResponse<RivalsListsData, RivalsListExtra>> LIZLLL = new LinkedHashMap();
    public static final Map<EnumC952640ati, C961480b7y> LJ = new LinkedHashMap();
    public static final Map<EnumC952640ati, InterfaceC420801kM> LJFF = new LinkedHashMap();
    public static final LinkedHashMap<Long, C961050b7H> LJI = new LinkedHashMap<>();

    public static final boolean LJII() {
        RivalSectionExtraConfig rivalSectionExtraConfig;
        if (CoHostFriendOnlineAppendExperimentSetting.INSTANCE.isEnable()) {
            return true;
        }
        RivalSectionConfig rivalSectionConfig = CoHostInviteListPreloadSetting.INSTANCE.getRivalSectionConfig(EnumC952640ati.FRIENDS.getValue());
        return (rivalSectionConfig == null || (rivalSectionExtraConfig = rivalSectionConfig.extra) == null || !rivalSectionExtraConfig.enableFriendOnlineAppend) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EnumC961060b7I LJ(com.bytedance.ies.sdk.datachannel.DataChannel r4) {
        /*
            com.bytedance.android.live.liveinteract.match.service.ILiveMatchService r0 = X.C915980Zwa.LJFF()
            boolean r0 = r0.mz1()
            r3 = 0
            r1 = 1
            if (r0 != 0) goto L5c
            if (r4 == 0) goto L5a
            java.lang.Class<com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel> r0 = com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel.class
            java.lang.Object r0 = r4.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L16:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 != 0) goto L5c
            com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService r0 = X.C915980Zwa.LIZIZ()
            X.0bSa r0 = r0.JV1(r3)
            boolean r0 = r0.isInProcess()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 != 0) goto L5c
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            java.util.List r0 = r0.LLILZLL(r1)
            int r0 = r0.size()
            boolean r0 = X.C950220apo.LJIJ(r0, r3)
            if (r0 != 0) goto L5c
            r2 = 0
        L45:
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            java.util.List r0 = r0.LLILZLL(r1)
            int r1 = r0.size()
            r0 = 2
            if (r1 < r0) goto L55
            r3 = 1
        L55:
            if (r2 == 0) goto L5e
            X.0b7I r0 = X.EnumC961060b7I.WONT_INVITE_BUT_JUST_GET_FULL_LIST
            return r0
        L5a:
            r0 = 0
            goto L16
        L5c:
            r2 = 1
            goto L45
        L5e:
            if (r3 == 0) goto L63
            X.0b7I r0 = X.EnumC961060b7I.INVITE_MORE
            return r0
        L63:
            X.0b7I r0 = X.EnumC961060b7I.Normal
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C960910b73.LJ(com.bytedance.ies.sdk.datachannel.DataChannel):X.0b7I");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIZ(com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse.ResponseData r12) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C960910b73.LJIIIZ(com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse$ResponseData):void");
    }

    public static void LIZ(Throwable th, EnumC952640ati enumC952640ati) {
        for (Map.Entry entry : ((LinkedHashMap) LIZIZ).entrySet()) {
            if (((AbstractC961450b7v) entry.getKey()).LIZ == enumC952640ati) {
                ((AbstractC961450b7v) entry.getKey()).LIZIZ(th);
            }
        }
        C19719612Di.LJJIII(((LinkedHashMap) LIZIZ).entrySet(), new AwS594S0100000_15(enumC952640ati, 592), true);
        LIZJ(enumC952640ati, "callbackError");
    }

    public static void LIZIZ(EnumC952640ati enumC952640ati, boolean z) {
        String str;
        Map<EnumC952640ati, BaseResponse<RivalsListsData, RivalsListExtra>> map = LIZLLL;
        if (((LinkedHashMap) map).get(enumC952640ati) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clearCachedResponseNow clearByHit:");
            sbLIZ.append(z);
            sbLIZ.append(" section:");
            sbLIZ.append(enumC952640ati);
            C20441214yg.LJIIIZ("CoHostInviteListRepo", C2188811AlT.LIZIZ(sbLIZ));
            C955440ayE c955440ayE = new C955440ayE();
            Map<EnumC952640ati, C961480b7y> map2 = LJ;
            C961480b7y c961480b7y = (C961480b7y) ((LinkedHashMap) map2).get(enumC952640ati);
            if (c961480b7y == null || (str = c961480b7y.LJI) == null) {
                str = "";
            }
            c955440ayE.LJIIL(str, "source", true);
            c955440ayE.LJIIL(Integer.valueOf(z ? 1 : 0), "hit_cache", true);
            c955440ayE.LJIIL(Integer.valueOf(enumC952640ati.getValue()), "rival_type", true);
            c955440ayE.LJIJJLI("invite_list_preload_rivals_hit_rate");
            map.remove(enumC952640ati);
            map2.remove(enumC952640ati);
        }
        LIZ.removeCallbacksAndMessages(enumC952640ati);
    }

    public static void LIZJ(EnumC952640ati enumC952640ati, String str) {
        Map<EnumC952640ati, InterfaceC420801kM> map = LJFF;
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((LinkedHashMap) map).get(enumC952640ati);
        if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dispose by ");
            sbLIZ.append(str);
            sbLIZ.append(" section:");
            sbLIZ.append(enumC952640ati);
            C20441214yg.LJIIIZ("CoHostInviteListRepo", C2188811AlT.LIZIZ(sbLIZ));
        }
        map.remove(enumC952640ati);
        LIZJ.remove(enumC952640ati);
    }

    public static boolean LJIIIIZZ(RivalsListsData rivalsListsData, boolean z, EnumC952640ati enumC952640ati) {
        if (rivalsListsData == null) {
            return false;
        }
        if (C1697810uHb.LJIIJJI(EnumC952640ati.FRIENDS, EnumC952640ati.BANNERS).contains(enumC952640ati)) {
            return true;
        }
        if ((rivalsListsData.reservedList != null && (!((ArrayList) C13LP.LJJJJLI(r0)).isEmpty())) || !C0IKQ.LIZ(rivalsListsData.followedList) || !C0IKQ.LIZ(rivalsListsData.viewerSuggestionList) || !C0IKQ.LIZ(rivalsListsData.mayKnowList) || !C0IKQ.LIZ(rivalsListsData.recommendList) || !C0IKQ.LIZ(rivalsListsData.leagueRecommendList) || !C0IKQ.LIZ(rivalsListsData.friendSearchList)) {
            return true;
        }
        if (!z) {
            return false;
        }
        return RivalsListsData.isBannerTextValid(rivalsListsData.bannerText);
    }

    public static final C960970b79 LIZLLL(DataChannel dataChannel, int i, long j, long j2, long j3, EnumC952640ati enumC952640ati, String str, C961040b7G c961040b7G, AbstractC961450b7v abstractC961450b7v, Integer num) {
        C20441214yg.LIZIZ("CoHostInviteListRepo", "fetchUserListData start");
        if (CoHostInviteListPreloadSetting.INSTANCE.isEnable() && c961040b7G != null) {
            return LJI(dataChannel, i, j, j2, j3, "invite_list", abstractC961450b7v, false, false, 0L, enumC952640ati, str, num, c961040b7G);
        }
        LJFF(i, j, j2, j3, 0L, abstractC961450b7v, enumC952640ati, dataChannel, num, "invite_list", str, false, false);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJFF(final int i, final long j, final long j2, final long j3, final long j4, final AbstractC961450b7v abstractC961450b7v, final EnumC952640ati enumC952640ati, final DataChannel dataChannel, final Integer num, final String str, final String str2, final boolean z, final boolean z2) {
        Boolean boolValueOf;
        String strLJJLIIIJ;
        RivalsListsData rivalsListsData;
        String str3;
        String str4;
        long j5;
        String str5;
        Long lValueOf;
        boolean z3;
        String strLIZ = C0KRV.LIZ();
        boolean zT42 = ((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).t42();
        IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
        C954460awe c954460aweLLILL = iMultiHostServiceLJII.LLILL(C950220apo.LJFF());
        long id = 0;
        int iIntValue = 0;
        RivalsListExtra rivalsListExtra = null;
        if (c954460aweLLILL != null) {
            if (c954460aweLLILL.LJJIIZ.isApplying() && c954460aweLLILL.LJII != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolValueOf = Boolean.valueOf(z3);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C954460awe c954460aweLLILL2 = iMultiHostServiceLJII.LLILL(C950220apo.LJFF());
            if (c954460aweLLILL2 != null) {
                lValueOf = Long.valueOf(c954460aweLLILL2.LJII);
            } else {
                lValueOf = null;
            }
            strLJJLIIIJ = String.valueOf(lValueOf);
        } else {
            List<C954460awe> listLJIJJ = iMultiHostServiceLJII.LJIJJ();
            ArrayList arrayList = new ArrayList();
            for (C954460awe c954460awe : listLJIJJ) {
                C954460awe c954460awe2 = c954460awe;
                if (c954460awe2.LJJIIZ.isInviting() && c954460awe2.LJJIIZI) {
                    arrayList.add(c954460awe);
                }
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(106), 30);
        }
        final C961480b7y c961480b7y = new C961480b7y(i, j, zT42, j2, strLJJLIIIJ, strLIZ, str);
        Map<EnumC952640ati, BaseResponse<RivalsListsData, RivalsListExtra>> map = LIZLLL;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        BaseResponse baseResponse = (BaseResponse) linkedHashMap.get(enumC952640ati);
        if (baseResponse != null) {
            rivalsListsData = (RivalsListsData) baseResponse.data;
        } else {
            rivalsListsData = null;
        }
        BaseResponse baseResponse2 = (BaseResponse) linkedHashMap.get(enumC952640ati);
        if (baseResponse2 != null) {
            str3 = baseResponse2.LIZIZ;
        } else {
            str3 = null;
        }
        String str6 = "";
        if (!z) {
            Map<EnumC952640ati, C961480b7y> map2 = LJ;
            if (((LinkedHashMap) map2).get(enumC952640ati) != null && ((LinkedHashMap) map).get(enumC952640ati) != null && rivalsListsData != null && str3 != null) {
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) map2;
                if (Intrinsics.LJFF(linkedHashMap2.get(enumC952640ati), c961480b7y)) {
                    C20441214yg.LJIIIZ("CoHostInviteListRepo", "innerFetchUserListData onResponseSuccess by preload, source:" + str + " scene:" + i + " section:" + enumC952640ati + " isPreload:" + z2);
                    if (abstractC961450b7v != null) {
                        C961480b7y c961480b7y2 = (C961480b7y) linkedHashMap2.get(enumC952640ati);
                        if (c961480b7y2 != null && (str5 = c961480b7y2.LJFF) != null) {
                            str6 = str5;
                        }
                        abstractC961450b7v.LIZ(str6);
                        BaseResponse baseResponse3 = (BaseResponse) linkedHashMap.get(enumC952640ati);
                        if (baseResponse3 != null) {
                            rivalsListExtra = (RivalsListExtra) baseResponse3.extra;
                        }
                        C961480b7y c961480b7y3 = (C961480b7y) linkedHashMap2.get(enumC952640ati);
                        if (c961480b7y3 != null) {
                            j5 = c961480b7y3.LJII;
                        } else {
                            j5 = -1;
                        }
                        abstractC961450b7v.LIZJ(rivalsListExtra, rivalsListsData, str3, j5, EnumC961090b7L.NETWORK_REAL);
                    }
                    LIZIZ(enumC952640ati, true);
                    return;
                }
            }
        }
        if (abstractC961450b7v != null) {
            LIZIZ.put(abstractC961450b7v, strLIZ);
        }
        if (!z) {
            LinkedHashMap linkedHashMap3 = (LinkedHashMap) LIZJ;
            if (Intrinsics.LJFF(c961480b7y, linkedHashMap3.get(enumC952640ati))) {
                if (abstractC961450b7v != null) {
                    C961480b7y c961480b7y4 = (C961480b7y) linkedHashMap3.get(enumC952640ati);
                    if (c961480b7y4 != null && (str4 = c961480b7y4.LJFF) != null) {
                        str6 = str4;
                    }
                    abstractC961450b7v.LIZ(str6);
                }
                C20441214yg.LJIIIZ("CoHostInviteListRepo", "innerFetchUserListData waiting for running request, source:" + str + " scene:" + i + " section:" + enumC952640ati + " isPreload:" + z2);
                return;
            }
        }
        C20441214yg.LJIIIZ("CoHostInviteListRepo", "innerFetchUserListData start, source:" + str + " scene:" + i + " section:" + enumC952640ati + " isRetryRequest:" + z + " isPreload:" + z2);
        LIZJ(enumC952640ati, "innerFetchUserListData start");
        LIZJ.put(enumC952640ati, c961480b7y);
        if (!z && abstractC961450b7v != null) {
            abstractC961450b7v.LIZ(strLIZ);
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        final long jLIZ = C158B.LIZ();
        Map<EnumC952640ati, InterfaceC420801kM> map3 = LJFF;
        C480460Ism.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
        if (room != null) {
            id = room.getId();
        }
        String id2 = Calendar.getInstance().getTimeZone().getID();
        int offset = Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()) / LSPassThroughRecordSizeConfig.DEFAULT;
        long version = EnumC919070a1Z.NEW.getVersion();
        IDebugService iDebugService = (IDebugService) C1161920gLG.LIZJ(IDebugService.class);
        if (iDebugService != null) {
            iDebugService.aq();
        }
        int value = enumC952640ati.getValue();
        if (num != null) {
            iIntValue = num.intValue();
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("cohost-arch-version", String.valueOf(CohostServerOptVersionSetting.INSTANCE.getValue()));
        map3.put(enumC952640ati, coHostApi.rivalsListForMultiCoHost(1, id, i, id2, offset, j, zT42, j2, j3, linkedHashMap4, version, strLIZ, iIntValue, strLJJLIIIJ, "", value, str2, false).LJIILIIL(new C0UO0()).LJJLIIIJJIZ(1L).LJJLL(new C09JN() { // from class: X.0b74
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("CoHostInviteListRepo@4a97.innerFetchUserListData$2");
                BaseResponse<RivalsListsData, RivalsListExtra> baseResponse4 = (BaseResponse) obj;
                InterfaceC954910axN.LIZ.getClass();
                C958790b3d.LIZLLL(baseResponse4, null);
                int i2 = 0;
                C960910b73.LIZIZ(enumC952640ati, false);
                RivalsListsData rivalsListsData2 = baseResponse4.data;
                boolean zLJIIIIZZ = C960910b73.LJIIIIZZ(rivalsListsData2, z, enumC952640ati);
                if (rivalsListsData2 != null && zLJIIIIZZ) {
                    Set setEntrySet = ((LinkedHashMap) C960910b73.LIZIZ).entrySet();
                    EnumC952640ati enumC952640ati2 = enumC952640ati;
                    ArrayList arrayList2 = new ArrayList();
                    for (T t : setEntrySet) {
                        if (((AbstractC961450b7v) ((Map.Entry) t).getKey()).LIZ == enumC952640ati2) {
                            arrayList2.add(t);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((Map.Entry) it2.next()).getKey().getClass();
                            i2++;
                            if (i2 < 0) {
                                C1697810uHb.LJIJ();
                                throw null;
                            }
                        }
                    }
                    C20441214yg.LJIIIZ("CoHostInviteListRepo", "innerFetchUserListData success, source:" + str + " scene:" + i + " section:" + enumC952640ati + " nonPreloadCallbackCount:" + i2 + " isPreload:" + z2 + " isRetryRequest:" + z);
                    long jLIZ2 = C158B.LIZ() - jLIZ;
                    if (i2 == 0 && z2 && j4 > 0) {
                        C960910b73.LIZLLL.put(enumC952640ati, baseResponse4);
                        Map<EnumC952640ati, C961480b7y> map4 = C960910b73.LJ;
                        EnumC952640ati enumC952640ati3 = enumC952640ati;
                        C961480b7y c961480b7y5 = c961480b7y;
                        c961480b7y5.LJII = jLIZ2;
                        map4.put(enumC952640ati3, c961480b7y5);
                        long j6 = j4;
                        EnumC952640ati enumC952640ati4 = enumC952640ati;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("clearCachedResponseDelay section:");
                        sbLIZ.append(enumC952640ati4);
                        C20441214yg.LJIIIZ("CoHostInviteListRepo", C2188811AlT.LIZIZ(sbLIZ));
                        BPEAHandler bPEAHandler = C960910b73.LIZ;
                        bPEAHandler.removeCallbacksAndMessages(enumC952640ati4);
                        C786410Ut5.LJLIIIL(bPEAHandler, new ARunnableS115S0100000_15(enumC952640ati4, 88), enumC952640ati4, SystemClock.uptimeMillis() + j6);
                    }
                    RivalsListExtra rivalsListExtra2 = (RivalsListExtra) baseResponse4.extra;
                    String str7 = baseResponse4.LIZIZ;
                    EnumC952640ati enumC952640ati5 = enumC952640ati;
                    EnumC961090b7L enumC961090b7LLIZIZ = C961020b7E.LIZIZ(baseResponse4);
                    for (Map.Entry entry : ((LinkedHashMap) C960910b73.LIZIZ).entrySet()) {
                        if (((AbstractC961450b7v) entry.getKey()).LIZ == enumC952640ati5) {
                            ((AbstractC961450b7v) entry.getKey()).LIZJ(rivalsListExtra2, rivalsListsData2, str7, jLIZ2, enumC961090b7LLIZIZ);
                            jLIZ2 = jLIZ2;
                        }
                    }
                    C19719612Di.LJJIII(((LinkedHashMap) C960910b73.LIZIZ).entrySet(), new AwS594S0100000_15(enumC952640ati5, 594), true);
                    C960910b73.LIZJ(enumC952640ati5, "callbackSuccess");
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("innerFetchUserListData fail due to empty response, source:");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" scene:");
                    sbLIZ2.append(i);
                    sbLIZ2.append(" section:");
                    sbLIZ2.append(enumC952640ati);
                    sbLIZ2.append(" isRetryRequest:");
                    sbLIZ2.append(z);
                    C20441214yg.LJ("CoHostInviteListRepo", C2188811AlT.LIZIZ(sbLIZ2));
                    if (z) {
                        C960910b73.LIZ(new C962070b8v(), enumC952640ati);
                    } else {
                        DataChannel dataChannel2 = dataChannel;
                        int i3 = i;
                        long j7 = j;
                        long j8 = j2;
                        long j9 = j3;
                        String str8 = str;
                        C960910b73.LJFF(i3, j7, j8, j9, j4, abstractC961450b7v, enumC952640ati, dataChannel2, num, str8, str2, true, z2);
                    }
                }
                C1C7U.LIZIZ("CoHostInviteListRepo@4a97.innerFetchUserListData$2");
            }
        }, new C09JN() { // from class: X.0b7P
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("CoHostInviteListRepo@4a97.innerFetchUserListData$3");
                Throwable th = (Throwable) obj;
                InterfaceC954910axN.LIZ.getClass();
                C958790b3d.LIZJ(th, null);
                if (z) {
                    C960910b73.LIZ(th, enumC952640ati);
                } else {
                    DataChannel dataChannel2 = dataChannel;
                    int i2 = i;
                    long j6 = j;
                    long j7 = j2;
                    long j8 = j3;
                    String str7 = str;
                    AbstractC961450b7v abstractC961450b7v2 = abstractC961450b7v;
                    boolean z4 = z2;
                    C960910b73.LJFF(i2, j6, j7, j8, j4, abstractC961450b7v2, enumC952640ati, dataChannel2, num, str7, str2, true, z4);
                }
                C1C7U.LIZIZ("CoHostInviteListRepo@4a97.innerFetchUserListData$3");
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x039c A[PHI: r2
      0x039c: PHI (r2v45 X.11NZ) = (r2v53 X.11NZ), (r2v55 X.11NZ) binds: [B:99:0x0346, B:97:0x0340] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0304  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C960970b79 LJI(final com.bytedance.ies.sdk.datachannel.DataChannel r56, final int r57, final long r58, final long r60, final long r62, final java.lang.String r64, final X.AbstractC961450b7v r65, final boolean r66, final boolean r67, final long r68, final X.EnumC952640ati r70, final java.lang.String r71, final java.lang.Integer r72, final X.C961040b7G r73) {
        /*
            Method dump skipped, instruction units count: 1354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C960910b73.LJI(com.bytedance.ies.sdk.datachannel.DataChannel, int, long, long, long, java.lang.String, X.0b7v, boolean, boolean, long, X.0ati, java.lang.String, java.lang.Integer, X.0b7G):X.0b79");
    }
}
