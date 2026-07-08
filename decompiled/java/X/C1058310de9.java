package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0de9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058310de9 {
    public final int LIZ;
    public final List<String> LIZIZ;
    public final Aweme LIZJ;
    public final Float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1058310de9)) {
            return false;
        }
        C1058310de9 c1058310de9 = (C1058310de9) obj;
        return this.LIZ == c1058310de9.LIZ && Intrinsics.LJFF(this.LIZIZ, c1058310de9.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1058310de9.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1058310de9.LIZLLL);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        List<String> list = this.LIZIZ;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        Aweme aweme = this.LIZJ;
        int iHashCode2 = (iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        Float f = this.LIZLLL;
        return iHashCode2 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditPageBackgroundData(mediaType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imageUrlList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", offsetRatio=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1058310de9(int i, List<String> list, Aweme aweme, Float f) {
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = aweme;
        this.LIZLLL = f;
    }
}
