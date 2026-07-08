package X;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.experiment.MusicName;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.FullSongDetail;
import com.ss.android.ugc.aweme.music.model.FullSongUrlStruct;
import com.ss.android.ugc.aweme.port.in.IMusicService;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0nHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428920nHu {
    public static final C1428920nHu LIZ = new C1428920nHu();

    public static long LIZIZ(long j) {
        if (j > 0) {
            return System.currentTimeMillis() - j;
        }
        return -1L;
    }

    public static boolean LIZJ(AVMusic aVMusic) {
        String strLJJLIIIJ;
        List<String> urlList;
        FullSongUrlStruct fullSongUrl;
        List<String> urlList2;
        FullSongUrlStruct fullSongUrl2;
        List<String> urlList3;
        List<String> urlList4;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isPrivateClipInFullSong: playerUrl = ");
        UrlModel playUrl = aVMusic.getPlayUrl();
        String strLJJLIIIJ2 = null;
        if (playUrl != null && (urlList4 = playUrl.getUrlList()) != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(urlList4, null, null, null, 0, null, null, 63);
        } else {
            strLJJLIIIJ = null;
        }
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append(", isFullSong = ");
        sbLIZ.append(aVMusic.getIsFullSong());
        sbLIZ.append(", fullSongUrl: ");
        FullSongDetail fullSongDetail = aVMusic.getFullSongDetail();
        if (fullSongDetail != null && (fullSongUrl2 = fullSongDetail.getFullSongUrl()) != null && (urlList3 = fullSongUrl2.getUrlList()) != null) {
            strLJJLIIIJ2 = C13LP.LJJLIIIJ(urlList3, null, null, null, 0, null, null, 63);
        }
        sbLIZ.append(strLJJLIIIJ2);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        UrlModel playUrl2 = aVMusic.getPlayUrl();
        if (playUrl2 != null && (urlList = playUrl2.getUrlList()) != null && !urlList.isEmpty()) {
            if (!aVMusic.getIsFullSong()) {
                return false;
            }
            FullSongDetail fullSongDetail2 = aVMusic.getFullSongDetail();
            if (fullSongDetail2 != null && (fullSongUrl = fullSongDetail2.getFullSongUrl()) != null && (urlList2 = fullSongUrl.getUrlList()) != null && !urlList2.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static AVMusic LIZ(Context context, String str, String str2, String str3) {
        String str4;
        int i;
        String string = str3;
        IMusicService iMusicService = (IMusicService) ServiceManager.get().getService(IMusicService.class);
        C0VSJ c0vsj = new C0VSJ(str);
        if (string == null) {
            if (context == null) {
                context = C0CHQ.LIZ;
            }
            Resources resources = context.getResources();
            MusicName musicName = (MusicName) C1428930nHv.LIZIZ.getValue();
            if (musicName != null) {
                str4 = musicName.titleName;
            } else {
                str4 = null;
            }
            if (u.LJIJI(str4, "autocut_recordScreen_soundPill_templateSound", false)) {
                i = 2131826933;
            } else if (u.LJIJI(str4, "autocut_recordScreen_soundPill_templateSound2", false)) {
                i = 2131826934;
            } else if (u.LJIJI(str4, "autocut_recordScreen_soundPill_templateSound3", false)) {
                i = 2131826935;
            } else {
                i = 2131839040;
            }
            string = resources.getString(i);
        }
        return new C15KP().apply(iMusicService.buildMusicModelFromFile(c0vsj, string, str2, false, true));
    }
}
