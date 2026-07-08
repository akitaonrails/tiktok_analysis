package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tfG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674040tfG {
    public final Function1<AbstractC1556970qcR, Unit> LIZ;

    public C1674040tfG() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1674040tfG) && Intrinsics.LJFF(this.LIZ, ((C1674040tfG) obj).LIZ);
    }

    public /* synthetic */ C1674040tfG(int i) {
        this(AFwS266S0000000_25.get$arr$(105));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1674040tfG(Function1<? super AbstractC1556970qcR, Unit> function1) {
        this.LIZ = function1;
    }
}
