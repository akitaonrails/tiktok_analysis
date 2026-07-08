package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13BK, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13BK extends C1691430u7J {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean LIZIZ(T[] tArr, T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            Object[] objArr = tArr[i];
            Object[] objArr2 = tArr2[i];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!LIZIZ(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else {
                    long[] jArr = null;
                    byte[] bArr = null;
                    short[] sArr = null;
                    int[] iArr = null;
                    if ((objArr instanceof C13BI) && (objArr2 instanceof C13BI)) {
                        byte[] bArr2 = ((C13BI) objArr).LL;
                        byte[] bArr3 = ((C13BI) objArr2).LL;
                        if (bArr2 == null) {
                            bArr2 = null;
                        }
                        if (bArr3 != null) {
                            bArr = bArr3;
                        }
                        if (!Arrays.equals(bArr2, bArr)) {
                            return false;
                        }
                    } else if ((objArr instanceof C13B4) && (objArr2 instanceof C13B4)) {
                        short[] sArr2 = ((C13B4) objArr).LL;
                        short[] sArr3 = ((C13B4) objArr2).LL;
                        if (sArr2 == null) {
                            sArr2 = null;
                        }
                        if (sArr3 != null) {
                            sArr = sArr3;
                        }
                        if (!Arrays.equals(sArr2, sArr)) {
                            return false;
                        }
                    } else if ((objArr instanceof C13BN) && (objArr2 instanceof C13BN)) {
                        int[] iArr2 = ((C13BN) objArr).LL;
                        int[] iArr3 = ((C13BN) objArr2).LL;
                        if (iArr2 == null) {
                            iArr2 = null;
                        }
                        if (iArr3 != null) {
                            iArr = iArr3;
                        }
                        if (!Arrays.equals(iArr2, iArr)) {
                            return false;
                        }
                    } else if ((objArr instanceof C13BL) && (objArr2 instanceof C13BL)) {
                        long[] jArr2 = ((C13BL) objArr).LL;
                        long[] jArr3 = ((C13BL) objArr2).LL;
                        if (jArr2 == null) {
                            jArr2 = null;
                        }
                        if (jArr3 != null) {
                            jArr = jArr3;
                        }
                        if (!Arrays.equals(jArr2, jArr)) {
                            return false;
                        }
                    } else if (!Intrinsics.LJFF(objArr, objArr2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void LIZJ(T[] tArr, StringBuilder sb, List<Object[]> list) {
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        String strLJJLIIIJ3;
        String strLJJLIIIJ4;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        arrayList.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            Object[] objArr = tArr[i];
            String str = "null";
            if (objArr == 0) {
                sb.append("null");
            } else if (objArr instanceof Object[]) {
                LIZJ(objArr, sb, list);
            } else if (objArr instanceof byte[]) {
                sb.append(Arrays.toString((byte[]) objArr));
            } else if (objArr instanceof short[]) {
                sb.append(Arrays.toString((short[]) objArr));
            } else if (objArr instanceof int[]) {
                sb.append(Arrays.toString((int[]) objArr));
            } else if (objArr instanceof long[]) {
                sb.append(Arrays.toString((long[]) objArr));
            } else if (objArr instanceof float[]) {
                sb.append(Arrays.toString((float[]) objArr));
            } else if (objArr instanceof double[]) {
                sb.append(Arrays.toString((double[]) objArr));
            } else if (objArr instanceof char[]) {
                sb.append(Arrays.toString((char[]) objArr));
            } else if (objArr instanceof boolean[]) {
                sb.append(Arrays.toString((boolean[]) objArr));
            } else if (objArr instanceof C13BI) {
                byte[] bArr = ((C13BI) objArr).LL;
                if (bArr != null && (strLJJLIIIJ4 = C13LP.LJJLIIIJ(new C13BI(bArr), ", ", e3.e, e3.f, 0, null, null, 56)) != null) {
                    str = strLJJLIIIJ4;
                }
                sb.append(str);
            } else if (objArr instanceof C13B4) {
                short[] sArr = ((C13B4) objArr).LL;
                if (sArr != null && (strLJJLIIIJ3 = C13LP.LJJLIIIJ(new C13B4(sArr), ", ", e3.e, e3.f, 0, null, null, 56)) != null) {
                    str = strLJJLIIIJ3;
                }
                sb.append(str);
            } else if (objArr instanceof C13BN) {
                int[] iArr = ((C13BN) objArr).LL;
                if (iArr != null && (strLJJLIIIJ2 = C13LP.LJJLIIIJ(new C13BN(iArr), ", ", e3.e, e3.f, 0, null, null, 56)) != null) {
                    str = strLJJLIIIJ2;
                }
                sb.append(str);
            } else if (objArr instanceof C13BL) {
                long[] jArr = ((C13BL) objArr).LL;
                if (jArr != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(new C13BL(jArr), ", ", e3.e, e3.f, 0, null, null, 56)) != null) {
                    str = strLJJLIIIJ;
                }
                sb.append(str);
            } else {
                sb.append(objArr.toString());
            }
        }
        sb.append(']');
        ListProtector.remove(list, arrayList.size() - 1);
    }
}
