package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Pair;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0Q9d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665670Q9d extends FrameLayout implements InterfaceC1212360hec<SearchUser> {
    public RecyclerView LL;
    public C1749280vcc LLILLJJLI;
    public SearchKeywordPresenter LLILLL;
    public InterfaceC665700Q9g LLILZ;
    public InterfaceC665680Q9e LLILZIL;
    public LifecycleOwner LLILZLL;
    public Fragment LLIZ;
    public C19EG LLIZLLLIL;
    public boolean LLJ;

    @Override // X.InterfaceC1212360hec
    public final void Jm() {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void SY() {
    }

    @Override // X.InterfaceC1212360hec
    public final void bD1(Exception exc) {
    }

    @Override // X.InterfaceC1212360hec
    public final void mE(List<SearchUser> list, boolean z) {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void zK() {
        throw null;
    }

    public final void LIZIZ() {
        if (this.LLJ) {
            InterfaceC665700Q9g interfaceC665700Q9g = this.LLILZ;
            if (interfaceC665700Q9g == null) {
                interfaceC665700Q9g = null;
            }
            Object[] objArr = new Object[3];
            objArr[0] = 1;
            SearchKeywordPresenter searchKeywordPresenter = this.LLILLL;
            objArr[1] = (searchKeywordPresenter != null ? searchKeywordPresenter : null).getKeyword().LIZ;
            objArr[2] = 1;
            interfaceC665700Q9g.LIZJ(objArr);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void LJ() {
        LifecycleOwner lifecycleOwner = this.LLILZLL;
        if (lifecycleOwner == null) {
            lifecycleOwner = null;
        }
        if (LIZ(lifecycleOwner.getLifecycle())) {
            return;
        }
        C786410Ut5.LLLZLZ(getSearchStatusViewFromXml(), 0);
        getSearchStatusViewFromXml().LJ();
    }

    @Override // X.InterfaceC1212360hec
    public final void Ng1() {
        LifecycleOwner lifecycleOwner = this.LLILZLL;
        if (lifecycleOwner == null) {
            lifecycleOwner = null;
        }
        if (LIZ(lifecycleOwner.getLifecycle())) {
            return;
        }
        C786410Ut5.LLLZLZ(getSearchStatusViewFromXml(), 0);
        C1749280vcc searchStatusViewFromXml = getSearchStatusViewFromXml();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C1893080zMY.LJ(c1722300uv6);
        searchStatusViewFromXml.setStatus(c1722300uv6);
    }

    public final RecyclerView getSearchListFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ubr);
            this.LL = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    public final C1749280vcc getSearchStatusViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ueo);
            this.LLILLJJLI = (C1749280vcc) callbackFindViewById;
        }
        return (C1749280vcc) callbackFindViewById;
    }

    @Override // X.InterfaceC1212360hec
    public final void showLoadMoreLoading() {
        LifecycleOwner lifecycleOwner = this.LLILZLL;
        if (lifecycleOwner == null) {
            lifecycleOwner = null;
        }
        if (LIZ(lifecycleOwner.getLifecycle())) {
            return;
        }
        InterfaceC665680Q9e interfaceC665680Q9e = this.LLILZIL;
        (interfaceC665680Q9e != null ? interfaceC665680Q9e : null).showLoadMoreLoading();
    }

    public C665670Q9d(Context context) {
        super(context, null, 0);
        C786410Ut5.Sd(R.layout.c_y, C786410Ut5.ne(context), this);
    }

    public static boolean LIZ(Lifecycle lifecycle) {
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1212360hec
    public final void Uq2(Exception exc) {
        LifecycleOwner lifecycleOwner = this.LLILZLL;
        if (lifecycleOwner == null) {
            lifecycleOwner = null;
        }
        if (LIZ(lifecycleOwner.getLifecycle())) {
            return;
        }
        C786410Ut5.LLLZLZ(getSearchStatusViewFromXml(), 0);
        C786410Ut5.LLIZLLLIL(getSearchListFromXml(), 8);
        C1749280vcc searchStatusViewFromXml = getSearchStatusViewFromXml();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C1893080zMY.LIZ(c1722300uv6, new AwS554S0100000_10(this, 1233));
        searchStatusViewFromXml.setStatus(c1722300uv6);
    }

    @Override // X.InterfaceC1212360hec
    public final void Wi(Exception exc) {
        LifecycleOwner lifecycleOwner = this.LLILZLL;
        InterfaceC665680Q9e interfaceC665680Q9e = null;
        if (lifecycleOwner == null) {
            lifecycleOwner = null;
        }
        if (LIZ(lifecycleOwner.getLifecycle())) {
            return;
        }
        InterfaceC665680Q9e interfaceC665680Q9e2 = this.LLILZIL;
        if (interfaceC665680Q9e2 != null) {
            interfaceC665680Q9e = interfaceC665680Q9e2;
        }
        interfaceC665680Q9e.showLoadMoreError();
    }

    public final void setSearchListFromXml(RecyclerView recyclerView) {
        this.LL = recyclerView;
    }

    public final void setSearchStatusViewFromXml(C1749280vcc c1749280vcc) {
        this.LLILLJJLI = c1749280vcc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1212360hec
    public final void LLJJJIL(List<SearchUser> list, boolean z) {
        int size;
        String imprId;
        SearchUser searchUser;
        LogPbBean logPbBean;
        LifecycleOwner lifecycleOwner = this.LLILZLL;
        if (lifecycleOwner == null) {
            lifecycleOwner = null;
        }
        if (LIZ(lifecycleOwner.getLifecycle())) {
            return;
        }
        int i = 0;
        C786410Ut5.LLIZLLLIL(getSearchListFromXml(), 0);
        SearchKeywordPresenter searchKeywordPresenter = this.LLILLL;
        if (searchKeywordPresenter == null) {
            searchKeywordPresenter = null;
        }
        if (TextUtils.isEmpty(searchKeywordPresenter.getKeyword().LIZ)) {
            return;
        }
        ConcurrentLinkedDeque<Pair<Integer, InterfaceC649890PeN>> concurrentLinkedDeque = C664290Q3v.LIZ;
        LifecycleOwner lifecycleOwner2 = this.LLILZLL;
        if (lifecycleOwner2 == null) {
            lifecycleOwner2 = null;
        }
        InterfaceC649890PeN interfaceC649890PeNLIZIZ = C664290Q3v.LIZIZ(lifecycleOwner2.hashCode());
        InterfaceC649890PeN interfaceC649890PeN = interfaceC649890PeNLIZIZ;
        if (interfaceC649890PeNLIZIZ == null) {
            C1278704zR c1278704zR = new C1278704zR();
            LifecycleOwner lifecycleOwner3 = this.LLILZLL;
            if (lifecycleOwner3 == null) {
                lifecycleOwner3 = null;
            }
            C664290Q3v.LIZLLL(lifecycleOwner3.hashCode(), c1278704zR);
            interfaceC649890PeN = c1278704zR;
        }
        C644910PRh c644910PRh = new C644910PRh();
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (size > 0) {
            if (list == null || (searchUser = (SearchUser) ListProtector.get(list, 0)) == null || (logPbBean = searchUser.logPb) == null || (imprId = logPbBean.getImprId()) == null) {
                imprId = "";
            }
            c644910PRh.LIZ = imprId;
        }
        SearchKeywordPresenter searchKeywordPresenter2 = this.LLILLL;
        if (searchKeywordPresenter2 == null) {
            searchKeywordPresenter2 = null;
        }
        c644910PRh.LIZIZ = searchKeywordPresenter2.getKeyword().LIZ;
        interfaceC649890PeN.LJI(0, c644910PRh);
        C646000PVm c646000PVm = C650950Pg5.Companion;
        Fragment fragment = this.LLIZ;
        C19EG c19eg = this.LLIZLLLIL;
        c646000PVm.getClass();
        if (C646000PVm.LJIIIZ(fragment, c19eg) == null) {
            LifecycleOwner lifecycleOwner4 = this.LLILZLL;
            if (lifecycleOwner4 == null) {
                lifecycleOwner4 = null;
            }
            i = 0;
            C646040PVq.LIZ(lifecycleOwner4, new C650950Pg5(new C650960Pg6(new C664000Q2s("discovery", null, true, true, "", "", 0, 0, false, "", "", ""), new C0Q8L(null, null, null), new C664030Q2v(null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE), new C650940Pg4(null, "", Boolean.FALSE, ""), new C0PYE(0L), new C669560QOc(new C672110QXx(null, null, null, null, null), false, "", false, false, "", "", "", "", "", "", "", null, "", null, "", null, null, false, null, null, false, null, "", null), new C0QJN("", null, null, null, null, null)), new C0PSJ(new C0PRW(0, null, null, null, null, null, null, null, false, null, false, null, 4095, null), new C0PS4(-1, 0, "", new LinkedHashMap(), "", "", ""))), C650950Pg5.class);
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        if (list != null) {
            T t = "";
            if (list.size() > 0) {
                if (list != null) {
                    SearchUser searchUser2 = (SearchUser) ListProtector.get(list, i);
                    t = "";
                    if (searchUser2 != null) {
                        LogPbBean logPbBean2 = searchUser2.logPb;
                        t = "";
                        if (logPbBean2 != null) {
                            String imprId2 = logPbBean2.getImprId();
                            t = "";
                            if (imprId2 != null) {
                                t = imprId2;
                            }
                        }
                    }
                }
                c259800zU.element = t;
            }
        }
        Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(this);
        LifecycleOwner lifecycleOwner5 = this.LLILZLL;
        if (lifecycleOwner5 == null) {
            lifecycleOwner5 = null;
        }
        C646000PVm.LJIILJJIL(fragmentLIZLLL, lifecycleOwner5, new AwS376S0200000_10(c259800zU, (C259800zU<String>) this, (C665670Q9d) 138));
        ISearchContextAbility iSearchContextAbilityLIZ = C0Q3E.LIZ(this);
        if (iSearchContextAbilityLIZ != null) {
            SearchKeywordPresenter searchKeywordPresenter3 = this.LLILLL;
            if (searchKeywordPresenter3 == null) {
                searchKeywordPresenter3 = null;
            }
            iSearchContextAbilityLIZ.fe(new C0PRI(searchKeywordPresenter3.getKeyword().LIZ, (String) c259800zU.element, null, null, null, null, 0, null, false, 508));
        }
        InterfaceC665680Q9e interfaceC665680Q9e = this.LLILZIL;
        if (interfaceC665680Q9e == null) {
            interfaceC665680Q9e = null;
        }
        interfaceC665680Q9e.setShowFooter(true);
        if (!z) {
            InterfaceC665680Q9e interfaceC665680Q9e2 = this.LLILZIL;
            if (interfaceC665680Q9e2 == null) {
                interfaceC665680Q9e2 = null;
            }
            interfaceC665680Q9e2.showLoadMoreEmpty();
        } else {
            InterfaceC665680Q9e interfaceC665680Q9e3 = this.LLILZIL;
            if (interfaceC665680Q9e3 == null) {
                interfaceC665680Q9e3 = null;
            }
            interfaceC665680Q9e3.resetLoadMoreState();
        }
        C786410Ut5.LLLZLZ(getSearchStatusViewFromXml(), 8);
        InterfaceC665680Q9e interfaceC665680Q9e4 = this.LLILZIL;
        if (interfaceC665680Q9e4 == null) {
            interfaceC665680Q9e4 = null;
        }
        interfaceC665680Q9e4.setData(list);
        InterfaceC665700Q9g interfaceC665700Q9g = this.LLILZ;
        if (interfaceC665700Q9g == null) {
            interfaceC665700Q9g = null;
        }
        SearchApiResult searchApiResult = (SearchApiResult) interfaceC665700Q9g.LJI().getData();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "find_friends");
        SearchKeywordPresenter searchKeywordPresenter4 = this.LLILLL;
        if (searchKeywordPresenter4 == null) {
            searchKeywordPresenter4 = null;
        }
        c2344009Gk.LJIIIIZZ("search_keyword", searchKeywordPresenter4.getKeyword().LIZ);
        c2344009Gk.LJIIIIZZ("log_pb", GsonProtectorUtils.toJson(new Gson(), searchApiResult.logPb));
        C20684815ws.LJIJ("search_user", C735370Ssx.LJJJ(c2344009Gk.LIZ));
    }

    @Override // X.InterfaceC1212360hec
    public final void Pj(List<SearchUser> list, boolean z) {
        LifecycleOwner lifecycleOwner = this.LLILZLL;
        InterfaceC665680Q9e interfaceC665680Q9e = null;
        if (lifecycleOwner == null) {
            lifecycleOwner = null;
        }
        if (LIZ(lifecycleOwner.getLifecycle())) {
            return;
        }
        InterfaceC665700Q9g interfaceC665700Q9g = this.LLILZ;
        if (interfaceC665700Q9g == null) {
            interfaceC665700Q9g = null;
        }
        if (!interfaceC665700Q9g.LJIIIIZZ()) {
            InterfaceC665680Q9e interfaceC665680Q9e2 = this.LLILZIL;
            if (interfaceC665680Q9e2 == null) {
                interfaceC665680Q9e2 = null;
            }
            interfaceC665680Q9e2.showLoadMoreEmpty();
        } else {
            InterfaceC665680Q9e interfaceC665680Q9e3 = this.LLILZIL;
            if (interfaceC665680Q9e3 == null) {
                interfaceC665680Q9e3 = null;
            }
            interfaceC665680Q9e3.resetLoadMoreState();
        }
        InterfaceC665680Q9e interfaceC665680Q9e4 = this.LLILZIL;
        if (interfaceC665680Q9e4 != null) {
            interfaceC665680Q9e = interfaceC665680Q9e4;
        }
        interfaceC665680Q9e.setDataAfterLoadMore(list);
    }
}
