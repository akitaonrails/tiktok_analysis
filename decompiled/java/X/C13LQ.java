package X;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.13LQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13LQ extends C13DL {
    public static final <T> Iterable<T> LJIIJ(T[] tArr) {
        if (tArr.length == 0) {
            return C13BV.INSTANCE;
        }
        return new C20720089u(tArr);
    }

    public static final <T> Sequence<T> LJIIJJI(final T[] tArr) {
        if (tArr.length == 0) {
            return C09R4.LIZJ();
        }
        return new Sequence<T>() { // from class: X.08c5
            @Override // kotlin.sequences.Sequence
            public final Iterator<T> iterator() {
                return new C089E(tArr);
            }
        };
    }

    public static final double LJIIL(float[] fArr) {
        double d = 0.0d;
        int i = 0;
        for (float f : fArr) {
            d += (double) f;
            i++;
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / ((double) i);
    }

    public static final <T> List<T> LJIIZILJ(T[] tArr) {
        return C13LP.LLIIII(LJLIIIL(tArr));
    }

    public static final <T> List<T> LJIJI(T[] tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final float LJIJJ(float[] fArr) {
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[0];
    }

    public static final int LJIJJLI(int[] iArr) {
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[0];
    }

    public static final <T> T LJIL(T[] tArr) {
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    public static final Float LJJ(float[] fArr) {
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static final Integer LJJI(int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    public static final <T> T LJJIFFI(T[] tArr) {
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static String LJJIJL(char[] cArr) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (char c : cArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "\u2060");
            }
            sb.append(c);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final float LJJJI(float[] fArr) {
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[fArr.length - 1];
    }

    public static final <T> T LJJJIL(T[] tArr) {
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[tArr.length - 1];
    }

    public static final Integer LJJJJI(int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    public static final <T> T LJJJJIZL(T[] tArr) {
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    public static final Float LJJJJJ(float[] fArr) {
        int i = 1;
        if (fArr.length == 0) {
            return null;
        }
        float fMax = fArr[0];
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMax = Math.max(fMax, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fMax);
    }

    public static final Integer LJJJJJL(int[] iArr) {
        int i = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i];
                if (i2 < i3) {
                    i2 = i3;
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return Integer.valueOf(i2);
    }

    public static final float LJJJJL(float[] fArr) {
        int i = 1;
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fMax = fArr[0];
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMax = Math.max(fMax, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return fMax;
    }

    public static final int LJJJJLI(int[] iArr) {
        int i = 1;
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i2 = iArr[0];
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i];
                if (i2 < i3) {
                    i2 = i3;
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return i2;
    }

    public static final Integer LJJJJLL(int[] iArr) {
        int i = 1;
        if (iArr.length == 0) {
            return null;
        }
        int i2 = iArr[0];
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i];
                if (i2 > i3) {
                    i2 = i3;
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return Integer.valueOf(i2);
    }

    public static final float LJJJJZ(float[] fArr) {
        int i = 1;
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fMin = fArr[0];
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMin = Math.min(fMin, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return fMin;
    }

    public static final int LJJJJZI(int[] iArr) {
        int i = 1;
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i2 = iArr[0];
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i];
                if (i2 > i3) {
                    i2 = i3;
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return i2;
    }

    public static final <T> void LJJJLIIL(T[] tArr) {
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = tArr.length - 1;
        int i = 0;
        while (true) {
            T t = tArr[i];
            tArr[i] = tArr[length2];
            tArr[length2] = t;
            length2--;
            if (i != length) {
                i++;
            } else {
                return;
            }
        }
    }

    public static final <T> List<T> LJJJLL(T[] tArr) {
        if (tArr.length == 0) {
            return C13BV.INSTANCE;
        }
        List<T> listLJLI = LJLI(tArr);
        Collections.reverse(listLJLI);
        return listLJLI;
    }

    public static final <T> T[] LJJJLZIJ(T[] tArr) {
        int i = 0;
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), tArr.length));
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                tArr2[length - i] = tArr[i];
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return tArr2;
    }

    public static final int LJJLIIIJ(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    public static final <T> HashSet<T> LJJLIIIJLJLI(T[] tArr) {
        HashSet<T> hashSet = new HashSet<>(C2097908Jt.LIZIZ(tArr.length));
        LJJLIIIJL(hashSet, tArr);
        return hashSet;
    }

    public static final int[] LJJLIIIJLLLLLLLZ(Integer[] numArr) {
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public static final List<Byte> LJJLIIJ(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(bArr.length);
                for (byte b : bArr) {
                    arrayList.add(Byte.valueOf(b));
                }
                return arrayList;
            }
            return Collections.singletonList(Byte.valueOf(bArr[0]));
        }
        return C13BV.INSTANCE;
    }

    public static final List<Float> LJJLIL(float[] fArr) {
        int length = fArr.length;
        if (length != 0) {
            if (length != 1) {
                return LJJZZI(fArr);
            }
            return Collections.singletonList(Float.valueOf(fArr[0]));
        }
        return C13BV.INSTANCE;
    }

    public static final List<Integer> LJJLJ(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            if (length != 1) {
                return LJJZZIII(iArr);
            }
            return Collections.singletonList(Integer.valueOf(iArr[0]));
        }
        return C13BV.INSTANCE;
    }

    public static final List<Long> LJJLJLI(long[] jArr) {
        int length = jArr.length;
        if (length != 0) {
            if (length != 1) {
                return LJL(jArr);
            }
            return Collections.singletonList(Long.valueOf(jArr[0]));
        }
        return C13BV.INSTANCE;
    }

    public static final <T> List<T> LJJLL(T[] tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return LJLI(tArr);
            }
            return Collections.singletonList(tArr[0]);
        }
        return C13BV.INSTANCE;
    }

    public static final List<Boolean> LJJZ(boolean[] zArr) {
        int length = zArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(zArr.length);
                for (boolean z : zArr) {
                    arrayList.add(Boolean.valueOf(z));
                }
                return arrayList;
            }
            return Collections.singletonList(Boolean.valueOf(zArr[0]));
        }
        return C13BV.INSTANCE;
    }

    public static final List<Float> LJJZZI(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static final List<Integer> LJJZZIII(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static final List<Long> LJL(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static final <T> List<T> LJLI(T[] tArr) {
        return new ArrayList(new C089H(tArr, false));
    }

    public static final <T> Set<T> LJLIIIL(T[] tArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(C2097908Jt.LIZIZ(tArr.length));
        LJJLIIIJL(linkedHashSet, tArr);
        return linkedHashSet;
    }

    public static final <T> Set<T> LJLIIL(T[] tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(C2097908Jt.LIZIZ(tArr.length));
                LJJLIIIJL(linkedHashSet, tArr);
                return linkedHashSet;
            }
            return Collections.singleton(tArr[0]);
        }
        return C08CX.INSTANCE;
    }

    public static final boolean LJIILIIL(char c, char[] cArr) {
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (c == cArr[i]) {
                if (i < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIILJJIL(int i, int[] iArr) {
        if (LJJIJ(i, iArr) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILL(long j, long[] jArr) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                if (i < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIILLIIL(Object obj, Object[] objArr) {
        if (LJJIJIIJI(obj, objArr) >= 0) {
            return true;
        }
        return false;
    }

    public static final List LJIJ(int i, Object[] objArr) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int length = objArr.length - i;
            if (length >= 0 && length != 0) {
                int length2 = objArr.length;
                if (length >= length2) {
                    return LJJLL(objArr);
                }
                if (length == 1) {
                    return Collections.singletonList(objArr[length2 - 1]);
                }
                ArrayList arrayList = new ArrayList(length);
                for (int i2 = length2 - length; i2 < length2; i2++) {
                    arrayList.add(objArr[i2]);
                }
                return arrayList;
            }
            return C13BV.INSTANCE;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Requested element count ");
        sbLIZ.append(i);
        sbLIZ.append(" is less than zero.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final Boolean LJJII(int i, boolean[] zArr) {
        if (i >= 0 && i < zArr.length) {
            return Boolean.valueOf(zArr[i]);
        }
        return null;
    }

    public static final Float LJJIII(int i, float[] fArr) {
        if (i >= 0 && i < fArr.length) {
            return Float.valueOf(fArr[i]);
        }
        return null;
    }

    public static final Integer LJJIIJ(int i, int[] iArr) {
        if (i >= 0 && i < iArr.length) {
            return Integer.valueOf(iArr[i]);
        }
        return null;
    }

    public static final Long LJJIIJZLJL(int i, long[] jArr) {
        if (i >= 0 && i < jArr.length) {
            return Long.valueOf(jArr[i]);
        }
        return null;
    }

    public static final Object LJJIIZ(int i, Object[] objArr) {
        if (i >= 0 && i < objArr.length) {
            return objArr[i];
        }
        return null;
    }

    public static final int LJJIIZI(byte b, byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (b == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int LJJIJ(int i, int[] iArr) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static final int LJJIJIIJI(Object obj, Object[] objArr) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (Intrinsics.LJFF(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String LJJIZ(long[] jArr, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (long j : jArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) String.valueOf(j));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final int LJJJJ(Object obj, Object[] objArr) {
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (Intrinsics.LJFF(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public static final List<Byte> LJJJZ(byte[] bArr, IntRange intRange) {
        if (intRange.isEmpty()) {
            return C13BV.INSTANCE;
        }
        int iIntValue = intRange.getStart().intValue();
        int iIntValue2 = intRange.LJFF().intValue() + 1;
        C1691430u7J.LIZ(iIntValue2, bArr.length);
        return new C13E7(Arrays.copyOfRange(bArr, iIntValue, iIntValue2));
    }

    public static final <T> List<T> LJJL(T[] tArr, IntRange intRange) {
        if (intRange.isEmpty()) {
            return C13BV.INSTANCE;
        }
        int iIntValue = intRange.getStart().intValue();
        int iIntValue2 = intRange.LJFF().intValue() + 1;
        C1691430u7J.LIZ(iIntValue2, tArr.length);
        return Arrays.asList(Arrays.copyOfRange(tArr, iIntValue, iIntValue2));
    }

    public static final byte[] LJJLI(byte[] bArr, IntRange intRange) {
        if (intRange.isEmpty()) {
            return new byte[0];
        }
        int iIntValue = intRange.getStart().intValue();
        int iIntValue2 = intRange.LJFF().intValue() + 1;
        C1691430u7J.LIZ(iIntValue2, bArr.length);
        return Arrays.copyOfRange(bArr, iIntValue, iIntValue2);
    }

    public static final List LJJLIIIIJ(Comparator comparator, Object[] objArr) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        return Arrays.asList(objArr);
    }

    public static final List LJJLIIIJILLIZJL(int i, byte[] bArr) {
        if (i >= 0) {
            if (i == 0) {
                return C13BV.INSTANCE;
            }
            if (i >= bArr.length) {
                return LJJLIIJ(bArr);
            }
            if (i == 1) {
                return Collections.singletonList(Byte.valueOf(bArr[0]));
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (byte b : bArr) {
                arrayList.add(Byte.valueOf(b));
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Requested element count ");
        sbLIZ.append(i);
        sbLIZ.append(" is less than zero.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final List LJJLIIIJJI(int i, float[] fArr) {
        if (i >= 0) {
            if (i == 0) {
                return C13BV.INSTANCE;
            }
            if (i >= fArr.length) {
                return LJJLIL(fArr);
            }
            if (i == 1) {
                return Collections.singletonList(Float.valueOf(fArr[0]));
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (float f : fArr) {
                arrayList.add(Float.valueOf(f));
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Requested element count ");
        sbLIZ.append(i);
        sbLIZ.append(" is less than zero.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final List LJJLIIIJJIZ(int i, Object[] objArr) {
        if (i >= 0) {
            if (i == 0) {
                return C13BV.INSTANCE;
            }
            if (i >= objArr.length) {
                return LJJLL(objArr);
            }
            if (i == 1) {
                return Collections.singletonList(objArr[0]);
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (Object obj : objArr) {
                arrayList.add(obj);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Requested element count ");
        sbLIZ.append(i);
        sbLIZ.append(" is less than zero.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final void LJJLIIIJL(Collection collection, Object[] objArr) {
        for (Object obj : objArr) {
            collection.add(obj);
        }
    }

    public static final List<Pair<Integer, Integer>> LJLIL(int[] iArr, int[] iArr2) {
        int iMin = Math.min(iArr.length, iArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new Pair(Integer.valueOf(iArr[i]), Integer.valueOf(iArr2[i])));
        }
        return arrayList;
    }

    public static String LJJIJIL(byte[] bArr, CharSequence charSequence, Function1 function1) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            if (function1 != null) {
                sb.append((CharSequence) function1.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String LJJIJLIJ(float[] fArr, CharSequence charSequence, C256600yy c256600yy, int i) {
        CharSequence charSequence2;
        int i2;
        String str;
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        String str2 = "";
        if ((i & 2) != 0) {
            charSequence2 = "";
        } else {
            charSequence2 = null;
        }
        if ((i & 4) == 0) {
            str2 = null;
        }
        int i3 = 0;
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 16) != 0) {
            str = "...";
        } else {
            str = null;
        }
        if ((i & 32) != 0) {
            c256600yy = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int length = fArr.length;
        int i4 = 0;
        while (true) {
            if (i3 < length) {
                float f = fArr[i3];
                i4++;
                if (i4 > 1) {
                    sb.append(charSequence);
                }
                if (i2 >= 0 && i4 > i2) {
                    break;
                }
                if (c256600yy != null) {
                    sb.append((CharSequence) c256600yy.invoke(Float.valueOf(f)));
                } else {
                    sb.append((CharSequence) String.valueOf(f));
                }
                i3++;
            } else if (i2 >= 0 && i4 > i2) {
                break;
            }
        }
        sb.append((CharSequence) str);
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    public static String LJJIL(int[] iArr, CharSequence charSequence, Function1 function1, int i) {
        CharSequence charSequence2;
        int i2;
        String str;
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        String str2 = "";
        if ((i & 2) != 0) {
            charSequence2 = "";
        } else {
            charSequence2 = null;
        }
        if ((i & 4) == 0) {
            str2 = null;
        }
        int i3 = 0;
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 16) != 0) {
            str = "...";
        } else {
            str = null;
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            if (i3 < length) {
                int i5 = iArr[i3];
                i4++;
                if (i4 > 1) {
                    sb.append(charSequence);
                }
                if (i2 >= 0 && i4 > i2) {
                    break;
                }
                if (function1 != null) {
                    sb.append((CharSequence) function1.invoke(Integer.valueOf(i5)));
                } else {
                    sb.append((CharSequence) String.valueOf(i5));
                }
                i3++;
            } else if (i2 >= 0 && i4 > i2) {
                break;
            }
        }
        sb.append((CharSequence) str);
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    public static String LJJJ(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function1 function1, int i) {
        int i2;
        String str;
        CharSequence charSequence4 = charSequence2;
        CharSequence charSequence5 = charSequence;
        if ((i & 1) != 0) {
            charSequence5 = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i & 2) != 0) {
            charSequence4 = "";
        }
        if ((i & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        Function1 function12 = null;
        if ((i & 16) != 0) {
            str = "...";
        } else {
            str = null;
        }
        if ((i & 32) == 0) {
            function12 = function1;
        }
        StringBuilder sb = new StringBuilder();
        LJJIJIIJIL(objArr, sb, charSequence5, charSequence4, charSequence6, i2, str, function12);
        return sb.toString();
    }

    public static final void LJJIJIIJIL(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1) {
        StringBuilder sb = (StringBuilder) appendable;
        sb.append(charSequence2);
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < length) {
                Object obj = objArr[i2];
                i3++;
                if (i3 > 1) {
                    sb.append(charSequence);
                }
                if (i >= 0 && i3 > i) {
                    break;
                }
                C09RC.LIZIZ(appendable, obj, function1);
                i2++;
            } else if (i >= 0) {
                break;
            }
        }
        if (i3 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }
}
