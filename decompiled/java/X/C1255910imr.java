package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0imr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255910imr extends C1401320mZO implements InterfaceC1526205yG {
    public final C1401320mZO LLJJLIIIJLLLLLLLZ;

    @Override // X.C1401320mZO, X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        List<Aweme> list;
        MusicAwemeList data = this.LLJJLIIIJLLLLLLLZ.getData();
        return (data == null || (list = data.showAidItems) == null || !(list.isEmpty() ^ true)) ? this.LLJJLIIIJLLLLLLLZ.getItems() : this.LLJJLIIIJLLLLLLLZ.getData().showAidItems;
    }

    @Override // X.C1401320mZO, X.AbstractC1255880imo
    public final boolean isHasMore() {
        return this.LLJJLIIIJLLLLLLLZ.isHasMore();
    }

    @Override // X.InterfaceC1526205yG
    public final void onSuccess() {
        List<InterfaceC1526205yG> list = this.mNotifyListeners;
        if (list != null) {
            Iterator<InterfaceC1526205yG> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onSuccess();
            }
        }
    }

    public C1255910imr(C1401320mZO c1401320mZO) {
        this.LLJJLIIIJLLLLLLLZ = c1401320mZO;
        c1401320mZO.addNotifyListener(this);
    }

    @Override // X.C1401320mZO, X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return this.LLJJLIIIJLLLLLLLZ.checkParams(objArr);
    }

    @Override // X.AbstractC666100QAu
    public final void clearNotifyListener(InterfaceC1526205yG interfaceC1526205yG) {
        super.clearNotifyListener(interfaceC1526205yG);
        this.LLJJLIIIJLLLLLLLZ.clearNotifyListener(this);
    }

    @Override // X.C1401320mZO, X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        this.LLJJLIIIJLLLLLLLZ.loadMoreList(objArr);
    }

    @Override // X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        List<InterfaceC1526205yG> list = this.mNotifyListeners;
        if (list != null) {
            Iterator<InterfaceC1526205yG> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onFailed(exc);
            }
        }
    }

    @Override // X.C1401320mZO, X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        this.LLJJLIIIJLLLLLLLZ.refreshList(objArr);
    }
}
