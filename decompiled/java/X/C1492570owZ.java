package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicService;

/* JADX INFO: renamed from: X.0owZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492570owZ {
    public static final C1492570owZ LIZ = new C1492570owZ();

    public static void LIZIZ(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("music_id", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("url", str3);
        c2344009Gk.LIZJ(((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIIJJI(), "download_strategy");
        c2344009Gk.LJIIIIZZ("musicEffectsUrl", str4);
        c2344009Gk.LJ(Boolean.FALSE, "is_use_tt_player");
        C20684815ws.LJIILLIIL("download_music", c2344009Gk.LIZ);
    }

    public static void LIZ(String str, String str2, String str3, String str4, Long l) {
        boolean zLIZIZ;
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("music_id", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("url", str3);
        c2344009Gk.LIZJ(((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIIJJI(), "download_strategy");
        c2344009Gk.LJIIIIZZ("fail_reason", str4);
        Boolean bool = Boolean.FALSE;
        c2344009Gk.LJ(bool, "is_use_tt_player");
        c2344009Gk.LJ(Boolean.valueOf(zLIZIZ), "isNetworkAvailable");
        C20684815ws.LJIILLIIL("download_music_failed", c2344009Gk.LIZ);
        C1458390o3R.LIZ.getClass();
        C1458390o3R.LIZ(str, true, l, bool);
    }

    public static void LIZJ(String str, String str2, String str3, Long l, Long l2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("music_id", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("url", str3);
        c2344009Gk.LJ(l, "time");
        c2344009Gk.LJ(l2, "size");
        c2344009Gk.LIZJ(((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIIJJI(), "download_strategy");
        Boolean bool = Boolean.FALSE;
        c2344009Gk.LJ(bool, "is_use_tt_player");
        C20684815ws.LJIILLIIL("download_music_succeed", c2344009Gk.LIZ);
        C1458390o3R.LIZ.getClass();
        C1458390o3R.LIZ(str, true, l, bool);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, String str5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("music_id", str);
        c2344009Gk.LJIIIIZZ("url", str4);
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("fail_reason", str5);
        c2344009Gk.LJIIIIZZ("url_list", str2);
        c2344009Gk.LJ(Boolean.TRUE, "is_use_tt_player");
        C20684815ws.LJIILLIIL("download_play_failed", c2344009Gk.LIZ);
    }

    public static void LJ(Long l, String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("music_id", str);
        c2344009Gk.LJIIIIZZ("url", str4);
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJ(l, "time");
        c2344009Gk.LJIIIIZZ("url_list", str2);
        c2344009Gk.LJ(Boolean.TRUE, "is_use_tt_player");
        C20684815ws.LJIILLIIL("download_play_start", c2344009Gk.LIZ);
    }

    public static void LJFF(Long l, String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("music_id", str);
        c2344009Gk.LJIIIIZZ("url", str4);
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJ(l, "time");
        c2344009Gk.LJIIIIZZ("url_list", str2);
        c2344009Gk.LJ(Boolean.TRUE, "is_use_tt_player");
        C20684815ws.LJIILLIIL("download_play_succeed", c2344009Gk.LIZ);
    }

    public static void LJI(Integer num, String str, String str2, Long l, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("music_id", str);
        c2344009Gk.LJ(l, "prepare_time");
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJ(num, "time");
        c2344009Gk.LJIIIIZZ("url", str3);
        C20684815ws.LJIILLIIL("audio_first_frame", c2344009Gk.LIZ);
    }
}
