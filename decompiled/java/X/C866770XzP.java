package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XzP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C866770XzP implements InterfaceC866870XzZ {
    public final String LIZ;
    public final int LIZIZ;
    public final List<Long> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C866770XzP)) {
            return false;
        }
        C866770XzP c866770XzP = (C866770XzP) obj;
        return Intrinsics.LJFF(this.LIZ, c866770XzP.LIZ) && this.LIZIZ == c866770XzP.LIZIZ && Intrinsics.LJFF(this.LIZJ, c866770XzP.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Silenced(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", silentMembers=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C866770XzP(String str, int i, List<Long> list) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = list;
    }
}
