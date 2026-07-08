package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LY6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LY6 extends C0LYM {
    public final String LIZ;
    public final long LIZIZ;
    public final AIGCOfflineModel LIZJ;
    public final CreativeInfo LIZLLL;
    public final LifecycleOwner LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LY6)) {
            return false;
        }
        C0LY6 c0ly6 = (C0LY6) obj;
        return Intrinsics.LJFF(this.LIZ, c0ly6.LIZ) && this.LIZIZ == c0ly6.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0ly6.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0ly6.LIZLLL) && Intrinsics.LJFF(this.LJ, c0ly6.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        AIGCOfflineModel aIGCOfflineModel = this.LIZJ;
        int iHashCode2 = (iHashCode + (aIGCOfflineModel == null ? 0 : aIGCOfflineModel.hashCode())) * 31;
        CreativeInfo creativeInfo = this.LIZLLL;
        return ((iHashCode2 + (creativeInfo != null ? creativeInfo.hashCode() : 0)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResumeGeneration(taskId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", elapsedWaitingTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", model=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", creativeInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", lifecycleOwner=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LY6(String str, long j, AIGCOfflineModel aIGCOfflineModel, CreativeInfo creativeInfo, LifecycleOwner lifecycleOwner) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = aIGCOfflineModel;
        this.LIZLLL = creativeInfo;
        this.LJ = lifecycleOwner;
    }
}
