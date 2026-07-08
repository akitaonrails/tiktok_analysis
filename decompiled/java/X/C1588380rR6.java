package X;

import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.FollowFeedFragmentPanelMT;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.follow.presenter.FollowInsertedResult;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.IStoryService;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveStatusManagerComponent;
import com.ss.android.ugc.feed.platform.panel.live.IFeedDataChangeAbility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0rR6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588380rR6 extends C1255920ims<C1588840rRq> {
    public boolean LLILZIL;
    public InterfaceC666290QBn LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final Fragment LLJ;
    public boolean LLJI;
    public String LLJIJIL;
    public FollowFeedFragmentPanelMT LLJILJIL;
    public InterfaceC1255930imt LLJILJILJ;

    public final void LJIJI() {
        if (this.LLILZIL) {
            this.LLILZIL = false;
            ((C1588840rRq) this.LL).LLILZIL = false;
        }
        if (this.LLIZLLLIL) {
            C1440005kM.LIZ(new C1581940rGi("DISCOVER"));
        } else {
            C1440005kM.LIZ(new C1581940rGi());
        }
    }

    @Override // X.C1255920ims, X.C1260870iur
    public final void LIZ() {
        super.LIZ();
        this.LLJILJILJ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        int i;
        boolean z;
        IFeedDataChangeAbility iFeedDataChangeAbility;
        K k;
        LJIJI();
        InterfaceC666290QBn interfaceC666290QBn = this.LLILZLL;
        if (interfaceC666290QBn != null) {
            interfaceC666290QBn.Uh(true);
        }
        this.LLIZ = false;
        if (this.LL == 0) {
            return;
        }
        C1616470sAP.LIZ.getClass();
        C1616470sAP.LIZ("Follow").LIZJ((InterfaceC20550615bE) this.LL.getData());
        C1588840rRq c1588840rRq = (C1588840rRq) this.LL;
        int i2 = c1588840rRq.mListQueryType;
        if (i2 != 1) {
            if (i2 == 2) {
                K k2 = this.LLILLJJLI;
                if (k2 != 0) {
                    ((InterfaceC1212360hec) k2).mE(c1588840rRq.LJIILIIL(), true ^ ((AbstractC1255880imo) this.LL).isNewDataEmpty());
                }
            } else if (i2 == 4 && (k = this.LLILLJJLI) != 0) {
                ((InterfaceC1212360hec) k).Pj(c1588840rRq.LJIILIIL(), ((AbstractC1255880imo) this.LL).isHasMore() && !((AbstractC1255880imo) this.LL).isNewDataEmpty());
            }
        } else if (c1588840rRq.isDataEmpty()) {
            K k3 = this.LLILLJJLI;
            if (k3 != 0) {
                ((InterfaceC1212360hec) k3).Ng1();
            }
        } else {
            if (this.LLJI) {
                String str = this.LLJIJIL;
                if (str != null && !str.isEmpty()) {
                    T t = this.LL.mData;
                    List<FollowInsertedResult> insertedResults = t == 0 ? null : ((FollowFeedList) t).getInsertedResults();
                    if (insertedResults != null) {
                        i = 20000;
                        for (int i3 = 0; i3 < insertedResults.size(); i3++) {
                            if (this.LLJIJIL.equals(((FollowInsertedResult) ListProtector.get(insertedResults, i3)).awemeId)) {
                                i = ((FollowInsertedResult) ListProtector.get(insertedResults, i3)).code;
                            }
                        }
                    } else {
                        i = 20000;
                    }
                    List<Aweme> listLJIILIIL = ((C1588840rRq) this.LL).LJIILIIL();
                    if (listLJIILIIL != null) {
                        z = false;
                        for (int i4 = 0; i4 < ((ArrayList) listLJIILIIL).size(); i4++) {
                            if (this.LLJIJIL.equals(((Aweme) ListProtector.get(listLJIILIIL, i4)).getAid())) {
                                z = true;
                            }
                        }
                    } else {
                        z = false;
                    }
                    if (i == 20000 && !z) {
                        i = C538540LAe.LLJJJIL;
                    }
                    ((IStoryService) ServiceManager.get().getService(IStoryService.class)).LJIJ(i, this.LLJ.getActivity());
                }
                this.LLJI = false;
                this.LLJIJIL = null;
            }
            K k4 = this.LLILLJJLI;
            if (k4 != 0) {
                ((InterfaceC1212360hec) k4).LLJJJIL(((C1588840rRq) this.LL).LJIILIIL(), ((AbstractC1255880imo) this.LL).isHasMore());
            }
        }
        C0R9P.LIZJ(EnumC1609900rzo.FOLLOW_FEED);
        FollowFeedFragmentPanelMT followFeedFragmentPanelMT = this.LLJILJIL;
        if (followFeedFragmentPanelMT != null) {
            List<FollowFeed> list = ((C1588840rRq) this.LL).LLJ;
            InterfaceC665370Q7z interfaceC665370Q7z = followFeedFragmentPanelMT.LL;
            int i5 = FeedLiveStatusManagerComponent.LLJLIL;
            if (interfaceC665370Q7z == null || (iFeedDataChangeAbility = (IFeedDataChangeAbility) C1558520qew.LIZ(interfaceC665370Q7z, IFeedDataChangeAbility.class, null)) == null) {
                return;
            }
            iFeedDataChangeAbility.kh1(list);
        }
    }

    public C1588380rR6(Fragment fragment) {
        this.LLJ = fragment;
    }

    @Override // X.C1255920ims, X.InterfaceC1255940imu
    public final void Dl(int[] iArr) {
        InterfaceC1255930imt interfaceC1255930imt = this.LLJILJILJ;
        if (interfaceC1255930imt != null) {
            interfaceC1255930imt.IK(iArr);
        }
    }

    @Override // X.C1255920ims, X.InterfaceC1255940imu
    public final void L4(List list) {
        InterfaceC1255930imt interfaceC1255930imt = this.LLJILJILJ;
        if (interfaceC1255930imt != null) {
            interfaceC1255930imt.Js(list);
        }
    }

    @Override // X.C1260870iur
    public final boolean LIZJ(Object... objArr) {
        InterfaceC666290QBn interfaceC666290QBn = this.LLILZLL;
        if (interfaceC666290QBn != null) {
            interfaceC666290QBn.Uh(this.LLIZ);
        }
        C0R9P.LIZLLL(EnumC1609900rzo.FOLLOW_FEED, this.LLJ.getActivity());
        return super.LIZJ(objArr);
    }

    @Override // X.C1255920ims
    public final void LJIILL(InterfaceC1255930imt interfaceC1255930imt) {
        this.LLJILJILJ = interfaceC1255930imt;
    }

    @Override // X.C1255920ims
    public final boolean LJIILLIIL(Object obj) {
        if (obj instanceof Aweme) {
            List items = ((AbstractC1255880imo) this.LL).getItems();
            if (!C086I.LIZIZ(items)) {
                int size = items.size();
                for (int i = 0; i < size; i++) {
                    C0PLT c0plt = (C0PLT) ListProtector.get(items, i);
                    if (TextUtils.equals(((Aweme) obj).getAid(), C735370Ssx.LIZJ(c0plt.getAweme()))) {
                        ((AbstractC1255880imo) this.LL).deleteItem(c0plt);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // X.C1255920ims
    public final int LJIIZILJ(List<Object> list) {
        if (C086I.LIZIZ(list)) {
            return 0;
        }
        List<C0PLT> items = ((AbstractC1255880imo) this.LL).getItems();
        if (C086I.LIZIZ(items)) {
            return 0;
        }
        HashSet hashSet = new HashSet();
        for (Object obj : list) {
            if (obj instanceof Aweme) {
                Aweme aweme = (Aweme) obj;
                if (!TextUtils.isEmpty(aweme.getAid())) {
                    hashSet.add(aweme.getAid());
                }
            }
        }
        if (hashSet.isEmpty()) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (C0PLT c0plt : items) {
            if (hashSet.contains(C735370Ssx.LIZJ(c0plt.getAweme()))) {
                arrayList.add(c0plt);
            }
        }
        return ((AbstractC1255880imo) this.LL).deleteItems(arrayList);
    }

    @Override // X.C1255920ims, X.InterfaceC1255940imu
    public final void Y1(int i) {
        InterfaceC1255930imt interfaceC1255930imt = this.LLJILJILJ;
        if (interfaceC1255930imt != null) {
            interfaceC1255930imt.Y1(i);
        }
    }

    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(final Exception exc) {
        C1616470sAP.LIZ.getClass();
        C1616470sAP.LIZ("Follow").LIZJ(null);
        LJIJI();
        InterfaceC666290QBn interfaceC666290QBn = this.LLILZLL;
        final int i = 1;
        if (interfaceC666290QBn != null) {
            interfaceC666290QBn.Uh(true);
        }
        this.LLIZ = false;
        T t = this.LL;
        if (t == 0) {
            return;
        }
        int i2 = ((AbstractC1255880imo) t).mListQueryType;
        if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                if (i2 != 4) {
                    i = -1;
                } else {
                    K k = this.LLILLJJLI;
                    if (k != 0) {
                        ((InterfaceC1212360hec) k).Wi(exc);
                    }
                }
            } else {
                K k2 = this.LLILLJJLI;
                if (k2 != 0) {
                    ((InterfaceC1212360hec) k2).bD1(exc);
                }
                i = 3;
            }
        } else {
            K k3 = this.LLILLJJLI;
            if (k3 != 0) {
                ((InterfaceC1212360hec) k3).Uq2(exc);
            }
        }
        C15O7.LIZJ(new Callable() { // from class: X.01oj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Exception exc2 = exc;
                int i3 = i;
                C1C7U.LIZ("FullFeedFollowFetchPresenter@364e.trackRequestError$1L");
                int errorCode = exc2 instanceof C23112093u ? ((C23112093u) exc2).getErrorCode() : exc2 instanceof C1494450ozb ? -10001 : exc2 instanceof IOException ? -10002 : -10000;
                String message = exc2.getMessage();
                String stackTraceString = Log.getStackTraceString(exc2);
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(i3, "type");
                c2344009Gk.LIZJ(errorCode, "error_code");
                c2344009Gk.LJIIIIZZ("error_msg", message);
                c2344009Gk.LJIIIIZZ("stack_msg", stackTraceString);
                C20684815ws.LJIILLIIL("follow_feed_request_monitor", c2344009Gk.LIZ);
                C1C7U.LIZIZ("FullFeedFollowFetchPresenter@364e.trackRequestError$1L");
                return null;
            }
        });
        C0R9P.LIZJ(EnumC1609900rzo.FOLLOW_FEED);
    }

    @Override // X.C1255920ims
    public final boolean LJIJ(Object obj, int i) {
        List items = ((AbstractC1255880imo) this.LL).getItems();
        if (C086I.LIZIZ(items)) {
            items = new ArrayList();
        }
        if (i >= 0 && i <= items.size()) {
            ListProtector.add(items, i, obj);
            ((AbstractC1255880imo) this.LL).setItems(items);
            if (this.LLILLJJLI != 0) {
                if (((AbstractC1255880imo) this.LL).isDataEmpty()) {
                    ((InterfaceC1212360hec) this.LLILLJJLI).Ng1();
                    return true;
                }
                w(i, ((C1588840rRq) this.LL).LJIILIIL());
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // X.C1255920ims, X.InterfaceC1255940imu
    public final void w(int i, List list) {
        InterfaceC1255930imt interfaceC1255930imt = this.LLJILJILJ;
        if (interfaceC1255930imt != null) {
            interfaceC1255930imt.w(i, list);
        }
    }
}
