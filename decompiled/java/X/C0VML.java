package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VML, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VML {
    public final long LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VML)) {
            return false;
        }
        C0VML c0vml = (C0VML) obj;
        return this.LIZ == c0vml.LIZ && Intrinsics.LJFF(this.LIZIZ, c0vml.LIZIZ) && this.LIZJ == c0vml.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0vml.LIZLLL) && Intrinsics.LJFF(this.LJ, c0vml.LJ);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneEntity(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sceneKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sceneType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", strategyKey=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", uniqueKey=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0VML(long j, String str, int i, String str2, String str3) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
