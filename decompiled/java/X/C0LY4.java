package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LY4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LY4 extends C0LYM {
    public final AIGCOfflineModel LIZ;
    public final CreativeInfo LIZIZ;
    public final LifecycleOwner LIZJ;
    public final List<String> LIZLLL;
    public final long LJ;
    public final boolean LJFF;

    public C0LY4() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LY4)) {
            return false;
        }
        C0LY4 c0ly4 = (C0LY4) obj;
        return Intrinsics.LJFF(this.LIZ, c0ly4.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ly4.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ly4.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0ly4.LIZLLL) && this.LJ == c0ly4.LJ && this.LJFF == c0ly4.LJFF;
    }

    public final int hashCode() {
        AIGCOfflineModel aIGCOfflineModel = this.LIZ;
        int iHashCode = (aIGCOfflineModel == null ? 0 : aIGCOfflineModel.hashCode()) * 31;
        CreativeInfo creativeInfo = this.LIZIZ;
        return ((((((((iHashCode + (creativeInfo != null ? creativeInfo.hashCode() : 0)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StartGeneration(model=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", creativeInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lifecycleOwner=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extraResourcesList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", generateInDraftButtonAppearDelay=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", directlySaveToDraftWhenClickBack=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LY4(AIGCOfflineModel aIGCOfflineModel, CreativeInfo creativeInfo, LifecycleOwner lifecycleOwner, long j, boolean z) {
        C13BV c13bv = C13BV.INSTANCE;
        this.LIZ = aIGCOfflineModel;
        this.LIZIZ = creativeInfo;
        this.LIZJ = lifecycleOwner;
        this.LIZLLL = c13bv;
        this.LJ = j;
        this.LJFF = z;
    }
}
