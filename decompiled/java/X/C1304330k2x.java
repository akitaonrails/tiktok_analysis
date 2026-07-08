package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0k2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304330k2x {
    public final EnumC1304340k2y LIZ;
    public final Function1<Object, Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1304330k2x)) {
            return false;
        }
        C1304330k2x c1304330k2x = (C1304330k2x) obj;
        return this.LIZ == c1304330k2x.LIZ && Intrinsics.LJFF(this.LIZIZ, c1304330k2x.LIZIZ);
    }

    public C1304330k2x(EnumC1304340k2y enumC1304340k2y, Function1<Object, Unit> function1) {
        this.LIZ = enumC1304340k2y;
        this.LIZIZ = function1;
    }
}
