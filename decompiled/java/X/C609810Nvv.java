package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;

/* JADX INFO: renamed from: X.0Nvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609810Nvv {
    public static final C609810Nvv LIZ = new C609810Nvv();

    public static void LIZ(Aweme aweme, Video video) {
        UrlModel originCover;
        if (AwemeExtKt.isPhotoMode(aweme) || !C2511709sp.LIZ || (originCover = video.getOriginCover()) == null || originCover.getUrlList().isEmpty()) {
            return;
        }
        Uri uri = UriProtector.parse((String) ListProtector.get(originCover.getUrlList(), 0));
        if (C1324840ka2.LJIIZILJ(uri)) {
            return;
        }
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
        if (C609820Nvw.LIZ) {
            c1325700kbQLIZLLL.LJI = EnumC1325560kbC.SMALL;
        }
        C1328130kfL.LJIILIIL().LJIIL().LJIJ(c1325700kbQLIZLLL.LIZ(), null);
    }
}
