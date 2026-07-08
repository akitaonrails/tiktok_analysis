package X;

import Y.ARunnableS112S0100000_12;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772780UTc {
    public static boolean LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static int LJI;
    public static int LJII;
    public static int LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static JSONObject LJIIJJI;
    public static int LJIIL;
    public static RoomCreateInfo LJIILLIIL;
    public static int LJIIZILJ;
    public static long LJIJ;
    public static long LJIJI;
    public static long LJIJJ;
    public static long LJIJJLI;
    public static long LJIL;
    public static long LJJ;
    public static long LJJI;
    public static long LJJIFFI;
    public static long LJJII;
    public static long LJJIII;
    public static String LJIILIIL = "";
    public static String LJIILJJIL = "";
    public static String LJIILL = "";
    public static final C772800UTe LJJIIJ = new C0IKN() { // from class: X.0UTe
        @Override // X.C0IKN
        public final void LIZ() {
            SystemClock.elapsedRealtime();
            SystemClock.elapsedRealtime();
        }
    };
    public static final C772790UTd LJJIIJZLJL = new C0IKN() { // from class: X.0UTd
        @Override // X.C0IKN
        public final void LIZ() {
            SystemClock.elapsedRealtime();
            SystemClock.elapsedRealtime();
        }
    };

    public static int LJI() {
        boolean z;
        String property;
        String property2;
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (Intrinsics.LJFF(networkInterface.getName(), "tun0") || Intrinsics.LJFF(networkInterface.getName(), "tun1")) {
                    z = true;
                    break;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        z = false;
        try {
            property = System.getProperty("http.proxyHost");
            property2 = System.getProperty("http.proxyPort");
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        boolean z2 = (TextUtils.isEmpty(property) || (property2 != null ? CastIntegerProtector.parseInt(property2) : -1) == -1) ? false : true;
        return z ? z2 ? 3 : 2 : !z2 ? 0 : 1;
    }

    public static void LJII() {
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        if (LJFF != 0) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_broadcast_end");
            c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - LJFF), "duration");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Long.valueOf(LJIJ), "duration_server_heat_level_1");
            c474500IjALIZ.LJJII(Long.valueOf(LJIJI), "duration_server_heat_level_2");
            c474500IjALIZ.LJJII(Long.valueOf(LJIJJ), "duration_server_heat_level_3");
            c474500IjALIZ.LJJII(Long.valueOf(LJIJJLI), "duration_server_heat_level_4");
            c474500IjALIZ.LJJII(Long.valueOf(LJIL), "duration_server_heat_level_5");
            c474500IjALIZ.LJJII(Long.valueOf(LJJ), "duration_client_heat_level_1");
            c474500IjALIZ.LJJII(Long.valueOf(LJJI), "duration_client_heat_level_2");
            c474500IjALIZ.LJJII(Long.valueOf(LJJIFFI), "duration_client_heat_level_3");
            c474500IjALIZ.LJJII(Long.valueOf(LJJII), "duration_client_heat_level_4");
            c474500IjALIZ.LJJII(Long.valueOf(LJJIII), "duration_client_heat_level_5");
            c474500IjALIZ.LIZ();
        }
        RoomCreateInfo roomCreateInfo = LJIILLIIL;
        if (roomCreateInfo != null) {
            ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).MY(roomCreateInfo.mLastRoomId);
            ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Fp0(roomCreateInfo.mLastRoomId);
        }
        LJIJ = 0L;
        LJIJI = 0L;
        LJIJJ = 0L;
        LJIJJLI = 0L;
        LJIL = 0L;
        LJJ = 0L;
        LJJI = 0L;
        LJJIFFI = 0L;
        LJJII = 0L;
        LJJIII = 0L;
        LIZIZ = 0L;
        LIZJ = 0L;
        LIZLLL = 0L;
        LJ = 0L;
        LJFF = 0L;
    }

    public static void LJIIIIZZ(long j) throws JSONException {
        LiveMode streamType;
        String str;
        if (!LIZ) {
            C486980J7w.LIZLLL(EnumC486990J7x.CreateLive);
            LIZ = true;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_broadcast_duration");
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                streamType = room.getStreamType();
            } else {
                streamType = null;
            }
            LIZ(c474500IjALIZ, streamType);
            JSONObject jSONObject = LJIIJJI;
            if (jSONObject != null) {
                jSONObject.put("take_definition", LJIILJJIL);
                jSONObject.put("game_tag_id", LJIILL);
                C465520INi.LIZ.Ef0(jSONObject);
            }
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Long.valueOf(LJ - LIZIZ), "first_show_camera_user");
            c474500IjALIZ.LJJII(Long.valueOf(j - LIZIZ), "first_push_stream_user");
            c474500IjALIZ.LJJII(Long.valueOf(LJ - LIZJ), "first_show_camera_launch");
            c474500IjALIZ.LJJII(Long.valueOf(j - LIZJ), "first_push_stream_launch");
            c474500IjALIZ.LJJII(Long.valueOf(LIZLLL - LIZJ), "video_broadcast_create_launch");
            c474500IjALIZ.LJJII(Integer.valueOf(LJI), "max_bitrate");
            c474500IjALIZ.LJJII(Integer.valueOf(LJII), "min_bitrate");
            c474500IjALIZ.LJJII(Integer.valueOf(LJIIIIZZ), "default_bitrate");
            c474500IjALIZ.LJJII(Integer.valueOf(LJIIIZ ? 1 : 0), "is_bytevc1");
            c474500IjALIZ.LJJII(Integer.valueOf(LJIIJ ? 1 : 0), "is_hw");
            c474500IjALIZ.LJJII(Integer.valueOf(LJIIL), "definition");
            c474500IjALIZ.LJJII(Integer.valueOf(LJIIZILJ), "resume_scene");
            if (LJIIZILJ == 4) {
                str = "anchor_manully";
            } else {
                str = "system";
            }
            c474500IjALIZ.LJJII(str, "resume_type");
            c474500IjALIZ.LJJII(Integer.valueOf(LJI()), "is_vpn");
            c474500IjALIZ.LJJIIZI(C771990UQb.LIZ);
            c474500IjALIZ.LIZ();
            LJFF = j;
            RoomCreateInfo roomCreateInfo = LJIILLIIL;
            if (roomCreateInfo != null) {
                ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).KC2(roomCreateInfo.mLastRoomId, LJJIIJ);
                ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).jE0(roomCreateInfo.mLastRoomId, LJJIIJZLJL);
            }
            C1276840jKc c1276840jKc = C1276840jKc.LIZ;
            AFwS199S0000000_12 aFwS199S0000000_12 = AFwS199S0000000_12.get$arr$(377);
            c1276840jKc.getClass();
            C1276840jKc.LJJJ = aFwS199S0000000_12;
        }
    }

    public static void LJIIIZ(int i) {
        if (C771670UOv.LJFF) {
            i = 3;
        } else if (C771670UOv.LJI) {
            i = 4;
        }
        LJIIZILJ = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C474500IjA r9, com.bytedance.android.livesdkapi.depend.model.live.LiveMode r10) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C772780UTc.LIZ(X.0IjA, com.bytedance.android.livesdkapi.depend.model.live.LiveMode):void");
    }

    public static void LIZLLL(Exception exc, LiveMode liveMode) {
        String message;
        int cronetError;
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis() - LIZIZ;
        int i2 = 0;
        if (exc instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) exc;
            cronetError = c501470JlZ.getErrorCode();
            message = c501470JlZ.getErrorMsg();
            i = 2;
        } else if (exc instanceof C1811850xFX) {
            C1811850xFX c1811850xFX = (C1811850xFX) exc;
            cronetError = c1811850xFX.getCronetError();
            i2 = c1811850xFX.statusCode;
            message = c1811850xFX.getMessage();
            i = 3;
        } else {
            message = exc.getMessage();
            cronetError = -1;
            i = 4;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_create_room");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(liveMode.logStreamingType, "live_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_type");
        c474500IjALIZ.LJJII(Integer.valueOf(cronetError), "error_code");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "error_code_1");
        c474500IjALIZ.LJJII(message, "error_msg");
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration");
        c474500IjALIZ.LJJII(Integer.valueOf(LJI()), "is_vpn");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(int i, LiveMode liveMode) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_create_room");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(liveMode.logStreamingType, "live_type");
        c474500IjALIZ.LJJII(1, "error_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(0, "error_code_1");
        c474500IjALIZ.LJJII("", "error_msg");
        c474500IjALIZ.LJJII(0, "duration");
        c474500IjALIZ.LJJII(Integer.valueOf(LJI()), "is_vpn");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(LiveMode liveMode, DataChannel dataChannel, Long l) {
        RoomCreateInfo roomCreateInfo;
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis() - LIZIZ;
        if (dataChannel != null) {
            roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class);
        } else {
            roomCreateInfo = null;
        }
        LJIILLIIL = roomCreateInfo;
        if (C772710USv.LIZLLL()) {
            str = "manual_speedtest";
        } else if (C772710USv.LIZJ()) {
            str = "auto_speedtest";
        } else {
            Map<String, String> mapLIZIZ = InterfaceC772390URp.p.LIZIZ();
            if (mapLIZIZ != null && !mapLIZIZ.isEmpty()) {
                str = "selected";
            } else {
                str = "default";
            }
        }
        LJIILIIL = str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_create_room");
        LIZ(c474500IjALIZ, liveMode);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(l, "room_id");
        c474500IjALIZ.LJJII(liveMode.logStreamingType, "live_type");
        c474500IjALIZ.LJJII(0, "error_type");
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "error_code");
        c474500IjALIZ.LJJII(0, "error_code_1");
        c474500IjALIZ.LJJII("", "error_msg");
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration");
        C783270Uo1.LIZLLL(new ARunnableS112S0100000_12(c474500IjALIZ, 352));
    }
}
