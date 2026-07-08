package X;

import android.net.Uri;
import com.bytedance.lynx.hybrid.i18n.SparkI18nManager;

/* JADX INFO: renamed from: X.0qC3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1540610qC3 {
    public final SparkI18nManager.Meta LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final Uri LIZLLL;

    public C1540610qC3(SparkI18nManager.Meta meta, String str, boolean z, Uri uri) {
        this.LIZ = meta;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = uri;
    }

    public /* synthetic */ C1540610qC3(SparkI18nManager.Meta meta, String str, boolean z, Uri uri, int i) {
        this(meta, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? Uri.EMPTY : uri);
    }
}
