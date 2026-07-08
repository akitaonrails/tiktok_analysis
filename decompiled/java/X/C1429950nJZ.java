package X;

import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nJZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429950nJZ implements C07YC {
    public final List<String> LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C1429950nJZ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1429950nJZ)) {
            return false;
        }
        C1429950nJZ c1429950nJZ = (C1429950nJZ) obj;
        return Intrinsics.LJFF(this.LIZ, c1429950nJZ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1429950nJZ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1429950nJZ.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceTransData(effectIds=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", challengeName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", missionId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1429950nJZ(int i) {
        this(C13BV.INSTANCE, "", "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1429950nJZ(List<String> list, String str, AVChallenge aVChallenge) {
        String str2;
        String str3 = "";
        str = str == null ? "" : str;
        List<String> listLIZIZ = C189100o5.LIZIZ(C189100o5.LIZ(list));
        if (aVChallenge != null && (str2 = aVChallenge.challengeName) != null) {
            str3 = str2;
        }
        this(listLIZIZ, str3, str);
    }

    public C1429950nJZ(List<String> list, String str, String str2) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
