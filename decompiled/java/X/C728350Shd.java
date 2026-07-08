package X;

import Y.AfS147S0200000_11;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Shd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728350Shd extends AbstractC1255880imo<Aweme, Aweme> {
    public final String LL;
    public final Aweme LLILLJJLI;
    public final List<Aweme> LLILLL;
    public final C11NJ LLILZ;

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        return false;
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
    }

    @Override // X.AbstractC666100QAu
    public final Object getData() {
        return C13LP.LJJJLL(this.LLILLL);
    }

    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        InterfaceC729990SkH interfaceC729990SkHLJJIZ = C1618440sDa.LIZIZ.LJJIZ();
        if (interfaceC729990SkHLJJIZ != null) {
            interfaceC729990SkHLJJIZ.LJ(8);
        }
        C730000SkI.LIZIZ.LIZJ(249372176, 4);
        boolean z = false;
        if (Intrinsics.LJFF(this.LL, "reveal_story")) {
            C728370Shf.LIZ.getClass();
            this.LLILZ.LIZ(C11NZ.LJIJJLI(new C2502209rI(C0PEM.LIZJ, new C095D(new C06Y2(0L, null, false)), 1)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS147S0200000_11(this, interfaceC729990SkHLJJIZ, 16), new AfS147S0200000_11(this, interfaceC729990SkHLJJIZ, 17)));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshList start uid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" cachedAweme=");
        if (this.LLILLJJLI != null) {
            z = true;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZ.LIZ(C728370Shf.LIZ(C728370Shf.LIZ, Collections.singletonList(this.LL).toString(), null, 0, null, 14).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS147S0200000_11(this, interfaceC729990SkHLJJIZ, 14), new AfS147S0200000_11(this, interfaceC729990SkHLJJIZ, 15)));
    }

    public C728350Shd(String str, Aweme aweme) {
        this.LL = str;
        this.LLILLJJLI = aweme;
        ArrayList arrayList = new ArrayList();
        this.LLILLL = arrayList;
        this.LLILZ = new C11NJ();
        if (aweme != null) {
            arrayList.add(aweme);
            C727760Sgg.LIZ.getClass();
            C727760Sgg.LIZ(aweme);
        }
    }
}
