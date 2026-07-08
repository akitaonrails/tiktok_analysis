package X;

import X.InterfaceC653500PkC;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0PkB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC653490PkB<T extends InterfaceC653500PkC<T>> extends AbstractC1588960rS2<Aweme, T> {
    public abstract C11NZ<T> LJIIJJI();

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        List<Aweme> listLIZLLL;
        T t = this.mData;
        return (t == null || (listLIZLLL = t.LIZLLL()) == null) ? new ArrayList() : listLIZLLL;
    }

    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        return t != null && t.LIZIZ() == 1;
    }

    public final void LJIIJ() {
        AbstractC19484711Kz.LJIJJ(LJIIJJI()).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<InterfaceC653500PkC<Object>>(this) { // from class: X.0PkA
            public final /* synthetic */ AbstractC653490PkB<InterfaceC653500PkC<Object>> LL;

            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            {
                this.LL = this;
            }

            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                AbstractC653490PkB<InterfaceC653500PkC<Object>> abstractC653490PkB = this.LL;
                abstractC653490PkB.mIsLoading = false;
                List<InterfaceC1526205yG> list = abstractC653490PkB.mNotifyListeners;
                if (list != null) {
                    Iterator<InterfaceC1526205yG> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().onFailed((Exception) th);
                    }
                }
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(InterfaceC653500PkC<Object> interfaceC653500PkC) {
                AbstractC653490PkB<InterfaceC653500PkC<Object>> abstractC653490PkB = this.LL;
                abstractC653490PkB.mIsLoading = false;
                abstractC653490PkB.handleData(interfaceC653500PkC);
                List<InterfaceC1526205yG> list = this.LL.mNotifyListeners;
                if (list != null) {
                    Iterator<InterfaceC1526205yG> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().onSuccess();
                    }
                }
            }
        });
    }

    @Override // X.AbstractC666100QAu
    /* JADX INFO: renamed from: LJIIL */
    public void handleData(T t) {
        List<Aweme> listLIZLLL;
        List<Aweme> arrayList;
        T t2;
        String str;
        if (t != null) {
            listLIZLLL = t.LIZLLL();
        } else {
            listLIZLLL = null;
        }
        T t3 = this.mData;
        if (t3 == null || (arrayList = t3.LIZLLL()) == null) {
            arrayList = new ArrayList<>();
        }
        if (listLIZLLL != null && !listLIZLLL.isEmpty()) {
            if (this.mListQueryType != 1) {
                Iterator<Aweme> it2 = listLIZLLL.iterator();
                while (it2.hasNext()) {
                    if (arrayList.indexOf(it2.next()) >= 0) {
                        it2.remove();
                    }
                }
            }
            int i = this.mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    List<Aweme> listLIZLLL2 = this.mData.LIZLLL();
                    if (listLIZLLL2 != null) {
                        listLIZLLL2.addAll(listLIZLLL);
                    }
                    this.mData.LIZ(t);
                }
            } else {
                T t4 = this.mData;
                if (t4 != null) {
                    List<Aweme> listLIZLLL3 = t4.LIZLLL();
                    if (listLIZLLL3 != null) {
                        listLIZLLL3.clear();
                        listLIZLLL3.addAll(listLIZLLL);
                    }
                    this.mData.LIZ(t);
                } else {
                    this.mData = t;
                }
            }
            for (Aweme aweme : listLIZLLL) {
                C650950Pg5.Companion.getClass();
                C0PRW c0prwLIZIZ = C646000PVm.LIZIZ();
                if (c0prwLIZIZ == null || (str = c0prwLIZIZ.searchId) == null) {
                    str = "";
                }
                aweme.setRequestId(str);
            }
            return;
        }
        if (this.mListQueryType == 1) {
            this.mData = t;
            if (t != null) {
                t.LIZJ();
            }
        }
        if (this.mListQueryType != 2 && (t2 = this.mData) != null) {
            t2.LIZJ();
        }
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        LJIIJ();
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        LJIIJ();
    }
}
