package X;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.08m5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2215108m5 {
    public final List<InterfaceC2214908m3> LIZ = new LinkedList();

    public static C2215208m6 LIZJ(File file) {
        if (file instanceof C2215208m6) {
            return (C2215208m6) file;
        }
        return new C2215208m6(file.getPath());
    }

    public final String LIZ(String str) {
        if (str == null) {
            return str;
        }
        C2214808m2 c2214808m2 = new C2214808m2(str);
        return new C2215008m4(this.LIZ, 0, c2214808m2).LIZ(c2214808m2).LIZ;
    }

    public final String LIZIZ(String str, String str2) {
        if (str2 == null) {
            return str2;
        }
        if (str != null && !str.isEmpty()) {
            if (!str2.isEmpty() && !str2.equals("/")) {
                if (str2.charAt(0) == '/' && str.equals("/")) {
                    return LIZ(str2);
                }
                C2214808m2 c2214808m2 = new C2214808m2(str, str2);
                return new C2215008m4(this.LIZ, 0, c2214808m2).LIZ(c2214808m2).LIZ;
            }
            return LIZ(str);
        }
        return LIZ(str2);
    }
}
