package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0kA0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1308700kA0<T> {
    public static final C1308800kAA LIZIZ = new AbstractC1308700kA0<Integer>() { // from class: X.0kAA
        @Override // X.AbstractC1308700kA0
        public final String LIZIZ() {
            return "integer";
        }

        @Override // X.AbstractC1308700kA0
        public final Integer LIZJ(String str) {
            int i;
            if (u.LJJIIJZLJL(str, "0x", false)) {
                String strSubstring = str.substring(2);
                CharsKt__CharJVMKt.checkRadix(16);
                i = CastIntegerProtector.parseInt(strSubstring, 16);
            } else {
                i = CastIntegerProtector.parseInt(str);
            }
            return Integer.valueOf(i);
        }

        @Override // X.AbstractC1308700kA0
        public final Integer LIZ(Bundle bundle, String str) {
            Object obj;
            try {
                obj = bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // X.AbstractC1308700kA0
        public final void LIZLLL(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    };
    public static final C1308790kA9 LIZJ = new AbstractC1308700kA0<Integer>() { // from class: X.0kA9
        @Override // X.AbstractC1308700kA0
        public final String LIZIZ() {
            return "reference";
        }

        @Override // X.AbstractC1308700kA0
        public final Integer LIZJ(String str) {
            int i;
            if (u.LJJIIJZLJL(str, "0x", false)) {
                String strSubstring = str.substring(2);
                CharsKt__CharJVMKt.checkRadix(16);
                i = CastIntegerProtector.parseInt(strSubstring, 16);
            } else {
                i = CastIntegerProtector.parseInt(str);
            }
            return Integer.valueOf(i);
        }

        @Override // X.AbstractC1308700kA0
        public final Integer LIZ(Bundle bundle, String str) {
            Object obj;
            try {
                obj = bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // X.AbstractC1308700kA0
        public final void LIZLLL(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    };
    public static final C1308690k9z LIZLLL = new AbstractC1308700kA0<int[]>() { // from class: X.0k9z
        @Override // X.AbstractC1308700kA0
        public final String LIZIZ() {
            return "integer[]";
        }

        @Override // X.AbstractC1308700kA0
        public final int[] LIZJ(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [int[], java.lang.Object] */
        @Override // X.AbstractC1308700kA0
        public final int[] LIZ(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }

        @Override // X.AbstractC1308700kA0
        public final void LIZLLL(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }
    };
    public static final C1308780kA8 LJ = new AbstractC1308700kA0<Long>() { // from class: X.0kA8
        @Override // X.AbstractC1308700kA0
        public final String LIZIZ() {
            return "long";
        }

        @Override // X.AbstractC1308700kA0
        public final Long LIZJ(String str) {
            String strSubstring;
            long j;
            if (u.LJIIZILJ(str, "L", false)) {
                strSubstring = str.substring(0, str.length() - 1);
            } else {
                strSubstring = str;
            }
            if (u.LJJIIJZLJL(str, "0x", false)) {
                String strSubstring2 = strSubstring.substring(2);
                CharsKt__CharJVMKt.checkRadix(16);
                j = CastLongProtector.parseLong(strSubstring2, 16);
            } else {
                j = CastLongProtector.parseLong(strSubstring);
            }
            return Long.valueOf(j);
        }

        @Override // X.AbstractC1308700kA0
        public final Long LIZ(Bundle bundle, String str) {
            Object obj;
            try {
                obj = bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
            if (obj != null) {
                return Long.valueOf(((Long) obj).longValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        @Override // X.AbstractC1308700kA0
        public final void LIZLLL(Bundle bundle, String str, Long l) {
            bundle.putLong(str, l.longValue());
        }
    };
    public static final C1308730kA3 LJFF = new AbstractC1308700kA0<long[]>() { // from class: X.0kA3
        @Override // X.AbstractC1308700kA0
        public final String LIZIZ() {
            return "long[]";
        }

        @Override // X.AbstractC1308700kA0
        public final long[] LIZJ(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, long[]] */
        @Override // X.AbstractC1308700kA0
        public final long[] LIZ(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }

        @Override // X.AbstractC1308700kA0
        public final void LIZLLL(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }
    };
    public static final C1308570k9n LJI = new AbstractC1308700kA0<Float>() { // from class: X.0k9n
        @Override // X.AbstractC1308700kA0
        public final String LIZIZ() {
            return "float";
        }

        @Override // X.AbstractC1308700kA0
        public final Float LIZJ(String str) {
            return Float.valueOf(CastFloatProtector.parseFloat(str));
        }

        @Override // X.AbstractC1308700kA0
        public final Float LIZ(Bundle bundle, String str) {
            Object obj;
            try {
                obj = bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
            if (obj != null) {
                return Float.valueOf(((Float) obj).floatValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        @Override // X.AbstractC1308700kA0
        public final void LIZLLL(Bundle bundle, String str, Float f) {
            bundle.putFloat(str, f.floatValue());
        }
    };
    public static final C1308660k9w LJII = new AbstractC1308700kA0<float[]>() { // from class: X.0k9w
        @Override // X.AbstractC1308700kA0
        public final String LIZIZ() {
            return "float[]";
        }

        @Override // X.AbstractC1308700kA0
        public final float[] LIZJ(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [float[], java.lang.Object] */
        @Override // X.AbstractC1308700kA0
        public final float[] LIZ(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }

        @Override // X.AbstractC1308700kA0
        public final void LIZLLL(Bundle bundle, String str, float[] fArr) {
            C786410Ut5.LJJIJIIJIL(bundle, str, fArr);
        }
    };
    public static final C1308580k9o LJIIIIZZ = new AbstractC1308700kA0<Boolean>() { // from class: X.0k9o
        @Override // X.AbstractC1308700kA0
        public final String LIZIZ() {
            return "boolean";
        }

        @Override // X.AbstractC1308700kA0
        public final Boolean LIZJ(String str) {
            boolean z;
            if (Intrinsics.LJFF(str, "true")) {
                z = true;
            } else if (Intrinsics.LJFF(str, "false")) {
                z = false;
            } else {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            return Boolean.valueOf(z);
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // X.AbstractC1308700kA0
        public final Boolean LIZ(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }

        @Override // X.AbstractC1308700kA0
        public final void LIZLLL(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    };
    public static final C1308670k9x LJIIIZ = new AbstractC1308700kA0<boolean[]>() { // from class: X.0k9x
        @Override // X.AbstractC1308700kA0
        public final String LIZIZ() {
            return "boolean[]";
        }

        @Override // X.AbstractC1308700kA0
        public final boolean[] LIZJ(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [boolean[], java.lang.Object] */
        @Override // X.AbstractC1308700kA0
        public final boolean[] LIZ(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }

        @Override // X.AbstractC1308700kA0
        public final void LIZLLL(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }
    };
    public static final C1308590k9p LJIIJ = new AbstractC1308700kA0<String>() { // from class: X.0k9p
        @Override // X.AbstractC1308700kA0
        public final String LIZIZ() {
            return "string";
        }

        @Override // X.AbstractC1308700kA0
        public final String LIZJ(String str) {
            return str;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.String] */
        @Override // X.AbstractC1308700kA0
        public final String LIZ(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }

        @Override // X.AbstractC1308700kA0
        public final void LIZLLL(Bundle bundle, String str, String str2) {
            C786410Ut5.LJJJI(str, str2, bundle);
        }
    };
    public static final C1308680k9y LJIIJJI = new AbstractC1308700kA0<String[]>() { // from class: X.0k9y
        @Override // X.AbstractC1308700kA0
        public final String LIZIZ() {
            return "string[]";
        }

        @Override // X.AbstractC1308700kA0
        public final String[] LIZJ(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.String[]] */
        @Override // X.AbstractC1308700kA0
        public final String[] LIZ(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }

        @Override // X.AbstractC1308700kA0
        public final void LIZLLL(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }
    };
    public final boolean LIZ;

    public abstract T LIZ(Bundle bundle, String str);

    public abstract String LIZIZ();

    public abstract T LIZJ(String str);

    public abstract void LIZLLL(Bundle bundle, String str, T t);

    public final String toString() {
        return LIZIZ();
    }

    public AbstractC1308700kA0(boolean z) {
        this.LIZ = z;
    }
}
