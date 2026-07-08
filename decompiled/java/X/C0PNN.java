package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.model.SearchUserList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0PNN, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PNN extends C643800PNa<C0PNM> implements InterfaceC665700Q9g {
    @Override // X.InterfaceC665700Q9g
    public final /* bridge */ /* synthetic */ AbstractC1255880imo LJI() {
        return (AbstractC1255880imo) this.LL;
    }

    @Override // X.InterfaceC665700Q9g
    public final boolean LJIIIIZZ() {
        T t = this.LL;
        return t != 0 && ((AbstractC1255880imo) t).isHasMore();
    }

    public C0PNN() {
        LJIIJ(new C0PN2<SearchUser, SearchUserList>() { // from class: X.0PNM
            @Override // X.C0PN2
            public final int LJIJ() {
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1255880imo
            public final boolean isHasMore() {
                T t = this.mData;
                return t != 0 && ((SearchUserList) t).hasMore;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0PN2, X.AbstractC666100QAu
            /* JADX INFO: renamed from: LJJI, reason: merged with bridge method [inline-methods] */
            public final void handleData(SearchUserList searchUserList) {
                T t;
                User user;
                super.handleData(searchUserList);
                List<SearchUser> list = searchUserList.userList;
                boolean zLIZIZ = C086I.LIZIZ(list);
                this.mIsNewDataEmpty = zLIZIZ;
                boolean z = false;
                if (!zLIZIZ) {
                    for (SearchUser searchUser : list) {
                        searchUser.mGlobalDoodleConfig = searchUserList.globalDoodleConfig;
                        if (!searchUser.isDynamicCard() && (user = searchUser.user) != null) {
                            user.setRequestId(this.LLJILJILJ);
                        }
                        searchUser.logPb = searchUserList.logPb;
                    }
                    int i = this.mListQueryType;
                    if (i != 1) {
                        if (i == 4) {
                            LJIIJ(list);
                            T t2 = this.mData;
                            SearchUserList searchUserList2 = (SearchUserList) t2;
                            if (searchUserList.hasMore && ((SearchUserList) t2).hasMore) {
                                z = true;
                            }
                            searchUserList2.hasMore = z;
                            ((SearchUserList) t2).cursor = searchUserList.cursor;
                            return;
                        }
                        return;
                    }
                    this.mData = searchUserList;
                    searchUserList.userList = new ArrayList();
                    LJIL(list);
                    return;
                }
                int i2 = this.mListQueryType;
                if (i2 != 1) {
                    if (i2 == 4 && (t = this.mData) != 0) {
                        SearchUserList searchUserList3 = (SearchUserList) t;
                        if (searchUserList.hasMore && ((SearchUserList) t).hasMore) {
                            z = true;
                        }
                        searchUserList3.hasMore = z;
                        if (((SearchUserList) t).hasMore) {
                            ((SearchUserList) t).cursor = searchUserList.cursor;
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.mData = searchUserList;
                LJIIL();
                T t3 = this.mData;
                if (t3 != 0) {
                    ((SearchUserList) t3).hasMore = false;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1255880imo
            public final void loadMoreList(Object... objArr) {
                int iIntValue;
                C0PSG c0psg;
                int i;
                String sugUserId;
                String isRichSug;
                C19EG c19eg;
                Integer num;
                String sugGenerateType;
                if (objArr.length > 3) {
                    iIntValue = ((Integer) objArr[3]).intValue();
                } else {
                    iIntValue = 0;
                }
                String strLJLIL = null;
                if (objArr.length > 4) {
                    c0psg = (C0PSG) objArr[4];
                } else {
                    c0psg = null;
                }
                String strLJIILIIL = LJIILIIL(objArr);
                if (isDataEmpty()) {
                    i = 0;
                } else {
                    i = ((SearchUserList) this.mData).cursor;
                }
                long j = i;
                String str = this.LLJJI;
                if (str == null) {
                    str = "";
                }
                String strLJIILLIIL = LJIILLIIL();
                int i2 = this.LLJILJIL;
                String str2 = this.LLJILLL;
                SearchResultParam searchResultParam = this.LLILZ;
                if (searchResultParam != null) {
                    sugUserId = searchResultParam.getSugUserId();
                } else {
                    sugUserId = null;
                }
                SearchResultParam searchResultParam2 = this.LLILZ;
                if (searchResultParam2 != null) {
                    isRichSug = searchResultParam2.getIsRichSug();
                } else {
                    isRichSug = null;
                }
                String str3 = this.LLJJIJIIJIL;
                Fragment fragmentLJIILJJIL = LJIILJJIL();
                WeakReference<C19EG> weakReference = this.LLIZ;
                if (weakReference != null) {
                    c19eg = weakReference.get();
                } else {
                    c19eg = null;
                }
                String strLIZ = C0Q3Q.LIZ(c19eg, fragmentLJIILJJIL, this.LLILZ);
                if (ComplianceServiceProvider.LJI().LJJII()) {
                    num = 1;
                } else {
                    num = null;
                }
                SearchResultParam searchResultParam3 = this.LLILZ;
                if (searchResultParam3 != null) {
                    sugGenerateType = searchResultParam3.getSugGenerateType();
                } else {
                    sugGenerateType = null;
                }
                IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
                if (iEcomSearchService != null) {
                    strLJLIL = iEcomSearchService.LJLIL(null, "");
                }
                SearchRequestParam searchRequestParam = new SearchRequestParam(strLJIILIIL, 0, str2, "", i2, iIntValue, str, str3, j, 10, strLJIILLIIL, null, null, sugUserId, isRichSug, null, "", null, null, null, null, null, null, null, null, strLIZ, null, num, sugGenerateType, null, null, null, null, null, null, strLJLIL, null, null, 0, 0, 0, false, c0psg, null, C2097608Jq.LJ());
                C644370PPf c644370PPf = new C644370PPf(this, searchRequestParam);
                c644370PPf.LLILLJJLI = searchRequestParam.LIZIZ;
                this.LLIZLLLIL = c644370PPf;
                C1BVK.LIZIZ().LIZ(this.mHandler, c644370PPf, 0);
            }

            @Override // X.AbstractC1255880imo
            public final void refreshList(Object... objArr) {
                int iIntValue;
                C0PSG c0psg;
                String sugUserId;
                String isRichSug;
                C19EG c19eg;
                Integer num;
                String sugGenerateType;
                if (objArr.length > 3) {
                    iIntValue = ((Integer) objArr[3]).intValue();
                } else {
                    iIntValue = 0;
                }
                String strLJLIL = null;
                if (objArr.length > 4) {
                    c0psg = (C0PSG) objArr[4];
                } else {
                    c0psg = null;
                }
                String strLJIILIIL = LJIILIIL(objArr);
                String strLJIILLIIL = LJIILLIIL();
                int i = this.LLJILJIL;
                String str = this.LLJILLL;
                SearchResultParam searchResultParam = this.LLILZ;
                if (searchResultParam != null) {
                    sugUserId = searchResultParam.getSugUserId();
                } else {
                    sugUserId = null;
                }
                SearchResultParam searchResultParam2 = this.LLILZ;
                if (searchResultParam2 != null) {
                    isRichSug = searchResultParam2.getIsRichSug();
                } else {
                    isRichSug = null;
                }
                String str2 = this.LLJJIJIIJIL;
                C01GW<C669480QNu> c01gw = C669480QNu.LJ;
                String strLIZJ = C326370Cqp.LIZ().LIZJ();
                Fragment fragmentLJIILJJIL = LJIILJJIL();
                WeakReference<C19EG> weakReference = this.LLIZ;
                if (weakReference != null) {
                    c19eg = weakReference.get();
                } else {
                    c19eg = null;
                }
                String strLIZ = C0Q3Q.LIZ(c19eg, fragmentLJIILJJIL, this.LLILZ);
                if (ComplianceServiceProvider.LJI().LJJII()) {
                    num = 1;
                } else {
                    num = null;
                }
                SearchResultParam searchResultParam3 = this.LLILZ;
                if (searchResultParam3 != null) {
                    sugGenerateType = searchResultParam3.getSugGenerateType();
                } else {
                    sugGenerateType = null;
                }
                long j = ((C0PM7) C0Q3E.LJI().ak0().LIZJ()).LL;
                C662670Pyz.LIZ.getClass();
                String strLIZ2 = C662670Pyz.LIZ();
                IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
                if (iEcomSearchService != null) {
                    strLJLIL = iEcomSearchService.LJLIL(null, "");
                }
                Map<String, String> mapLIZ = C0P91.LIZ(this.LLILZ);
                if (mapLIZ == null) {
                    mapLIZ = C2097608Jq.LJ();
                }
                SearchRequestParam searchRequestParam = new SearchRequestParam(strLJIILIIL, 0, str, "", i, iIntValue, "", str2, 0L, 10, strLJIILLIIL, null, null, sugUserId, isRichSug, null, strLIZJ, null, null, null, null, null, null, null, null, strLIZ, null, num, sugGenerateType, null, Long.valueOf(j), null, strLIZ2, null, null, strLJLIL, null, null, 0, 0, 0, false, c0psg, null, mapLIZ);
                C644370PPf c644370PPf = new C644370PPf(this, searchRequestParam);
                c644370PPf.LLILLJJLI = searchRequestParam.LIZIZ;
                this.LLIZLLLIL = c644370PPf;
                C1BVK.LIZIZ().LIZ(this.mHandler, c644370PPf, 0);
            }
        });
    }

    @Override // X.C643800PNa, X.InterfaceC665700Q9g
    public final void LJFF(String str) {
        T t = this.LL;
        if (t != 0) {
            ((C0PN2) t).LLJILLL = str;
        }
    }
}
