package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.07lI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1955407lI {
    public static final Object LIZ(String str) {
        if (str == null) {
            return null;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{";"}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() != 2) {
            return null;
        }
        String str2 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
        int iHashCode = str2.hashCode();
        if (iHashCode != -122791161) {
            if (iHashCode != 19587023) {
                if (iHashCode != 549229096 || !str2.equals("__st_bool")) {
                    return null;
                }
                Object obj = ListProtector.get(listLJJLIIIJILLIZJL, 1);
                if (Intrinsics.LJFF(obj, "true")) {
                    return Boolean.TRUE;
                }
                if (!Intrinsics.LJFF(obj, "false")) {
                    return null;
                }
                return Boolean.FALSE;
            }
            if (!str2.equals("__st_string")) {
                return null;
            }
            return ListProtector.get(listLJJLIIIJILLIZJL, 1);
        }
        if (!str2.equals("__st_number")) {
            return null;
        }
        return C2327809Ae.LJII((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
    }

    public static final String LIZIZ(Object obj) {
        if (obj instanceof String) {
            return Intrinsics.LJIIJJI(obj, "__st_string;");
        }
        if (obj instanceof Number) {
            return Intrinsics.LJIIJJI(obj, "__st_number;");
        }
        if (obj instanceof Boolean) {
            return Intrinsics.LJIIJJI(obj, "__st_bool;");
        }
        return "";
    }

    public static final String LIZJ(String str) {
        return u.LJJIFFI(str, e3.d, "_", false);
    }

    public static final String LIZLLL(Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.getClass().getSimpleName().toUpperCase(Locale.ROOT));
        sbLIZ.append('_');
        sbLIZ.append(System.identityHashCode(obj));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
