package X;

import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.List;
import wh6.AbS330S0300000_18;

/* JADX INFO: renamed from: X.0gZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1170800gZa {
    public final SmartImageView LIZ;
    public final Aweme LIZIZ;
    public final /* synthetic */ C1171250gaJ LIZJ;

    public final void LIZ() {
        String str;
        UrlModel cover;
        List<String> urlList;
        Video video = this.LIZIZ.getVideo();
        if (video == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
            str = "";
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(this.LIZ);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        if (((Number) C295040BhO.LIZ.getValue()).intValue() != 2 || C0BLA.LIZ()) {
            return;
        }
        SmartImageView smartImageView = this.LIZ;
        C1171250gaJ c1171250gaJ = this.LIZJ;
        C786410Ut5.I7(new AbS330S0300000_18(c1171250gaJ, this, c1171250gaJ.LLJILJILJ, 0), smartImageView);
    }

    public C1170800gZa(C1171250gaJ c1171250gaJ, SmartImageView smartImageView, Aweme aweme) {
        this.LIZJ = c1171250gaJ;
        this.LIZ = smartImageView;
        this.LIZIZ = aweme;
    }
}
