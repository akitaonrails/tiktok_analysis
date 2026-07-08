package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0L22, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L22 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(192));
    public static final ConcurrentHashMap<String, C0L23> LIZIZ;

    static {
        LIZIZ = (C0C64.LJIILLIIL().LJIJ(31744, 0, "story_standalone_album_page_layout", true) == 1 || C433810Gzj.LIZ()) ? new ConcurrentHashMap<>() : null;
    }

    public static C0L23 LIZIZ(String str) {
        ConcurrentHashMap<String, C0L23> concurrentHashMap;
        if (str == null || (concurrentHashMap = LIZIZ) == null) {
            return null;
        }
        return concurrentHashMap.get(str);
    }

    public static Pair LIZ(MediaModel mediaModel, Bitmap bitmap) {
        C0L23 c0l23;
        ConcurrentHashMap<String, C0L23> concurrentHashMap = LIZIZ;
        if (concurrentHashMap != null && (c0l23 = concurrentHashMap.get(mediaModel.LJFF())) != null) {
            return c0l23.LIZJ;
        }
        Pair<Integer, Integer> pairLIZIZ = ((C0MOJ) LIZ.getValue()).LIZIZ(bitmap);
        if (concurrentHashMap == null) {
            return pairLIZIZ;
        }
        concurrentHashMap.put(mediaModel.LJFF(), new C0L23(bitmap.getWidth(), bitmap.getHeight(), pairLIZIZ));
        return pairLIZIZ;
    }

    public static C0L23 LIZJ(Bitmap bitmap, String str) {
        C0L23 c0l23 = new C0L23(bitmap.getWidth(), bitmap.getHeight(), ((C0MOJ) LIZ.getValue()).LIZIZ(bitmap));
        ConcurrentHashMap<String, C0L23> concurrentHashMap = LIZIZ;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, c0l23);
        }
        return c0l23;
    }
}
