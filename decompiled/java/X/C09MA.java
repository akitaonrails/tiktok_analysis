package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BigThumb;

/* JADX INFO: renamed from: X.09MA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C09MA {
    public Aweme LIZ;
    public final ImageView LIZIZ;
    public Bitmap LIZJ;

    public final boolean LIZ() {
        Aweme aweme = this.LIZ;
        if (aweme == null || aweme.getVideo() == null || aweme.getVideo().getBigThumbs() == null || aweme.getVideo().getBigThumbs().size() <= 0) {
            return false;
        }
        for (BigThumb bigThumb : aweme.getVideo().getBigThumbs()) {
            if (bigThumb.imgUrls.isEmpty() || bigThumb.imgUris.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public C09MA(Aweme aweme, ImageView imageView) {
        this.LIZ = aweme;
        this.LIZIZ = imageView;
    }
}
