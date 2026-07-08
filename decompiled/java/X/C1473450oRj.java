package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0oRj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473450oRj {
    public static void LIZ(C1473440oRi c1473440oRi, int i) {
        String str;
        C1478040oZ8 c1478040oZ8 = C607330Nrv.LIZ;
        String thumbCacheDir = c1478040oZ8.LIZ().getThumbCacheDir(C1475000oUE.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(thumbCacheDir);
        sbLIZ.append("/");
        sbLIZ.append(LIZIZ(c1473440oRi, i));
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (i == 0) {
            str = c1473440oRi.LIZ;
        } else {
            str = (String) ListProtector.get(c1473440oRi.LIZIZ, i);
        }
        if (!c0vsj.exists()) {
            c1478040oZ8.LIZ().downloadFile(str, LIZIZ(c1473440oRi, i), c1478040oZ8.LIZ().getThumbCacheDir(C1475000oUE.LIZ), "legacy_video_thumb");
        }
    }

    public static String LIZIZ(C1473440oRi c1473440oRi, int i) {
        ArrayList<String> arrayList;
        if (i != 0 && (arrayList = c1473440oRi.LIZIZ) != null && arrayList.size() > 1 && i < c1473440oRi.LIZIZ.size()) {
            return String.valueOf(((String) ListProtector.get(c1473440oRi.LIZIZ, i)).hashCode());
        }
        return String.valueOf(c1473440oRi.LIZ.hashCode());
    }
}
