package X;

import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11fF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19556311fF {
    public final SoundEffect LIZ;
    public int LIZIZ = 1;
    public int LIZJ = 0;
    public int LIZLLL;
    public int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19556311fF)) {
            return false;
        }
        C19556311fF c19556311fF = (C19556311fF) obj;
        return Intrinsics.LJFF(this.LIZ, c19556311fF.LIZ) && this.LIZIZ == c19556311fF.LIZIZ && this.LIZJ == c19556311fF.LIZJ && this.LIZLLL == c19556311fF.LIZLLL && this.LJ == c19556311fF.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SoundEffectItemModel(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", previewStatus=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", downLoadStatus=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", collectStatus=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19556311fF(SoundEffect soundEffect, int i, int i2) {
        this.LIZ = soundEffect;
        this.LIZLLL = i;
        this.LJ = i2;
    }
}
