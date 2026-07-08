package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XzT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C866810XzT implements InterfaceC866870XzZ {
    public final String LIZ;
    public final List<C0YAE> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C866810XzT)) {
            return false;
        }
        C866810XzT c866810XzT = (C866810XzT) obj;
        return Intrinsics.LJFF(this.LIZ, c866810XzT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c866810XzT.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Updated(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", members=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C866810XzT(String str, List<C0YAE> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
