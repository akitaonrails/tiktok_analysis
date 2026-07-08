package X;

import Y.ARunnableS103S0100000_3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08ov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2232708ov {
    public static final void LIZ(List<? extends Function0<Unit>> list) throws ExecutionException, InterruptedException {
        ExecutorService executorServiceD4 = C786410Ut5.d4(Runtime.getRuntime().availableProcessors());
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(executorServiceD4.submit(new ARunnableS103S0100000_3((Function0) it2.next(), 7)));
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Future) it3.next()).get();
        }
        executorServiceD4.shutdown();
    }
}
