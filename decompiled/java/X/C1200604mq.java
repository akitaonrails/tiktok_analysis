package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04mq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1200604mq {
    public final String LIZ;
    public final String LIZIZ;
    public final Map<String, Object> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1200604mq)) {
            return false;
        }
        C1200604mq c1200604mq = (C1200604mq) obj;
        return Intrinsics.LJFF(this.LIZ, c1200604mq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1200604mq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1200604mq.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingEducation(creatorId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", packageId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mobProps=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1200604mq(String str, String str2, Map<String, ? extends Object> map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = map;
    }
}
