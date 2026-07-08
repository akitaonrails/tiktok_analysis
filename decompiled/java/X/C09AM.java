package X;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: renamed from: X.09AM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09AM extends AbstractC23273099z implements C09AE {
    public static final C09AM LL = new C09AM();

    @Override // X.C09AE, X.AnonymousClass0954
    @InterfaceC1294060jmO
    public final void LIZIZ(CancellationException cancellationException) {
    }

    @Override // X.C09AE
    public final C09AE getParent() {
        return null;
    }

    @Override // X.C09AE
    public final boolean isActive() {
        return true;
    }

    @Override // X.C09AE
    public final boolean isCancelled() {
        return false;
    }

    @Override // X.C09AE
    public final boolean isCompleted() {
        return false;
    }

    @Override // X.C09AE
    @InterfaceC1294060jmO
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    public C09AM() {
        super(C09AE.LJJLJ);
    }

    @Override // X.C09AE
    @InterfaceC1294060jmO
    public final CancellationException LJJJLL() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // X.C09AE
    public final Sequence<C09AE> LIZ() {
        return C09R4.LIZJ();
    }

    @Override // X.C09AE
    @InterfaceC1294060jmO
    public final InterfaceC2238208po LJII(Function1<? super Throwable, Unit> function1) {
        return C09AF.LL;
    }

    @Override // X.C09AE
    @InterfaceC1294060jmO
    public final Object LJJZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // X.C09AE
    @InterfaceC1294060jmO
    public final C1DFY LLFFF(JobSupport jobSupport) {
        return C09AF.LL;
    }

    @Override // X.C09AE
    @InterfaceC1294060jmO
    public final InterfaceC2238208po LJJJJ(Function1 function1, boolean z, boolean z2) {
        return C09AF.LL;
    }
}
