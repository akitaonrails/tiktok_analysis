package X;

import java.util.Map;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.00cH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C115900cH {
    public static Object LIZ(String str, Map map) {
        Object obj = map;
        for (Object obj2 : a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6)) {
            if (obj instanceof Map) {
                obj = ((Map) obj).get(obj2);
            } else {
                return null;
            }
        }
        return obj;
    }
}
