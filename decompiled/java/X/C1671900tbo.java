package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671900tbo extends AbstractC1682840ttS {
    public final InterfaceC1672820tdI LIZJ;

    public final int hashCode() {
        return this.LIZJ.hashCode();
    }

    public C1671900tbo(InterfaceC1672820tdI interfaceC1672820tdI) {
        this.LIZJ = interfaceC1672820tdI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1671900tbo)) {
            return false;
        }
        return Intrinsics.LJFF(((C1671900tbo) obj).LIZJ, this.LIZJ);
    }
}
