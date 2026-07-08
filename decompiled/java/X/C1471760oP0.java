package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: X.0oP0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471760oP0 {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ = System.currentTimeMillis();
    public final int LIZLLL;
    public Map<String, String> LJ;

    public final void LIZ(String str, String str2) {
        if (this.LJ == null) {
            this.LJ = new HashMap();
        }
        ((HashMap) this.LJ).put(str, str2);
    }

    public C1471760oP0(String str, String str2, int i) {
        this.LIZIZ = str;
        this.LIZ = str2;
        this.LIZLLL = i;
    }

    public static C1471760oP0 LIZIZ(String str, EnumC1474430oTJ enumC1474430oTJ, int i) {
        if (i >= 6 && ((HashSet) C1471770oP1.LIZ).contains(enumC1474430oTJ)) {
            return new C1471760oP0(str, enumC1474430oTJ.name(), i);
        }
        return null;
    }
}
