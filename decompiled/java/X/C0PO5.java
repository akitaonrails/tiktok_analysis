package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.search.SearchTabInfo;
import com.ss.android.ugc.aweme.search.ecom.data.ECServerPerfInfo;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.SearchUserLinearLayoutManager;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabAndroidConfig;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabConfig;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.PreRenderInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PO5, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PO5 {
    public final SearchResultParam LIZ;
    public long LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public InterfaceC1201180hMa LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public String LJIILIIL;
    public String LJIILL;
    public String LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public C0PQA LJIJJ;
    public int LJIJJLI;
    public String LJIL;
    public String LJJ;
    public int LJJI;
    public int LJJIFFI;
    public int LJJII;
    public int LJJIIZI;
    public Boolean LJJIJLIJ;
    public int LJJIZ;
    public int LJJJ;
    public int LJJJI;
    public int LJJJIL;
    public int LJJJJ;
    public String LJJJJI;
    public String LJJJJJ;
    public boolean LJJJJJL;
    public long LJJJJL;
    public long LJJJJLL;
    public boolean LJJJLZIJ;
    public final ArrayList<String> LJJJZ;
    public List<? extends SearchMixFeed> LJJL;
    public String LJJLI;
    public SearchMixFeed LJJLIIIIJ;
    public SearchMixFeed LJJLIIIJ;
    public boolean LJJLIIIJILLIZJL;
    public int LJJLIIIJJI;
    public long LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public final ArrayList<String> LJJLIIIJLJLI;
    public long LJJLIIIJLLLLLLLZ;
    public long LJJLIIJ;
    public long LJJLIL;
    public long LJJLJ;
    public long LJJLJLI;
    public int LJJLL;
    public long LJJZ;
    public long LJJZZI;
    public long LJJZZIII;
    public long LJL;
    public boolean LJLI;
    public Integer LJLIIIL;
    public ECServerPerfInfo LJLIIL;
    public String LJLIL;
    public Integer LJLILLLLZI;
    public final ConcurrentLinkedQueue<C0PO6> LJLJI;
    public long LJLJJI;
    public int LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public long LJZ;
    public int LJZI;
    public long LJZL;
    public int LL;
    public long LLD;
    public long LLF;
    public int LLFF;
    public int LLFFF;
    public long LLFII;
    public long LLFZ;
    public long LLI;
    public long LLIFFJFJJ;
    public boolean LLII;
    public long LLIIII;
    public int LLIIIILZ;
    public int LJII = -1;
    public int LJIIL = -1;
    public int LJIILJJIL = -1;
    public long LJIJI = -1;
    public int LJJIII = -1;
    public int LJJIIJ = -1;
    public long LJJIIJZLJL = -1;
    public long LJJIIZ = -1;
    public Integer LJJIJ = 0;
    public long LJJIJIIJI = -1;
    public int LJJIJIIJIL = -1;
    public long LJJIJIL = -1;
    public long LJJIJL = -1;
    public int LJJIL = -1;
    public int LJJJJIZL = C09F5.SUCCESS.getValue();
    public long LJJJJLI = -1;
    public final ArrayList<Long> LJJJJZ = new ArrayList<>();
    public long LJJJJZI = -1;
    public long LJJJLIIL = -1;
    public long LJJJLL = -1;

    public final void LIZLLL() {
        if (Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            return;
        }
        C644060POa c644060POa = C644060POa.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SearchResultParam searchResultParam = this.LIZ;
        c644060POa.getClass();
        C644060POa.LIZ(jCurrentTimeMillis, searchResultParam);
    }

    public final void LJIIJ() {
        if (Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            return;
        }
        this.LJJIFFI = 1;
    }

    public final void LJIIJJI() {
        if (Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            return;
        }
        this.LJJI = 1;
    }

    public final void LJIIL() {
        if (Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            return;
        }
        this.LJIIL = 0;
    }

    public final void LJIILIIL() {
        if (Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            return;
        }
        System.currentTimeMillis();
    }

    public final void LJIILJJIL() {
        if (!Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            if (this.LJI == 0) {
                this.LJI = System.currentTimeMillis();
            }
            this.LJII = C0XF1.LIZ(C1330760kja.LIZ).getValue();
        } else {
            C644060POa c644060POa = C644060POa.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c644060POa.getClass();
            C644060POa.LJI = jCurrentTimeMillis;
        }
    }

    public final void LJIILLIIL() {
        List<C0PO9> listLLIIII = C13LP.LLIIII(C0PO7.LIZ);
        if (!listLLIIII.isEmpty()) {
            for (C0PO9 c0po9 : listLLIIII) {
                if (c0po9.LIZ() > 0) {
                    this.LJJJJZI = c0po9.LIZ();
                }
                if (c0po9.LIZIZ() > 0) {
                    this.LJJJLIIL = c0po9.LIZIZ();
                }
                if (c0po9.LIZLLL() >= 0) {
                    this.LJJJLL = c0po9.LIZLLL();
                }
            }
        }
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            ((C0PO9) it2.next()).LIZJ();
        }
    }

    public final void LJIIZILJ() {
        this.LJIJI = SearchUserLinearLayoutManager.LLILZ;
        SearchUserLinearLayoutManager.LLILZ = -1L;
    }

    public final void LJJIFFI() {
        if (Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            return;
        }
        long j = this.LIZLLL;
        if (j == 0) {
            this.LIZLLL = System.currentTimeMillis();
            return;
        }
        if (this.LJJI == 1) {
            this.LIZLLL = System.currentTimeMillis();
        } else {
            if (this.LJJIJIL <= 0 || j <= 0) {
                return;
            }
            this.LJ = System.currentTimeMillis();
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchResultShowEventV2(tabType=");
        sbLIZ.append(this.LJJIIZI);
        sbLIZ.append(", trigger=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", itemCount=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", cost=");
        sbLIZ.append(this.LJIJJLI);
        sbLIZ.append(", netLogId=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PO5(SearchResultParam searchResultParam) {
        this.LIZ = searchResultParam;
        new ArrayList();
        this.LJJJZ = new ArrayList<>();
        this.LJJL = new ArrayList();
        this.LJJLI = "";
        this.LJJLIIIJJI = -1;
        this.LJJLIIIJJIZ = -1L;
        this.LJJLIIIJLJLI = new ArrayList<>();
        this.LJJLIIIJLLLLLLLZ = -1L;
        this.LJJLIIJ = -1L;
        this.LJJLIL = -1L;
        this.LJJLJ = -1L;
        this.LJJLJLI = -1L;
        this.LJJZ = -1L;
        this.LJJZZI = -1L;
        this.LJJZZIII = -1L;
        this.LJL = -1L;
        this.LJLIIIL = 0;
        this.LJLILLLLZI = 0;
        this.LJLJI = new ConcurrentLinkedQueue<>();
        this.LJLJJL = -1;
        this.LJLLILLLL = -1;
        this.LJLLLL = -1;
        this.LJLZ = -1;
    }

    public final void LIZ(SearchMixFeedList searchMixFeedList) {
        Integer numValueOf;
        long j;
        if (Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            return;
        }
        C0PO6 c0po6 = new C0PO6(System.currentTimeMillis(), searchMixFeedList.LLJ, searchMixFeedList.resultStatus);
        PreRenderInfo preRenderInfo = searchMixFeedList.preRenderInfo;
        if (preRenderInfo != null) {
            numValueOf = Integer.valueOf(preRenderInfo.stage);
        } else {
            numValueOf = null;
        }
        c0po6.LJFF = numValueOf;
        BaseResponse.ServerTimeExtra serverTimeExtra = searchMixFeedList.extra;
        if (serverTimeExtra != null) {
            j = serverTimeExtra.server_stream_time;
        } else {
            j = 0;
        }
        c0po6.LJI = j;
        this.LJLJI.add(c0po6);
    }

    public final void LIZIZ(int i) {
        if (Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            return;
        }
        this.LJIIIZ = i;
    }

    public final void LIZJ(String str) {
        if (Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            return;
        }
        this.LJJJJI = str;
    }

    public final void LJ(String str) {
        if (Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            return;
        }
        this.LJIILL = str;
    }

    public final C0PO6 LJFF(int i) {
        C0PO6 next;
        Iterator<C0PO6> it2 = this.LJLJI.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C0PO6 c0po6 = next;
                if (c0po6 != null && c0po6.LIZ == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public final void LJI(long j) {
        if (Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            return;
        }
        this.LLF += j;
    }

    public final void LJII(String str) {
        if (Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            return;
        }
        this.LJIILIIL = str;
    }

    public final void LJIIIZ(long j) {
        if (Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            return;
        }
        this.LJJIJIL = j;
        this.LJJIJL = this.LJJJJLL;
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(this.LJJLIIIJLJLI.addAll(this.LJJJZ)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LJIILL(long j) {
        if (Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            return;
        }
        if (this.LJJI != 1 && this.LJJIFFI != 1) {
            this.LJJJJL = j;
        } else {
            this.LJJJJL += j;
        }
    }

    public final void LJIJ(InterfaceC1201180hMa interfaceC1201180hMa) {
        if (Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            return;
        }
        this.LJIIIIZZ = interfaceC1201180hMa;
    }

    public final void LJIJI(Throwable th) {
        if (((Boolean) C1821907Bp.LIZIZ.getValue()).booleanValue() && !Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            String message = null;
            if ((th instanceof Exception) && th != null) {
                Throwable cause = th.getCause();
                while (true) {
                    if (cause == null) {
                        break;
                    }
                    if (cause.getCause() != null) {
                        if (cause == null) {
                            break;
                        } else {
                            cause = cause.getCause();
                        }
                    } else if (cause != null) {
                        message = cause.getMessage();
                    }
                }
                this.LJIILLIIL = message;
            }
        }
    }

    public final void LJIJJ(Long l) {
        if (l != null && l.longValue() >= 0) {
            if (this.LJJJJLI == -1) {
                this.LJJJJLI = l.longValue();
            }
            this.LJJJJLL = l.longValue();
            this.LJJJJZ.add(l);
        }
    }

    public final void LJIJJLI(int i) {
        if (this.LJJIII < 0) {
            this.LJJIII = i;
        }
    }

    public final void LJIL(int i) {
        if (Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            return;
        }
        this.LJIILJJIL = i;
        if (i == 0) {
            this.LJIILL = null;
            this.LJIILLIIL = null;
            this.LJIIZILJ = 0;
            return;
        }
        this.LJIIZILJ = 1;
    }

    public final void LJJ(int i) {
        if (Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            return;
        }
        this.LJJIIZI = i;
    }

    public final void LJJI(int i) {
        List<SearchTabInfo> list;
        int i2;
        String str;
        SearchTabConfig searchTabConfig;
        SearchTabAndroidConfig searchTabAndroidConfig;
        if (Intrinsics.LJFF(this, C640870PBt.LIZ)) {
            return;
        }
        C644560PPy.LIZ.getClass();
        if (i == C644560PPy.LJIL()) {
            LJJ(2);
        } else if (i == C644560PPy.LJJ()) {
            LJJ(1);
        } else if (i == C644560PPy.LJIJ()) {
            LJJ(4);
        } else if (i == C644560PPy.LJIIIZ()) {
            LJJ(5);
        } else if (i == C644560PPy.LJIJJLI()) {
            LJJ(0);
        } else if (i == C644560PPy.LJIIL()) {
            LJJ(6);
        } else if (i == C644560PPy.LJIIZILJ()) {
            LJJ(7);
        } else if (i == C644560PPy.LJIILL()) {
            LJJ(8);
        } else if (i == C644560PPy.LJIILJJIL()) {
            LJJ(9);
        } else if (i == C644560PPy.LIZIZ(i)) {
            if (C0BRI.LIZ()) {
                list = C644560PPy.LIZLLL;
            } else {
                list = C644560PPy.LIZJ;
            }
            SearchTabInfo searchTabInfo = (SearchTabInfo) C13LP.LJJJLZIJ(i, list);
            if (searchTabInfo != null && (str = searchTabInfo.tabName) != null && (searchTabConfig = (SearchTabConfig) C0QD9.LIZ().get(str)) != null && (searchTabAndroidConfig = searchTabConfig.androidConfig) != null) {
                i2 = searchTabAndroidConfig.tabType;
            } else {
                i2 = -1;
            }
            LJJ(i2);
        }
        this.LIZ.setIndex(i);
    }

    public final void LJIIIIZZ(int i, long j) {
        C0PO6 c0po6LJFF = LJFF(i);
        if (c0po6LJFF != null) {
            c0po6LJFF.LIZJ = j;
        }
    }
}
