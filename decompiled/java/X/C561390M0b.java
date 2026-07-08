package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561390M0b {
    public static Pair LIZ(Map map) {
        EnumC562200M3e enumC562200M3eLJ;
        C0M0Z c0m0z;
        Object obj = map.get("filter_type_file_size");
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(obj, bool)) {
            enumC562200M3eLJ = EnumC562200M3e.FREE_UP_SPACE;
        } else {
            enumC562200M3eLJ = C0M4D.LJ();
        }
        boolean zLJFF = Intrinsics.LJFF(map.get("filter_type_effect"), bool);
        boolean zLJFF2 = Intrinsics.LJFF(map.get("filter_type_template"), bool);
        HashMap map2 = new HashMap();
        if (zLJFF) {
            map2.put(EnumC561380M0a.EFFECT, C0M0Y.NOT_ZERO);
        }
        if (zLJFF2) {
            map2.put(EnumC561380M0a.TEMPLATE, C0M0Y.NOT_ZERO);
        }
        if (!map2.isEmpty()) {
            c0m0z = new C0M0Z(map2);
        } else {
            c0m0z = null;
        }
        return new Pair(enumC562200M3eLJ, c0m0z);
    }
}
