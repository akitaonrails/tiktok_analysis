package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XzQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C866780XzQ implements InterfaceC866870XzZ {
    public final String LIZ;
    public final List<C0YAE> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C866780XzQ)) {
            return false;
        }
        C866780XzQ c866780XzQ = (C866780XzQ) obj;
        return Intrinsics.LJFF(this.LIZ, c866780XzQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c866780XzQ.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loaded(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", members=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C866780XzQ(String str, List<C0YAE> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
