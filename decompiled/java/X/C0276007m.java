package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.007m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0276007m {
    public final List<AbstractC841440Wze> LIZ;

    public C0276007m() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0276007m) && Intrinsics.LJFF(this.LIZ, ((C0276007m) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommandSet(commands=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        new C0276007m(0);
    }

    public C0276007m(int i) {
        this(C13BV.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0276007m(List<? extends AbstractC841440Wze> list) {
        this.LIZ = list;
    }
}
