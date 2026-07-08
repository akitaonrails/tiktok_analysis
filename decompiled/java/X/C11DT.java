package X;

import Y.ARunnableS4S0401000_29;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11DT, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11DT {
    public static <T> void LIZ(C11DO<T> c11do, List<? extends T> list, Function0<Unit> function0) {
        C11DR<T> c11drLLILZIL = c11do.LLILZIL();
        int i = c11drLLILZIL.LJ + 1;
        c11drLLILZIL.LJ = i;
        List<? extends T> list2 = c11drLLILZIL.LJFF;
        if (list != list2) {
            if (list.isEmpty()) {
                int size = list2.size();
                c11drLLILZIL.LJFF = C13BV.INSTANCE;
                c11drLLILZIL.LIZ.LLIZLLLIL(0, size);
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            if (list2.isEmpty()) {
                c11drLLILZIL.LJFF = list;
                c11drLLILZIL.LIZ.LJZL(0, list.size());
                if (function0 == null) {
                    return;
                }
                function0.invoke();
                return;
            }
            c11drLLILZIL.LIZIZ.LIZJ.execute(new ARunnableS4S0401000_29(c11drLLILZIL, list2, list, i, function0, 2));
        }
    }
}
