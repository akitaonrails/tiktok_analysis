package X;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0FV5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FV5 {
    public final LruCache<String, Bitmap> LIZ = new LruCache<>(LSPassThroughRecordSizeConfig.DEFAULT);
    public final List<String> LIZIZ = new ArrayList();
    public volatile boolean LIZJ = true;
}
