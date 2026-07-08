package X;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0FFb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386930FFb {
    public final LruCache<String, Bitmap> LIZ;
    public final List<String> LIZIZ;
    public volatile boolean LIZJ;

    public C386930FFb() {
        this(LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public C386930FFb(int i) {
        this.LIZ = new LruCache<>(i);
        this.LIZIZ = new ArrayList();
        this.LIZJ = true;
    }
}
