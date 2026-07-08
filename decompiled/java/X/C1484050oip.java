package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0oip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484050oip {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(33));

    public final InterfaceC1483670oiD LIZ() {
        return (InterfaceC1483670oiD) this.LIZ.getValue();
    }

    public final void LIZIZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMuteStatus mute = ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        if (z == LIZ().LJIIIZ().isMute()) {
            return;
        }
        if (z) {
            LIZ().LJIILIIL().mute();
        } else {
            LIZ().LJIILIIL().unmute();
        }
    }

    public final void LIZJ(Aweme aweme) {
        Music music;
        String idStr;
        UrlModel playUrl;
        List<String> urlList;
        if (aweme != null && !LIZ().getPlayState().isPlaying() && !LIZ().getPlayState().isLoading() && (music = aweme.getMusic()) != null && (idStr = music.getIdStr()) != null && (playUrl = music.getPlayUrl()) != null && (urlList = playUrl.getUrlList()) != null) {
            SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
            VideoUrlModel videoUrlModel = new VideoUrlModel();
            videoUrlModel.setUrlKey(idStr);
            videoUrlModel.setSourceId(idStr);
            videoUrlModel.setUrlList(urlList);
            simVideoUrlModel.origin = videoUrlModel;
            simVideoUrlModel.setUrlKey(idStr);
            simVideoUrlModel.setSourceId(idStr);
            simVideoUrlModel.setUrlList(urlList);
            C1479530obX c1479530obX = new C1479530obX();
            c1479530obX.LJII = simVideoUrlModel;
            c1479530obX.LJJJLL = false;
            c1479530obX.LJIILLIIL = true;
            c1479530obX.LJIL = false;
            LIZ().LJJJJJL(c1479530obX);
            int i = C2510609se.LIZ;
        }
    }
}
