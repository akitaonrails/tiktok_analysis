package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0mbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402530mbL {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(List list) {
        if (list != null && list.contains(23333L)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(List list) {
        if (list != null && list.size() == 3 && (((Number) ListProtector.get(list, 2)).longValue() & 512) != 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(List list, List list2) {
        if (!LIZJ(list) && !LIZ(list2)) {
            return false;
        }
        return true;
    }
}
