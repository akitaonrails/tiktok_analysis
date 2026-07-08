package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gFH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158210gFH extends AbstractC1158220gFI {
    public final int LIZ;
    public final List<Aweme> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158210gFH)) {
            return false;
        }
        C1158210gFH c1158210gFH = (C1158210gFH) obj;
        return this.LIZ == c1158210gFH.LIZ && Intrinsics.LJFF(this.LIZIZ, c1158210gFH.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Add(index=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", items=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1158210gFH(int i, List<? extends Aweme> list) {
        this.LIZ = i;
        this.LIZIZ = list;
    }
}
