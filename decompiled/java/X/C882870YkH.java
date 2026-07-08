package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS258S0300000_14;

/* JADX INFO: renamed from: X.0YkH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882870YkH extends AbstractC880120Yfq {
    public final boolean LLJ;
    public final int LLJI;
    public final int LLJIJIL;

    @Override // X.AbstractC880120Yfq
    public final int LJ() {
        return 0;
    }

    @Override // X.AbstractC880120Yfq
    public final void LIZ() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.LLJ) {
            arrayList2.add(EnumC879080YeA.STARRED);
        } else {
            arrayList.add(EnumC879080YeA.STARRED);
        }
        AbstractC879060Ye8.LIZJ(this.LLILZLL, arrayList, arrayList2, null, new C914130Ztb(this, C1383370m6R.LJIIJ(this.LLJ ? 2131845373 : 2131845372), "StarredAction", new AwS258S0300000_14(this, (C882870YkH) arrayList2, (List<EnumC879080YeA>) arrayList, (List<EnumC879080YeA>) 18), 2), 4);
        AbstractC880120Yfq.LJFF(this, this.LLJ ? "unstar" : "star", null, null, 6);
    }

    @Override // X.AbstractC880120Yfq
    public final boolean LJI() {
        C878950Ydx c878950Ydx;
        if (!C19212010Ec.LIZJ.LIZLLL()) {
            return true;
        }
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLL;
        FilterTabType filterTabType = null;
        if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null) {
            filterTabType = c878950Ydx.LLILLL;
        }
        return filterTabType == FilterTabType.SPAM || AbstractC880120Yfq.LJII(this.LLILZ);
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZIZ() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZLLL() {
        return this.LLJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C882870YkH(android.app.Activity r3, X.C879540Yeu r4, X.C878950Ydx r5) {
        /*
            r2 = this;
            r2.<init>(r3, r4, r5)
            X.0Y8T r0 = r2.LLILZ
            if (r0 == 0) goto L27
            boolean r0 = X.C879070Ye9.LJFF(r0)
            r1 = 1
            if (r0 != r1) goto L27
        Le:
            r2.LLJ = r1
            if (r1 == 0) goto L23
            r0 = 2131845353(0x7f1160e9, float:1.9324125E38)
        L15:
            r2.LLJI = r0
            if (r1 == 0) goto L1f
            r0 = 2130774744(0x7f010ad8, float:1.7152672E38)
        L1c:
            r2.LLJIJIL = r0
            return
        L1f:
            r0 = 2130774732(0x7f010acc, float:1.7152647E38)
            goto L1c
        L23:
            r0 = 2131845352(0x7f1160e8, float:1.9324123E38)
            goto L15
        L27:
            r1 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C882870YkH.<init>(android.app.Activity, X.0Yeu, X.0Ydx):void");
    }
}
