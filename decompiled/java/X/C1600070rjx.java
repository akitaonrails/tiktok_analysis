package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS264S0000000_24;

/* JADX INFO: renamed from: X.0rjx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600070rjx {
    public static volatile C1600080rjy LIZ = new C1600080rjy(null);

    public static void LIZ() {
        LIZIZ(AFwS264S0000000_24.get$arr$(645));
    }

    public static void LIZIZ(Function1 function1) {
        C1600080rjy c1600080rjy = LIZ;
        if (c1600080rjy.LJIIIIZZ.get() < 2) {
            c1600080rjy.LJIIIIZZ.set(1);
            function1.invoke(c1600080rjy);
        }
    }
}
