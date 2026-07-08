package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07oO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1974607oO extends AbsTaskOutput {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1974607oO)) {
            return false;
        }
        C1974607oO c1974607oO = (C1974607oO) obj;
        return Intrinsics.LJFF(this.LIZ, c1974607oO.LIZ) && this.LIZIZ == c1974607oO.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1974607oO.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1974607oO.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("I2VTaskOutput(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", videoPath=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final int LIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LIZIZ() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LJ() {
        return this.LIZ;
    }

    public C1974607oO(String str, String str2) {
        super(str, 0, "", null, "");
        this.LIZ = str;
        this.LIZIZ = 0;
        this.LIZJ = "";
        this.LIZLLL = str2;
    }
}
