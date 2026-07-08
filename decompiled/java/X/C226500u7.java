package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00u7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C226500u7<T> extends AbstractC401801hI<T> {
    public final String LIZ;
    public final String LIZIZ;
    public final List<T> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C226500u7)) {
            return false;
        }
        C226500u7 c226500u7 = (C226500u7) obj;
        return Intrinsics.LJFF(this.LIZ, c226500u7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c226500u7.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c226500u7.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExternalReqEffectList(panel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", category=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", effectList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C226500u7(String str, String str2, List<? extends T> list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
    }
}
