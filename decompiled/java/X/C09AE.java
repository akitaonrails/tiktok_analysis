package X;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: renamed from: X.09AE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public interface C09AE extends CoroutineContext.Element {
    public static final C2297108zJ LJJLJ = C2297108zJ.LL;

    Sequence<C09AE> LIZ();

    void LIZIZ(CancellationException cancellationException);

    InterfaceC2238208po LJII(Function1<? super Throwable, Unit> function1);

    InterfaceC2238208po LJJJJ(Function1 function1, boolean z, boolean z2);

    CancellationException LJJJLL();

    Object LJJZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    C1DFY LLFFF(JobSupport jobSupport);

    C09AE getParent();

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    boolean start();
}
