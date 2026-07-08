package X;

import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hkB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1215810hkB implements InterfaceC0148002o {
    public final String LL;
    public final List<SignatureExtraInfo> LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;

    public C1215810hkB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1215810hkB)) {
            return false;
        }
        C1215810hkB c1215810hkB = (C1215810hkB) obj;
        return Intrinsics.LJFF(this.LL, c1215810hkB.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1215810hkB.LLILLJJLI) && this.LLILLL == c1215810hkB.LLILLL && this.LLILZ == c1215810hkB.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditProfileBioState(currentBio=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", currentSignatureExtra=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", signatureModifyTime=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isInBoldFields=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1215810hkB(int i) {
        this(0, "", C13BV.INSTANCE, false);
    }

    public C1215810hkB(int i, String str, List list, boolean z) {
        this.LL = str;
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = z;
    }

    public static C1215810hkB LIZ(C1215810hkB c1215810hkB, String str, List list, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            str = c1215810hkB.LL;
        }
        if ((i2 & 2) != 0) {
            list = c1215810hkB.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            i = c1215810hkB.LLILLL;
        }
        if ((i2 & 8) != 0) {
            z = c1215810hkB.LLILZ;
        }
        c1215810hkB.getClass();
        return new C1215810hkB(i, str, list, z);
    }
}
