package X;

import com.bytedance.retrofit2.client.Request;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08W7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08W7 {
    public final Request LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final Object LIZLLL;
    public final List<C080U> LJ;
    public final String LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08W7)) {
            return false;
        }
        C08W7 c08w7 = (C08W7) obj;
        return Intrinsics.LJFF(this.LIZ, c08w7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c08w7.LIZIZ) && this.LIZJ == c08w7.LIZJ && Intrinsics.LJFF(this.LIZLLL, c08w7.LIZLLL) && Intrinsics.LJFF(this.LJ, c08w7.LJ) && Intrinsics.LJFF(this.LJFF, c08w7.LJFF) && this.LJI == c08w7.LJI;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        Object obj = this.LIZLLL;
        int iHashCode2 = (((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.LJ.hashCode()) * 31;
        String str = this.LJFF;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Context(request=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", requestPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isStream=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", responseExtraInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", responseHeaders=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", reuseKey=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C08W7(Request request, String str, boolean z, Object obj, List<C080U> list, String str2, long j) {
        this.LIZ = request;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = obj;
        this.LJ = list;
        this.LJFF = str2;
        this.LJI = j;
    }
}
