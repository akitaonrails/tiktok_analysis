package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0d43, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1035930d43 implements Serializable {
    public final int pipStatus;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1035930d43) && this.pipStatus == ((C1035930d43) obj).pipStatus;
    }

    public int hashCode() {
        return this.pipStatus;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdWebPipModel(pipStatus=");
        sbLIZ.append(this.pipStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1035930d43(int i) {
        this.pipStatus = i;
    }
}
