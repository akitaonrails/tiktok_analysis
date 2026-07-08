package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790310UzN {
    public final List<IMContact> LIZ;
    public final List<IMContact> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C790310UzN)) {
            return false;
        }
        C790310UzN c790310UzN = (C790310UzN) obj;
        return Intrinsics.LJFF(this.LIZ, c790310UzN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c790310UzN.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchResult(matched=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", others=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C790310UzN(List<? extends IMContact> list, List<? extends IMContact> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
