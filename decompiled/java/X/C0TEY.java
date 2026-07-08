package X;

import android.text.TextUtils;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.game.broadcast.mirror.DualDeviceSourceReport$Companion$addActivityDestroyedCallback$callback$1;
import com.bytedance.android.livesdk.log.monitor.IPerformanceManager;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0TEY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TEY {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static DualDeviceSourceReport$Companion$addActivityDestroyedCallback$callback$1 LIZLLL;
    public static int LJ;
    public static long LJFF = System.currentTimeMillis();
    public static String LJI = CardStruct.IStatusCode.DEFAULT;
    public static String LJII = CardStruct.IStatusCode.DEFAULT;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static int LJIIJ;
    public static int LJIIJJI;
    public static int LJIIL;
    public long LIZ = -1;

    public static void LIZJ(DataChannel dataChannel) {
        InterfaceC1100800ekg interfaceC1100800ekgMc1;
        if (dataChannel != null && (interfaceC1100800ekgMc1 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).mc1(dataChannel)) != null) {
            C465520INi.LIZ.JV(interfaceC1100800ekgMc1);
            interfaceC1100800ekgMc1.start();
        }
        IPerformanceManager iPerformanceManager = C465520INi.LIZ;
        iPerformanceManager.setIsAnchor(true);
        iPerformanceManager.fA0(LiveMode.SCREEN_RECORD);
        iPerformanceManager.ml0("dual_device_source");
        iPerformanceManager.LO1();
    }

    public final void LIZ(int i, int i2, String str, String str2, boolean z) {
        String str3;
        if (this.LIZ < 0) {
            return;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.LIZ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (jCurrentTimeMillis <= 0) {
            return;
        }
        this.LIZ = -1L;
        String str4 = "disconnect";
        if (i != 10022007) {
            str3 = "disconnect";
        } else {
            str3 = "manual";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_source_mirror_duration");
        c474500IjALIZ.LJJII(LJI, "user_id");
        c474500IjALIZ.LJJII(LJII, "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration");
        c474500IjALIZ.LJJII(str3, "reason");
        if (!TextUtils.isEmpty(str2)) {
            c474500IjALIZ.LJJII(str2, "user_id");
        }
        if (!TextUtils.isEmpty(str)) {
            c474500IjALIZ.LJJII(str, "room_id");
        }
        c474500IjALIZ.LIZ();
        LJIIJ++;
        if (i != 10022007) {
            C0TFE.LIZ.getClass();
            if (i2 == 211032 && (i == 10022009 || i == 10022011)) {
                return;
            }
            if (z) {
                str4 = "error";
            }
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_dual_device_source_disconnect");
            c474500IjALIZ2.LJJII(LJI, "user_id");
            c474500IjALIZ2.LJJII(LJII, "room_id");
            c474500IjALIZ2.LJJII(str4, "reason");
            c474500IjALIZ2.LJJII(0, "error_code");
            c474500IjALIZ2.LJJII(0, "error_code_extra");
            c474500IjALIZ2.LJJII("", "error_code_msg");
            c474500IjALIZ2.LJJII(Integer.valueOf(i2), "disconnect_code");
            c474500IjALIZ2.LJJII(Integer.valueOf(i), "disconnect_extra");
            if (!TextUtils.isEmpty(str2)) {
                c474500IjALIZ2.LJJII(str2, "user_id");
            }
            if (!TextUtils.isEmpty(str)) {
                c474500IjALIZ2.LJJII(str, "room_id");
            }
            c474500IjALIZ2.LIZ();
        }
    }
}
