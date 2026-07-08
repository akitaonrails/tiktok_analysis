package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S1f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714570S1f extends AbstractC714580S1g {
    public final User LIZ;
    public final Function0<String> LIZIZ;
    public final C0ZH0 LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C714570S1f)) {
            return false;
        }
        C714570S1f c714570S1f = (C714570S1f) obj;
        return Intrinsics.LJFF(this.LIZ, c714570S1f.LIZ) && Intrinsics.LJFF(this.LIZIZ, c714570S1f.LIZIZ) && this.LIZJ == c714570S1f.LIZJ && Intrinsics.LJFF(this.LIZLLL, c714570S1f.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C0ZH0 c0zh0 = this.LIZJ;
        int iHashCode2 = (iHashCode + (c0zh0 == null ? 0 : c0zh0.hashCode())) * 31;
        String str = this.LIZLLL;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MufMetaData(user=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", draftMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", interactionType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C714570S1f(User user, Function0<String> function0, C0ZH0 c0zh0, String str) {
        this.LIZ = user;
        this.LIZIZ = function0;
        this.LIZJ = c0zh0;
        this.LIZLLL = str;
    }
}
