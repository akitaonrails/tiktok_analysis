package X;

import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.CustomBizData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.TemplateData;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rgq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598140rgq extends C1598150rgr implements InterfaceC1890700zIi, InterfaceC1595240rcA, InterfaceC1598460rhM {
    public final SkylightData LLILLJJLI;
    public final User LLILLL;
    public final boolean LLILZ;

    @Override // X.InterfaceC1595240rcA
    public final int getReRankSequence() {
        return -1;
    }

    @Override // X.InterfaceC1595240rcA
    public final Integer getReRankType() {
        return -1;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightTemplateDataItem(data=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1595240rcA
    public final String getCellType() {
        C1598160rgs c1598160rgs = C1598160rgs.LIZ;
        SkylightData skylightData = this.LL;
        int i = skylightData.bizType;
        c1598160rgs.getClass();
        String strLIZIZ = C1598160rgs.LIZIZ(i, skylightData);
        return strLIZIZ == null ? "unknown" : strLIZIZ;
    }

    @Override // X.InterfaceC1595240rcA
    public final String getUid() {
        Long l;
        SkylightData skylightData = this.LLILLJJLI;
        if (skylightData == null || (l = skylightData.uid) == null) {
            return null;
        }
        return l.toString();
    }

    public final int hashCode() {
        if (this.LLILLJJLI.bizType == 7) {
            return C1618440sDa.LIZIZ.LJJLIIIJLLLLLLLZ().getCelebrationEntranceUniqueId(this.LLILLJJLI.templateData).hashCode();
        }
        if (((Number) C279110Awn.LIZ.getValue()).intValue() != 1) {
            return super.hashCode();
        }
        Long l = this.LLILLJJLI.uid;
        if (l != null) {
            return l.hashCode();
        }
        return 0;
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isUnfollow() {
        return C1595950rdJ.LIZIZ(this);
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("skylight_template_");
        sbLIZ.append(this.LLILLJJLI.uid);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return C1598110rgn.LIZIZ;
    }

    @Override // X.InterfaceC1595240rcA
    public final User getUser() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isSingleUser() {
        return this.LLILZ;
    }

    public C1598140rgq(SkylightData skylightData) {
        String string;
        Long l;
        super(skylightData);
        this.LLILLJJLI = skylightData;
        User user = new User();
        if (skylightData != null && (l = skylightData.uid) != null) {
            string = l.toString();
        } else {
            string = null;
        }
        user.setUid(string);
        this.LLILLL = user;
        this.LLILZ = true;
    }

    @Override // X.C1598150rgr, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1598140rgq c1598140rgq;
        SkylightData skylightData;
        boolean z = interfaceC1891350zJl instanceof C1598140rgq;
        if (z && (c1598140rgq = (C1598140rgq) interfaceC1891350zJl) != null && (skylightData = c1598140rgq.LLILLJJLI) != null && skylightData.bizType == 7) {
            C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
            return Intrinsics.LJFF(c1618440sDa.LJJLIIIJLLLLLLLZ().getCelebrationEntranceUniqueId(this.LLILLJJLI.templateData), c1618440sDa.LJJLIIIJLLLLLLLZ().getCelebrationEntranceUniqueId(skylightData.templateData));
        }
        if (((Number) C279110Awn.LIZ.getValue()).intValue() == 1) {
            if (!z) {
                return false;
            }
            return Intrinsics.LJFF(this.LLILLJJLI, ((C1598140rgq) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.C1598150rgr, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1598140rgq c1598140rgq;
        SkylightData skylightData;
        boolean z = interfaceC1891350zJl instanceof C1598140rgq;
        if (z) {
            c1598140rgq = (C1598140rgq) interfaceC1891350zJl;
        } else {
            c1598140rgq = null;
        }
        if (c1598140rgq != null && (skylightData = c1598140rgq.LLILLJJLI) != null && this.LLILLJJLI.bizType == skylightData.bizType && this.LLILLJJLI.bizType == 7) {
            return true;
        }
        if (((Number) C279110Awn.LIZ.getValue()).intValue() == 1) {
            if (!z) {
                return false;
            }
            return Intrinsics.LJFF(this.LLILLJJLI.uid, ((C1598140rgq) interfaceC1891350zJl).LLILLJJLI.uid);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        if (((Number) C279110Awn.LIZ.getValue()).intValue() == 1) {
            if (!(obj instanceof InterfaceC1891350zJl)) {
                return false;
            }
            return areContentsTheSame((InterfaceC1891350zJl) obj);
        }
        return super.equals(obj);
    }

    @Override // X.InterfaceC1598460rhM
    public final String getItemFilterUid(String str) {
        User user;
        String uid;
        SkylightData skylightData = this.LL;
        if (skylightData.bizType == 7) {
            return "ignore";
        }
        CustomBizData customBizData = skylightData.customBizData;
        if (customBizData == null || (user = customBizData.user) == null || (uid = user.getUid()) == null) {
            return "";
        }
        return uid;
    }

    @Override // X.InterfaceC1598460rhM
    public final int getItemPriority(int i) {
        return this.LL.priority;
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        if (!(interfaceC1891350zJl instanceof C1598140rgq)) {
            return C1600110rk1.LIZ("unknown");
        }
        TemplateData templateData = ((C1598140rgq) interfaceC1891350zJl).LLILLJJLI.templateData;
        String str2 = null;
        if (templateData != null) {
            str = templateData.title;
        } else {
            str = null;
        }
        TemplateData templateData2 = this.LLILLJJLI.templateData;
        if (templateData2 != null) {
            str2 = templateData2.title;
        }
        if (!Intrinsics.LJFF(str, str2)) {
            return C1600110rk1.LIZ("title");
        }
        return C1600110rk1.LIZJ();
    }
}
