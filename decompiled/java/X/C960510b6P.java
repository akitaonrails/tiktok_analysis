package X;

import Y.ARunnableS115S0100000_15;
import Y.AfS0S0520000_15;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostRefreshIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostRefreshPeriodSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostInviteListPreloadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostSearchLeagueRefreshIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostSearchLeagueRefreshPeriodSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.RivalSectionConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.RivalSectionExtraConfig;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b6P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960510b6P {
    public static final /* synthetic */ int LJIIIZ = 0;
    public boolean LIZ;
    public MGetUserLinkmicStatusResponse.ResponseData LIZIZ;
    public int LIZLLL;
    public boolean LJ;
    public C11JF LJFF;
    public long LIZJ = SystemClock.uptimeMillis();
    public InterfaceC960540b6S LJI = new C960530b6R();
    public final BPEAHandler LJII = new BPEAHandler(Looper.getMainLooper());
    public EnumC960560b6U LJIIIIZZ = EnumC960560b6U.CO_HOST_PANEL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01da A[LOOP:9: B:95:0x01b5->B:105:0x01da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0474 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0335 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x02c2 A[EDGE_INSN: B:410:0x02c2->B:161:0x02c2 BREAK  A[LOOP:9: B:95:0x01b5->B:105:0x01da], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a0  */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [X.0ayT, X.0ayb] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 1354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C960510b6P.LIZIZ():void");
    }

    public final void LJI() {
        C20441214yg.LJIIIZ("MultiCoHostUserListStatusLoopManager", "stopLoop");
        this.LJII.removeCallbacksAndMessages(null);
        C11JF c11jf = this.LJFF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJFF = null;
        this.LIZ = false;
        this.LIZIZ = null;
        this.LJ = false;
    }

    public static void LIZLLL(StringBuffer stringBuffer) {
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
    }

    public final void LJ(boolean z) {
        int value;
        int value2;
        if (!z) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.LIZJ;
            int i = C960550b6T.LIZ[this.LJIIIIZZ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    value2 = LiveCoHostSearchLeagueRefreshPeriodSetting.INSTANCE.getValue();
                } else {
                    throw new C1954807lC();
                }
            } else {
                value2 = LiveCoHostRefreshPeriodSetting.INSTANCE.getValue();
            }
            if (jUptimeMillis >= ((long) value2) * 1000 || this.LIZLLL >= 3) {
                C20441214yg.LJ("MultiCoHostUserListStatusLoopManager", "startFetchTask return, canStartFetchTask==false");
                this.LJ = false;
                return;
            }
        }
        this.LJ = true;
        this.LJII.removeCallbacksAndMessages(null);
        BPEAHandler bPEAHandler = this.LJII;
        ARunnableS115S0100000_15 aRunnableS115S0100000_15 = new ARunnableS115S0100000_15(this, 22);
        int i2 = C960550b6T.LIZ[this.LJIIIIZZ.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                value = LiveCoHostSearchLeagueRefreshIntervalSetting.INSTANCE.getValue();
            } else {
                throw new C1954807lC();
            }
        } else {
            value = LiveCoHostRefreshIntervalSetting.INSTANCE.getValue();
        }
        C786410Ut5.LJLIIL(((long) value) * 1000, bPEAHandler, aRunnableS115S0100000_15);
    }

    public final void LJFF(boolean z) {
        IDebugService iDebugService = (IDebugService) C1161920gLG.LIZJ(IDebugService.class);
        if (iDebugService != null) {
            iDebugService.aq();
        }
        if (!C915980Zwa.LJFF().mz1() && !C500260Jjc.LJJJI(Boolean.valueOf(C915980Zwa.LIZIZ().JV1(false).isInProcess()))) {
            if (C950220apo.LJIJ(C915980Zwa.LJII().LLILZLL(true).size(), 0)) {
                C20441214yg.LJIIIZ("MultiCoHostUserListStatusLoopManager", "Auto refresh banned due to link-mic position full");
                return;
            } else {
                C20441214yg.LJIIIZ("MultiCoHostUserListStatusLoopManager", "startLoop");
                LJ(z);
                return;
            }
        }
        C20441214yg.LJIIIZ("MultiCoHostUserListStatusLoopManager", "Auto refresh banned due to match/take stage");
    }

    public static void LIZ(StringBuffer stringBuffer, StringBuffer stringBuffer2, HashSet hashSet, HashSet hashSet2, Room room) {
        if (!hashSet.contains(Long.valueOf(room.getOwnerUserId()))) {
            hashSet.add(Long.valueOf(room.getOwnerUserId()));
            stringBuffer.append(room.getOwnerUserId());
            stringBuffer.append(",");
        }
        if (!hashSet2.contains(Long.valueOf(room.getId()))) {
            hashSet2.add(Long.valueOf(room.getId()));
            stringBuffer2.append(room.getId());
            stringBuffer2.append(",");
        }
    }

    public final void LIZJ(Function1<? super Integer, Unit> function1, Function1<? super BaseResponse<MGetUserLinkmicStatusResponse.ResponseData, Extra>, Unit> function12, Function1<? super Throwable, Unit> function13, Function0<Unit> function0, boolean z, boolean z2) {
        C410901il c410901ilLIZ;
        String str;
        long id;
        RivalSectionExtraConfig rivalSectionExtraConfig;
        C958360b2w c958360b2w;
        HashMap map = new HashMap();
        InterfaceC960540b6S interfaceC960540b6S = this.LJI;
        if (z) {
            c410901ilLIZ = interfaceC960540b6S.LIZIZ();
        } else {
            c410901ilLIZ = interfaceC960540b6S.LIZ();
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        StringBuffer stringBuffer3 = new StringBuffer();
        StringBuffer stringBuffer4 = new StringBuffer();
        StringBuffer stringBuffer5 = new StringBuffer();
        StringBuffer stringBuffer6 = new StringBuffer();
        HashMap map2 = new HashMap();
        int size = c410901ilLIZ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = c410901ilLIZ.get(i2);
            if (obj instanceof C955590ayT) {
                C955590ayT c955590ayT = (C955590ayT) obj;
                if (map2.get(Long.valueOf(c955590ayT.LJ.getOwnerUserId())) == null) {
                    i++;
                    LIZ(stringBuffer, stringBuffer2, hashSet, hashSet2, c955590ayT.LJ);
                    if (Intrinsics.LJFF(c955590ayT.LJI, C955540ayO.LIZJ)) {
                        stringBuffer3.append(c955590ayT.LJ.getId());
                        stringBuffer3.append(",");
                    } else if (Intrinsics.LJFF(c955590ayT.LJI, C955540ayO.LIZLLL)) {
                        stringBuffer4.append(c955590ayT.LJ.getId());
                        stringBuffer4.append(",");
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("skip inviting or applying user, uid=");
                    sbLIZ.append(c955590ayT.LJ.getOwnerUserId());
                    C20441214yg.LJIIIZ("MultiCoHostUserListStatusLoopManager", C2188811AlT.LIZIZ(sbLIZ));
                }
            } else if (obj instanceof C960450b6J) {
                for (Object obj2 : ((C960450b6J) obj).LJ) {
                    if ((obj2 instanceof C958360b2w) && (c958360b2w = (C958360b2w) obj2) != null) {
                        List<Room> list = c958360b2w.LJ.selfTeamRoomList;
                        if (list != null) {
                            int i3 = 0;
                            for (Room room : list) {
                                int i4 = i3 + 1;
                                if (i3 >= 0) {
                                    Room room2 = room;
                                    i++;
                                    LIZ(stringBuffer, stringBuffer2, hashSet, hashSet2, room2);
                                    stringBuffer6.append(room2.getId());
                                    stringBuffer6.append(",");
                                    i3 = i4;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        }
                        List<Room> list2 = c958360b2w.LJ.rivalTeamRoomList;
                        if (list2 != null) {
                            int i5 = 0;
                            for (Room room3 : list2) {
                                int i6 = i5 + 1;
                                if (i5 >= 0) {
                                    Room room4 = room3;
                                    i++;
                                    LIZ(stringBuffer, stringBuffer2, hashSet, hashSet2, room4);
                                    stringBuffer6.append(room4.getId());
                                    stringBuffer6.append(",");
                                    i5 = i6;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } else {
                continue;
            }
        }
        RivalSectionConfig rivalSectionConfig = CoHostInviteListPreloadSetting.INSTANCE.getRivalSectionConfig(EnumC952640ati.FRIENDS.getValue());
        if (rivalSectionConfig != null && (rivalSectionExtraConfig = rivalSectionConfig.extra) != null && rivalSectionExtraConfig.enableFriendOnlineAppend) {
            Iterator it2 = C13LP.LLIIII(C960910b73.LJI.values()).iterator();
            while (it2.hasNext()) {
                Room room5 = ((C961050b7H) it2.next()).LIZIZ;
                if (!hashSet2.contains(Long.valueOf(room5.getId()))) {
                    i++;
                    LIZ(stringBuffer, stringBuffer2, hashSet, hashSet2, room5);
                    stringBuffer3.append(room5.getId());
                    stringBuffer3.append(",");
                }
            }
        }
        LIZLLL(stringBuffer);
        map.put("to_user_ids", stringBuffer.toString());
        LIZLLL(stringBuffer2);
        map.put("to_room_ids", stringBuffer2.toString());
        LIZLLL(stringBuffer3);
        map.put("friend_list_room_ids", stringBuffer3.toString());
        LIZLLL(stringBuffer4);
        map.put("recommend_list_room_ids", stringBuffer4.toString());
        LIZLLL(stringBuffer5);
        map.put("reservation_list_room_ids", stringBuffer5.toString());
        LIZLLL(stringBuffer6);
        map.put("opt_pair_list_room_ids", stringBuffer6.toString());
        Pair pair = new Pair(map, Integer.valueOf(i));
        HashMap map3 = (HashMap) pair.getFirst();
        Room room6 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        String str2 = (String) map3.get("to_user_ids");
        if (str2 != null && str2.length() > 0 && (str = (String) map3.get("to_room_ids")) != null && str.length() > 0) {
            IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
            if (iBroadcastService != null && iBroadcastService.isBackgroundPauseRequest()) {
                function0.invoke();
                return;
            }
            if (!z) {
                function1.invoke(pair.getSecond());
            }
            C480460Ism.LIZ().getClass();
            CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
            if (room6 != null) {
                id = room6.getId();
            } else {
                id = 0;
            }
            String str3 = (String) map3.get("to_user_ids");
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            String str5 = (String) map3.get("to_room_ids");
            if (str5 == null) {
                str5 = "";
            }
            String str6 = (String) map3.get("friend_list_room_ids");
            if (str6 == null) {
                str6 = "";
            }
            String str7 = (String) map3.get("recommend_list_room_ids");
            if (str7 == null) {
                str7 = "";
            }
            String str8 = (String) map3.get("reservation_list_room_ids");
            if (str8 == null) {
                str8 = "";
            }
            String str9 = (String) map3.get("opt_pair_list_room_ids");
            if (str9 != null) {
                str4 = str9;
            }
            this.LJFF = (C11JF) coHostApi.getUserLinkmicStatusMultiCoHost(id, str3, str5, str6, str7, str8, str4, z2).LJIILIIL(new C0UO0()).LJJLL(new AfS0S0520000_15(this, function0, function12, function1, function13, z, z2, 0), new AfS0S0520000_15(this, function0, function1, function12, function13, z, z2, 1));
            return;
        }
        C20441214yg.LJ("MultiCoHostUserListStatusLoopManager", "realFetchStatusListData skip by empty request params");
        function0.invoke();
    }
}
