package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;

/* JADX INFO: renamed from: X.0ZNt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898790ZNt implements InterfaceC903660Zci {
    public final int[] LIZ;
    public final Function1<C869590Y9l, Boolean> LIZIZ;

    public /* synthetic */ C898790ZNt(int[] iArr) {
        this(iArr, AFwS231S0000000_3.get$arr$(250));
    }

    @Override // X.InterfaceC903660Zci
    public final boolean LIZ(C869590Y9l c869590Y9l) {
        if (C13LQ.LJIILJJIL(c869590Y9l.getMsgType(), this.LIZ) && this.LIZIZ.invoke(c869590Y9l).booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C898790ZNt(int[] iArr, Function1<? super C869590Y9l, Boolean> function1) {
        this.LIZ = iArr;
        this.LIZIZ = function1;
    }
}
