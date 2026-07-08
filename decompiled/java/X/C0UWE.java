package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamEnableFatalErrorOpt;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0UWE, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UWE {
    public static final Map<Integer, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair(0, "normal"), new Pair(1, "status_exception"), new Pair(2, "video_capture_fail"), new Pair(3, "audio_capture_fail"), new Pair(4, "retry_max_times"), new Pair(5, "video_encoder_fail"), new Pair(6, "audio_encoder_fail"), new Pair(7, "adm_recoder_fail"), new Pair(8, "adm_play_fail"), new Pair(10001, "click"), new Pair(10002, "kick_out"), new Pair(10003, "banned"), new Pair(10004, "force_or_illegal"), new Pair(10005, "room_not_exist"), new Pair(10006, "user_not_in_room"), new Pair(10007, "room_live_finish"), new Pair(10008, "background_time_out"), new Pair(10009, "back_main"), new Pair(100, "lite_default"), new Pair(101, "lite_invalid_license"), new Pair(102, "lite_invalid_parameter"), new Pair(103, "lite_video_capture"), new Pair(104, "lite_audio_capture"), new Pair(105, "lite_video_encoder"), new Pair(106, "lite_audio_encoder"), new Pair(107, "lite_transport"), new Pair(108, "lite_transport"), new Pair(109, "lite_audio_device_error"), new Pair(110, "lite_pusher"));
    public static final List<Integer> LIZIZ = C1697810uHb.LJIIJJI(0, 4);

    public static final boolean LIZLLL(int i) {
        if (1 <= i) {
            return i < 10 || (100 <= i && i < 111);
        }
        return false;
    }

    public static final String LIZ(int i) {
        String str = LIZ.get(Integer.valueOf(i));
        if (str == null) {
            return "unknown";
        }
        return str;
    }

    public static final boolean LIZIZ(int i, int i2) {
        boolean zContains = C13LQ.LJLIIL(new Integer[]{1, 2, 3, 4, -401, -402, -405, -406, -407, -408, -410, -425, -439, -100}).contains(Integer.valueOf(i2));
        if (i == 2 && zContains) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(int i, Integer num) {
        boolean z;
        if (num != null && (num.intValue() == -201 || num.intValue() == -202 || num.intValue() == -203)) {
            z = true;
        } else {
            z = false;
        }
        if (i != 2 || !z) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(int i, int i2) {
        if ((LiveStreamEnableFatalErrorOpt.INSTANCE.getEnabled() || (100 <= i && i < 111)) && i2 == -44124) {
            return true;
        }
        return false;
    }
}
