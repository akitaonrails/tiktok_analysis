package X;

import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C887220YrI extends AbstractC887250YrL {
    public final List<InterfaceC887040Yr0<?>> LIZJ;
    public final C01GW LIZLLL;

    public C887220YrI() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C887220YrI) && Intrinsics.LJFF(this.LIZJ, ((C887220YrI) obj).LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotChatChatListVOConfig(customVOAreaList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC887250YrL
    public final List<InterfaceC887040Yr0<?>> LIZIZ() {
        return (List) this.LIZLLL.getValue();
    }

    @Override // X.AbstractC887250YrL
    public final List<InterfaceC887040Yr0<?>> LIZJ() {
        return this.LIZJ;
    }

    public C887220YrI(Object obj) {
        this.LIZJ = C13BV.INSTANCE;
        this.LIZLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 9));
    }
}
