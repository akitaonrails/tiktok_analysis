package X;

import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LYJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LYJ extends C0LYM {
    public final AIGCOfflineModel LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0LYJ) && Intrinsics.LJFF(this.LIZ, ((C0LYJ) obj).LIZ);
    }

    public final int hashCode() {
        AIGCOfflineModel aIGCOfflineModel = this.LIZ;
        if (aIGCOfflineModel == null) {
            return 0;
        }
        return aIGCOfflineModel.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StartGenerationPreprocessing(model=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LYJ(AIGCOfflineModel aIGCOfflineModel) {
        this.LIZ = aIGCOfflineModel;
    }
}
