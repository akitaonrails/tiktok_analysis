package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PYE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class C0PYE implements Serializable {
    public final Long searchSessionId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PYE) && Intrinsics.LJFF(this.searchSessionId, ((C0PYE) obj).searchSessionId);
    }

    public int hashCode() {
        Long l = this.searchSessionId;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchSessionModel(searchSessionId=");
        sbLIZ.append(this.searchSessionId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PYE() {
        this(0L);
    }

    public C0PYE(Long l) {
        this.searchSessionId = l;
    }
}
