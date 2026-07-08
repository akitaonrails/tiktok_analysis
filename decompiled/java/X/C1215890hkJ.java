package X;

import com.ss.android.ugc.aweme.profile.model.UserPronounsInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hkJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1215890hkJ implements InterfaceC0148002o {
    public final UserPronounsInfo LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;

    public C1215890hkJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1215890hkJ)) {
            return false;
        }
        C1215890hkJ c1215890hkJ = (C1215890hkJ) obj;
        return Intrinsics.LJFF(this.LL, c1215890hkJ.LL) && this.LLILLJJLI == c1215890hkJ.LLILLJJLI && this.LLILLL == c1215890hkJ.LLILLL;
    }

    public final int hashCode() {
        UserPronounsInfo userPronounsInfo = this.LL;
        return ((((userPronounsInfo == null ? 0 : userPronounsInfo.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditProfilePronounState(pronounsInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isUserBanned=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isInBoldFields=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1215890hkJ(int i) {
        this(null, false, false);
    }

    public C1215890hkJ(UserPronounsInfo userPronounsInfo, boolean z, boolean z2) {
        this.LL = userPronounsInfo;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    public static C1215890hkJ LIZ(C1215890hkJ c1215890hkJ, UserPronounsInfo userPronounsInfo, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            userPronounsInfo = c1215890hkJ.LL;
        }
        if ((i & 2) != 0) {
            z = c1215890hkJ.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z2 = c1215890hkJ.LLILLL;
        }
        c1215890hkJ.getClass();
        return new C1215890hkJ(userPronounsInfo, z, z2);
    }
}
