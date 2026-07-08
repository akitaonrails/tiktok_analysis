package X;

import android.os.Looper;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostInviteListPreloadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.RivalSectionConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.RivalSectionExtraConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0atn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C952690atn {
    public static volatile long LIZLLL;
    public static volatile boolean LJFF;
    public static final C952690atn LIZ = new C952690atn();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final ConcurrentMap<EnumC952640ati, InterfaceC420801kM> LIZJ = new ConcurrentHashMap();
    public static final List<InterfaceC952660atk> LJ = new CopyOnWriteArrayList();

    public static void LIZ() {
        LIZIZ.removeCallbacksAndMessages(null);
        for (InterfaceC420801kM interfaceC420801kM : ((ConcurrentHashMap) LIZJ).values()) {
            if (!interfaceC420801kM.isDisposed()) {
                interfaceC420801kM.dispose();
            }
        }
        ((ConcurrentHashMap) LIZJ).clear();
        LIZLLL++;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancel, newCycleId=");
        sbLIZ.append(LIZLLL);
        C20441214yg.LJIIIZ("CoHostCacheRefreshScheduler", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String LIZJ(StringBuilder sb) {
        if (sb.length() > 0 && C13LN.LJLLL(sb) == ',') {
            return sb.substring(0, sb.length() - 1);
        }
        return sb.toString();
    }

    public static void LIZIZ(final long j, final EnumC952640ati enumC952640ati, long j2, final int i, final int i2) {
        RivalSectionConfig rivalSectionConfig;
        int i3;
        long j3;
        CoHostInviteListPreloadSetting coHostInviteListPreloadSetting = CoHostInviteListPreloadSetting.INSTANCE;
        if (!coHostInviteListPreloadSetting.isCacheRefreshEnabled(enumC952640ati.getValue()) || (rivalSectionConfig = coHostInviteListPreloadSetting.getRivalSectionConfig(enumC952640ati.getValue())) == null) {
            return;
        }
        RivalSectionExtraConfig rivalSectionExtraConfig = rivalSectionConfig.extra;
        boolean z = false;
        if (rivalSectionExtraConfig != null) {
            i3 = rivalSectionExtraConfig.refreshTimes;
        } else {
            i3 = 0;
        }
        final int iLJ = C13LZ.LJ(i3, 0, 5);
        RivalSectionExtraConfig rivalSectionExtraConfig2 = rivalSectionConfig.extra;
        if (rivalSectionExtraConfig2 != null) {
            j3 = rivalSectionExtraConfig2.refreshInterval;
            if (j3 > 0 && j3 < 3000) {
                j3 = 3000;
            }
        } else {
            j3 = 0;
        }
        if (iLJ > 0 && j3 > 0) {
            LIZIZ.removeCallbacksAndMessages(enumC952640ati);
            InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((ConcurrentHashMap) LIZJ).remove(enumC952640ati);
            if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
                interfaceC420801kM.dispose();
                z = true;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("schedulePostPreload, cycleId=");
            sbLIZ.append(j);
            sbLIZ.append(", section=");
            sbLIZ.append(enumC952640ati.name());
            sbLIZ.append(", preloadRound=");
            sbLIZ.append(i);
            sbLIZ.append('/');
            sbLIZ.append(i2);
            sbLIZ.append(", refreshRounds=");
            sbLIZ.append(iLJ);
            sbLIZ.append(", interval=");
            sbLIZ.append(j3);
            sbLIZ.append(", resetInflight=");
            sbLIZ.append(z);
            C20441214yg.LJIIIZ("CoHostCacheRefreshScheduler", C2188811AlT.LIZIZ(sbLIZ));
            final int i4 = 1;
            while (true) {
                C786410Ut5.LJLIIIL(LIZIZ, new Runnable() { // from class: X.0ato
                    public final void LIZ() {
                        String str;
                        BaseResponse baseResponse;
                        Object obj;
                        final RivalsListsData rivalsListsData;
                        List<Room> list;
                        C952710atp c952710atp;
                        if (j != C952690atn.LIZLLL) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("refresh skipped, stale cycleId=");
                            sbLIZ2.append(j);
                            sbLIZ2.append(" current=");
                            sbLIZ2.append(C952690atn.LIZLLL);
                            sbLIZ2.append(", section=");
                            sbLIZ2.append(enumC952640ati.name());
                            sbLIZ2.append(", preloadRound=");
                            sbLIZ2.append(i);
                            sbLIZ2.append(", refreshRound=");
                            sbLIZ2.append(i4);
                            C20441214yg.LIZIZ("CoHostCacheRefreshScheduler", C2188811AlT.LIZIZ(sbLIZ2));
                            return;
                        }
                        C952690atn c952690atn = C952690atn.LIZ;
                        final EnumC952640ati enumC952640ati2 = enumC952640ati;
                        int i5 = i;
                        int i6 = i2;
                        final int i7 = i4;
                        final int i8 = iLJ;
                        final long j4 = j;
                        c952690atn.getClass();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("section=");
                        sbLIZ3.append(enumC952640ati2.name());
                        sbLIZ3.append(", preloadRound=");
                        sbLIZ3.append(i5);
                        sbLIZ3.append('/');
                        sbLIZ3.append(i6);
                        sbLIZ3.append(", refreshRound=");
                        sbLIZ3.append(i7);
                        sbLIZ3.append('/');
                        sbLIZ3.append(i8);
                        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        int[] iArr = C952650atj.LIZ;
                        int i9 = iArr[enumC952640ati2.ordinal()];
                        if (i9 == 1) {
                            str = "section_invite_list_friend";
                        } else if (i9 == 2) {
                            str = "section_invite_list_recommend";
                        } else if (i9 != 3) {
                            return;
                        } else {
                            str = "section_invite_list_banner";
                        }
                        final C961030b7F c961030b7FLIZIZ = C952730atr.LIZ().LIZIZ(str);
                        if (c961030b7FLIZIZ == null) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("refresh skipped, no cache entry, ");
                            sbLIZ4.append(strLIZIZ);
                            C20441214yg.LIZIZ("CoHostCacheRefreshScheduler", C2188811AlT.LIZIZ(sbLIZ4));
                            return;
                        }
                        Object obj2 = c961030b7FLIZIZ.LIZIZ;
                        if (obj2 instanceof BaseResponse) {
                            baseResponse = (BaseResponse) obj2;
                            obj = baseResponse != null ? baseResponse.data : null;
                            if ((obj instanceof RivalsListsData) || (rivalsListsData = (RivalsListsData) obj) == null) {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("refresh skipped, cached payload is not RivalsListsData, ");
                                sbLIZ5.append(strLIZIZ);
                                C20441214yg.LIZIZ("CoHostCacheRefreshScheduler", C2188811AlT.LIZIZ(sbLIZ5));
                            }
                            int i10 = iArr[enumC952640ati2.ordinal()];
                            if (i10 == 1) {
                                list = rivalsListsData.followedList;
                                if (list == null) {
                                    list = C13BV.INSTANCE;
                                }
                            } else if (i10 != 2 || (list = rivalsListsData.recommendList) == null) {
                                list = C13BV.INSTANCE;
                            }
                            if (list.isEmpty()) {
                                c952710atp = new C952710atp("", "", "", "");
                            } else {
                                StringBuilder sb = new StringBuilder();
                                StringBuilder sb2 = new StringBuilder();
                                HashSet hashSet = new HashSet();
                                HashSet hashSet2 = new HashSet();
                                for (Room room : list) {
                                    if (hashSet.add(Long.valueOf(room.getOwnerUserId()))) {
                                        sb.append(room.getOwnerUserId());
                                        sb.append(',');
                                    }
                                    if (hashSet2.add(Long.valueOf(room.getId()))) {
                                        sb2.append(room.getId());
                                        sb2.append(',');
                                    }
                                }
                                c952710atp = new C952710atp(C952690atn.LIZJ(sb), C952690atn.LIZJ(sb2), enumC952640ati2 == EnumC952640ati.FRIENDS ? C952690atn.LIZJ(sb2) : "", enumC952640ati2 == EnumC952640ati.RECOMMEND ? C952690atn.LIZJ(sb2) : "");
                            }
                            String str2 = c952710atp.LIZ;
                            String str3 = c952710atp.LIZIZ;
                            String str4 = c952710atp.LIZJ;
                            String str5 = c952710atp.LIZLLL;
                            if (str2.length() == 0 || str3.length() == 0) {
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append("refresh skipped, no ids extracted, ");
                                sbLIZ6.append(strLIZIZ);
                                C20441214yg.LIZIZ("CoHostCacheRefreshScheduler", C2188811AlT.LIZIZ(sbLIZ6));
                                return;
                            }
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append("refresh fire, cycleId=");
                            sbLIZ7.append(j4);
                            sbLIZ7.append(", ");
                            sbLIZ7.append(strLIZIZ);
                            C20441214yg.LJIIIZ("CoHostCacheRefreshScheduler", C2188811AlT.LIZIZ(sbLIZ7));
                            Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                            final long jCurrentTimeMillis = System.currentTimeMillis();
                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C952690atn.LIZJ;
                            InterfaceC420801kM interfaceC420801kM2 = (InterfaceC420801kM) concurrentHashMap.get(enumC952640ati2);
                            if (interfaceC420801kM2 != null && !interfaceC420801kM2.isDisposed()) {
                                interfaceC420801kM2.dispose();
                            }
                            C480460Ism.LIZ().getClass();
                            final String str6 = str;
                            final BaseResponse baseResponse2 = baseResponse;
                            concurrentHashMap.put(enumC952640ati2, ((CoHostApi) C480460Ism.LIZLLL(CoHostApi.class)).getUserLinkmicStatusMultiCoHost(room2 != null ? room2.getId() : 0L, str2, str3, str4, str5, "", "", false).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0atq
                                @Override // X.C09JN
                                public final void accept(Object obj3) {
                                    MGetUserLinkmicStatusResponse.ResponseData responseData;
                                    Map<Long, RivalExtraInfo> map;
                                    C1C7U.LIZ("CoHostCacheRefreshScheduler@dc2b.refreshSectionFromCache$2");
                                    BaseResponse baseResponse3 = (BaseResponse) obj3;
                                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                    if (baseResponse3 != null) {
                                        responseData = (MGetUserLinkmicStatusResponse.ResponseData) baseResponse3.data;
                                    } else {
                                        responseData = null;
                                    }
                                    if (responseData == null) {
                                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                        sbLIZ8.append("refresh response empty, ");
                                        sbLIZ8.append(strLIZIZ);
                                        C20441214yg.LIZIZ("CoHostCacheRefreshScheduler", C2188811AlT.LIZIZ(sbLIZ8));
                                        new C955440ayE().LJJJJI(enumC952640ati2, i7, i8, false, jCurrentTimeMillis2);
                                    } else if (j4 != C952690atn.LIZLLL) {
                                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                        sbLIZ9.append("refresh response dropped due to cancel, ");
                                        sbLIZ9.append(strLIZIZ);
                                        C20441214yg.LIZIZ("CoHostCacheRefreshScheduler", C2188811AlT.LIZIZ(sbLIZ9));
                                    } else {
                                        C952690atn c952690atn2 = C952690atn.LIZ;
                                        EnumC952640ati enumC952640ati3 = enumC952640ati2;
                                        String str7 = str6;
                                        RivalsListsData rivalsListsData2 = rivalsListsData;
                                        BaseResponse<?, ?> baseResponse4 = baseResponse2;
                                        C961030b7F c961030b7F = c961030b7FLIZIZ;
                                        c952690atn2.getClass();
                                        Map<Long, MGetUserLinkmicStatusResponse.LinkmicStatus> map2 = responseData.linkmicStatusMap;
                                        if (map2 != null && (map = rivalsListsData2.rivalExtraInfos) != null) {
                                            for (Map.Entry<Long, MGetUserLinkmicStatusResponse.LinkmicStatus> entry : map2.entrySet()) {
                                                Long key = entry.getKey();
                                                MGetUserLinkmicStatusResponse.LinkmicStatus value = entry.getValue();
                                                RivalExtraInfo rivalExtraInfo = map.get(key);
                                                if (rivalExtraInfo != null) {
                                                    rivalExtraInfo.showPlayType = value.playType;
                                                    rivalExtraInfo.inviteBlockReason = value.blockReason;
                                                    rivalExtraInfo.detailBlockReason = value.detailBlockReason;
                                                    rivalExtraInfo.linkerInfo = value.linkerInfo;
                                                    rivalExtraInfo.optPairInfo = value.optPairInfo;
                                                    rivalExtraInfo.cohostLayoutMode = value.cohostLayoutMode;
                                                }
                                            }
                                        }
                                        Iterator it2 = ((CopyOnWriteArrayList) C952690atn.LJ).iterator();
                                        while (it2.hasNext()) {
                                            try {
                                                ((InterfaceC952660atk) it2.next()).LIZ(enumC952640ati3, rivalsListsData2, responseData);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                                sbLIZ10.append("refresh hook threw, section=");
                                                sbLIZ10.append(enumC952640ati3.name());
                                                C20441214yg.LJFF("CoHostCacheRefreshScheduler", C2188811AlT.LIZIZ(sbLIZ10), th);
                                            }
                                        }
                                        C961030b7F c961030b7FLIZ = C961030b7F.LIZ(c961030b7F, baseResponse4);
                                        C952740ats c952740atsLIZ = C952730atr.LIZ();
                                        c952740atsLIZ.getClass();
                                        c952740atsLIZ.LIZ.put(C952740ats.LIZ("biz_invite_list", str7), c961030b7FLIZ);
                                        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                        sbLIZ11.append("refresh applied, section=");
                                        sbLIZ11.append(enumC952640ati3.name());
                                        C20441214yg.LJIIIZ("CoHostCacheRefreshScheduler", C2188811AlT.LIZIZ(sbLIZ11));
                                        new C955440ayE().LJJJJI(enumC952640ati2, i7, i8, true, jCurrentTimeMillis2);
                                    }
                                    C1C7U.LIZIZ("CoHostCacheRefreshScheduler@dc2b.refreshSectionFromCache$2");
                                }
                            }, new C09JN() { // from class: X.0ZvP
                                @Override // X.C09JN
                                public final void accept(Object obj3) {
                                    C1C7U.LIZ("CoHostCacheRefreshScheduler@dc2b.refreshSectionFromCache$3");
                                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                    sbLIZ8.append("refresh failed, ");
                                    sbLIZ8.append(strLIZIZ);
                                    C20441214yg.LJFF("CoHostCacheRefreshScheduler", C2188811AlT.LIZIZ(sbLIZ8), (Throwable) obj3);
                                    new C955440ayE().LJJJJI(enumC952640ati2, i7, i8, false, jCurrentTimeMillis2);
                                    C1C7U.LIZIZ("CoHostCacheRefreshScheduler@dc2b.refreshSectionFromCache$3");
                                }
                            }));
                            return;
                        }
                        baseResponse = null;
                        if (obj instanceof RivalsListsData) {
                        }
                        StringBuilder sbLIZ52 = C2188811AlT.LIZ();
                        sbLIZ52.append("refresh skipped, cached payload is not RivalsListsData, ");
                        sbLIZ52.append(strLIZIZ);
                        C20441214yg.LIZIZ("CoHostCacheRefreshScheduler", C2188811AlT.LIZIZ(sbLIZ52));
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("CoHostCacheRefreshScheduler@dc2b.schedulePostPreload$task$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("CoHostCacheRefreshScheduler@dc2b.schedulePostPreload$task$1");
                    }
                }, enumC952640ati, j2 + (((long) i4) * j3));
                if (i4 != iLJ) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }
}
