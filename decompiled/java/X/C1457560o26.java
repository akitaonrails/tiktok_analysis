package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o26, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457560o26 {
    public static final C1457560o26 LIZ = new C1457560o26();
    public static long LIZIZ;
    public static boolean LIZJ;

    public static final int LIZ(CreativeModel creativeModel) {
        if (creativeModel.creationTypeModel.creationMode == 3) {
            return 0;
        }
        CanvasVideoData canvasVideoData = creativeModel.canvasVideoData;
        if (canvasVideoData != null && C1444940nhk.LJII(canvasVideoData) && C1444940nhk.LIZJ(canvasVideoData) == 1) {
            return C1444940nhk.LIZJ(canvasVideoData);
        }
        return creativeModel.albumModel.photoCount;
    }

    public static void LIZJ(int i, String str) {
        String str2;
        if (i == 2) {
            str2 = "video_shoot_page";
        } else {
            str2 = "video_edit_page";
        }
        if (Intrinsics.LJFF(str, "single_song")) {
            str2 = "entrance";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str2);
        c0lab.LIZLLL(Double.valueOf(C2179771ASp.LJIIIIZZ()), "volume_value");
        c0lab.LJ(Scene.SCENE_SERVICE, str);
        C20684815ws.LJIILLIIL("tool_performance_volume", c0lab.LIZ);
    }

    public static final void LIZIZ(int i, int i2, String str) {
        String str2;
        String str3;
        if (i == 2) {
            str2 = "video_shoot_page";
        } else {
            str2 = "video_edit_page";
        }
        if (Intrinsics.LJFF(str, "single_song")) {
            str2 = "entrance";
        }
        if (i2 == 24) {
            str3 = "volume_up";
        } else {
            str3 = "volume_down";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str2);
        c0lab.LIZLLL(Double.valueOf(C2179771ASp.LJIIIIZZ()), "from_volume_value");
        c0lab.LJ("key_event", str3);
        LIZ.getClass();
        if (Math.abs(System.currentTimeMillis() - LIZIZ) > Mp4ScreenVideoLoadTimeout.CONTROL) {
            LIZIZ = System.currentTimeMillis();
            C844470XAv.LIZ.getClass();
            int iLJI = C2179771ASp.LJI(C844470XAv.LIZ());
            boolean z = true;
            if (iLJI != 1 && iLJI != 2) {
                z = false;
            }
            LIZJ = z;
        }
        c0lab.LIZ(LIZJ ? 1 : 0, "earphone_status");
        c0lab.LJ(Scene.SCENE_SERVICE, str);
        C20684815ws.LJIILLIIL("tool_performance_adjust_volume", c0lab.LIZ);
    }
}
