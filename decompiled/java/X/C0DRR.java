package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.ng.model.SearchAwemePoolEnterInnerFlowRequestNG;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.ng.viewmodel.SearchAwemePoolViewModelNG;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0DRR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DRR implements C0DRX {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJII;
    public final SearchAwemePoolViewModelNG LIZ;
    public final List<String> LIZIZ;
    public final SearchAwemePoolEnterInnerFlowRequestNG.LoadMoreRequest LIZJ;
    public Long LIZLLL;
    public final List<Aweme> LJ;
    public boolean LJFF;
    public volatile C09U0 LJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0DRR.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LJII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final C09U0 LIZIZ() {
        C09U0 c09u0 = this.LJI;
        if (c09u0 == null) {
            synchronized (this) {
                c09u0 = this.LJI;
                if (c09u0 == null) {
                    C09U0 c09u02 = (C09U0) C1807670x8n.p();
                    this.LJI = c09u02;
                    return c09u02;
                }
            }
        }
        return c09u0;
    }

    @Override // X.C0DRX
    public final List<Aweme> getAwemeList() {
        return this.LJ;
    }

    @Override // X.C0DRX
    public final boolean getHasMore() {
        return this.LJFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    @Override // X.C0DRX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>> r16) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DRR.LIZ(X.05Vn):java.lang.Object");
    }

    public C0DRR(SearchAwemePoolViewModelNG searchAwemePoolViewModelNG, List<String> list, SearchAwemePoolEnterInnerFlowRequestNG.LoadMoreRequest loadMoreRequest) {
        this.LIZ = searchAwemePoolViewModelNG;
        this.LIZIZ = list;
        this.LIZJ = loadMoreRequest;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            Aweme aweme = this.LIZ.LL.get(it2.next());
            if (aweme != null) {
                arrayList2.add(aweme);
            }
        }
        arrayList.addAll(arrayList2);
        this.LJ = arrayList;
        this.LJFF = true;
    }
}
