package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.record.RecordData;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o27, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457570o27 {
    public static final C1457570o27 LIZ = new C1457570o27();
    public static long LIZIZ;
    public static boolean LIZJ;

    public static void LIZLLL(ShortVideoContext shortVideoContext, boolean z) {
        long j = 0;
        if (shortVideoContext.creativeModel.recordData.enterShootPageTime != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            RecordData recordData = shortVideoContext.creativeModel.recordData;
            long j2 = jCurrentTimeMillis - recordData.enterShootPageTime;
            recordData.enterShootPageTime = 0L;
            j = j2;
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LIZIZ(j, "stay_duration");
        c0lab.LJ("shoot_page", "record_lightening");
        c0lab.LJFF("using_effect", z);
        c0lab.LJFF("using_music", shortVideoContext.LJJJJZI());
        c0lab.LJ("creation_id", shortVideoContext.creativeInfo.getCreationId());
        C2341909Fp.LIZ("tool_performance_step_back", c0lab.LIZ);
    }

    public static final void LIZ(int i, String str, String str2, String str3) {
        String str4;
        if (i == 24) {
            str4 = "volume_up";
        } else {
            str4 = "volume_down";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str3);
        c0lab.LIZLLL(Double.valueOf(C2179771ASp.LJIIIIZZ()), "from_volume_value");
        c0lab.LJ("key_event", str4);
        LIZ.getClass();
        if (Math.abs(System.currentTimeMillis() - LIZIZ) > Mp4ScreenVideoLoadTimeout.CONTROL) {
            LIZIZ = System.currentTimeMillis();
            int iLJI = C2179771ASp.LJI(C0CHQ.LIZ);
            boolean z = true;
            if (iLJI != 1 && iLJI != 2) {
                z = false;
            }
            LIZJ = z;
        }
        c0lab.LIZ(LIZJ ? 1 : 0, "earphone_status");
        c0lab.LJ("creation_id", str);
        c0lab.LJ(Scene.SCENE_SERVICE, str2);
        C20684815ws.LJIILLIIL("tool_performance_adjust_volume", c0lab.LIZ);
    }

    public static final void LJ(String str, String str2, String str3, boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str2);
        c0lab.LIZLLL(Double.valueOf(C2179771ASp.LJIIIIZZ()), "volume_value");
        c0lab.LJ(Scene.SCENE_SERVICE, str3);
        c0lab.LJFF("using_music", z);
        c0lab.LJ("creation_id", str);
        C20684815ws.LJIILLIIL("tool_performance_volume", c0lab.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3, long j, long j2, long j3, int i, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3) {
        String str8;
        String str9;
        if (j2 <= -1 || j3 <= -1 || Intrinsics.LJFF(str4, "entry")) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", str2);
            c0lab.LJ("shoot_way", str3);
            c0lab.LIZIZ(jCurrentTimeMillis, "wait_time_ms");
            c0lab.LIZIZ(j2, "first_frame_duration");
            c0lab.LIZIZ(j3, "first_ui_frame_duration");
            c0lab.LIZ(i, "error_code");
            c0lab.LIZLLL(C036E.LIZ.LIZJ, "network_type");
            c0lab.LJ("event_type", str4);
            c0lab.LJ("enter_from", str5);
            c0lab.LJ("content_type", str6);
            c0lab.LJ("content_source", str7);
            if (!Intrinsics.LJFF(str3, "story") && C1392820mLg.LIZ()) {
                String str10 = "1";
                if (z) {
                    str8 = "1";
                } else {
                    str8 = CardStruct.IStatusCode.DEFAULT;
                }
                c0lab.LJ("is_login", str8);
                if (z2) {
                    str9 = "1";
                } else {
                    str9 = CardStruct.IStatusCode.DEFAULT;
                }
                c0lab.LJ("has_camera_permission", str9);
                if (!z3) {
                    str10 = CardStruct.IStatusCode.DEFAULT;
                }
                c0lab.LJ("has_microphone_permission", str10);
            }
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C2341909Fp.LIZ(str, c0lab.LIZ);
        }
    }
}
