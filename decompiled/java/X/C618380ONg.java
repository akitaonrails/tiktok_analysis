package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountEditResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBizResourceEntryToggle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ONg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618380ONg implements InterfaceC0148002o {
    public final AbstractC1623806Xk<String> LL;
    public final AbstractC1623806Xk<BulletinAccountEditResponse> LLILLJJLI;
    public final List<BulletinBizResourceEntryToggle> LLILLL;
    public final boolean LLILZ;

    public C618380ONg() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C618380ONg)) {
            return false;
        }
        C618380ONg c618380ONg = (C618380ONg) obj;
        return Intrinsics.LJFF(this.LL, c618380ONg.LL) && Intrinsics.LJFF(this.LLILLJJLI, c618380ONg.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c618380ONg.LLILLL) && this.LLILZ == c618380ONg.LLILZ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        List<BulletinBizResourceEntryToggle> list = this.LLILLL;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinBoardEditState(name=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", requestStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", bulletinResourceEntryToggleEditing=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isEntryToggleChanged=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C618380ONg(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh, null, false);
    }

    public C618380ONg(AbstractC1623806Xk<String> abstractC1623806Xk, AbstractC1623806Xk<BulletinAccountEditResponse> abstractC1623806Xk2, List<BulletinBizResourceEntryToggle> list, boolean z) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
        this.LLILLL = list;
        this.LLILZ = z;
    }

    public static C618380ONg LIZ(C618380ONg c618380ONg, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c618380ONg.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk2 = c618380ONg.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            list = c618380ONg.LLILLL;
        }
        if ((i & 8) != 0) {
            z = c618380ONg.LLILZ;
        }
        c618380ONg.getClass();
        return new C618380ONg(abstractC1623806Xk, abstractC1623806Xk2, list, z);
    }
}
