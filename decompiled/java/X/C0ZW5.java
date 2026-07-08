package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZW5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZW5 {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final C1622006Ws<String> LIZJ;
    public final C0ZW4 LIZLLL;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMMediaImageViewData{uuid='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', urlSize: ");
        sbLIZ.append(this.LIZIZ.size());
        sbLIZ.append(", imageTransform=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0ZW5)) {
            return false;
        }
        C0ZW5 c0zw5 = (C0ZW5) obj;
        if (!Intrinsics.LJFF(this.LIZ, c0zw5.LIZ) || this.LIZLLL != c0zw5.LIZLLL) {
            return false;
        }
        return true;
    }

    public C0ZW5(String str, List<String> list, C1622006Ws<String> c1622006Ws, C0ZW4 c0zw4) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = c1622006Ws;
        this.LIZLLL = c0zw4;
    }
}
