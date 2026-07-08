package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N0x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587090N0x extends AbstractC587080N0w {
    public final boolean LIZ;
    public final List<InterfaceC588620N6u> LIZIZ;

    public C587090N0x() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C587090N0x)) {
            return false;
        }
        C587090N0x c587090N0x = (C587090N0x) obj;
        return this.LIZ == c587090N0x.LIZ && Intrinsics.LJFF(this.LIZIZ, c587090N0x.LIZIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        List<InterfaceC588620N6u> list = this.LIZIZ;
        return iZ2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnableState(canPlay=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", allEnableStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C587090N0x(int i) {
        this(false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C587090N0x(boolean z, List<? extends InterfaceC588620N6u> list) {
        this.LIZ = z;
        this.LIZIZ = list;
    }
}
