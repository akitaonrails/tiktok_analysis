package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sa3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723650Sa3 extends C723430SZh {
    public final List<Object> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C723650Sa3) && Intrinsics.LJFF(this.LIZJ, ((C723650Sa3) obj).LIZJ);
    }

    public final int hashCode() {
        List<Object> list = this.LIZJ;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssemCreateInstanceParams(host=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C723650Sa3(List<? extends Object> list) {
        this.LIZJ = list;
    }
}
