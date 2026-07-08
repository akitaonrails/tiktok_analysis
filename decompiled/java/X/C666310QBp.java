package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0QBp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C666310QBp extends AbstractC1216410hl9<FollowingFeedListModel, C1255920ims<FollowingFeedListModel>> implements InterfaceC1216440hlC {
    @Override // X.InterfaceC1216440hlC
    public final /* synthetic */ boolean aH0() {
        return true;
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 9001;
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final boolean isLoading() {
        return super.isLoading();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [PRESENTER extends X.0ims<MODEL>, X.0QBo] */
    public C666310QBp(List<String> list, List<String> list2) {
        this.mModel = new FollowingFeedListModel(list, list2);
        this.mPresenter = new C1255920ims<FollowingFeedListModel>() { // from class: X.0QBo
            public final List<Aweme> LLILZIL = new ArrayList();

            @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
            public final void onSuccess() {
                T t = this.LL;
                if (t == 0 || this.LLILLJJLI == 0) {
                    return;
                }
                AbstractC1255880imo abstractC1255880imo = (AbstractC1255880imo) t;
                int i = abstractC1255880imo.mListQueryType;
                if (i == 1) {
                    if (!abstractC1255880imo.isDataEmpty()) {
                        ((ArrayList) this.LLILZIL).clear();
                        int i2 = 0;
                        for (Aweme aweme : ((AbstractC1255880imo) this.LL).getItems()) {
                            ListProtector.set(((AbstractC1255880imo) this.LL).getItems(), i2, ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme));
                            ((ArrayList) this.LLILZIL).add(aweme);
                            i2++;
                        }
                        ((InterfaceC1212360hec) this.LLILLJJLI).LLJJJIL(this.LLILZIL, ((AbstractC1255880imo) this.LL).isHasMore() && !((AbstractC1255880imo) this.LL).isNewDataEmpty());
                    }
                    if (((ArrayList) this.LLILZIL).size() != 0 || ((AbstractC1255880imo) this.LL).isHasMore()) {
                        return;
                    }
                    ((InterfaceC1212360hec) this.LLILLJJLI).Ng1();
                    return;
                }
                if (i != 2) {
                    if (i == 4) {
                        int i3 = 0;
                        for (Aweme aweme2 : abstractC1255880imo.getItems()) {
                            ListProtector.set(((AbstractC1255880imo) this.LL).getItems(), i3, ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme2));
                            ((ArrayList) this.LLILZIL).add(aweme2);
                            i3++;
                        }
                        ((InterfaceC1212360hec) this.LLILLJJLI).Pj(this.LLILZIL, ((AbstractC1255880imo) this.LL).isHasMore() && !((AbstractC1255880imo) this.LL).isNewDataEmpty());
                        return;
                    }
                    return;
                }
                if (!abstractC1255880imo.isDataEmpty()) {
                    int i4 = 0;
                    for (Aweme aweme3 : ((AbstractC1255880imo) this.LL).getItems()) {
                        ListProtector.set(((AbstractC1255880imo) this.LL).getItems(), i4, ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme3));
                        ListProtector.add(this.LLILZIL, i4, aweme3);
                        i4++;
                    }
                    InterfaceC1212360hec interfaceC1212360hec = (InterfaceC1212360hec) this.LLILLJJLI;
                    List<Aweme> list3 = this.LLILZIL;
                    FollowingFeedListModel followingFeedListModel = (FollowingFeedListModel) this.LL;
                    if (!followingFeedListModel.hasMoreHeader && followingFeedListModel.isNewDataEmpty()) {
                        z = false;
                    }
                    interfaceC1212360hec.mE(list3, z);
                }
                if (((ArrayList) this.LLILZIL).size() != 0 || ((AbstractC1255880imo) this.LL).isHasMore()) {
                    return;
                }
                ((InterfaceC1212360hec) this.LLILLJJLI).Ng1();
            }

            @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
            public final void onFailed(Exception exc) {
                K k;
                T t = this.LL;
                if (t != 0 && (k = this.LLILLJJLI) != 0) {
                    if (((AbstractC1255880imo) t).mListQueryType == 2 && (exc instanceof C666320QBq)) {
                        ((InterfaceC1212360hec) k).mE(this.LLILZIL, false);
                    } else {
                        super.onFailed(exc);
                    }
                }
            }
        };
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        this.mPresenter.LIZJ(Integer.valueOf(i), c2189821An6.getSelectedUid());
    }
}
