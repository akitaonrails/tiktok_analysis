package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L1W, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L1W {
    public final VideoPublishEditModel LIZ;
    public final NLETemplateModel LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0L1W)) {
            return false;
        }
        C0L1W c0l1w = (C0L1W) obj;
        return Intrinsics.LJFF(this.LIZ, c0l1w.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0l1w.LIZIZ);
    }

    public final int hashCode() {
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        int iHashCode = (videoPublishEditModel == null ? 0 : videoPublishEditModel.hashCode()) * 31;
        NLETemplateModel nLETemplateModel = this.LIZIZ;
        return iHashCode + (nLETemplateModel != null ? nLETemplateModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateApplyResult(editModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateModel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0L1W(VideoPublishEditModel videoPublishEditModel, NLETemplateModel nLETemplateModel) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = nLETemplateModel;
    }
}
