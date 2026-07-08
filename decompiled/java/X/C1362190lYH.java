package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lYH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362190lYH implements InterfaceC0148002o {
    public final List<InterfaceC1361730lXX> LL;
    public final List<IMContact> LLILLJJLI;
    public final Set<IMContact> LLILLL;
    public final Set<IMContact> LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final String LLIZ;
    public final Boolean LLIZLLLIL;
    public final boolean LLJ;
    public final C1362200lYI LLJI;

    public C1362190lYH() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1362190lYH)) {
            return false;
        }
        C1362190lYH c1362190lYH = (C1362190lYH) obj;
        return Intrinsics.LJFF(this.LL, c1362190lYH.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1362190lYH.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1362190lYH.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1362190lYH.LLILZ) && this.LLILZIL == c1362190lYH.LLILZIL && this.LLILZLL == c1362190lYH.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1362190lYH.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1362190lYH.LLIZLLLIL) && this.LLJ == c1362190lYH.LLJ && Intrinsics.LJFF(this.LLJI, c1362190lYH.LLJI);
    }

    public final int hashCode() {
        List<InterfaceC1361730lXX> list = this.LL;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<IMContact> list2 = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31) + this.LLILLL.hashCode()) * 31;
        Set<IMContact> set = this.LLILZ;
        int iHashCode3 = (((((((iHashCode2 + (set == null ? 0 : set.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + this.LLIZ.hashCode()) * 31;
        Boolean bool = this.LLIZLLLIL;
        int iHashCode4 = (((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.LLJ)) * 31;
        C1362200lYI c1362200lYI = this.LLJI;
        return iHashCode4 + (c1362200lYI != null ? c1362200lYI.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareContactListState(adapterList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", contactList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectedList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", allowEnterChatContactList=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", createGroupCheckBoxChecked=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", hasClickedCreateGroupButton=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", editTextMsg=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", createGroupRequesting=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", showTipFlag=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", aggregationExpandInfo=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1362190lYH(int i) {
        this(null, null, C08CX.INSTANCE, null, false, false, "", null, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1362190lYH(List<? extends InterfaceC1361730lXX> list, List<? extends IMContact> list2, Set<? extends IMContact> set, Set<? extends IMContact> set2, boolean z, boolean z2, String str, Boolean bool, boolean z3, C1362200lYI c1362200lYI) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = set;
        this.LLILZ = set2;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = str;
        this.LLIZLLLIL = bool;
        this.LLJ = z3;
        this.LLJI = c1362200lYI;
    }

    public static C1362190lYH LIZ(C1362190lYH c1362190lYH, List list, List list2, Set set, boolean z, boolean z2, String str, Boolean bool, boolean z3, C1362200lYI c1362200lYI, int i) {
        Set<IMContact> set2;
        C1362200lYI c1362200lYI2 = c1362200lYI;
        boolean z4 = z3;
        Boolean bool2 = bool;
        String str2 = str;
        boolean z5 = z2;
        boolean z6 = z;
        Set set3 = set;
        List list3 = list2;
        List list4 = list;
        if ((i & 1) != 0) {
            list4 = c1362190lYH.LL;
        }
        if ((i & 2) != 0) {
            list3 = c1362190lYH.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            set3 = c1362190lYH.LLILLL;
        }
        if ((i & 8) != 0) {
            set2 = c1362190lYH.LLILZ;
        } else {
            set2 = null;
        }
        if ((i & 16) != 0) {
            z6 = c1362190lYH.LLILZIL;
        }
        if ((i & 32) != 0) {
            z5 = c1362190lYH.LLILZLL;
        }
        if ((i & 64) != 0) {
            str2 = c1362190lYH.LLIZ;
        }
        if ((i & 128) != 0) {
            bool2 = c1362190lYH.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            z4 = c1362190lYH.LLJ;
        }
        if ((i & 512) != 0) {
            c1362200lYI2 = c1362190lYH.LLJI;
        }
        c1362190lYH.getClass();
        return new C1362190lYH(list4, list3, set3, set2, z6, z5, str2, bool2, z4, c1362200lYI2);
    }
}
