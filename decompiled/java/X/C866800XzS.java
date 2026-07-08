package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C866800XzS implements InterfaceC866870XzZ {
    public final String LIZ;
    public final List<C0YAE> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C866800XzS)) {
            return false;
        }
        C866800XzS c866800XzS = (C866800XzS) obj;
        return Intrinsics.LJFF(this.LIZ, c866800XzS.LIZ) && Intrinsics.LJFF(this.LIZIZ, c866800XzS.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Removed(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", members=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C866800XzS(String str, List<C0YAE> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
