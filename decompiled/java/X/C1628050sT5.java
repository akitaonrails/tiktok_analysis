package X;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sT5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1628050sT5 implements InterfaceC1627890sSp {
    public final EnumC995060c08 LIZ;
    public final C1668880tWw LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1628050sT5)) {
            return false;
        }
        C1628050sT5 c1628050sT5 = (C1628050sT5) obj;
        return this.LIZ == c1628050sT5.LIZ && Intrinsics.LJFF(this.LIZIZ, c1628050sT5.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1628050sT5.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DrawableItem(foregroundColor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", res=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1627890sSp
    public final String getId() {
        return this.LIZJ;
    }

    public C1628050sT5(EnumC995060c08 enumC995060c08, C1668880tWw c1668880tWw) {
        String string = UUID.randomUUID().toString();
        this.LIZ = enumC995060c08;
        this.LIZIZ = c1668880tWw;
        this.LIZJ = string;
    }
}
