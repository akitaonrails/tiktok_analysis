package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS382S0200000_16;

/* JADX INFO: renamed from: X.0dLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1046950dLp<IN, OUT> {
    public final Function1<IN, OUT> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1046950dLp(Function1<? super IN, ? extends OUT> function1) {
        this.LIZ = function1;
    }

    public final <NEW_OUT> C1046950dLp<IN, NEW_OUT> LIZ(Function1<? super OUT, ? extends NEW_OUT> function1) {
        return new C1046950dLp<>(new AwS382S0200000_16(function1, this, 88));
    }
}
