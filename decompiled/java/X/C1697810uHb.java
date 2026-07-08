package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0uHb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1697810uHb extends C1697820uHc {
    public static final void LJIJ() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void LJIJI() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final C13BV LJIIIIZZ() {
        return C13BV.INSTANCE;
    }

    public static final <T> ArrayList<T> LJ(T... tArr) {
        if (tArr.length == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(new C089H(tArr, true));
    }

    public static final IntRange LJIIIZ(Collection<?> collection) {
        return new IntRange(0, collection.size() - 1);
    }

    public static final <T> int LJIIJ(List<? extends T> list) {
        return list.size() - 1;
    }

    public static final <T> List<T> LJIIJJI(T... tArr) {
        if (tArr.length > 0) {
            return Arrays.asList(tArr);
        }
        return C13BV.INSTANCE;
    }

    public static final <T> List<T> LJIIL(T t) {
        if (t != null) {
            return Collections.singletonList(t);
        }
        return C13BV.INSTANCE;
    }

    public static final <T> List<T> LJIILJJIL(T... tArr) {
        if (tArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C089H(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> LJIILL(List<? extends T> list) {
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return Collections.singletonList(ListProtector.get(list, 0));
            }
            return list;
        }
        return C13BV.INSTANCE;
    }

    public static int LJI(List list, Comparable comparable) {
        int size = list.size();
        int i = 0;
        LJIILLIIL(list.size(), 0, size);
        int i2 = size - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            int iLIZIZ = C20085613iQ.LIZIZ((Comparable) ListProtector.get(list, i3), comparable);
            if (iLIZIZ < 0) {
                i = i3 + 1;
            } else if (iLIZIZ > 0) {
                i2 = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i + 1);
    }

    public static int LJII(List list, Function1 function1) {
        int size = list.size();
        int i = 0;
        LJIILLIIL(list.size(), 0, size);
        int i2 = size - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            int iIntValue = ((Number) function1.invoke(ListProtector.get(list, i3))).intValue();
            if (iIntValue < 0) {
                i = i3 + 1;
            } else if (iIntValue > 0) {
                i2 = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i + 1);
    }

    public static final <T> List<T> LJIIZILJ(Iterable<? extends T> iterable, AbstractC19994813Le abstractC19994813Le) {
        List<T> listLLIIIJ = C13LP.LLIIIJ(iterable);
        int size = ((ArrayList) listLLIIIJ).size();
        while (true) {
            size--;
            if (size > 0) {
                int iNextInt = abstractC19994813Le.nextInt(size + 1);
                ListProtector.set(listLLIIIJ, iNextInt, ListProtector.set(listLLIIIJ, size, ListProtector.get(listLLIIIJ, iNextInt)));
            } else {
                return listLLIIIJ;
            }
        }
    }

    public static final void LJIILLIIL(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 >= 0) {
                if (i3 <= i) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("toIndex (");
                sbLIZ.append(i3);
                sbLIZ.append(") is greater than size (");
                sbLIZ.append(i);
                sbLIZ.append(").");
                throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fromIndex (");
            sbLIZ2.append(i2);
            sbLIZ2.append(") is less than zero.");
            throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("fromIndex (");
        sbLIZ3.append(i2);
        sbLIZ3.append(") is greater than toIndex (");
        sbLIZ3.append(i3);
        sbLIZ3.append(").");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static final <T> int LJFF(List<? extends T> list, T t, Comparator<? super T> comparator, int i, int i2) {
        LJIILLIIL(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iCompare = comparator.compare((Object) ListProtector.get(list, i4), t);
            if (iCompare < 0) {
                i = i4 + 1;
            } else if (iCompare > 0) {
                i3 = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i + 1);
    }
}
