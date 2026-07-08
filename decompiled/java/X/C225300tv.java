package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00tv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C225300tv {
    public final List<User> LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;
    public final float LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C225300tv)) {
            return false;
        }
        C225300tv c225300tv = (C225300tv) obj;
        return Intrinsics.LJFF(this.LIZ, c225300tv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c225300tv.LIZIZ) && this.LIZJ == c225300tv.LIZJ && Float.compare(this.LIZLLL, c225300tv.LIZLLL) == 0 && Float.compare(this.LJ, c225300tv.LJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixSearchLocalResult(users=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", searchText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", candidatesCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", matchingDurationMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rankingDurationMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C225300tv(List<? extends User> list, String str, int i, float f, float f2) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = f;
        this.LJ = f2;
    }
}
