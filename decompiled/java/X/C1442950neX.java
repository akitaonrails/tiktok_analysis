package X;

import android.graphics.BitmapFactory;
import com.aweme.storage.StorageCleanServiceImpl;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.vesdk.VEUtils;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0neX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442950neX {
    public static final C1442950neX LIZ = new C1442950neX();
    public static final boolean LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static final C01GW LJI;

    static {
        LIZIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_cache_optimize", true) > 0;
        LIZJ = StorageCleanServiceImpl.LIZJ().LIZ();
        LIZLLL = 540;
        LJ = -1L;
        LJFF = -1L;
        LJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(373));
    }

    public static long LIZ() {
        long j = 1024;
        return (((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJFF(C1BWL.LIZ()) / j) / j;
    }

    public static boolean LIZIZ(long j, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        VEUtils.VEVideoFileInfo videoFileInfo;
        boolean z5 = false;
        if (((Boolean) C0AS7.LIZ.getValue()).booleanValue() && (videoFileInfo = VEUtils.getVideoFileInfo(str)) != null && videoFileInfo.bHDR) {
            return false;
        }
        LJ = j;
        if (!LIZIZ || str.length() == 0) {
            return true;
        }
        if (!C2286708xd.LJIILL(str)) {
            VEUtils.VEVideoFileInfo videoFileInfo2 = VEUtils.getVideoFileInfo(str);
            if (videoFileInfo2 == null) {
                return true;
            }
            int i = videoFileInfo2.width;
            int i2 = videoFileInfo2.height;
            int i3 = LIZLLL;
            if (i >= i3 && i2 >= i3) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (j >= LIZJ) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 || !z4) {
                z5 = true;
            }
            return !z5;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i4 = options.outWidth;
        int i5 = options.outHeight;
        int i6 = LIZLLL;
        if (i4 >= i6 && i5 >= i6) {
            z = false;
        } else {
            z = true;
        }
        if (j >= LIZJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || !z2) {
            z5 = true;
        }
        return !z5;
    }
}
