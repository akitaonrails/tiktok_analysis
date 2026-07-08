package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0wA1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1769990wA1 extends C1545130qJL {
    public static final C1769990wA1 LIZ = new C1769990wA1();
    public static final EnumC1544180qHo LIZIZ;

    static {
        EnumC1544180qHo enumC1544180qHoLIZ;
        String str = C1769870w9p.LIZ().defaultThread;
        if (str == null || (enumC1544180qHoLIZ = C1544290qHz.LIZ(str)) == null) {
            enumC1544180qHoLIZ = EnumC1544180qHo.NORMAL_THREAD;
        }
        LIZIZ = enumC1544180qHoLIZ;
    }

    @Override // X.C1545130qJL
    public final EnumC1544180qHo LIZ(String str) {
        String str2 = C1769870w9p.LIZ().threadTypes.get(str);
        if (str2 != null) {
            return C1544290qHz.LIZ(str2);
        }
        C2281611ESh.LIZ.getClass();
        EnumC1544180qHo enumC1544180qHo = (EnumC1544180qHo) ((LinkedHashMap) C2281611ESh.LIZIZ).get(str);
        if (enumC1544180qHo != null) {
            return enumC1544180qHo;
        }
        return LIZIZ;
    }
}
