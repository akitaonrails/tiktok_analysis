package X;

import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0L3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536810L3n {
    public static WeakReference<CutsameDataItem> LIZ;
    public static WeakReference<ShortVideoContext> LIZIZ;
    public static String LIZJ;

    public static ShortVideoContext LIZ() {
        WeakReference<ShortVideoContext> weakReference = LIZIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static CutsameDataItem LIZIZ() {
        WeakReference<CutsameDataItem> weakReference = LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
