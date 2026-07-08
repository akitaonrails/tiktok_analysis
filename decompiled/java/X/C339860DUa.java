package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DUa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339860DUa extends AbstractC339890DUd {
    public final String LIZ;

    public C339860DUa() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C339860DUa) && Intrinsics.LJFF(this.LIZ, ((C339860DUa) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryThoughtDraftFooterItem(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC339890DUd
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC339890DUd
    public final EnumC339930DUh LIZIZ() {
        return EnumC339930DUh.FOOTER;
    }

    public C339860DUa(int i) {
        this.LIZ = "footer";
    }
}
