package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0N6M, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N6M {
    public final C0N6L LIZ;
    public final List<Aweme> LIZIZ;

    public final List<String> LIZ() {
        UrlModel cover;
        List<String> urlList;
        Object objLJJJLL;
        List list = this.LIZIZ;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Video video = ((Aweme) it2.next()).getVideo();
            if (video != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null) {
                arrayList.add(objLJJJLL);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0N6M(String str, C0N6L c0n6l, List<? extends Aweme> list) {
        this.LIZ = c0n6l;
        this.LIZIZ = list;
    }
}
