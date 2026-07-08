package X;

import android.os.Looper;
import com.ss.android.ugc.aweme.ecommerce.image.EcomImgPreloadKeepOptData;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CVi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C314720CVi {
    public static final ConcurrentHashMap<String, C314730CVj> LIZ = new ConcurrentHashMap<>();
    public static final boolean LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;

    static {
        new HashSet();
        EcomImgPreloadKeepOptData ecomImgPreloadKeepOptData = C314740CVk.LIZ;
        LIZIZ = ecomImgPreloadKeepOptData.enablePreloadKeep;
        LIZJ = ecomImgPreloadKeepOptData.delayReleaseTime;
        LIZLLL = ecomImgPreloadKeepOptData.trackKeepCount;
    }

    public static final void LIZIZ(Object obj) {
        if (LIZIZ && (obj instanceof C1324660kZk)) {
            C1324660kZk c1324660kZk = (C1324660kZk) obj;
            if (LIZ.containsKey(c1324660kZk.toString())) {
                if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                    C23250099c.LIZLLL(C817503Hh.LL, null, null, new C313960CSk("", obj, null), 3);
                } else {
                    LIZ(c1324660kZk.toString(), false);
                }
            }
        }
    }

    public static void LIZ(Object obj, boolean z) {
        C09AE c09ae;
        C314730CVj c314730CVjRemove = LIZ.remove(obj.toString());
        if (c314730CVjRemove != null) {
            c314730CVjRemove.LIZ.close();
            if (!z && (c09ae = c314730CVjRemove.LIZIZ) != null) {
                c09ae.LIZIZ(null);
            }
        }
    }
}
