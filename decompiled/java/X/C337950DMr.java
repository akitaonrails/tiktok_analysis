package X;

import com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337950DMr implements InterfaceC111300bX {
    public final EnumC337870DMj LL;
    public final EnumC337830DMf LLILLJJLI;
    public final C1245860iWe LLILLL;
    public final boolean LLILZ;
    public final EnumC338610DPf LLILZIL;
    public final String LLILZLL;
    public final SchoolMutualStruct LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C337950DMr)) {
            return false;
        }
        C337950DMr c337950DMr = (C337950DMr) obj;
        return this.LL == c337950DMr.LL && this.LLILLJJLI == c337950DMr.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c337950DMr.LLILLL) && this.LLILZ == c337950DMr.LLILZ && this.LLILZIL == c337950DMr.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c337950DMr.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c337950DMr.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        EnumC338610DPf enumC338610DPf = this.LLILZIL;
        int iHashCode2 = (iHashCode + (enumC338610DPf == null ? 0 : enumC338610DPf.hashCode())) * 31;
        String str = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        SchoolMutualStruct schoolMutualStruct = this.LLIZ;
        return iHashCode3 + (schoolMutualStruct != null ? schoolMutualStruct.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CampusFlowData(initialPage=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", flow=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", skipFindSchoolFriendsPage=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", initialTab=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", insertAwemeId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", schoolMutualStruct=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C337950DMr(EnumC337870DMj enumC337870DMj, EnumC337830DMf enumC337830DMf, C1245860iWe c1245860iWe, boolean z, EnumC338610DPf enumC338610DPf, String str, SchoolMutualStruct schoolMutualStruct) {
        this.LL = enumC337870DMj;
        this.LLILLJJLI = enumC337830DMf;
        this.LLILLL = c1245860iWe;
        this.LLILZ = z;
        this.LLILZIL = enumC338610DPf;
        this.LLILZLL = str;
        this.LLIZ = schoolMutualStruct;
    }
}
