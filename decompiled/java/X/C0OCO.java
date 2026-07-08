package X;

import android.os.Message;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailAwemeListModel;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OCO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OCO extends AbstractC1255880imo<Aweme, AIPortraitDetailAwemeListModel> {
    public final HashSet<String> LL = new HashSet<>();
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(527));

    public final void LJIIJJI() {
        Message message = new Message();
        AIPortraitDetailAwemeListModel aIPortraitDetailAwemeListModel = new AIPortraitDetailAwemeListModel();
        aIPortraitDetailAwemeListModel.awemeList = new ArrayList<>();
        aIPortraitDetailAwemeListModel.cursor = 0L;
        aIPortraitDetailAwemeListModel.hasMore = Boolean.FALSE;
        message.obj = aIPortraitDetailAwemeListModel;
        message.arg1 = 8;
        this.mHandler.sendMessage(message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        T t = this.mData;
        if (t == 0 || ((AIPortraitDetailAwemeListModel) t).LJ().isEmpty()) {
            return null;
        }
        return ((AIPortraitDetailAwemeListModel) this.mData).LJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isDataEmpty() {
        T t = this.mData;
        return (t == 0 || !Intrinsics.LJFF(((AIPortraitDetailAwemeListModel) t).hasMore, Boolean.TRUE)) && C086I.LIZIZ(getItems());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        AIPortraitDetailAwemeListModel aIPortraitDetailAwemeListModel = (AIPortraitDetailAwemeListModel) this.mData;
        if (aIPortraitDetailAwemeListModel != null) {
            return Intrinsics.LJFF(aIPortraitDetailAwemeListModel.hasMore, Boolean.TRUE);
        }
        return false;
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr.length >= 7) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean deleteItem(Aweme aweme) {
        ArrayList<Aweme> arrayList;
        Aweme aweme2 = aweme;
        if (aweme2 == null || (arrayList = ((AIPortraitDetailAwemeListModel) this.mData).awemeList) == null) {
            return false;
        }
        Iterator<Aweme> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().getAid(), aweme2.getAid())) {
                if (!C729980SkG.LIZIZ(((AIPortraitDetailAwemeListModel) this.mData).awemeList, aweme2, this.mNotifyListeners)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailAwemeListModel] */
    @Override // X.AbstractC666100QAu
    public final void handleData(Object obj) {
        ArrayList<Aweme> arrayListLJ;
        boolean z;
        ArrayList<Aweme> arrayList;
        Iterator<Aweme> it2;
        ArrayList<Aweme> arrayList2;
        Aweme awemeLLILLL;
        String aid;
        ?? r4 = (AIPortraitDetailAwemeListModel) obj;
        if (r4 != 0) {
            arrayListLJ = r4.LJ();
        } else {
            arrayListLJ = null;
        }
        if (r4 != 0 && arrayListLJ != null && !arrayListLJ.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        this.mIsNewDataEmpty = z;
        if (!z && arrayListLJ != null) {
            int size = arrayListLJ.size();
            for (int i = 0; i < size; i++) {
                Aweme aweme = (Aweme) ListProtector.get(arrayListLJ, i);
                IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
                if (iAwemeService != null) {
                    awemeLLILLL = iAwemeService.LLILLL(aweme);
                } else {
                    awemeLLILLL = null;
                }
                IRequestIdService iRequestIdService = (IRequestIdService) PluggableExtentionKt.pluggableSpi$default(IRequestIdService.class, false, false, false, 14, null);
                if (iRequestIdService != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    if (awemeLLILLL != null) {
                        aid = awemeLLILLL.getAid();
                    } else {
                        aid = null;
                    }
                    sbLIZ.append(aid);
                    sbLIZ.append("ai_portrait_detail130");
                    iRequestIdService.LIZIZ(i, C2188811AlT.LIZIZ(sbLIZ), r4.getRequestId());
                }
                if (awemeLLILLL != null) {
                    ListProtector.set(arrayListLJ, i, awemeLLILLL);
                }
            }
            ArrayList<Aweme> arrayList3 = r4.awemeList;
            if ((arrayList3 == null || !arrayList3.isEmpty()) && (arrayList = r4.awemeList) != null && (it2 = arrayList.iterator()) != null) {
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
                    ArrayList<Aweme> arrayList4 = r4.awemeList;
                    if (arrayList4 != null && (arrayList2 = ((AIPortraitDetailAwemeListModel) this.mData).awemeList) != null) {
                        arrayList2.addAll(arrayList4);
                    }
                    AIPortraitDetailAwemeListModel aIPortraitDetailAwemeListModel = (AIPortraitDetailAwemeListModel) this.mData;
                    aIPortraitDetailAwemeListModel.cursor = r4.cursor;
                    aIPortraitDetailAwemeListModel.hasMore = r4.hasMore;
                    return;
                }
                return;
            }
            this.mData = r4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        int size;
        Long l;
        AIPortraitDetailAwemeListModel aIPortraitDetailAwemeListModel;
        Long l2;
        ArrayList<Aweme> arrayList = ((AIPortraitDetailAwemeListModel) this.mData).awemeList;
        if (arrayList != null) {
            size = arrayList.size();
        } else {
            size = 0;
        }
        long jLongValue = 0;
        if (size > 0 && ((aIPortraitDetailAwemeListModel = (AIPortraitDetailAwemeListModel) this.mData) == null || (l2 = aIPortraitDetailAwemeListModel.cursor) == null || l2.longValue() == 0)) {
            return;
        }
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        if (!isDataEmpty() && (l = ((AIPortraitDetailAwemeListModel) this.mData).cursor) != null) {
            jLongValue = l.longValue();
        }
        LJIIJ(jLongValue, str, str2, str3);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        this.LL.clear();
        LJIIJ(0L, (String) objArr[1], (String) objArr[2], (String) objArr[3]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailAwemeListModel] */
    @Override // X.AbstractC1255880imo
    public final void setItems(List<Aweme> list) {
        if (this.mData == 0) {
            this.mData = new AIPortraitDetailAwemeListModel();
        }
        if (list != null) {
            ArrayList<Aweme> arrayList = new ArrayList<>();
            arrayList.addAll(list);
            ((AIPortraitDetailAwemeListModel) this.mData).awemeList = arrayList;
        }
    }

    public final void LJIIJ(long j, String str, String str2, String str3) {
        boolean z;
        String str4 = str2;
        String str5 = str3;
        String str6 = str;
        if (str6.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str6 = null;
        }
        if (str6 == null) {
            str6 = "";
        }
        if (str4.length() <= 0) {
            str4 = "";
        }
        if (str5.length() <= 0) {
            str5 = "";
        }
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLILLJJLI.getValue(), null, null, new C0OCP(str6, str4, str5, j, this, null), 3);
    }
}
