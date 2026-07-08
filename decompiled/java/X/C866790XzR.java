package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XzR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C866790XzR implements InterfaceC866870XzZ {
    public final String LIZ;
    public final List<C0YAE> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C866790XzR)) {
            return false;
        }
        C866790XzR c866790XzR = (C866790XzR) obj;
        return Intrinsics.LJFF(this.LIZ, c866790XzR.LIZ) && Intrinsics.LJFF(this.LIZIZ, c866790XzR.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Added(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", members=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C866790XzR(String str, List<C0YAE> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
