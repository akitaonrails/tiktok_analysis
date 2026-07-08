package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.wallpaper.IWallpaperServiceApi;

/* JADX INFO: renamed from: X.09cw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2413209cw {
    public static final C2413209cw LIZ = new C2413209cw();

    public static IWallpaperServiceApi LIZ() {
        C842910X4v c842910X4v = C842910X4v.LIZ;
        c842910X4v.getClass();
        if (C842910X4v.LIZ()) {
            return (IWallpaperServiceApi) PluggableExtentionKt.pluggableSpi$default(IWallpaperServiceApi.class, false, false, false, 14, null);
        }
        c842910X4v.LIZIZ();
        return null;
    }
}
