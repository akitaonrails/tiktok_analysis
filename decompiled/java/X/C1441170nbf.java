package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;

/* JADX INFO: renamed from: X.0nbf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441170nbf {
    public static final C1441170nbf LIZ = new C1441170nbf();

    public static void LJ(boolean z, Exception exc) {
        String strLIZ;
        int i = !z ? 1 : 0;
        C543670LTx c543670LTx = new C543670LTx();
        if (exc == null) {
            strLIZ = "";
        } else {
            strLIZ = C1331420kke.LIZ(exc);
        }
        c543670LTx.LIZ.put("exception", strLIZ);
        C1637890six.LJ("stickpoint_musiclist", i, c543670LTx.LJ());
    }

    public static void LIZ(String str, String str2, boolean z) {
        String str3;
        C13DA c13da = new C13DA();
        c13da.put("music_id", str);
        c13da.put("alg_type", str2);
        if (z) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str3 = "1";
        }
        c13da.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
        C20684815ws.LJIILLIIL("stickpoint_download_alg", c13da.build());
    }

    public static void LIZLLL(boolean z, AVMusic aVMusic, Exception exc) {
        String path;
        String musicId;
        int i = !z ? 1 : 0;
        C543670LTx c543670LTx = new C543670LTx();
        String strLIZ = "";
        if (aVMusic == null) {
            path = "";
        } else {
            path = aVMusic.getPath();
        }
        c543670LTx.LIZ.put("url", path);
        if (aVMusic == null || (musicId = aVMusic.getMusicId()) == null) {
            musicId = "";
        }
        c543670LTx.LIZ.put("music_id", musicId);
        if (exc != null) {
            strLIZ = C1331420kke.LIZ(exc);
        }
        c543670LTx.LIZ.put("exception", strLIZ);
        C1637890six.LJ("stickpoint_download_music", i, c543670LTx.LJ());
    }

    public static void LIZIZ(Exception exc, String str, String str2, boolean z) {
        int i;
        String strLIZ;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("url", str);
        c543670LTx.LIZ.put("alg_type", str2);
        if (exc == null) {
            strLIZ = "";
        } else {
            strLIZ = C1331420kke.LIZ(exc);
        }
        c543670LTx.LIZ.put("exception", strLIZ);
        C1637890six.LJ("stickpoint_download_alg", i, c543670LTx.LJ());
    }

    public static void LIZJ(C1441170nbf c1441170nbf, boolean z, int i, int i2, String str, String str2, Exception exc, C1441180nbg c1441180nbg, int i3) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 16) != 0) {
            str2 = "";
        }
        if ((i3 & 32) != 0) {
            exc = null;
        }
        if ((i3 & 64) != 0) {
            c1441180nbg = null;
        }
        c1441170nbf.getClass();
        int i4 = !z ? 1 : 0;
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("error_code", Integer.valueOf(i2));
        c543670LTx.LIZ.put("type", Integer.valueOf(i));
        c543670LTx.LIZ.put("music_id", str);
        if (C123100dR.LIZ(str2)) {
            c543670LTx.LIZLLL("extra_msg", str2);
        }
        if (exc != null) {
            c543670LTx.LIZLLL("exception", C1331420kke.LIZ(exc));
        }
        if (c1441180nbg != null) {
            String str3 = c1441180nbg.LIZIZ;
            if (str3 != null) {
                c543670LTx.LIZLLL("music_path", str3);
            }
            Integer num = c1441180nbg.LIZJ;
            if (num != null) {
                c543670LTx.LIZIZ(Integer.valueOf(num.intValue()), "video_length");
            }
            VEAlgorithmPath vEAlgorithmPath = c1441180nbg.LIZLLL;
            if (vEAlgorithmPath != null) {
                c543670LTx.LIZLLL("veAlgorithmPath", vEAlgorithmPath.toString());
            }
            Integer num2 = c1441180nbg.LJ;
            if (num2 != null) {
                c543670LTx.LIZIZ(Integer.valueOf(num2.intValue()), "music_start");
            }
            Integer num3 = c1441180nbg.LJFF;
            if (num3 != null) {
                c543670LTx.LIZIZ(Integer.valueOf(num3.intValue()), "trim_out");
            }
            Integer num4 = c1441180nbg.LJI;
            if (num4 != null) {
                c543670LTx.LIZIZ(Integer.valueOf(num4.intValue()), "music_length");
            }
            String str4 = c1441180nbg.LJII;
            if (str4 != null) {
                c543670LTx.LIZLLL("sync_type", str4);
            }
            String str5 = c1441180nbg.LJIIIIZZ;
            if (str5 != null) {
                c543670LTx.LIZLLL("extra_info", str5);
            }
        }
        C1637890six.LJ("editor_pro_beat_error", i4, c543670LTx.LJ());
    }
}
