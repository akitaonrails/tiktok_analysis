package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C541610LLz extends C09JG {
    public final Source LIZ;
    public final List<String> LIZIZ;
    public final CreativeInfo LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C541610LLz)) {
            return false;
        }
        C541610LLz c541610LLz = (C541610LLz) obj;
        return this.LIZ == c541610LLz.LIZ && Intrinsics.LJFF(this.LIZIZ, c541610LLz.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c541610LLz.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImagePreprocessTaskInput(source=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", srcPaths=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", creativeInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C541610LLz(Source source, CreativeInfo creativeInfo, List list) {
        this.LIZ = source;
        this.LIZIZ = list;
        this.LIZJ = creativeInfo;
    }
}
