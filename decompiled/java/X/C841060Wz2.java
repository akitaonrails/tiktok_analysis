package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841060Wz2 {
    public final EnumC841370WzX LIZ;
    public final C0WSU LIZIZ;
    public final C840860Wyi LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C841060Wz2)) {
            return false;
        }
        C841060Wz2 c841060Wz2 = (C841060Wz2) obj;
        return this.LIZ == c841060Wz2.LIZ && Intrinsics.LJFF(this.LIZIZ, c841060Wz2.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c841060Wz2.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C0WSU c0wsu = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c0wsu == null ? 0 : c0wsu.hashCode())) * 31;
        C840860Wyi c840860Wyi = this.LIZJ;
        return iHashCode2 + (c840860Wyi != null ? c840860Wyi.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StageResult(stage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", legacyResult=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pluginContext=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C841060Wz2(EnumC841370WzX enumC841370WzX, C0WSU c0wsu, C840860Wyi c840860Wyi) {
        this.LIZ = enumC841370WzX;
        this.LIZIZ = c0wsu;
        this.LIZJ = c840860Wyi;
    }
}
