package X;

import android.util.Log;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.08hL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2185708hL extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Function1 LLILLJJLI;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load friends data failed, isLoadMore: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", stacktrace: ");
        sbLIZ.append(Log.getStackTraceString(th));
        C201955140j.LIZIZ("SharedAR", C2188811AlT.LIZIZ(sbLIZ));
        Function1 function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2185708hL(C2185208hG c2185208hG, boolean z, Function1 function1) {
        super(c2185208hG);
        this.LL = z;
        this.LLILLJJLI = function1;
    }
}
