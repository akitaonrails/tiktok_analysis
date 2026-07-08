package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479540IrI {
    public boolean LIZ;
    public Function1<? super Boolean, Unit> LIZIZ;

    public final void LIZ(boolean z) {
        this.LIZ = z;
        Function1<? super Boolean, Unit> function1 = this.LIZIZ;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }
}
