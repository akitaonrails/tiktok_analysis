package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989900bro {
    public final List<Aweme> LIZ;
    public final List<String> LIZIZ;
    public final List<String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C989900bro)) {
            return false;
        }
        C989900bro c989900bro = (C989900bro) obj;
        return Intrinsics.LJFF(this.LIZ, c989900bro.LIZ) && Intrinsics.LJFF(this.LIZIZ, c989900bro.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c989900bro.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtractedDetailItems(awemes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", outerAnchorKeys=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", repostShellOuterKeys=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C989900bro(List<? extends Aweme> list, List<String> list2, List<String> list3) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
    }
}
