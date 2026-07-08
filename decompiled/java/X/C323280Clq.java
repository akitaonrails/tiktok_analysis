package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Clq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C323280Clq implements InterfaceC323640CmQ<String> {
    public final String LIZ;
    public final String LIZIZ;
    public final EnumC323250Cln LIZJ;
    public final String LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C323280Clq)) {
            return false;
        }
        C323280Clq c323280Clq = (C323280Clq) obj;
        return Intrinsics.LJFF(this.LIZ, c323280Clq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c323280Clq.LIZIZ) && this.LIZJ == c323280Clq.LIZJ && Intrinsics.LJFF(this.LIZLLL, c323280Clq.LIZLLL) && this.LJ == c323280Clq.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendNewVideoLoadParams(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pageToken=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", loadCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C323280Clq(String str, String str2, EnumC323250Cln enumC323250Cln, String str3, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = enumC323250Cln;
        this.LIZLLL = str3;
        this.LJ = i;
    }
}
