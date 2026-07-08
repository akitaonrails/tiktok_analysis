package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ksc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531320Ksc {
    public static final Map<String, Boolean> LIZ = new LinkedHashMap();

    public static boolean LIZIZ(String str, boolean z) {
        boolean zLIZJ;
        if (str != null) {
            if (z) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
                Object objValueOf = linkedHashMap.get(str);
                if (objValueOf == null) {
                    objValueOf = Boolean.valueOf(C2286708xd.LIZJ(str));
                    linkedHashMap.put(str, objValueOf);
                }
                zLIZJ = ((Boolean) objValueOf).booleanValue();
            } else {
                zLIZJ = C2286708xd.LIZJ(str);
                LIZ.put(str, Boolean.valueOf(zLIZJ));
            }
            if (zLIZJ) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZ(final String str, boolean z, final Function1 function1) {
        if (str != null) {
            if (z) {
                Map<String, Boolean> map = LIZ;
                if (map.containsKey(str)) {
                    function1.invoke(Boolean.valueOf(Intrinsics.LJFF(((LinkedHashMap) map).get(str), Boolean.TRUE)));
                    return;
                }
            }
            C2286708xd.LIZIZ(new InterfaceC2286808xe() { // from class: X.0Ksd
                @Override // X.InterfaceC2286808xe
                public final void LIZ(Object obj) {
                    if (!(obj instanceof Boolean)) {
                        obj = null;
                    }
                    boolean zLJFF = Intrinsics.LJFF(obj, Boolean.TRUE);
                    C531320Ksc.LIZ.put(str, Boolean.valueOf(zLJFF));
                    function1.invoke(Boolean.valueOf(zLJFF));
                }
            }, str, true);
            return;
        }
        function1.invoke(Boolean.FALSE);
    }
}
