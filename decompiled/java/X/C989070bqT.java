package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bqT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989070bqT {
    public static final C1001870cB7 LIZ = new C1001870cB7();
    public static String LIZIZ = "";

    public static C989060bqS LIZ(String str) {
        if (str == null) {
            return null;
        }
        return (C989060bqS) LIZ.get(str);
    }

    public static String LIZIZ(String str) {
        char c;
        if (str != null && str.length() != 0) {
            C989060bqS c989060bqS = (C989060bqS) LIZ.get(str);
            if (c989060bqS == null) {
                return EnumC992050bvH.DEFAULT.getStr();
            }
            String str2 = c989060bqS.LIZ.getStr();
            if (Intrinsics.LJFF(str2, EnumC992050bvH.PREFETCH_DONE_BUT_FAIL.getStr())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append('_');
                sbLIZ.append(c989060bqS.LIZLLL);
                str2 = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (c989060bqS.LIZIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append(" redirect_scene_");
                if (c989060bqS.LJ) {
                    c = '2';
                } else {
                    c = '1';
                }
                sbLIZ2.append(c);
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
            return str2;
        }
        return EnumC992050bvH.DEFAULT.getStr();
    }

    public static void LIZJ(String str, EnumC992050bvH enumC992050bvH, String str2) {
        C1001870cB7 c1001870cB7 = LIZ;
        C989060bqS c989060bqS = (C989060bqS) c1001870cB7.get(str);
        if (c989060bqS != null) {
            c989060bqS.LIZ = enumC992050bvH;
            if (str2 != null) {
                c989060bqS.LIZLLL = str2;
                return;
            }
            return;
        }
        c1001870cB7.put(str, new C989060bqS(enumC992050bvH, str2));
    }
}
