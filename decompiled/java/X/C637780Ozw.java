package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mvtemplate.model.MvDetailListModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ozw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637780Ozw extends AbstractC1255880imo<Aweme, MvDetailListModel> {
    public int LL;

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        return ((MvDetailListModel) t).awemeList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isDataEmpty() {
        T t = this.mData;
        if (t != 0) {
            return Intrinsics.LJFF(((MvDetailListModel) t).hasMore, Boolean.FALSE) && C086I.LIZIZ(getItems());
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        Boolean bool;
        T t = this.mData;
        return (t == 0 || (bool = ((MvDetailListModel) t).hasMore) == null || !bool.booleanValue()) ? false : true;
    }

    @Override // X.AbstractC1255880imo
    public final boolean deleteItem(Aweme aweme) {
        return C729980SkG.LIZIZ(getItems(), aweme, this.mNotifyListeners);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, com.ss.android.ugc.aweme.mvtemplate.model.MvDetailListModel] */
    @Override // X.AbstractC666100QAu
    public final void handleData(Object obj) {
        boolean z;
        ArrayList<Aweme> arrayList;
        int iIntValue;
        Aweme aweme;
        String aid;
        Aweme aweme2;
        ?? r9 = (MvDetailListModel) obj;
        if (r9 == 0 || (C086I.LIZIZ(r9.awemeList) && Intrinsics.LJFF(r9.hasMore, Boolean.FALSE))) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!z) {
            ArrayList<Aweme> arrayList2 = r9.awemeList;
            if (arrayList2 != null) {
                Integer numValueOf = Integer.valueOf(arrayList2.size());
                int i = 0;
                while (true) {
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (i >= iIntValue) {
                        break;
                    }
                    ArrayList<Aweme> arrayList3 = r9.awemeList;
                    if (arrayList3 != null) {
                        aweme = (Aweme) ListProtector.get(arrayList3, i);
                    } else {
                        aweme = null;
                    }
                    Aweme awemeLLILLL = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme);
                    ArrayList<Aweme> arrayList4 = r9.awemeList;
                    if (arrayList4 != null && (aweme2 = (Aweme) ListProtector.get(arrayList4, i)) != null) {
                        awemeLLILLL.setIsTop(aweme2.getIsTop());
                    }
                    IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    if (awemeLLILLL != null) {
                        aid = awemeLLILLL.getAid();
                    } else {
                        aid = null;
                    }
                    sbLIZ.append(aid);
                    sbLIZ.append(this.LL + 11000);
                    iRequestIdService.LIZIZ(i, C2188811AlT.LIZIZ(sbLIZ), r9.rid);
                    ArrayList<Aweme> arrayList5 = r9.awemeList;
                    if (arrayList5 != null) {
                        ListProtector.set(arrayList5, i, awemeLLILLL);
                    }
                    LogPbBean logPbBean = r9.logPb;
                    if (logPbBean != null) {
                        C584850Mwl.LIZ.LJI(r9.rid, logPbBean);
                    }
                    i++;
                }
            }
            int i2 = this.mListQueryType;
            if (i2 != 1) {
                if (i2 == 4) {
                    ArrayList<Aweme> arrayList6 = r9.awemeList;
                    if (arrayList6 != null && (arrayList = ((MvDetailListModel) this.mData).awemeList) != null) {
                        arrayList.addAll(arrayList6);
                    }
                    MvDetailListModel mvDetailListModel = (MvDetailListModel) this.mData;
                    mvDetailListModel.cursor = r9.cursor;
                    Boolean bool = r9.hasMore;
                    if (bool == null) {
                        bool = Boolean.FALSE;
                    }
                    mvDetailListModel.hasMore = bool;
                    return;
                }
                return;
            }
            this.mData = r9;
            return;
        }
        T t = this.mData;
        if (t != 0) {
            ((MvDetailListModel) t).hasMore = Boolean.FALSE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        long j;
        int i;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((MvDetailListModel) this.mData).cursor;
        }
        int iIntValue = ((Integer) objArr[2]).intValue();
        if (4 < objArr.length) {
            i = objArr[4];
        } else {
            i = 1;
        }
        int iIntValue2 = ((Integer) i).intValue();
        this.LL = iIntValue;
        C1BVK.LIZIZ().LIZ(this.mHandler, new CallableC637790Ozx(str, j, this, iIntValue2), 0);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        int i;
        String str = (String) objArr[1];
        int iIntValue = ((Integer) objArr[2]).intValue();
        if (6 < objArr.length) {
            i = objArr[6];
        } else {
            i = 1;
        }
        int iIntValue2 = ((Integer) i).intValue();
        this.LL = iIntValue;
        C1BVK.LIZIZ().LIZ(this.mHandler, new CallableC637790Ozx(str, 0L, this, iIntValue2), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.ss.android.ugc.aweme.mvtemplate.model.MvDetailListModel] */
    @Override // X.AbstractC1255880imo
    public final void setItems(List<Aweme> list) {
        if (this.mData == 0) {
            this.mData = new MvDetailListModel();
        }
        T t = this.mData;
        ((MvDetailListModel) t).hasMore = Boolean.TRUE;
        ((MvDetailListModel) t).awemeList = (ArrayList) list;
    }
}
