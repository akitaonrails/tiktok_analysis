package X;

import Y.AObjectS109S0000000_3;
import Y.AObjectS347S0100000_3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.09RB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C09RB extends C09R6 {
    public static final <T> int LJFF(Sequence<? extends T> sequence) {
        Iterator<? extends T> it2 = sequence.iterator();
        int i = 0;
        while (it2.hasNext()) {
            it2.next();
            i++;
            if (i < 0) {
                C1697810uHb.LJIJ();
                throw null;
            }
        }
        return i;
    }

    public static final C08QP LJI(Sequence sequence) {
        return new C08QP(sequence, new AObjectS109S0000000_3(11));
    }

    public static final Sequence LJII(Sequence sequence) {
        if (sequence instanceof C09RA) {
            return ((C09RA) sequence).LIZ();
        }
        return new C09RI(sequence, 2);
    }

    public static final Object LJIIIIZZ(C08QU c08qu) {
        C08QT c08qt = new C08QT(c08qu);
        if (c08qt.hasNext()) {
            return c08qt.next();
        }
        return null;
    }

    public static final C08QU LJIIJJI(Sequence sequence) {
        return LJIIJ(sequence, new AObjectS109S0000000_3(9));
    }

    public static final <T> T LJIIL(Sequence<? extends T> sequence) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        return it2.next();
    }

    public static final <T> T LJIIZILJ(Sequence<? extends T> sequence) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (it2.hasNext()) {
            T next = it2.next();
            while (it2.hasNext()) {
                next = it2.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static final Object LJIJ(C09RD c09rd) {
        C09RE c09re = (C09RE) c09rd.iterator();
        if (!c09re.hasNext()) {
            return null;
        }
        Object next = c09re.next();
        while (c09re.hasNext()) {
            next = c09re.next();
        }
        return next;
    }

    public static final <T> HashSet<T> LJJIFFI(Sequence<? extends T> sequence) {
        HashSet<T> hashSet = new HashSet<>();
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next());
        }
        return hashSet;
    }

    public static final <T> List<T> LJJII(Sequence<? extends T> sequence) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return C13BV.INSTANCE;
        }
        T next = it2.next();
        if (!it2.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    public static final <T> List<T> LJJIII(Sequence<? extends T> sequence) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it2 = sequence.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    public static final <T> Set<T> LJJIIJ(Sequence<? extends T> sequence) {
        Iterator<? extends T> it2 = sequence.iterator();
        if (!it2.hasNext()) {
            return C08CX.INSTANCE;
        }
        T next = it2.next();
        if (!it2.hasNext()) {
            return Collections.singleton(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it2.hasNext()) {
            linkedHashSet.add(it2.next());
        }
        return linkedHashSet;
    }

    public static final C08QU LJIIIZ(Sequence sequence, Function1 function1) {
        return new C08QU(sequence, true, function1);
    }

    public static final C08QU LJIIJ(Sequence sequence, Function1 function1) {
        return new C08QU(sequence, false, function1);
    }

    public static final C197025126t LJIILIIL(Sequence sequence, Function1 function1) {
        return new C197025126t(sequence, function1, C1939507ij.LL);
    }

    public static final C197025126t LJIILJJIL(Sequence sequence, Function1 function1) {
        return new C197025126t(sequence, function1, C1939407ii.LL);
    }

    public static final <T> int LJIILL(Sequence<? extends T> sequence, T t) {
        int i = 0;
        for (T t2 : sequence) {
            if (i >= 0) {
                if (Intrinsics.LJFF(t, t2)) {
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

    public static final C08QU LJIJI(Sequence sequence, Function1 function1) {
        return LJIIJJI(new C08LY(sequence, function1));
    }

    public static final C08LY LJIJJ(Sequence sequence, Function1 function1) {
        return new C08LY(sequence, new AObjectS347S0100000_3(function1, 0));
    }

    public static final C197025126t LJIJJLI(C08QU c08qu, Object obj) {
        return C09R4.LIZLLL(C13LQ.LJIIJJI(new Sequence[]{c08qu, C13LQ.LJIIJJI(new Object[]{obj})}), new AObjectS109S0000000_3(7));
    }

    public static final C197025126t LJIL(Sequence sequence, Iterable iterable) {
        return C09R4.LIZLLL(C13LQ.LJIIJJI(new Sequence[]{sequence, new C1939607ik(iterable)}), new AObjectS109S0000000_3(7));
    }

    public static final C197025126t LJJ(Sequence sequence, Sequence sequence2) {
        return C09R4.LIZLLL(C13LQ.LJIIJJI(new Sequence[]{sequence, sequence2}), new AObjectS109S0000000_3(7));
    }

    public static final <T> Sequence<T> LJJI(Sequence<? extends T> sequence, int i) {
        if (i >= 0) {
            if (i == 0) {
                return C09R5.LIZ;
            }
            if (sequence instanceof C09RA) {
                return ((C09RA) sequence).LIZIZ(i);
            }
            return new C09RJ(sequence, i);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Requested element count ");
        sbLIZ.append(i);
        sbLIZ.append(" is less than zero.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static String LJIILLIIL(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function1 function1, int i) {
        int i2;
        String str;
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        if ((i & 2) != 0) {
            charSequence2 = "";
        }
        if ((i & 4) != 0) {
            charSequence3 = "";
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
        Iterator it2 = sequence.iterator();
        while (true) {
            if (it2.hasNext()) {
                Object next = it2.next();
                i3++;
                if (i3 > 1) {
                    sb.append(charSequence);
                }
                if (i2 >= 0 && i3 > i2) {
                    break;
                }
                C09RC.LIZIZ(sb, next, function1);
            } else if (i2 >= 0 && i3 > i2) {
                break;
            }
        }
        sb.append((CharSequence) str);
        sb.append(charSequence3);
        return sb.toString();
    }
}
