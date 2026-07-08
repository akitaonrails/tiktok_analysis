package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.00sZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C216900sZ {
    public static String LIZIZ(List list) {
        if (list == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(e3.e);
        for (int i = 0; i < list.size(); i++) {
            sb.append(ListProtector.get(list, i));
            if (i != list.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(e3.f);
        return sb.toString();
    }

    public static boolean LIZ(String str, String str2) {
        if (str != null) {
            return str.equalsIgnoreCase(str2);
        }
        return false;
    }
}
