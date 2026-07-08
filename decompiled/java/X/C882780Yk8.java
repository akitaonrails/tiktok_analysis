package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS132S0110000_14;

/* JADX INFO: renamed from: X.0Yk8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882780Yk8 extends AbstractC880120Yfq {
    public final int LLJ;
    public final int LLJI;

    @Override // X.AbstractC880120Yfq
    public final int LJ() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    @Override // X.AbstractC880120Yfq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI() {
        /*
            r4 = this;
            X.0Ye3 r2 = r4.LLILLL
            boolean r1 = r2 instanceof X.C878950Ydx
            r0 = 0
            if (r1 == 0) goto Ld
            X.0Ydx r2 = (X.C878950Ydx) r2
            if (r2 == 0) goto Ld
            com.ss.android.ugc.aweme.inbox.filter.FilterTabType r0 = r2.LLILLL
        Ld:
            com.ss.android.ugc.aweme.inbox.filter.FilterTabType r1 = com.ss.android.ugc.aweme.inbox.filter.FilterTabType.SECONDARY
            r3 = 1
            if (r0 == r1) goto L31
            X.10Ec r0 = X.C19212010Ec.LIZJ
            java.util.List r0 = r0.LJIIIIZZ()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L31
            X.0Y8T r2 = r4.LLILZ
            if (r2 == 0) goto L34
            X.05RV r1 = X.AbstractC880120Yfq.LIZJ()
            X.05RV r0 = X.C05RV.PRO_CREATOR_INBOX
            if (r1 != r0) goto L32
            r0 = 1
        L2b:
            boolean r0 = X.C879070Ye9.LIZLLL(r2, r0)
            if (r0 != r3) goto L34
        L31:
            return r3
        L32:
            r0 = 0
            goto L2b
        L34:
            X.0Y8T r0 = r4.LLILZ
            if (r0 == 0) goto L31
            boolean r0 = X.C882340YjQ.LJ(r0)
            if (r0 != 0) goto L31
            X.0Y8T r0 = r4.LLILZ
            boolean r0 = X.AbstractC880120Yfq.LJII(r0)
            if (r0 != 0) goto L31
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C882780Yk8.LJI():boolean");
    }

    @Override // X.AbstractC880120Yfq
    public final void LIZ() {
        List<? extends EnumC879080YeA> listSingletonList;
        Boolean bool;
        C0Y8T c0y8t;
        C878950Ydx c878950Ydx;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("move to Secondary, isSpam: ");
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
        String strLIZIZ = C1710306mr.LIZIZ(2131830243, C1383370m6R.LJIIJ(C19212010Ec.LIZJ.LJIIJJI()));
        C866530Xz1 c866530Xz1 = this.LLILZLL;
        List<? extends EnumC879080YeA> listSingletonList2 = Collections.singletonList(EnumC879080YeA.SECONDARY);
        if (z) {
            listSingletonList = C1697810uHb.LJIIJJI(EnumC879080YeA.SPAM, EnumC879080YeA.PRIMARY);
            bool = Boolean.FALSE;
        } else {
            listSingletonList = Collections.singletonList(EnumC879080YeA.PRIMARY);
            bool = null;
        }
        c866530Xz1.LIZIZ(listSingletonList2, listSingletonList, bool, new C914130Ztb(this, strLIZIZ, "SecondaryActionNew", new AwS132S0110000_14(this, z, 7), 2));
        AbstractC880120Yfq.LJFF(this, "secondary", null, null, 6);
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZIZ() {
        return this.LLJI;
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZLLL() {
        return this.LLJ;
    }

    public C882780Yk8(Activity activity, C879540Yeu c879540Yeu, C878950Ydx c878950Ydx) {
        int i;
        super(activity, c879540Yeu, c878950Ydx);
        this.LLJ = C19212010Ec.LIZJ.LJIIJJI();
        if (AbstractC880120Yfq.LIZJ() == C05RV.PRO_CREATOR_INBOX) {
            if (C444960Hcc.LIZIZ()) {
                i = R.raw.icon_folder_arrow_left;
            } else {
                i = R.raw.icon_folder_arrow_right;
            }
        } else {
            i = R.raw.icon_person_arrow_left_right;
        }
        this.LLJI = i;
    }
}
