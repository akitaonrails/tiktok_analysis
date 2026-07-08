package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ZjP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907810ZjP {
    public static final C907810ZjP LIZ = new C907810ZjP();
    public static final boolean LIZIZ;
    public static final List<Regex> LIZJ;

    static {
        C0W8I.LIZ.getClass();
        LIZIZ = C0W8I.LIZIZ() || C0W8I.LIZJ();
        LIZJ = C1697810uHb.LJIIJJI(new Regex("\u2068"), new Regex("\u2069"));
    }

    public static String LIZJ(String str) {
        String strSubstring;
        StringBuilder sb = new StringBuilder();
        int iCodePointCount = str.codePointCount(0, str.length());
        int iMin = Math.min(5, iCodePointCount);
        for (int i = 0; i < iMin; i++) {
            try {
                strSubstring = str.substring(str.offsetByCodePoints(0, i), str.offsetByCodePoints(0, iCodePointCount));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                strSubstring = str;
            }
            sb.append(strSubstring);
            sb.append(' ');
        }
        return sb.toString();
    }

    public static String LIZLLL(String str) {
        if (str == null) {
            return "";
        }
        for (Regex regex : LIZJ) {
            if (str != null) {
                str = regex.replace(str, "");
            } else {
                str = null;
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static long LJ(C1240300iNg c1240300iNg) {
        String str = c1240300iNg.LJI;
        return CastLongProtector.parseLong(str.substring(0, a0.LJJIZ(str, '_', 0, false, 6)));
    }

    public static String LJFF(C1240300iNg c1240300iNg) {
        List listLJJLIIIJ = a0.LJJLIIIJ(c1240300iNg.LJI, new char[]{'_'}, false, 0, 6);
        if (listLJJLIIIJ.size() >= 3) {
            return (String) ListProtector.get(listLJJLIIIJ, 2);
        }
        return "";
    }

    public static boolean LJI(C1240300iNg c1240300iNg) {
        Integer numLJIIJJI;
        List listLJJLIIIJ = a0.LJJLIIIJ(c1240300iNg.LJI, new char[]{'_'}, false, 0, 6);
        if (listLJJLIIIJ.size() >= 4 && (numLJIIJJI = C2095008Iq.LJIIJJI((String) ListProtector.get(listLJJLIIIJ, 3))) != null && numLJIIJJI.intValue() == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x023f  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r31, kotlin.jvm.functions.Function0<? extends java.util.List<X.C907840ZjS>> r32, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r33, kotlin.jvm.functions.Function0<java.lang.String> r34, X.InterfaceC907650Zj9 r35, X.C1231704rr r36, X.C907790ZjN r37, kotlin.jvm.functions.Function1<? super java.util.List<X.C907840ZjS>, java.lang.String> r38, kotlin.jvm.functions.Function2<? super java.util.List<X.C907840ZjS>, ? super java.util.List<X.C907840ZjS>, ? extends kotlin.Pair<? extends java.util.List<X.C907840ZjS>, ? extends java.util.List<X.C907840ZjS>>> r39, boolean r40, X.InterfaceC1364105Vn<? super kotlin.Unit> r41) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C907810ZjP.LIZ(int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, X.0Zj9, X.04rr, X.0ZjN, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, boolean, X.05Vn):java.lang.Object");
    }
}
