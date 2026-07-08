package X;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sSg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1627800sSg implements InterfaceC1627890sSp {
    public final C1668880tWw LIZ = C1669660tYC.LLLLL;
    public final String LIZIZ = UUID.randomUUID().toString();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1627800sSg) && Intrinsics.LJFF(this.LIZ, ((C1627800sSg) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EdgeItem(res=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1627890sSp
    public final String getId() {
        return this.LIZIZ;
    }
}
