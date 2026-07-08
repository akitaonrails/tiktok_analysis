package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.aime.model.AIMEDetailListModel;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OCn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615590OCn extends AbstractC1255880imo<Aweme, AIMEDetailListModel> {
    public final HashSet<String> LL = new HashSet<>();
    public final List<Aweme> LLILLJJLI = new ArrayList();
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(2));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        T t = this.mData;
        if (t == 0 || ((AIMEDetailListModel) t).LJ().isEmpty()) {
            return null;
        }
        return ((AIMEDetailListModel) this.mData).LJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isDataEmpty() {
        T t = this.mData;
        return (t == 0 || ((AIMEDetailListModel) t).hasMore == 0) && C086I.LIZIZ(getItems());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        return t != 0 && ((AIMEDetailListModel) t).hasMore == 1;
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr.length >= 4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean deleteItem(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (aweme2 == null) {
            return false;
        }
        ArrayList<Aweme> arrayList = ((AIMEDetailListModel) this.mData).awemeList;
        if (arrayList != null) {
            Iterator<Aweme> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getAid(), aweme2.getAid())) {
                    return C729980SkG.LIZIZ(((AIMEDetailListModel) this.mData).awemeList, aweme2, this.mNotifyListeners);
                }
            }
        }
        List<? extends Aweme> list = ((AIMEDetailListModel) this.mData).topAwemeList;
        if (list == null) {
            return false;
        }
        Iterator<? extends Aweme> it3 = list.iterator();
        while (it3.hasNext()) {
            if (Intrinsics.LJFF(it3.next().getAid(), aweme2.getAid())) {
                boolean zLIZIZ = C729980SkG.LIZIZ(((AIMEDetailListModel) this.mData).topAwemeList, aweme2, this.mNotifyListeners);
                if (!zLIZIZ) {
                    return zLIZIZ;
                }
                C19719612Di.LJJIIJ(this.LLILLJJLI, new C5183020f(aweme2, 1), true);
                return zLIZIZ;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, com.ss.android.ugc.aweme.aime.model.AIMEDetailListModel] */
    @Override // X.AbstractC666100QAu
    public final void handleData(Object obj) {
        ArrayList<Aweme> arrayListLJ;
        boolean z;
        ArrayList<Aweme> arrayList;
        Iterator<Aweme> it2;
        ArrayList<Aweme> arrayList2;
        String aid;
        ?? r10 = (AIMEDetailListModel) obj;
        if (r10 != 0) {
            arrayListLJ = r10.LJ();
        } else {
            arrayListLJ = null;
        }
        if (r10 != 0 && arrayListLJ != null && !arrayListLJ.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        this.mIsNewDataEmpty = z;
        if (!z && arrayListLJ != null) {
            int size = arrayListLJ.size();
            for (int i = 0; i < size; i++) {
                Aweme awemeLLILLL = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL((Aweme) ListProtector.get(arrayListLJ, i));
                IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                if (awemeLLILLL != null) {
                    aid = awemeLLILLL.getAid();
                } else {
                    aid = null;
                }
                sbLIZ.append(aid);
                sbLIZ.append("25052");
                iRequestIdService.LIZIZ(i, C2188811AlT.LIZIZ(sbLIZ), r10.getRequestId());
                if (awemeLLILLL != null) {
                    ListProtector.set(arrayListLJ, i, awemeLLILLL);
                }
            }
            ArrayList<Aweme> arrayList3 = r10.awemeList;
            if ((arrayList3 == null || !arrayList3.isEmpty()) && (arrayList = r10.awemeList) != null && (it2 = arrayList.iterator()) != null) {
                while (it2.hasNext()) {
                    Aweme next = it2.next();
                    if (next.getAid() != null && !this.LL.contains(next.getAid())) {
                        this.LL.add(next.getAid());
                    } else {
                        it2.remove();
                    }
                }
            }
            int i2 = this.mListQueryType;
            if (i2 != 1) {
                if (i2 == 4) {
                    ArrayList<Aweme> arrayList4 = r10.awemeList;
                    if (arrayList4 != null && (arrayList2 = ((AIMEDetailListModel) this.mData).awemeList) != null) {
                        arrayList2.addAll(arrayList4);
                    }
                    AIMEDetailListModel aIMEDetailListModel = (AIMEDetailListModel) this.mData;
                    aIMEDetailListModel.cursor = r10.cursor;
                    aIMEDetailListModel.hasMore = r10.hasMore;
                    aIMEDetailListModel.pageExtra = r10.pageExtra;
                    return;
                }
                return;
            }
            this.mData = r10;
            ((ArrayList) this.LLILLJJLI).clear();
            List<? extends Aweme> list = r10.topAwemeList;
            if (list == null) {
                return;
            }
            ((ArrayList) this.LLILLJJLI).addAll(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        int size;
        AIMEDetailListModel aIMEDetailListModel;
        ArrayList<Aweme> arrayList = ((AIMEDetailListModel) this.mData).awemeList;
        if (arrayList != null) {
            size = arrayList.size();
        } else {
            size = 0;
        }
        long j = 0;
        if (size > 0 && (aIMEDetailListModel = (AIMEDetailListModel) this.mData) != null && aIMEDetailListModel.cursor == 0) {
            return;
        }
        String str = (String) objArr[1];
        if (!isDataEmpty()) {
            j = ((AIMEDetailListModel) this.mData).cursor;
        }
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLILLL.getValue(), null, null, new C615600OCo(str, j, this, null), 3);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        this.LL.clear();
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLILLL.getValue(), null, null, new C615600OCo((String) objArr[1], 0L, this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, com.ss.android.ugc.aweme.aime.model.AIMEDetailListModel] */
    @Override // X.AbstractC1255880imo
    public final void setItems(List<Aweme> list) {
        if (this.mData == 0) {
            this.mData = new AIMEDetailListModel();
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : list) {
                Aweme aweme2 = aweme;
                Iterator<Aweme> it2 = this.LLILLJJLI.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(aweme2.getAid(), it2.next().getAid())) {
                            break;
                        }
                    } else {
                        arrayList.add(aweme);
                        break;
                    }
                }
            }
            ArrayList<Aweme> arrayList2 = new ArrayList<>();
            arrayList2.addAll(arrayList);
            T t = this.mData;
            ((AIMEDetailListModel) t).awemeList = arrayList2;
            ((AIMEDetailListModel) t).topAwemeList = C13LP.LLIIII(this.LLILLJJLI);
        }
    }
}
