package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoStandardRatio;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yMN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854530yMN implements InterfaceC0148002o {
    public final C1854540yMO LL;
    public TakoStandardRatio LLILLJJLI;
    public ConvertStyleItem LLILLL;

    public C1854530yMN() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1854530yMN)) {
            return false;
        }
        C1854530yMN c1854530yMN = (C1854530yMN) obj;
        return Intrinsics.LJFF(this.LL, c1854530yMN.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1854530yMN.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1854530yMN.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        TakoStandardRatio takoStandardRatio = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (takoStandardRatio == null ? 0 : takoStandardRatio.hashCode())) * 31;
        ConvertStyleItem convertStyleItem = this.LLILLL;
        return iHashCode2 + (convertStyleItem != null ? convertStyleItem.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoInputSkillLabelState(selectedLabelData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedRatioSubSkill=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectedStyleSubSkill=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1854530yMN(int i) {
        this(new C1854540yMO(EnumC1854550yMP.NONE, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (TakoSug) null, (String) null, (List) null, 2046), null, null);
    }

    public C1854530yMN(C1854540yMO c1854540yMO, TakoStandardRatio takoStandardRatio, ConvertStyleItem convertStyleItem) {
        this.LL = c1854540yMO;
        this.LLILLJJLI = takoStandardRatio;
        this.LLILLL = convertStyleItem;
    }
}
