package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pvq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660720Pvq implements InterfaceC0148002o {
    public final C659520Ptu LL;

    public C660720Pvq() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C660720Pvq) && Intrinsics.LJFF(this.LL, ((C660720Pvq) obj).LL);
    }

    public final int hashCode() {
        C659520Ptu c659520Ptu = this.LL;
        if (c659520Ptu == null) {
            return 0;
        }
        return c659520Ptu.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchPOIAnchorState(itemData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C660720Pvq(C659520Ptu c659520Ptu) {
        this.LL = c659520Ptu;
    }
}
