package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394760mOo {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1394760mOo)) {
            return false;
        }
        C1394760mOo c1394760mOo = (C1394760mOo) obj;
        return Intrinsics.LJFF(this.LIZ, c1394760mOo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1394760mOo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1394760mOo.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricEffectAnchorInfo(musicId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", templateDispatchType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1394760mOo(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
