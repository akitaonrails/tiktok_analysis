package X;

import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import java.util.List;

/* JADX INFO: renamed from: X.0yP9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856250yP9 {
    public static final C1331670kl3 LIZ(BaseImage baseImage) {
        String str;
        List<String> list = null;
        if (baseImage != null) {
            str = baseImage.imageId;
            list = baseImage.urlList;
        } else {
            str = null;
        }
        return C1331660kl2.LJIIIIZZ(new ImageUrlModel(str, list));
    }
}
