package X;

import Y.AComparatorS524S0100000_30;
import java.util.Comparator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13iQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20085613iQ {
    public static final <T extends Comparable<? super T>> Comparator<T> LIZLLL() {
        return C20085713iR.LL;
    }

    public static final <T extends Comparable<? super T>> Comparator<T> LJ() {
        return C20085813iS.LL;
    }

    public static final AComparatorS524S0100000_30 LIZ(Function1... function1Arr) {
        if (function1Arr.length > 0) {
            return new AComparatorS524S0100000_30(function1Arr, 6);
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final <T extends Comparable<?>> int LIZIZ(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static final <T> int LIZJ(T t, T t2, Function1<? super T, ? extends Comparable<?>>[] function1Arr) {
        for (Function1<? super T, ? extends Comparable<?>> function1 : function1Arr) {
            int iLIZIZ = LIZIZ(function1.invoke(t), function1.invoke(t2));
            if (iLIZIZ != 0) {
                return iLIZIZ;
            }
        }
        return 0;
    }
}
