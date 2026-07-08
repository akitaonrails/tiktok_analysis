package X;

import android.graphics.drawable.Drawable;
import android.util.LruCache;

/* JADX INFO: renamed from: X.0SlQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730700SlQ {
    public static final LruCache<String, Drawable> LIZ = new LruCache<>(20);

    static {
        new LruCache(20);
    }
}
