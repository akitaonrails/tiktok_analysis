package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS132S0110000_14;

/* JADX INFO: renamed from: X.0Yk7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882770Yk7 extends AbstractC880120Yfq {
    public final int LLJ;
    public final int LLJI;

    @Override // X.AbstractC880120Yfq
    public final int LJ() {
        return 0;
    }

    @Override // X.AbstractC880120Yfq
    public final boolean LJI() {
        FilterTabType filterTabType;
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLL;
        C878950Ydx c878950Ydx = interfaceC879010Ye3 instanceof C878950Ydx ? (C878950Ydx) interfaceC879010Ye3 : null;
        if ((c878950Ydx == null || (filterTabType = c878950Ydx.LLILLL) == null || (filterTabType != FilterTabType.PRIMARY && filterTabType != FilterTabType.ARCHIVE)) && C19212010Ec.LIZJ.LJIIIIZZ().contains(FilterTabType.PRIMARY)) {
            C0Y8T c0y8t = this.LLILZ;
            if (c0y8t != null) {
                if (C879070Ye9.LIZJ(c0y8t, AbstractC880120Yfq.LIZJ() == C05RV.PRO_CREATOR_INBOX)) {
                    return true;
                }
            }
            C0Y8T c0y8t2 = this.LLILZ;
            if (c0y8t2 != null && !C882340YjQ.LJ(c0y8t2) && !AbstractC880120Yfq.LJII(this.LLILZ)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC880120Yfq
    public final void LIZ() {
        List<? extends EnumC879080YeA> listLJIIJJI;
        Boolean bool;
        C0Y8T c0y8t;
        C878950Ydx c878950Ydx;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("move to primary, isSpam: ");
        C0Y8T c0y8t2 = this.LLILZ;
        sbLIZ.append(c0y8t2 != null ? Boolean.valueOf(C879070Ye9.LJ(c0y8t2, false)) : null);
        sbLIZ.append(", current category: ");
        C0Y8T c0y8t3 = this.LLILZ;
        sbLIZ.append(c0y8t3 != null ? Integer.valueOf(c0y8t3.getCategory()) : null);
        sbLIZ.append(", curPage: ");
        sbLIZ.append(this.LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLL;
        boolean z = ((!(interfaceC879010Ye3 instanceof C878950Ydx) || (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) == null) ? null : c878950Ydx.LLILLL) == FilterTabType.SPAM && (c0y8t = this.LLILZ) != null && C879070Ye9.LJ(c0y8t, false);
        String strLIZIZ = C1710306mr.LIZIZ(2131830242, C1383370m6R.LJIIJ(C19212010Ec.LIZJ.LJI()));
        C866530Xz1 c866530Xz1 = this.LLILZLL;
        List<? extends EnumC879080YeA> listSingletonList = Collections.singletonList(EnumC879080YeA.PRIMARY);
        if (z || AbstractC880120Yfq.LIZJ() == C05RV.PRO_CREATOR_INBOX) {
            listLJIIJJI = C1697810uHb.LJIIJJI(EnumC879080YeA.SPAM, EnumC879080YeA.SECONDARY);
            if (z) {
                bool = Boolean.FALSE;
            }
            c866530Xz1.LIZIZ(listSingletonList, listLJIIJJI, bool, new C914130Ztb(this, strLIZIZ, "PrimaryAction", new AwS132S0110000_14(this, z, 6), 2));
            AbstractC880120Yfq.LJFF(this, "primary", null, null, 6);
        }
        listLJIIJJI = Collections.singletonList(EnumC879080YeA.SECONDARY);
        bool = null;
        c866530Xz1.LIZIZ(listSingletonList, listLJIIJJI, bool, new C914130Ztb(this, strLIZIZ, "PrimaryAction", new AwS132S0110000_14(this, z, 6), 2));
        AbstractC880120Yfq.LJFF(this, "primary", null, null, 6);
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZIZ() {
        return this.LLJI;
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZLLL() {
        return this.LLJ;
    }

    public C882770Yk7(Activity activity, C879540Yeu c879540Yeu, C878950Ydx c878950Ydx) {
        int i;
        super(activity, c879540Yeu, c878950Ydx);
        this.LLJ = C19212010Ec.LIZJ.LJI();
        if (AbstractC880120Yfq.LIZJ() == C05RV.PRO_CREATOR_INBOX) {
            if (C444960Hcc.LIZIZ()) {
                i = R.raw.icon_folder_arrow_right;
            } else {
                i = R.raw.icon_folder_arrow_left;
            }
        } else {
            i = R.raw.icon_person_arrow_left_right;
        }
        this.LLJI = i;
    }
}
