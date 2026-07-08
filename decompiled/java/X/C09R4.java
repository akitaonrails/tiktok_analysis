package X;

import Y.AObjectS109S0000000_3;
import Y.AObjectS379S0100000_3;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.09R4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C09R4 extends C2152208bw {
    public static final <T> Sequence<T> LIZJ() {
        return C09R5.LIZ;
    }

    public static final <T> Sequence<T> LIZIZ(final Iterator<? extends T> it2) {
        Sequence<T> sequence = new Sequence<T>() { // from class: X.07il
            @Override // kotlin.sequences.Sequence
            public final Iterator<T> iterator() {
                return it2;
            }
        };
        if (!(sequence instanceof C08F6)) {
            return new C08F6(sequence);
        }
        return sequence;
    }

    public static final C197025126t LIZLLL(Sequence sequence, Function1 function1) {
        if (sequence instanceof C08LY) {
            C08LY c08ly = (C08LY) sequence;
            c08ly.getClass();
            return new C197025126t(c08ly.LIZ, c08ly.LIZIZ, function1);
        }
        return new C197025126t(sequence, new AObjectS109S0000000_3(11), function1);
    }

    public static final Sequence LJ(Function1 function1, Object obj) {
        if (obj == null) {
            return C09R5.LIZ;
        }
        return new C13LM(new AObjectS379S0100000_3(obj, 3), function1);
    }
}
