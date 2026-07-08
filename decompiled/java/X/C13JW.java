package X;

import Y.AObjectS373S0100000_30;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.13JW, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13JW implements C09RO {
    public static final C13JY LLILZIL;
    public final C09R0 LL;
    public final List<KTypeProjection> LLILLJJLI;
    public final C09RO LLILLL;
    public final int LLILZ;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.13JY] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LLILZIL = new Object(defaultConstructorMarker) { // from class: X.13JY
        };
    }

    public C13JW() {
        throw null;
    }

    @Override // X.C09RO
    public final boolean LIZ() {
        return (this.LLILZ & 1) != 0;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZJ(false));
        sbLIZ.append(" (Kotlin reflection is not available)");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C09RO
    public final C09R0 LJFF() {
        return this.LL;
    }

    @Override // X.C09RO
    public final List<KTypeProjection> LJII() {
        return this.LLILLJJLI;
    }

    public final String LIZJ(boolean z) {
        String string;
        String strLJJLIIIJ;
        C13IQ c13iq;
        Class clsLIZ;
        C09R0 c09r0 = this.LL;
        if ((c09r0 instanceof C13IQ) && (c13iq = (C13IQ) c09r0) != null && (clsLIZ = C09R7.LIZ(c13iq)) != null) {
            if ((this.LLILZ & 4) != 0) {
                string = "kotlin.Nothing";
            } else if (clsLIZ.isArray()) {
                if (Intrinsics.LJFF(clsLIZ, boolean[].class)) {
                    string = "kotlin.BooleanArray";
                } else if (Intrinsics.LJFF(clsLIZ, char[].class)) {
                    string = "kotlin.CharArray";
                } else if (Intrinsics.LJFF(clsLIZ, byte[].class)) {
                    string = "kotlin.ByteArray";
                } else if (Intrinsics.LJFF(clsLIZ, short[].class)) {
                    string = "kotlin.ShortArray";
                } else if (Intrinsics.LJFF(clsLIZ, int[].class)) {
                    string = "kotlin.IntArray";
                } else if (Intrinsics.LJFF(clsLIZ, float[].class)) {
                    string = "kotlin.FloatArray";
                } else if (Intrinsics.LJFF(clsLIZ, long[].class)) {
                    string = "kotlin.LongArray";
                } else if (Intrinsics.LJFF(clsLIZ, double[].class)) {
                    string = "kotlin.DoubleArray";
                } else {
                    string = "kotlin.Array";
                }
            } else if (z && clsLIZ.isPrimitive()) {
                string = C09R7.LIZIZ((C13IQ) this.LL).getName();
            } else {
                string = clsLIZ.getName();
            }
        } else {
            string = this.LL.toString();
        }
        String str = "";
        if (this.LLILLJJLI.isEmpty()) {
            strLJJLIIIJ = "";
        } else {
            strLJJLIIIJ = C13LP.LJJLIIIJ(this.LLILLJJLI, ", ", "<", ">", 0, null, new AObjectS373S0100000_30(this, 4), 24);
        }
        if (LIZ()) {
            str = "?";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C09RO c09ro = this.LLILLL;
        if (c09ro instanceof C13JW) {
            String strLIZJ = ((C13JW) c09ro).LIZJ(true);
            if (!Intrinsics.LJFF(strLIZJ, strLIZIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append('?');
                if (Intrinsics.LJFF(strLIZJ, C2188811AlT.LIZIZ(sbLIZ2))) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strLIZIZ);
                    sbLIZ3.append('!');
                    return C2188811AlT.LIZIZ(sbLIZ3);
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append('(');
                sbLIZ4.append(strLIZIZ);
                sbLIZ4.append("..");
                sbLIZ4.append(strLIZJ);
                sbLIZ4.append(')');
                return C2188811AlT.LIZIZ(sbLIZ4);
            }
            return strLIZIZ;
        }
        return strLIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13JW) {
            C13JW c13jw = (C13JW) obj;
            if (Intrinsics.LJFF(this.LL, c13jw.LL) && Intrinsics.LJFF(this.LLILLJJLI, c13jw.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c13jw.LLILLL) && this.LLILZ == c13jw.LLILZ) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C13JW(C09R0 c09r0, List<KTypeProjection> list, C09RO c09ro, int i) {
        this.LL = c09r0;
        this.LLILLJJLI = list;
        this.LLILLL = c09ro;
        this.LLILZ = i;
    }
}
