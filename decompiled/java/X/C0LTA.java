package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LTA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LTA extends AbsTaskOutput {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LTA)) {
            return false;
        }
        C0LTA c0lta = (C0LTA) obj;
        return Intrinsics.LJFF(this.LIZ, c0lta.LIZ) && this.LIZIZ == c0lta.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0lta.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0lta.LIZLLL) && Intrinsics.LJFF(this.LJ, c0lta.LJ) && Intrinsics.LJFF(this.LJFF, c0lta.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefreshFrameTaskOutput(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", imageLocalPath=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", reqKey=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", reqJson=");
        sbLIZ.append(this.LJFF);
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

    public C0LTA(String str, int i, String str2, String str3, String str4, String str5) {
        super(str, i, str2, null, "");
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
    }
}
