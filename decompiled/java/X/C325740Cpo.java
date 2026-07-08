package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cpo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325740Cpo extends AbstractC325730Cpn {
    public final Aweme LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C325740Cpo)) {
            return false;
        }
        C325740Cpo c325740Cpo = (C325740Cpo) obj;
        return Intrinsics.LJFF(this.LIZ, c325740Cpo.LIZ) && this.LIZIZ == c325740Cpo.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Video(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", videoSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C325740Cpo(Aweme aweme, int i) {
        this.LIZ = aweme;
        this.LIZIZ = i;
    }
}
