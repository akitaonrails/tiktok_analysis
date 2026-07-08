package X;

import Y.ARunnableS107S0100000_7;
import Y.AfS171S0100000_2;
import Y.AfS176S0100000_7;
import Y.AfS2S2200200_7;
import android.os.Handler;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.bl.enterroomboost.EnterRoomUpdateManager;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.livesetting.other.LiveAdaptStrategyAddParamsSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnterRoomClickPerfOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveKeyApiOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveEnterRoomVersionSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSignalService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ILd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464950ILd {
    public static final C464950ILd LJI = new C464950ILd();
    public volatile boolean LIZ;
    public final ConcurrentHashMap<String, InterfaceC420801kM> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, InterfaceC420801kM> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, InterfaceC420801kM> LIZLLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, InterfaceC420801kM> LJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, InterfaceC420801kM> LJFF = new ConcurrentHashMap<>();

    public final void LIZIZ() {
        if (this.LIZ) {
            return;
        }
        LiveAppBundleUtils.ensurePluginAvailable(EnumC785640Urq.CMAF);
        LiveAppBundleUtils.ensurePluginAvailable(EnumC785640Urq.QUIC);
        LiveAppBundleUtils.ensurePluginAvailable(EnumC785640Urq.RTMGLOBAL);
        LiveAppBundleUtils.ensurePluginAvailable(EnumC785640Urq.P2P);
        this.LIZ = true;
    }

    public static C11NZ LJFF(long[] jArr) {
        StringBuilder sb = new StringBuilder();
        if (jArr != null) {
            for (int i = 0; i < jArr.length; i++) {
                sb.append(jArr[i]);
                if (jArr.length - 1 != i) {
                    sb.append(",");
                }
            }
        }
        C480460Ism.LIZ().getClass();
        return ((RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class)).getMultipleRoomInfo(sb.toString()).LJIILIIL(new C0UO0());
    }

    public static void LJI(WeakHandler weakHandler) {
        C480460Ism.LIZ().getClass();
        ((RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class)).getQuestionnaireContent().LJIILIIL(new C0UO0()).LJJLL(new AfS176S0100000_7(weakHandler, 162), new AfS176S0100000_7(weakHandler, 150));
    }

    public static void LJIIIIZZ(BPEAHandler bPEAHandler) {
        C480460Ism.LIZ().getClass();
        ((RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class)).getRoomDebugInfoPermission().LJIILIIL(new C0UO0()).LJJLL(new AfS176S0100000_7(bPEAHandler, 159), new AfS171S0100000_2(bPEAHandler, 28));
    }

    public static Pair LJIILL(long j) {
        Pair pairLJFF;
        EnterRoomUpdateManager enterRoomUpdateManager = EnterRoomUpdateManager.LIZ;
        String strValueOf = String.valueOf(j);
        enterRoomUpdateManager.getClass();
        synchronized (EnterRoomUpdateManager.LJIIL) {
            try {
                pairLJFF = EnterRoomUpdateManager.LJFF(strValueOf);
                EnterRoomUpdateManager.LJII.remove(strValueOf);
                C465120ILu c465120ILuLIZIZ = EnterRoomUpdateManager.LJIIJ.LIZIZ(strValueOf);
                if (c465120ILuLIZIZ != null) {
                    c465120ILuLIZIZ.LJ = 2;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return pairLJFF;
    }

    public static void LJ(Handler handler, int i) {
        String str;
        if (i == 1) {
            str = "continue_cancel";
        } else if (i == 2) {
            str = "enter_other_room";
        } else if (i == 3) {
            str = "other_device_go_live";
        } else {
            str = "";
        }
        C480460Ism.LIZ().getClass();
        ((RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class)).finishRoomAbnormal(str).LJIILIIL(new C0UO0()).LJJLL(new AfS171S0100000_2(handler, 26), new AfS171S0100000_2(handler, 29));
    }

    public static void LJII(WeakHandler weakHandler, long j) {
        C480460Ism.LIZ().getClass();
        ((RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class)).getRoomDebugInfo(j).LJIILIIL(new C0UO0()).LJJLL(new AfS176S0100000_7(weakHandler, 151), new AfS176S0100000_7(weakHandler, 152));
    }

    public final void LIZ(long j, String str) {
        if (j > 0 && str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j);
            sbLIZ.append("-");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1176404iw.LIZ(0L, strLIZIZ);
            InterfaceC420801kM interfaceC420801kMRemove = this.LIZLLL.remove(strLIZIZ);
            if (interfaceC420801kMRemove != null) {
                interfaceC420801kMRemove.dispose();
            }
        }
    }

    public static C19476611Hw LJIIIZ(long j, long j2, HashMap map) {
        C11NZ<BaseResponse<Room, EnterRoomExtra>> c11nzNewVersionEnterRoom;
        String version = LiveEnterRoomVersionSetting.getVersion();
        if (LiveKeyApiOpt.enableRoomEnterHighPriority()) {
            if (version.isEmpty()) {
                C480460Ism.LIZ().getClass();
                c11nzNewVersionEnterRoom = ((RoomRetrofitApi) C480460Ism.LIZJ(RoomRetrofitApi.class)).enterRoomImmediate(j, 1L, j2, map);
            } else {
                C480460Ism.LIZ().getClass();
                c11nzNewVersionEnterRoom = ((RoomRetrofitApi) C480460Ism.LIZJ(RoomRetrofitApi.class)).newVersionEnterRoomImmediately(version, j, 1L, j2, map);
            }
        } else if (version.isEmpty()) {
            C480460Ism.LIZ().getClass();
            c11nzNewVersionEnterRoom = ((RoomRetrofitApi) C480460Ism.LIZJ(RoomRetrofitApi.class)).enterRoom(j, 1L, j2, map);
        } else {
            C480460Ism.LIZ().getClass();
            c11nzNewVersionEnterRoom = ((RoomRetrofitApi) C480460Ism.LIZJ(RoomRetrofitApi.class)).newVersionEnterRoom(version, j, 1L, j2, map);
        }
        if (LiveKeyApiOpt.isEnableRoomEnterThreadBoost()) {
            Executor executor = C08A7.LIZIZ;
            C11RO c11ro = C11S5.LIZ;
            return c11nzNewVersionEnterRoom.LJL(new C19501611Rm(executor));
        }
        return c11nzNewVersionEnterRoom.LJL(C11S5.LIZ());
    }

    public static void LJIIJJI(long j, Object obj, long j2, String str) {
        String string;
        int errorCode;
        if (obj instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) obj;
            string = c501470JlZ.getErrorMsg();
            errorCode = c501470JlZ.getErrorCode();
        } else if (obj instanceof Exception) {
            string = obj.toString();
            errorCode = 400;
        } else {
            string = "unknown error";
            errorCode = -1;
        }
        C0IX5.LIZJ(j, str, j2, errorCode, 0, string);
    }

    public static void LJIILIIL(WeakHandler weakHandler, long j, int i, int i2) {
        C480460Ism.LIZ().getClass();
        ((RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class)).reportDetect(j, i, i2).LJIILIIL(new C0UO0()).LJJLL(new AfS176S0100000_7(weakHandler, 160), new AfS176S0100000_7(weakHandler, 161));
    }

    public static void LJIIL(int i, long j, long j2, C463950IHh c463950IHh, String str) {
        String str2;
        int i2;
        Room room = c463950IHh.LIZ;
        if (room == null) {
            str2 = "room is null";
            i2 = 1002;
        } else if (!Room.isValid(room)) {
            str2 = "invalid room data";
            i2 = 1003;
        } else {
            str2 = "";
            i2 = 0;
        }
        C0IX5.LIZJ(j, str, j2, i2, i, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(final android.os.Handler r35, final long r36, final java.lang.String r38, final java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.util.HashMap r44, boolean r45, final java.lang.String r46, final java.lang.String r47, java.util.HashMap r48, long r49, boolean r51, final java.lang.String r52, java.lang.String r53, java.lang.String r54, com.bytedance.android.livesdkapi.depend.model.live.LiveMode r55, boolean r56, java.lang.String r57, final java.util.HashMap r58) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C464950ILd.LIZJ(android.os.Handler, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, boolean, java.lang.String, java.lang.String, java.util.HashMap, long, boolean, java.lang.String, java.lang.String, java.lang.String, com.bytedance.android.livesdkapi.depend.model.live.LiveMode, boolean, java.lang.String, java.util.HashMap):void");
    }

    public final void LIZLLL(final Handler handler, final long j, String str, final String str2, String str3, String str4, String str5, String str6, HashMap map, boolean z, final String str7, final String str8, HashMap map2, long j2, boolean z2, final String str9, String str10, String str11, LiveMode liveMode, boolean z3, String str12, final HashMap map3) {
        Room room;
        String str13;
        String str14;
        EnterRoomExtra enterRoomExtra;
        EnterRoomUpdateManager enterRoomUpdateManager = EnterRoomUpdateManager.LIZ;
        String strValueOf = String.valueOf(j);
        enterRoomUpdateManager.getClass();
        final C465120ILu c465120ILuLIZIZ = EnterRoomUpdateManager.LJIIJ.LIZIZ(strValueOf);
        long j3 = 1;
        if (c465120ILuLIZIZ == null || (((room = c465120ILuLIZIZ.LIZ) == null || (enterRoomExtra = room.enterRoomBoostExtra) == null || enterRoomExtra.useEnterBoostCache != 1 || room.shortTouchItems == null) && ((str13 = c465120ILuLIZIZ.LIZIZ) == null || str13.length() == 0))) {
            LIZJ(handler, j, str, str2, str3, str4, str5, str6, map, z, str7, str8, map2, j2, z2, str9, str10, str11, liveMode, z3, str12, map3);
            return;
        }
        C0IHL c0ihl = new C0IHL();
        c0ihl.LIZ("common_label_list", str3);
        c0ihl.LIZ("enter_source", str4);
        c0ihl.LIZ("request_id", str);
        c0ihl.LIZ("enter_type", str2);
        c0ihl.LIZ("live_reason", str5);
        c0ihl.LIZ("enter_from_uid_by_shared", str6);
        String str15 = CardStruct.IStatusCode.DEFAULT;
        if (z2) {
            str14 = "1";
        } else {
            str14 = CardStruct.IStatusCode.DEFAULT;
        }
        c0ihl.LIZ("is_fresh", str14);
        c0ihl.LIZ("ecommerce_use_new_promotion", "1");
        c0ihl.LIZ("action_type", str10);
        c0ihl.LIZ("sort_wbc_tag", str11);
        if (z) {
            str15 = "1";
        }
        c0ihl.LIZ("need_trim_pull_stream", str15);
        HashMap<String, String> map4 = c0ihl.LIZ;
        map4.putAll(map);
        map4.putAll(map2);
        if (j2 > 0) {
            map4.put("portal_id", String.valueOf(j2));
        }
        if (z3) {
            map4.put("share_source", "external_link");
        }
        if (!C2093608Ic.LJ(str12)) {
            map4.put("enter_tag", str12);
        }
        if (LiveAdaptStrategyAddParamsSetting.INSTANCE.getValue()) {
            HashMap map5 = new HashMap();
            map5.put("user_type", "viewer");
            ((IHostSignalService) C1161920gLG.LIZJ(IHostSignalService.class)).fillUploadFeatures(map5, "enter_room");
            List<Long> list = C472970Igh.LIZ;
            String strLJIIIZ = C472970Igh.LJIIIZ(map5, new C0IMC(str7, str8, str10, liveMode.logStreamingType));
            if (strLJIIIZ != null) {
                map4.put("epi_features", strLJIIIZ);
            }
        }
        map4.put("enter_room_scene", "enter_by_patch");
        map4.put("enter_room_version", String.valueOf(c465120ILuLIZIZ.LIZLLL));
        map4.putAll(map3);
        if (!LiveEnterRoomClickPerfOptSetting.optAabCheckOnEnterRoom()) {
            C08D5.LIZIZ(C0IK5.LIZ(), new ARunnableS107S0100000_7(this, 166), null, 0L);
        }
        if (!UserService.getInstance().user().isLogin()) {
            j3 = 0;
        }
        C19476611Hw c19476611HwLJIIIZ = LJIIIZ(j, j3, map4);
        C0IX5.LIZIZ(j, str9, str7, str8, str2);
        C465050ILn.LIZIZ(j, "live_room_enter_begin");
        final long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC420801kM interfaceC420801kMLJJLL = c19476611HwLJIIIZ.LJJLL(new C09JN() { // from class: X.0ILl
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:105:0x025e  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x009e A[DONT_GENERATE] */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
            /* JADX WARN: Type inference failed for: r2v26, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v6, types: [T, com.bytedance.android.livesdkapi.depend.model.live.Room] */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r34) {
                /*
                    Method dump skipped, instruction units count: 675
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C465030ILl.accept(java.lang.Object):void");
            }
        }, new AfS2S2200200_7(this, j, jCurrentTimeMillis, str2, handler, str9, 0));
        if (!C2093608Ic.LJ(str9)) {
            this.LIZJ.put(str9, interfaceC420801kMLJJLL);
        }
    }

    public final void LJIIJ(Handler handler, long j, String str, String str2, String str3, String str4, String str5, String str6, HashMap map, boolean z, String str7, String str8, HashMap map2, long j2, boolean z2, String str9, String str10, String str11, LiveMode liveMode, boolean z3, String str12, HashMap map3, Pair pair, InterfaceC465000ILi interfaceC465000ILi) {
        int iIntValue = ((Integer) pair.getFirst()).intValue();
        Room room = (Room) pair.getSecond();
        if (iIntValue == 0) {
            if (room != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C0IX5.LIZIZ(j, str9, str7, str8, str2);
                C465050ILn.LIZIZ(j, "live_room_enter_begin");
                C463950IHh c463950IHh = new C463950IHh();
                c463950IHh.LIZ = room;
                c463950IHh.LIZIZ = room.enterRoomBoostExtra;
                c463950IHh.LIZJ = 1;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                C464960ILe c464960ILe = (C464960ILe) interfaceC465000ILi;
                c464960ILe.LLJLL = c463950IHh;
                c464960ILe.LLIZLLLIL.LIZIZ(c463950IHh);
                LJIIL(0, j, jCurrentTimeMillis2, c463950IHh, str9);
                C465050ILn.LJI(j);
                LJIILJJIL(handler, j, str, str2, str3, str4, str5, str6, map, z, str7, str8, map2, j2, z2, str9, str10, str11, liveMode, z3, str12, map3, room, null);
                return;
            }
        } else if (iIntValue == 1 && room != null) {
            LIZLLL(handler, j, str, str2, str3, str4, str5, str6, map, z, str7, str8, map2, j2, z2, str9, str10, str11, liveMode, z3, str12, map3);
            return;
        }
        LIZJ(handler, j, str, str2, str3, str4, str5, str6, map, z, str7, str8, map2, j2, z2, str9, str10, str11, liveMode, z3, str12, map3);
    }

    public final void LJIILJJIL(final Handler handler, final long j, String str, final String str2, String str3, String str4, String str5, String str6, HashMap map, boolean z, final String str7, final String str8, HashMap map2, long j2, boolean z2, String str9, String str10, String str11, LiveMode liveMode, boolean z3, String str12, final HashMap map3, final Room room, final EnterRoomExtra enterRoomExtra) {
        String str13;
        C0IHL c0ihl = new C0IHL();
        c0ihl.LIZ("common_label_list", str3);
        c0ihl.LIZ("enter_source", str4);
        c0ihl.LIZ("request_id", str);
        c0ihl.LIZ("enter_type", str2);
        c0ihl.LIZ("live_reason", str5);
        c0ihl.LIZ("enter_from_uid_by_shared", str6);
        String str14 = CardStruct.IStatusCode.DEFAULT;
        if (z2) {
            str13 = "1";
        } else {
            str13 = CardStruct.IStatusCode.DEFAULT;
        }
        c0ihl.LIZ("is_fresh", str13);
        c0ihl.LIZ("ecommerce_use_new_promotion", "1");
        c0ihl.LIZ("action_type", str10);
        c0ihl.LIZ("sort_wbc_tag", str11);
        if (z) {
            str14 = "1";
        }
        c0ihl.LIZ("need_trim_pull_stream", str14);
        HashMap<String, String> map4 = c0ihl.LIZ;
        map4.putAll(map);
        map4.putAll(map2);
        long j3 = 0;
        if (j2 > 0) {
            map4.put("portal_id", String.valueOf(j2));
        }
        if (z3) {
            map4.put("share_source", "external_link");
        }
        if (!C2093608Ic.LJ(str12)) {
            map4.put("enter_tag", str12);
        }
        map4.put("enter_room_scene", "enter_by_full");
        if (LiveAdaptStrategyAddParamsSetting.INSTANCE.getValue()) {
            HashMap map5 = new HashMap();
            map5.put("user_type", "viewer");
            ((IHostSignalService) C1161920gLG.LIZJ(IHostSignalService.class)).fillUploadFeatures(map5, "enter_room");
            List<Long> list = C472970Igh.LIZ;
            String strLJIIIZ = C472970Igh.LJIIIZ(map5, new C0IMC(str7, str8, str10, liveMode.logStreamingType));
            if (strLJIIIZ != null) {
                map4.put("epi_features", strLJIIIZ);
            }
        }
        map4.putAll(map3);
        C08D5.LIZIZ(C0IK5.LIZ(), new ARunnableS107S0100000_7(this, 166), null, 0L);
        if (UserService.getInstance().user().isLogin()) {
            j3 = 1;
        }
        C19476611Hw c19476611HwLJIIIZ = LJIIIZ(j, j3, map4);
        C465050ILn.LIZIZ(j, "live_room_enter_begin");
        final long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC420801kM interfaceC420801kMLJJLL = c19476611HwLJIIIZ.LJJLL(new C09JN() { // from class: X.0ILk
            /* JADX WARN: Removed duplicated region for block: B:39:0x013f  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r30) {
                /*
                    Method dump skipped, instruction units count: 375
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C465020ILk.accept(java.lang.Object):void");
            }
        }, new AfS2S2200200_7(this, j, jCurrentTimeMillis, str2, handler, str9, 2));
        if (!C2093608Ic.LJ(str9)) {
            this.LIZJ.put(str9, interfaceC420801kMLJJLL);
        }
    }
}
