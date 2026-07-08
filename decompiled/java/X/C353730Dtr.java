package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dtr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C353730Dtr {
    public final NLETemplateModel LIZ;
    public final CreativeInfo LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C353730Dtr)) {
            return false;
        }
        C353730Dtr c353730Dtr = (C353730Dtr) obj;
        return Intrinsics.LJFF(this.LIZ, c353730Dtr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c353730Dtr.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReverseTemplateIn(model=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", creativeInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C353730Dtr(NLETemplateModel nLETemplateModel, CreativeInfo creativeInfo) {
        this.LIZ = nLETemplateModel;
        this.LIZIZ = creativeInfo;
    }
}
