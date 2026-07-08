package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.Config;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.12Di, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19719612Di extends C08XD {
    public static final <T> T LJJIIZ(List<T> list) {
        if (!list.isEmpty()) {
            return (T) ListProtector.remove(list, 0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T LJJIIZI(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return (T) ListProtector.remove(list, 0);
    }

    public static final <T> T LJJIJ(List<T> list) {
        if (!list.isEmpty()) {
            return (T) ListProtector.remove(list, list.size() - 1);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T LJJIJIIJI(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return (T) ListProtector.remove(list, list.size() - 1);
    }

    public static final void LJJI(Iterable iterable, Collection collection) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            collection.add(it2.next());
        }
    }

    public static final void LJJIFFI(Collection collection, Sequence sequence) {
        Iterator it2 = sequence.iterator();
        while (it2.hasNext()) {
            collection.add(it2.next());
        }
    }

    public static final void LJJII(Collection collection, Object[] objArr) {
        collection.addAll(Arrays.asList(objArr));
    }

    public static final void LJJIIJZLJL(List list, Function1 function1) {
        LJJIIJ(list, function1, true);
    }

    public static final <T> boolean LJJIII(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1, boolean z) {
        Iterator<? extends T> it2 = iterable.iterator();
        boolean z2 = false;
        while (it2.hasNext()) {
            if (function1.invoke(it2.next()).booleanValue() == z) {
                it2.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static final <T> boolean LJJIIJ(List<T> list, Function1<? super T, Boolean> function1, boolean z) {
        int i;
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof C03W4) && !(list instanceof InterfaceC19719712Dj)) {
                C19719512Dh.LJIIJ(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            return LJJIII(list, function1, z);
        }
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Config config = (Object) ListProtector.get(list, i2);
                if (function1.invoke(config).booleanValue() != z) {
                    if (i != i2) {
                        ListProtector.set(list, i, config);
                    }
                    i++;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int size2 = list.size() - 1;
        if (i > size2) {
            return true;
        }
        while (true) {
            ListProtector.remove(list, size2);
            if (size2 != i) {
                size2--;
            } else {
                return true;
            }
        }
    }
}
