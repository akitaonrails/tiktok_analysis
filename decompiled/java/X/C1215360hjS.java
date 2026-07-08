package X;

import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hjS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1215360hjS implements InterfaceC0148002o {
    public final ProfileNgoStruct LL;
    public final ProfileNgoStruct LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    public C1215360hjS() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1215360hjS)) {
            return false;
        }
        C1215360hjS c1215360hjS = (C1215360hjS) obj;
        return Intrinsics.LJFF(this.LL, c1215360hjS.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1215360hjS.LLILLJJLI) && this.LLILLL == c1215360hjS.LLILLL && this.LLILZ == c1215360hjS.LLILZ;
    }

    public final int hashCode() {
        ProfileNgoStruct profileNgoStruct = this.LL;
        int iHashCode = (profileNgoStruct == null ? 0 : profileNgoStruct.hashCode()) * 31;
        ProfileNgoStruct profileNgoStruct2 = this.LLILLJJLI;
        return ((((iHashCode + (profileNgoStruct2 != null ? profileNgoStruct2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditProfileNgoState(originalNgoStruct=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", nonProfitStruct=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isInBoldFields=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isUserNull=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1215360hjS(int i) {
        this(null, null, false, false);
    }

    public C1215360hjS(ProfileNgoStruct profileNgoStruct, ProfileNgoStruct profileNgoStruct2, boolean z, boolean z2) {
        this.LL = profileNgoStruct;
        this.LLILLJJLI = profileNgoStruct2;
        this.LLILLL = z;
        this.LLILZ = z2;
    }

    public static C1215360hjS LIZ(C1215360hjS c1215360hjS, ProfileNgoStruct profileNgoStruct, ProfileNgoStruct profileNgoStruct2, int i) {
        boolean z;
        if ((i & 1) != 0) {
            profileNgoStruct = c1215360hjS.LL;
        }
        if ((i & 2) != 0) {
            profileNgoStruct2 = c1215360hjS.LLILLJJLI;
        }
        boolean z2 = false;
        if ((i & 4) != 0) {
            z = c1215360hjS.LLILLL;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = c1215360hjS.LLILZ;
        }
        c1215360hjS.getClass();
        return new C1215360hjS(profileNgoStruct, profileNgoStruct2, z, z2);
    }
}
