package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0ZBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895690ZBv {
    public static final C895690ZBv LIZ = new C895690ZBv();

    public static EnumC895700ZBw LIZIZ(EnumC895710ZBx enumC895710ZBx) {
        if (enumC895710ZBx == EnumC895710ZBx.AUDIO_START) {
            return EnumC895700ZBw.PROCESS_TRANS_AUDIO_START;
        }
        if (enumC895710ZBx == EnumC895710ZBx.AUDIO_END) {
            return EnumC895700ZBw.PROCESS_TRANS_AUDIO_END;
        }
        if (enumC895710ZBx == EnumC895710ZBx.FINGER_START) {
            return EnumC895700ZBw.PROCESS_PICK_AUDIO_START;
        }
        if (enumC895710ZBx == EnumC895710ZBx.FINGER_END) {
            return EnumC895700ZBw.PROCESS_PICK_AUDIO_END;
        }
        if (enumC895710ZBx == EnumC895710ZBx.FINGER_ERROR) {
            return EnumC895700ZBw.PROCESS_PICK_AUDIO_ERROR;
        }
        if (enumC895710ZBx == EnumC895710ZBx.PROCESS_CANCEL) {
            return EnumC895700ZBw.PROCESS_CANCEL;
        }
        return EnumC895700ZBw.PROCESS_NOT_STARTED;
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, EnumC895720ZBy enumC895720ZBy, long j, Map map, EnumC895700ZBw enumC895700ZBw, String str, int i, int i2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C538990LBx.LIZ(c2344009Gk, videoPublishEditModel);
        c2344009Gk.LIZJ(1, "stage");
        c2344009Gk.LIZJ(enumC895720ZBy.getValue$tools_camera_base_release(), "result");
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LJ(map, "duration_map");
        c2344009Gk.LIZJ(enumC895700ZBw.getValue$tools_camera_base_release(), "check_process");
        c2344009Gk.LJIIIIZZ("error_msg", str);
        c2344009Gk.LIZJ(i, "error_code");
        c2344009Gk.LIZJ(i2, "status_code");
        C20684815ws.LJIILLIIL("sound_copyright_detect", c2344009Gk.LIZ);
    }
}
