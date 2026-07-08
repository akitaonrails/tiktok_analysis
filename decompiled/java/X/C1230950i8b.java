package X;

import com.ss.android.ugc.aweme.fangroup.model.CreatorFanGroupMeta;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230950i8b implements InterfaceC0148002o {
    public final List<C1230940i8a> LL;
    public final CreatorFanGroupMeta LLILLJJLI;
    public final boolean LLILLL;
    public final C1230940i8a LLILZ;
    public final C291001Au<Unit> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1230950i8b)) {
            return false;
        }
        C1230950i8b c1230950i8b = (C1230950i8b) obj;
        return Intrinsics.LJFF(this.LL, c1230950i8b.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1230950i8b.LLILLJJLI) && this.LLILLL == c1230950i8b.LLILLL && Intrinsics.LJFF(this.LLILZ, c1230950i8b.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1230950i8b.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        C1230940i8a c1230940i8a = this.LLILZ;
        int iHashCode2 = (iHashCode + (c1230940i8a == null ? 0 : c1230940i8a.hashCode())) * 31;
        C291001Au<Unit> c291001Au = this.LLILZIL;
        return iHashCode2 + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FanGroupListState(fanGroupList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", fanGroupMetaInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showLoading=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", selectedGroup=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", adjustHeight=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1230950i8b(List<C1230940i8a> list, CreatorFanGroupMeta creatorFanGroupMeta, boolean z, C1230940i8a c1230940i8a, C291001Au<Unit> c291001Au) {
        this.LL = list;
        this.LLILLJJLI = creatorFanGroupMeta;
        this.LLILLL = z;
        this.LLILZ = c1230940i8a;
        this.LLILZIL = c291001Au;
    }

    public static C1230950i8b LIZ(C1230950i8b c1230950i8b, List list, CreatorFanGroupMeta creatorFanGroupMeta, boolean z, C1230940i8a c1230940i8a, C291001Au c291001Au, int i) {
        C291001Au c291001Au2 = c291001Au;
        C1230940i8a c1230940i8a2 = c1230940i8a;
        boolean z2 = z;
        CreatorFanGroupMeta creatorFanGroupMeta2 = creatorFanGroupMeta;
        List list2 = list;
        if ((i & 1) != 0) {
            list2 = c1230950i8b.LL;
        }
        if ((i & 2) != 0) {
            creatorFanGroupMeta2 = c1230950i8b.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z2 = c1230950i8b.LLILLL;
        }
        if ((i & 8) != 0) {
            c1230940i8a2 = c1230950i8b.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au2 = c1230950i8b.LLILZIL;
        }
        c1230950i8b.getClass();
        return new C1230950i8b(list2, creatorFanGroupMeta2, z2, c1230940i8a2, c291001Au2);
    }
}
