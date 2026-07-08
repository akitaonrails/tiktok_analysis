package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EHJ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EHJ {
    public final VideoPublishEditModel LIZ;
    public final NLEModel LIZIZ;
    public final VideoPublishEditModel LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EHJ)) {
            return false;
        }
        C0EHJ c0ehj = (C0EHJ) obj;
        return Intrinsics.LJFF(this.LIZ, c0ehj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ehj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ehj.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditModelData(model=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nleModel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", copyModelReadonly=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0EHJ(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, VideoPublishEditModel videoPublishEditModel2) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = nLEModel;
        this.LIZJ = videoPublishEditModel2;
    }
}
