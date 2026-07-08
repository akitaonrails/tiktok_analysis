package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09Hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2347109Hp {
    public static final C2347209Hq LIZ = new C2347209Hq();
    public static final Map<String, String> LIZIZ = new LinkedHashMap();
    public static CreativeInfo LIZJ;

    public static void LIZIZ(CreativeInfo creativeInfo, MvCreateVideoData mvCreateVideoData, Function0 function0) {
        LIZ.LIZIZ();
        int i = mvCreateVideoData.resFillMode;
        Pair pair = new Pair(Integer.valueOf(mvCreateVideoData.resDestWidth), Integer.valueOf(mvCreateVideoData.resDestHeight));
        if (!Intrinsics.LJFF(creativeInfo, LIZJ)) {
            LIZJ = creativeInfo;
            ((LinkedHashMap) LIZIZ).clear();
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2346709Hl(creativeInfo, mvCreateVideoData, i, pair, function0, null), 2);
    }

    public static String LIZ(String str, String str2, int i, Pair pair) {
        if (C2286708xd.LIZJ(str)) {
            Map<String, String> map = LIZIZ;
            if (map.containsKey(str)) {
                return (String) ((LinkedHashMap) map).get(str);
            }
            if (C1442700ne8.LIZ() == 2) {
                map.put(str, str);
                return str;
            }
            int[] iArrLIZJ = C2475309mx.LIZJ(str);
            if (iArrLIZJ == null) {
                return str;
            }
            if (iArrLIZJ[0] <= 1080 && iArrLIZJ[1] <= 1920 && C1442700ne8.LIZ() == 1) {
                map.put(str, str);
                return str;
            }
            if (!LIZJ(str, str2, ((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), i, Bitmap.CompressFormat.JPEG)) {
                return str;
            }
            map.put(str, str2);
            map.put(str2, str2);
            return str2;
        }
        return null;
    }

    public static boolean LIZJ(String str, String str2, int i, int i2, int i3, Bitmap.CompressFormat compressFormat) {
        Bitmap bitmapLJI;
        if (!C2286708xd.LIZJ(str) || (bitmapLJI = C2475309mx.LJI(i, i2, C2475309mx.LIZIZ(str), i3, str)) == null) {
            return false;
        }
        return C2475309mx.LJFF(100, compressFormat, bitmapLJI, new C0VSJ(str2));
    }
}
