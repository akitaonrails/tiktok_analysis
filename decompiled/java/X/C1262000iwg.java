package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iwg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262000iwg extends AbstractC1261840iwQ<AbstractC1262120iws> {
    public final AbstractC1262120iws LLILLJJLI;

    @Override // X.AbstractC1261840iwQ
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1262000iwg) && Intrinsics.LJFF(this.LLILLJJLI, ((C1262000iwg) obj).LLILLJJLI);
    }

    @Override // X.AbstractC1261840iwQ
    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InsertedItem(element=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1261840iwQ
    public final /* bridge */ /* synthetic */ InterfaceC1262230ix3 LIZIZ() {
        return this.LLILLJJLI;
    }

    public C1262000iwg(AbstractC1262120iws abstractC1262120iws) {
        this.LLILLJJLI = abstractC1262120iws;
    }
}
