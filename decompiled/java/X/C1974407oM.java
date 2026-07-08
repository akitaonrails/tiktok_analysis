package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07oM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1974407oM extends AbsTaskOutput {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public C1974407oM() {
        this(null, 0, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1974407oM)) {
            return false;
        }
        C1974407oM c1974407oM = (C1974407oM) obj;
        return Intrinsics.LJFF(this.LIZ, c1974407oM.LIZ) && this.LIZIZ == c1974407oM.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1974407oM.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1974407oM.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SaveDraftTaskOutput(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorSource=");
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
    public final String LIZJ() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LJ() {
        return this.LIZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1974407oM(String str, int i, String str2, int i2) {
        int i3 = i;
        String str3 = (i2 & 1) != 0 ? "" : str;
        i3 = (i2 & 2) != 0 ? 0 : i3;
        String str4 = (i2 & 4) == 0 ? null : "";
        str2 = (i2 & 8) != 0 ? null : str2;
        super(str3, i3, str4, null, "");
        this.LIZ = str3;
        this.LIZIZ = i3;
        this.LIZJ = str4;
        this.LIZLLL = str2;
    }
}
