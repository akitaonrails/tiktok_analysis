package X;

import android.graphics.fonts.FontVariationAxis;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0uGU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697120uGU {
    public static final ConcurrentHashMap<String, FontVariationAxis> LIZ = new ConcurrentHashMap<>();
    public static boolean LIZIZ;

    public static FontVariationAxis LIZ(float f, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(f);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<String, FontVariationAxis> concurrentHashMap = LIZ;
        FontVariationAxis fontVariationAxis = concurrentHashMap.get(strLIZIZ);
        if (fontVariationAxis == null) {
            FontVariationAxis fontVariationAxis2 = new FontVariationAxis(str, f);
            concurrentHashMap.put(strLIZIZ, fontVariationAxis2);
            return fontVariationAxis2;
        }
        return fontVariationAxis;
    }
}
