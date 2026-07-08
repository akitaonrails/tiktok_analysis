package X;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.06q1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1729906q1 extends C09AY implements Function0<CoroutineContext> {
    public C1729906q1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final CoroutineContext invoke() {
        return new C2232408os((Executor) C1729806q0.LIZIZ.getValue()).plus(new C1730106q3(CoroutineExceptionHandler.LJJLIL));
    }
}
