package X;

import android.graphics.fonts.FontVariationAxis;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0uF1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696210uF1 {
    public static final ConcurrentHashMap<String, FontVariationAxis> LIZ = new ConcurrentHashMap<>();

    public static final void LIZJ(C13DR c13dr) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = AbstractC19973513Cz.class.getDeclaredField("LIZ");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(c13dr);
        Field declaredField2 = obj.getClass().getDeclaredField("current$delegate");
        declaredField2.setAccessible(true);
        ((C01GW) declaredField2.get(obj)).getValue();
    }

    public static final FontVariationAxis LIZIZ(float f, String str) {
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

    public static final C1695870uET LIZ(long j, C1680190tpB c1680190tpB, float f, float f2, int i) {
        return new C1695870uET(j, c1680190tpB, f, f2, i);
    }
}
