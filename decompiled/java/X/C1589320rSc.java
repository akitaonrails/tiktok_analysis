package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0rSc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589320rSc extends C1601380rm4 {
    public final C0SR8 LLJJJJJIL;
    public int LLJJJJLIIL;

    @Override // X.C1601380rm4
    public final void LJJIJL() {
    }

    @Override // X.C1601380rm4, X.AbstractC1255880imo
    public final boolean isHasMore() {
        return true;
    }

    @Override // X.C1601380rm4
    public final void LJJIZ() {
        int size;
        if (((Boolean) C300500BqC.LJ.getValue()).booleanValue()) {
            int i = this.mListQueryType;
            if (i == 4 || i == 16) {
                int iLIZIZ = C300500BqC.LIZIZ();
                int iLIZ = C300500BqC.LIZ();
                if (iLIZIZ <= 0 || iLIZ <= 0 || (size = this.LLJJJJJIL.getSize()) <= iLIZIZ) {
                    return;
                }
                this.LLJJJJJIL.setData(this.LLJJJJJIL.getList().subList(Math.min(iLIZ, size), size));
            }
        }
    }

    @Override // X.C1601380rm4, X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        return this.LLJJJJJIL.getList();
    }

    @Override // X.C1601380rm4, X.AbstractC1255880imo
    public final int getListCount() {
        return this.LLJJJJJIL.getSize();
    }

    @Override // X.AbstractC1255880imo
    public final boolean isDataEmpty() {
        return this.LLJJJJJIL.isEmpty();
    }

    @Override // X.AbstractC666100QAu
    public final Object getData() {
        FeedItemList feedItemList = (FeedItemList) super.getData();
        if (feedItemList == null) {
            return null;
        }
        List<Aweme> items = feedItemList.getItems();
        feedItemList.setItems(null);
        FeedItemList feedItemListM202clone = feedItemList.m202clone();
        feedItemList.setItems(items);
        feedItemListM202clone.setItems(getItems());
        feedItemListM202clone.cardInsertResults = feedItemList.cardInsertResults;
        feedItemListM202clone.lastRequestId = feedItemList.lastRequestId;
        feedItemListM202clone.isFromCacheFiled = feedItemList.isFromCacheFiled;
        return feedItemListM202clone;
    }

    public C1589320rSc(C0SR8 c0sr8) {
        this.LLJJJJJIL = c0sr8;
    }

    @Override // X.C1601380rm4
    public final void LJIIJ(List<? extends Aweme> list) {
        if (list == null) {
            return;
        }
        this.LLJJJJLIIL = this.LLJJJJJIL.getSize();
        this.LLJJJJJIL.LIZLLL(C13LP.LJJJJLI(list));
    }

    @Override // X.C1601380rm4
    public final int LJIIJJI(Aweme aweme) {
        if (aweme == null) {
            return -1;
        }
        return this.LLJJJJJIL.au(aweme);
    }

    @Override // X.C1601380rm4
    public final void LJIILJJIL(List<? extends Aweme> list) {
        Iterator it2 = ((ArrayList) C13LP.LJJJJLI(list)).iterator();
        while (it2.hasNext()) {
            this.LLJJJJJIL.LIZ((Aweme) it2.next());
        }
        this.LLJJJJLIIL -= ((ArrayList) list).size();
    }

    @Override // X.C1601380rm4
    /* JADX INFO: renamed from: LJJI */
    public final void handleData(FeedItemList feedItemList) {
        FeedItemList feedItemList2 = (FeedItemList) super.getData();
        if (feedItemList2 != null && feedItemList != null) {
            feedItemList2.isFromCacheFiled = feedItemList.isFromCacheFiled;
        }
        super.handleData(feedItemList);
    }

    @Override // X.C1601380rm4
    public final void LJJIFFI(C0PN1<Aweme> c0pn1) {
        List listLJJJJLI;
        InterfaceC1255940imu interfaceC1255940imu;
        int i = c0pn1.LIZIZ;
        if (i >= 0 && i <= getListCount()) {
            C1030680cva.LJIJI = true;
            C584470Mw9.LJIIZILJ.put("has_splash", "1");
            C0PN0 c0pn0 = new C0PN0(c0pn1, getItems());
            List<InterfaceC1526205yG> list = this.mNotifyListeners;
            if (list != null && list.size() != 0) {
                for (InterfaceC1526205yG interfaceC1526205yG : this.mNotifyListeners) {
                    if ((interfaceC1526205yG instanceof InterfaceC1255940imu) && (interfaceC1255940imu = (InterfaceC1255940imu) interfaceC1526205yG) != null && !interfaceC1255940imu.B1(c0pn0)) {
                        interfaceC1255940imu.w(c0pn0.LIZIZ, c0pn0.LJFF);
                    }
                }
            }
            List<Aweme> items = getItems();
            if (items != null) {
                listLJJJJLI = C13LP.LJJJJLI(items);
            } else {
                listLJJJJLI = null;
            }
            if (C295980Biu.LIZ()) {
                C1347505Pd c1347505Pd = C1347505Pd.LIZ;
                if (listLJJJJLI != null) {
                    ArrayList arrayList = new ArrayList(listLJJJJLI);
                    C1347505Pd.LIZ.getClass();
                    C23250099c.LIZLLL(C1347505Pd.LIZIZ(), null, null, new C1347405Pc(arrayList, null), 3);
                }
            }
        }
    }

    @Override // X.C1601380rm4, X.AbstractC1255880imo
    @InterfaceC1294060jmO
    public final int deleteItems(List<Aweme> list) {
        if (list == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : C13LP.LJJJJLI(list)) {
            if (this.LLJJJJJIL.au(aweme) >= 0) {
                arrayList.add(aweme);
            }
        }
        C729980SkG.LJIILIIL(this.mNotifyListeners, arrayList);
        return arrayList.size();
    }

    @Override // X.C1601380rm4, X.AbstractC666100QAu
    public final /* bridge */ /* synthetic */ void handleData(Object obj) {
        handleData((FeedItemList) obj);
    }

    @Override // X.AbstractC1255880imo
    public final boolean insertItem(Aweme aweme) {
        int size = this.LLJJJJJIL.getSize();
        if (aweme == null) {
            return false;
        }
        return insertItemList(Collections.singletonList(aweme), size);
    }

    @Override // X.C1601380rm4, X.AbstractC1255880imo
    public final void setItems(List<Aweme> list) {
        if (list == null) {
            return;
        }
        this.LLJJJJJIL.setData(C13LP.LJJJJLI(list));
    }

    @Override // X.C1601380rm4
    public final void LJJIJIIJIL(List<? extends Aweme> list, boolean z) {
        if (list == null) {
            return;
        }
        if (z) {
            this.LLJJJJJIL.setData(C13LP.LJJJJLI(list));
        } else if (this.LLJJJJJIL.getSize() > 0) {
            this.LLJJJJJIL.LIZLLL(C13LP.LJJJJLI(list));
        } else {
            this.LLJJJJJIL.setData(C13LP.LJJJJLI(list));
        }
    }

    @Override // X.AbstractC1255880imo
    public final boolean insertItem(Aweme aweme, int i) {
        if (aweme == null) {
            return false;
        }
        return insertItemList(Collections.singletonList(aweme), i);
    }

    @Override // X.AbstractC1255880imo
    @InterfaceC1294060jmO
    public final boolean insertItemList(List<Aweme> list, int i) {
        InterfaceC1255940imu interfaceC1255940imu;
        if (list == null || i < 0 || i > this.LLJJJJJIL.getSize()) {
            return false;
        }
        List<InterfaceC1526205yG> list2 = this.mNotifyListeners;
        if (list2 != null && list2.size() != 0) {
            for (InterfaceC1526205yG interfaceC1526205yG : this.mNotifyListeners) {
                if ((interfaceC1526205yG instanceof InterfaceC1255940imu) && (interfaceC1255940imu = (InterfaceC1255940imu) interfaceC1526205yG) != null) {
                    interfaceC1255940imu.w(i, list);
                }
            }
            return true;
        }
        return true;
    }

    @Override // X.C1601380rm4
    public final List LJJIJIIJI(int i, int i2, List list) {
        return this.LLJJJJJIL.cu(i, i2, C13LP.LJJJJLI(list));
    }
}
