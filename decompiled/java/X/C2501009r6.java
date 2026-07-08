package X;

import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.09r6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2501009r6 implements InterfaceC300801Eo {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<String> interfaceC2329309At) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC2329309At);
                break;
            case 1:
                subscribe$1(this, interfaceC2329309At);
                break;
        }
    }

    public C2501009r6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(C2501009r6 c2501009r6, InterfaceC2329309At interfaceC2329309At) {
        Video video;
        String str;
        VideoUrlModel playAddr;
        List<String> urlList;
        UrlModel playUrl;
        List<String> urlList2;
        C1376300lv2.LIZ.getClass();
        C01GW c01gw = C1376300lv2.LJIILL;
        C2354709Kn.LJFF((String) c01gw.getValue(), false);
        Music music = ((Aweme) c2501009r6.l0).getMusic();
        if ((music == null || (playUrl = music.getPlayUrl()) == null || (urlList2 = playUrl.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList2)) == null) && ((video = ((Aweme) c2501009r6.l0).getVideo()) == null || (playAddr = video.getPlayAddr()) == null || (urlList = playAddr.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null)) {
            str = "";
        }
        String strLIZJ = C08HM.LIZJ(str);
        AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        abstractC2199801B7qWith.LIZJ = strLIZJ;
        abstractC2199801B7qWith.LJ = (String) c01gw.getValue();
        abstractC2199801B7qWith.LJIIL = new C2499809qu((C11KT) interfaceC2329309At, 0);
        abstractC2199801B7qWith.LIZJ();
    }

    public static final void subscribe$1(C2501009r6 c2501009r6, InterfaceC2329309At interfaceC2329309At) {
        String str = (String) C13LP.LJJJJZ((CopyOnWriteArraySet) c2501009r6.l0);
        C23053091n.LIZ.getClass();
        interfaceC2329309At.onSuccess(((DetailFeedService) C23053091n.LIZJ.getValue()).LJIIJ(str, null));
    }
}
