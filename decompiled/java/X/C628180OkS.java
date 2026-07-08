package X;

import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.template.datamodel.TemplateDetailListModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OkS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C628180OkS extends AbstractC1255880imo<Aweme, TemplateDetailListModel> {
    public boolean LLILLL;
    public TemplateDetailListModel LLILZ;
    public final HashSet<String> LL = new HashSet<>();
    public final ArrayList<Aweme> LLILLJJLI = new ArrayList<>();
    public String LLILZIL = "";
    public int LLILZLL = -1;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(467));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        T t = this.mData;
        if (t == 0 || ((TemplateDetailListModel) t).LJ().isEmpty()) {
            return null;
        }
        return ((TemplateDetailListModel) this.mData).LJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isDataEmpty() {
        T t = this.mData;
        return (t == 0 || ((TemplateDetailListModel) t).hasMore == 0) && C086I.LIZIZ(getItems());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        return t != 0 && ((TemplateDetailListModel) t).hasMore == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJIIJJI() {
        ArrayList<Aweme> arrayList;
        if (!C0C0F.LIZ() || !this.LLILLL || (arrayList = ((TemplateDetailListModel) this.mData).awemeList) == null || arrayList.isEmpty()) {
            return false;
        }
        for (Aweme aweme : arrayList) {
            if (aweme.getAnchor() == null || aweme.getAnchors().isEmpty()) {
                return true;
            }
        }
        return false;
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
        boolean zLIZIZ = C729980SkG.LIZIZ(getItems(), aweme2, this.mNotifyListeners);
        ArrayList<Aweme> arrayList = ((TemplateDetailListModel) this.mData).awemeList;
        if (arrayList != null) {
            C19719612Di.LJJIIJ(arrayList, new C5183020f(aweme2, 204), true);
        }
        ArrayList<Aweme> arrayList2 = ((TemplateDetailListModel) this.mData).topAwemeList;
        if (arrayList2 != null) {
            C19719612Di.LJJIIJ(arrayList2, new C5183020f(aweme2, 205), true);
        }
        C19719612Di.LJJIIJ(this.LLILLJJLI, new C5183020f(aweme2, 206), true);
        return zLIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, com.ss.android.ugc.aweme.template.datamodel.TemplateDetailListModel] */
    @Override // X.AbstractC666100QAu
    public final void handleData(Object obj) {
        ArrayList<Aweme> arrayListLJ;
        boolean z;
        ArrayList<Aweme> arrayList;
        ArrayList<Aweme> arrayList2;
        ArrayList<Aweme> arrayList3;
        Iterator<Aweme> it2;
        String aid;
        ?? r10 = (TemplateDetailListModel) obj;
        if (r10 != 0) {
            arrayListLJ = r10.LJ();
        } else {
            arrayListLJ = null;
        }
        this.LLILZ = r10;
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
                sbLIZ.append("24051");
                iRequestIdService.LIZIZ(i, C2188811AlT.LIZIZ(sbLIZ), r10.getRequestId());
                if (awemeLLILLL != null) {
                    ListProtector.set(arrayListLJ, i, awemeLLILLL);
                }
            }
            if (LJIIJJI() && !r10.isLazyLoading && (((arrayList2 = r10.awemeList) == null || !arrayList2.isEmpty()) && (arrayList3 = r10.awemeList) != null && (it2 = arrayList3.iterator()) != null)) {
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
                    if (arrayList4 != null && (arrayList = ((TemplateDetailListModel) this.mData).awemeList) != null) {
                        arrayList.addAll(arrayList4);
                    }
                    TemplateDetailListModel templateDetailListModel = (TemplateDetailListModel) this.mData;
                    templateDetailListModel.cursor = r10.cursor;
                    templateDetailListModel.hasMore = r10.hasMore;
                    templateDetailListModel.pageExtra = r10.pageExtra;
                    return;
                }
                return;
            }
            this.LLILLJJLI.clear();
            ArrayList<Aweme> arrayList5 = r10.topAwemeList;
            if (arrayList5 != null) {
                this.LLILLJJLI.addAll(arrayList5);
            }
            if (LJIIJJI()) {
                if (!this.LLILLL) {
                    return;
                }
                TemplateDetailListModel templateDetailListModel2 = (TemplateDetailListModel) this.mData;
                templateDetailListModel2.awemeList = LJIIL(templateDetailListModel2.awemeList, r10.awemeList);
                TemplateDetailListModel templateDetailListModel3 = (TemplateDetailListModel) this.mData;
                templateDetailListModel3.topAwemeList = LJIIL(templateDetailListModel3.topAwemeList, r10.topAwemeList);
                return;
            }
            this.mData = r10;
            if (!r10.isLazyLoading) {
                return;
            }
            this.LLILLL = true;
        }
    }

    @Override // X.AbstractC666100QAu, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        TemplateDetailListModel templateDetailListModel;
        super.handleMsg(message);
        if (message != null && HandlerHook.getMessageObj(message.obj) != null && (HandlerHook.getMessageObj(message.obj) instanceof TemplateDetailListModel)) {
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if ((messageObj instanceof TemplateDetailListModel) && (templateDetailListModel = (TemplateDetailListModel) messageObj) != null && !templateDetailListModel.isLazyLoading) {
                this.LLILLL = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        long j;
        String str;
        String str2 = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((TemplateDetailListModel) this.mData).cursor;
        }
        int iIntValue = ((Integer) objArr[3]).intValue();
        if (isDataEmpty()) {
            str = null;
        } else {
            str = ((TemplateDetailListModel) this.mData).pageExtra;
        }
        LJIIJ(iIntValue, j, 0, str2, str);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        this.LL.clear();
        this.LLILLL = false;
        if (C0C0F.LIZ()) {
            LJIIJ(((Integer) objArr[3]).intValue(), 0L, 1, (String) objArr[1], null);
        }
        LJIIJ(((Integer) objArr[3]).intValue(), 0L, 0, (String) objArr[1], null);
        this.LLILZIL = (String) objArr[1];
        this.LLILZLL = ((Integer) objArr[3]).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, com.ss.android.ugc.aweme.template.datamodel.TemplateDetailListModel] */
    @Override // X.AbstractC1255880imo
    public final void setItems(List<Aweme> list) {
        if (this.mData == 0) {
            this.mData = new TemplateDetailListModel();
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
            ((TemplateDetailListModel) this.mData).awemeList = C09HN.LIZ(arrayList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        r6.add(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends com.ss.android.ugc.aweme.feed.model.Aweme> java.util.ArrayList<T> LJIIL(java.util.List<T> r7, java.util.List<? extends T> r8) {
        /*
            java.util.ArrayList r6 = new java.util.ArrayList
            if (r7 != 0) goto L6
            X.13BV r7 = X.C13BV.INSTANCE
        L6:
            r6.<init>(r7)
            if (r8 == 0) goto L47
            java.util.Iterator r5 = r8.iterator()
        Lf:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r4 = r5.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4
            java.util.Iterator r3 = r6.iterator()
            r2 = 0
        L20:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r1 = r0.getAid()
            java.lang.String r0 = r4.getAid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L40
            if (r2 < 0) goto L43
            com.bytedance.mt.protector.impl.collections.ListProtector.set(r6, r2, r4)
            goto Lf
        L40:
            int r2 = r2 + 1
            goto L20
        L43:
            r6.add(r4)
            goto Lf
        L47:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C628180OkS.LJIIL(java.util.List, java.util.List):java.util.ArrayList");
    }

    public final void LJIIJ(int i, long j, int i2, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLIZ.getValue(), null, null, new C628050OkF(str, j, i, str2, i2, new C013C(), jCurrentTimeMillis, this, null), 3);
    }
}
