package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.15oC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20631015oC extends C09AY implements Function0<CoroutineContext> {
    public C20631015oC() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final CoroutineContext invoke() {
        return C0PEM.LIZJ.plus(new C20750416Hu(CoroutineExceptionHandler.LJJLIL, 0)).plus(C2296908zH.LIZ());
    }
}
