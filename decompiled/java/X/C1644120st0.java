package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0st0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644120st0 {
    public final /* synthetic */ C1644140st2 LIZ;

    public C1644120st0(C1644140st2 c1644140st2) {
        this.LIZ = c1644140st2;
    }

    public final boolean LIZ(boolean z) {
        Function1<? super Boolean, Boolean> function1 = this.LIZ.LLLII().LLJJI;
        if (function1 != null) {
            return function1.invoke(Boolean.valueOf(z)).booleanValue();
        }
        return false;
    }

    public final void LIZIZ(boolean z) {
        if (!Intrinsics.LJFF(this.LIZ.LLLII().kJ0().getValue(), Boolean.valueOf(z))) {
            this.LIZ.LLLII().OB0(z);
        }
    }
}
