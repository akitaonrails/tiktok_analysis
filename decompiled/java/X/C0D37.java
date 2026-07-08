package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D37, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D37 implements Serializable {
    public final boolean isFreeReturn;
    public final List<String> requirements;
    public final String title;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D37)) {
            return false;
        }
        C0D37 c0d37 = (C0D37) obj;
        return Intrinsics.LJFF(this.title, c0d37.title) && this.isFreeReturn == c0d37.isFreeReturn && Intrinsics.LJFF(this.requirements, c0d37.requirements);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + C786410Ut5.Z2(this.isFreeReturn)) * 31) + this.requirements.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpReturnSectionState(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", isFreeReturn=");
        sbLIZ.append(this.isFreeReturn);
        sbLIZ.append(", requirements=");
        sbLIZ.append(this.requirements);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isFreeReturn() {
        return this.isFreeReturn;
    }

    public C0D37(String str, boolean z, List<String> list) {
        this.title = str;
        this.isFreeReturn = z;
        this.requirements = list;
    }
}
