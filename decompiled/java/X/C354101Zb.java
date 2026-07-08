package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01Zb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C354101Zb implements InterfaceC951240arS<Object> {
    public final C354001Za LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C354101Zb) && Intrinsics.LJFF(this.LIZ, ((C354101Zb) obj).LIZ);
    }

    public final int hashCode() {
        C354001Za c354001Za = this.LIZ;
        if (c354001Za == null) {
            return 0;
        }
        return c354001Za.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextHeaderInfo(info=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C354101Zb(C354001Za c354001Za) {
        this.LIZ = c354001Za;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        C01ZA c01za;
        C354101Zb c354101Zb;
        C354001Za c354001Za;
        C01ZA c01za2 = null;
        if ((obj instanceof C354101Zb) && (c354101Zb = (C354101Zb) obj) != null && (c354001Za = c354101Zb.LIZ) != null) {
            c01za = c354001Za.LIZIZ;
        } else {
            c01za = null;
        }
        C354001Za c354001Za2 = this.LIZ;
        if (c354001Za2 != null) {
            c01za2 = c354001Za2.LIZIZ;
        }
        return Intrinsics.LJFF(c01za, c01za2);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C354101Zb;
    }
}
