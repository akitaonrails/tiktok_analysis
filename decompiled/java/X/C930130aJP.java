package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aJP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930130aJP implements InterfaceC951240arS<Object> {
    public String LIZ;
    public int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C930130aJP)) {
            return false;
        }
        C930130aJP c930130aJP = (C930130aJP) obj;
        return Intrinsics.LJFF(this.LIZ, c930130aJP.LIZ) && this.LIZIZ == c930130aJP.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitleItem(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", titleType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (!(obj instanceof C930130aJP) || !Intrinsics.LJFF(((C930130aJP) obj).LIZ, this.LIZ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C930130aJP;
    }

    public C930130aJP(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
