package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YrM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C887260YrM extends AbstractC887250YrL {
    public final List<InterfaceC887040Yr0<?>> LIZJ;

    public C887260YrM() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C887260YrM) && Intrinsics.LJFF(this.LIZJ, ((C887260YrM) obj).LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestEntranceChatListVOConfig(customVOAreaList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC887250YrL
    public final List<InterfaceC887040Yr0<?>> LIZJ() {
        return this.LIZJ;
    }

    public C887260YrM(Object obj) {
        this.LIZJ = C13BV.INSTANCE;
    }
}
