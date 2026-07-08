package X;

import android.app.Activity;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wdQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788220wdQ {
    public final Activity LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1788220wdQ)) {
            return false;
        }
        C1788220wdQ c1788220wdQ = (C1788220wdQ) obj;
        return Intrinsics.LJFF(this.LIZ, c1788220wdQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1788220wdQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1788220wdQ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1788220wdQ.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Payload(activity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", trackingMap=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", encodedPayload=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1788220wdQ(Activity activity, String str, Map<String, String> map, String str2) {
        this.LIZ = activity;
        this.LIZIZ = str;
        this.LIZJ = map;
        this.LIZLLL = str2;
    }
}
