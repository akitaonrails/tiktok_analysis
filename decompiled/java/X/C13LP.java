package X;

import Y.AObjectS401S0100000_27;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.13LP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13LP extends C13EQ {
    public static final double LJJIL(Iterable<Double> iterable) {
        Iterator<Double> it2 = iterable.iterator();
        double dDoubleValue = 0.0d;
        int i = 0;
        while (it2.hasNext()) {
            dDoubleValue += it2.next().doubleValue();
            i++;
            if (i < 0) {
                C1697810uHb.LJIJ();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i);
    }

    public static final double LJJIZ(Iterable<Float> iterable) {
        Iterator<Float> it2 = iterable.iterator();
        double dFloatValue = 0.0d;
        int i = 0;
        while (it2.hasNext()) {
            dFloatValue += (double) it2.next().floatValue();
            i++;
            if (i < 0) {
                C1697810uHb.LJIJ();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i);
    }

    public static final double LJJJ(Iterable<Integer> iterable) {
        Iterator it2 = ((ArrayList) iterable).iterator();
        double dIntValue = 0.0d;
        int i = 0;
        while (it2.hasNext()) {
            dIntValue += (double) ((Number) it2.next()).intValue();
            i++;
            if (i < 0) {
                C1697810uHb.LJIJ();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i);
    }

    public static final double LJJJI(Iterable<Long> iterable) {
        Iterator<Long> it2 = iterable.iterator();
        double dLongValue = 0.0d;
        int i = 0;
        while (it2.hasNext()) {
            dLongValue += it2.next().longValue();
            i++;
            if (i < 0) {
                C1697810uHb.LJIJ();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i);
    }

    public static final <T> List<T> LJJJJI(Iterable<? extends T> iterable) {
        return LLIIII(LLIIIZ(iterable));
    }

    public static final <T> List<T> LJJJJLI(Iterable<? extends T> iterable) {
        ArrayList arrayList = new ArrayList();
        LJJJJLL(iterable, arrayList);
        return arrayList;
    }

    public static final <T> T LJJJJZ(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            return (T) LJJJJZI((List) iterable);
        }
        Iterator<? extends T> it2 = iterable.iterator();
        if (it2.hasNext()) {
            return it2.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T LJJJJZI(List<? extends T> list) {
        if (!list.isEmpty()) {
            return (T) ListProtector.get(list, 0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T LJJJLIIL(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) ListProtector.get(list, 0);
        }
        Iterator<? extends T> it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        return it2.next();
    }

    public static final <T> T LJJJLL(List<? extends T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return (T) ListProtector.get(list, 0);
    }

    public static final <T> T LJJLIIIJILLIZJL(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            return (T) LJJLIIIJJI((List) iterable);
        }
        Iterator<? extends T> it2 = iterable.iterator();
        if (it2.hasNext()) {
            T next = it2.next();
            while (it2.hasNext()) {
                next = it2.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T LJJLIIIJJI(List<? extends T> list) {
        if (!list.isEmpty()) {
            return (T) ListProtector.get(list, list.size() - 1);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T LJJLIIIJJIZ(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) ListProtector.get(list, list.size() - 1);
        }
        Iterator<? extends T> it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        T next = it2.next();
        while (it2.hasNext()) {
            next = it2.next();
        }
        return next;
    }

    public static final <T> T LJJLIIIJL(List<? extends T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return (T) ListProtector.get(list, list.size() - 1);
    }

    public static final <T extends Comparable<? super T>> T LJJLIIIJLJLI(Iterable<? extends T> iterable) {
        Iterator<? extends T> it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        T next = it2.next();
        while (it2.hasNext()) {
            T next2 = it2.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final Double LJJLIIIJLLLLLLLZ(Iterable<Double> iterable) {
        Iterator<Double> it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        double dDoubleValue = it2.next().doubleValue();
        while (it2.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it2.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final Float LJJLIIJ(Iterable<Float> iterable) {
        Iterator<Float> it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        float fFloatValue = it2.next().floatValue();
        while (it2.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it2.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static final double LJJLIL(Iterable<Double> iterable) {
        Iterator it2 = ((ArrayList) iterable).iterator();
        if (it2.hasNext()) {
            double dDoubleValue = ((Number) it2.next()).doubleValue();
            while (it2.hasNext()) {
                dDoubleValue = Math.max(dDoubleValue, ((Number) it2.next()).doubleValue());
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    public static final <T extends Comparable<? super T>> T LJJLJ(Iterable<? extends T> iterable) {
        Iterator<? extends T> it2 = iterable.iterator();
        if (it2.hasNext()) {
            T next = it2.next();
            while (it2.hasNext()) {
                T next2 = it2.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    public static final <T extends Comparable<? super T>> T LJJLL(Iterable<? extends T> iterable) {
        Iterator<? extends T> it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        T next = it2.next();
        while (it2.hasNext()) {
            T next2 = it2.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final Double LJJZ(Iterable<Double> iterable) {
        Iterator it2 = ((ArrayList) iterable).iterator();
        if (!it2.hasNext()) {
            return null;
        }
        double dDoubleValue = ((Number) it2.next()).doubleValue();
        while (it2.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, ((Number) it2.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final double LJJZZI(Iterable<Double> iterable) {
        Iterator it2 = ((ArrayList) iterable).iterator();
        if (it2.hasNext()) {
            double dDoubleValue = ((Number) it2.next()).doubleValue();
            while (it2.hasNext()) {
                dDoubleValue = Math.min(dDoubleValue, ((Number) it2.next()).doubleValue());
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    public static final <T extends Comparable<? super T>> T LJJZZIII(Iterable<? extends T> iterable) {
        Iterator<? extends T> it2 = iterable.iterator();
        if (it2.hasNext()) {
            T next = it2.next();
            while (it2.hasNext()) {
                T next2 = it2.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    public static final <T> List<T> LJLJJLL(Iterable<? extends T> iterable) {
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return LLIIII(iterable);
        }
        List<T> listLLIIIJ = LLIIIJ(iterable);
        Collections.reverse(listLLIIIJ);
        return listLLIIIJ;
    }

    public static final <T> T LJLJL(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            return (T) LJLJLJ((List) iterable);
        }
        Iterator<? extends T> it2 = iterable.iterator();
        if (it2.hasNext()) {
            T next = it2.next();
            if (!it2.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T LJLJLJ(List<? extends T> list) {
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return (T) ListProtector.get(list, 0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T LJLJLLL(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() != 1) {
                return null;
            }
            return (T) ListProtector.get(list, 0);
        }
        Iterator<? extends T> it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        T next = it2.next();
        if (it2.hasNext()) {
            return null;
        }
        return next;
    }

    public static final <T> T LJLL(List<? extends T> list) {
        if (list.size() == 1) {
            return (T) ListProtector.get(list, 0);
        }
        return null;
    }

    public static final <T extends Comparable<? super T>> List<T> LJLLJ(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return LLIIII(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            return Arrays.asList(array);
        }
        List<T> listLLIIIJ = LLIIIJ(iterable);
        C08XD.LJIL(listLLIIIJ);
        return listLLIIIJ;
    }

    public static final <T extends Comparable<? super T>> List<T> LJLLL(Iterable<? extends T> iterable) {
        return LJLLLL(C20085613iQ.LJ(), iterable);
    }

    public static final double LJLZ(Iterable<Double> iterable) {
        Iterator<Double> it2 = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it2.hasNext()) {
            dDoubleValue += it2.next().doubleValue();
        }
        return dDoubleValue;
    }

    public static final float LJZ(Iterable<Float> iterable) {
        Iterator<Float> it2 = iterable.iterator();
        float fFloatValue = 0.0f;
        while (it2.hasNext()) {
            fFloatValue += it2.next().floatValue();
        }
        return fFloatValue;
    }

    public static final int LJZI(Iterable<Integer> iterable) {
        Iterator<Integer> it2 = iterable.iterator();
        int iIntValue = 0;
        while (it2.hasNext()) {
            iIntValue += it2.next().intValue();
        }
        return iIntValue;
    }

    public static final long LJZL(Iterable<Long> iterable) {
        Iterator<Long> it2 = iterable.iterator();
        long jLongValue = 0;
        while (it2.hasNext()) {
            jLongValue += it2.next().longValue();
        }
        return jLongValue;
    }

    public static final boolean[] LLF(Collection<Boolean> collection) {
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            zArr[i] = it2.next().booleanValue();
            i++;
        }
        return zArr;
    }

    public static final byte[] LLFF(Collection<Byte> collection) {
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            bArr[i] = it2.next().byteValue();
            i++;
        }
        return bArr;
    }

    public static final char[] LLFFF(Collection<Character> collection) {
        ArrayList arrayList = (ArrayList) collection;
        char[] cArr = new char[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            cArr[i] = ((Character) it2.next()).charValue();
            i++;
        }
        return cArr;
    }

    public static final double[] LLFZ(Collection<Double> collection) {
        ArrayList arrayList = (ArrayList) collection;
        double[] dArr = new double[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            dArr[i] = ((Number) it2.next()).doubleValue();
            i++;
        }
        return dArr;
    }

    public static final float[] LLI(Collection<Float> collection) {
        float[] fArr = new float[collection.size()];
        Iterator<Float> it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            fArr[i] = it2.next().floatValue();
            i++;
        }
        return fArr;
    }

    public static final <T> HashSet<T> LLIFFJFJJ(Iterable<? extends T> iterable) {
        HashSet<T> hashSet = new HashSet<>(C2097908Jt.LIZIZ(C15438062q.LJIJJ(iterable, 12)));
        LLFII(iterable, hashSet);
        return hashSet;
    }

    public static final int[] LLII(Collection<Integer> collection) {
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            iArr[i] = it2.next().intValue();
            i++;
        }
        return iArr;
    }

    public static final <T> List<T> LLIIII(Iterable<? extends T> iterable) {
        Object next;
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                if (iterable instanceof List) {
                    next = ListProtector.get((List) iterable, 0);
                } else {
                    next = collection.iterator().next();
                }
                return Collections.singletonList(next);
            }
            return C13BV.INSTANCE;
        }
        return C1697810uHb.LJIILL(LLIIIJ(iterable));
    }

    public static final long[] LLIIIILZ(Collection<Long> collection) {
        long[] jArr = new long[collection.size()];
        Iterator<Long> it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            jArr[i] = it2.next().longValue();
            i++;
        }
        return jArr;
    }

    public static final <T> List<T> LLIIIJ(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        LLFII(iterable, arrayList);
        return arrayList;
    }

    public static final <T> List<T> LLIIIL(Collection<? extends T> collection) {
        return new ArrayList(collection);
    }

    public static final <T> Set<T> LLIIIZ(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LLFII(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static final <T> Set<T> LLIIJI(Iterable<? extends T> iterable) {
        Object next;
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(C2097908Jt.LIZIZ(collection.size()));
                    LLFII(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ListProtector.get((List) iterable, 0);
                } else {
                    next = collection.iterator().next();
                }
                return Collections.singleton(next);
            }
            return C08CX.INSTANCE;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LLFII(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 == 1) {
                return Collections.singleton(linkedHashSet2.iterator().next());
            }
            return linkedHashSet2;
        }
        return C08CX.INSTANCE;
    }

    public static final C717620SCy LLIIL(Iterable iterable) {
        return new C717620SCy(new AObjectS401S0100000_27(iterable, 2));
    }

    public static final <T> List<List<T>> LJJJIL(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        Iterator itLIZ;
        int i2;
        C00Y9.LIZ(i, i);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i3 = size / i;
            if (size % i == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            arrayList = new ArrayList(i3 + i2);
            int i4 = 0;
            while (i4 < size) {
                int i5 = size - i4;
                if (i <= i5) {
                    i5 = i;
                }
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    arrayList2.add(ListProtector.get(list, i6 + i4));
                }
                arrayList.add(arrayList2);
                i4 += i;
                if (i4 < 0) {
                    break;
                }
            }
        } else {
            arrayList = new ArrayList();
            Iterator<? extends T> it2 = iterable.iterator();
            if (!it2.hasNext()) {
                itLIZ = C08CY.LL;
            } else {
                itLIZ = C2152108bv.LIZ(new C2254008sM(i, i, it2, false, true, null));
            }
            while (itLIZ.hasNext()) {
                arrayList.add(itLIZ.next());
            }
        }
        return arrayList;
    }

    public static final boolean LJJJJ(Object obj, Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (LJJJZ(obj, iterable) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> List<T> LJJJJIZL(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        int i2 = 0;
        if (i >= 0) {
            if (i == 0) {
                return LLIIII(iterable);
            }
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size() - i;
                if (size <= 0) {
                    return C13BV.INSTANCE;
                }
                if (size == 1) {
                    return Collections.singletonList(LJJLIIIJILLIZJL(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        List list = (List) iterable;
                        int size2 = list.size();
                        while (i < size2) {
                            arrayList.add(ListProtector.get(list, i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (T t : iterable) {
                if (i2 >= i) {
                    arrayList.add(t);
                } else {
                    i2++;
                }
            }
            return C1697810uHb.LJIILL(arrayList);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Requested element count ");
        sbLIZ.append(i);
        sbLIZ.append(" is less than zero.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final List LJJJJJ(int i, List list) {
        int i2 = 0;
        if (i >= 0) {
            int size = list.size() - i;
            if (size >= 0) {
                i2 = size;
            }
            return LL(list, i2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Requested element count ");
        sbLIZ.append(i);
        sbLIZ.append(" is less than zero.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final <T> T LJJJJJL(Iterable<? extends T> iterable, final int i) {
        if (iterable instanceof List) {
            return (T) ListProtector.get((List) iterable, i);
        }
        Function1 function1 = new Function1() { // from class: X.08Lf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                ((Integer) obj).intValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Collection doesn't contain element at index ");
                sbLIZ.append(i2);
                sbLIZ.append('.');
                throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        int i2 = 0;
        if (i < 0) {
            return (T) function1.invoke(Integer.valueOf(i));
        }
        for (T t : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return t;
            }
            i2 = i3;
        }
        return (T) function1.invoke(Integer.valueOf(i));
    }

    public static final <T> T LJJJJL(Iterable<? extends T> iterable, int i) {
        if (iterable instanceof List) {
            return (T) LJJJLZIJ(i, (List) iterable);
        }
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (T t : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return t;
            }
            i2 = i3;
        }
        return null;
    }

    public static final void LJJJJLL(Iterable iterable, Collection collection) {
        for (Object obj : iterable) {
            if (obj != null) {
                collection.add(obj);
            }
        }
    }

    public static final Object LJJJLZIJ(int i, List list) {
        if (i >= 0 && i < list.size()) {
            return ListProtector.get(list, i);
        }
        return null;
    }

    public static final int LJJJZ(Object obj, Iterable iterable) {
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i >= 0) {
                if (Intrinsics.LJFF(obj, obj2)) {
                    return i;
                }
                i++;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return -1;
    }

    public static final <T> Set<T> LJJL(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Collection<?> collectionLLIIII;
        Set<T> setLLIIIZ = LLIIIZ(iterable);
        if (iterable2 instanceof Collection) {
            collectionLLIIII = (Collection) iterable2;
        } else {
            collectionLLIIII = LLIIII(iterable2);
        }
        setLLIIIZ.retainAll(collectionLLIIII);
        return setLLIIIZ;
    }

    public static final Object LJJLJLI(Comparator comparator, Iterable iterable) {
        Iterator it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final Object LJL(Comparator comparator, Iterable iterable) {
        Iterator it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T> List<T> LJLI(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Collection collectionLLIIII;
        if (iterable2 instanceof Collection) {
            collectionLLIIII = (Collection) iterable2;
        } else {
            collectionLLIIII = LLIIII(iterable2);
        }
        if (collectionLLIIII.isEmpty()) {
            return LLIIII(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!collectionLLIIII.contains(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final List LJLIIIL(Object obj, Iterable iterable) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            if (!z && Intrinsics.LJFF(obj2, obj)) {
                z = true;
            } else {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> LJLIIL(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        if (iterable instanceof Collection) {
            return LJLIL(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        C19719612Di.LJJI(iterable, arrayList);
        C19719612Di.LJJI(iterable2, arrayList);
        return arrayList;
    }

    public static final List LJLIL(Iterable iterable, Collection collection) {
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C19719612Di.LJJI(iterable, arrayList2);
        return arrayList2;
    }

    public static final List LJLILLLLZI(Object obj, Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final <T> List<T> LJLJI(Collection<? extends T> collection, T[] tArr) {
        ArrayList arrayList = new ArrayList(collection.size() + tArr.length);
        arrayList.addAll(collection);
        C19719612Di.LJJII(arrayList, tArr);
        return arrayList;
    }

    public static final Object LJLJJI(Collection collection, C19994913Lf c19994913Lf) {
        if (!collection.isEmpty()) {
            return LJJJJJL(collection, c19994913Lf.nextInt(collection.size()));
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Object LJLJJL(Collection collection, C19994913Lf c19994913Lf) {
        if (collection.isEmpty()) {
            return null;
        }
        return LJJJJJL(collection, c19994913Lf.nextInt(collection.size()));
    }

    public static final List LJLLI(Iterable iterable, List list) {
        int iLJIJJ = C15438062q.LJIJJ(iterable, 10);
        if (iLJIJJ == 0) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(iLJIJJ);
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(ListProtector.get(list, ((Number) it2.next()).intValue()));
        }
        return arrayList;
    }

    public static final <T> List<T> LJLLILLLL(List<? extends T> list, IntRange intRange) {
        if (intRange.isEmpty()) {
            return C13BV.INSTANCE;
        }
        return LLIIII(list.subList(intRange.getStart().intValue(), intRange.LJFF().intValue() + 1));
    }

    public static final List LJLLLL(Comparator comparator, Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return LLIIII(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            return Arrays.asList(array);
        }
        List listLLIIIJ = LLIIIJ(iterable);
        C08XD.LJJ(listLLIIIJ, comparator);
        return listLLIIIJ;
    }

    public static final <T> Set<T> LJLLLLLL(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Collection<?> collectionLLIIII;
        Set<T> setLLIIIZ = LLIIIZ(iterable);
        if (iterable2 instanceof Collection) {
            collectionLLIIII = (Collection) iterable2;
        } else {
            collectionLLIIII = LLIIII(iterable2);
        }
        setLLIIIZ.removeAll(collectionLLIIII);
        return setLLIIIZ;
    }

    public static final <T> List<T> LL(Iterable<? extends T> iterable, int i) {
        int i2 = 0;
        if (i >= 0) {
            if (i == 0) {
                return C13BV.INSTANCE;
            }
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return LLIIII(iterable);
                }
                if (i == 1) {
                    return Collections.singletonList(LJJJJZ(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            Iterator<? extends T> it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return C1697810uHb.LJIILL(arrayList);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Requested element count ");
        sbLIZ.append(i);
        sbLIZ.append(" is less than zero.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final List LLD(int i, List list) {
        if (i >= 0) {
            if (i == 0) {
                return C13BV.INSTANCE;
            }
            int size = list.size();
            if (i >= size) {
                return LLIIII(list);
            }
            if (i == 1) {
                return Collections.singletonList(LJJLIIIJJI(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(ListProtector.get(list, i2));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
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

    public static final void LLFII(Iterable iterable, Collection collection) {
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            collection.add(it2.next());
        }
    }

    public static final <T> Set<T> LLIIJLIL(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Set<T> setLLIIIZ = LLIIIZ(iterable);
        C19719612Di.LJJI(iterable2, setLLIIIZ);
        return setLLIIIZ;
    }

    public static final <T, R> List<Pair<T, R>> LLIILII(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        Iterator<? extends T> it2 = iterable.iterator();
        Iterator<? extends R> it3 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C15438062q.LJIJJ(iterable, 10), C15438062q.LJIJJ(iterable2, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            arrayList.add(new Pair(it2.next(), it3.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ void LJJLIIIIJ(Iterable iterable, Appendable appendable, CharSequence charSequence, AwS391S0200000_25 awS391S0200000_25, int i) {
        CharSequence charSequence2;
        int i2;
        String str;
        CharSequence charSequence3 = charSequence;
        if ((i & 2) != 0) {
            charSequence3 = ", ";
        }
        AwS391S0200000_25 awS391S0200000_252 = null;
        String str2 = "";
        if ((i & 4) != 0) {
            charSequence2 = "";
        } else {
            charSequence2 = null;
        }
        if ((i & 8) == 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            str = "...";
        } else {
            str = null;
        }
        if ((i & 64) == 0) {
            awS391S0200000_252 = awS391S0200000_25;
        }
        LJJLI(iterable, appendable, charSequence3, charSequence2, str2, i2, str, awS391S0200000_252);
    }

    public static final void LJJLI(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1) {
        StringBuilder sb = (StringBuilder) appendable;
        sb.append(charSequence2);
        Iterator it2 = iterable.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                Object next = it2.next();
                i2++;
                if (i2 > 1) {
                    sb.append(charSequence);
                }
                if (i >= 0 && i2 > i) {
                    break;
                } else {
                    C09RC.LIZIZ(appendable, next, function1);
                }
            } else if (i >= 0) {
                break;
            }
        }
        if (i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String LJJLIIIJ(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2) {
        CharSequence charSequence5 = charSequence4;
        int i3 = i;
        CharSequence charSequence6 = charSequence2;
        Function1 function12 = function1;
        CharSequence charSequence7 = charSequence;
        if ((i2 & 1) != 0) {
            charSequence7 = ", ";
        }
        CharSequence charSequence8 = "";
        if ((i2 & 2) != 0) {
            charSequence6 = "";
        }
        if ((i2 & 4) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i3 = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence5 = "...";
        }
        if ((i2 & 32) != 0) {
            function12 = null;
        }
        StringBuilder sb = new StringBuilder();
        LJJLI(iterable, sb, charSequence7, charSequence6, charSequence8, i3, charSequence5, function12);
        return sb.toString();
    }
}
