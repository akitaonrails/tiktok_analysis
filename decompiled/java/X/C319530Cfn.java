package X;

import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInteractionInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cfn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C319530Cfn {
    public final String LIZ;
    public final List<ThoughtInteractionInfo> LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final Throwable LJFF;

    public C319530Cfn() {
        this(null, false, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C319530Cfn)) {
            return false;
        }
        C319530Cfn c319530Cfn = (C319530Cfn) obj;
        return Intrinsics.LJFF(this.LIZ, c319530Cfn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c319530Cfn.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c319530Cfn.LIZJ) && this.LIZLLL == c319530Cfn.LIZLLL && this.LJ == c319530Cfn.LJ && Intrinsics.LJFF(this.LJFF, c319530Cfn.LJFF);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31;
        String str2 = this.LIZJ;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        Throwable th = this.LJFF;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractionListState(thoughtId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", items=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pageToken=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", loading=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C319530Cfn(String str, boolean z, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : null, null, false, (i & 16) != 0 ? false : z, null);
    }

    public C319530Cfn(String str, List<ThoughtInteractionInfo> list, String str2, boolean z, boolean z2, Throwable th) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = th;
    }

    public static C319530Cfn LIZ(C319530Cfn c319530Cfn, List list, String str, boolean z, boolean z2, Throwable th, int i) {
        String str2;
        Throwable th2 = th;
        boolean z3 = z2;
        boolean z4 = z;
        String str3 = str;
        List list2 = list;
        if ((i & 1) != 0) {
            str2 = c319530Cfn.LIZ;
        } else {
            str2 = null;
        }
        if ((i & 2) != 0) {
            list2 = c319530Cfn.LIZIZ;
        }
        if ((i & 4) != 0) {
            str3 = c319530Cfn.LIZJ;
        }
        if ((i & 8) != 0) {
            z4 = c319530Cfn.LIZLLL;
        }
        if ((i & 16) != 0) {
            z3 = c319530Cfn.LJ;
        }
        if ((i & 32) != 0) {
            th2 = c319530Cfn.LJFF;
        }
        c319530Cfn.getClass();
        return new C319530Cfn(str2, list2, str3, z4, z3, th2);
    }
}
