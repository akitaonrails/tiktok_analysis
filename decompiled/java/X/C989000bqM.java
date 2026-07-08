package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989000bqM extends AbstractC989020bqO {
    public final Function0<Unit> LIZ;

    public C989000bqM() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C989000bqM) && Intrinsics.LJFF(this.LIZ, ((C989000bqM) obj).LIZ);
    }

    public final int hashCode() {
        Function0<Unit> function0 = this.LIZ;
        if (function0 == null) {
            return 0;
        }
        return function0.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Badge(onShown=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C989000bqM(Function0<Unit> function0) {
        this.LIZ = function0;
    }
}
