package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09JC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09JC {
    public final Source LIZ;
    public final CreativeInfo LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C09JC)) {
            return false;
        }
        C09JC c09jc = (C09JC) obj;
        return this.LIZ == c09jc.LIZ && Intrinsics.LJFF(this.LIZIZ, c09jc.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCDraftDeleteParams(source=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", creativeInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C09JC(Source source, CreativeInfo creativeInfo) {
        this.LIZ = source;
        this.LIZIZ = creativeInfo;
    }
}
